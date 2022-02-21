// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindDirectoryResponse} extends {@link TeaModel}
 *
 * <p>BindDirectoryResponse</p>
 */
public class BindDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindDirectoryResponseBody body;

    private BindDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindDirectoryResponse create() {
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
    public BindDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindDirectoryResponseBody body);

        @Override
        BindDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindDirectoryResponse response) {
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
        public Builder body(BindDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindDirectoryResponse build() {
            return new BindDirectoryResponse(this);
        } 

    } 

}
