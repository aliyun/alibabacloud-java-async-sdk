// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIdpMetadataResponse} extends {@link TeaModel}
 *
 * <p>SetIdpMetadataResponse</p>
 */
public class SetIdpMetadataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetIdpMetadataResponseBody body;

    private SetIdpMetadataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetIdpMetadataResponse create() {
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
    public SetIdpMetadataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetIdpMetadataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetIdpMetadataResponseBody body);

        @Override
        SetIdpMetadataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetIdpMetadataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetIdpMetadataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetIdpMetadataResponse response) {
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
        public Builder body(SetIdpMetadataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetIdpMetadataResponse build() {
            return new SetIdpMetadataResponse(this);
        } 

    } 

}
