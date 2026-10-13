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
         * <li><strong>true</strong> (default): enables automatic payment. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: generates an order without deducting fees.<blockquote>
         * <p>If your account balance is insufficient, you can set the AutoPay parameter to false. An unpaid order is generated. You can log on to the ApsaraDB RDS console to complete the payment.</p>
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
         * <li><strong>true</strong>: automatically uses coupons. This is the default value.</li>
         * <li><strong>false</strong>: does not automatically use coupons.</li>
         * </ul>
         * <blockquote>
         * <p>If you use a coupon and then downgrade the instance type, the amount deducted by the voucher is not refunded.</p>
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
         * <p>The instance upgrade or downgrade type. Valid values:</p>
         * <blockquote>
         * <p>You do not need to specify this parameter. The system automatically determines whether to upgrade or downgrade the instance type. If you want to specify it, follow these rules:</p>
         * </blockquote>
         * <ul>
         * <li><strong>Up</strong> (default): upgrades the instance type. Make sure that your account balance is sufficient.</li>
         * <li><strong>Down</strong>: downgrades the instance type. When the instance type specified in InstanceType is lower than the current instance type, set Direction to Down.</li>
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
         * <p>Specifies whether to perform a precheck on the instance creation operation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a precheck without creating an instance. Check items include request parameters, request format, service limits, and inventory.</li>
         * <li><strong>false</strong>: sends a normal request and directly creates the instance after the request passes the precheck. This is the default value.</li>
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
         * <p>The destination instance type. For more information about the instance types supported by RDS Target instances, see <a href="https://help.aliyun.com/document_detail/2844823.html">RDS Target instance types</a>.</p>
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
         * <li>If <strong>RebootWhenFinished</strong> is set to <strong>false</strong> and the instance is in the <strong>Running</strong> state, you <strong>must</strong> specify a restart time within 48 hours.</li>
         * <li>Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</li>
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
         * <p>Specifies whether to immediately restart the instance after the instance type change is complete. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: restarts the instance immediately. This is the default value.</li>
         * <li><strong>false</strong>: does not restart the instance immediately.</li>
         * </ul>
         * <blockquote>
         * <p>If the instance is in the <strong>Stopped</strong> state, it remains in the Stopped state and is not restarted even if you set RebootWhenFinished to true.</p>
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
