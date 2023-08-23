// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeviceControlRequest} extends {@link RequestModel}
 *
 * <p>DeviceControlRequest</p>
 */
public class DeviceControlRequest extends Request {
    @Query
    @NameInMap("Payload")
    private Payload payload;

    @Query
    @NameInMap("UserInfo")
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

    public static class Payload extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        private String category;

        @NameInMap("Cmd")
        @Validation(required = true)
        private String cmd;

        @NameInMap("DeviceNumber")
        @Validation(required = true)
        private String deviceNumber;

        @NameInMap("ExtendInfo")
        private String extendInfo;

        @NameInMap("Location")
        @Validation(required = true)
        private String location;

        @NameInMap("Properties")
        private java.util.Map < String, String > properties;

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
        public java.util.Map < String, String > getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String category; 
            private String cmd; 
            private String deviceNumber; 
            private String extendInfo; 
            private String location; 
            private java.util.Map < String, String > properties; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Cmd.
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * DeviceNumber.
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
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map < String, String > properties) {
                this.properties = properties;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    public static class UserInfo extends TeaModel {
        @NameInMap("EncodeKey")
        @Validation(required = true)
        private String encodeKey;

        @NameInMap("EncodeType")
        @Validation(required = true)
        private String encodeType;

        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        @NameInMap("IdType")
        @Validation(required = true)
        private String idType;

        @NameInMap("OrganizationId")
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
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
