// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValuateApplicationResponse} extends {@link TeaModel}
 *
 * <p>ValuateApplicationResponse</p>
 */
public class ValuateApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValuateApplicationResponseBody body;

    private ValuateApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValuateApplicationResponse create() {
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
    public ValuateApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValuateApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValuateApplicationResponseBody body);

        @Override
        ValuateApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValuateApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValuateApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValuateApplicationResponse response) {
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
        public Builder body(ValuateApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValuateApplicationResponse build() {
            return new ValuateApplicationResponse(this);
        } 

    } 

}
