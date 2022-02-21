// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitOperationCredentialsResponse} extends {@link TeaModel}
 *
 * <p>SubmitOperationCredentialsResponse</p>
 */
public class SubmitOperationCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitOperationCredentialsResponseBody body;

    private SubmitOperationCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitOperationCredentialsResponse create() {
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
    public SubmitOperationCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitOperationCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitOperationCredentialsResponseBody body);

        @Override
        SubmitOperationCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitOperationCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitOperationCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitOperationCredentialsResponse response) {
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
        public Builder body(SubmitOperationCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitOperationCredentialsResponse build() {
            return new SubmitOperationCredentialsResponse(this);
        } 

    } 

}
