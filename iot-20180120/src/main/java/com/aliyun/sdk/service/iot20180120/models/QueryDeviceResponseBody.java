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
 * {@link QueryDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceResponseBody</p>
 */
public class QueryDeviceResponseBody extends TeaModel {
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

    private QueryDeviceResponseBody(Builder builder) {
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

    public static QueryDeviceResponseBody create() {
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

        private Builder(QueryDeviceResponseBody model) {
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
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The device information returned if the call is successful. The details of the devices are included in the <strong>DeviceInfo</strong> parameter.</p>
         * <blockquote>
         * <p> The returned device information is sorted in reverse chronological order based on the time when the devices were created.</p>
         * </blockquote>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the subsequent page of the query results. You can specify this parameter in the subsequent query to obtain the next page of results.</p>
         * <p>If the <strong>NextToken</strong> parameter is empty, no subsequent page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm***</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>1</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
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
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryDeviceResponseBody build() {
            return new QueryDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceResponseBody</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private String deviceStatus;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        private DeviceInfo(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.deviceStatus = builder.deviceStatus;
            this.deviceType = builder.deviceType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.iotId = builder.iotId;
            this.nickname = builder.nickname;
            this.productKey = builder.productKey;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSecret
         */
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        /**
         * @return deviceStatus
         */
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceName; 
            private String deviceSecret; 
            private String deviceStatus; 
            private String deviceType; 
            private String gmtCreate; 
            private String gmtModified; 
            private String iotId; 
            private String nickname; 
            private String productKey; 
            private String utcCreate; 
            private String utcModified; 

            private Builder() {
            } 

            private Builder(DeviceInfo model) {
                this.deviceId = model.deviceId;
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.deviceStatus = model.deviceStatus;
                this.deviceType = model.deviceType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.iotId = model.iotId;
                this.nickname = model.nickname;
                this.productKey = model.productKey;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
            } 

            /**
             * <p>The ID of the device.</p>
             * <blockquote>
             * <p> This parameter is deprecated. Do not use this parameter to identify a device. You can use the <strong>IotId</strong> parameter or a combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters to identify a device.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dwnS41bhNxjslDAI****</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The DeviceSecret of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>sLefbFmN9SYfnWLJTePG893XNuRV****</p>
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * <p>The status of the device. Valid values:</p>
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
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * <p>The category of the product to which the device belongs.</p>
             * <blockquote>
             * <p> This parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Lighting</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The time when the device was created. The time is in the GMT format.</p>
             * 
             * <strong>example:</strong>
             * <p>Wed, 20-Feb-2019 02:16:09 GMT</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the device information was last updated. The time is in the GMT format.</p>
             * 
             * <strong>example:</strong>
             * <p>Wed, 20-Feb-2019 02:16:09 GMT</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * <p>The alias of the device.</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The time when the device was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-20T02:16:09.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The time when the device information was last updated. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-20T02:16:09.000Z</p>
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceInfo")
        private java.util.List<DeviceInfo> deviceInfo;

        private Data(Builder builder) {
            this.deviceInfo = builder.deviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceInfo
         */
        public java.util.List<DeviceInfo> getDeviceInfo() {
            return this.deviceInfo;
        }

        public static final class Builder {
            private java.util.List<DeviceInfo> deviceInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceInfo = model.deviceInfo;
            } 

            /**
             * DeviceInfo.
             */
            public Builder deviceInfo(java.util.List<DeviceInfo> deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
