// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link UpgradeAndroidInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpgradeAndroidInstanceGroupRequest</p>
 */
public class UpgradeAndroidInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncreaseNumberOfInstance")
    private Integer increaseNumberOfInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    private String instanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private UpgradeAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.increaseNumberOfInstance = builder.increaseNumberOfInstance;
        this.instanceGroupId = builder.instanceGroupId;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeAndroidInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return increaseNumberOfInstance
     */
    public Integer getIncreaseNumberOfInstance() {
        return this.increaseNumberOfInstance;
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    public static final class Builder extends Request.Builder<UpgradeAndroidInstanceGroupRequest, Builder> {
        private Boolean autoPay; 
        private Integer increaseNumberOfInstance; 
        private String instanceGroupId; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeAndroidInstanceGroupRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.increaseNumberOfInstance = request.increaseNumberOfInstance;
            this.instanceGroupId = request.instanceGroupId;
            this.promotionId = request.promotionId;
        } 

        /**
         * <p>Specifies whether to enable the auto-payment feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enables the auto-payment feature. Make sure that your Alibaba Cloud account has sufficient balance.</li>
         * <li>false: disables the auto-payment feature. You need to manually complete the payment process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The number of instances that you want to increase.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder increaseNumberOfInstance(Integer increaseNumberOfInstance) {
            this.putQueryParameter("IncreaseNumberOfInstance", increaseNumberOfInstance);
            this.increaseNumberOfInstance = increaseNumberOfInstance;
            return this;
        }

        /**
         * <p>The ID of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-asguicdjh****</p>
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        @Override
        public UpgradeAndroidInstanceGroupRequest build() {
            return new UpgradeAndroidInstanceGroupRequest(this);
        } 

    } 

}
