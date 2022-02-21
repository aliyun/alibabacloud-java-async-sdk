// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupAttributeResponseBody</p>
 */
public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    @NameInMap("AvailableGroupList")
    private AvailableGroupList availableGroupList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroupAttributeList")
    private SecurityGroupAttributeList securityGroupAttributeList;

    private DescribeSecurityGroupAttributeResponseBody(Builder builder) {
        this.availableGroupList = builder.availableGroupList;
        this.requestId = builder.requestId;
        this.securityGroupAttributeList = builder.securityGroupAttributeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableGroupList
     */
    public AvailableGroupList getAvailableGroupList() {
        return this.availableGroupList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupAttributeList
     */
    public SecurityGroupAttributeList getSecurityGroupAttributeList() {
        return this.securityGroupAttributeList;
    }

    public static final class Builder {
        private AvailableGroupList availableGroupList; 
        private String requestId; 
        private SecurityGroupAttributeList securityGroupAttributeList; 

        /**
         * AvailableGroupList.
         */
        public Builder availableGroupList(AvailableGroupList availableGroupList) {
            this.availableGroupList = availableGroupList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityGroupAttributeList.
         */
        public Builder securityGroupAttributeList(SecurityGroupAttributeList securityGroupAttributeList) {
            this.securityGroupAttributeList = securityGroupAttributeList;
            return this;
        }

        public DescribeSecurityGroupAttributeResponseBody build() {
            return new DescribeSecurityGroupAttributeResponseBody(this);
        } 

    } 

    public static class SecurityGroup extends TeaModel {
        @NameInMap("AvailableInstanceAmount")
        private Integer availableInstanceAmount;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcsCount")
        private Integer ecsCount;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupName")
        private String securityGroupName;

        @NameInMap("VpcId")
        private String vpcId;

        private SecurityGroup(Builder builder) {
            this.availableInstanceAmount = builder.availableInstanceAmount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ecsCount = builder.ecsCount;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
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
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
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
            private Integer ecsCount; 
            private String securityGroupId; 
            private String securityGroupName; 
            private String vpcId; 

            /**
             * AvailableInstanceAmount.
             */
            public Builder availableInstanceAmount(Integer availableInstanceAmount) {
                this.availableInstanceAmount = availableInstanceAmount;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EcsCount.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SecurityGroupName.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SecurityGroup build() {
                return new SecurityGroup(this);
            } 

        } 

    }
    public static class AvailableGroupList extends TeaModel {
        @NameInMap("SecurityGroup")
        private java.util.List < SecurityGroup> securityGroup;

        private AvailableGroupList(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableGroupList create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public java.util.List < SecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List < SecurityGroup> securityGroup; 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List < SecurityGroup> securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public AvailableGroupList build() {
                return new AvailableGroupList(this);
            } 

        } 

    }
    public static class SecurityGroupAttribute extends TeaModel {
        @NameInMap("BizContent")
        private String bizContent;

        @NameInMap("BizType")
        private String bizType;

        private SecurityGroupAttribute(Builder builder) {
            this.bizContent = builder.bizContent;
            this.bizType = builder.bizType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupAttribute create() {
            return builder().build();
        }

        /**
         * @return bizContent
         */
        public String getBizContent() {
            return this.bizContent;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        public static final class Builder {
            private String bizContent; 
            private String bizType; 

            /**
             * BizContent.
             */
            public Builder bizContent(String bizContent) {
                this.bizContent = bizContent;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            public SecurityGroupAttribute build() {
                return new SecurityGroupAttribute(this);
            } 

        } 

    }
    public static class SecurityGroupAttributeList extends TeaModel {
        @NameInMap("SecurityGroupAttribute")
        private java.util.List < SecurityGroupAttribute> securityGroupAttribute;

        private SecurityGroupAttributeList(Builder builder) {
            this.securityGroupAttribute = builder.securityGroupAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupAttributeList create() {
            return builder().build();
        }

        /**
         * @return securityGroupAttribute
         */
        public java.util.List < SecurityGroupAttribute> getSecurityGroupAttribute() {
            return this.securityGroupAttribute;
        }

        public static final class Builder {
            private java.util.List < SecurityGroupAttribute> securityGroupAttribute; 

            /**
             * SecurityGroupAttribute.
             */
            public Builder securityGroupAttribute(java.util.List < SecurityGroupAttribute> securityGroupAttribute) {
                this.securityGroupAttribute = securityGroupAttribute;
                return this;
            }

            public SecurityGroupAttributeList build() {
                return new SecurityGroupAttributeList(this);
            } 

        } 

    }
}
