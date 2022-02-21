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
         * 访问控制列表
         */
        public Builder acls(java.util.List < Acls> acls) {
            this.acls = acls;
            return this;
        }

        /**
         * 本次查询返回记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总记录数
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAclsResponseBody build() {
            return new ListAclsResponseBody(this);
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

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private Acls(Builder builder) {
            this.aclId = builder.aclId;
            this.aclName = builder.aclName;
            this.aclStatus = builder.aclStatus;
            this.addressIPVersion = builder.addressIPVersion;
            this.configManagedEnabled = builder.configManagedEnabled;
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String aclId; 
            private String aclName; 
            private String aclStatus; 
            private String addressIPVersion; 
            private Boolean configManagedEnabled; 
            private String resourceGroupId; 

            /**
             * 访问控制策略id
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * 访问控制策略名称
             */
            public Builder aclName(String aclName) {
                this.aclName = aclName;
                return this;
            }

            /**
             * 状态
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * IP版本
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * 配置管理
             */
            public Builder configManagedEnabled(Boolean configManagedEnabled) {
                this.configManagedEnabled = configManagedEnabled;
                return this;
            }

            /**
             * 资源组ID
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public Acls build() {
                return new Acls(this);
            } 

        } 

    }
}
