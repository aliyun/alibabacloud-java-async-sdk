// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SecondApplyPhysicalConnectionLOAResponse} extends {@link TeaModel}
 *
 * <p>SecondApplyPhysicalConnectionLOAResponse</p>
 */
public class SecondApplyPhysicalConnectionLOAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SecondApplyPhysicalConnectionLOAResponseBody body;

    private SecondApplyPhysicalConnectionLOAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SecondApplyPhysicalConnectionLOAResponse create() {
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
    public SecondApplyPhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SecondApplyPhysicalConnectionLOAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SecondApplyPhysicalConnectionLOAResponseBody body);

        @Override
        SecondApplyPhysicalConnectionLOAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SecondApplyPhysicalConnectionLOAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SecondApplyPhysicalConnectionLOAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SecondApplyPhysicalConnectionLOAResponse response) {
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
        public Builder body(SecondApplyPhysicalConnectionLOAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SecondApplyPhysicalConnectionLOAResponse build() {
            return new SecondApplyPhysicalConnectionLOAResponse(this);
        } 

    } 

}
