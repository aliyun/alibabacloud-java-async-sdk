// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDasProResponse} extends {@link TeaModel}
 *
 * <p>EnableDasProResponse</p>
 */
public class EnableDasProResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableDasProResponseBody body;

    private EnableDasProResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableDasProResponse create() {
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
    public EnableDasProResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableDasProResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableDasProResponseBody body);

        @Override
        EnableDasProResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableDasProResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableDasProResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableDasProResponse response) {
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
        public Builder body(EnableDasProResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableDasProResponse build() {
            return new EnableDasProResponse(this);
        } 

    } 

}
