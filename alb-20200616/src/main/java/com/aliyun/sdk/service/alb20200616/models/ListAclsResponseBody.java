// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListAclsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAclsResponseBody</p>
 */
public class ListAclsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Acls")
    private java.util.List<Acls> acls;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Acls> getAcls() {
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
        private java.util.List<Acls> acls; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>A list of ACLs.</p>
         */
        public Builder acls(java.util.List<Acls> acls) {
            this.acls = acls;
            return this;
        }

        /**
         * <p>The maximum number of network ACLs returned. This parameter is optional. Valid values: <strong>1</strong> to <strong>100</strong>. If this parameter is not set, the default value <strong>20</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, it indicates that no next query is to be sent.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70t****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAclsResponseBody build() {
            return new ListAclsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAclsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclsResponseBody</p>
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
             * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
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
     * {@link ListAclsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclsResponseBody</p>
     */
    public static class Acls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AclName")
        private String aclName;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private String aclStatus;

        @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @com.aliyun.core.annotation.NameInMap("ConfigManagedEnabled")
        private Boolean configManagedEnabled;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 

            /**
             * <p>The ACL ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nacl-hp34s2h0xx1ht4nwo****</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The name of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>test-acl</p>
             */
            public Builder aclName(String aclName) {
                this.aclName = aclName;
                return this;
            }

            /**
             * <p>The status of the ACL. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The network ACL is being created.</li>
             * <li><strong>Available</strong>: The network ACL is available.</li>
             * <li><strong>Configuring</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * <p>The IP version of the ACL. Only <strong>IPv4</strong> may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * <p>Indicates whether configuration management is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder configManagedEnabled(Boolean configManagedEnabled) {
                this.configManagedEnabled = configManagedEnabled;
                return this;
            }

            /**
             * <p>The time when the ACL was created. The follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-15T07:37:33Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-atstuj3rtopty****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Acls build() {
                return new Acls(this);
            } 

        } 

    }
}
