// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserProvisioningConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserProvisioningConfigurationResponseBody</p>
 */
public class UpdateUserProvisioningConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserProvisioningConfiguration")
    private UserProvisioningConfiguration userProvisioningConfiguration;

    private UpdateUserProvisioningConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userProvisioningConfiguration = builder.userProvisioningConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserProvisioningConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userProvisioningConfiguration
     */
    public UserProvisioningConfiguration getUserProvisioningConfiguration() {
        return this.userProvisioningConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private UserProvisioningConfiguration userProvisioningConfiguration; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The global configurations of the RAM user provisioning.
         */
        public Builder userProvisioningConfiguration(UserProvisioningConfiguration userProvisioningConfiguration) {
            this.userProvisioningConfiguration = userProvisioningConfiguration;
            return this;
        }

        public UpdateUserProvisioningConfigurationResponseBody build() {
            return new UpdateUserProvisioningConfigurationResponseBody(this);
        } 

    } 

    public static class UserProvisioningConfiguration extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DefaultLandingPage")
        private String defaultLandingPage;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("SessionDuration")
        private Integer sessionDuration;

        @NameInMap("UpdateTime")
        private String updateTime;

        private UserProvisioningConfiguration(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultLandingPage = builder.defaultLandingPage;
            this.directoryId = builder.directoryId;
            this.sessionDuration = builder.sessionDuration;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProvisioningConfiguration create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultLandingPage
         */
        public String getDefaultLandingPage() {
            return this.defaultLandingPage;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return sessionDuration
         */
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String defaultLandingPage; 
            private String directoryId; 
            private Integer sessionDuration; 
            private String updateTime; 

            /**
             * The creation time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The default URL for a CloudSSO user who logs on to the Alibaba Cloud Management Console.
             * <p>
             * 
             * Default value: https://homenew.console.aliyun.com.
             */
            public Builder defaultLandingPage(String defaultLandingPage) {
                this.defaultLandingPage = defaultLandingPage;
                return this;
            }

            /**
             * The ID of the resource directory.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The duration of the logon session.
             * <p>
             * 
             * Unit: hours.
             * 
             * Valid values: 1 to 24.
             * 
             * Default value: 6.
             */
            public Builder sessionDuration(Integer sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public UserProvisioningConfiguration build() {
                return new UserProvisioningConfiguration(this);
            } 

        } 

    }
}
