// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenNASServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenNASServiceResponse</p>
 */
public class OpenNASServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenNASServiceResponseBody body;

    private OpenNASServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenNASServiceResponse create() {
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
    public OpenNASServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenNASServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenNASServiceResponseBody body);

        @Override
        OpenNASServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenNASServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenNASServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenNASServiceResponse response) {
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
        public Builder body(OpenNASServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenNASServiceResponse build() {
            return new OpenNASServiceResponse(this);
        } 

    } 

}
