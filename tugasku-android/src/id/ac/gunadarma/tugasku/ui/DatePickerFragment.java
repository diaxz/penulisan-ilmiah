package id.ac.gunadarma.tugasku.ui;

import id.ac.gunadarma.tugasku.TaskFormFragmentActivity;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;


public class DatePickerFragment extends DialogFragment {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		final Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		return new DatePickerDialog(getActivity(), (TaskFormFragmentActivity) getActivity(), year, month, day);
	}
}
