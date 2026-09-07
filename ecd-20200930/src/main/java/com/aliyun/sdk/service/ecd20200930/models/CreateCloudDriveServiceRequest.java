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
 * {@link CreateCloudDriveServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudDriveServiceRequest</p>
 */
public class CreateCloudDriveServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsChargeType")
    private String cdsChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private java.util.List<String> endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maxSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
    private String officeSiteType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Long period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionId")
    private String solutionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCount")
    private Long userCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserMaxSize")
    private Long userMaxSize;

    private CreateCloudDriveServiceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizType = builder.bizType;
        this.cdsChargeType = builder.cdsChargeType;
        this.cenId = builder.cenId;
        this.domainName = builder.domainName;
        this.endUserId = builder.endUserId;
        this.maxSize = builder.maxSize;
        this.name = builder.name;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteType = builder.officeSiteType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.solutionId = builder.solutionId;
        this.userCount = builder.userCount;
        this.userMaxSize = builder.userMaxSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudDriveServiceRequest create() {
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
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return cdsChargeType
     */
    public String getCdsChargeType() {
        return this.cdsChargeType;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endUserId
     */
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return maxSize
     */
    public Long getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return officeSiteType
     */
    public String getOfficeSiteType() {
        return this.officeSiteType;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
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
     * @return solutionId
     */
    public String getSolutionId() {
        return this.solutionId;
    }

    /**
     * @return userCount
     */
    public Long getUserCount() {
        return this.userCount;
    }

    /**
     * @return userMaxSize
     */
    public Long getUserMaxSize() {
        return this.userMaxSize;
    }

    public static final class Builder extends Request.Builder<CreateCloudDriveServiceRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer bizType; 
        private String cdsChargeType; 
        private String cenId; 
        private String domainName; 
        private java.util.List<String> endUserId; 
        private Long maxSize; 
        private String name; 
        private String officeSiteId; 
        private String officeSiteType; 
        private Long period; 
        private String periodUnit; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private String solutionId; 
        private Long userCount; 
        private Long userMaxSize; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudDriveServiceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizType = request.bizType;
            this.cdsChargeType = request.cdsChargeType;
            this.cenId = request.cenId;
            this.domainName = request.domainName;
            this.endUserId = request.endUserId;
            this.maxSize = request.maxSize;
            this.name = request.name;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteType = request.officeSiteType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.solutionId = request.solutionId;
            this.userCount = request.userCount;
            this.userMaxSize = request.userMaxSize;
        } 

        /**
         * <p>Specifies whether to enable automatic payment.</p>
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
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect and is optional only when CdsChargeType is set to <code>PrePaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The billing method of the NAS drive.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder cdsChargeType(String cdsChargeType) {
            this.putQueryParameter("CdsChargeType", cdsChargeType);
            this.cdsChargeType = cdsChargeType;
            return this;
        }

        /**
         * <p>The instance ID of the Cloud Enterprise Network (CEN) associated with the AD office network. This parameter takes effect only when <code>OfficeSiteType</code> is set to <code>AD_CONNECTOR</code>. If <code>OfficeSiteId</code> is specified, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-g4ba1mkji8nj6****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The domain controller name of the AD office network. This parameter takes effect only when <code>OfficeSiteType</code> is set to <code>AD_CONNECTOR</code>. If <code>OfficeSiteId</code> is specified, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test.local</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The list of user IDs.</p>
         */
        public Builder endUserId(java.util.List<String> endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The Peak Volume of the NAS drive storage space.</p>
         * <ul>
         * <li>When you create a pay-as-you-go NAS drive, the unit is bytes.</li>
         * <li>When you create an upfront NAS drive, the unit is GiB. For example, to create a 500 GiB upfront NAS drive, set this parameter to 500. To create a 2 TiB upfront NAS drive, set this parameter to 2048.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>536870912000</p>
         */
        public Builder maxSize(Long maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * <p>The name of the enterprise NAS drive.</p>
         * 
         * <strong>example:</strong>
         * <p>wuying-cds</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the office network. This parameter takes effect only when the network type is set to <code>AD_CONNECTOR</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-400695****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The network type of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder officeSiteType(String officeSiteType) {
            this.putQueryParameter("OfficeSiteType", officeSiteType);
            this.officeSiteType = officeSiteType;
            return this;
        }

        /**
         * <p>The subscription duration. The unit is specified by <code>PeriodUnit</code>. This parameter takes effect and is required only when <code>CdsChargeType</code> is set to <code>PrePaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration for the subscription NAS drive. This parameter takes effect and is required only when <code>CdsChargeType</code> is set to <code>PrePaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The user ID for resource ownership in reseller pattern. You do not need to specify this parameter if you are not in reseller pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>1422724566551XXX</p>
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sol-2i8qxpv6t1a03****</p>
         */
        public Builder solutionId(String solutionId) {
            this.putQueryParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        /**
         * <p>The maximum number of users for the subscription NAS drive. This parameter takes effect and is required only when <code>CdsChargeType</code> is set to <code>PrePaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder userCount(Long userCount) {
            this.putQueryParameter("UserCount", userCount);
            this.userCount = userCount;
            return this;
        }

        /**
         * <p>The maximum storage capacity of a personal drive when you assign a personal drive to a user. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>104857600</p>
         */
        public Builder userMaxSize(Long userMaxSize) {
            this.putQueryParameter("UserMaxSize", userMaxSize);
            this.userMaxSize = userMaxSize;
            return this;
        }

        @Override
        public CreateCloudDriveServiceRequest build() {
            return new CreateCloudDriveServiceRequest(this);
        } 

    } 

}
