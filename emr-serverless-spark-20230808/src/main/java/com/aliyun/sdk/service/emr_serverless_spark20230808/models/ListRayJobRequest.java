// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListRayJobRequest} extends {@link RequestModel}
 *
 * <p>ListRayJobRequest</p>
 */
public class ListRayJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("submissionId")
    private String submissionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("submitTime")
    private SubmitTime submitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskBizId")
    private String taskBizId;

    private ListRayJobRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.submissionId = builder.submissionId;
        this.submitTime = builder.submitTime;
        this.taskBizId = builder.taskBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRayJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return submissionId
     */
    public String getSubmissionId() {
        return this.submissionId;
    }

    /**
     * @return submitTime
     */
    public SubmitTime getSubmitTime() {
        return this.submitTime;
    }

    /**
     * @return taskBizId
     */
    public String getTaskBizId() {
        return this.taskBizId;
    }

    public static final class Builder extends Request.Builder<ListRayJobRequest, Builder> {
        private String workspaceId; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String submissionId; 
        private SubmitTime submitTime; 
        private String taskBizId; 

        private Builder() {
            super();
        } 

        private Builder(ListRayJobRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.submissionId = request.submissionId;
            this.submitTime = request.submitTime;
            this.taskBizId = request.taskBizId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * submissionId.
         */
        public Builder submissionId(String submissionId) {
            this.putQueryParameter("submissionId", submissionId);
            this.submissionId = submissionId;
            return this;
        }

        /**
         * submitTime.
         */
        public Builder submitTime(SubmitTime submitTime) {
            String submitTimeShrink = shrink(submitTime, "submitTime", "json");
            this.putQueryParameter("submitTime", submitTimeShrink);
            this.submitTime = submitTime;
            return this;
        }

        /**
         * taskBizId.
         */
        public Builder taskBizId(String taskBizId) {
            this.putQueryParameter("taskBizId", taskBizId);
            this.taskBizId = taskBizId;
            return this;
        }

        @Override
        public ListRayJobRequest build() {
            return new ListRayJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListRayJobRequest} extends {@link TeaModel}
     *
     * <p>ListRayJobRequest</p>
     */
    public static class SubmitTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        private SubmitTime(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitTime create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(SubmitTime model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public SubmitTime build() {
                return new SubmitTime(this);
            } 

        } 

    }
}
