// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeCampaignResponse} extends {@link TeaModel}
 *
 * <p>ResumeCampaignResponse</p>
 */
public class ResumeCampaignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeCampaignResponseBody body;

    private ResumeCampaignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeCampaignResponse create() {
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
    public ResumeCampaignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeCampaignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeCampaignResponseBody body);

        @Override
        ResumeCampaignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeCampaignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeCampaignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeCampaignResponse response) {
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
        public Builder body(ResumeCampaignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeCampaignResponse build() {
            return new ResumeCampaignResponse(this);
        } 

    } 

}
