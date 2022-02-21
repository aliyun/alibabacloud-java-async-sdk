// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateReadWritePolicyResponse} extends {@link TeaModel}
 *
 * <p>UpdateReadWritePolicyResponse</p>
 */
public class UpdateReadWritePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateReadWritePolicyResponseBody body;

    private UpdateReadWritePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateReadWritePolicyResponse create() {
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
    public UpdateReadWritePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateReadWritePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateReadWritePolicyResponseBody body);

        @Override
        UpdateReadWritePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateReadWritePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateReadWritePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateReadWritePolicyResponse response) {
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
        public Builder body(UpdateReadWritePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateReadWritePolicyResponse build() {
            return new UpdateReadWritePolicyResponse(this);
        } 

    } 

}
