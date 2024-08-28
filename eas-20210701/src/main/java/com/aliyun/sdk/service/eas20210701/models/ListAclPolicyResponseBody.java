// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListAclPolicyResponseBody</p>
 */
public class ListAclPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("InternetAclPolicyList")
    private java.util.List < InternetAclPolicyList> internetAclPolicyList;

    @com.aliyun.core.annotation.NameInMap("IntranetVpcAclPolicyList")
    private java.util.List < IntranetVpcAclPolicyList> intranetVpcAclPolicyList;

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

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return internetAclPolicyList
     */
    public java.util.List < InternetAclPolicyList> getInternetAclPolicyList() {
        return this.internetAclPolicyList;
    }

    /**
     * @return intranetVpcAclPolicyList
     */
    public java.util.List < IntranetVpcAclPolicyList> getIntranetVpcAclPolicyList() {
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
        private java.util.List < InternetAclPolicyList> internetAclPolicyList; 
        private java.util.List < IntranetVpcAclPolicyList> intranetVpcAclPolicyList; 
        private String requestId; 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * InternetAclPolicyList.
         */
        public Builder internetAclPolicyList(java.util.List < InternetAclPolicyList> internetAclPolicyList) {
            this.internetAclPolicyList = internetAclPolicyList;
            return this;
        }

        /**
         * IntranetVpcAclPolicyList.
         */
        public Builder intranetVpcAclPolicyList(java.util.List < IntranetVpcAclPolicyList> intranetVpcAclPolicyList) {
            this.intranetVpcAclPolicyList = intranetVpcAclPolicyList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAclPolicyResponseBody build() {
            return new ListAclPolicyResponseBody(this);
        } 

    } 

    public static class InternetAclPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        private InternetAclPolicyList(Builder builder) {
            this.comment = builder.comment;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetAclPolicyList create() {
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

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Entry.
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public InternetAclPolicyList build() {
                return new InternetAclPolicyList(this);
            } 

        } 

    }
    public static class IntranetAclPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        private IntranetAclPolicyList(Builder builder) {
            this.comment = builder.comment;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntranetAclPolicyList create() {
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

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Entry.
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public IntranetAclPolicyList build() {
                return new IntranetAclPolicyList(this);
            } 

        } 

    }
    public static class IntranetVpcAclPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntranetAclPolicyList")
        private java.util.List < IntranetAclPolicyList> intranetAclPolicyList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private IntranetVpcAclPolicyList(Builder builder) {
            this.intranetAclPolicyList = builder.intranetAclPolicyList;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntranetVpcAclPolicyList create() {
            return builder().build();
        }

        /**
         * @return intranetAclPolicyList
         */
        public java.util.List < IntranetAclPolicyList> getIntranetAclPolicyList() {
            return this.intranetAclPolicyList;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < IntranetAclPolicyList> intranetAclPolicyList; 
            private String vpcId; 

            /**
             * IntranetAclPolicyList.
             */
            public Builder intranetAclPolicyList(java.util.List < IntranetAclPolicyList> intranetAclPolicyList) {
                this.intranetAclPolicyList = intranetAclPolicyList;
                return this;
            }

            /**
             * VpcId.
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
