// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListRecommendContentRequest} extends {@link RequestModel}
 *
 * <p>ListRecommendContentRequest</p>
 */
public class ListRecommendContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Request")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListRecommendContentRequestRequest request;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private ListRecommendContentRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.request = builder.request;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecommendContentRequest create() {
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
     * @return request
     */
    public ListRecommendContentRequestRequest getRequest() {
        return this.request;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<ListRecommendContentRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private ListRecommendContentRequestRequest request; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListRecommendContentRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.request = request.request;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Device identification information</p>
         * <p>This parameter is required.</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putQueryParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>Request Parameters</p>
         * <p>This parameter is required.</p>
         */
        public Builder request(ListRecommendContentRequestRequest request) {
            String requestShrink = shrink(request, "Request", "json");
            this.putBodyParameter("Request", requestShrink);
            this.request = request;
            return this;
        }

        /**
         * <p>User identification information</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public ListRecommendContentRequest build() {
            return new ListRecommendContentRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListRecommendContentRequest} extends {@link TeaModel}
     *
     * <p>ListRecommendContentRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
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
             * <p>Value corresponding to the encoding type</p>
             * <p>When the encoding type is SKILL_ID, the value is the application&quot;s Skill ID.
             * When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p>PACKAGE_NAME: APK package name, used for the Android application client path.
             * SKILL_ID: Skill ID, used for the cloud-based path.</p>
             * 
             * <strong>example:</strong>
             * <p>PACKAGE_NAME</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>Device ID, set to deviceOpenId or deviceUnionId.</p>
             * 
             * <strong>example:</strong>
             * <p>DAFE****ce3ej=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Type of device ID</p>
             * <p>OPEN_ID: Default device ID identity.
             * UNION_ID: Organization-dimension device ID identity. This value is available only after an organization has been registered on the Tmall Genie Skill Application Open Platform.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID. Required when IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1**2</p>
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
     * {@link ListRecommendContentRequest} extends {@link TeaModel}
     *
     * <p>ListRecommendContentRequest</p>
     */
    public static class ListRecommendContentRequestRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ListRecommendContentRequestRequest(Builder builder) {
            this.count = builder.count;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListRecommendContentRequestRequest create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String type; 

            private Builder() {
            } 

            private Builder(ListRecommendContentRequestRequest model) {
                this.count = model.count;
                this.type = model.type;
            } 

            /**
             * <p>Quantity of recommendations</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Default value: song (currently, the extension field supports only song)</p>
             * 
             * <strong>example:</strong>
             * <p>song</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ListRecommendContentRequestRequest build() {
                return new ListRecommendContentRequestRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecommendContentRequest} extends {@link TeaModel}
     *
     * <p>ListRecommendContentRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
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
             * <p>Value corresponding to the encoding type.</p>
             * <p>When the encoding type is SKILL_ID, the value is the Skill ID of the application.<br>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p>PACKAGE_NAME: APK package name, used for the Android application client path.
             * SKILL_ID: Skill ID, used for the cloud-based path.</p>
             * 
             * <strong>example:</strong>
             * <p>PACKAGE_NAME</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>User Identifier, set to userOpenId or userUnionId.</p>
             * 
             * <strong>example:</strong>
             * <p>HOFF****my7Iw=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Type of User ID.</p>
             * <p>OPEN_ID: The default User ID identifier.<br>UNION_ID: The organization-dimension User ID identifier. This value is available only after an organization has been requested on the Tmall Genie Skills Application Open Platform.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID. Required when IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1**2</p>
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
