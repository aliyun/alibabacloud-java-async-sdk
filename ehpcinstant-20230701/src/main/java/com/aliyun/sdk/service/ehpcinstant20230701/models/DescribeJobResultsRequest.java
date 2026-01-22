// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link DescribeJobResultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobResultsRequest</p>
 */
public class DescribeJobResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArrayIndex")
    private Integer arrayIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitBytes")
    private String limitBytes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private DescribeJobResultsRequest(Builder builder) {
        super(builder);
        this.arrayIndex = builder.arrayIndex;
        this.contentEncoding = builder.contentEncoding;
        this.jobId = builder.jobId;
        this.limitBytes = builder.limitBytes;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrayIndex
     */
    public Integer getArrayIndex() {
        return this.arrayIndex;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return limitBytes
     */
    public String getLimitBytes() {
        return this.limitBytes;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DescribeJobResultsRequest, Builder> {
        private Integer arrayIndex; 
        private String contentEncoding; 
        private String jobId; 
        private String limitBytes; 
        private String startTime; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobResultsRequest request) {
            super(request);
            this.arrayIndex = request.arrayIndex;
            this.contentEncoding = request.contentEncoding;
            this.jobId = request.jobId;
            this.limitBytes = request.limitBytes;
            this.startTime = request.startTime;
            this.taskName = request.taskName;
        } 

        /**
         * ArrayIndex.
         */
        public Builder arrayIndex(Integer arrayIndex) {
            this.putQueryParameter("ArrayIndex", arrayIndex);
            this.arrayIndex = arrayIndex;
            return this;
        }

        /**
         * ContentEncoding.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * LimitBytes.
         */
        public Builder limitBytes(String limitBytes) {
            this.putQueryParameter("LimitBytes", limitBytes);
            this.limitBytes = limitBytes;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DescribeJobResultsRequest build() {
            return new DescribeJobResultsRequest(this);
        } 

    } 

}
