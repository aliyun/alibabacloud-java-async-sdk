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
 * {@link QueryDynamicGroupDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDynamicGroupDevicesResponseBody</p>
 */
public class QueryDynamicGroupDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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

        private Builder() {
        } 

        private Builder(QueryDynamicGroupDevicesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.nextToken = model.nextToken;
            this.page = model.page;
            this.pageCount = model.pageCount;
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
         * <p>The devices returned after the request succeeds. The information is included in the <strong>SimpleDeviceInfo</strong> field.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>A system exception occurred.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <p>If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291***</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
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
         * <p>The total number of devices.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryDynamicGroupDevicesResponseBody build() {
            return new QueryDynamicGroupDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDynamicGroupDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDynamicGroupDevicesResponseBody</p>
     */
    public static class SimpleDeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveTime")
        private String activeTime;

        @com.aliyun.core.annotation.NameInMap("CategoryKey")
        private String categoryKey;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("LastOnlineTime")
        private String lastOnlineTime;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UtcActiveTime")
        private String utcActiveTime;

        @com.aliyun.core.annotation.NameInMap("UtcLastOnlineTime")
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

            private Builder() {
            } 

            private Builder(SimpleDeviceInfo model) {
                this.activeTime = model.activeTime;
                this.categoryKey = model.categoryKey;
                this.deviceName = model.deviceName;
                this.iotId = model.iotId;
                this.lastOnlineTime = model.lastOnlineTime;
                this.nickname = model.nickname;
                this.nodeType = model.nodeType;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.status = model.status;
                this.utcActiveTime = model.utcActiveTime;
                this.utcLastOnlineTime = model.utcLastOnlineTime;
            } 

            /**
             * <p>The time when the device was activated.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06 10:48:41</p>
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * <p>The identifier of the category to which the product belongs.</p>
             * <p>This parameter is returned if the product uses the Thing Specification Language (TSL) model of a standard category that is pre-defined by IoT Platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Lighting</p>
             */
            public Builder categoryKey(String categoryKey) {
                this.categoryKey = categoryKey;
                return this;
            }

            /**
             * <p>The DeviceName of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>Q7uOhVRdZRRlDnTLv****00100</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The last time when the device went online.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06 13:43:12</p>
             */
            public Builder lastOnlineTime(String lastOnlineTime) {
                this.lastOnlineTime = lastOnlineTime;
                return this;
            }

            /**
             * <p>The alias of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>detectors_in_beijing</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>The node type of the product. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: device. A device can connect to IoT Platform directly, or be attached to a gateway as a sub-device and then connect to IoT Platform. Sub-devices cannot be attached to a device.</li>
             * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1rYuVF***</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The ProductName of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The device status. Valid values:</p>
             * <ul>
             * <li><strong>ONLINE</strong>: The device is online.</li>
             * <li><strong>OFFLINE</strong>: The device is offline.</li>
             * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
             * <li><strong>DISABLE</strong>: The device is deactivated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the device was activated. The time is in the UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06T02:48:41.000Z</p>
             */
            public Builder utcActiveTime(String utcActiveTime) {
                this.utcActiveTime = utcActiveTime;
                return this;
            }

            /**
             * <p>The last time when the device went online. The time is in the UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-06T05:43:12.000Z</p>
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
    /**
     * 
     * {@link QueryDynamicGroupDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDynamicGroupDevicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SimpleDeviceInfo")
        private java.util.List<SimpleDeviceInfo> simpleDeviceInfo;

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
        public java.util.List<SimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

        public static final class Builder {
            private java.util.List<SimpleDeviceInfo> simpleDeviceInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.simpleDeviceInfo = model.simpleDeviceInfo;
            } 

            /**
             * SimpleDeviceInfo.
             */
            public Builder simpleDeviceInfo(java.util.List<SimpleDeviceInfo> simpleDeviceInfo) {
                this.simpleDeviceInfo = simpleDeviceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
