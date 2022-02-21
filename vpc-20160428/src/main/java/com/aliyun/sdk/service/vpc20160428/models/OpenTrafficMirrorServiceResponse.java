// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenTrafficMirrorServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenTrafficMirrorServiceResponse</p>
 */
public class OpenTrafficMirrorServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenTrafficMirrorServiceResponseBody body;

    private OpenTrafficMirrorServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenTrafficMirrorServiceResponse create() {
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
    public OpenTrafficMirrorServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenTrafficMirrorServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenTrafficMirrorServiceResponseBody body);

        @Override
        OpenTrafficMirrorServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenTrafficMirrorServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenTrafficMirrorServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenTrafficMirrorServiceResponse response) {
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
        public Builder body(OpenTrafficMirrorServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenTrafficMirrorServiceResponse build() {
            return new OpenTrafficMirrorServiceResponse(this);
        } 

    } 

}
