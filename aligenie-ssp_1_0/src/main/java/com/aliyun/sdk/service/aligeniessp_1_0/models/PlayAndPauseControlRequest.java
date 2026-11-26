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
 * {@link PlayAndPauseControlRequest} extends {@link RequestModel}
 *
 * <p>PlayAndPauseControlRequest</p>
 */
public class PlayAndPauseControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenPlayAndPauseControlParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private OpenPlayAndPauseControlParam openPlayAndPauseControlParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private PlayAndPauseControlRequest(Builder builder) {
        super(builder);
        this.deviceInfo = builder.deviceInfo;
        this.openPlayAndPauseControlParam = builder.openPlayAndPauseControlParam;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PlayAndPauseControlRequest create() {
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
     * @return openPlayAndPauseControlParam
     */
    public OpenPlayAndPauseControlParam getOpenPlayAndPauseControlParam() {
        return this.openPlayAndPauseControlParam;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<PlayAndPauseControlRequest, Builder> {
        private DeviceInfo deviceInfo; 
        private OpenPlayAndPauseControlParam openPlayAndPauseControlParam; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(PlayAndPauseControlRequest request) {
            super(request);
            this.deviceInfo = request.deviceInfo;
            this.openPlayAndPauseControlParam = request.openPlayAndPauseControlParam;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Device identity information</p>
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
        public Builder openPlayAndPauseControlParam(OpenPlayAndPauseControlParam openPlayAndPauseControlParam) {
            String openPlayAndPauseControlParamShrink = shrink(openPlayAndPauseControlParam, "OpenPlayAndPauseControlParam", "json");
            this.putBodyParameter("OpenPlayAndPauseControlParam", openPlayAndPauseControlParamShrink);
            this.openPlayAndPauseControlParam = openPlayAndPauseControlParam;
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
        public PlayAndPauseControlRequest build() {
            return new PlayAndPauseControlRequest(this);
        } 

    } 

    /**
     * 
     * {@link PlayAndPauseControlRequest} extends {@link TeaModel}
     *
     * <p>PlayAndPauseControlRequest</p>
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
             * <p>Value corresponding to the encoding type.</p>
             * <p>If the encoding type is <code>SKILL_ID</code>, the value is the application&quot;s Skill ID. If the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
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
             * <p>Encoding type. There are multiple ways to obtain the device identity for Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer link. <code>SKILL_ID</code>: Skill ID, used for the cloud-based link.</p>
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
             * <p>Device ID, which can be set to deviceOpenId or deviceUnionId.</p>
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
             * <p><code>OPEN_ID</code>: The default device ID identity. <code>UNION_ID</code>: The organization-dimension device ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
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
             * <p>Organization ID. This parameter is required if IdType is UNION_ID.</p>
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
     * {@link PlayAndPauseControlRequest} extends {@link TeaModel}
     *
     * <p>PlayAndPauseControlRequest</p>
     */
    public static class OpenPlayAndPauseControlParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpenPlayAndPauseCommand")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openPlayAndPauseCommand;

        private OpenPlayAndPauseControlParam(Builder builder) {
            this.openPlayAndPauseCommand = builder.openPlayAndPauseCommand;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenPlayAndPauseControlParam create() {
            return builder().build();
        }

        /**
         * @return openPlayAndPauseCommand
         */
        public String getOpenPlayAndPauseCommand() {
            return this.openPlayAndPauseCommand;
        }

        public static final class Builder {
            private String openPlayAndPauseCommand; 

            private Builder() {
            } 

            private Builder(OpenPlayAndPauseControlParam model) {
                this.openPlayAndPauseCommand = model.openPlayAndPauseCommand;
            } 

            /**
             * <p>Playback: Play; Pause: Pause.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Play</p>
             */
            public Builder openPlayAndPauseCommand(String openPlayAndPauseCommand) {
                this.openPlayAndPauseCommand = openPlayAndPauseCommand;
                return this;
            }

            public OpenPlayAndPauseControlParam build() {
                return new OpenPlayAndPauseControlParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link PlayAndPauseControlRequest} extends {@link TeaModel}
     *
     * <p>PlayAndPauseControlRequest</p>
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
             * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application&quot;s Skill ID. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
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
             * <p>Encoding type. There are multiple ways to obtain the user identifier from Tmall Genie, and each method corresponds to a different encoding type.</p>
             * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer flow. <code>SKILL_ID</code>: Skill ID, used for the cloud-based flow.</p>
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
             * <p>User identifier, set to either userOpenId or userUnionId.</p>
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
             * <p><code>OPEN_ID</code>: The default user ID identity. <code>UNION_ID</code>: The organization-dimension user ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
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
             * <p>Organization ID. Required when IdType is <code>UNION_ID</code>.</p>
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
