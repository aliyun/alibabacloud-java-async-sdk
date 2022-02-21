// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveRecycleBinTableResponse} extends {@link TeaModel}
 *
 * <p>RemoveRecycleBinTableResponse</p>
 */
public class RemoveRecycleBinTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveRecycleBinTableResponseBody body;

    private RemoveRecycleBinTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveRecycleBinTableResponse create() {
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
    public RemoveRecycleBinTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveRecycleBinTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveRecycleBinTableResponseBody body);

        @Override
        RemoveRecycleBinTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveRecycleBinTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveRecycleBinTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveRecycleBinTableResponse response) {
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
        public Builder body(RemoveRecycleBinTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveRecycleBinTableResponse build() {
            return new RemoveRecycleBinTableResponse(this);
        } 

    } 

}
