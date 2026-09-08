// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetUserResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Extension parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("DeviceExt")
        private String deviceExt;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceState")
        private String deviceState;

        @com.aliyun.core.annotation.NameInMap("DisplayId")
        private String displayId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WorkMode")
        private String workMode;

        private Data(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.deviceExt = builder.deviceExt;
            this.deviceId = builder.deviceId;
            this.deviceState = builder.deviceState;
            this.displayId = builder.displayId;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.extension = builder.extension;
            this.instanceId = builder.instanceId;
            this.loginName = builder.loginName;
            this.mobile = builder.mobile;
            this.nickname = builder.nickname;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.userId = builder.userId;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return deviceExt
         */
        public String getDeviceExt() {
            return this.deviceExt;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceState
         */
        public String getDeviceState() {
            return this.deviceState;
        }

        /**
         * @return displayId
         */
        public String getDisplayId() {
            return this.displayId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String deviceExt; 
            private String deviceId; 
            private String deviceState; 
            private String displayId; 
            private String displayName; 
            private String email; 
            private String extension; 
            private String instanceId; 
            private String loginName; 
            private String mobile; 
            private String nickname; 
            private String roleId; 
            private String roleName; 
            private String userId; 
            private String workMode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.avatarUrl = model.avatarUrl;
                this.deviceExt = model.deviceExt;
                this.deviceId = model.deviceId;
                this.deviceState = model.deviceState;
                this.displayId = model.displayId;
                this.displayName = model.displayName;
                this.email = model.email;
                this.extension = model.extension;
                this.instanceId = model.instanceId;
                this.loginName = model.loginName;
                this.mobile = model.mobile;
                this.nickname = model.nickname;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
                this.userId = model.userId;
                this.workMode = model.workMode;
            } 

            /**
             * <p>Agent profile picture URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.com/xxx.jpg">http://xxx.com/xxx.jpg</a></p>
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * <p>SIP phone extension number. If the agent has registered a SIP phone, this parameter is the extension number of the SIP phone device.</p>
             * 
             * <strong>example:</strong>
             * <p>8033****</p>
             */
            public Builder deviceExt(String deviceExt) {
                this.deviceExt = deviceExt;
                return this;
            }

            /**
             * <p>Device ID, which is the identity of a browser-based Web Real-Time Communication (WebRTC) softphone or a physical phone device. Only one type of device can be registered at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>ACC-YUNBS-1.0.10-****</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The status of the SIP phone device. If no SIP phone is registered, the status is UNREGISTERED (Unregistered). If a SIP phone was previously registered but is currently offline, the status is OFFLINE (Offline). If a SIP phone is registered and currently online, the status is ONLINE (Online).</p>
             * 
             * <strong>example:</strong>
             * <p>OFFLINE</p>
             */
            public Builder deviceState(String deviceState) {
                this.deviceState = deviceState;
                return this;
            }

            /**
             * <p>Agent\&quot;s employee ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder displayId(String displayId) {
                this.displayId = displayId;
                return this;
            }

            /**
             * <p>Agent display name.</p>
             * 
             * <strong>example:</strong>
             * <p>坐席小王</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Mailbox.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Agent extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>8003****</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Agent logon name.</p>
             * 
             * <strong>example:</strong>
             * <p>agent</p>
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * <p>Agent\&quot;s personal phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1391234****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>Agent nickname</p>
             * 
             * <strong>example:</strong>
             * <p>阿云</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>Role ID, in the format: role\@instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Admin@ccc-test</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>Role name.</p>
             * 
             * <strong>example:</strong>
             * <p>Admin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Work mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ON_SITE</p>
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
