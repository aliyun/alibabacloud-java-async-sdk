// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListDataSourceItemResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceItemResponseBody</p>
 */
public class ListDataSourceItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataSourceItems")
    private DataSourceItems dataSourceItems;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListDataSourceItemResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataSourceItems = builder.dataSourceItems;
        this.errorMessage = builder.errorMessage;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataSourceItems
     */
    public DataSourceItems getDataSourceItems() {
        return this.dataSourceItems;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private DataSourceItems dataSourceItems; 
        private String errorMessage; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListDataSourceItemResponseBody model) {
            this.code = model.code;
            this.dataSourceItems = model.dataSourceItems;
            this.errorMessage = model.errorMessage;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the topics that are returned.</p>
         */
        public Builder dataSourceItems(DataSourceItems dataSourceItems) {
            this.dataSourceItems = dataSourceItems;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDataSourceItemResponseBody build() {
            return new ListDataSourceItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceItemResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceItemResponseBody</p>
     */
    public static class DataSourceItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceItemId")
        private Long dataSourceItemId;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private DataSourceItem(Builder builder) {
            this.dataSourceItemId = builder.dataSourceItemId;
            this.deviceName = builder.deviceName;
            this.productKey = builder.productKey;
            this.scopeType = builder.scopeType;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceItem create() {
            return builder().build();
        }

        /**
         * @return dataSourceItemId
         */
        public Long getDataSourceItemId() {
            return this.dataSourceItemId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Long dataSourceItemId; 
            private String deviceName; 
            private String productKey; 
            private String scopeType; 
            private String topic; 

            private Builder() {
            } 

            private Builder(DataSourceItem model) {
                this.dataSourceItemId = model.dataSourceItemId;
                this.deviceName = model.deviceName;
                this.productKey = model.productKey;
                this.scopeType = model.scopeType;
                this.topic = model.topic;
            } 

            /**
             * <p>The ID of the topic of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>129322</p>
             */
            public Builder dataSourceItemId(Long dataSourceItemId) {
                this.dataSourceItemId = dataSourceItemId;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * ScopeType.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * <p>The name of the topic of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>/gyh***z/+/thing/event/property/post</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public DataSourceItem build() {
                return new DataSourceItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourceItemResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceItemResponseBody</p>
     */
    public static class DataSourceItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataSourceItem")
        private java.util.List<DataSourceItem> dataSourceItem;

        private DataSourceItems(Builder builder) {
            this.dataSourceItem = builder.dataSourceItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceItems create() {
            return builder().build();
        }

        /**
         * @return dataSourceItem
         */
        public java.util.List<DataSourceItem> getDataSourceItem() {
            return this.dataSourceItem;
        }

        public static final class Builder {
            private java.util.List<DataSourceItem> dataSourceItem; 

            private Builder() {
            } 

            private Builder(DataSourceItems model) {
                this.dataSourceItem = model.dataSourceItem;
            } 

            /**
             * dataSourceItem.
             */
            public Builder dataSourceItem(java.util.List<DataSourceItem> dataSourceItem) {
                this.dataSourceItem = dataSourceItem;
                return this;
            }

            public DataSourceItems build() {
                return new DataSourceItems(this);
            } 

        } 

    }
}
