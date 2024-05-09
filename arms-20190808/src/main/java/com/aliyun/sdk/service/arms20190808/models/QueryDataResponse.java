// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataResponse} extends {@link TeaModel}
 *
 * <p>QueryDataResponse</p>
 */
public class QueryDataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("results")
    private String results;

    private QueryDataResponse(BuilderImpl builder) {
        super(builder);
        this.results = builder.results;
    }

    public static QueryDataResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return results
     */
    public String getResults() {
        return this.results;
    }

    public interface Builder extends Response.Builder<QueryDataResponse, Builder> {

        Builder results(String results);

        @Override
        QueryDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDataResponse, Builder>
            implements Builder {
        private String results; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDataResponse response) {
            super(response);
            this.results = response.results;
        } 

        /**
         * results.
         */
        @Override
        public Builder results(String results) {
            this.results = results;
            return this;
        }

        @Override
        public QueryDataResponse build() {
            return new QueryDataResponse(this);
        } 

    } 

}
