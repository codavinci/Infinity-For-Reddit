package ml.docilealligator.infinityforreddit;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class SortTypeBottomSheetFragment extends BottomSheetDialogFragment {

    interface SortTypeSelectionCallback {
        void sortTypeSelected(String sortType);
    }

    @BindView(R.id.best_type_text_view_sort_type_bottom_sheet_fragment) TextView bestTypeTextView;
    @BindView(R.id.hot_type_text_view_sort_type_bottom_sheet_fragment) TextView hotTypeTextView;
    @BindView(R.id.new_type_text_view_sort_type_bottom_sheet_fragment) TextView newTypeTextView;
    @BindView(R.id.random_type_text_view_sort_type_bottom_sheet_fragment) TextView randomTypeTextView;
    @BindView(R.id.rising_type_text_view_sort_type_bottom_sheet_fragment) TextView risingTypeTextView;
    @BindView(R.id.top_type_text_view_sort_type_bottom_sheet_fragment) TextView topTypeTextView;
    @BindView(R.id.controversial_type_text_view_sort_type_bottom_sheet_fragment) TextView controversialTypeTextView;

    public SortTypeBottomSheetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sort_type_bottom_sheet, container, false);
        ButterKnife.bind(this, rootView);

        Activity activity = getActivity();

        bestTypeTextView.setOnClickListener(view -> {
            ((SortTypeSelectionCallback) activity).sortTypeSelected(PostDataSource.SORT_TYPE_BEST);
            dismiss();
        });

        hotTypeTextView.setOnClickListener(view -> {
            ((SortTypeSelectionCallback) activity).sortTypeSelected(PostDataSource.SORT_TYPE_HOT);
            dismiss();
        });

        newTypeTextView.setOnClickListener(view -> {
            ((SortTypeSelectionCallback) activity).sortTypeSelected(PostDataSource.SORT_TYPE_NEW);
            dismiss();
        });

        randomTypeTextView.setOnClickListener(view -> {
            ((SortTypeSelectionCallback) activity).sortTypeSelected(PostDataSource.SORT_TYPE_RANDOM);
            dismiss();
        });

        risingTypeTextView.setOnClickListener(view -> {
            ((SortTypeSelectionCallback) activity).sortTypeSelected(PostDataSource.SORT_TYPE_RISING);
            dismiss();
        });

        topTypeTextView.setOnClickListener(view -> {
            ((SortTypeSelectionCallback) activity).sortTypeSelected(PostDataSource.SORT_TYPE_TOP);
            dismiss();
        });

        controversialTypeTextView.setOnClickListener(view -> {
            ((SortTypeSelectionCallback) activity).sortTypeSelected(PostDataSource.SORT_TYPE_BEST);
            dismiss();
        });

        return rootView;
    }

}