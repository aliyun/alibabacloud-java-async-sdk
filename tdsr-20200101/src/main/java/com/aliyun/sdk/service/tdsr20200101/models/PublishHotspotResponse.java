// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishHotspotResponse} extends {@link TeaModel}
 *
 * <p>PublishHotspotResponse</p>
 */
public class PublishHotspotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishHotspotResponseBody body;

    private PublishHotspotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishHotspotResponse create() {
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
    public PublishHotspotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishHotspotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishHotspotResponseBody body);

        @Override
        PublishHotspotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishHotspotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishHotspotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishHotspotResponse response) {
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
        public Builder body(PublishHotspotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishHotspotResponse build() {
            return new PublishHotspotResponse(this);
        } 

    } 

}
