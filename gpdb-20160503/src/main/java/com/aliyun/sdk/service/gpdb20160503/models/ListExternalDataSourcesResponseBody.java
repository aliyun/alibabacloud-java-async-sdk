// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExternalDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExternalDataSourcesResponseBody</p>
 */
public class ListExternalDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListExternalDataSourcesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExternalDataSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
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
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The Hadoop external table services.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListExternalDataSourcesResponseBody build() {
            return new ListExternalDataSourcesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
        private String dataSourceDescription;

        @com.aliyun.core.annotation.NameInMap("DataSourceDir")
        private String dataSourceDir;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Integer dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceStatus")
        private String dataSourceStatus;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("ExternalDataServiceId")
        private Integer externalDataServiceId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        private Items(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSourceDescription = builder.dataSourceDescription;
            this.dataSourceDir = builder.dataSourceDir;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.dataSourceStatus = builder.dataSourceStatus;
            this.dataSourceType = builder.dataSourceType;
            this.externalDataServiceId = builder.externalDataServiceId;
            this.modifyTime = builder.modifyTime;
            this.statusMessage = builder.statusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSourceDescription
         */
        public String getDataSourceDescription() {
            return this.dataSourceDescription;
        }

        /**
         * @return dataSourceDir
         */
        public String getDataSourceDir() {
            return this.dataSourceDir;
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
         * @return dataSourceStatus
         */
        public String getDataSourceStatus() {
            return this.dataSourceStatus;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return externalDataServiceId
         */
        public Integer getExternalDataServiceId() {
            return this.externalDataServiceId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public static final class Builder {
            private String createTime; 
            private String dataSourceDescription; 
            private String dataSourceDir; 
            private Integer dataSourceId; 
            private String dataSourceName; 
            private String dataSourceStatus; 
            private String dataSourceType; 
            private Integer externalDataServiceId; 
            private String modifyTime; 
            private String statusMessage; 

            /**
             * The time when the service was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the data source.
             */
            public Builder dataSourceDescription(String dataSourceDescription) {
                this.dataSourceDescription = dataSourceDescription;
                return this;
            }

            /**
             * The service directory in which Hadoop-related configuration files are stored.
             */
            public Builder dataSourceDir(String dataSourceDir) {
                this.dataSourceDir = dataSourceDir;
                return this;
            }

            /**
             * The service ID.
             */
            public Builder dataSourceId(Integer dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * The status of the service. Valid values:
             * <p>
             * 
             * *   init
             * *   running
             * *   exception
             */
            public Builder dataSourceStatus(String dataSourceStatus) {
                this.dataSourceStatus = dataSourceStatus;
                return this;
            }

            /**
             * The type of the data source.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * ExternalDataServiceId.
             */
            public Builder externalDataServiceId(Integer externalDataServiceId) {
                this.externalDataServiceId = externalDataServiceId;
                return this;
            }

            /**
             * The time when the service was last modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The information about the service status. For example, if the service is in the exception state, the cause of the exception is displayed. If the service is in the running state, this parameter is left empty.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
