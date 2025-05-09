// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListAclPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListAclPolicyResponseBody</p>
 */
public class ListAclPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("InternetAclPolicyList")
    private java.util.List<InternetAclPolicyList> internetAclPolicyList;

    @com.aliyun.core.annotation.NameInMap("IntranetVpcAclPolicyList")
    private java.util.List<IntranetVpcAclPolicyList> intranetVpcAclPolicyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAclPolicyResponseBody(Builder builder) {
        this.gatewayId = builder.gatewayId;
        this.internetAclPolicyList = builder.internetAclPolicyList;
        this.intranetVpcAclPolicyList = builder.intranetVpcAclPolicyList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return internetAclPolicyList
     */
    public java.util.List<InternetAclPolicyList> getInternetAclPolicyList() {
        return this.internetAclPolicyList;
    }

    /**
     * @return intranetVpcAclPolicyList
     */
    public java.util.List<IntranetVpcAclPolicyList> getIntranetVpcAclPolicyList() {
        return this.intranetVpcAclPolicyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String gatewayId; 
        private java.util.List<InternetAclPolicyList> internetAclPolicyList; 
        private java.util.List<IntranetVpcAclPolicyList> intranetVpcAclPolicyList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAclPolicyResponseBody model) {
            this.gatewayId = model.gatewayId;
            this.internetAclPolicyList = model.internetAclPolicyList;
            this.intranetVpcAclPolicyList = model.intranetVpcAclPolicyList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The private gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The access control policies of the private gateway over the Internet.</p>
         */
        public Builder internetAclPolicyList(java.util.List<InternetAclPolicyList> internetAclPolicyList) {
            this.internetAclPolicyList = internetAclPolicyList;
            return this;
        }

        /**
         * <p>The access control policies of the private gateway over the internal network.</p>
         */
        public Builder intranetVpcAclPolicyList(java.util.List<IntranetVpcAclPolicyList> intranetVpcAclPolicyList) {
            this.intranetVpcAclPolicyList = intranetVpcAclPolicyList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAclPolicyResponseBody build() {
            return new ListAclPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAclPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclPolicyResponseBody</p>
     */
    public static class AclPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        private AclPolicyList(Builder builder) {
            this.comment = builder.comment;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclPolicyList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String comment; 
            private String entry; 

            private Builder() {
            } 

            private Builder(AclPolicyList model) {
                this.comment = model.comment;
                this.entry = model.entry;
            } 

            /**
             * <p>The comment on the IP CIDR block in the VPC that can access the private gateway over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The IP CIDR block in the VPC that can access the private gateway over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>10.23.XX.XX/32</p>
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public AclPolicyList build() {
                return new AclPolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAclPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclPolicyResponseBody</p>
     */
    public static class InternetAclPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclPolicyList")
        private java.util.List<AclPolicyList> aclPolicyList;

        private InternetAclPolicyList(Builder builder) {
            this.aclPolicyList = builder.aclPolicyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetAclPolicyList create() {
            return builder().build();
        }

        /**
         * @return aclPolicyList
         */
        public java.util.List<AclPolicyList> getAclPolicyList() {
            return this.aclPolicyList;
        }

        public static final class Builder {
            private java.util.List<AclPolicyList> aclPolicyList; 

            private Builder() {
            } 

            private Builder(InternetAclPolicyList model) {
                this.aclPolicyList = model.aclPolicyList;
            } 

            /**
             * <p>The whitelisted IP CIDR blocks in the VPC that can access the private gateway over the Internet.</p>
             */
            public Builder aclPolicyList(java.util.List<AclPolicyList> aclPolicyList) {
                this.aclPolicyList = aclPolicyList;
                return this;
            }

            public InternetAclPolicyList build() {
                return new InternetAclPolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAclPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclPolicyResponseBody</p>
     */
    public static class IntranetVpcAclPolicyListAclPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        private IntranetVpcAclPolicyListAclPolicyList(Builder builder) {
            this.comment = builder.comment;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntranetVpcAclPolicyListAclPolicyList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String comment; 
            private String entry; 

            private Builder() {
            } 

            private Builder(IntranetVpcAclPolicyListAclPolicyList model) {
                this.comment = model.comment;
                this.entry = model.entry;
            } 

            /**
             * <p>The comment on the IP CIDR block in the VPC that can access the private gateway over the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Entry</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The IP CIDR block in the VPC that can access the private gateway over the internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public IntranetVpcAclPolicyListAclPolicyList build() {
                return new IntranetVpcAclPolicyListAclPolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAclPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclPolicyResponseBody</p>
     */
    public static class IntranetVpcAclPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclPolicyList")
        private java.util.List<IntranetVpcAclPolicyListAclPolicyList> aclPolicyList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private IntranetVpcAclPolicyList(Builder builder) {
            this.aclPolicyList = builder.aclPolicyList;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntranetVpcAclPolicyList create() {
            return builder().build();
        }

        /**
         * @return aclPolicyList
         */
        public java.util.List<IntranetVpcAclPolicyListAclPolicyList> getAclPolicyList() {
            return this.aclPolicyList;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<IntranetVpcAclPolicyListAclPolicyList> aclPolicyList; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(IntranetVpcAclPolicyList model) {
                this.aclPolicyList = model.aclPolicyList;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The whitelisted IP CIDR blocks in the VPC that can access the private gateway over the internal network.</p>
             */
            public Builder aclPolicyList(java.util.List<IntranetVpcAclPolicyListAclPolicyList> aclPolicyList) {
                this.aclPolicyList = aclPolicyList;
                return this;
            }

            /**
             * <p>The VPC ID. For more information about how to obtain the VPC ID, see DescribeVpcs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf66uio7md****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public IntranetVpcAclPolicyList build() {
                return new IntranetVpcAclPolicyList(this);
            } 

        } 

    }
}
