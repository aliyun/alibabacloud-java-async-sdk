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
 * {@link DescribeAccessInstanceVpcListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessInstanceVpcListResponseBody</p>
 */
public class DescribeAccessInstanceVpcListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcList")
    private java.util.List<VpcList> vpcList;

    private DescribeAccessInstanceVpcListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcList = builder.vpcList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessInstanceVpcListResponseBody create() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpcList
     */
    public java.util.List<VpcList> getVpcList() {
        return this.vpcList;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<VpcList> vpcList; 

        private Builder() {
        } 

        private Builder(DescribeAccessInstanceVpcListResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpcList = model.vpcList;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>450D47F5-956E-543E-8502-2F71C8C54E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of VPCs.</p>
         */
        public Builder vpcList(java.util.List<VpcList> vpcList) {
            this.vpcList = vpcList;
            return this;
        }

        public DescribeAccessInstanceVpcListResponseBody build() {
            return new DescribeAccessInstanceVpcListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessInstanceVpcListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessInstanceVpcListResponseBody</p>
     */
    public static class VpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirewallVpc")
        private Boolean firewallVpc;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private VpcList(Builder builder) {
            this.firewallVpc = builder.firewallVpc;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcList create() {
            return builder().build();
        }

        /**
         * @return firewallVpc
         */
        public Boolean getFirewallVpc() {
            return this.firewallVpc;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private Boolean firewallVpc; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(VpcList model) {
                this.firewallVpc = model.firewallVpc;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>Indicates whether the VPC is managed by Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder firewallVpc(Boolean firewallVpc) {
                this.firewallVpc = firewallVpc;
                return this;
            }

            /**
             * <p>The ID of the VPC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze1t4irqj0fljlbb****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud_Firewall_VPC</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
}
