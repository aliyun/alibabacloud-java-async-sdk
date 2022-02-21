// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSignatureResponse} extends {@link TeaModel}
 *
 * <p>CreateSignatureResponse</p>
 */
public class CreateSignatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSignatureResponseBody body;

    private CreateSignatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSignatureResponse create() {
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
    public CreateSignatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSignatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSignatureResponseBody body);

        @Override
        CreateSignatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSignatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSignatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSignatureResponse response) {
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
        public Builder body(CreateSignatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSignatureResponse build() {
            return new CreateSignatureResponse(this);
        } 

    } 

}
