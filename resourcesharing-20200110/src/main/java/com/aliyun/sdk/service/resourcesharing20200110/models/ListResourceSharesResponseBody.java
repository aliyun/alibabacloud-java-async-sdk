// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceSharesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceSharesResponseBody</p>
 */
public class ListResourceSharesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceShares")
    private java.util.List < ResourceShares> resourceShares;

    private ListResourceSharesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceShares = builder.resourceShares;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceSharesResponseBody create() {
        return builder().build();
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
     * @return resourceShares
     */
    public java.util.List < ResourceShares> getResourceShares() {
        return this.resourceShares;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceShares> resourceShares; 

        /**
         * <p>The <code>token</code> that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2F23CFB6-A721-4E90-AC1E-0E30FA8B45DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the resource shares.</p>
         */
        public Builder resourceShares(java.util.List < ResourceShares> resourceShares) {
            this.resourceShares = resourceShares;
            return this;
        }

        public ListResourceSharesResponseBody build() {
            return new ListResourceSharesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceSharesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceSharesResponseBody</p>
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
     * {@link ListResourceSharesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceSharesResponseBody</p>
     */
    public static class ResourceShares extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowExternalTargets")
        private Boolean allowExternalTargets;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareId")
        private String resourceShareId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareName")
        private String resourceShareName;

        @com.aliyun.core.annotation.NameInMap("ResourceShareOwner")
        private String resourceShareOwner;

        @com.aliyun.core.annotation.NameInMap("ResourceShareStatus")
        private String resourceShareStatus;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private ResourceShares(Builder builder) {
            this.allowExternalTargets = builder.allowExternalTargets;
            this.createTime = builder.createTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceShareId = builder.resourceShareId;
            this.resourceShareName = builder.resourceShareName;
            this.resourceShareOwner = builder.resourceShareOwner;
            this.resourceShareStatus = builder.resourceShareStatus;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceShares create() {
            return builder().build();
        }

        /**
         * @return allowExternalTargets
         */
        public Boolean getAllowExternalTargets() {
            return this.allowExternalTargets;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceShareId
         */
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        /**
         * @return resourceShareName
         */
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        /**
         * @return resourceShareOwner
         */
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        /**
         * @return resourceShareStatus
         */
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Boolean allowExternalTargets; 
            private String createTime; 
            private String resourceGroupId; 
            private String resourceShareId; 
            private String resourceShareName; 
            private String resourceShareOwner; 
            private String resourceShareStatus; 
            private java.util.List < Tags> tags; 
            private String updateTime; 

            /**
             * <p>Indicates whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
             * <ul>
             * <li>false: Resources in the resource share can be shared only with accounts in the resource directory.</li>
             * <li>true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowExternalTargets(Boolean allowExternalTargets) {
                this.allowExternalTargets = allowExternalTargets;
                return this;
            }

            /**
             * <p>The time when the resource share was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-03T02:20:31.292Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>rs-PqysnzIj****</p>
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * <p>The name of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * <p>The owner of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>151266687691****</p>
             */
            public Builder resourceShareOwner(String resourceShareOwner) {
                this.resourceShareOwner = resourceShareOwner;
                return this;
            }

            /**
             * <p>The status of the resource share. Valid values:</p>
             * <ul>
             * <li>Active: The resource share is enabled.</li>
             * <li>Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.</li>
             * <li>Deleting: The resource share is being deleted.</li>
             * <li>Deleted: The resource share is deleted.</li>
             * </ul>
             * <blockquote>
             * <p> The system deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder resourceShareStatus(String resourceShareStatus) {
                this.resourceShareStatus = resourceShareStatus;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the resource share was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-03T08:01:43.638Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResourceShares build() {
                return new ResourceShares(this);
            } 

        } 

    }
}
