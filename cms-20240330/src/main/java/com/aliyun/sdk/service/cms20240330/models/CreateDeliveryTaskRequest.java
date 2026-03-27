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
 * {@link CreateDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDeliveryTaskRequest</p>
 */
public class CreateDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SinkList> sinkList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDescription")
    private String taskDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private CreateDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.externalLabels = builder.externalLabels;
        this.labelFilters = builder.labelFilters;
        this.labelFiltersType = builder.labelFiltersType;
        this.resourceGroupId = builder.resourceGroupId;
        this.sinkList = builder.sinkList;
        this.tags = builder.tags;
        this.taskDescription = builder.taskDescription;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeliveryTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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

    public static final class Builder extends Request.Builder<CreateDeliveryTaskRequest, Builder> {
        private String dataSourceId; 
        private java.util.Map<String, String> externalLabels; 
        private java.util.Map<String, String> labelFilters; 
        private String labelFiltersType; 
        private String resourceGroupId; 
        private java.util.List<SinkList> sinkList; 
        private java.util.List<Tags> tags; 
        private String taskDescription; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeliveryTaskRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.externalLabels = request.externalLabels;
            this.labelFilters = request.labelFilters;
            this.labelFiltersType = request.labelFiltersType;
            this.resourceGroupId = request.resourceGroupId;
            this.sinkList = request.sinkList;
            this.tags = request.tags;
            this.taskDescription = request.taskDescription;
            this.taskName = request.taskName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxxxxx</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder sinkList(java.util.List<SinkList> sinkList) {
            this.putBodyParameter("sinkList", sinkList);
            this.sinkList = sinkList;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-task</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateDeliveryTaskRequest build() {
            return new CreateDeliveryTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDeliveryTaskRequest</p>
     */
    public static class SinkList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sinkConfigs")
        private java.util.Map<String, String> sinkConfigs;

        @com.aliyun.core.annotation.NameInMap("sinkType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Prometheus</p>
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
    /**
     * 
     * {@link CreateDeliveryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDeliveryTaskRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
