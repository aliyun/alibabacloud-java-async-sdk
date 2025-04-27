// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretsResponseBody</p>
 */
public class ListSecretsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Secrets")
    private Secrets secrets;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListSecretsResponseBody(Builder builder) {
        this.count = builder.count;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secrets = builder.secrets;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public Secrets getSecrets() {
        return this.secrets;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long count; 
        private String message; 
        private String requestId; 
        private Secrets secrets; 
        private String status; 

        private Builder() {
        } 

        private Builder(ListSecretsResponseBody model) {
            this.count = model.count;
            this.message = model.message;
            this.requestId = model.requestId;
            this.secrets = model.secrets;
            this.status = model.status;
        } 

        /**
         * <p>The number of access credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried access credentials.</p>
         */
        public Builder secrets(Secrets secrets) {
            this.secrets = secrets;
            return this;
        }

        /**
         * <p>The status of the operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListSecretsResponseBody build() {
            return new ListSecretsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretsResponseBody</p>
     */
    public static class SecretsSecrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

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

        private SecretsSecrets(Builder builder) {
            this.accountId = builder.accountId;
            this.DBInstanceId = builder.DBInstanceId;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.secretArn = builder.secretArn;
            this.secretName = builder.secretName;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretsSecrets create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
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
            private String DBInstanceId; 
            private String description; 
            private String regionId; 
            private String secretArn; 
            private String secretName; 
            private String username; 

            private Builder() {
            } 

            private Builder(SecretsSecrets model) {
                this.accountId = model.accountId;
                this.DBInstanceId = model.DBInstanceId;
                this.description = model.description;
                this.regionId = model.regionId;
                this.secretArn = model.secretArn;
                this.secretName = model.secretName;
                this.username = model.username;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1033***</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-bp14****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The description of the access credential.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the access credential for the created Data API account. Format: <code>acs:gpdb:{{region}}:{{accountId}}:secret/{{secretName}}-{{32 digits random string}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:gpdb:cn-beijing:1033**:secret/testsecret-eG2AQGRIwQ0zFp4VA7mYL3uiCXTfDQbQ</p>
             */
            public Builder secretArn(String secretArn) {
                this.secretArn = secretArn;
                return this;
            }

            /**
             * <p>The name of the access credential.</p>
             * 
             * <strong>example:</strong>
             * <p>testsecret</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>testacc</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public SecretsSecrets build() {
                return new SecretsSecrets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretsResponseBody</p>
     */
    public static class Secrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Secrets")
        private java.util.List<SecretsSecrets> secrets;

        private Secrets(Builder builder) {
            this.secrets = builder.secrets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secrets create() {
            return builder().build();
        }

        /**
         * @return secrets
         */
        public java.util.List<SecretsSecrets> getSecrets() {
            return this.secrets;
        }

        public static final class Builder {
            private java.util.List<SecretsSecrets> secrets; 

            private Builder() {
            } 

            private Builder(Secrets model) {
                this.secrets = model.secrets;
            } 

            /**
             * <p>The queried access credentials.</p>
             */
            public Builder secrets(java.util.List<SecretsSecrets> secrets) {
                this.secrets = secrets;
                return this;
            }

            public Secrets build() {
                return new Secrets(this);
            } 

        } 

    }
}
