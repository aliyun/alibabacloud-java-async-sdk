// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlanEstimationResponse} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlanEstimationResponse</p>
 */
public class DescribeSavingsPlanEstimationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSavingsPlanEstimationResponseBody body;

    private DescribeSavingsPlanEstimationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSavingsPlanEstimationResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeSavingsPlanEstimationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSavingsPlanEstimationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSavingsPlanEstimationResponseBody body);

        @Override
        DescribeSavingsPlanEstimationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSavingsPlanEstimationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeSavingsPlanEstimationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSavingsPlanEstimationResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeSavingsPlanEstimationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSavingsPlanEstimationResponse build() {
            return new DescribeSavingsPlanEstimationResponse(this);
        } 

    } 

}
