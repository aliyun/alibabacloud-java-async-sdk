// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResendCreateCloudAccountEmailResponse} extends {@link TeaModel}
 *
 * <p>ResendCreateCloudAccountEmailResponse</p>
 */
public class ResendCreateCloudAccountEmailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResendCreateCloudAccountEmailResponseBody body;

    private ResendCreateCloudAccountEmailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResendCreateCloudAccountEmailResponse create() {
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
    public ResendCreateCloudAccountEmailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResendCreateCloudAccountEmailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResendCreateCloudAccountEmailResponseBody body);

        @Override
        ResendCreateCloudAccountEmailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResendCreateCloudAccountEmailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResendCreateCloudAccountEmailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResendCreateCloudAccountEmailResponse response) {
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
        public Builder body(ResendCreateCloudAccountEmailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResendCreateCloudAccountEmailResponse build() {
            return new ResendCreateCloudAccountEmailResponse(this);
        } 

    } 

}
