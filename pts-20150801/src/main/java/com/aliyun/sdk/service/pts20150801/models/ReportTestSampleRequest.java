// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportTestSampleRequest} extends {@link RequestModel}
 *
 * <p>ReportTestSampleRequest</p>
 */
public class ReportTestSampleRequest extends Request {
    @Query
    @NameInMap("TestSample")
    @Validation(required = true)
    private String testSample;

    private ReportTestSampleRequest(Builder builder) {
        super(builder);
        this.testSample = builder.testSample;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportTestSampleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return testSample
     */
    public String getTestSample() {
        return this.testSample;
    }

    public static final class Builder extends Request.Builder<ReportTestSampleRequest, Builder> {
        private String testSample; 

        private Builder() {
            super();
        } 

        private Builder(ReportTestSampleRequest request) {
            super(request);
            this.testSample = request.testSample;
        } 

        /**
         * TestSample.
         */
        public Builder testSample(String testSample) {
            this.putQueryParameter("TestSample", testSample);
            this.testSample = testSample;
            return this;
        }

        @Override
        public ReportTestSampleRequest build() {
            return new ReportTestSampleRequest(this);
        } 

    } 

}
