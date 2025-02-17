// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link DistributionSku} extends {@link TeaModel}
 *
 * <p>DistributionSku</p>
 */
public class DistributionSku extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliasTitle")
    private String aliasTitle;

    @com.aliyun.core.annotation.NameInMap("barCode")
    private String barCode;

    @com.aliyun.core.annotation.NameInMap("creditPeriod")
    private Integer creditPeriod;

    @com.aliyun.core.annotation.NameInMap("dxPrice")
    private Long dxPrice;

    @com.aliyun.core.annotation.NameInMap("hasCredit")
    private Boolean hasCredit;

    @com.aliyun.core.annotation.NameInMap("hasInvoice")
    private Boolean hasInvoice;

    @com.aliyun.core.annotation.NameInMap("jxPrice")
    private Long jxPrice;

    @com.aliyun.core.annotation.NameInMap("picUrl")
    private String picUrl;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.NameInMap("skuId")
    private String skuId;

    @com.aliyun.core.annotation.NameInMap("skuStatus")
    private String skuStatus;

    @com.aliyun.core.annotation.NameInMap("taxCode")
    private String taxCode;

    @com.aliyun.core.annotation.NameInMap("taxRate")
    private Integer taxRate;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private DistributionSku(Builder builder) {
        this.aliasTitle = builder.aliasTitle;
        this.barCode = builder.barCode;
        this.creditPeriod = builder.creditPeriod;
        this.dxPrice = builder.dxPrice;
        this.hasCredit = builder.hasCredit;
        this.hasInvoice = builder.hasInvoice;
        this.jxPrice = builder.jxPrice;
        this.picUrl = builder.picUrl;
        this.quantity = builder.quantity;
        this.skuId = builder.skuId;
        this.skuStatus = builder.skuStatus;
        this.taxCode = builder.taxCode;
        this.taxRate = builder.taxRate;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistributionSku create() {
        return builder().build();
    }

    /**
     * @return aliasTitle
     */
    public String getAliasTitle() {
        return this.aliasTitle;
    }

    /**
     * @return barCode
     */
    public String getBarCode() {
        return this.barCode;
    }

    /**
     * @return creditPeriod
     */
    public Integer getCreditPeriod() {
        return this.creditPeriod;
    }

    /**
     * @return dxPrice
     */
    public Long getDxPrice() {
        return this.dxPrice;
    }

    /**
     * @return hasCredit
     */
    public Boolean getHasCredit() {
        return this.hasCredit;
    }

    /**
     * @return hasInvoice
     */
    public Boolean getHasInvoice() {
        return this.hasInvoice;
    }

    /**
     * @return jxPrice
     */
    public Long getJxPrice() {
        return this.jxPrice;
    }

    /**
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return skuStatus
     */
    public String getSkuStatus() {
        return this.skuStatus;
    }

    /**
     * @return taxCode
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * @return taxRate
     */
    public Integer getTaxRate() {
        return this.taxRate;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String aliasTitle; 
        private String barCode; 
        private Integer creditPeriod; 
        private Long dxPrice; 
        private Boolean hasCredit; 
        private Boolean hasInvoice; 
        private Long jxPrice; 
        private String picUrl; 
        private Integer quantity; 
        private String skuId; 
        private String skuStatus; 
        private String taxCode; 
        private Integer taxRate; 
        private String title; 

        /**
         * aliasTitle.
         */
        public Builder aliasTitle(String aliasTitle) {
            this.aliasTitle = aliasTitle;
            return this;
        }

        /**
         * barCode.
         */
        public Builder barCode(String barCode) {
            this.barCode = barCode;
            return this;
        }

        /**
         * creditPeriod.
         */
        public Builder creditPeriod(Integer creditPeriod) {
            this.creditPeriod = creditPeriod;
            return this;
        }

        /**
         * dxPrice.
         */
        public Builder dxPrice(Long dxPrice) {
            this.dxPrice = dxPrice;
            return this;
        }

        /**
         * hasCredit.
         */
        public Builder hasCredit(Boolean hasCredit) {
            this.hasCredit = hasCredit;
            return this;
        }

        /**
         * hasInvoice.
         */
        public Builder hasInvoice(Boolean hasInvoice) {
            this.hasInvoice = hasInvoice;
            return this;
        }

        /**
         * jxPrice.
         */
        public Builder jxPrice(Long jxPrice) {
            this.jxPrice = jxPrice;
            return this;
        }

        /**
         * picUrl.
         */
        public Builder picUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        /**
         * quantity.
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * skuId.
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        /**
         * skuStatus.
         */
        public Builder skuStatus(String skuStatus) {
            this.skuStatus = skuStatus;
            return this;
        }

        /**
         * taxCode.
         */
        public Builder taxCode(String taxCode) {
            this.taxCode = taxCode;
            return this;
        }

        /**
         * taxRate.
         */
        public Builder taxRate(Integer taxRate) {
            this.taxRate = taxRate;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public DistributionSku build() {
            return new DistributionSku(this);
        } 

    } 

}
