// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrainingJobsResponse} extends {@link TeaModel}
 *
 * <p>ListTrainingJobsResponse</p>
 */
public class ListTrainingJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTrainingJobsResponseBody body;

    private ListTrainingJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTrainingJobsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ListTrainingJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrainingJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTrainingJobsResponseBody body);

        @Override
        ListTrainingJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrainingJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTrainingJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrainingJobsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ListTrainingJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrainingJobsResponse build() {
            return new ListTrainingJobsResponse(this);
        } 

    } 

}
