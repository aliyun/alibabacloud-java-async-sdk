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
 * {@link ModifyInstanceGroupSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceGroupSpecRequest</p>
 */
public class ModifyInstanceGroupSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIds")
    private java.util.List<String> instanceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceGroupSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private ModifyInstanceGroupSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.instanceGroupIds = builder.instanceGroupIds;
        this.instanceGroupSpec = builder.instanceGroupSpec;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceGroupSpecRequest create() {
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
     * @return instanceGroupIds
     */
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    /**
     * @return instanceGroupSpec
     */
    public String getInstanceGroupSpec() {
        return this.instanceGroupSpec;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceGroupSpecRequest, Builder> {
        private Boolean autoPay; 
        private java.util.List<String> instanceGroupIds; 
        private String instanceGroupSpec; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceGroupSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.instanceGroupIds = request.instanceGroupIds;
            this.instanceGroupSpec = request.instanceGroupSpec;
            this.promotionId = request.promotionId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong> (default): Only generates an order without deducting fees.</li>
         * </ul>
         * <blockquote>
         * <p>If your payment method balance is insufficient, set this parameter to false. An unpaid order is generated, and you can log on to the Cloud Phone console to complete the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The list of instance group IDs.</p>
         */
        public Builder instanceGroupIds(java.util.List<String> instanceGroupIds) {
            this.putQueryParameter("InstanceGroupIds", instanceGroupIds);
            this.instanceGroupIds = instanceGroupIds;
            return this;
        }

        /**
         * <p>The instance group specification. You can call <a href="~~DescribeSpec~~">DescribeSpec</a> to query the specifications available for purchase for cloud phones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        public Builder instanceGroupSpec(String instanceGroupSpec) {
            this.putQueryParameter("InstanceGroupSpec", instanceGroupSpec);
            this.instanceGroupSpec = instanceGroupSpec;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50003308011****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        @Override
        public ModifyInstanceGroupSpecRequest build() {
            return new ModifyInstanceGroupSpecRequest(this);
        } 

    } 

}
