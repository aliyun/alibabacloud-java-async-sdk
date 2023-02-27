// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCampaignResponse} extends {@link TeaModel}
 *
 * <p>SubmitCampaignResponse</p>
 */
public class SubmitCampaignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitCampaignResponseBody body;

    private SubmitCampaignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitCampaignResponse create() {
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
    public SubmitCampaignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitCampaignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitCampaignResponseBody body);

        @Override
        SubmitCampaignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitCampaignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitCampaignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitCampaignResponse response) {
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
        public Builder body(SubmitCampaignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitCampaignResponse build() {
            return new SubmitCampaignResponse(this);
        } 

    } 

}
