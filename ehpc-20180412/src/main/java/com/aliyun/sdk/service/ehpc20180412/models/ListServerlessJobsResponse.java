// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerlessJobsResponse} extends {@link TeaModel}
 *
 * <p>ListServerlessJobsResponse</p>
 */
public class ListServerlessJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServerlessJobsResponseBody body;

    private ListServerlessJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServerlessJobsResponse create() {
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
    public ListServerlessJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServerlessJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServerlessJobsResponseBody body);

        @Override
        ListServerlessJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServerlessJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServerlessJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServerlessJobsResponse response) {
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
        public Builder body(ListServerlessJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServerlessJobsResponse build() {
            return new ListServerlessJobsResponse(this);
        } 

    } 

}
