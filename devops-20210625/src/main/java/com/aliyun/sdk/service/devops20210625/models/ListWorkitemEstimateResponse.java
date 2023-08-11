// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkitemEstimateResponse} extends {@link TeaModel}
 *
 * <p>ListWorkitemEstimateResponse</p>
 */
public class ListWorkitemEstimateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkitemEstimateResponseBody body;

    private ListWorkitemEstimateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkitemEstimateResponse create() {
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
    public ListWorkitemEstimateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkitemEstimateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkitemEstimateResponseBody body);

        @Override
        ListWorkitemEstimateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkitemEstimateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkitemEstimateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkitemEstimateResponse response) {
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
        public Builder body(ListWorkitemEstimateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkitemEstimateResponse build() {
            return new ListWorkitemEstimateResponse(this);
        } 

    } 

}
