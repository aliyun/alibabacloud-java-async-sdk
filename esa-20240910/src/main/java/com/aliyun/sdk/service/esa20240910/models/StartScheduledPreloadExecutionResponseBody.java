// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartScheduledPreloadExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StartScheduledPreloadExecutionResponseBody</p>
 */
public class StartScheduledPreloadExecutionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private String aliUid;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SliceLen")
    private Integer sliceLen;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private StartScheduledPreloadExecutionResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.interval = builder.interval;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.sliceLen = builder.sliceLen;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartScheduledPreloadExecutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
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
     * @return sliceLen
     */
    public Integer getSliceLen() {
        return this.sliceLen;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String aliUid; 
        private String endTime; 
        private String id; 
        private Integer interval; 
        private String jobId; 
        private String requestId; 
        private Integer sliceLen; 
        private String startTime; 
        private String status; 

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>15685865xxx14622</p>
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The end time of the prefetch plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31T18:10:48.849+08:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the prefetch plan.</p>
         * 
         * <strong>example:</strong>
         * <p>665d3b48621bccf3fe29e1a7</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The time interval between each batch execution. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The ID of the prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>665d3af3621bccf3fe29e1a4</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of URLs prefetched in each batch.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sliceLen(Integer sliceLen) {
            this.sliceLen = sliceLen;
            return this;
        }

        /**
         * <p>The start time of the prefetch plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31T17:10:48.849+08:00</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the prefetch plan. Valid values:</p>
         * <ul>
         * <li><strong>waiting</strong></li>
         * <li><strong>running</strong></li>
         * <li><strong>finished</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>stopped</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>waiting</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public StartScheduledPreloadExecutionResponseBody build() {
            return new StartScheduledPreloadExecutionResponseBody(this);
        } 

    } 

}
