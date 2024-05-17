// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStreamingDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStreamingDataSourcesResponseBody</p>
 */
public class ListStreamingDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceItems")
    private java.util.List < DataSourceItems> dataSourceItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListStreamingDataSourcesResponseBody(Builder builder) {
        this.dataSourceItems = builder.dataSourceItems;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStreamingDataSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSourceItems
     */
    public java.util.List < DataSourceItems> getDataSourceItems() {
        return this.dataSourceItems;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < DataSourceItems> dataSourceItems; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * DataSourceItems.
         */
        public Builder dataSourceItems(java.util.List < DataSourceItems> dataSourceItems) {
            this.dataSourceItems = dataSourceItems;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListStreamingDataSourcesResponseBody build() {
            return new ListStreamingDataSourcesResponseBody(this);
        } 

    } 

    public static class DataSourceItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceConfig")
        private String dataSourceConfig;

        @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
        private String dataSourceDescription;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Integer dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Integer serviceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataSourceItems(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSourceConfig = builder.dataSourceConfig;
            this.dataSourceDescription = builder.dataSourceDescription;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.dataSourceType = builder.dataSourceType;
            this.errorMessage = builder.errorMessage;
            this.modifyTime = builder.modifyTime;
            this.serviceId = builder.serviceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceItems create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSourceConfig
         */
        public String getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        /**
         * @return dataSourceDescription
         */
        public String getDataSourceDescription() {
            return this.dataSourceDescription;
        }

        /**
         * @return dataSourceId
         */
        public Integer getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return serviceId
         */
        public Integer getServiceId() {
            return this.serviceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String dataSourceConfig; 
            private String dataSourceDescription; 
            private Integer dataSourceId; 
            private String dataSourceName; 
            private String dataSourceType; 
            private String errorMessage; 
            private String modifyTime; 
            private Integer serviceId; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataSourceConfig.
             */
            public Builder dataSourceConfig(String dataSourceConfig) {
                this.dataSourceConfig = dataSourceConfig;
                return this;
            }

            /**
             * DataSourceDescription.
             */
            public Builder dataSourceDescription(String dataSourceDescription) {
                this.dataSourceDescription = dataSourceDescription;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(Integer dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * DataSourceType.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(Integer serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSourceItems build() {
                return new DataSourceItems(this);
            } 

        } 

    }
}
