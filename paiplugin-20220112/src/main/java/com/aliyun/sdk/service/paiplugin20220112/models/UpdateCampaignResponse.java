// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCampaignResponse} extends {@link TeaModel}
 *
 * <p>UpdateCampaignResponse</p>
 */
public class UpdateCampaignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCampaignResponseBody body;

    private UpdateCampaignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCampaignResponse create() {
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
    public UpdateCampaignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCampaignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCampaignResponseBody body);

        @Override
        UpdateCampaignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCampaignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCampaignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCampaignResponse response) {
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
        public Builder body(UpdateCampaignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCampaignResponse build() {
            return new UpdateCampaignResponse(this);
        } 

    } 

}
