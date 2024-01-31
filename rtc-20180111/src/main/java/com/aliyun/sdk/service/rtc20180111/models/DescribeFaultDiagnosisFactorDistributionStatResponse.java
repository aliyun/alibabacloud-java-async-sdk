// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFaultDiagnosisFactorDistributionStatResponse} extends {@link TeaModel}
 *
 * <p>DescribeFaultDiagnosisFactorDistributionStatResponse</p>
 */
public class DescribeFaultDiagnosisFactorDistributionStatResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeFaultDiagnosisFactorDistributionStatResponseBody body;

    private DescribeFaultDiagnosisFactorDistributionStatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeFaultDiagnosisFactorDistributionStatResponse create() {
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
    public DescribeFaultDiagnosisFactorDistributionStatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFaultDiagnosisFactorDistributionStatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeFaultDiagnosisFactorDistributionStatResponseBody body);

        @Override
        DescribeFaultDiagnosisFactorDistributionStatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFaultDiagnosisFactorDistributionStatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeFaultDiagnosisFactorDistributionStatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFaultDiagnosisFactorDistributionStatResponse response) {
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
        public Builder body(DescribeFaultDiagnosisFactorDistributionStatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFaultDiagnosisFactorDistributionStatResponse build() {
            return new DescribeFaultDiagnosisFactorDistributionStatResponse(this);
        } 

    } 

}
