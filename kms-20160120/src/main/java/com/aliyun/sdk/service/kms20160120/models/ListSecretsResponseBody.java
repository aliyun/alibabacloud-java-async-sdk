// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecretsResponseBody</p>
 */
public class ListSecretsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretList")
    private SecretList secretList;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListSecretsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.secretList = builder.secretList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretList
     */
    public SecretList getSecretList() {
        return this.secretList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SecretList secretList; 
        private Integer totalCount; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of returned secrets.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The list of secrets.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the secret was updated.
         */
        public Builder secretList(SecretList secretList) {
            this.secretList = secretList;
            return this;
        }

        /**
         * The secret name.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSecretsResponseBody build() {
            return new ListSecretsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Secret extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("PlannedDeleteTime")
        private String plannedDeleteTime;

        @NameInMap("SecretName")
        private String secretName;

        @NameInMap("SecretType")
        private String secretType;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Secret(Builder builder) {
            this.createTime = builder.createTime;
            this.plannedDeleteTime = builder.plannedDeleteTime;
            this.secretName = builder.secretName;
            this.secretType = builder.secretType;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Secret create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return plannedDeleteTime
         */
        public String getPlannedDeleteTime() {
            return this.plannedDeleteTime;
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
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String plannedDeleteTime; 
            private String secretName; 
            private String secretType; 
            private Tags tags; 
            private String updateTime; 

            /**
             * The tag value.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The resource tags of the secret.
             * <p>
             * 
             * This parameter is not returned if you set the FetchTags parameter to false or do not specify the FetchTags parameter.
             */
            public Builder plannedDeleteTime(String plannedDeleteTime) {
                this.plannedDeleteTime = plannedDeleteTime;
                return this;
            }

            /**
             * The type of the secret. Valid values:
             * <p>
             * 
             * *   Generic: indicates a generic secret.
             * *   Rds: indicates a managed ApsaraDB RDS secret.
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * The time when the secret was created.
             */
            public Builder secretType(String secretType) {
                this.secretType = secretType;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The time when the secret is scheduled to be deleted.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Secret build() {
                return new Secret(this);
            } 

        } 

    }
    public static class SecretList extends TeaModel {
        @NameInMap("Secret")
        private java.util.List < Secret> secret;

        private SecretList(Builder builder) {
            this.secret = builder.secret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretList create() {
            return builder().build();
        }

        /**
         * @return secret
         */
        public java.util.List < Secret> getSecret() {
            return this.secret;
        }

        public static final class Builder {
            private java.util.List < Secret> secret; 

            /**
             * Secret.
             */
            public Builder secret(java.util.List < Secret> secret) {
                this.secret = secret;
                return this;
            }

            public SecretList build() {
                return new SecretList(this);
            } 

        } 

    }
}
