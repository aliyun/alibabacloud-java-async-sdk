// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyWuyingServerSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyWuyingServerSpecRequest</p>
 */
public class ModifyWuyingServerSpecRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AfterStatus")
    private String afterStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerInstanceType")
    private String serverInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    private String wuyingServerId;

    private ModifyWuyingServerSpecRequest(Builder builder) {
        super(builder);
        this.afterStatus = builder.afterStatus;
        this.productType = builder.productType;
        this.promotionId = builder.promotionId;
        this.serverInstanceType = builder.serverInstanceType;
        this.wuyingServerId = builder.wuyingServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWuyingServerSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return afterStatus
     */
    public String getAfterStatus() {
        return this.afterStatus;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return serverInstanceType
     */
    public String getServerInstanceType() {
        return this.serverInstanceType;
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public static final class Builder extends Request.Builder<ModifyWuyingServerSpecRequest, Builder> {
        private String afterStatus; 
        private String productType; 
        private String promotionId; 
        private String serverInstanceType; 
        private String wuyingServerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWuyingServerSpecRequest request) {
            super(request);
            this.afterStatus = request.afterStatus;
            this.productType = request.productType;
            this.promotionId = request.promotionId;
            this.serverInstanceType = request.serverInstanceType;
            this.wuyingServerId = request.wuyingServerId;
        } 

        /**
         * <p>The status after the specification change is complete.</p>
         * <ul>
         * <li><code>stopped</code>: Shuts down the workstation after the specification change is complete.</li>
         * </ul>
         * <p>This option applies to Enterprise Edition or container workstations that support this setting.</p>
         * 
         * <strong>example:</strong>
         * <p>stopped</p>
         */
        public Builder afterStatus(String afterStatus) {
            this.putBodyParameter("AfterStatus", afterStatus);
            this.afterStatus = afterStatus;
            return this;
        }

        /**
         * <p>The product type of the target workstation. It must match the actual type of the resource. For Enterprise Edition workstations, use <code>WuyingServer</code>. If this parameter is omitted, <code>WuyingServer</code> is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The ID of the promotion. It is used to identify a promotional event or coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>17440009****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putBodyParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The ID of the target workstation specification. This parameter is required when you call the operation. Select a specification that is available in the region where the workstation is located and compatible with existing resources.</p>
         * <p><strong>Limits:</strong> Conversion between CPU specifications and GPU specifications is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.proworkstation_flagship_elite_ne.96c384g.192g4x</p>
         */
        public Builder serverInstanceType(String serverInstanceType) {
            this.putBodyParameter("ServerInstanceType", serverInstanceType);
            this.serverInstanceType = serverInstanceType;
            return this;
        }

        /**
         * <p>The ID of the workstation whose specifications you want to change. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0bw2f11****dial</p>
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        @Override
        public ModifyWuyingServerSpecRequest build() {
            return new ModifyWuyingServerSpecRequest(this);
        } 

    } 

}
