// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowInstanceResponseBody</p>
 */
public class DescribeWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("emrClusterId")
    private String emrClusterId;

    @NameInMap("endDate")
    private String endDate;

    @NameInMap("isComplementData")
    private Boolean isComplementData;

    @NameInMap("name")
    private String name;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @NameInMap("runTimes")
    private Integer runTimes;

    @NameInMap("scheduleTime")
    private String scheduleTime;

    @NameInMap("startDate")
    private String startDate;

    @NameInMap("state")
    private String state;

    @NameInMap("timeout")
    private Integer timeout;

    @NameInMap("workflowId")
    private Long workflowId;

    @NameInMap("workflowVersion")
    private Integer workflowVersion;

    private DescribeWorkflowInstanceResponseBody(Builder builder) {
        this.emrClusterId = builder.emrClusterId;
        this.endDate = builder.endDate;
        this.isComplementData = builder.isComplementData;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.runTimes = builder.runTimes;
        this.scheduleTime = builder.scheduleTime;
        this.startDate = builder.startDate;
        this.state = builder.state;
        this.timeout = builder.timeout;
        this.workflowId = builder.workflowId;
        this.workflowVersion = builder.workflowVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return emrClusterId
     */
    public String getEmrClusterId() {
        return this.emrClusterId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return isComplementData
     */
    public Boolean getIsComplementData() {
        return this.isComplementData;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return runTimes
     */
    public Integer getRunTimes() {
        return this.runTimes;
    }

    /**
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workflowVersion
     */
    public Integer getWorkflowVersion() {
        return this.workflowVersion;
    }

    public static final class Builder {
        private String emrClusterId; 
        private String endDate; 
        private Boolean isComplementData; 
        private String name; 
        private String requestId; 
        private String resourceGroupId; 
        private Integer runTimes; 
        private String scheduleTime; 
        private String startDate; 
        private String state; 
        private Integer timeout; 
        private Long workflowId; 
        private Integer workflowVersion; 

        /**
         * emrClusterId.
         */
        public Builder emrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * isComplementData.
         */
        public Builder isComplementData(Boolean isComplementData) {
            this.isComplementData = isComplementData;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * runTimes.
         */
        public Builder runTimes(Integer runTimes) {
            this.runTimes = runTimes;
            return this;
        }

        /**
         * scheduleTime.
         */
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * workflowId.
         */
        public Builder workflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        /**
         * workflowVersion.
         */
        public Builder workflowVersion(Integer workflowVersion) {
            this.workflowVersion = workflowVersion;
            return this;
        }

        public DescribeWorkflowInstanceResponseBody build() {
            return new DescribeWorkflowInstanceResponseBody(this);
        } 

    } 

}
