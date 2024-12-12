// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The Hadoop external table services.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BBE00C04-A3E8-4114-881D-0480A72CB92E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListExternalDataSourcesResponseBody build() {
            return new ListExternalDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExternalDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExternalDataSourcesResponseBody</p>
     */
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
             * <p>The time when the service was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dataSourceDescription(String dataSourceDescription) {
                this.dataSourceDescription = dataSourceDescription;
                return this;
            }

            /**
             * <p>The service directory in which Hadoop-related configuration files are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>HadoopDir</p>
             */
            public Builder dataSourceDir(String dataSourceDir) {
                this.dataSourceDir = dataSourceDir;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder dataSourceId(Integer dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>hdfs_pxf</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The status of the service. Valid values:</p>
             * <ul>
             * <li>init</li>
             * <li>running</li>
             * <li>exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder dataSourceStatus(String dataSourceStatus) {
                this.dataSourceStatus = dataSourceStatus;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>HDFS</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>The Id of external data service</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder externalDataServiceId(Integer externalDataServiceId) {
                this.externalDataServiceId = externalDataServiceId;
                return this;
            }

            /**
             * <p>The time when the service was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-08T16:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The information about the service status. For example, if the service is in the exception state, the cause of the exception is displayed. If the service is in the running state, this parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
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
