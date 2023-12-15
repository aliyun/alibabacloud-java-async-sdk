// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmartContractResultContentRequest} extends {@link RequestModel}
 *
 * <p>DescribeSmartContractResultContentRequest</p>
 */
public class DescribeSmartContractResultContentRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private DescribeSmartContractResultContentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartContractResultContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DescribeSmartContractResultContentRequest, Builder> {
        private String regionId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSmartContractResultContentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobId = request.jobId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DescribeSmartContractResultContentRequest build() {
            return new DescribeSmartContractResultContentRequest(this);
        } 

    } 

}
