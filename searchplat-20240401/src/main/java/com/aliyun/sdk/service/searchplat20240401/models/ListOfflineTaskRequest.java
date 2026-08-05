// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ListOfflineTaskRequest} extends {@link RequestModel}
 *
 * <p>ListOfflineTaskRequest</p>
 */
public class ListOfflineTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List<String> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskStatus")
    private java.util.List<String> taskStatus;

    private ListOfflineTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.type = builder.type;
        this.labels = builder.labels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.taskName = builder.taskName;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfflineTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return labels
     */
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskStatus
     */
    public java.util.List<String> getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder extends Request.Builder<ListOfflineTaskRequest, Builder> {
        private String workspaceName; 
        private String type; 
        private java.util.List<String> labels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String taskName; 
        private java.util.List<String> taskStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListOfflineTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.type = request.type;
            this.labels = request.labels;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.taskName = request.taskName;
            this.taskStatus = request.taskStatus;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.List<String> labels) {
            String labelsShrink = shrink(labels, "labels", "json");
            this.putQueryParameter("labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * taskStatus.
         */
        public Builder taskStatus(java.util.List<String> taskStatus) {
            String taskStatusShrink = shrink(taskStatus, "taskStatus", "json");
            this.putQueryParameter("taskStatus", taskStatusShrink);
            this.taskStatus = taskStatus;
            return this;
        }

        @Override
        public ListOfflineTaskRequest build() {
            return new ListOfflineTaskRequest(this);
        } 

    } 

}
