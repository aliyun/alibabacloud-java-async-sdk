// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessControlListAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessControlListAttributeResponseBody</p>
 */
public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    @NameInMap("AclEntrys")
    private AclEntrys aclEntrys;

    @NameInMap("AclId")
    private String aclId;

    @NameInMap("AclName")
    private String aclName;

    @NameInMap("IsUsed")
    private String isUsed;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAccessControlListAttributeResponseBody(Builder builder) {
        this.aclEntrys = builder.aclEntrys;
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.isUsed = builder.isUsed;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessControlListAttributeResponseBody create() {
        return builder().build();
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
     * @return isUsed
     */
    public String getIsUsed() {
        return this.isUsed;
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
        private String isUsed; 
        private String requestId; 

        /**
         * AclEntrys.
         */
        public Builder aclEntrys(AclEntrys aclEntrys) {
            this.aclEntrys = aclEntrys;
            return this;
        }

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
         * IsUsed.
         */
        public Builder isUsed(String isUsed) {
            this.isUsed = isUsed;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccessControlListAttributeResponseBody build() {
            return new DescribeAccessControlListAttributeResponseBody(this);
        } 

    } 

    public static class AclEntry extends TeaModel {
        @NameInMap("AclEntryComment")
        private String aclEntryComment;

        @NameInMap("AclEntryIp")
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

            /**
             * AclEntryComment.
             */
            public Builder aclEntryComment(String aclEntryComment) {
                this.aclEntryComment = aclEntryComment;
                return this;
            }

            /**
             * AclEntryIp.
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
    public static class AclEntrys extends TeaModel {
        @NameInMap("AclEntry")
        private java.util.List < AclEntry> aclEntry;

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

            public AclEntrys build() {
                return new AclEntrys(this);
            } 

        } 

    }
}
