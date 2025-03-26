// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyDiskSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskSpecRequest</p>
 */
public class ModifyDiskSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskPerformanceLevel")
    private String rootDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskPerformanceLevel")
    private String userDiskPerformanceLevel;

    private ModifyDiskSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.desktopId = builder.desktopId;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.rootDiskPerformanceLevel = builder.rootDiskPerformanceLevel;
        this.userDiskPerformanceLevel = builder.userDiskPerformanceLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskSpecRequest create() {
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
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    /**
     * @return rootDiskPerformanceLevel
     */
    public String getRootDiskPerformanceLevel() {
        return this.rootDiskPerformanceLevel;
    }

    /**
     * @return userDiskPerformanceLevel
     */
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

    public static final class Builder extends Request.Builder<ModifyDiskSpecRequest, Builder> {
        private Boolean autoPay; 
        private String desktopId; 
        private String promotionId; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private String rootDiskPerformanceLevel; 
        private String userDiskPerformanceLevel; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.desktopId = request.desktopId;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.rootDiskPerformanceLevel = request.rootDiskPerformanceLevel;
            this.userDiskPerformanceLevel = request.userDiskPerformanceLevel;
        } 

        /**
         * <p>Specifies whether to enable the automatic payment feature.</p>
         * <ul>
         * <li>If you set the value to <code>true</code>, ensure your account has sufficient balance to avoid generating abnormal orders.</li>
         * <li>If you set the value to <code>false</code>, go to the <strong>Expenses and Costs</strong> page to complete the payment based on the order number.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>true (default): enables the automatic payment feature.</li>
         * <li>false: generates the order and manually complete the payment.</li>
         * </ul>
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
         * <p>The ID of the cloud computer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-2yjhqxo1monxxxxxx</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the sales promotion activity. You can call the DescribePrice operation to obtain the IDs of matching sales promotion activities.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The ID of the region. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResellerOwnerUid.
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <p>The PL of the system disk. Only Enterprise Graphics or High Frequency cloud computers support disk PL adjustments.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PL1</li>
         * <li>PL0</li>
         * <li>PL3</li>
         * <li>PL2</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder rootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
            this.putQueryParameter("RootDiskPerformanceLevel", rootDiskPerformanceLevel);
            this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The PL of the data disk. Only Enterprise Graphics or High Frequency cloud computers support disk PL adjustments.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PL1</li>
         * <li>PL0</li>
         * <li>PL3</li>
         * <li>PL2</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder userDiskPerformanceLevel(String userDiskPerformanceLevel) {
            this.putQueryParameter("UserDiskPerformanceLevel", userDiskPerformanceLevel);
            this.userDiskPerformanceLevel = userDiskPerformanceLevel;
            return this;
        }

        @Override
        public ModifyDiskSpecRequest build() {
            return new ModifyDiskSpecRequest(this);
        } 

    } 

}
