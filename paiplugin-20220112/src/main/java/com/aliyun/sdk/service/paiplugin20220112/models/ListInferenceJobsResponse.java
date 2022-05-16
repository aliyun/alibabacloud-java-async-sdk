// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInferenceJobsResponse} extends {@link TeaModel}
 *
 * <p>ListInferenceJobsResponse</p>
 */
public class ListInferenceJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInferenceJobsResponseBody body;

    private ListInferenceJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInferenceJobsResponse create() {
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
    public ListInferenceJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInferenceJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInferenceJobsResponseBody body);

        @Override
        ListInferenceJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInferenceJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInferenceJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInferenceJobsResponse response) {
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
        public Builder body(ListInferenceJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInferenceJobsResponse build() {
            return new ListInferenceJobsResponse(this);
        } 

    } 

}
