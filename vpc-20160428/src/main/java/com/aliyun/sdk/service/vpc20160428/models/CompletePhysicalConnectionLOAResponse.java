// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompletePhysicalConnectionLOAResponse} extends {@link TeaModel}
 *
 * <p>CompletePhysicalConnectionLOAResponse</p>
 */
public class CompletePhysicalConnectionLOAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CompletePhysicalConnectionLOAResponseBody body;

    private CompletePhysicalConnectionLOAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CompletePhysicalConnectionLOAResponse create() {
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
    public CompletePhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CompletePhysicalConnectionLOAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CompletePhysicalConnectionLOAResponseBody body);

        @Override
        CompletePhysicalConnectionLOAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CompletePhysicalConnectionLOAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CompletePhysicalConnectionLOAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CompletePhysicalConnectionLOAResponse response) {
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
        public Builder body(CompletePhysicalConnectionLOAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CompletePhysicalConnectionLOAResponse build() {
            return new CompletePhysicalConnectionLOAResponse(this);
        } 

    } 

}
