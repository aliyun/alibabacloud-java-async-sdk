// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link ModifyDBInstanceDiskTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceDiskTypeRequest</p>
 */
public class ModifyDBInstanceDiskTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceStorageType")
    private String dbInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraParam")
    private String extraParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    @com.aliyun.core.annotation.Validation(maximum = 50000)
    private Long provisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBInstanceDiskTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.businessInfo = builder.businessInfo;
        this.couponNo = builder.couponNo;
        this.DBInstanceId = builder.DBInstanceId;
        this.dbInstanceStorageType = builder.dbInstanceStorageType;
        this.extraParam = builder.extraParam;
        this.orderType = builder.orderType;
        this.provisionedIops = builder.provisionedIops;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceDiskTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dbInstanceStorageType
     */
    public String getDbInstanceStorageType() {
        return this.dbInstanceStorageType;
    }

    /**
     * @return extraParam
     */
    public String getExtraParam() {
        return this.extraParam;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceDiskTypeRequest, Builder> {
        private String regionId; 
        private Boolean autoPay; 
        private String autoRenew; 
        private String businessInfo; 
        private String couponNo; 
        private String DBInstanceId; 
        private String dbInstanceStorageType; 
        private String extraParam; 
        private String orderType; 
        private Long provisionedIops; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceDiskTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.businessInfo = request.businessInfo;
            this.couponNo = request.couponNo;
            this.DBInstanceId = request.DBInstanceId;
            this.dbInstanceStorageType = request.dbInstanceStorageType;
            this.extraParam = request.extraParam;
            this.orderType = request.orderType;
            this.provisionedIops = request.provisionedIops;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables automatic payment. Make sure that you have sufficient balance within your account.</li>
         * <li><strong>false</strong>: disables automatic payment. You must perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner, click <strong>Expenses</strong> and select <strong>User Center</strong> from the drop-down list. The User Center page appears. In the left-side navigation pane, choose <strong>Order Management</strong> &gt; Renew. On the Renewal tab, find the bill that you want to pay and then click Renew in the Actions column.</li>
         * </ul>
         * <p>Default value: <strong>true</strong>.</p>
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
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The business information. This is an additional parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The coupon code. Default value: <code>youhuiquan_promotion_option_id_for_blank</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1fa5efaa93****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The new disk type. Valid values:</p>
         * <ul>
         * <li><strong>cloud_auto</strong>: ESSD AutoPL disk</li>
         * <li><strong>cloud_essd1</strong>: PL1 ESSD</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        public Builder dbInstanceStorageType(String dbInstanceStorageType) {
            this.putQueryParameter("DbInstanceStorageType", dbInstanceStorageType);
            this.dbInstanceStorageType = dbInstanceStorageType;
            return this;
        }

        /**
         * <p>An additional parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>async</p>
         */
        public Builder extraParam(String extraParam) {
            this.putQueryParameter("ExtraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * <p>The type of configuration changes. Valid values:</p>
         * <ul>
         * <li><strong>UPGRADE</strong></li>
         * <li><strong>DOWNGRADE</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is valid only when the billing method of the instance is subscription.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The provisioned IOPS. Valid values: 0 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>1960</p>
         */
        public Builder provisionedIops(Long provisionedIops) {
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

        @Override
        public ModifyDBInstanceDiskTypeRequest build() {
            return new ModifyDBInstanceDiskTypeRequest(this);
        } 

    } 

}
