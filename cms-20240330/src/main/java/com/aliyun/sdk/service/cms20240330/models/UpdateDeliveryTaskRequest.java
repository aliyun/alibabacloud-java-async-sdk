// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeliveryTaskRequest</p>
 */
public class UpdateDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("externalLabels")
    private java.util.Map<String, String> externalLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("labelFilters")
    private java.util.Map<String, String> labelFilters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("labelFiltersType")
    private String labelFiltersType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sinkList")
    private java.util.List<SinkList> sinkList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDescription")
    private String taskDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    private UpdateDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.dataSourceId = builder.dataSourceId;
        this.externalLabels = builder.externalLabels;
        this.labelFilters = builder.labelFilters;
        this.labelFiltersType = builder.labelFiltersType;
        this.resourceGroupId = builder.resourceGroupId;
        this.sinkList = builder.sinkList;
        this.status = builder.status;
        this.taskDescription = builder.taskDescription;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeliveryTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return externalLabels
     */
    public java.util.Map<String, String> getExternalLabels() {
        return this.externalLabels;
    }

    /**
     * @return labelFilters
     */
    public java.util.Map<String, String> getLabelFilters() {
        return this.labelFilters;
    }

    /**
     * @return labelFiltersType
     */
    public String getLabelFiltersType() {
        return this.labelFiltersType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sinkList
     */
    public java.util.List<SinkList> getSinkList() {
        return this.sinkList;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<UpdateDeliveryTaskRequest, Builder> {
        private String taskId; 
        private String dataSourceId; 
        private java.util.Map<String, String> externalLabels; 
        private java.util.Map<String, String> labelFilters; 
        private String labelFiltersType; 
        private String resourceGroupId; 
        private java.util.List<SinkList> sinkList; 
        private String status; 
        private String taskDescription; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeliveryTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.dataSourceId = request.dataSourceId;
            this.externalLabels = request.externalLabels;
            this.labelFilters = request.labelFilters;
            this.labelFiltersType = request.labelFiltersType;
            this.resourceGroupId = request.resourceGroupId;
            this.sinkList = request.sinkList;
            this.status = request.status;
            this.taskDescription = request.taskDescription;
            this.taskName = request.taskName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6afe16bece7996a3</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * dataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * externalLabels.
         */
        public Builder externalLabels(java.util.Map<String, String> externalLabels) {
            this.putBodyParameter("externalLabels", externalLabels);
            this.externalLabels = externalLabels;
            return this;
        }

        /**
         * labelFilters.
         */
        public Builder labelFilters(java.util.Map<String, String> labelFilters) {
            this.putBodyParameter("labelFilters", labelFilters);
            this.labelFilters = labelFilters;
            return this;
        }

        /**
         * labelFiltersType.
         */
        public Builder labelFiltersType(String labelFiltersType) {
            this.putBodyParameter("labelFiltersType", labelFiltersType);
            this.labelFiltersType = labelFiltersType;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * sinkList.
         */
        public Builder sinkList(java.util.List<SinkList> sinkList) {
            this.putBodyParameter("sinkList", sinkList);
            this.sinkList = sinkList;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * taskDescription.
         */
        public Builder taskDescription(String taskDescription) {
            this.putBodyParameter("taskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public UpdateDeliveryTaskRequest build() {
            return new UpdateDeliveryTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateDeliveryTaskRequest</p>
     */
    public static class SinkList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sinkConfigs")
        private java.util.Map<String, String> sinkConfigs;

        @com.aliyun.core.annotation.NameInMap("sinkType")
        private String sinkType;

        private SinkList(Builder builder) {
            this.sinkConfigs = builder.sinkConfigs;
            this.sinkType = builder.sinkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkList create() {
            return builder().build();
        }

        /**
         * @return sinkConfigs
         */
        public java.util.Map<String, String> getSinkConfigs() {
            return this.sinkConfigs;
        }

        /**
         * @return sinkType
         */
        public String getSinkType() {
            return this.sinkType;
        }

        public static final class Builder {
            private java.util.Map<String, String> sinkConfigs; 
            private String sinkType; 

            private Builder() {
            } 

            private Builder(SinkList model) {
                this.sinkConfigs = model.sinkConfigs;
                this.sinkType = model.sinkType;
            } 

            /**
             * sinkConfigs.
             */
            public Builder sinkConfigs(java.util.Map<String, String> sinkConfigs) {
                this.sinkConfigs = sinkConfigs;
                return this;
            }

            /**
             * sinkType.
             */
            public Builder sinkType(String sinkType) {
                this.sinkType = sinkType;
                return this;
            }

            public SinkList build() {
                return new SinkList(this);
            } 

        } 

    }
}
