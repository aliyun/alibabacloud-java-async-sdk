// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLdpsResourceCostResponseBody} extends {@link TeaModel}
 *
 * <p>GetLdpsResourceCostResponseBody</p>
 */
public class GetLdpsResourceCostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("TotalResource")
    private Long totalResource;

    private GetLdpsResourceCostResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.totalResource = builder.totalResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLdpsResourceCostResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalResource
     */
    public Long getTotalResource() {
        return this.totalResource;
    }

    public static final class Builder {
        private Long endTime; 
        private String instanceId; 
        private String jobId; 
        private String requestId; 
        private Long startTime; 
        private Long totalResource; 

        private Builder() {
        } 

        private Builder(GetLdpsResourceCostResponseBody model) {
            this.endTime = model.endTime;
            this.instanceId = model.instanceId;
            this.jobId = model.jobId;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.totalResource = model.totalResource;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalResource.
         */
        public Builder totalResource(Long totalResource) {
            this.totalResource = totalResource;
            return this;
        }

        public GetLdpsResourceCostResponseBody build() {
            return new GetLdpsResourceCostResponseBody(this);
        } 

    } 

}
