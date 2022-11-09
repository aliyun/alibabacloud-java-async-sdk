// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlushExpireKeysResponse} extends {@link TeaModel}
 *
 * <p>FlushExpireKeysResponse</p>
 */
public class FlushExpireKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlushExpireKeysResponseBody body;

    private FlushExpireKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlushExpireKeysResponse create() {
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
    public FlushExpireKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlushExpireKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlushExpireKeysResponseBody body);

        @Override
        FlushExpireKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlushExpireKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlushExpireKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlushExpireKeysResponse response) {
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
        public Builder body(FlushExpireKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlushExpireKeysResponse build() {
            return new FlushExpireKeysResponse(this);
        } 

    } 

}
