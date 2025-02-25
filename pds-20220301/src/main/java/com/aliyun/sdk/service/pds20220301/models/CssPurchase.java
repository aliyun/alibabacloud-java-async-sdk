// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CssPurchase} extends {@link TeaModel}
 *
 * <p>CssPurchase</p>
 */
public class CssPurchase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("commodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("endDate")
    private Long endDate;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("instanceComponents")
    private java.util.List<CssInstanceComponent> instanceComponents;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("orderType")
    private String orderType;

    @com.aliyun.core.annotation.NameInMap("purchaseParams")
    private java.util.Map<String, String> purchaseParams;

    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    private CssPurchase(Builder builder) {
        this.chargeType = builder.chargeType;
        this.commodityCode = builder.commodityCode;
        this.endDate = builder.endDate;
        this.gmtCreate = builder.gmtCreate;
        this.instanceComponents = builder.instanceComponents;
        this.instanceId = builder.instanceId;
        this.orderType = builder.orderType;
        this.purchaseParams = builder.purchaseParams;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CssPurchase create() {
        return builder().build();
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return instanceComponents
     */
    public java.util.List<CssInstanceComponent> getInstanceComponents() {
        return this.instanceComponents;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return purchaseParams
     */
    public java.util.Map<String, String> getPurchaseParams() {
        return this.purchaseParams;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder {
        private String chargeType; 
        private String commodityCode; 
        private Long endDate; 
        private Long gmtCreate; 
        private java.util.List<CssInstanceComponent> instanceComponents; 
        private String instanceId; 
        private String orderType; 
        private java.util.Map<String, String> purchaseParams; 
        private Long startDate; 

        /**
         * chargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * commodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * instanceComponents.
         */
        public Builder instanceComponents(java.util.List<CssInstanceComponent> instanceComponents) {
            this.instanceComponents = instanceComponents;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * orderType.
         */
        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        /**
         * purchaseParams.
         */
        public Builder purchaseParams(java.util.Map<String, String> purchaseParams) {
            this.purchaseParams = purchaseParams;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }

        public CssPurchase build() {
            return new CssPurchase(this);
        } 

    } 

}
