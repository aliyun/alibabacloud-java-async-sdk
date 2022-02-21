// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShieldPrecheckResponse} extends {@link TeaModel}
 *
 * <p>ShieldPrecheckResponse</p>
 */
public class ShieldPrecheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ShieldPrecheckResponseBody body;

    private ShieldPrecheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ShieldPrecheckResponse create() {
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
    public ShieldPrecheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ShieldPrecheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ShieldPrecheckResponseBody body);

        @Override
        ShieldPrecheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ShieldPrecheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ShieldPrecheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ShieldPrecheckResponse response) {
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
        public Builder body(ShieldPrecheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ShieldPrecheckResponse build() {
            return new ShieldPrecheckResponse(this);
        } 

    } 

}
