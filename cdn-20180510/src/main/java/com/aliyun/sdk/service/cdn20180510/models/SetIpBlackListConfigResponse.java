// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIpBlackListConfigResponse} extends {@link TeaModel}
 *
 * <p>SetIpBlackListConfigResponse</p>
 */
public class SetIpBlackListConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetIpBlackListConfigResponseBody body;

    private SetIpBlackListConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetIpBlackListConfigResponse create() {
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
    public SetIpBlackListConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetIpBlackListConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetIpBlackListConfigResponseBody body);

        @Override
        SetIpBlackListConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetIpBlackListConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetIpBlackListConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetIpBlackListConfigResponse response) {
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
        public Builder body(SetIpBlackListConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetIpBlackListConfigResponse build() {
            return new SetIpBlackListConfigResponse(this);
        } 

    } 

}
