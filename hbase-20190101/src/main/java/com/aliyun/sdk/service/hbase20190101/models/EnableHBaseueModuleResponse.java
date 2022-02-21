// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableHBaseueModuleResponse} extends {@link TeaModel}
 *
 * <p>EnableHBaseueModuleResponse</p>
 */
public class EnableHBaseueModuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableHBaseueModuleResponseBody body;

    private EnableHBaseueModuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableHBaseueModuleResponse create() {
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
    public EnableHBaseueModuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableHBaseueModuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableHBaseueModuleResponseBody body);

        @Override
        EnableHBaseueModuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableHBaseueModuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableHBaseueModuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableHBaseueModuleResponse response) {
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
        public Builder body(EnableHBaseueModuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableHBaseueModuleResponse build() {
            return new EnableHBaseueModuleResponse(this);
        } 

    } 

}
