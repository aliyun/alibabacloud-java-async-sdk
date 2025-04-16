// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListTrainingJobsRequest} extends {@link RequestModel}
 *
 * <p>ListTrainingJobsRequest</p>
 */
public class ListTrainingJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgorithmName")
    private String algorithmName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsTempAlgo")
    private Boolean isTempAlgo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map<String, ?> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    private String trainingJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrainingJobName")
    private String trainingJobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListTrainingJobsRequest(Builder builder) {
        super(builder);
        this.algorithmName = builder.algorithmName;
        this.algorithmProvider = builder.algorithmProvider;
        this.endTime = builder.endTime;
        this.isTempAlgo = builder.isTempAlgo;
        this.labels = builder.labels;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.trainingJobId = builder.trainingJobId;
        this.trainingJobName = builder.trainingJobName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmName
     */
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * @return algorithmProvider
     */
    public String getAlgorithmProvider() {
        return this.algorithmProvider;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return isTempAlgo
     */
    public Boolean getIsTempAlgo() {
        return this.isTempAlgo;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
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

    /**
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    /**
     * @return trainingJobName
     */
    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListTrainingJobsRequest, Builder> {
        private String algorithmName; 
        private String algorithmProvider; 
        private String endTime; 
        private Boolean isTempAlgo; 
        private java.util.Map<String, ?> labels; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String sortBy; 
        private String startTime; 
        private String status; 
        private String trainingJobId; 
        private String trainingJobName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListTrainingJobsRequest request) {
            super(request);
            this.algorithmName = request.algorithmName;
            this.algorithmProvider = request.algorithmProvider;
            this.endTime = request.endTime;
            this.isTempAlgo = request.isTempAlgo;
            this.labels = request.labels;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
            this.trainingJobId = request.trainingJobId;
            this.trainingJobName = request.trainingJobName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AlgorithmName.
         */
        public Builder algorithmName(String algorithmName) {
            this.putQueryParameter("AlgorithmName", algorithmName);
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * AlgorithmProvider.
         */
        public Builder algorithmProvider(String algorithmProvider) {
            this.putQueryParameter("AlgorithmProvider", algorithmProvider);
            this.algorithmProvider = algorithmProvider;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IsTempAlgo.
         */
        public Builder isTempAlgo(Boolean isTempAlgo) {
            this.putQueryParameter("IsTempAlgo", isTempAlgo);
            this.isTempAlgo = isTempAlgo;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.Map<String, ?> labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TrainingJobId.
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putQueryParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        /**
         * TrainingJobName.
         */
        public Builder trainingJobName(String trainingJobName) {
            this.putQueryParameter("TrainingJobName", trainingJobName);
            this.trainingJobName = trainingJobName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListTrainingJobsRequest build() {
            return new ListTrainingJobsRequest(this);
        } 

    } 

}
