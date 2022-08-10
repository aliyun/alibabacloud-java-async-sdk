// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitImageCommodityReviewResponse} extends {@link TeaModel}
 *
 * <p>SubmitImageCommodityReviewResponse</p>
 */
public class SubmitImageCommodityReviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitImageCommodityReviewResponseBody body;

    private SubmitImageCommodityReviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitImageCommodityReviewResponse create() {
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
    public SubmitImageCommodityReviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitImageCommodityReviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitImageCommodityReviewResponseBody body);

        @Override
        SubmitImageCommodityReviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitImageCommodityReviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitImageCommodityReviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitImageCommodityReviewResponse response) {
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
        public Builder body(SubmitImageCommodityReviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitImageCommodityReviewResponse build() {
            return new SubmitImageCommodityReviewResponse(this);
        } 

    } 

}
