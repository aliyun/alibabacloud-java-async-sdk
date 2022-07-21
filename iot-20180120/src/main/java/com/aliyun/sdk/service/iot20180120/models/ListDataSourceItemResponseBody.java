// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceItemResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceItemResponseBody</p>
 */
public class ListDataSourceItemResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DataSourceItems")
    private DataSourceItems dataSourceItems;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Page")
    private Integer page;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DataSourceItems.
         */
        public Builder dataSourceItems(DataSourceItems dataSourceItems) {
            this.dataSourceItems = dataSourceItems;
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
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDataSourceItemResponseBody build() {
            return new ListDataSourceItemResponseBody(this);
        } 

    } 

    public static class DataSourceItem extends TeaModel {
        @NameInMap("DataSourceItemId")
        private Long dataSourceItemId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ScopeType")
        private String scopeType;

        @NameInMap("Topic")
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

            /**
             * DataSourceItemId.
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
             * Topic.
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
    public static class DataSourceItems extends TeaModel {
        @NameInMap("dataSourceItem")
        private java.util.List < DataSourceItem> dataSourceItem;

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
        public java.util.List < DataSourceItem> getDataSourceItem() {
            return this.dataSourceItem;
        }

        public static final class Builder {
            private java.util.List < DataSourceItem> dataSourceItem; 

            /**
             * dataSourceItem.
             */
            public Builder dataSourceItem(java.util.List < DataSourceItem> dataSourceItem) {
                this.dataSourceItem = dataSourceItem;
                return this;
            }

            public DataSourceItems build() {
                return new DataSourceItems(this);
            } 

        } 

    }
}
