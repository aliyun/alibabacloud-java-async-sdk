// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitServiceResponse} extends {@link TeaModel}
 *
 * <p>CommitServiceResponse</p>
 */
public class CommitServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CommitServiceResponseBody body;

    private CommitServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CommitServiceResponse create() {
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
    public CommitServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CommitServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CommitServiceResponseBody body);

        @Override
        CommitServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CommitServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CommitServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CommitServiceResponse response) {
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
        public Builder body(CommitServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CommitServiceResponse build() {
            return new CommitServiceResponse(this);
        } 

    } 

}
