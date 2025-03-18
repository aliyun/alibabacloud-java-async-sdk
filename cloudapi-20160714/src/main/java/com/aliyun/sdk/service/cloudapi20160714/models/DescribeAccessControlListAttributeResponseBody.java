// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeAccessControlListAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessControlListAttributeResponseBody</p>
 */
public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclEntrys")
    private AclEntrys aclEntrys;

    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.NameInMap("AclName")
    private String aclName;

    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccessControlListAttributeResponseBody(Builder builder) {
        this.aclEntrys = builder.aclEntrys;
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.addressIPVersion = builder.addressIPVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessControlListAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclEntrys
     */
    public AclEntrys getAclEntrys() {
        return this.aclEntrys;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AclEntrys aclEntrys; 
        private String aclId; 
        private String aclName; 
        private String addressIPVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAccessControlListAttributeResponseBody model) {
            this.aclEntrys = model.aclEntrys;
            this.aclId = model.aclId;
            this.aclName = model.aclName;
            this.addressIPVersion = model.addressIPVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the access control policy.</p>
         */
        public Builder aclEntrys(AclEntrys aclEntrys) {
            this.aclEntrys = aclEntrys;
            return this;
        }

        /**
         * <p>The ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-uf6fpfdg3b5muska7uqem</p>
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The name of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>testAcl</p>
         */
        public Builder aclName(String aclName) {
            this.aclName = aclName;
            return this;
        }

        /**
         * <p>The IP protocol version. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccessControlListAttributeResponseBody build() {
            return new DescribeAccessControlListAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessControlListAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessControlListAttributeResponseBody</p>
     */
    public static class AclEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclEntryComment")
        private String aclEntryComment;

        @com.aliyun.core.annotation.NameInMap("AclEntryIp")
        private String aclEntryIp;

        private AclEntry(Builder builder) {
            this.aclEntryComment = builder.aclEntryComment;
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
         * @return aclEntryIp
         */
        public String getAclEntryIp() {
            return this.aclEntryIp;
        }

        public static final class Builder {
            private String aclEntryComment; 
            private String aclEntryIp; 

            private Builder() {
            } 

            private Builder(AclEntry model) {
                this.aclEntryComment = model.aclEntryComment;
                this.aclEntryIp = model.aclEntryIp;
            } 

            /**
             * <p>The entry description.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder aclEntryComment(String aclEntryComment) {
                this.aclEntryComment = aclEntryComment;
                return this;
            }

            /**
             * <p>The ACL entry.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
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
     * {@link DescribeAccessControlListAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessControlListAttributeResponseBody</p>
     */
    public static class AclEntrys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclEntry")
        private java.util.List<AclEntry> aclEntry;

        private AclEntrys(Builder builder) {
            this.aclEntry = builder.aclEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntrys create() {
            return builder().build();
        }

        /**
         * @return aclEntry
         */
        public java.util.List<AclEntry> getAclEntry() {
            return this.aclEntry;
        }

        public static final class Builder {
            private java.util.List<AclEntry> aclEntry; 

            private Builder() {
            } 

            private Builder(AclEntrys model) {
                this.aclEntry = model.aclEntry;
            } 

            /**
             * AclEntry.
             */
            public Builder aclEntry(java.util.List<AclEntry> aclEntry) {
                this.aclEntry = aclEntry;
                return this;
            }

            public AclEntrys build() {
                return new AclEntrys(this);
            } 

        } 

    }
}
