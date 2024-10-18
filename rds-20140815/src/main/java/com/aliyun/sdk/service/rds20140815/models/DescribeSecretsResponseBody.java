// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecretsResponseBody</p>
 */
public class DescribeSecretsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Secrets")
    private java.util.List < Secrets> secrets;

    private DescribeSecretsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.secrets = builder.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecretsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secrets
     */
    public java.util.List < Secrets> getSecrets() {
        return this.secrets;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List < Secrets> secrets; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DF4961DD-16F5-5B24-BD4C-0C7788F7ADAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the credential.</p>
         */
        public Builder secrets(java.util.List < Secrets> secrets) {
            this.secrets = secrets;
            return this;
        }

        public DescribeSecretsResponseBody build() {
            return new DescribeSecretsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecretsResponseBody</p>
     */
    public static class Secrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecretArn")
        private String secretArn;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Secrets(Builder builder) {
            this.accountId = builder.accountId;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.secretArn = builder.secretArn;
            this.secretName = builder.secretName;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secrets create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return secretArn
         */
        public String getSecretArn() {
            return this.secretArn;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String accountId; 
            private String description; 
            private String regionId; 
            private String secretArn; 
            private String secretName; 
            private String username; 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1266348003******</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The description of the credential.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the credential for the created Data API account.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:rds:cn-hangzhou:1335786***:dbInstance/rm-bp1m7l3j63****</p>
             */
            public Builder secretArn(String secretArn) {
                this.secretArn = secretArn;
                return this;
            }

            /**
             * <p>The name of the credential.</p>
             * 
             * <strong>example:</strong>
             * <p>Foo</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * <p>The username that is used to access the database.</p>
             * 
             * <strong>example:</strong>
             * <p>user_jack</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Secrets build() {
                return new Secrets(this);
            } 

        } 

    }
}
