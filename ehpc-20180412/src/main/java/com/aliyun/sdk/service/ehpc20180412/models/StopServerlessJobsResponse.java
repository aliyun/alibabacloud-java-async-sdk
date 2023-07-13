// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopServerlessJobsResponse} extends {@link TeaModel}
 *
 * <p>StopServerlessJobsResponse</p>
 */
public class StopServerlessJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopServerlessJobsResponseBody body;

    private StopServerlessJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopServerlessJobsResponse create() {
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
    public StopServerlessJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopServerlessJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopServerlessJobsResponseBody body);

        @Override
        StopServerlessJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopServerlessJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopServerlessJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopServerlessJobsResponse response) {
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
        public Builder body(StopServerlessJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopServerlessJobsResponse build() {
            return new StopServerlessJobsResponse(this);
        } 

    } 

}
