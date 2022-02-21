// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyGtmConfigResponse} extends {@link TeaModel}
 *
 * <p>CopyGtmConfigResponse</p>
 */
public class CopyGtmConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyGtmConfigResponseBody body;

    private CopyGtmConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyGtmConfigResponse create() {
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
    public CopyGtmConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyGtmConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyGtmConfigResponseBody body);

        @Override
        CopyGtmConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyGtmConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyGtmConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyGtmConfigResponse response) {
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
        public Builder body(CopyGtmConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyGtmConfigResponse build() {
            return new CopyGtmConfigResponse(this);
        } 

    } 

}
