// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link AssignJobsRequest} extends {@link RequestModel}
 *
 * <p>AssignJobsRequest</p>
 */
public class AssignJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAsynchrony")
    private Boolean isAsynchrony;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobDataParsingTaskId")
    private String jobDataParsingTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobsJson")
    private java.util.List<String> jobsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RosterType")
    private String rosterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyJson")
    private String strategyJson;

    private AssignJobsRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.isAsynchrony = builder.isAsynchrony;
        this.jobDataParsingTaskId = builder.jobDataParsingTaskId;
        this.jobGroupId = builder.jobGroupId;
        this.jobsJson = builder.jobsJson;
        this.rosterType = builder.rosterType;
        this.strategyJson = builder.strategyJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callingNumber
     */
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isAsynchrony
     */
    public Boolean getIsAsynchrony() {
        return this.isAsynchrony;
    }

    /**
     * @return jobDataParsingTaskId
     */
    public String getJobDataParsingTaskId() {
        return this.jobDataParsingTaskId;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobsJson
     */
    public java.util.List<String> getJobsJson() {
        return this.jobsJson;
    }

    /**
     * @return rosterType
     */
    public String getRosterType() {
        return this.rosterType;
    }

    /**
     * @return strategyJson
     */
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public static final class Builder extends Request.Builder<AssignJobsRequest, Builder> {
        private java.util.List<String> callingNumber; 
        private String instanceId; 
        private Boolean isAsynchrony; 
        private String jobDataParsingTaskId; 
        private String jobGroupId; 
        private java.util.List<String> jobsJson; 
        private String rosterType; 
        private String strategyJson; 

        private Builder() {
            super();
        } 

        private Builder(AssignJobsRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.isAsynchrony = request.isAsynchrony;
            this.jobDataParsingTaskId = request.jobDataParsingTaskId;
            this.jobGroupId = request.jobGroupId;
            this.jobsJson = request.jobsJson;
            this.rosterType = request.rosterType;
            this.strategyJson = request.strategyJson;
        } 

        /**
         * CallingNumber.
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsAsynchrony.
         */
        public Builder isAsynchrony(Boolean isAsynchrony) {
            this.putQueryParameter("IsAsynchrony", isAsynchrony);
            this.isAsynchrony = isAsynchrony;
            return this;
        }

        /**
         * JobDataParsingTaskId.
         */
        public Builder jobDataParsingTaskId(String jobDataParsingTaskId) {
            this.putQueryParameter("JobDataParsingTaskId", jobDataParsingTaskId);
            this.jobDataParsingTaskId = jobDataParsingTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * JobsJson.
         */
        public Builder jobsJson(java.util.List<String> jobsJson) {
            this.putQueryParameter("JobsJson", jobsJson);
            this.jobsJson = jobsJson;
            return this;
        }

        /**
         * RosterType.
         */
        public Builder rosterType(String rosterType) {
            this.putQueryParameter("RosterType", rosterType);
            this.rosterType = rosterType;
            return this;
        }

        /**
         * StrategyJson.
         */
        public Builder strategyJson(String strategyJson) {
            this.putQueryParameter("StrategyJson", strategyJson);
            this.strategyJson = strategyJson;
            return this;
        }

        @Override
        public AssignJobsRequest build() {
            return new AssignJobsRequest(this);
        } 

    } 

}
