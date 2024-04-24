// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobMetricLastRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobMetricLastRequest</p>
 */
public class DescribeJobMetricLastRequest extends Request {
    @Query
    @NameInMap("ArrayIndex")
    private java.util.List < Integer > arrayIndex;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private DescribeJobMetricLastRequest(Builder builder) {
        super(builder);
        this.arrayIndex = builder.arrayIndex;
        this.jobId = builder.jobId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMetricLastRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrayIndex
     */
    public java.util.List < Integer > getArrayIndex() {
        return this.arrayIndex;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DescribeJobMetricLastRequest, Builder> {
        private java.util.List < Integer > arrayIndex; 
        private String jobId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobMetricLastRequest request) {
            super(request);
            this.arrayIndex = request.arrayIndex;
            this.jobId = request.jobId;
            this.taskName = request.taskName;
        } 

        /**
         * ArrayIndex.
         */
        public Builder arrayIndex(java.util.List < Integer > arrayIndex) {
            String arrayIndexShrink = shrink(arrayIndex, "ArrayIndex", "json");
            this.putQueryParameter("ArrayIndex", arrayIndexShrink);
            this.arrayIndex = arrayIndex;
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
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DescribeJobMetricLastRequest build() {
            return new DescribeJobMetricLastRequest(this);
        } 

    } 

}
