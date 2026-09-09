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
 * {@link DescribeFrInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeFrInstancesRequest</p>
 */
public class DescribeFrInstancesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CapacityType")
    private String capacityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CycleType")
    private String cycleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTag")
    private String instanceTag;

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
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortRule")
    private String sortRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    private DescribeFrInstancesRequest(Builder builder) {
        super(builder);
        this.capacityType = builder.capacityType;
        this.commodityCode = builder.commodityCode;
        this.cycleType = builder.cycleType;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.endTime = builder.endTime;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.instanceTag = builder.instanceTag;
        this.nbid = builder.nbid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.sortField = builder.sortField;
        this.sortRule = builder.sortRule;
        this.spec = builder.spec;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFrInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityType
     */
    public String getCapacityType() {
        return this.capacityType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return cycleType
     */
    public String getCycleType() {
        return this.cycleType;
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return instanceTag
     */
    public String getInstanceTag() {
        return this.instanceTag;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortRule
     */
    public String getSortRule() {
        return this.sortRule;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<DescribeFrInstancesRequest, Builder> {
        private String capacityType; 
        private String commodityCode; 
        private String cycleType; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private Long endTime; 
        private String group; 
        private String instanceId; 
        private String instanceTag; 
        private String nbid; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productCode; 
        private String sortField; 
        private String sortRule; 
        private String spec; 
        private Long startTime; 
        private String status; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFrInstancesRequest request) {
            super(request);
            this.capacityType = request.capacityType;
            this.commodityCode = request.commodityCode;
            this.cycleType = request.cycleType;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.endTime = request.endTime;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.instanceTag = request.instanceTag;
            this.nbid = request.nbid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.sortField = request.sortField;
            this.sortRule = request.sortRule;
            this.spec = request.spec;
            this.startTime = request.startTime;
            this.status = request.status;
            this.templateCode = request.templateCode;
        } 

        /**
         * <p>The capacity type.</p>
         * 
         * <strong>example:</strong>
         * <p>deadlineAcc</p>
         */
        public Builder capacityType(String capacityType) {
            this.putBodyParameter("CapacityType", capacityType);
            this.capacityType = capacityType;
            return this;
        }

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>slb_albcubag_dp_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The cycle type.</p>
         * 
         * <strong>example:</strong>
         * <p>dynamicMonth</p>
         */
        public Builder cycleType(String cycleType) {
            this.putBodyParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * <p>The enterprise and account list. If empty, the current account is queried.</p>
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            String ecIdAccountIdsShrink = shrink(ecIdAccountIds, "EcIdAccountIds", "json");
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIdsShrink);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710604800000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The resource dimension for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>cu</p>
         */
        public Builder group(String group) {
            this.putBodyParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>alb_cubag*******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance tag label value of the resource plan instance.</p>
         * 
         * <strong>example:</strong>
         * <p>FR-***</p>
         */
        public Builder instanceTag(String instanceTag) {
            this.putQueryParameter("InstanceTag", instanceTag);
            this.instanceTag = instanceTag;
            return this;
        }

        /**
         * <p>The primary marketplace ID. If empty, the marketplace ID of the current user is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2684202000018</p>
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>startTime</p>
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * <p>The collation for sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortRule(String sortRule) {
            this.putBodyParameter("SortRule", sortRule);
            this.sortRule = sortRule;
            return this;
        }

        /**
         * <p>The specification.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1678939035000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>slb_albcubag*******</p>
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public DescribeFrInstancesRequest build() {
            return new DescribeFrInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFrInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeFrInstancesRequest</p>
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
             * <p>The account list to access. If empty, all accounts under the current entity ID are selected.</p>
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * <p>The enterprise entity ID.</p>
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
