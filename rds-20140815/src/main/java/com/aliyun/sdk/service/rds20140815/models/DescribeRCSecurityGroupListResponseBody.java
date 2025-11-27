// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCSecurityGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCSecurityGroupListResponseBody</p>
 */
public class DescribeRCSecurityGroupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RCSecurityGroups")
    private java.util.List<RCSecurityGroups> RCSecurityGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCSecurityGroupListResponseBody(Builder builder) {
        this.RCSecurityGroups = builder.RCSecurityGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCSecurityGroupListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return RCSecurityGroups
     */
    public java.util.List<RCSecurityGroups> getRCSecurityGroups() {
        return this.RCSecurityGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RCSecurityGroups> RCSecurityGroups; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRCSecurityGroupListResponseBody model) {
            this.RCSecurityGroups = model.RCSecurityGroups;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The basic information about the security groups.</p>
         */
        public Builder RCSecurityGroups(java.util.List<RCSecurityGroups> RCSecurityGroups) {
            this.RCSecurityGroups = RCSecurityGroups;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7A41C147-C8D0-4DAE-A1A2-17EBCD60DFA1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCSecurityGroupListResponseBody build() {
            return new DescribeRCSecurityGroupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCSecurityGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCSecurityGroupListResponseBody</p>
     */
    public static class RCSecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceAmount")
        private Integer availableInstanceAmount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupType")
        private String securityGroupType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private RCSecurityGroups(Builder builder) {
            this.availableInstanceAmount = builder.availableInstanceAmount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.instanceCount = builder.instanceCount;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupType = builder.securityGroupType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RCSecurityGroups create() {
            return builder().build();
        }

        /**
         * @return availableInstanceAmount
         */
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupType
         */
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer availableInstanceAmount; 
            private String creationTime; 
            private String description; 
            private Integer instanceCount; 
            private String securityGroupId; 
            private String securityGroupType; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(RCSecurityGroups model) {
                this.availableInstanceAmount = model.availableInstanceAmount;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.instanceCount = model.instanceCount;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupType = model.securityGroupType;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The number of instances that can be added to the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder availableInstanceAmount(Integer availableInstanceAmount) {
                this.availableInstanceAmount = availableInstanceAmount;
                return this;
            }

            /**
             * <p>The time when the security group was created. The time follows the ISO 8601 standard and is in the <code>yyyy-MM-ddThh:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-31T03:12:29Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>TestDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of instances that are added to the security group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2ze27hs990o2hn9****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The type of the security group. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: a normal security group.</li>
             * <li><strong>enterprise</strong>: an advanced security group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder securityGroupType(String securityGroupType) {
                this.securityGroupType = securityGroupType;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the security group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1opxu1zkhn****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public RCSecurityGroups build() {
                return new RCSecurityGroups(this);
            } 

        } 

    }
}
