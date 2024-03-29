package rx.test;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import rx.Observable;

/**
 * Created by agoyal3 on 12/17/15.
 */
public interface GovService {
    @GET("/txt2lrn/sat/index_1.json")
    Call<MyTest> getOneTest();

    @GET("/txt2lrn/sat/index.json")
    Call<List<MyTest>> getTestList();

    @GET("/txt2lrn/sat/index_1.json")
    Observable<MyTest> getOneTestRx();

    @GET("/txt2lrn/sat/index.json")
    Observable<List<MyTest>> getTestListRx();

    @GET("/txt2lrn/satvocab/satvocab_000.json")
    Observable<List<Question>> getQuestionRx();

    //@GET("/gists/{id}")
    //Observable<GistDetail> gist(@Path("id") String id);
}