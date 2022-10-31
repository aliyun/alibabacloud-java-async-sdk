// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveUserBillPredictionResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveUserBillPredictionResponse</p>
 */
public class DescribeLiveUserBillPredictionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveUserBillPredictionResponseBody body;

    private DescribeLiveUserBillPredictionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveUserBillPredictionResponse create() {
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
    public DescribeLiveUserBillPredictionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveUserBillPredictionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveUserBillPredictionResponseBody body);

        @Override
        DescribeLiveUserBillPredictionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveUserBillPredictionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveUserBillPredictionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveUserBillPredictionResponse response) {
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
        public Builder body(DescribeLiveUserBillPredictionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveUserBillPredictionResponse build() {
            return new DescribeLiveUserBillPredictionResponse(this);
        } 

    } 

}
