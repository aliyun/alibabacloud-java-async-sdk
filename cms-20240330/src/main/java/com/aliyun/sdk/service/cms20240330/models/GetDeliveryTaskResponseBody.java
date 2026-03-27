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
 * {@link GetDeliveryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeliveryTaskResponseBody</p>
 */
public class GetDeliveryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deliveryTask")
    private DeliveryTask deliveryTask;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDeliveryTaskResponseBody(Builder builder) {
        this.deliveryTask = builder.deliveryTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeliveryTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryTask
     */
    public DeliveryTask getDeliveryTask() {
        return this.deliveryTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeliveryTask deliveryTask; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDeliveryTaskResponseBody model) {
            this.deliveryTask = model.deliveryTask;
            this.requestId = model.requestId;
        } 

        /**
         * deliveryTask.
         */
        public Builder deliveryTask(DeliveryTask deliveryTask) {
            this.deliveryTask = deliveryTask;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeliveryTaskResponseBody build() {
            return new GetDeliveryTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeliveryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeliveryTaskResponseBody</p>
     */
    public static class ExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("taskNameList")
        private java.util.List<String> taskNameList;

        private ExtraInfo(Builder builder) {
            this.taskNameList = builder.taskNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return taskNameList
         */
        public java.util.List<String> getTaskNameList() {
            return this.taskNameList;
        }

        public static final class Builder {
            private java.util.List<String> taskNameList; 

            private Builder() {
            } 

            private Builder(ExtraInfo model) {
                this.taskNameList = model.taskNameList;
            } 

            /**
             * taskNameList.
             */
            public Builder taskNameList(java.util.List<String> taskNameList) {
                this.taskNameList = taskNameList;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeliveryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeliveryTaskResponseBody</p>
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
    /**
     * 
     * {@link GetDeliveryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeliveryTaskResponseBody</p>
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
    /**
     * 
     * {@link GetDeliveryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeliveryTaskResponseBody</p>
     */
    public static class DeliveryTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("externalLabels")
        private java.util.Map<String, String> externalLabels;

        @com.aliyun.core.annotation.NameInMap("extraInfo")
        private ExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("labelFilters")
        private java.util.Map<String, String> labelFilters;

        @com.aliyun.core.annotation.NameInMap("labelFiltersType")
        private String labelFiltersType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("sinkList")
        private java.util.List<SinkList> sinkList;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("taskDescription")
        private String taskDescription;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private DeliveryTask(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSourceId = builder.dataSourceId;
            this.externalLabels = builder.externalLabels;
            this.extraInfo = builder.extraInfo;
            this.labelFilters = builder.labelFilters;
            this.labelFiltersType = builder.labelFiltersType;
            this.regionId = builder.regionId;
            this.sinkList = builder.sinkList;
            this.status = builder.status;
            this.tags = builder.tags;
            this.taskDescription = builder.taskDescription;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryTask create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String dataSourceId; 
            private java.util.Map<String, String> externalLabels; 
            private ExtraInfo extraInfo; 
            private java.util.Map<String, String> labelFilters; 
            private String labelFiltersType; 
            private String regionId; 
            private java.util.List<SinkList> sinkList; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String taskDescription; 
            private String taskId; 
            private String taskName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(DeliveryTask model) {
                this.createTime = model.createTime;
                this.dataSourceId = model.dataSourceId;
                this.externalLabels = model.externalLabels;
                this.extraInfo = model.extraInfo;
                this.labelFilters = model.labelFilters;
                this.labelFiltersType = model.labelFiltersType;
                this.regionId = model.regionId;
                this.sinkList = model.sinkList;
                this.status = model.status;
                this.tags = model.tags;
                this.taskDescription = model.taskDescription;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-24T02:08:27Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * externalLabels.
             */
            public Builder externalLabels(java.util.Map<String, String> externalLabels) {
                this.externalLabels = externalLabels;
                return this;
            }

            /**
             * extraInfo.
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * labelFilters.
             */
            public Builder labelFilters(java.util.Map<String, String> labelFilters) {
                this.labelFilters = labelFilters;
                return this;
            }

            /**
             * labelFiltersType.
             */
            public Builder labelFiltersType(String labelFiltersType) {
                this.labelFiltersType = labelFiltersType;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * sinkList.
             */
            public Builder sinkList(java.util.List<SinkList> sinkList) {
                this.sinkList = sinkList;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * taskDescription.
             */
            public Builder taskDescription(String taskDescription) {
                this.taskDescription = taskDescription;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-22T11:50:48Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DeliveryTask build() {
                return new DeliveryTask(this);
            } 

        } 

    }
}
