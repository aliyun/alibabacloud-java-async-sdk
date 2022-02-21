// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIpAllowListConfigResponse} extends {@link TeaModel}
 *
 * <p>SetIpAllowListConfigResponse</p>
 */
public class SetIpAllowListConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetIpAllowListConfigResponseBody body;

    private SetIpAllowListConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetIpAllowListConfigResponse create() {
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
    public SetIpAllowListConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetIpAllowListConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetIpAllowListConfigResponseBody body);

        @Override
        SetIpAllowListConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetIpAllowListConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetIpAllowListConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetIpAllowListConfigResponse response) {
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
        public Builder body(SetIpAllowListConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetIpAllowListConfigResponse build() {
            return new SetIpAllowListConfigResponse(this);
        } 

    } 

}
