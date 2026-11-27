// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListSecretValueResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretValueResponseBody</p>
 */
public class ListSecretValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("secrets")
    private java.util.List<Secrets> secrets;

    private ListSecretValueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secrets = builder.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretValueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private java.util.List<Secrets> secrets; 

        private Builder() {
        } 

        private Builder(ListSecretValueResponseBody model) {
            this.requestId = model.requestId;
            this.secrets = model.secrets;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>79555076-7087-59EF-A936-8C31A48AA1E2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of secrets.</p>
         */
        public Builder secrets(java.util.List<Secrets> secrets) {
            this.secrets = secrets;
            return this;
        }

        public ListSecretValueResponseBody build() {
            return new ListSecretValueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecretValueResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretValueResponseBody</p>
     */
    public static class Secrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("secretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("secretType")
        private String secretType;

        private Secrets(Builder builder) {
            this.comment = builder.comment;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.name = builder.name;
            this.secretId = builder.secretId;
            this.secretType = builder.secretType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secrets create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return secretType
         */
        public String getSecretType() {
            return this.secretType;
        }

        public static final class Builder {
            private String comment; 
            private String content; 
            private Long createTime; 
            private String creator; 
            private String creatorName; 
            private String name; 
            private String secretId; 
            private String secretType; 

            private Builder() {
            } 

            private Builder(Secrets model) {
                this.comment = model.comment;
                this.content = model.content;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.name = model.name;
                this.secretId = model.secretId;
                this.secretType = model.secretType;
            } 

            /**
             * <p>The comment.</p>
             * 
             * <strong>example:</strong>
             * <p>My secret。</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The content of the secret.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1787220243000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>12550000006396</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The nickname of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The name of the secret.</p>
             * 
             * <strong>example:</strong>
             * <p>mysecret</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The secret ID.</p>
             * 
             * <strong>example:</strong>
             * <p>st-xxxxxxxxxxxx</p>
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>The type of the secret. The value is fixed to secret.</p>
             * 
             * <strong>example:</strong>
             * <p>secret</p>
             */
            public Builder secretType(String secretType) {
                this.secretType = secretType;
                return this;
            }

            public Secrets build() {
                return new Secrets(this);
            } 

        } 

    }
}
