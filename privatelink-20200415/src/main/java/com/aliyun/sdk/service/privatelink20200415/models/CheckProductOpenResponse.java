// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckProductOpenResponse} extends {@link TeaModel}
 *
 * <p>CheckProductOpenResponse</p>
 */
public class CheckProductOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckProductOpenResponseBody body;

    private CheckProductOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckProductOpenResponse create() {
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
    public CheckProductOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckProductOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckProductOpenResponseBody body);

        @Override
        CheckProductOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckProductOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckProductOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckProductOpenResponse response) {
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
        public Builder body(CheckProductOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckProductOpenResponse build() {
            return new CheckProductOpenResponse(this);
        } 

    } 

}
