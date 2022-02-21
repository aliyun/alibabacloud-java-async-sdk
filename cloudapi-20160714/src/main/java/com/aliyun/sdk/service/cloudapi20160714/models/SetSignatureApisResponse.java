// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSignatureApisResponse} extends {@link TeaModel}
 *
 * <p>SetSignatureApisResponse</p>
 */
public class SetSignatureApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetSignatureApisResponseBody body;

    private SetSignatureApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetSignatureApisResponse create() {
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
    public SetSignatureApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetSignatureApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetSignatureApisResponseBody body);

        @Override
        SetSignatureApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetSignatureApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetSignatureApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetSignatureApisResponse response) {
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
        public Builder body(SetSignatureApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetSignatureApisResponse build() {
            return new SetSignatureApisResponse(this);
        } 

    } 

}
