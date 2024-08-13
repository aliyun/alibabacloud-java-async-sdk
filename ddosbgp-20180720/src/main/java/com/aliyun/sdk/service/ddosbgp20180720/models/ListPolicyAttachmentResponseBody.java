// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicyAttachmentResponseBody</p>
 */
public class ListPolicyAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttachmentList")
    private java.util.List < AttachmentList> attachmentList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListPolicyAttachmentResponseBody(Builder builder) {
        this.attachmentList = builder.attachmentList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyAttachmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return attachmentList
     */
    public java.util.List < AttachmentList> getAttachmentList() {
        return this.attachmentList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < AttachmentList> attachmentList; 
        private String requestId; 
        private Long total; 

        /**
         * The records of attachments to the mitigation policy.
         */
        public Builder attachmentList(java.util.List < AttachmentList> attachmentList) {
            this.attachmentList = attachmentList;
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
         * The total number of attachments to the mitigation policy.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListPolicyAttachmentResponseBody build() {
            return new ListPolicyAttachmentResponseBody(this);
        } 

    } 

    public static class AttachmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyRemark")
        private String policyRemark;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private AttachmentList(Builder builder) {
            this.ip = builder.ip;
            this.memberUid = builder.memberUid;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyRemark = builder.policyRemark;
            this.policyType = builder.policyType;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachmentList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyRemark
         */
        public String getPolicyRemark() {
            return this.policyRemark;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String ip; 
            private String memberUid; 
            private String policyId; 
            private String policyName; 
            private String policyRemark; 
            private String policyType; 
            private Integer port; 
            private String protocol; 
            private String region; 

            /**
             * The IP address of the protected object.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The UID of the member to which the IP address of the protected object belongs.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * The ID of the policy.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * PolicyRemark.
             */
            public Builder policyRemark(String policyRemark) {
                this.policyRemark = policyRemark;
                return this;
            }

            /**
             * The type of the policy. Valid values:
             * <p>
             * 
             * *   **l3**: IP-specific mitigation policies.
             * *   **l4**: port-specific mitigation policies.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The port number of the protected object.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type of the protected object. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **udp**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The region to which the IP address of the protected object belongs.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public AttachmentList build() {
                return new AttachmentList(this);
            } 

        } 

    }
}
