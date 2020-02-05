package uno_project;

/**
 *
 * @author Rishabh
 */
class CardHand {
    private final int handSize = 108;
	public Card[] cards = new Card[handSize];

        public void generateHand()
        {
                int countCards = 0;
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }
        }


}
