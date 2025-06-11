// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link GetAccessConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessConfigurationResponseBody</p>
 */
public class GetAccessConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessConfiguration")
    private AccessConfiguration accessConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccessConfigurationResponseBody(Builder builder) {
        this.accessConfiguration = builder.accessConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAccessConfigurationResponseBody model) {
            this.accessConfiguration = model.accessConfiguration;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the access configuration.</p>
         */
        public Builder accessConfiguration(AccessConfiguration accessConfiguration) {
            this.accessConfiguration = accessConfiguration;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D5E40508-483B-52F6-993C-D880B0F87591</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessConfigurationResponseBody build() {
            return new GetAccessConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccessConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessConfigurationResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAccessConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessConfigurationResponseBody</p>
     */
    public static class AccessConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
        private String accessConfigurationId;

        @com.aliyun.core.annotation.NameInMap("AccessConfigurationName")
        private String accessConfigurationName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RelayState")
        private String relayState;

        @com.aliyun.core.annotation.NameInMap("SessionDuration")
        private Integer sessionDuration;

        @com.aliyun.core.annotation.NameInMap("StatusNotifications")
        private java.util.List<String> statusNotifications;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private AccessConfiguration(Builder builder) {
            this.accessConfigurationId = builder.accessConfigurationId;
            this.accessConfigurationName = builder.accessConfigurationName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.relayState = builder.relayState;
            this.sessionDuration = builder.sessionDuration;
            this.statusNotifications = builder.statusNotifications;
            this.tags = builder.tags;
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
        public java.util.List<String> getStatusNotifications() {
            return this.statusNotifications;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private java.util.List<String> statusNotifications; 
            private java.util.List<Tags> tags; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(AccessConfiguration model) {
                this.accessConfigurationId = model.accessConfigurationId;
                this.accessConfigurationName = model.accessConfigurationName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.relayState = model.relayState;
                this.sessionDuration = model.sessionDuration;
                this.statusNotifications = model.statusNotifications;
                this.tags = model.tags;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ac-00ccule7tadaijxc****</p>
             */
            public Builder accessConfigurationId(String accessConfigurationId) {
                this.accessConfigurationId = accessConfigurationId;
                return this;
            }

            /**
             * <p>The name of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC-Admin</p>
             */
            public Builder accessConfigurationName(String accessConfigurationName) {
                this.accessConfigurationName = accessConfigurationName;
                return this;
            }

            /**
             * <p>The time when the access configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-30T09:39:44Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>This is an access configuration.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The initial web page</p>
             * <p>displayed after a CloudSSO user uses the access configuration to access an account in your resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cloudsso.console.aliyun.com">https://cloudsso.console.aliyun.com</a></p>
             */
            public Builder relayState(String relayState) {
                this.relayState = relayState;
                return this;
            }

            /**
             * <p>The duration of a session</p>
             * <p>in which a CloudSSO user uses the access configuration to access an account in your resource directory.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder sessionDuration(Integer sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * <p>The status notifications.</p>
             */
            public Builder statusNotifications(java.util.List<String> statusNotifications) {
                this.statusNotifications = statusNotifications;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the information about the access configuration was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-26T03:02:11Z</p>
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
