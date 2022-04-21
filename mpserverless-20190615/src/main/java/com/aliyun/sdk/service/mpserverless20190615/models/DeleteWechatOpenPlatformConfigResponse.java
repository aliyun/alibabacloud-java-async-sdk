// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWechatOpenPlatformConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteWechatOpenPlatformConfigResponse</p>
 */
public class DeleteWechatOpenPlatformConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWechatOpenPlatformConfigResponseBody body;

    private DeleteWechatOpenPlatformConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWechatOpenPlatformConfigResponse create() {
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
    public DeleteWechatOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWechatOpenPlatformConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWechatOpenPlatformConfigResponseBody body);

        @Override
        DeleteWechatOpenPlatformConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWechatOpenPlatformConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWechatOpenPlatformConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWechatOpenPlatformConfigResponse response) {
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
        public Builder body(DeleteWechatOpenPlatformConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWechatOpenPlatformConfigResponse build() {
            return new DeleteWechatOpenPlatformConfigResponse(this);
        } 

    } 

}
