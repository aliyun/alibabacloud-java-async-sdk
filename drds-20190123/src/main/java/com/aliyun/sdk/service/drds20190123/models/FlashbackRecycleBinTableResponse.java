// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlashbackRecycleBinTableResponse} extends {@link TeaModel}
 *
 * <p>FlashbackRecycleBinTableResponse</p>
 */
public class FlashbackRecycleBinTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlashbackRecycleBinTableResponseBody body;

    private FlashbackRecycleBinTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlashbackRecycleBinTableResponse create() {
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
    public FlashbackRecycleBinTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlashbackRecycleBinTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlashbackRecycleBinTableResponseBody body);

        @Override
        FlashbackRecycleBinTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlashbackRecycleBinTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlashbackRecycleBinTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlashbackRecycleBinTableResponse response) {
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
        public Builder body(FlashbackRecycleBinTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlashbackRecycleBinTableResponse build() {
            return new FlashbackRecycleBinTableResponse(this);
        } 

    } 

}
