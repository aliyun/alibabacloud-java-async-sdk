// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitDtsRdsInstanceResponse} extends {@link TeaModel}
 *
 * <p>InitDtsRdsInstanceResponse</p>
 */
public class InitDtsRdsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitDtsRdsInstanceResponseBody body;

    private InitDtsRdsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitDtsRdsInstanceResponse create() {
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
    public InitDtsRdsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitDtsRdsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitDtsRdsInstanceResponseBody body);

        @Override
        InitDtsRdsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitDtsRdsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitDtsRdsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitDtsRdsInstanceResponse response) {
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
        public Builder body(InitDtsRdsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitDtsRdsInstanceResponse build() {
            return new InitDtsRdsInstanceResponse(this);
        } 

    } 

}
