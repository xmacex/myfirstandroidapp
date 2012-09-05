public class DisplayMessageActivity extend Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
	}
	// Get message from intent
	Intent intent = getIntent();
	String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

	// Create the text view
	TextView textView = new TextView(this);
	textView.setTextSize(40);
	textView.setText(message);

	// Set the text view as the activity layout
	setContentView(textView);
}
