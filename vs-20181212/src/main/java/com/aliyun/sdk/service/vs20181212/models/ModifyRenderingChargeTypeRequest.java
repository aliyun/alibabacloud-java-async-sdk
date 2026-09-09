// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ModifyRenderingChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyRenderingChargeTypeRequest</p>
 */
public class ModifyRenderingChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceBillingCycle")
    private String instanceBillingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private ModifyRenderingChargeTypeRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.instanceBillingCycle = builder.instanceBillingCycle;
        this.instanceChargeType = builder.instanceChargeType;
        this.period = builder.period;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRenderingChargeTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return instanceBillingCycle
     */
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyRenderingChargeTypeRequest, Builder> {
        private Boolean autoRenew; 
        private String instanceBillingCycle; 
        private String instanceChargeType; 
        private String period; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRenderingChargeTypeRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.instanceBillingCycle = request.instanceBillingCycle;
            this.instanceChargeType = request.instanceChargeType;
            this.period = request.period;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * <blockquote>
         * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PrePaid</code> (subscription).</p>
         * </blockquote>
         * <p>Enable or disable auto-renewal. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable.</p>
         * </li>
         * <li><p><strong>false</strong>: Disable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <blockquote>
         * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PostPaid</code> (pay-as-you-go).</p>
         * </blockquote>
         * <p>Billing type. Valid values:</p>
         * <ul>
         * <li>Hour: Hourly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        public Builder instanceBillingCycle(String instanceBillingCycle) {
            this.putQueryParameter("InstanceBillingCycle", instanceBillingCycle);
            this.instanceBillingCycle = instanceBillingCycle;
            return this;
        }

        /**
         * <p>The target billing method for the instance. Valid values:</p>
         * <ul>
         * <li><p>PrePaid (default): Subscription.</p>
         * </li>
         * <li><p>PostPaid: Pay-as-you-go.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <blockquote>
         * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PrePaid</code> (subscription).</p>
         * </blockquote>
         * <p>The duration for subscription. Valid values (Note: If you select 12, it converts to one year; other values are in months):</p>
         * <ul>
         * <li><p>1 (default)</p>
         * </li>
         * <li><p>2</p>
         * </li>
         * <li><p>3</p>
         * </li>
         * <li><p>4</p>
         * </li>
         * <li><p>5</p>
         * </li>
         * <li><p>6</p>
         * </li>
         * <li><p>7</p>
         * </li>
         * <li><p>8</p>
         * </li>
         * <li><p>9</p>
         * </li>
         * <li><p>12</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The ID of the Graphic Computing Service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public ModifyRenderingChargeTypeRequest build() {
            return new ModifyRenderingChargeTypeRequest(this);
        } 

    } 

}
