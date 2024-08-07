// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIPv6TranslatorAclListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorAclListsResponseBody</p>
 */
public class DescribeIPv6TranslatorAclListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorAcls")
    private Ipv6TranslatorAcls ipv6TranslatorAcls;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIPv6TranslatorAclListsResponseBody(Builder builder) {
        this.ipv6TranslatorAcls = builder.ipv6TranslatorAcls;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPv6TranslatorAclListsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6TranslatorAcls
     */
    public Ipv6TranslatorAcls getIpv6TranslatorAcls() {
        return this.ipv6TranslatorAcls;
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
        private Ipv6TranslatorAcls ipv6TranslatorAcls; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of network ACLs.
         */
        public Builder ipv6TranslatorAcls(Ipv6TranslatorAcls ipv6TranslatorAcls) {
            this.ipv6TranslatorAcls = ipv6TranslatorAcls;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public DescribeIPv6TranslatorAclListsResponseBody build() {
            return new DescribeIPv6TranslatorAclListsResponseBody(this);
        } 

    } 

    public static class IPv6TranslatorAcl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AclName")
        private String aclName;

        private IPv6TranslatorAcl(Builder builder) {
            this.aclId = builder.aclId;
            this.aclName = builder.aclName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPv6TranslatorAcl create() {
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

        public static final class Builder {
            private String aclId; 
            private String aclName; 

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

            public IPv6TranslatorAcl build() {
                return new IPv6TranslatorAcl(this);
            } 

        } 

    }
    public static class Ipv6TranslatorAcls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv6TranslatorAcl")
        private java.util.List < IPv6TranslatorAcl> iPv6TranslatorAcl;

        private Ipv6TranslatorAcls(Builder builder) {
            this.iPv6TranslatorAcl = builder.iPv6TranslatorAcl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6TranslatorAcls create() {
            return builder().build();
        }

        /**
         * @return iPv6TranslatorAcl
         */
        public java.util.List < IPv6TranslatorAcl> getIPv6TranslatorAcl() {
            return this.iPv6TranslatorAcl;
        }

        public static final class Builder {
            private java.util.List < IPv6TranslatorAcl> iPv6TranslatorAcl; 

            /**
             * IPv6TranslatorAcl.
             */
            public Builder iPv6TranslatorAcl(java.util.List < IPv6TranslatorAcl> iPv6TranslatorAcl) {
                this.iPv6TranslatorAcl = iPv6TranslatorAcl;
                return this;
            }

            public Ipv6TranslatorAcls build() {
                return new Ipv6TranslatorAcls(this);
            } 

        } 

    }
}
