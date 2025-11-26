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
 * {@link AssignJobsAsyncRequest} extends {@link RequestModel}
 *
 * <p>AssignJobsAsyncRequest</p>
 */
public class AssignJobsAsyncRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobsJson")
    private java.util.List<String> jobsJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyJson")
    private String strategyJson;

    private AssignJobsAsyncRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobsJson = builder.jobsJson;
        this.strategyJson = builder.strategyJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignJobsAsyncRequest create() {
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
     * @return strategyJson
     */
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public static final class Builder extends Request.Builder<AssignJobsAsyncRequest, Builder> {
        private java.util.List<String> callingNumber; 
        private String instanceId; 
        private String jobGroupId; 
        private java.util.List<String> jobsJson; 
        private String strategyJson; 

        private Builder() {
            super();
        } 

        private Builder(AssignJobsAsyncRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobsJson = request.jobsJson;
            this.strategyJson = request.strategyJson;
        } 

        /**
         * CallingNumber.
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            String callingNumberShrink = shrink(callingNumber, "CallingNumber", "json");
            this.putBodyParameter("CallingNumber", callingNumberShrink);
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
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putBodyParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * JobsJson.
         */
        public Builder jobsJson(java.util.List<String> jobsJson) {
            String jobsJsonShrink = shrink(jobsJson, "JobsJson", "json");
            this.putBodyParameter("JobsJson", jobsJsonShrink);
            this.jobsJson = jobsJson;
            return this;
        }

        /**
         * StrategyJson.
         */
        public Builder strategyJson(String strategyJson) {
            this.putBodyParameter("StrategyJson", strategyJson);
            this.strategyJson = strategyJson;
            return this;
        }

        @Override
        public AssignJobsAsyncRequest build() {
            return new AssignJobsAsyncRequest(this);
        } 

    } 

}
