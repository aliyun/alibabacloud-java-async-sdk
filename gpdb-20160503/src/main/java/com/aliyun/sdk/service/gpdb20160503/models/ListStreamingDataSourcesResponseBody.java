// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListStreamingDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStreamingDataSourcesResponseBody</p>
 */
public class ListStreamingDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceItems")
    private java.util.List<DataSourceItems> dataSourceItems;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceItems
     */
    public java.util.List<DataSourceItems> getDataSourceItems() {
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
        private java.util.List<DataSourceItems> dataSourceItems; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListStreamingDataSourcesResponseBody model) {
            this.dataSourceItems = model.dataSourceItems;
            this.pageNumber = model.pageNumber;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The queried data sources.</p>
         */
        public Builder dataSourceItems(java.util.List<DataSourceItems> dataSourceItems) {
            this.dataSourceItems = dataSourceItems;
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
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
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

        public ListStreamingDataSourcesResponseBody build() {
            return new ListStreamingDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStreamingDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListStreamingDataSourcesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DataSourceItems model) {
                this.createTime = model.createTime;
                this.dataSourceConfig = model.dataSourceConfig;
                this.dataSourceDescription = model.dataSourceDescription;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceName = model.dataSourceName;
                this.dataSourceType = model.dataSourceType;
                this.errorMessage = model.errorMessage;
                this.modifyTime = model.modifyTime;
                this.serviceId = model.serviceId;
                this.status = model.status;
            } 

            /**
             * <p>The time when the data source was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The configurations of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;brokers&quot;:&quot;broker0:9091,broker1:9091&quot;,&quot;topic&quot;:&quot;topic&quot;}</p>
             */
            public Builder dataSourceConfig(String dataSourceConfig) {
                this.dataSourceConfig = dataSourceConfig;
                return this;
            }

            /**
             * <p>The description of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test-kafka</p>
             */
            public Builder dataSourceDescription(String dataSourceDescription) {
                this.dataSourceDescription = dataSourceDescription;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataSourceId(Integer dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test-kafka</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>kafka</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kafka</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>The information about the service status. For example, if the service is in the exception state, the cause of the exception is displayed. If the service is in the running state, this parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The time when the data source was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T17:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceId(Integer serviceId) {
                this.serviceId = serviceId;
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
             * <p>running</p>
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
