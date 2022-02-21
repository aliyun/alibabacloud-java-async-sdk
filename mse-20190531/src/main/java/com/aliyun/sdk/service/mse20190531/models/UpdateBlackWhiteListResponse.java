// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBlackWhiteListResponse} extends {@link TeaModel}
 *
 * <p>UpdateBlackWhiteListResponse</p>
 */
public class UpdateBlackWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBlackWhiteListResponseBody body;

    private UpdateBlackWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBlackWhiteListResponse create() {
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
    public UpdateBlackWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBlackWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBlackWhiteListResponseBody body);

        @Override
        UpdateBlackWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBlackWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBlackWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBlackWhiteListResponse response) {
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
        public Builder body(UpdateBlackWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBlackWhiteListResponse build() {
            return new UpdateBlackWhiteListResponse(this);
        } 

    } 

}
