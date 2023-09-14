// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAclsResponseBody</p>
 */
public class ListAclsResponseBody extends TeaModel {
    @NameInMap("Acls")
    private java.util.List < Acls> acls;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAclsResponseBody(Builder builder) {
        this.acls = builder.acls;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclsResponseBody create() {
        return builder().build();
    }

    /**
     * @return acls
     */
    public java.util.List < Acls> getAcls() {
        return this.acls;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Acls> acls; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The ACLs.
         */
        public Builder acls(java.util.List < Acls> acls) {
            this.acls = acls;
            return this;
        }

        /**
         * The maximum number of ACLs returned. This parameter is optional. Valid values: **1** to **100**. If this parameter is not specified, the default value **20** is returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If **NextToken** is returned, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAclsResponseBody build() {
            return new ListAclsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
    public static class Acls extends TeaModel {
        @NameInMap("AclId")
        private String aclId;

        @NameInMap("AclName")
        private String aclName;

        @NameInMap("AclStatus")
        private String aclStatus;

        @NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @NameInMap("ConfigManagedEnabled")
        private Boolean configManagedEnabled;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Acls(Builder builder) {
            this.aclId = builder.aclId;
            this.aclName = builder.aclName;
            this.aclStatus = builder.aclStatus;
            this.addressIPVersion = builder.addressIPVersion;
            this.configManagedEnabled = builder.configManagedEnabled;
            this.createTime = builder.createTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acls create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return aclName
         */
        public String getAclName() {
            return this.aclName;
        }

        /**
         * @return aclStatus
         */
        public String getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return addressIPVersion
         */
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        /**
         * @return configManagedEnabled
         */
        public Boolean getConfigManagedEnabled() {
            return this.configManagedEnabled;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String aclId; 
            private String aclName; 
            private String aclStatus; 
            private String addressIPVersion; 
            private Boolean configManagedEnabled; 
            private String createTime; 
            private String resourceGroupId; 
            private java.util.List < Tags> tags; 

            /**
             * The ACL ID.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * The ACL name.
             */
            public Builder aclName(String aclName) {
                this.aclName = aclName;
                return this;
            }

            /**
             * The status of the ACL. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Available**
             * *   **Configuring**
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * The IP version. Only **IPv4** may be returned.
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * Indicates whether configuration management is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder configManagedEnabled(Boolean configManagedEnabled) {
                this.configManagedEnabled = configManagedEnabled;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Acls build() {
                return new Acls(this);
            } 

        } 

    }
}
