// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLdpsResourceCostResponseBody} extends {@link TeaModel}
 *
 * <p>GetLdpsResourceCostResponseBody</p>
 */
public class GetLdpsResourceCostResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("TotalResource")
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
