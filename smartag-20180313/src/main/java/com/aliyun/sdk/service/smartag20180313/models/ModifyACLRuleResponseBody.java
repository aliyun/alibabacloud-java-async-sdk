// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ModifyACLRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyACLRuleResponseBody</p>
 */
public class ModifyACLRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.NameInMap("AcrId")
    private String acrId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DestCidr")
    private String destCidr;

    @com.aliyun.core.annotation.NameInMap("DestPortRange")
    private String destPortRange;

    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("DpiGroupIds")
    private DpiGroupIds dpiGroupIds;

    @com.aliyun.core.annotation.NameInMap("DpiSignatureIds")
    private DpiSignatureIds dpiSignatureIds;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceCidr")
    private String sourceCidr;

    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    private String sourcePortRange;

    private ModifyACLRuleResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.acrId = builder.acrId;
        this.description = builder.description;
        this.destCidr = builder.destCidr;
        this.destPortRange = builder.destPortRange;
        this.direction = builder.direction;
        this.dpiGroupIds = builder.dpiGroupIds;
        this.dpiSignatureIds = builder.dpiSignatureIds;
        this.gmtCreate = builder.gmtCreate;
        this.ipProtocol = builder.ipProtocol;
        this.name = builder.name;
        this.policy = builder.policy;
        this.priority = builder.priority;
        this.requestId = builder.requestId;
        this.sourceCidr = builder.sourceCidr;
        this.sourcePortRange = builder.sourcePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyACLRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return acrId
     */
    public String getAcrId() {
        return this.acrId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destCidr
     */
    public String getDestCidr() {
        return this.destCidr;
    }

    /**
     * @return destPortRange
     */
    public String getDestPortRange() {
        return this.destPortRange;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return dpiGroupIds
     */
    public DpiGroupIds getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    /**
     * @return dpiSignatureIds
     */
    public DpiSignatureIds getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceCidr
     */
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public static final class Builder {
        private String aclId; 
        private String acrId; 
        private String description; 
        private String destCidr; 
        private String destPortRange; 
        private String direction; 
        private DpiGroupIds dpiGroupIds; 
        private DpiSignatureIds dpiSignatureIds; 
        private Long gmtCreate; 
        private String ipProtocol; 
        private String name; 
        private String policy; 
        private Integer priority; 
        private String requestId; 
        private String sourceCidr; 
        private String sourcePortRange; 

        private Builder() {
        } 

        private Builder(ModifyACLRuleResponseBody model) {
            this.aclId = model.aclId;
            this.acrId = model.acrId;
            this.description = model.description;
            this.destCidr = model.destCidr;
            this.destPortRange = model.destPortRange;
            this.direction = model.direction;
            this.dpiGroupIds = model.dpiGroupIds;
            this.dpiSignatureIds = model.dpiSignatureIds;
            this.gmtCreate = model.gmtCreate;
            this.ipProtocol = model.ipProtocol;
            this.name = model.name;
            this.policy = model.policy;
            this.priority = model.priority;
            this.requestId = model.requestId;
            this.sourceCidr = model.sourceCidr;
            this.sourcePortRange = model.sourcePortRange;
        } 

        /**
         * <p>The ID of the ACL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-jdc7tir4fkplwr****</p>
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The ID of the access control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-r8hezn2pi39s5a****</p>
         */
        public Builder acrId(String acrId) {
            this.acrId = acrId;
            return this;
        }

        /**
         * <p>The description of the access control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The destination CIDR block.</p>
         * <p>The destination CIDR block is in CIDR format. For example: 192.168.10.0/24.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder destCidr(String destCidr) {
            this.destCidr = destCidr;
            return this;
        }

        /**
         * <p>The destination port range.</p>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        public Builder destPortRange(String destPortRange) {
            this.destPortRange = destPortRange;
            return this;
        }

        /**
         * <p>The direction in which the access control rule is applied. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound. This is the direction of traffic from an external network to the on-premises network where the Smart Access Gateway instance is deployed.</li>
         * <li><strong>out</strong>: outbound. This is the direction of traffic from the on-premises network where the Smart Access Gateway instance is deployed to an external network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * DpiGroupIds.
         */
        public Builder dpiGroupIds(DpiGroupIds dpiGroupIds) {
            this.dpiGroupIds = dpiGroupIds;
            return this;
        }

        /**
         * DpiSignatureIds.
         */
        public Builder dpiSignatureIds(DpiSignatureIds dpiSignatureIds) {
            this.dpiSignatureIds = dpiSignatureIds;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the access control rule was created.</p>
         * <p>The value is a UNIX timestamp. If rules have the same priority, the one with the smaller timestamp takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>1553777700000</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The protocol used by the access control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The name of the access control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>doctest</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The authorization policy of the access control rule.</p>
         * <ul>
         * <li><strong>accept</strong>: allows access.</li>
         * <li><strong>drop</strong>: denies access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The priority of the access control rule.</p>
         * <p>A smaller value indicates a higher priority. If rules have the same priority, the one that is first delivered to the Smart Access Gateway device takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F3DD2C1-0F6B-4575-9106-B2D50DF7A711</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source CIDR block.</p>
         * <p>The source CIDR block is in CIDR format. For example: 192.168.1.0/24.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder sourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * <p>The source port range.</p>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        public ModifyACLRuleResponseBody build() {
            return new ModifyACLRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyACLRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyACLRuleResponseBody</p>
     */
    public static class DpiGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiGroupId")
        private java.util.List<String> dpiGroupId;

        private DpiGroupIds(Builder builder) {
            this.dpiGroupId = builder.dpiGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiGroupIds create() {
            return builder().build();
        }

        /**
         * @return dpiGroupId
         */
        public java.util.List<String> getDpiGroupId() {
            return this.dpiGroupId;
        }

        public static final class Builder {
            private java.util.List<String> dpiGroupId; 

            private Builder() {
            } 

            private Builder(DpiGroupIds model) {
                this.dpiGroupId = model.dpiGroupId;
            } 

            /**
             * DpiGroupId.
             */
            public Builder dpiGroupId(java.util.List<String> dpiGroupId) {
                this.dpiGroupId = dpiGroupId;
                return this;
            }

            public DpiGroupIds build() {
                return new DpiGroupIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyACLRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyACLRuleResponseBody</p>
     */
    public static class DpiSignatureIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiSignatureId")
        private java.util.List<String> dpiSignatureId;

        private DpiSignatureIds(Builder builder) {
            this.dpiSignatureId = builder.dpiSignatureId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiSignatureIds create() {
            return builder().build();
        }

        /**
         * @return dpiSignatureId
         */
        public java.util.List<String> getDpiSignatureId() {
            return this.dpiSignatureId;
        }

        public static final class Builder {
            private java.util.List<String> dpiSignatureId; 

            private Builder() {
            } 

            private Builder(DpiSignatureIds model) {
                this.dpiSignatureId = model.dpiSignatureId;
            } 

            /**
             * DpiSignatureId.
             */
            public Builder dpiSignatureId(java.util.List<String> dpiSignatureId) {
                this.dpiSignatureId = dpiSignatureId;
                return this;
            }

            public DpiSignatureIds build() {
                return new DpiSignatureIds(this);
            } 

        } 

    }
}
