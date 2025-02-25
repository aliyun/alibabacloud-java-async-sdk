// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateDemandRequest} extends {@link RequestModel}
 *
 * <p>CreateDemandRequest</p>
 */
public class CreateDemandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DemandDescription")
    private String demandDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DemandName")
    private String demandName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateDemandRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.clientToken = builder.clientToken;
        this.demandDescription = builder.demandDescription;
        this.demandName = builder.demandName;
        this.endTime = builder.endTime;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceType = builder.instanceType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDemandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return demandDescription
     */
    public String getDemandDescription() {
        return this.demandDescription;
    }

    /**
     * @return demandName
     */
    public String getDemandName() {
        return this.demandName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDemandRequest, Builder> {
        private Integer amount; 
        private String clientToken; 
        private String demandDescription; 
        private String demandName; 
        private String endTime; 
        private String instanceChargeType; 
        private String instanceType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDemandRequest request) {
            super(request);
            this.amount = request.amount;
            this.clientToken = request.clientToken;
            this.demandDescription = request.demandDescription;
            this.demandName = request.demandName;
            this.endTime = request.endTime;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceType = request.instanceType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The number of instances. Valid values: 1 to 100000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The value of <code>ClientToken</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the demand. The description must be 2 to 256 characters in length and cannot start with <a href="http://https://%E3%80%82">http:// or https://</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-demand-desc</p>
         */
        public Builder demandDescription(String demandDescription) {
            this.putQueryParameter("DemandDescription", demandDescription);
            this.demandDescription = demandDescription;
            return this;
        }

        /**
         * <p>The name of the demand. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <a href="http://https://">http:// or https://</a>. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>The default value is the instance type name.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-demand</p>
         */
        public Builder demandName(String demandName) {
            this.putQueryParameter("DemandName", demandName);
            this.demandName = demandName;
            return this;
        }

        /**
         * <p>The end time of the subscription period. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
         * <p>If the value of seconds (ss) is not 00, the time is automatically set to the beginning of the specified minute (mm). The value of EndTime is later than the value of Starttime. In most cases, the interval between the two times cannot be more than 10 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-10 12:05:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PostPaid: pay-as-you-go. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The instance type. See <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the performance data of an instance type, or see <a href="https://help.aliyun.com/document_detail/58291.html">Select instance types</a> to learn how to select instance types.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The subscription period of the resource. Valid values:</p>
         * <ul>
         * <li>Valid values when the value of PeriodUnit is Day: 1, 2, 3, 4, 5, and 6.</li>
         * <li>Valid values when the value of PeriodUnit is Week: 1, 2, 3, and 4.</li>
         * <li>Valid values when the value of PeriodUnit is Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription period. Valid values:</p>
         * <ul>
         * <li>Day</li>
         * <li>Week</li>
         * <li>Month. This is the default value.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * <p>The start time of the subscription period. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
         * <p>If the value of seconds (ss) is not 00, the time is automatically set to the beginning of the specified minute (mm). The value of EndTime must be later than the value of Starttime. In most cases, the interval between the two times cannot be more than 10 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-01 12:05:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * <p>This parameter is empty by default. If you leave this parameter empty, the system randomly selects a zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDemandRequest build() {
            return new CreateDemandRequest(this);
        } 

    } 

}
