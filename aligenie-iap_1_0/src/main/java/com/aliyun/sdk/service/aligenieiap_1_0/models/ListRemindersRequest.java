// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemindersRequest} extends {@link RequestModel}
 *
 * <p>ListRemindersRequest</p>
 */
public class ListRemindersRequest extends Request {
    @Query
    @NameInMap("DeviceInfo")
    @Validation(required = true)
    private DeviceInfo deviceInfo;

    @Query
    @NameInMap("Payload")
    @Validation(required = true)
    private Payload payload;

    @Query
    @NameInMap("UserInfo")
    @Validation(required = true)
    private UserInfo userInfo;

    private ListRemindersRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.payload = builder.payload;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemindersRequest create() {
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

    public static final class Builder extends Request.Builder<ListRemindersRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private Payload payload; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListRemindersRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.payload = request.payload;
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
        public ListRemindersRequest build() {
            return new ListRemindersRequest(this);
        } 

    } 

    public static class DeviceInfo extends TeaModel {
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

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
    public static class Payload extends TeaModel {
        @NameInMap("IsDebug")
        @Validation(required = true)
        private Boolean isDebug;

        private Payload(Builder builder) {
            this.isDebug = builder.isDebug;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return isDebug
         */
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public static final class Builder {
            private Boolean isDebug; 

            /**
             * IsDebug.
             */
            public Builder isDebug(Boolean isDebug) {
                this.isDebug = isDebug;
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
