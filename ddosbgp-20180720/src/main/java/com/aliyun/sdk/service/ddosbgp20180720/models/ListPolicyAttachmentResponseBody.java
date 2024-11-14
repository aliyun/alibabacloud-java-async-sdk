// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The records of attachments to the mitigation policy.</p>
         */
        public Builder attachmentList(java.util.List < AttachmentList> attachmentList) {
            this.attachmentList = attachmentList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4B379C2-9319-4C6B-B579-FE36831B09F4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of attachments to the mitigation policy.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListPolicyAttachmentResponseBody build() {
            return new ListPolicyAttachmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicyAttachmentResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicyAttachmentResponseBody</p>
     */
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
             * <p>The IP address of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>147.139.183.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The UID of the member to which the IP address of the protected object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>177699790631****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1b43f44e-65e1-411a-b0c0-d6c1********</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test**</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder policyRemark(String policyRemark) {
                this.policyRemark = policyRemark;
                return this;
            }

            /**
             * <p>The type of the policy. Valid values:</p>
             * <ul>
             * <li><strong>l3</strong>: IP-specific mitigation policies.</li>
             * <li><strong>l4</strong>: port-specific mitigation policies.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>l3</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The port number of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>8*</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type of the protected object. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>udp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The region to which the IP address of the protected object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
