// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetConfigOfVersionResponse} extends {@link TeaModel}
 *
 * <p>SetConfigOfVersionResponse</p>
 */
public class SetConfigOfVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetConfigOfVersionResponseBody body;

    private SetConfigOfVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetConfigOfVersionResponse create() {
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
    public SetConfigOfVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetConfigOfVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetConfigOfVersionResponseBody body);

        @Override
        SetConfigOfVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetConfigOfVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetConfigOfVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetConfigOfVersionResponse response) {
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
        public Builder body(SetConfigOfVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetConfigOfVersionResponse build() {
            return new SetConfigOfVersionResponse(this);
        } 

    } 

}
