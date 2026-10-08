// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyRCInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCInstanceRequest</p>
 */
public class ModifyRCInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebootTime")
    private String rebootTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebootWhenFinished")
    private Boolean rebootWhenFinished;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyRCInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.businessInfo = builder.businessInfo;
        this.direction = builder.direction;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.promotionCode = builder.promotionCode;
        this.rebootTime = builder.rebootTime;
        this.rebootWhenFinished = builder.rebootWhenFinished;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceRequest create() {
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
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return rebootTime
     */
    public String getRebootTime() {
        return this.rebootTime;
    }

    /**
     * @return rebootWhenFinished
     */
    public Boolean getRebootWhenFinished() {
        return this.rebootWhenFinished;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyRCInstanceRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoUseCoupon; 
        private String businessInfo; 
        private String direction; 
        private Boolean dryRun; 
        private String instanceId; 
        private String instanceType; 
        private String promotionCode; 
        private String rebootTime; 
        private Boolean rebootWhenFinished; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoUseCoupon = request.autoUseCoupon;
            this.businessInfo = request.businessInfo;
            this.direction = request.direction;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.promotionCode = request.promotionCode;
            this.rebootTime = request.rebootTime;
            this.rebootWhenFinished = request.rebootWhenFinished;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: An order is generated but payment is not automatically made.<blockquote>
         * <p>If your payment method balance is insufficient, set the parameter AutoPay to false. An unpaid order is generated, and you can log on to the ApsaraDB RDS console to complete the payment.</p>
         * </blockquote>
         * </li>
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
         * <p>Specifies whether to automatically use coupons. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): Coupons are automatically used.</li>
         * <li><strong>false</strong>: Coupons are not used.</li>
         * </ul>
         * <blockquote>
         * <p>If you use coupons and then perform a downgrade, the amount deducted by coupons is not refunded.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * BusinessInfo.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The type of the Upgrade/Downgrade. Valid values:</p>
         * <blockquote>
         * <p>This parameter does not need to be uploaded. The system can automatically determine whether the change is an upgrade or a downgrade. If you upload this parameter, follow the rules below.</p>
         * </blockquote>
         * <ul>
         * <li><strong>Up</strong> (default): Upgrades the instance type. Make sure that your account payment method balance is sufficient.</li>
         * <li><strong>Down</strong>: Downgrades the instance type. Set Direction to down when the instance type specified by InstanceType is lower than the current instance type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Up</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Performs a dry run without creating the instance. The system checks items such as the request parameters, request format, service limits, and available resources.</li>
         * <li><strong>false</strong> (default): Sends the request. If the request passes the check, the instance is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf62br2491p5l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The target instance type. For information about the instance types supported by RDS Custom instances, see <a href="https://help.aliyun.com/document_detail/2844823.html">RDS Custom instance types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.i8.large.2cm</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>72329885****</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The restart time of the instance.</p>
         * <ul>
         * <li>If <strong>RebootWhenFinished</strong> is set to <strong>false</strong> and the instance status is <strong>Running</strong>, you <strong>must</strong> set a restart time within 48 hours.</li>
         * <li>The time follows the ISO 8601 standard in UTC+0. Format: <code>yyyy-MM-ddTHH:mmZ</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2025-04-03T12:05Z</p>
         */
        public Builder rebootTime(String rebootTime) {
            this.putQueryParameter("RebootTime", rebootTime);
            this.rebootTime = rebootTime;
            return this;
        }

        /**
         * <p>Specifies whether to immediately restart the instance after the specification change is complete. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): The instance is restarted immediately.</li>
         * <li><strong>false</strong>: The instance is not restarted.</li>
         * </ul>
         * <blockquote>
         * <p>If the instance is in the <strong>Stopped</strong> state, the instance remains in the Stopped state and is not restarted even if you set <code>RebootWhenFinished=true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder rebootWhenFinished(Boolean rebootWhenFinished) {
            this.putQueryParameter("RebootWhenFinished", rebootWhenFinished);
            this.rebootWhenFinished = rebootWhenFinished;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hagnzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyRCInstanceRequest build() {
            return new ModifyRCInstanceRequest(this);
        } 

    } 

}
