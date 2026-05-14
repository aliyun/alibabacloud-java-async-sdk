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
 * {@link ApprovePolarClawDevicePairResponseBody} extends {@link TeaModel}
 *
 * <p>ApprovePolarClawDevicePairResponseBody</p>
 */
public class ApprovePolarClawDevicePairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Device")
    private Device device;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PairRequestId")
    private String pairRequestId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ApprovePolarClawDevicePairResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.device = builder.device;
        this.message = builder.message;
        this.pairRequestId = builder.pairRequestId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApprovePolarClawDevicePairResponseBody create() {
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
     * @return device
     */
    public Device getDevice() {
        return this.device;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pairRequestId
     */
    public String getPairRequestId() {
        return this.pairRequestId;
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
        private Device device; 
        private String message; 
        private String pairRequestId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ApprovePolarClawDevicePairResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.device = model.device;
            this.message = model.message;
            this.pairRequestId = model.pairRequestId;
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
         * Device.
         */
        public Builder device(Device device) {
            this.device = device;
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
         * PairRequestId.
         */
        public Builder pairRequestId(String pairRequestId) {
            this.pairRequestId = pairRequestId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>25C70FF3-D49B-594D-BECE-0DE2BA1D8BBB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApprovePolarClawDevicePairResponseBody build() {
            return new ApprovePolarClawDevicePairResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApprovePolarClawDevicePairResponseBody} extends {@link TeaModel}
     *
     * <p>ApprovePolarClawDevicePairResponseBody</p>
     */
    public static class Device extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAtMs")
        private Long createdAtMs;

        @com.aliyun.core.annotation.NameInMap("DeviceFamily")
        private String deviceFamily;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Scopes")
        private java.util.List<String> scopes;

        private Device(Builder builder) {
            this.createdAtMs = builder.createdAtMs;
            this.deviceFamily = builder.deviceFamily;
            this.deviceId = builder.deviceId;
            this.displayName = builder.displayName;
            this.platform = builder.platform;
            this.role = builder.role;
            this.scopes = builder.scopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Device create() {
            return builder().build();
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
            private Long createdAtMs; 
            private String deviceFamily; 
            private String deviceId; 
            private String displayName; 
            private String platform; 
            private String role; 
            private java.util.List<String> scopes; 

            private Builder() {
            } 

            private Builder(Device model) {
                this.createdAtMs = model.createdAtMs;
                this.deviceFamily = model.deviceFamily;
                this.deviceId = model.deviceId;
                this.displayName = model.displayName;
                this.platform = model.platform;
                this.role = model.role;
                this.scopes = model.scopes;
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

            public Device build() {
                return new Device(this);
            } 

        } 

    }
}
