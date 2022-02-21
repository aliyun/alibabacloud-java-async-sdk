// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnDomainStagingConfigResponse} extends {@link TeaModel}
 *
 * <p>SetCdnDomainStagingConfigResponse</p>
 */
public class SetCdnDomainStagingConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCdnDomainStagingConfigResponseBody body;

    private SetCdnDomainStagingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCdnDomainStagingConfigResponse create() {
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
    public SetCdnDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCdnDomainStagingConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCdnDomainStagingConfigResponseBody body);

        @Override
        SetCdnDomainStagingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCdnDomainStagingConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCdnDomainStagingConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCdnDomainStagingConfigResponse response) {
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
        public Builder body(SetCdnDomainStagingConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCdnDomainStagingConfigResponse build() {
            return new SetCdnDomainStagingConfigResponse(this);
        } 

    } 

}
