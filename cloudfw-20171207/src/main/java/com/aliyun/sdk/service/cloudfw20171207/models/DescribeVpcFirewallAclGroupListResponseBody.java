// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallAclGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallAclGroupListResponseBody</p>
 */
public class DescribeVpcFirewallAclGroupListResponseBody extends TeaModel {
    @NameInMap("AclGroupList")
    private java.util.List < AclGroupList> aclGroupList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVpcFirewallAclGroupListResponseBody(Builder builder) {
        this.aclGroupList = builder.aclGroupList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallAclGroupListResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclGroupList
     */
    public java.util.List < AclGroupList> getAclGroupList() {
        return this.aclGroupList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AclGroupList> aclGroupList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the policy groups.
         */
        public Builder aclGroupList(java.util.List < AclGroupList> aclGroupList) {
            this.aclGroupList = aclGroupList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the policy groups that are returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVpcFirewallAclGroupListResponseBody build() {
            return new DescribeVpcFirewallAclGroupListResponseBody(this);
        } 

    } 

    public static class AclGroupList extends TeaModel {
        @NameInMap("AclGroupId")
        private String aclGroupId;

        @NameInMap("AclGroupName")
        private String aclGroupName;

        @NameInMap("AclRuleCount")
        private Integer aclRuleCount;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("MemberUid")
        private String memberUid;

        private AclGroupList(Builder builder) {
            this.aclGroupId = builder.aclGroupId;
            this.aclGroupName = builder.aclGroupName;
            this.aclRuleCount = builder.aclRuleCount;
            this.isDefault = builder.isDefault;
            this.memberUid = builder.memberUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclGroupList create() {
            return builder().build();
        }

        /**
         * @return aclGroupId
         */
        public String getAclGroupId() {
            return this.aclGroupId;
        }

        /**
         * @return aclGroupName
         */
        public String getAclGroupName() {
            return this.aclGroupName;
        }

        /**
         * @return aclRuleCount
         */
        public Integer getAclRuleCount() {
            return this.aclRuleCount;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        public static final class Builder {
            private String aclGroupId; 
            private String aclGroupName; 
            private Integer aclRuleCount; 
            private Boolean isDefault; 
            private String memberUid; 

            /**
             * The ID of the policy group.
             * <p>
             * 
             * Valid values:
             * 
             * *   If the VPC firewall is used to protect a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance.
             * 
             *     Example: cen-ervw0g12b5jbw\*\*\*\*
             * 
             * *   If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.
             * 
             *     Example: vfw-a42bbb7b887148c9\*\*\*\*
             */
            public Builder aclGroupId(String aclGroupId) {
                this.aclGroupId = aclGroupId;
                return this;
            }

            /**
             * The name of the policy group. Valid values:
             * <p>
             * 
             * *   If the VPC firewall is used to protect a CEN instance, the value of this parameter is the name of the CEN instance.
             * *   If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance name of the VPC firewall.
             */
            public Builder aclGroupName(String aclGroupName) {
                this.aclGroupName = aclGroupName;
                return this;
            }

            /**
             * The number of access control policies in the policy group.
             */
            public Builder aclRuleCount(Integer aclRuleCount) {
                this.aclRuleCount = aclRuleCount;
                return this;
            }

            /**
             * 是否是默认防火墙。取值：
             * <p>
             * - **true**：是默认防火墙。
             * - **false**：不是默认防火墙。
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The UID of the member that is managed by your Alibaba Cloud account.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            public AclGroupList build() {
                return new AclGroupList(this);
            } 

        } 

    }
}
