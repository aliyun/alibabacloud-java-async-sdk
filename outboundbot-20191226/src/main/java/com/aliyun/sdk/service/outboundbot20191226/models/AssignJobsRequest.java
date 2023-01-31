// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignJobsRequest} extends {@link RequestModel}
 *
 * <p>AssignJobsRequest</p>
 */
public class AssignJobsRequest extends Request {
    @Query
    @NameInMap("CallingNumber")
    private java.util.List < String > callingNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsAsynchrony")
    private Boolean isAsynchrony;

    @Query
    @NameInMap("JobDataParsingTaskId")
    private String jobDataParsingTaskId;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    @Query
    @NameInMap("JobsJson")
    private java.util.List < String > jobsJson;

    @Query
    @NameInMap("RosterType")
    private String rosterType;

    @Query
    @NameInMap("StrategyJson")
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
    public java.util.List < String > getCallingNumber() {
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
    public java.util.List < String > getJobsJson() {
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
        private java.util.List < String > callingNumber; 
        private String instanceId; 
        private Boolean isAsynchrony; 
        private String jobDataParsingTaskId; 
        private String jobGroupId; 
        private java.util.List < String > jobsJson; 
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
        public Builder callingNumber(java.util.List < String > callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * InstanceId.
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
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * JobsJson.
         */
        public Builder jobsJson(java.util.List < String > jobsJson) {
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
