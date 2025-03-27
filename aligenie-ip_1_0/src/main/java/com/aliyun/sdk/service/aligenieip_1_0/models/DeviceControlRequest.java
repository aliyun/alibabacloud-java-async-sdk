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
 * {@link DeviceControlRequest} extends {@link RequestModel}
 *
 * <p>DeviceControlRequest</p>
 */
public class DeviceControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private DeviceControlRequest(Builder builder) {
        super(builder);
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceControlRequest create() {
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

    public static final class Builder extends Request.Builder<DeviceControlRequest, Builder> {
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(DeviceControlRequest request) {
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
        public DeviceControlRequest build() {
            return new DeviceControlRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeviceControlRequest} extends {@link TeaModel}
     *
     * <p>DeviceControlRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("Cmd")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("DeviceNumber")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceNumber;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("Location")
        @com.aliyun.core.annotation.Validation(required = true)
        private String location;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, String> properties;

        private Payload(Builder builder) {
            this.category = builder.category;
            this.cmd = builder.cmd;
            this.deviceNumber = builder.deviceNumber;
            this.extendInfo = builder.extendInfo;
            this.location = builder.location;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
        }

        /**
         * @return deviceNumber
         */
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, String> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String category; 
            private String cmd; 
            private String deviceNumber; 
            private String extendInfo; 
            private String location; 
            private java.util.Map<String, String> properties; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.category = model.category;
                this.cmd = model.cmd;
                this.deviceNumber = model.deviceNumber;
                this.extendInfo = model.extendInfo;
                this.location = model.location;
                this.properties = model.properties;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>aircondition</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>open</p>
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>air_condition</p>
             */
            public Builder deviceNumber(String deviceNumber) {
                this.deviceNumber = deviceNumber;
                return this;
            }

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>room</p>
             */
            public Builder location(String location) {
                this.location = location;
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
     * {@link DeviceControlRequest} extends {@link TeaModel}
     *
     * <p>DeviceControlRequest</p>
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
             * <p>HOFF****my7Iw=</p>
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
