// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserBillPredictionResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserBillPredictionResponse</p>
 */
public class DescribeCdnUserBillPredictionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnUserBillPredictionResponseBody body;

    private DescribeCdnUserBillPredictionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnUserBillPredictionResponse create() {
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
    public DescribeCdnUserBillPredictionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnUserBillPredictionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnUserBillPredictionResponseBody body);

        @Override
        DescribeCdnUserBillPredictionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnUserBillPredictionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnUserBillPredictionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnUserBillPredictionResponse response) {
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
        public Builder body(DescribeCdnUserBillPredictionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnUserBillPredictionResponse build() {
            return new DescribeCdnUserBillPredictionResponse(this);
        } 

    } 

}
