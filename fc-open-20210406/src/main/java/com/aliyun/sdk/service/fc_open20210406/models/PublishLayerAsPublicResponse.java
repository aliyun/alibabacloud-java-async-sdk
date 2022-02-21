// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishLayerAsPublicResponse} extends {@link TeaModel}
 *
 * <p>PublishLayerAsPublicResponse</p>
 */
public class PublishLayerAsPublicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private PublishLayerAsPublicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static PublishLayerAsPublicResponse create() {
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

    public interface Builder extends Response.Builder<PublishLayerAsPublicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        PublishLayerAsPublicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishLayerAsPublicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishLayerAsPublicResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public PublishLayerAsPublicResponse build() {
            return new PublishLayerAsPublicResponse(this);
        } 

    } 

}
