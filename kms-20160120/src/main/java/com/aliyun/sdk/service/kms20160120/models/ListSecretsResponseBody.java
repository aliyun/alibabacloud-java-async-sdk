// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretList")
    private SecretList secretList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListSecretsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.secretList = model.secretList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of returned secrets.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of secrets.</p>
         * 
         * <strong>example:</strong>
         * <p>6a6287a0-ff34-4780-a790-fdfca900557f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the secret was updated.</p>
         */
        public Builder secretList(SecretList secretList) {
            this.secretList = secretList;
            return this;
        }

        /**
         * <p>The secret name.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

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
    /**
     * 
     * {@link ListSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretsResponseBody</p>
     */
    public static class Secret extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("PlannedDeleteTime")
        private String plannedDeleteTime;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        @com.aliyun.core.annotation.NameInMap("SecretType")
        private String secretType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(Secret model) {
                this.createTime = model.createTime;
                this.plannedDeleteTime = model.plannedDeleteTime;
                this.secretName = model.secretName;
                this.secretType = model.secretType;
                this.tags = model.tags;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-17T07:59:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The resource tags of the secret.</p>
             * <p>This parameter is not returned if you set the FetchTags parameter to false or do not specify the FetchTags parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-17T07:59:05Z</p>
             */
            public Builder plannedDeleteTime(String plannedDeleteTime) {
                this.plannedDeleteTime = plannedDeleteTime;
                return this;
            }

            /**
             * <p>The type of the secret. Valid values:</p>
             * <ul>
             * <li>Generic: indicates a generic secret.</li>
             * <li>Rds: indicates a managed ApsaraDB RDS secret.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>secret001</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * <p>The time when the secret was created.</p>
             * 
             * <strong>example:</strong>
             * <p>Generic</p>
             */
            public Builder secretType(String secretType) {
                this.secretType = secretType;
                return this;
            }

            /**
             * <p>The tag key.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the secret is scheduled to be deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-17T07:59:05Z</p>
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
    /**
     * 
     * {@link ListSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecretsResponseBody</p>
     */
    public static class SecretList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Secret")
        private java.util.List<Secret> secret;

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
        public java.util.List<Secret> getSecret() {
            return this.secret;
        }

        public static final class Builder {
            private java.util.List<Secret> secret; 

            private Builder() {
            } 

            private Builder(SecretList model) {
                this.secret = model.secret;
            } 

            /**
             * Secret.
             */
            public Builder secret(java.util.List<Secret> secret) {
                this.secret = secret;
                return this;
            }

            public SecretList build() {
                return new SecretList(this);
            } 

        } 

    }
}
