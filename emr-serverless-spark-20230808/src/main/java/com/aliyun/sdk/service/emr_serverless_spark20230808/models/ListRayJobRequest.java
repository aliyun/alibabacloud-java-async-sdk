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
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the Ray Job (exact match).</p>
         * 
         * <strong>example:</strong>
         * <p>myrayjob</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The submission ID of the Ray Job.</p>
         * 
         * <strong>example:</strong>
         * <p>rj-xxxxxxxxxxx</p>
         */
        public Builder submissionId(String submissionId) {
            this.putQueryParameter("submissionId", submissionId);
            this.submissionId = submissionId;
            return this;
        }

        /**
         * <p>The submit time range.</p>
         */
        public Builder submitTime(SubmitTime submitTime) {
            String submitTimeShrink = shrink(submitTime, "submitTime", "json");
            this.putQueryParameter("submitTime", submitTimeShrink);
            this.submitTime = submitTime;
            return this;
        }

        /**
         * <p>The data development node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TSK-db8b870d901e443ba0aebba40c923e02</p>
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
             * <p>The end of the submit time range. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1780018822000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start of the submit time range. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1780017822000</p>
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
