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
 * {@link GetHotelContactByGenieDeviceRequest} extends {@link RequestModel}
 *
 * <p>GetHotelContactByGenieDeviceRequest</p>
 */
public class GetHotelContactByGenieDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private GetHotelContactByGenieDeviceRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelContactByGenieDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<GetHotelContactByGenieDeviceRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(GetHotelContactByGenieDeviceRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.userInfo = request.userInfo;
        } 

        /**
         * DeviceInfo.
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putQueryParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
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
        public GetHotelContactByGenieDeviceRequest build() {
            return new GetHotelContactByGenieDeviceRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetHotelContactByGenieDeviceRequest} extends {@link TeaModel}
     *
     * <p>GetHotelContactByGenieDeviceRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
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

        private DeviceInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
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

            private Builder(DeviceInfo model) {
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
             * <p>12**45</p>
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

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotelContactByGenieDeviceRequest} extends {@link TeaModel}
     *
     * <p>GetHotelContactByGenieDeviceRequest</p>
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
             * <p>12**45</p>
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
