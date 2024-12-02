// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLicenseOrderDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLicenseOrderDetailsResponseBody</p>
 */
public class DescribeLicenseOrderDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivatedCodeCount")
    private Integer activatedCodeCount;

    @com.aliyun.core.annotation.NameInMap("ActivationCodeQuota")
    private Integer activationCodeQuota;

    @com.aliyun.core.annotation.NameInMap("AliyunOrderId")
    private String aliyunOrderId;

    @com.aliyun.core.annotation.NameInMap("AllowEmptySystemIdentifier")
    private Boolean allowEmptySystemIdentifier;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("IsVirtualOrder")
    private Boolean isVirtualOrder;

    @com.aliyun.core.annotation.NameInMap("IsVirtualOrderFrozen")
    private Boolean isVirtualOrderFrozen;

    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.NameInMap("PackageValidity")
    private String packageValidity;

    @com.aliyun.core.annotation.NameInMap("PurchaseChannel")
    private String purchaseChannel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualOrderId")
    private String virtualOrderId;

    private DescribeLicenseOrderDetailsResponseBody(Builder builder) {
        this.activatedCodeCount = builder.activatedCodeCount;
        this.activationCodeQuota = builder.activationCodeQuota;
        this.aliyunOrderId = builder.aliyunOrderId;
        this.allowEmptySystemIdentifier = builder.allowEmptySystemIdentifier;
        this.engine = builder.engine;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.isVirtualOrder = builder.isVirtualOrder;
        this.isVirtualOrderFrozen = builder.isVirtualOrderFrozen;
        this.packageType = builder.packageType;
        this.packageValidity = builder.packageValidity;
        this.purchaseChannel = builder.purchaseChannel;
        this.requestId = builder.requestId;
        this.virtualOrderId = builder.virtualOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLicenseOrderDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return activatedCodeCount
     */
    public Integer getActivatedCodeCount() {
        return this.activatedCodeCount;
    }

    /**
     * @return activationCodeQuota
     */
    public Integer getActivationCodeQuota() {
        return this.activationCodeQuota;
    }

    /**
     * @return aliyunOrderId
     */
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    /**
     * @return allowEmptySystemIdentifier
     */
    public Boolean getAllowEmptySystemIdentifier() {
        return this.allowEmptySystemIdentifier;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return isVirtualOrder
     */
    public Boolean getIsVirtualOrder() {
        return this.isVirtualOrder;
    }

    /**
     * @return isVirtualOrderFrozen
     */
    public Boolean getIsVirtualOrderFrozen() {
        return this.isVirtualOrderFrozen;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return packageValidity
     */
    public String getPackageValidity() {
        return this.packageValidity;
    }

    /**
     * @return purchaseChannel
     */
    public String getPurchaseChannel() {
        return this.purchaseChannel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualOrderId
     */
    public String getVirtualOrderId() {
        return this.virtualOrderId;
    }

    public static final class Builder {
        private Integer activatedCodeCount; 
        private Integer activationCodeQuota; 
        private String aliyunOrderId; 
        private Boolean allowEmptySystemIdentifier; 
        private String engine; 
        private String gmtCreated; 
        private String gmtModified; 
        private Boolean isVirtualOrder; 
        private Boolean isVirtualOrderFrozen; 
        private String packageType; 
        private String packageValidity; 
        private String purchaseChannel; 
        private String requestId; 
        private String virtualOrderId; 

        /**
         * <p>The number of generated activation codes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder activatedCodeCount(Integer activatedCodeCount) {
            this.activatedCodeCount = activatedCodeCount;
            return this;
        }

        /**
         * <p>The maximum number of activation codes that you can apply for.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder activationCodeQuota(Integer activationCodeQuota) {
            this.activationCodeQuota = activationCodeQuota;
            return this;
        }

        /**
         * <p>The Alibaba Cloud order ID (including the virtual order ID).</p>
         * 
         * <strong>example:</strong>
         * <p>239618016570503</p>
         */
        public Builder aliyunOrderId(String aliyunOrderId) {
            this.aliyunOrderId = aliyunOrderId;
            return this;
        }

        /**
         * <p>Indicates whether activation codes can be generated without the system identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowEmptySystemIdentifier(Boolean allowEmptySystemIdentifier) {
            this.allowEmptySystemIdentifier = allowEmptySystemIdentifier;
            return this;
        }

        /**
         * <p>The type of the engine. Valid values: PG, Oracle, and MySQL.</p>
         * 
         * <strong>example:</strong>
         * <p>PG</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The time when the order was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-19 01:13:45</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The time when the order was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Indicates whether the order is a virtual order (virtual orders allow pre-generation of activation codes).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isVirtualOrder(Boolean isVirtualOrder) {
            this.isVirtualOrder = isVirtualOrder;
            return this;
        }

        /**
         * <p>Indicates whether the virtual order is frozen (activation codes cannot be generated for a frozen virtual order).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isVirtualOrderFrozen(Boolean isVirtualOrderFrozen) {
            this.isVirtualOrderFrozen = isVirtualOrderFrozen;
            return this;
        }

        /**
         * <p>The plan type. Valid values:</p>
         * <ul>
         * <li>single_node_subscribe</li>
         * <li>single_node_long_term</li>
         * <li>primary_backup_subscribe</li>
         * <li>primary_backup_long_term</li>
         * <li>pre_generation_long_term</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pre_generation_long_term</p>
         */
        public Builder packageType(String packageType) {
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>The validity period of the plan, which is one year (common) or thirty years (long-term).</p>
         * 
         * <strong>example:</strong>
         * <p>1 year</p>
         */
        public Builder packageValidity(String packageValidity) {
            this.packageValidity = packageValidity;
            return this;
        }

        /**
         * <p>The plan validity period, one year (common) or thirty years (long-term).</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_market</p>
         */
        public Builder purchaseChannel(String purchaseChannel) {
            this.purchaseChannel = purchaseChannel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22C0ACF0-DD29-4B67-9190-B7A48C******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The virtual order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>239618016570503</p>
         */
        public Builder virtualOrderId(String virtualOrderId) {
            this.virtualOrderId = virtualOrderId;
            return this;
        }

        public DescribeLicenseOrderDetailsResponseBody build() {
            return new DescribeLicenseOrderDetailsResponseBody(this);
        } 

    } 

}
