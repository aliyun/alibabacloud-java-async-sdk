// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessConfigurationResponseBody</p>
 */
public class CreateAccessConfigurationResponseBody extends TeaModel {
    @NameInMap("AccessConfiguration")
    private AccessConfiguration accessConfiguration;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAccessConfigurationResponseBody(Builder builder) {
        this.accessConfiguration = builder.accessConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessConfiguration
     */
    public AccessConfiguration getAccessConfiguration() {
        return this.accessConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessConfiguration accessConfiguration; 
        private String requestId; 

        /**
         * The information about the access configuration.
         */
        public Builder accessConfiguration(AccessConfiguration accessConfiguration) {
            this.accessConfiguration = accessConfiguration;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessConfigurationResponseBody build() {
            return new CreateAccessConfigurationResponseBody(this);
        } 

    } 

    public static class AccessConfiguration extends TeaModel {
        @NameInMap("AccessConfigurationId")
        private String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        private String accessConfigurationName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("RelayState")
        private String relayState;

        @NameInMap("SessionDuration")
        private Integer sessionDuration;

        @NameInMap("StatusNotifications")
        private java.util.List < String > statusNotifications;

        @NameInMap("UpdateTime")
        private String updateTime;

        private AccessConfiguration(Builder builder) {
            this.accessConfigurationId = builder.accessConfigurationId;
            this.accessConfigurationName = builder.accessConfigurationName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.relayState = builder.relayState;
            this.sessionDuration = builder.sessionDuration;
            this.statusNotifications = builder.statusNotifications;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessConfiguration create() {
            return builder().build();
        }

        /**
         * @return accessConfigurationId
         */
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        /**
         * @return accessConfigurationName
         */
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return relayState
         */
        public String getRelayState() {
            return this.relayState;
        }

        /**
         * @return sessionDuration
         */
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        /**
         * @return statusNotifications
         */
        public java.util.List < String > getStatusNotifications() {
            return this.statusNotifications;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String accessConfigurationId; 
            private String accessConfigurationName; 
            private String createTime; 
            private String description; 
            private String relayState; 
            private Integer sessionDuration; 
            private java.util.List < String > statusNotifications; 
            private String updateTime; 

            /**
             * The ID of the access configuration.
             */
            public Builder accessConfigurationId(String accessConfigurationId) {
                this.accessConfigurationId = accessConfigurationId;
                return this;
            }

            /**
             * The name of the access configuration.
             */
            public Builder accessConfigurationName(String accessConfigurationName) {
                this.accessConfigurationName = accessConfigurationName;
                return this;
            }

            /**
             * The time when the access configuration was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the access configuration.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The initial web page that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.
             */
            public Builder relayState(String relayState) {
                this.relayState = relayState;
                return this;
            }

            /**
             * The duration of a session in which a CloudSSO user accesses an account in your resource directory by using the access configuration.
             * <p>
             * 
             * Unit: seconds.
             */
            public Builder sessionDuration(Integer sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * The status notification.
             */
            public Builder statusNotifications(java.util.List < String > statusNotifications) {
                this.statusNotifications = statusNotifications;
                return this;
            }

            /**
             * The time when the information about the access configuration was modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AccessConfiguration build() {
                return new AccessConfiguration(this);
            } 

        } 

    }
}
