// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BillingStatisticsResponse} extends {@link TeaModel}
 *
 * <p>BillingStatisticsResponse</p>
 */
public class BillingStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BillingStatisticsResponseBody body;

    private BillingStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BillingStatisticsResponse create() {
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
    public BillingStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BillingStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BillingStatisticsResponseBody body);

        @Override
        BillingStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BillingStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BillingStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BillingStatisticsResponse response) {
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
        public Builder body(BillingStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BillingStatisticsResponse build() {
            return new BillingStatisticsResponse(this);
        } 

    } 

}
