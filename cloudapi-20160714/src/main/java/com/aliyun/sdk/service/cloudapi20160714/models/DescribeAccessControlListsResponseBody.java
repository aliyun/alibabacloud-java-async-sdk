// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessControlListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessControlListsResponseBody</p>
 */
public class DescribeAccessControlListsResponseBody extends TeaModel {
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

    private DescribeAccessControlListsResponseBody(Builder builder) {
        this.acls = builder.acls;
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

        /**
         * The ACLs.
         */
        public Builder acls(Acls acls) {
            this.acls = acls;
            return this;
        }

        /**
         * The page number of the current page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
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

        public DescribeAccessControlListsResponseBody build() {
            return new DescribeAccessControlListsResponseBody(this);
        } 

    } 

    public static class Acl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AclName")
        private String aclName;

        @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
        private String addressIPVersion;

        private Acl(Builder builder) {
            this.aclId = builder.aclId;
            this.aclName = builder.aclName;
            this.addressIPVersion = builder.addressIPVersion;
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

        public static final class Builder {
            private String aclId; 
            private String aclName; 
            private String addressIPVersion; 

            /**
             * The ID of the access control policy.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * The name of the access control policy.
             */
            public Builder aclName(String aclName) {
                this.aclName = aclName;
                return this;
            }

            /**
             * 访问控制策略组的IP版本。
             * <p>
             * - **IPv4**。
             * - **IPv6**。
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            public Acl build() {
                return new Acl(this);
            } 

        } 

    }
    public static class Acls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acl")
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
