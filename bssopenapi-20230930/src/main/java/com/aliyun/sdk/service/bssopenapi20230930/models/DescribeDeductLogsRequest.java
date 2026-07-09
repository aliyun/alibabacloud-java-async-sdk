// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DescribeDeductLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeductLogsRequest</p>
 */
public class DescribeDeductLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillInstanceId")
    private String billInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BillingCommodityCode")
    private String billingCommodityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BillingEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long billingEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BillingStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long billingStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RelationAccountIds")
    private java.util.List<Long> relationAccountIds;

    private DescribeDeductLogsRequest(Builder builder) {
        super(builder);
        this.billInstanceId = builder.billInstanceId;
        this.billingCommodityCode = builder.billingCommodityCode;
        this.billingEndTime = builder.billingEndTime;
        this.billingStartTime = builder.billingStartTime;
        this.commodityCode = builder.commodityCode;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.nbid = builder.nbid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.relationAccountIds = builder.relationAccountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeductLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billInstanceId
     */
    public String getBillInstanceId() {
        return this.billInstanceId;
    }

    /**
     * @return billingCommodityCode
     */
    public String getBillingCommodityCode() {
        return this.billingCommodityCode;
    }

    /**
     * @return billingEndTime
     */
    public Long getBillingEndTime() {
        return this.billingEndTime;
    }

    /**
     * @return billingStartTime
     */
    public Long getBillingStartTime() {
        return this.billingStartTime;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return relationAccountIds
     */
    public java.util.List<Long> getRelationAccountIds() {
        return this.relationAccountIds;
    }

    public static final class Builder extends Request.Builder<DescribeDeductLogsRequest, Builder> {
        private String billInstanceId; 
        private String billingCommodityCode; 
        private Long billingEndTime; 
        private Long billingStartTime; 
        private String commodityCode; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String group; 
        private String instanceId; 
        private String nbid; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List<Long> relationAccountIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeductLogsRequest request) {
            super(request);
            this.billInstanceId = request.billInstanceId;
            this.billingCommodityCode = request.billingCommodityCode;
            this.billingEndTime = request.billingEndTime;
            this.billingStartTime = request.billingStartTime;
            this.commodityCode = request.commodityCode;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.nbid = request.nbid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.relationAccountIds = request.relationAccountIds;
        } 

        /**
         * BillInstanceId.
         */
        public Builder billInstanceId(String billInstanceId) {
            this.putQueryParameter("BillInstanceId", billInstanceId);
            this.billInstanceId = billInstanceId;
            return this;
        }

        /**
         * BillingCommodityCode.
         */
        public Builder billingCommodityCode(String billingCommodityCode) {
            this.putBodyParameter("BillingCommodityCode", billingCommodityCode);
            this.billingCommodityCode = billingCommodityCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1679068799999</p>
         */
        public Builder billingEndTime(Long billingEndTime) {
            this.putBodyParameter("BillingEndTime", billingEndTime);
            this.billingEndTime = billingEndTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1647446400000</p>
         */
        public Builder billingStartTime(Long billingStartTime) {
            this.putBodyParameter("BillingStartTime", billingStartTime);
            this.billingStartTime = billingStartTime;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * EcIdAccountIds.
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            String ecIdAccountIdsShrink = shrink(ecIdAccountIds, "EcIdAccountIds", "json");
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIdsShrink);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putBodyParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RelationAccountIds.
         */
        public Builder relationAccountIds(java.util.List<Long> relationAccountIds) {
            String relationAccountIdsShrink = shrink(relationAccountIds, "RelationAccountIds", "json");
            this.putBodyParameter("RelationAccountIds", relationAccountIdsShrink);
            this.relationAccountIds = relationAccountIds;
            return this;
        }

        @Override
        public DescribeDeductLogsRequest build() {
            return new DescribeDeductLogsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeductLogsRequest} extends {@link TeaModel}
     *
     * <p>DescribeDeductLogsRequest</p>
     */
    public static class EcIdAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ecId;

        private EcIdAccountIds(Builder builder) {
            this.accountIds = builder.accountIds;
            this.ecId = builder.ecId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcIdAccountIds create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        public static final class Builder {
            private java.util.List<Long> accountIds; 
            private String ecId; 

            private Builder() {
            } 

            private Builder(EcIdAccountIds model) {
                this.accountIds = model.accountIds;
                this.ecId = model.ecId;
            } 

            /**
             * AccountIds.
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1004064243473974</p>
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            public EcIdAccountIds build() {
                return new EcIdAccountIds(this);
            } 

        } 

    }
}
