// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PackSourceResponse} extends {@link TeaModel}
 *
 * <p>PackSourceResponse</p>
 */
public class PackSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PackSourceResponseBody body;

    private PackSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PackSourceResponse create() {
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
    public PackSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PackSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PackSourceResponseBody body);

        @Override
        PackSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PackSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PackSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PackSourceResponse response) {
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
        public Builder body(PackSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PackSourceResponse build() {
            return new PackSourceResponse(this);
        } 

    } 

}
