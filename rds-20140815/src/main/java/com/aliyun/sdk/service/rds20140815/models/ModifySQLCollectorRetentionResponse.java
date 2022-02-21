// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySQLCollectorRetentionResponse} extends {@link TeaModel}
 *
 * <p>ModifySQLCollectorRetentionResponse</p>
 */
public class ModifySQLCollectorRetentionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySQLCollectorRetentionResponseBody body;

    private ModifySQLCollectorRetentionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySQLCollectorRetentionResponse create() {
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
    public ModifySQLCollectorRetentionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySQLCollectorRetentionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySQLCollectorRetentionResponseBody body);

        @Override
        ModifySQLCollectorRetentionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySQLCollectorRetentionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySQLCollectorRetentionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySQLCollectorRetentionResponse response) {
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
        public Builder body(ModifySQLCollectorRetentionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySQLCollectorRetentionResponse build() {
            return new ModifySQLCollectorRetentionResponse(this);
        } 

    } 

}
