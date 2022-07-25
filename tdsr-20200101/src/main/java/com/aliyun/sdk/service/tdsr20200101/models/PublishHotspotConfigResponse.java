// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishHotspotConfigResponse} extends {@link TeaModel}
 *
 * <p>PublishHotspotConfigResponse</p>
 */
public class PublishHotspotConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishHotspotConfigResponseBody body;

    private PublishHotspotConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishHotspotConfigResponse create() {
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
    public PublishHotspotConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishHotspotConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishHotspotConfigResponseBody body);

        @Override
        PublishHotspotConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishHotspotConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishHotspotConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishHotspotConfigResponse response) {
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
        public Builder body(PublishHotspotConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishHotspotConfigResponse build() {
            return new PublishHotspotConfigResponse(this);
        } 

    } 

}
