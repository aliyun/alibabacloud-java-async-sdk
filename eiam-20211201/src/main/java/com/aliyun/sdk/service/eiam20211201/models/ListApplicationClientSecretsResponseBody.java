// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListApplicationClientSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationClientSecretsResponseBody</p>
 */
public class ListApplicationClientSecretsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationClientSecrets")
    private java.util.List<ApplicationClientSecrets> applicationClientSecrets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationClientSecretsResponseBody(Builder builder) {
        this.applicationClientSecrets = builder.applicationClientSecrets;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationClientSecretsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationClientSecrets
     */
    public java.util.List<ApplicationClientSecrets> getApplicationClientSecrets() {
        return this.applicationClientSecrets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApplicationClientSecrets> applicationClientSecrets; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The information about the client keys.</p>
         */
        public Builder applicationClientSecrets(java.util.List<ApplicationClientSecrets> applicationClientSecrets) {
            this.applicationClientSecrets = applicationClientSecrets;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationClientSecretsResponseBody build() {
            return new ListApplicationClientSecretsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationClientSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationClientSecretsResponseBody</p>
     */
    public static class ApplicationClientSecrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApplicationClientSecrets(Builder builder) {
            this.applicationId = builder.applicationId;
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.secretId = builder.secretId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationClientSecrets create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastUsedTime
         */
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicationId; 
            private String clientId; 
            private String clientSecret; 
            private String instanceId; 
            private Long lastUsedTime; 
            private String secretId; 
            private String status; 

            /**
             * <p>The ID of the application that you want to query.</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The client ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client key secret of the application. The value is not masked.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJh*****************************************************************************************************OQ</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_wdziy4vnjt33ehhf7z2o2nxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the client key was last used. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>The client key ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>sci_k52x2ru63rlkflina5utgkxxxx</p>
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>The status of the client key. Valid values:</p>
             * <ul>
             * <li>Enabled: The client key is enabled.</li>
             * <li>Disabled: The client key is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApplicationClientSecrets build() {
                return new ApplicationClientSecrets(this);
            } 

        } 

    }
}
