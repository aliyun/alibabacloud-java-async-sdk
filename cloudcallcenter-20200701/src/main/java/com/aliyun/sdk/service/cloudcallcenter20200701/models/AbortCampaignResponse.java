// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortCampaignResponse} extends {@link TeaModel}
 *
 * <p>AbortCampaignResponse</p>
 */
public class AbortCampaignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AbortCampaignResponseBody body;

    private AbortCampaignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AbortCampaignResponse create() {
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
    public AbortCampaignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AbortCampaignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AbortCampaignResponseBody body);

        @Override
        AbortCampaignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AbortCampaignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AbortCampaignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AbortCampaignResponse response) {
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
        public Builder body(AbortCampaignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AbortCampaignResponse build() {
            return new AbortCampaignResponse(this);
        } 

    } 

}
