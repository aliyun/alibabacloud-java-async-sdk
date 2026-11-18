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
         * <p>The executor index.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder arrayIndex(Integer arrayIndex) {
            this.putQueryParameter("ArrayIndex", arrayIndex);
            this.arrayIndex = arrayIndex;
            return this;
        }

        /**
         * <p>Specifies the encoding method for the CommandContent and Output fields in the response. Valid values:</p>
         * <ul>
         * <li>PlainText: Returns the original script content and output.</li>
         * <li>Base64: Returns the Base64-encoded script content and output.</li>
         * </ul>
         * <p>Default value: Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxxxxx</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The limit on the total size of the logs. Unit: bytes. Valid values: 1 to 1048576 (1 MB).</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        public Builder limitBytes(String limitBytes) {
            this.putQueryParameter("LimitBytes", limitBytes);
            this.limitBytes = limitBytes;
            return this;
        }

        /**
         * <p>The start time in UTC, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-02T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Task0</p>
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
