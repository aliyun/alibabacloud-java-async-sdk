// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIPv6TranslatorAclListAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorAclListAttributesResponseBody</p>
 */
public class DescribeIPv6TranslatorAclListAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclEntries")
    private AclEntries aclEntries;

    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.NameInMap("AclName")
    private String aclName;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIPv6TranslatorAclListAttributesResponseBody(Builder builder) {
        this.aclEntries = builder.aclEntries;
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPv6TranslatorAclListAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclEntries
     */
    public AclEntries getAclEntries() {
        return this.aclEntries;
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
        private AclEntries aclEntries; 
        private String aclId; 
        private String aclName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The ACLs.</p>
         */
        public Builder aclEntries(AclEntries aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * <p>The ACL ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transacl-bp1de2****</p>
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The name of the ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>acl1</p>
         */
        public Builder aclName(String aclName) {
            this.aclName = aclName;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIPv6TranslatorAclListAttributesResponseBody build() {
            return new DescribeIPv6TranslatorAclListAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIPv6TranslatorAclListAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIPv6TranslatorAclListAttributesResponseBody</p>
     */
    public static class AclEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclEntryComment")
        private String aclEntryComment;

        @com.aliyun.core.annotation.NameInMap("AclEntryId")
        private String aclEntryId;

        @com.aliyun.core.annotation.NameInMap("AclEntryIp")
        private String aclEntryIp;

        private AclEntry(Builder builder) {
            this.aclEntryComment = builder.aclEntryComment;
            this.aclEntryId = builder.aclEntryId;
            this.aclEntryIp = builder.aclEntryIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntry create() {
            return builder().build();
        }

        /**
         * @return aclEntryComment
         */
        public String getAclEntryComment() {
            return this.aclEntryComment;
        }

        /**
         * @return aclEntryId
         */
        public String getAclEntryId() {
            return this.aclEntryId;
        }

        /**
         * @return aclEntryIp
         */
        public String getAclEntryIp() {
            return this.aclEntryIp;
        }

        public static final class Builder {
            private String aclEntryComment; 
            private String aclEntryId; 
            private String aclEntryIp; 

            /**
             * <p>The remarks of the ACL entry.</p>
             * 
             * <strong>example:</strong>
             * <p>client IP</p>
             */
            public Builder aclEntryComment(String aclEntryComment) {
                this.aclEntryComment = aclEntryComment;
                return this;
            }

            /**
             * <p>The ID of the ACL entry.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv6transaclentry-bp105jrs****</p>
             */
            public Builder aclEntryId(String aclEntryId) {
                this.aclEntryId = aclEntryId;
                return this;
            }

            /**
             * <p>The IP address specified in the ACL entry.</p>
             * 
             * <strong>example:</strong>
             * <p>12ab:0:0:XXXX::0102/128</p>
             */
            public Builder aclEntryIp(String aclEntryIp) {
                this.aclEntryIp = aclEntryIp;
                return this;
            }

            public AclEntry build() {
                return new AclEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIPv6TranslatorAclListAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIPv6TranslatorAclListAttributesResponseBody</p>
     */
    public static class AclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclEntry")
        private java.util.List < AclEntry> aclEntry;

        private AclEntries(Builder builder) {
            this.aclEntry = builder.aclEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return aclEntry
         */
        public java.util.List < AclEntry> getAclEntry() {
            return this.aclEntry;
        }

        public static final class Builder {
            private java.util.List < AclEntry> aclEntry; 

            /**
             * AclEntry.
             */
            public Builder aclEntry(java.util.List < AclEntry> aclEntry) {
                this.aclEntry = aclEntry;
                return this;
            }

            public AclEntries build() {
                return new AclEntries(this);
            } 

        } 

    }
}
