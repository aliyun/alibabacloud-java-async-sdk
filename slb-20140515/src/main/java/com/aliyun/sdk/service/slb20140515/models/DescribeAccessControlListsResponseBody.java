// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessControlListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessControlListsResponseBody</p>
 */
public class DescribeAccessControlListsResponseBody extends TeaModel {
    @NameInMap("Acls")
    private Acls acls;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccessControlListsResponseBody(Builder builder) {
        this.acls = builder.acls;
        this.count = builder.count;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessControlListsResponseBody create() {
        return builder().build();
    }

    /**
     * @return acls
     */
    public Acls getAcls() {
        return this.acls;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
        private Integer count; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Acls.
         */
        public Builder acls(Acls acls) {
            this.acls = acls;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccessControlListsResponseBody build() {
            return new DescribeAccessControlListsResponseBody(this);
        } 

    } 

    public static class Acl extends TeaModel {
        @NameInMap("AclId")
        private String aclId;

        @NameInMap("AclName")
        private String aclName;

        @NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private Acl(Builder builder) {
            this.aclId = builder.aclId;
            this.aclName = builder.aclName;
            this.addressIPVersion = builder.addressIPVersion;
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return aclName
         */
        public String getAclName() {
            return this.aclName;
        }

        /**
         * @return addressIPVersion
         */
        public String getAddressIPVersion() {
            return this.addressIPVersion;
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
            private String addressIPVersion; 
            private String resourceGroupId; 

            /**
             * AclId.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * AclName.
             */
            public Builder aclName(String aclName) {
                this.aclName = aclName;
                return this;
            }

            /**
             * AddressIPVersion.
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public Acl build() {
                return new Acl(this);
            } 

        } 

    }
    public static class Acls extends TeaModel {
        @NameInMap("Acl")
        private java.util.List < Acl> acl;

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
        public java.util.List < Acl> getAcl() {
            return this.acl;
        }

        public static final class Builder {
            private java.util.List < Acl> acl; 

            /**
             * Acl.
             */
            public Builder acl(java.util.List < Acl> acl) {
                this.acl = acl;
                return this;
            }

            public Acls build() {
                return new Acls(this);
            } 

        } 

    }
}
