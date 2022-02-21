// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityGroupResponseBody</p>
 */
public class ListSecurityGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroupList")
    private SecurityGroupList securityGroupList;

    private ListSecurityGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityGroupList = builder.securityGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupList
     */
    public SecurityGroupList getSecurityGroupList() {
        return this.securityGroupList;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityGroupList securityGroupList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityGroupList.
         */
        public Builder securityGroupList(SecurityGroupList securityGroupList) {
            this.securityGroupList = securityGroupList;
            return this;
        }

        public ListSecurityGroupResponseBody build() {
            return new ListSecurityGroupResponseBody(this);
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

        @NameInMap("SecurityGroupType")
        private String securityGroupType;

        @NameInMap("VpcId")
        private String vpcId;

        private SecurityGroup(Builder builder) {
            this.availableInstanceAmount = builder.availableInstanceAmount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ecsCount = builder.ecsCount;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.securityGroupType = builder.securityGroupType;
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
            private Integer ecsCount; 
            private String securityGroupId; 
            private String securityGroupName; 
            private String securityGroupType; 
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
             * SecurityGroupType.
             */
            public Builder securityGroupType(String securityGroupType) {
                this.securityGroupType = securityGroupType;
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
    public static class SecurityGroupList extends TeaModel {
        @NameInMap("SecurityGroup")
        private java.util.List < SecurityGroup> securityGroup;

        private SecurityGroupList(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupList create() {
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

            public SecurityGroupList build() {
                return new SecurityGroupList(this);
            } 

        } 

    }
}
