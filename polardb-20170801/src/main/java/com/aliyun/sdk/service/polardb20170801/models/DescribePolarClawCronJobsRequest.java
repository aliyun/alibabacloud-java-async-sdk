// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePolarClawCronJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarClawCronJobsRequest</p>
 */
public class DescribePolarClawCronJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDisabled")
    private Boolean includeDisabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeRuns")
    private Boolean includeRuns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIdList")
    private java.util.List<String> jobIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunLimit")
    private Integer runLimit;

    private DescribePolarClawCronJobsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.includeDisabled = builder.includeDisabled;
        this.includeRuns = builder.includeRuns;
        this.jobIdList = builder.jobIdList;
        this.runLimit = builder.runLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawCronJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return includeDisabled
     */
    public Boolean getIncludeDisabled() {
        return this.includeDisabled;
    }

    /**
     * @return includeRuns
     */
    public Boolean getIncludeRuns() {
        return this.includeRuns;
    }

    /**
     * @return jobIdList
     */
    public java.util.List<String> getJobIdList() {
        return this.jobIdList;
    }

    /**
     * @return runLimit
     */
    public Integer getRunLimit() {
        return this.runLimit;
    }

    public static final class Builder extends Request.Builder<DescribePolarClawCronJobsRequest, Builder> {
        private String applicationId; 
        private Boolean includeDisabled; 
        private Boolean includeRuns; 
        private java.util.List<String> jobIdList; 
        private Integer runLimit; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarClawCronJobsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.includeDisabled = request.includeDisabled;
            this.includeRuns = request.includeRuns;
            this.jobIdList = request.jobIdList;
            this.runLimit = request.runLimit;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * IncludeDisabled.
         */
        public Builder includeDisabled(Boolean includeDisabled) {
            this.putQueryParameter("IncludeDisabled", includeDisabled);
            this.includeDisabled = includeDisabled;
            return this;
        }

        /**
         * IncludeRuns.
         */
        public Builder includeRuns(Boolean includeRuns) {
            this.putQueryParameter("IncludeRuns", includeRuns);
            this.includeRuns = includeRuns;
            return this;
        }

        /**
         * JobIdList.
         */
        public Builder jobIdList(java.util.List<String> jobIdList) {
            String jobIdListShrink = shrink(jobIdList, "JobIdList", "json");
            this.putQueryParameter("JobIdList", jobIdListShrink);
            this.jobIdList = jobIdList;
            return this;
        }

        /**
         * RunLimit.
         */
        public Builder runLimit(Integer runLimit) {
            this.putQueryParameter("RunLimit", runLimit);
            this.runLimit = runLimit;
            return this;
        }

        @Override
        public DescribePolarClawCronJobsRequest build() {
            return new DescribePolarClawCronJobsRequest(this);
        } 

    } 

}
