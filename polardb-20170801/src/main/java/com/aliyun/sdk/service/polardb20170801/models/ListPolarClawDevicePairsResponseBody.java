// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ListPolarClawDevicePairsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolarClawDevicePairsResponseBody</p>
 */
public class ListPolarClawDevicePairsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Paired")
    private java.util.List<Paired> paired;

    @com.aliyun.core.annotation.NameInMap("Pending")
    private java.util.List<Pending> pending;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPolarClawDevicePairsResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.paired = builder.paired;
        this.pending = builder.pending;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolarClawDevicePairsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return paired
     */
    public java.util.List<Paired> getPaired() {
        return this.paired;
    }

    /**
     * @return pending
     */
    public java.util.List<Pending> getPending() {
        return this.pending;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private String message; 
        private java.util.List<Paired> paired; 
        private java.util.List<Pending> pending; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPolarClawDevicePairsResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.paired = model.paired;
            this.pending = model.pending;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Paired.
         */
        public Builder paired(java.util.List<Paired> paired) {
            this.paired = paired;
            return this;
        }

        /**
         * Pending.
         */
        public Builder pending(java.util.List<Pending> pending) {
            this.pending = pending;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPolarClawDevicePairsResponseBody build() {
            return new ListPolarClawDevicePairsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolarClawDevicePairsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolarClawDevicePairsResponseBody</p>
     */
    public static class Paired extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientMode")
        private String clientMode;

        @com.aliyun.core.annotation.NameInMap("CreatedAtMs")
        private Long createdAtMs;

        @com.aliyun.core.annotation.NameInMap("DeviceFamily")
        private String deviceFamily;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("LastSeenAtMs")
        private Long lastSeenAtMs;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Scopes")
        private java.util.List<String> scopes;

        private Paired(Builder builder) {
            this.clientId = builder.clientId;
            this.clientMode = builder.clientMode;
            this.createdAtMs = builder.createdAtMs;
            this.deviceFamily = builder.deviceFamily;
            this.deviceId = builder.deviceId;
            this.displayName = builder.displayName;
            this.lastSeenAtMs = builder.lastSeenAtMs;
            this.platform = builder.platform;
            this.role = builder.role;
            this.scopes = builder.scopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paired create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientMode
         */
        public String getClientMode() {
            return this.clientMode;
        }

        /**
         * @return createdAtMs
         */
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        /**
         * @return deviceFamily
         */
        public String getDeviceFamily() {
            return this.deviceFamily;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return lastSeenAtMs
         */
        public Long getLastSeenAtMs() {
            return this.lastSeenAtMs;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return scopes
         */
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public static final class Builder {
            private String clientId; 
            private String clientMode; 
            private Long createdAtMs; 
            private String deviceFamily; 
            private String deviceId; 
            private String displayName; 
            private Long lastSeenAtMs; 
            private String platform; 
            private String role; 
            private java.util.List<String> scopes; 

            private Builder() {
            } 

            private Builder(Paired model) {
                this.clientId = model.clientId;
                this.clientMode = model.clientMode;
                this.createdAtMs = model.createdAtMs;
                this.deviceFamily = model.deviceFamily;
                this.deviceId = model.deviceId;
                this.displayName = model.displayName;
                this.lastSeenAtMs = model.lastSeenAtMs;
                this.platform = model.platform;
                this.role = model.role;
                this.scopes = model.scopes;
            } 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientMode.
             */
            public Builder clientMode(String clientMode) {
                this.clientMode = clientMode;
                return this;
            }

            /**
             * CreatedAtMs.
             */
            public Builder createdAtMs(Long createdAtMs) {
                this.createdAtMs = createdAtMs;
                return this;
            }

            /**
             * DeviceFamily.
             */
            public Builder deviceFamily(String deviceFamily) {
                this.deviceFamily = deviceFamily;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * LastSeenAtMs.
             */
            public Builder lastSeenAtMs(Long lastSeenAtMs) {
                this.lastSeenAtMs = lastSeenAtMs;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Scopes.
             */
            public Builder scopes(java.util.List<String> scopes) {
                this.scopes = scopes;
                return this;
            }

            public Paired build() {
                return new Paired(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPolarClawDevicePairsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolarClawDevicePairsResponseBody</p>
     */
    public static class Pending extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientMode")
        private String clientMode;

        @com.aliyun.core.annotation.NameInMap("DeviceFamily")
        private String deviceFamily;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("IsRepair")
        private Boolean isRepair;

        @com.aliyun.core.annotation.NameInMap("PairRequestId")
        private String pairRequestId;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("PublicKey")
        private String publicKey;

        @com.aliyun.core.annotation.NameInMap("RemoteIp")
        private String remoteIp;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<String> roles;

        @com.aliyun.core.annotation.NameInMap("Scopes")
        private java.util.List<String> scopes;

        @com.aliyun.core.annotation.NameInMap("Silent")
        private Boolean silent;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private Long ts;

        private Pending(Builder builder) {
            this.clientId = builder.clientId;
            this.clientMode = builder.clientMode;
            this.deviceFamily = builder.deviceFamily;
            this.deviceId = builder.deviceId;
            this.displayName = builder.displayName;
            this.isRepair = builder.isRepair;
            this.pairRequestId = builder.pairRequestId;
            this.platform = builder.platform;
            this.publicKey = builder.publicKey;
            this.remoteIp = builder.remoteIp;
            this.role = builder.role;
            this.roles = builder.roles;
            this.scopes = builder.scopes;
            this.silent = builder.silent;
            this.ts = builder.ts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pending create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientMode
         */
        public String getClientMode() {
            return this.clientMode;
        }

        /**
         * @return deviceFamily
         */
        public String getDeviceFamily() {
            return this.deviceFamily;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return isRepair
         */
        public Boolean getIsRepair() {
            return this.isRepair;
        }

        /**
         * @return pairRequestId
         */
        public String getPairRequestId() {
            return this.pairRequestId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        /**
         * @return remoteIp
         */
        public String getRemoteIp() {
            return this.remoteIp;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return roles
         */
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        /**
         * @return scopes
         */
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        /**
         * @return silent
         */
        public Boolean getSilent() {
            return this.silent;
        }

        /**
         * @return ts
         */
        public Long getTs() {
            return this.ts;
        }

        public static final class Builder {
            private String clientId; 
            private String clientMode; 
            private String deviceFamily; 
            private String deviceId; 
            private String displayName; 
            private Boolean isRepair; 
            private String pairRequestId; 
            private String platform; 
            private String publicKey; 
            private String remoteIp; 
            private String role; 
            private java.util.List<String> roles; 
            private java.util.List<String> scopes; 
            private Boolean silent; 
            private Long ts; 

            private Builder() {
            } 

            private Builder(Pending model) {
                this.clientId = model.clientId;
                this.clientMode = model.clientMode;
                this.deviceFamily = model.deviceFamily;
                this.deviceId = model.deviceId;
                this.displayName = model.displayName;
                this.isRepair = model.isRepair;
                this.pairRequestId = model.pairRequestId;
                this.platform = model.platform;
                this.publicKey = model.publicKey;
                this.remoteIp = model.remoteIp;
                this.role = model.role;
                this.roles = model.roles;
                this.scopes = model.scopes;
                this.silent = model.silent;
                this.ts = model.ts;
            } 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientMode.
             */
            public Builder clientMode(String clientMode) {
                this.clientMode = clientMode;
                return this;
            }

            /**
             * DeviceFamily.
             */
            public Builder deviceFamily(String deviceFamily) {
                this.deviceFamily = deviceFamily;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * IsRepair.
             */
            public Builder isRepair(Boolean isRepair) {
                this.isRepair = isRepair;
                return this;
            }

            /**
             * PairRequestId.
             */
            public Builder pairRequestId(String pairRequestId) {
                this.pairRequestId = pairRequestId;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * PublicKey.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * RemoteIp.
             */
            public Builder remoteIp(String remoteIp) {
                this.remoteIp = remoteIp;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(java.util.List<String> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * Scopes.
             */
            public Builder scopes(java.util.List<String> scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * Silent.
             */
            public Builder silent(Boolean silent) {
                this.silent = silent;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            public Pending build() {
                return new Pending(this);
            } 

        } 

    }
}
