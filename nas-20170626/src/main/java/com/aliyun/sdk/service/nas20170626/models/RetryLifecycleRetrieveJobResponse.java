// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryLifecycleRetrieveJobResponse} extends {@link TeaModel}
 *
 * <p>RetryLifecycleRetrieveJobResponse</p>
 */
public class RetryLifecycleRetrieveJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryLifecycleRetrieveJobResponseBody body;

    private RetryLifecycleRetrieveJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryLifecycleRetrieveJobResponse create() {
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
    public RetryLifecycleRetrieveJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryLifecycleRetrieveJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryLifecycleRetrieveJobResponseBody body);

        @Override
        RetryLifecycleRetrieveJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryLifecycleRetrieveJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryLifecycleRetrieveJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryLifecycleRetrieveJobResponse response) {
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
        public Builder body(RetryLifecycleRetrieveJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryLifecycleRetrieveJobResponse build() {
            return new RetryLifecycleRetrieveJobResponse(this);
        } 

    } 

}
