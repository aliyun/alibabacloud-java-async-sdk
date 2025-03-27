// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link QueryDeviceStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceStatusRequest</p>
 */
public class QueryDeviceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private QueryDeviceStatusRequest(Builder builder) {
        super(builder);
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<QueryDeviceStatusRequest, Builder> {
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceStatusRequest request) {
            super(request);
            this.payload = request.payload;
            this.userInfo = request.userInfo;
        } 

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * UserInfo.
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public QueryDeviceStatusRequest build() {
            return new QueryDeviceStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceStatusRequest} extends {@link TeaModel}
     *
     * <p>QueryDeviceStatusRequest</p>
     */
    public static class LocationDevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceNumber")
        private String deviceNumber;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        private LocationDevices(Builder builder) {
            this.deviceNumber = builder.deviceNumber;
            this.deviceType = builder.deviceType;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocationDevices create() {
            return builder().build();
        }

        /**
         * @return deviceNumber
         */
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String deviceNumber; 
            private String deviceType; 
            private String location; 

            private Builder() {
            } 

            private Builder(LocationDevices model) {
                this.deviceNumber = model.deviceNumber;
                this.deviceType = model.deviceType;
                this.location = model.location;
            } 

            /**
             * DeviceNumber.
             */
            public Builder deviceNumber(String deviceNumber) {
                this.deviceNumber = deviceNumber;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            public LocationDevices build() {
                return new LocationDevices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceStatusRequest} extends {@link TeaModel}
     *
     * <p>QueryDeviceStatusRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocationDevices")
        private java.util.List<LocationDevices> locationDevices;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, String> properties;

        private Payload(Builder builder) {
            this.locationDevices = builder.locationDevices;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return locationDevices
         */
        public java.util.List<LocationDevices> getLocationDevices() {
            return this.locationDevices;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, String> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private java.util.List<LocationDevices> locationDevices; 
            private java.util.Map<String, String> properties; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.locationDevices = model.locationDevices;
                this.properties = model.properties;
            } 

            /**
             * LocationDevices.
             */
            public Builder locationDevices(java.util.List<LocationDevices> locationDevices) {
                this.locationDevices = locationDevices;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map<String, String> properties) {
                this.properties = properties;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceStatusRequest} extends {@link TeaModel}
     *
     * <p>QueryDeviceStatusRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private UserInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HOTEL</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rV/XSgPuxZjx/hN3iw8U+e8ou***lk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
