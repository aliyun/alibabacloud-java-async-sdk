// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearMajorProtectionBlackIpResponse} extends {@link TeaModel}
 *
 * <p>ClearMajorProtectionBlackIpResponse</p>
 */
public class ClearMajorProtectionBlackIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ClearMajorProtectionBlackIpResponseBody body;

    private ClearMajorProtectionBlackIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ClearMajorProtectionBlackIpResponse create() {
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
    public ClearMajorProtectionBlackIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ClearMajorProtectionBlackIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ClearMajorProtectionBlackIpResponseBody body);

        @Override
        ClearMajorProtectionBlackIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ClearMajorProtectionBlackIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ClearMajorProtectionBlackIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ClearMajorProtectionBlackIpResponse response) {
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
        public Builder body(ClearMajorProtectionBlackIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ClearMajorProtectionBlackIpResponse build() {
            return new ClearMajorProtectionBlackIpResponse(this);
        } 

    } 

}
