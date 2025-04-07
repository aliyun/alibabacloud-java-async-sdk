// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link QueryDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceListResponseBody</p>
 */
public class QueryDeviceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceList")
    private java.util.List<DeviceList> deviceList;

    @com.aliyun.core.annotation.NameInMap("EncodeKey")
    private String encodeKey;

    @com.aliyun.core.annotation.NameInMap("EncodeType")
    private String encodeType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDeviceListResponseBody(Builder builder) {
        this.deviceList = builder.deviceList;
        this.encodeKey = builder.encodeKey;
        this.encodeType = builder.encodeType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceList
     */
    public java.util.List<DeviceList> getDeviceList() {
        return this.deviceList;
    }

    /**
     * @return encodeKey
     */
    public String getEncodeKey() {
        return this.encodeKey;
    }

    /**
     * @return encodeType
     */
    public String getEncodeType() {
        return this.encodeType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DeviceList> deviceList; 
        private String encodeKey; 
        private String encodeType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryDeviceListResponseBody model) {
            this.deviceList = model.deviceList;
            this.encodeKey = model.encodeKey;
            this.encodeType = model.encodeType;
            this.requestId = model.requestId;
        } 

        /**
         * DeviceList.
         */
        public Builder deviceList(java.util.List<DeviceList> deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        /**
         * EncodeKey.
         */
        public Builder encodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }

        /**
         * EncodeType.
         */
        public Builder encodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDeviceListResponseBody build() {
            return new QueryDeviceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceListResponseBody</p>
     */
    public static class DeviceUnionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("UnionId")
        private String unionId;

        private DeviceUnionIds(Builder builder) {
            this.organizationId = builder.organizationId;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceUnionIds create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String organizationId; 
            private String unionId; 

            private Builder() {
            } 

            private Builder(DeviceUnionIds model) {
                this.organizationId = model.organizationId;
                this.unionId = model.unionId;
            } 

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * UnionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public DeviceUnionIds build() {
                return new DeviceUnionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceListResponseBody</p>
     */
    public static class DeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceIconUrl")
        private String deviceIconUrl;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceOpenId")
        private String deviceOpenId;

        @com.aliyun.core.annotation.NameInMap("DeviceUnionIds")
        private java.util.List<DeviceUnionIds> deviceUnionIds;

        @com.aliyun.core.annotation.NameInMap("Online")
        private String online;

        private DeviceList(Builder builder) {
            this.deviceIconUrl = builder.deviceIconUrl;
            this.deviceName = builder.deviceName;
            this.deviceOpenId = builder.deviceOpenId;
            this.deviceUnionIds = builder.deviceUnionIds;
            this.online = builder.online;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return deviceIconUrl
         */
        public String getDeviceIconUrl() {
            return this.deviceIconUrl;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceOpenId
         */
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        /**
         * @return deviceUnionIds
         */
        public java.util.List<DeviceUnionIds> getDeviceUnionIds() {
            return this.deviceUnionIds;
        }

        /**
         * @return online
         */
        public String getOnline() {
            return this.online;
        }

        public static final class Builder {
            private String deviceIconUrl; 
            private String deviceName; 
            private String deviceOpenId; 
            private java.util.List<DeviceUnionIds> deviceUnionIds; 
            private String online; 

            private Builder() {
            } 

            private Builder(DeviceList model) {
                this.deviceIconUrl = model.deviceIconUrl;
                this.deviceName = model.deviceName;
                this.deviceOpenId = model.deviceOpenId;
                this.deviceUnionIds = model.deviceUnionIds;
                this.online = model.online;
            } 

            /**
             * DeviceIconUrl.
             */
            public Builder deviceIconUrl(String deviceIconUrl) {
                this.deviceIconUrl = deviceIconUrl;
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
             * DeviceOpenId.
             */
            public Builder deviceOpenId(String deviceOpenId) {
                this.deviceOpenId = deviceOpenId;
                return this;
            }

            /**
             * DeviceUnionIds.
             */
            public Builder deviceUnionIds(java.util.List<DeviceUnionIds> deviceUnionIds) {
                this.deviceUnionIds = deviceUnionIds;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(String online) {
                this.online = online;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
}
