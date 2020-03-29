package model;

public class listNodes {
	private nodo first;
	private int size;
	public listNodes() {
		first = null;
		size=0;
	}



	/**
	 * @return the first
	 */
	public nodo getFirst() {
		return first;
	}



	/**
	 * @param first the first to set
	 */
	public void setFirst(nodo first) {
		this.first = first;
	}



	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}



	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}



	public void deleteNode(String let) {
		nodo act  = new nodo();
		nodo bef = new nodo();
		act = first;
		bef =null;
		if(first != null) {
			while(act != null) {
				if(act.getLetter() ==let) {
					if(act == first) {
						first = first.getNext();

					}
					else {
						bef.setNext(act.getNext()); 
					}
				}
				bef = act;
				act= act.getNext();

			}
			size--;
		}

	}
	public void removeNodeEnd(String let) {
		nodo act  = new nodo();
		nodo bef = new nodo();
		int pos =0;
		act = first;
		bef =null;
		if(first != null) {
			while(pos != size) {
				if(act.getLetter() ==let) {
					if(act == first) {
						first = first.getNext();

					}
					else {
						bef.setNext(act.getNext()); 
					}
				}
				bef = act;
				act= act.getNext();
				pos++;
			}
			size--;
		}
	}
	public void removeNodeFirst(String let) {
		nodo act  = new nodo();
		act = first;
		if(first != null) {
			while(act != null) {
				if(act.getLetter() ==let) {
					if(act == first) {
						first = first.getNext();

					}
				}
				act= act.getNext();
			}
			size--;
		}
	}

	public void removeNodeMid(String let) {
		int pos =0;
		nodo act  = new nodo();
		nodo bef = new nodo();
		act = first;
		bef =null;
		if(first != null) {
			while(pos != (size/2)) {
				if(act.getLetter() ==let) {

					bef.setNext(act.getNext()); 

				}
				bef = act;
				act= act.getNext();
				pos++;
			}
			size--;
		}
	}




	public void addNodeBegining(String let) {
		nodo newNodo = new nodo();
		newNodo.setLetter(let);
		if(first == null) {
			first = newNodo;
		}
		else {
			nodo act = first;
			first = newNodo;
			newNodo.setNext(act);
			
		}
		size++;
	}


	public void addNodeEnd(String let) {
		nodo newNodo = new nodo();
		newNodo.setLetter(let);
		if(first == null) {
			first = newNodo;
		}
		else {
			int pos =0;
			nodo aux = first;
			while(pos != size-1){
				pos++;
				aux = aux.getNext();	
			}
			aux.setNext(newNodo);
		}
		size++;
	}
	
	
	public void insertEnd(String c) {
		int pos = size;
		nodo aux = first;
		nodo newNodo = new nodo();
		newNodo.setLetter(c);
		for (int i = 0; i < (pos-1); i++) {
			aux = aux.getNext();
		}
		aux.setNext(newNodo);
		size++;
	}

	public void addNodeMid(String let) {

		nodo newNodo = new nodo();
		newNodo.setLetter(let);
		if(first == null) {
			first = newNodo;
		}else {
			int pos =0;
			nodo act = first;
			while( pos != (size/2) 	) {
				pos++;
				act = act.getNext();

			}
			nodo siguiente = act.getNext();
			act.setNext(newNodo);
			newNodo.setNext(siguiente);
			size++;
		}

	}
	public void insertMid(String c) {
			int pos = size/2;
			nodo aux = first;
			nodo newNodo = new nodo();
			newNodo.setLetter(c);
			for (int i = 0; i < (pos-1); i++) {
				aux = aux.getNext();
			}
			  nodo siguiente = aux.getNext();
			  aux.setNext(newNodo);
			  newNodo.setNext(siguiente);
			  
	}
	



	public void showNodes() {
		nodo act = new nodo();
		act= first;	
		while(act != null) {
			System.out.println(act.getLetter());
			act = act.getNext();
		}
	}



	public String getMid() {
		nodo act = new nodo();
		act = first;
		int pos =0;
		while( pos != (size/2)) {
			pos++;
			act = act.getNext();

		}
		return act.getLetter();

	}

	public String getEnd() {
		nodo act =first;
		int pos =0;
		if(first != null) {
			while(act.getNext() != null){
				pos++;
				act = act.getNext();


			}
		}
		return act.getLetter();
	}



}
