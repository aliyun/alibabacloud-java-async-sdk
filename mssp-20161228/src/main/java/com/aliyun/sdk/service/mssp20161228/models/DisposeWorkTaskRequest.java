// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link DisposeWorkTaskRequest} extends {@link RequestModel}
 *
 * <p>DisposeWorkTaskRequest</p>
 */
public class DisposeWorkTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OptRemark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String optRemark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkTaskAnalysisResults")
    private java.util.List<WorkTaskAnalysisResults> workTaskAnalysisResults;

    private DisposeWorkTaskRequest(Builder builder) {
        super(builder);
        this.operator = builder.operator;
        this.optRemark = builder.optRemark;
        this.status = builder.status;
        this.taskIds = builder.taskIds;
        this.workTaskAnalysisResults = builder.workTaskAnalysisResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisposeWorkTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return optRemark
     */
    public String getOptRemark() {
        return this.optRemark;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskIds
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return workTaskAnalysisResults
     */
    public java.util.List<WorkTaskAnalysisResults> getWorkTaskAnalysisResults() {
        return this.workTaskAnalysisResults;
    }

    public static final class Builder extends Request.Builder<DisposeWorkTaskRequest, Builder> {
        private String operator; 
        private String optRemark; 
        private Integer status; 
        private String taskIds; 
        private java.util.List<WorkTaskAnalysisResults> workTaskAnalysisResults; 

        private Builder() {
            super();
        } 

        private Builder(DisposeWorkTaskRequest request) {
            super(request);
            this.operator = request.operator;
            this.optRemark = request.optRemark;
            this.status = request.status;
            this.taskIds = request.taskIds;
            this.workTaskAnalysisResults = request.workTaskAnalysisResults;
        } 

        /**
         * <p>Operator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WB01089929</p>
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>Operation remarks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>处理完成</p>
         */
        public Builder optRemark(String optRemark) {
            this.putBodyParameter("OptRemark", optRemark);
            this.optRemark = optRemark;
            return this;
        }

        /**
         * <p>Work order status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Work order ID, multiple IDs separated by commas.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10310</p>
         */
        public Builder taskIds(String taskIds) {
            this.putBodyParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * WorkTaskAnalysisResults.
         */
        public Builder workTaskAnalysisResults(java.util.List<WorkTaskAnalysisResults> workTaskAnalysisResults) {
            String workTaskAnalysisResultsShrink = shrink(workTaskAnalysisResults, "WorkTaskAnalysisResults", "json");
            this.putBodyParameter("WorkTaskAnalysisResults", workTaskAnalysisResultsShrink);
            this.workTaskAnalysisResults = workTaskAnalysisResults;
            return this;
        }

        @Override
        public DisposeWorkTaskRequest build() {
            return new DisposeWorkTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link DisposeWorkTaskRequest} extends {@link TeaModel}
     *
     * <p>DisposeWorkTaskRequest</p>
     */
    public static class WorkTaskAnalysisResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalysisResult")
        private String analysisResult;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private WorkTaskAnalysisResults(Builder builder) {
            this.analysisResult = builder.analysisResult;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkTaskAnalysisResults create() {
            return builder().build();
        }

        /**
         * @return analysisResult
         */
        public String getAnalysisResult() {
            return this.analysisResult;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String analysisResult; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(WorkTaskAnalysisResults model) {
                this.analysisResult = model.analysisResult;
                this.taskId = model.taskId;
            } 

            /**
             * AnalysisResult.
             */
            public Builder analysisResult(String analysisResult) {
                this.analysisResult = analysisResult;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public WorkTaskAnalysisResults build() {
                return new WorkTaskAnalysisResults(this);
            } 

        } 

    }
}
