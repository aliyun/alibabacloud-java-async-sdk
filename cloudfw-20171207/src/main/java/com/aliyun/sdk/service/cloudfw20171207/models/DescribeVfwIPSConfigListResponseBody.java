// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeVfwIPSConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVfwIPSConfigListResponseBody</p>
 */
public class DescribeVfwIPSConfigListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VfwIpsSwitchConfigList")
    private java.util.List<VfwIpsSwitchConfigList> vfwIpsSwitchConfigList;

    private DescribeVfwIPSConfigListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vfwIpsSwitchConfigList = builder.vfwIpsSwitchConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVfwIPSConfigListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return vfwIpsSwitchConfigList
     */
    public java.util.List<VfwIpsSwitchConfigList> getVfwIpsSwitchConfigList() {
        return this.vfwIpsSwitchConfigList;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VfwIpsSwitchConfigList> vfwIpsSwitchConfigList; 

        private Builder() {
        } 

        private Builder(DescribeVfwIPSConfigListResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vfwIpsSwitchConfigList = model.vfwIpsSwitchConfigList;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VfwIpsSwitchConfigList.
         */
        public Builder vfwIpsSwitchConfigList(java.util.List<VfwIpsSwitchConfigList> vfwIpsSwitchConfigList) {
            this.vfwIpsSwitchConfigList = vfwIpsSwitchConfigList;
            return this;
        }

        public DescribeVfwIPSConfigListResponseBody build() {
            return new DescribeVfwIPSConfigListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVfwIPSConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVfwIPSConfigListResponseBody</p>
     */
    public static class VfwIpsSwitchConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicRules")
        private Integer basicRules;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("PatchRules")
        private Integer patchRules;

        @com.aliyun.core.annotation.NameInMap("RuleClass")
        private Integer ruleClass;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private Integer runMode;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
        private String vpcFirewallId;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallIdList")
        private java.util.List<String> vpcFirewallIdList;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
        private String vpcFirewallName;

        private VfwIpsSwitchConfigList(Builder builder) {
            this.basicRules = builder.basicRules;
            this.memberUid = builder.memberUid;
            this.patchRules = builder.patchRules;
            this.ruleClass = builder.ruleClass;
            this.runMode = builder.runMode;
            this.vpcFirewallId = builder.vpcFirewallId;
            this.vpcFirewallIdList = builder.vpcFirewallIdList;
            this.vpcFirewallName = builder.vpcFirewallName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VfwIpsSwitchConfigList create() {
            return builder().build();
        }

        /**
         * @return basicRules
         */
        public Integer getBasicRules() {
            return this.basicRules;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return patchRules
         */
        public Integer getPatchRules() {
            return this.patchRules;
        }

        /**
         * @return ruleClass
         */
        public Integer getRuleClass() {
            return this.ruleClass;
        }

        /**
         * @return runMode
         */
        public Integer getRunMode() {
            return this.runMode;
        }

        /**
         * @return vpcFirewallId
         */
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        /**
         * @return vpcFirewallIdList
         */
        public java.util.List<String> getVpcFirewallIdList() {
            return this.vpcFirewallIdList;
        }

        /**
         * @return vpcFirewallName
         */
        public String getVpcFirewallName() {
            return this.vpcFirewallName;
        }

        public static final class Builder {
            private Integer basicRules; 
            private String memberUid; 
            private Integer patchRules; 
            private Integer ruleClass; 
            private Integer runMode; 
            private String vpcFirewallId; 
            private java.util.List<String> vpcFirewallIdList; 
            private String vpcFirewallName; 

            private Builder() {
            } 

            private Builder(VfwIpsSwitchConfigList model) {
                this.basicRules = model.basicRules;
                this.memberUid = model.memberUid;
                this.patchRules = model.patchRules;
                this.ruleClass = model.ruleClass;
                this.runMode = model.runMode;
                this.vpcFirewallId = model.vpcFirewallId;
                this.vpcFirewallIdList = model.vpcFirewallIdList;
                this.vpcFirewallName = model.vpcFirewallName;
            } 

            /**
             * BasicRules.
             */
            public Builder basicRules(Integer basicRules) {
                this.basicRules = basicRules;
                return this;
            }

            /**
             * MemberUid.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * PatchRules.
             */
            public Builder patchRules(Integer patchRules) {
                this.patchRules = patchRules;
                return this;
            }

            /**
             * RuleClass.
             */
            public Builder ruleClass(Integer ruleClass) {
                this.ruleClass = ruleClass;
                return this;
            }

            /**
             * RunMode.
             */
            public Builder runMode(Integer runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * VpcFirewallId.
             */
            public Builder vpcFirewallId(String vpcFirewallId) {
                this.vpcFirewallId = vpcFirewallId;
                return this;
            }

            /**
             * VpcFirewallIdList.
             */
            public Builder vpcFirewallIdList(java.util.List<String> vpcFirewallIdList) {
                this.vpcFirewallIdList = vpcFirewallIdList;
                return this;
            }

            /**
             * VpcFirewallName.
             */
            public Builder vpcFirewallName(String vpcFirewallName) {
                this.vpcFirewallName = vpcFirewallName;
                return this;
            }

            public VfwIpsSwitchConfigList build() {
                return new VfwIpsSwitchConfigList(this);
            } 

        } 

    }
}
