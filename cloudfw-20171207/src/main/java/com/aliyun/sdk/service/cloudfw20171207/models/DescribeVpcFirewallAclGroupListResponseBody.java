// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVpcFirewallAclGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallAclGroupListResponseBody</p>
 */
public class DescribeVpcFirewallAclGroupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclGroupList")
    private java.util.List < AclGroupList> aclGroupList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The information about the policy groups.</p>
         */
        public Builder aclGroupList(java.util.List < AclGroupList> aclGroupList) {
            this.aclGroupList = aclGroupList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the policy groups that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVpcFirewallAclGroupListResponseBody build() {
            return new DescribeVpcFirewallAclGroupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallAclGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallAclGroupListResponseBody</p>
     */
    public static class AclGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclGroupId")
        private String aclGroupId;

        @com.aliyun.core.annotation.NameInMap("AclGroupName")
        private String aclGroupName;

        @com.aliyun.core.annotation.NameInMap("AclRuleCount")
        private Integer aclRuleCount;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
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
             * <p>The ID of the policy group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>If the VPC firewall is used to protect a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance.</p>
             * <p>Example: cen-ervw0g12b5jbw****</p>
             * </li>
             * <li><p>If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.</p>
             * <p>Example: vfw-a42bbb7b887148c9****</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vfw-a42bbb7b887148c9****</p>
             */
            public Builder aclGroupId(String aclGroupId) {
                this.aclGroupId = aclGroupId;
                return this;
            }

            /**
             * <p>The name of the policy group. Valid values:</p>
             * <ul>
             * <li>If the VPC firewall is used to protect a CEN instance, the value of this parameter is the name of the CEN instance.</li>
             * <li>If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance name of the VPC firewall.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>group_test</p>
             */
            public Builder aclGroupName(String aclGroupName) {
                this.aclGroupName = aclGroupName;
                return this;
            }

            /**
             * <p>The number of access control policies in the policy group.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder aclRuleCount(Integer aclRuleCount) {
                this.aclRuleCount = aclRuleCount;
                return this;
            }

            /**
             * <p>是否是默认防火墙。取值：</p>
             * <ul>
             * <li><strong>true</strong>：是默认防火墙。</li>
             * <li><strong>false</strong>：不是默认防火墙。</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>258039427902****</p>
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
