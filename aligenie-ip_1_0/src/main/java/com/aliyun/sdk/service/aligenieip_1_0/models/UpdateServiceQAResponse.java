// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceQAResponse} extends {@link TeaModel}
 *
 * <p>UpdateServiceQAResponse</p>
 */
public class UpdateServiceQAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServiceQAResponseBody body;

    private UpdateServiceQAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServiceQAResponse create() {
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
    public UpdateServiceQAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServiceQAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServiceQAResponseBody body);

        @Override
        UpdateServiceQAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServiceQAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServiceQAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServiceQAResponse response) {
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
        public Builder body(UpdateServiceQAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceQAResponse build() {
            return new UpdateServiceQAResponse(this);
        } 

    } 

}
