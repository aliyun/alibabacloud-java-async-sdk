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
 * {@link PreviousAndNextControlRequest} extends {@link RequestModel}
 *
 * <p>PreviousAndNextControlRequest</p>
 */
public class PreviousAndNextControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenControlPlayingListRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private OpenControlPlayingListRequest openControlPlayingListRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private PreviousAndNextControlRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.openControlPlayingListRequest = builder.openControlPlayingListRequest;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviousAndNextControlRequest create() {
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
     * @return openControlPlayingListRequest
     */
    public OpenControlPlayingListRequest getOpenControlPlayingListRequest() {
        return this.openControlPlayingListRequest;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<PreviousAndNextControlRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private OpenControlPlayingListRequest openControlPlayingListRequest; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(PreviousAndNextControlRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.openControlPlayingListRequest = request.openControlPlayingListRequest;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Device ID information</p>
         * <p>This parameter is required.</p>
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putQueryParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>Business parameters</p>
         * <p>This parameter is required.</p>
         */
        public Builder openControlPlayingListRequest(OpenControlPlayingListRequest openControlPlayingListRequest) {
            String openControlPlayingListRequestShrink = shrink(openControlPlayingListRequest, "OpenControlPlayingListRequest", "json");
            this.putBodyParameter("OpenControlPlayingListRequest", openControlPlayingListRequestShrink);
            this.openControlPlayingListRequest = openControlPlayingListRequest;
            return this;
        }

        /**
         * <p>User identity information</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public PreviousAndNextControlRequest build() {
            return new PreviousAndNextControlRequest(this);
        } 

    } 

    /**
     * 
     * {@link PreviousAndNextControlRequest} extends {@link TeaModel}
     *
     * <p>PreviousAndNextControlRequest</p>
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
             * <p>The value corresponding to the encoding type.</p>
             * <p>When the encoding type is <code>SKILL_ID</code>, the value is the Skill ID of the application. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
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
             * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.  </p>
             * <p><code>PACKAGE_NAME</code>: APK package name, used for Android application customer journeys. <code>SKILL_ID</code>: Skill ID, used for cloud-based journeys.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>Device ID, set to deviceOpenId or deviceUnionId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of Device ID.</p>
             * <p><code>OPEN_ID</code>: The default device identity. <code>UNION_ID</code>: The organization-dimension device identity, which is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
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
             * <p>Organization ID. Required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
     * {@link PreviousAndNextControlRequest} extends {@link TeaModel}
     *
     * <p>PreviousAndNextControlRequest</p>
     */
    public static class OpenControlPlayingListRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cmd")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private java.util.Map<String, ?> extendInfo;

        @com.aliyun.core.annotation.NameInMap("IsFromDevice")
        private Boolean isFromDevice;

        private OpenControlPlayingListRequest(Builder builder) {
            this.cmd = builder.cmd;
            this.extendInfo = builder.extendInfo;
            this.isFromDevice = builder.isFromDevice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenControlPlayingListRequest create() {
            return builder().build();
        }

        /**
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
        }

        /**
         * @return extendInfo
         */
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return isFromDevice
         */
        public Boolean getIsFromDevice() {
            return this.isFromDevice;
        }

        public static final class Builder {
            private String cmd; 
            private java.util.Map<String, ?> extendInfo; 
            private Boolean isFromDevice; 

            private Builder() {
            } 

            private Builder(OpenControlPlayingListRequest model) {
                this.cmd = model.cmd;
                this.extendInfo = model.extendInfo;
                this.isFromDevice = model.isFromDevice;
            } 

            /**
             * <p>Next track: NEXT; Previous track: PREVIOUS</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>NEXT</p>
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(java.util.Map<String, ?> extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>Whether initiated by the device. Default is false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isFromDevice(Boolean isFromDevice) {
                this.isFromDevice = isFromDevice;
                return this;
            }

            public OpenControlPlayingListRequest build() {
                return new OpenControlPlayingListRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviousAndNextControlRequest} extends {@link TeaModel}
     *
     * <p>PreviousAndNextControlRequest</p>
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
             * <p>The value corresponding to the encoding type.</p>
             * <p>When the encoding type is <code>SKILL_ID</code>, the value is the Skill ID of the application. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
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
             * <p>Encoding type. There are multiple ways to obtain the user identity from Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p><code>PACKAGE_NAME</code>: APK package name, used for Android application client-side flows. <code>SKILL_ID</code>: Skill ID, used for cloud-side flows.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>User identifier, set to userOpenId or userUnionId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of User ID.</p>
             * <p><code>OPEN_ID</code>: The default user identity. <code>UNION_ID</code>: The organization-dimension user identity, which is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
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
             * <p>Organization ID. Required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
