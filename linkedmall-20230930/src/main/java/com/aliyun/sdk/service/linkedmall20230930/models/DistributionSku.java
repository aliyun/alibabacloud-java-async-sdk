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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DistributionSku model) {
            this.aliasTitle = model.aliasTitle;
            this.barCode = model.barCode;
            this.creditPeriod = model.creditPeriod;
            this.dxPrice = model.dxPrice;
            this.hasCredit = model.hasCredit;
            this.hasInvoice = model.hasInvoice;
            this.jxPrice = model.jxPrice;
            this.picUrl = model.picUrl;
            this.quantity = model.quantity;
            this.skuId = model.skuId;
            this.skuStatus = model.skuStatus;
            this.taxCode = model.taxCode;
            this.taxRate = model.taxRate;
            this.title = model.title;
        } 

        /**
         * <p>The alias.</p>
         * 
         * <strong>example:</strong>
         * <p>示例规格</p>
         */
        public Builder aliasTitle(String aliasTitle) {
            this.aliasTitle = aliasTitle;
            return this;
        }

        /**
         * <p>The barcode.</p>
         * 
         * <strong>example:</strong>
         * <p>6901234567892</p>
         */
        public Builder barCode(String barCode) {
            this.barCode = barCode;
            return this;
        }

        /**
         * <p>The maximum acceptable credit period.</p>
         */
        public Builder creditPeriod(Integer creditPeriod) {
            this.creditPeriod = creditPeriod;
            return this;
        }

        /**
         * <p>The consignment supply price.</p>
         */
        public Builder dxPrice(Long dxPrice) {
            this.dxPrice = dxPrice;
            return this;
        }

        /**
         * <p>Specifies whether credit periods are supported.</p>
         */
        public Builder hasCredit(Boolean hasCredit) {
            this.hasCredit = hasCredit;
            return this;
        }

        /**
         * <p>Specifies whether invoicing is supported.</p>
         */
        public Builder hasInvoice(Boolean hasInvoice) {
            this.hasInvoice = hasInvoice;
            return this;
        }

        /**
         * <p>The distribution supply price.</p>
         */
        public Builder jxPrice(Long jxPrice) {
            this.jxPrice = jxPrice;
            return this;
        }

        /**
         * <p>The image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/images/product.png">https://example.com/images/product.png</a></p>
         */
        public Builder picUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        /**
         * <p>The inventory.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>sku id</p>
         * 
         * <strong>example:</strong>
         * <p>660460842235822082</p>
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        /**
         * <p>The status.</p>
         */
        public Builder skuStatus(String skuStatus) {
            this.skuStatus = skuStatus;
            return this;
        }

        /**
         * <p>The tax code.</p>
         */
        public Builder taxCode(String taxCode) {
            this.taxCode = taxCode;
            return this;
        }

        /**
         * <p>The tax rate.</p>
         */
        public Builder taxRate(Integer taxRate) {
            this.taxRate = taxRate;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>示例商品名称</p>
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
