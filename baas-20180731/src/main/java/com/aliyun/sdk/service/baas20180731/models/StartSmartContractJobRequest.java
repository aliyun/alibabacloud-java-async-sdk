// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartSmartContractJobRequest} extends {@link RequestModel}
 *
 * <p>StartSmartContractJobRequest</p>
 */
public class StartSmartContractJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Body
    @NameInMap("JobName")
    @Validation(required = true)
    private String jobName;

    @Body
    @NameInMap("SourceOpt")
    private String sourceOpt;

    @Body
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    private StartSmartContractJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.sourceOpt = builder.sourceOpt;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSmartContractJobRequest create() {
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

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return sourceOpt
     */
    public String getSourceOpt() {
        return this.sourceOpt;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<StartSmartContractJobRequest, Builder> {
        private String regionId; 
        private String jobId; 
        private String jobName; 
        private String sourceOpt; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(StartSmartContractJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobId = request.jobId;
            this.jobName = request.jobName;
            this.sourceOpt = request.sourceOpt;
            this.sourceType = request.sourceType;
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

        /**
         * JobName.
         */
        public Builder jobName(String jobName) {
            this.putBodyParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * SourceOpt.
         */
        public Builder sourceOpt(String sourceOpt) {
            this.putBodyParameter("SourceOpt", sourceOpt);
            this.sourceOpt = sourceOpt;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public StartSmartContractJobRequest build() {
            return new StartSmartContractJobRequest(this);
        } 

    } 

}
