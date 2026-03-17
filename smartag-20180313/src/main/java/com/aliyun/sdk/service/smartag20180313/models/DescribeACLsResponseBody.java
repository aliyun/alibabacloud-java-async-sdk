// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeACLsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeACLsResponseBody</p>
 */
public class DescribeACLsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Acls")
    private Acls acls;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeACLsResponseBody(Builder builder) {
        this.acls = builder.acls;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeACLsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acls
     */
    public Acls getAcls() {
        return this.acls;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Acls acls; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeACLsResponseBody model) {
            this.acls = model.acls;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of ACLs.</p>
         */
        public Builder acls(Acls acls) {
            this.acls = acls;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>660F303F-C88E-4026-BC6A-FC24B78FD7EA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeACLsResponseBody build() {
            return new DescribeACLsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeACLsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeACLsResponseBody</p>
     */
    public static class Acl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SagCount")
        private String sagCount;

        private Acl(Builder builder) {
            this.aclId = builder.aclId;
            this.aclType = builder.aclType;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.sagCount = builder.sagCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acl create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sagCount
         */
        public String getSagCount() {
            return this.sagCount;
        }

        public static final class Builder {
            private String aclId; 
            private String aclType; 
            private String name; 
            private String resourceGroupId; 
            private String sagCount; 

            private Builder() {
            } 

            private Builder(Acl model) {
                this.aclId = model.aclId;
                this.aclType = model.aclType;
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
                this.sagCount = model.sagCount;
            } 

            /**
             * <p>The ID of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-xhwhyuo43l*******</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The type of the SAG instance associated with the ACL. Valid values:</p>
             * <ul>
             * <li><strong>acl-hardware</strong>: SAG CPE instance</li>
             * <li><strong>acl-software</strong>: SAG app instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acl-hardware</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>The name of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the ACL belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2iu4fnc****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The number of SAG instances associated with the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sagCount(String sagCount) {
                this.sagCount = sagCount;
                return this;
            }

            public Acl build() {
                return new Acl(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeACLsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeACLsResponseBody</p>
     */
    public static class Acls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acl")
        private java.util.List<Acl> acl;

        private Acls(Builder builder) {
            this.acl = builder.acl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acls create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public java.util.List<Acl> getAcl() {
            return this.acl;
        }

        public static final class Builder {
            private java.util.List<Acl> acl; 

            private Builder() {
            } 

            private Builder(Acls model) {
                this.acl = model.acl;
            } 

            /**
             * Acl.
             */
            public Builder acl(java.util.List<Acl> acl) {
                this.acl = acl;
                return this;
            }

            public Acls build() {
                return new Acls(this);
            } 

        } 

    }
}
