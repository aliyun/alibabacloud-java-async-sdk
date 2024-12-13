// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserProvisioningConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserProvisioningConfigurationResponseBody</p>
 */
public class GetUserProvisioningConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserProvisioningConfiguration")
    private UserProvisioningConfiguration userProvisioningConfiguration;

    private GetUserProvisioningConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userProvisioningConfiguration = builder.userProvisioningConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningConfigurationResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66898413-EB80-556D-9429-06FE3548F672</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The global configurations of the RAM user provisioning.</p>
         */
        public Builder userProvisioningConfiguration(UserProvisioningConfiguration userProvisioningConfiguration) {
            this.userProvisioningConfiguration = userProvisioningConfiguration;
            return this;
        }

        public GetUserProvisioningConfigurationResponseBody build() {
            return new GetUserProvisioningConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserProvisioningConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserProvisioningConfigurationResponseBody</p>
     */
    public static class UserProvisioningConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultLandingPage")
        private String defaultLandingPage;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("SessionDuration")
        private Integer sessionDuration;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28T03:55:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The default URL for a CloudSSO user who logs on to the Alibaba Cloud Management Console.</p>
             * <p>Default value: <a href="https://homenew.console.aliyun.com">https://homenew.console.aliyun.com</a>.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://homenew.console.aliyun.com">https://homenew.console.aliyun.com</a></p>
             */
            public Builder defaultLandingPage(String defaultLandingPage) {
                this.defaultLandingPage = defaultLandingPage;
                return this;
            }

            /**
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>d-00fc2p61****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The duration of the logon session.</p>
             * <p>Unit: hours.</p>
             * <p>Valid values: 1 to 24.</p>
             * <p>Default value: 6.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sessionDuration(Integer sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-28T03:55:42Z</p>
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
