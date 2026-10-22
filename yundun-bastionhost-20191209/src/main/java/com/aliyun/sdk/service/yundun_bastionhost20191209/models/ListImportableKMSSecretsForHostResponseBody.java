// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListImportableKMSSecretsForHostResponseBody} extends {@link TeaModel}
 *
 * <p>ListImportableKMSSecretsForHostResponseBody</p>
 */
public class ListImportableKMSSecretsForHostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Secrets")
    private java.util.List<Secrets> secrets;

    private ListImportableKMSSecretsForHostResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.secrets = builder.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImportableKMSSecretsForHostResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public java.util.List<Secrets> getSecrets() {
        return this.secrets;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Secrets> secrets; 

        private Builder() {
        } 

        private Builder(ListImportableKMSSecretsForHostResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.secrets = model.secrets;
        } 

        /**
         * <p>The value of the <code>MaxResults</code> parameter in the request. If the parameter was not specified, the default value of 20 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. If this field is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of importable secrets.</p>
         */
        public Builder secrets(java.util.List<Secrets> secrets) {
            this.secrets = secrets;
            return this;
        }

        public ListImportableKMSSecretsForHostResponseBody build() {
            return new ListImportableKMSSecretsForHostResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImportableKMSSecretsForHostResponseBody} extends {@link TeaModel}
     *
     * <p>ListImportableKMSSecretsForHostResponseBody</p>
     */
    public static class Secrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        @com.aliyun.core.annotation.NameInMap("SecretType")
        private String secretType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        private Secrets(Builder builder) {
            this.secretName = builder.secretName;
            this.secretType = builder.secretType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secrets create() {
            return builder().build();
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        /**
         * @return secretType
         */
        public String getSecretType() {
            return this.secretType;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String secretName; 
            private String secretType; 
            private String tags; 

            private Builder() {
            } 

            private Builder(Secrets model) {
                this.secretName = model.secretName;
                this.secretType = model.secretType;
                this.tags = model.tags;
            } 

            /**
             * <p>The name of the secret.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * <p>The type of the secret. Valid value:</p>
             * <ul>
             * <li><code>ECS</code>: an ECS secret.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder secretType(String secretType) {
                this.secretType = secretType;
                return this;
            }

            /**
             * <p>The tags associated with the secret.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public Secrets build() {
                return new Secrets(this);
            } 

        } 

    }
}
