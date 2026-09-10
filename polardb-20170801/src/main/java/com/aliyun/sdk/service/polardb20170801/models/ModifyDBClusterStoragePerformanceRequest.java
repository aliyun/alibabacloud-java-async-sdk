// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterStoragePerformanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterStoragePerformanceRequest</p>
 */
public class ModifyDBClusterStoragePerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private String burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private Integer provisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private ModifyDBClusterStoragePerformanceRequest(Builder builder) {
        super(builder);
        this.autoUseCoupon = builder.autoUseCoupon;
        this.burstingEnabled = builder.burstingEnabled;
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.modifyType = builder.modifyType;
        this.promotionCode = builder.promotionCode;
        this.provisionedIops = builder.provisionedIops;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterStoragePerformanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return burstingEnabled
     */
    public String getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return provisionedIops
     */
    public Integer getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterStoragePerformanceRequest, Builder> {
        private Boolean autoUseCoupon; 
        private String burstingEnabled; 
        private String clientToken; 
        private String DBClusterId; 
        private String modifyType; 
        private String promotionCode; 
        private Integer provisionedIops; 
        private Long resourceOwnerId; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterStoragePerformanceRequest request) {
            super(request);
            this.autoUseCoupon = request.autoUseCoupon;
            this.burstingEnabled = request.burstingEnabled;
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.modifyType = request.modifyType;
            this.promotionCode = request.promotionCode;
            this.provisionedIops = request.provisionedIops;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageType = request.storageType;
        } 

        /**
         * <p>Specifies whether to automatically use coupons. Valid values:</p>
         * <ul>
         * <li>true (default): uses coupons.</li>
         * <li>false: does not use coupons.</li>
         * </ul>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>Specifies whether to enable I/O performance burst for the ESSD AutoPL cloud disk. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled (default).</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when StorageType is set to ESSDAUTOPL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(String burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token is case-sensitive and can contain only ASCII characters. The token can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f******************</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The type of the specification change. Valid values: </p>
         * <ul>
         * <li><strong>Upgrade</strong>: upgrades the specifications.</li>
         * <li><strong>Downgrade</strong>: downgrades the specifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>The coupon code. If this parameter is not specified, the default coupon is used.</p>
         * 
         * <strong>example:</strong>
         * <p>727xxxxxx934</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p id="p_wyg_t4a_glm" props="china" icmsditafragmentmagic=1>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
         * <p id="p_6de_jxy_k2g" props="china" icmsditafragmentmagic=1>Baseline performance = min{1,800 + 50 × Capacity, 50000}.</p>
         * <note id="note_7kj_j0o_rgs" props="china" icmsditafragmentmagic=1>This parameter is supported only when StorageType is set to ESSDAUTOPL.</note>
         * 
         * <strong>example:</strong>
         * <p>2500</p>
         */
        public Builder provisionedIops(Integer provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The target storage type. Valid values for PolarDB Enterprise Edition:</p>
         * <ul>
         * <li><strong>PSL5</strong></li>
         * <li><strong>PSL4</strong></li>
         * </ul>
         * <p>Valid values for PolarDB for MySQL Standard Edition:</p>
         * <ul>
         * <li><strong>ESSDPL0</strong></li>
         * <li><strong>ESSDPL1</strong></li>
         * <li><strong>ESSDPL2</strong></li>
         * <li><strong>ESSDPL3</strong></li>
         * <li><strong>ESSDAUTOPL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ESSDAUTOPL</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public ModifyDBClusterStoragePerformanceRequest build() {
            return new ModifyDBClusterStoragePerformanceRequest(this);
        } 

    } 

}
