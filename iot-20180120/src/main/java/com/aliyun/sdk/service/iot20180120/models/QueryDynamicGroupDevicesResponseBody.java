// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDynamicGroupDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDynamicGroupDevicesResponseBody</p>
 */
public class QueryDynamicGroupDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Page")
    private Integer page;

    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private QueryDynamicGroupDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDynamicGroupDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
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
        private Data data; 
        private String errorMessage; 
        private String nextToken; 
        private Integer page; 
        private Integer pageCount; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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

        public QueryDynamicGroupDevicesResponseBody build() {
            return new QueryDynamicGroupDevicesResponseBody(this);
        } 

    } 

    public static class SimpleDeviceInfo extends TeaModel {
        @NameInMap("ActiveTime")
        private String activeTime;

        @NameInMap("CategoryKey")
        private String categoryKey;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("LastOnlineTime")
        private String lastOnlineTime;

        @NameInMap("Nickname")
        private String nickname;

        @NameInMap("NodeType")
        private Integer nodeType;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("Status")
        private String status;

        @NameInMap("UtcActiveTime")
        private String utcActiveTime;

        @NameInMap("UtcLastOnlineTime")
        private String utcLastOnlineTime;

        private SimpleDeviceInfo(Builder builder) {
            this.activeTime = builder.activeTime;
            this.categoryKey = builder.categoryKey;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.lastOnlineTime = builder.lastOnlineTime;
            this.nickname = builder.nickname;
            this.nodeType = builder.nodeType;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.status = builder.status;
            this.utcActiveTime = builder.utcActiveTime;
            this.utcLastOnlineTime = builder.utcLastOnlineTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public String getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return categoryKey
         */
        public String getCategoryKey() {
            return this.categoryKey;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return lastOnlineTime
         */
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return nodeType
         */
        public Integer getNodeType() {
            return this.nodeType;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return utcActiveTime
         */
        public String getUtcActiveTime() {
            return this.utcActiveTime;
        }

        /**
         * @return utcLastOnlineTime
         */
        public String getUtcLastOnlineTime() {
            return this.utcLastOnlineTime;
        }

        public static final class Builder {
            private String activeTime; 
            private String categoryKey; 
            private String deviceName; 
            private String iotId; 
            private String lastOnlineTime; 
            private String nickname; 
            private Integer nodeType; 
            private String productKey; 
            private String productName; 
            private String status; 
            private String utcActiveTime; 
            private String utcLastOnlineTime; 

            /**
             * ActiveTime.
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * CategoryKey.
             */
            public Builder categoryKey(String categoryKey) {
                this.categoryKey = categoryKey;
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
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * LastOnlineTime.
             */
            public Builder lastOnlineTime(String lastOnlineTime) {
                this.lastOnlineTime = lastOnlineTime;
                return this;
            }

            /**
             * Nickname.
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
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
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UtcActiveTime.
             */
            public Builder utcActiveTime(String utcActiveTime) {
                this.utcActiveTime = utcActiveTime;
                return this;
            }

            /**
             * UtcLastOnlineTime.
             */
            public Builder utcLastOnlineTime(String utcLastOnlineTime) {
                this.utcLastOnlineTime = utcLastOnlineTime;
                return this;
            }

            public SimpleDeviceInfo build() {
                return new SimpleDeviceInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        private java.util.List < SimpleDeviceInfo> simpleDeviceInfo;

        private Data(Builder builder) {
            this.simpleDeviceInfo = builder.simpleDeviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return simpleDeviceInfo
         */
        public java.util.List < SimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

        public static final class Builder {
            private java.util.List < SimpleDeviceInfo> simpleDeviceInfo; 

            /**
             * SimpleDeviceInfo.
             */
            public Builder simpleDeviceInfo(java.util.List < SimpleDeviceInfo> simpleDeviceInfo) {
                this.simpleDeviceInfo = simpleDeviceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
