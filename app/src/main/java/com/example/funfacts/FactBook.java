package com.example.funfacts;

import java.util.Random;

class FactBook {
    // Fields - properties of the objects

    // Our set of facts
    private final String[] facts = {
            "Hippos can put their stomach out.",
            "The platypus is the only mammal that lays eggs.",
            "The first person convicted of speeding was going eight mph.",
            "The world wastes about 1 billion metric tons of food each year.",
            "Women's hair and nails grow faster during pregnancy.",
            "Many feet bones don't harden until you're an adult.",
            "The moon has moonquakes.",
            "Pineapple works as a natural meat tenderizer.",
            "Humans are the only animals that blush.",
            "The wood frog can hold its pee for up to eight months.",
            "You lose up to 30 percent of your taste buds during flight."
    };

    // Methods - Actions objects can take
    String getFact() {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];

    }
}
