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
 * {@link CreateElasticityAssuranceRequest} extends {@link RequestModel}
 *
 * <p>CreateElasticityAssuranceRequest</p>
 */
public class CreateElasticityAssuranceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssuranceTimes")
    private String assuranceTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceAmount")
    private Integer instanceAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceCpuCoreCount")
    private Integer instanceCpuCoreCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecurrenceRules")
    private java.util.List<RecurrenceRules> recurrenceRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> zoneId;

    private CreateElasticityAssuranceRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.assuranceTimes = builder.assuranceTimes;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceAmount = builder.instanceAmount;
        this.instanceCpuCoreCount = builder.instanceCpuCoreCount;
        this.instanceType = builder.instanceType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.recurrenceRules = builder.recurrenceRules;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.tag = builder.tag;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticityAssuranceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return assuranceTimes
     */
    public String getAssuranceTimes() {
        return this.assuranceTimes;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceAmount
     */
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    /**
     * @return instanceCpuCoreCount
     */
    public Integer getInstanceCpuCoreCount() {
        return this.instanceCpuCoreCount;
    }

    /**
     * @return instanceType
     */
    public java.util.List<String> getInstanceType() {
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
     * @return recurrenceRules
     */
    public java.util.List<RecurrenceRules> getRecurrenceRules() {
        return this.recurrenceRules;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneId
     */
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateElasticityAssuranceRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private String assuranceTimes; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String description; 
        private Integer instanceAmount; 
        private Integer instanceCpuCoreCount; 
        private java.util.List<String> instanceType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private java.util.List<RecurrenceRules> recurrenceRules; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 
        private java.util.List<Tag> tag; 
        private java.util.List<String> zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateElasticityAssuranceRequest request) {
            super(request);
            this.privatePoolOptions = request.privatePoolOptions;
            this.assuranceTimes = request.assuranceTimes;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.instanceAmount = request.instanceAmount;
            this.instanceCpuCoreCount = request.instanceCpuCoreCount;
            this.instanceType = request.instanceType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.recurrenceRules = request.recurrenceRules;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.tag = request.tag;
            this.zoneId = request.zoneId;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * <p>The total number of times that the elasticity assurance can be applied. Valid values: Unlimited. Currently, only the unlimited mode is supported within the service validity period.</p>
         * <p>Default value: Unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlimited</p>
         */
        public Builder assuranceTimes(String assuranceTimes) {
            this.putQueryParameter("AssuranceTimes", assuranceTimes);
            this.assuranceTimes = assuranceTimes;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal is enabled.</li>
         * <li>false: Auto-renewal is disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
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
         * <p>The auto-renewal period. Unit: months. Valid values: 1, 2, 3, 6, 12, 24, and 36.</p>
         * <ul>
         * <li><p>If <code>PeriodUnit=Month</code>, the default value is 1.</p>
         * </li>
         * <li><p>If <code>PeriodUnit=Year</code>, the default value is 12.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <code>AutoRenew</code> is set to <code>True</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <code>ClientToken</code> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the elasticity assurance service. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The total number of instances to be reserved for a single instance type.</p>
         * <p>Valid values: 1 to 1000.</p>
         * <blockquote>
         * <p>Notice: This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder instanceCpuCoreCount(Integer instanceCpuCoreCount) {
            this.putQueryParameter("InstanceCpuCoreCount", instanceCpuCoreCount);
            this.instanceCpuCoreCount = instanceCpuCoreCount;
            return this;
        }

        /**
         * <p>The instance type. Currently, you can configure an elasticity assurance service for only one instance type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.xlarge</p>
         */
        public Builder instanceType(java.util.List<String> instanceType) {
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
         * <p>The purchase duration. The unit of the duration is determined by the <code>PeriodUnit</code> parameter. Valid values:</p>
         * <ul>
         * <li>If <code>PeriodUnit</code> is set to <code>Month</code>: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
         * <li>If <code>PeriodUnit</code> is set to <code>Year</code>: 1, 2, 3, 4, and 5.</li>
         * <li>If <code>PeriodUnit</code> is set to <code>Day</code>: 1 to 365.</li>
         * </ul>
         * <p>Default value: 1.</p>
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
         * <p>The unit of the purchase duration. Valid values:</p>
         * <ul>
         * <li>Month: month.</li>
         * <li>Year: year.</li>
         * <li>Day: day.<blockquote>
         * <p>When <code>PeriodUnit</code> is set to <code>Day</code>, you must also specify RecurrenceRules to create a time-sharing elasticity assurance.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>Default value: Year.</p>
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
         * <p>The recurrence rules for the time-sharing elasticity assurance.</p>
         */
        public Builder recurrenceRules(java.util.List<RecurrenceRules> recurrenceRules) {
            this.putQueryParameter("RecurrenceRules", recurrenceRules);
            this.recurrenceRules = recurrenceRules;
            return this;
        }

        /**
         * <p>The region ID of the elasticity assurance service. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the elasticity assurance service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The effective period start time of the elasticity assurance service. By default, the service takes effect when the operation is invoked. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-30T06:32:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The tags of the elasticity assurance service.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The zone ID within the region of the elasticity assurance service. Currently, you can create an elasticity assurance service in only one zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(java.util.List<String> zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateElasticityAssuranceRequest build() {
            return new CreateElasticityAssuranceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateElasticityAssuranceRequest} extends {@link TeaModel}
     *
     * <p>CreateElasticityAssuranceRequest</p>
     */
    public static class PrivatePoolOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchCriteria")
        private String matchCriteria;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private PrivatePoolOptions(Builder builder) {
            this.matchCriteria = builder.matchCriteria;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String matchCriteria; 
            private String name; 

            private Builder() {
            } 

            private Builder(PrivatePoolOptions model) {
                this.matchCriteria = model.matchCriteria;
                this.name = model.name;
            } 

            /**
             * <p>The match mode of the elasticity assurance service. Valid values:</p>
             * <ul>
             * <li>Open: open mode. The system automatically matches the capacity of open private pools when instances are started. If no matching private pool capacity is available, public pool resources are used to start the instances.</li>
             * <li>Target: targeted mode. Instances are started by using the capacity of the specified private pool. If the specified private pool capacity is unavailable, the instances fail to start.</li>
             * </ul>
             * <p>Default value: Open.</p>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            /**
             * <p>The name of the elasticity assurance service. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>eapTestName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateElasticityAssuranceRequest} extends {@link TeaModel}
     *
     * <p>CreateElasticityAssuranceRequest</p>
     */
    public static class RecurrenceRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndHour")
        private Integer endHour;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
        private String recurrenceValue;

        @com.aliyun.core.annotation.NameInMap("StartHour")
        private Integer startHour;

        private RecurrenceRules(Builder builder) {
            this.endHour = builder.endHour;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValue = builder.recurrenceValue;
            this.startHour = builder.startHour;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecurrenceRules create() {
            return builder().build();
        }

        /**
         * @return endHour
         */
        public Integer getEndHour() {
            return this.endHour;
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValue
         */
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        /**
         * @return startHour
         */
        public Integer getStartHour() {
            return this.startHour;
        }

        public static final class Builder {
            private Integer endHour; 
            private String recurrenceType; 
            private String recurrenceValue; 
            private Integer startHour; 

            private Builder() {
            } 

            private Builder(RecurrenceRules model) {
                this.endHour = model.endHour;
                this.recurrenceType = model.recurrenceType;
                this.recurrenceValue = model.recurrenceValue;
                this.startHour = model.startHour;
            } 

            /**
             * <p>The end time of the time-sharing assurance. The value must be on the hour.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder endHour(Integer endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * <p>The type of the recurrence rule. Valid values:</p>
             * <ul>
             * <li>Daily: daily recurrence.</li>
             * <li>Weekly: weekly recurrence.</li>
             * <li>Monthly: monthly recurrence.</li>
             * </ul>
             * <blockquote>
             * <p>You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>The value of the recurrence rule.</p>
             * <ul>
             * <li>If <code>RecurrenceType</code> is set to <code>Daily</code>, you can specify only one value. Valid values: 1 to 31. The value specifies the interval in days between recurrences.</li>
             * <li>If <code>RecurrenceType</code> is set to <code>Weekly</code>, you can specify multiple values separated by commas (,). The values for Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6. For example, <code>1,2</code> specifies Monday and Tuesday.</li>
             * <li>If <code>RecurrenceType</code> is set to <code>Monthly</code>, the format is <code>A-B</code>. Valid values of A and B: 1 to 31. B must be greater than or equal to A. For example, <code>1-5</code> specifies the 1st to 5th day of each month.</li>
             * </ul>
             * <blockquote>
             * <p>You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            /**
             * <p>The effective period start hour of the time-sharing assurance. The value must be on the hour.</p>
             * <blockquote>
             * <p>You must specify both <code>StartHour</code> and <code>EndHour</code>, and the difference between them must be at least 4 hours.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder startHour(Integer startHour) {
                this.startHour = startHour;
                return this;
            }

            public RecurrenceRules build() {
                return new RecurrenceRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateElasticityAssuranceRequest} extends {@link TeaModel}
     *
     * <p>CreateElasticityAssuranceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the elasticity assurance service. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the elasticity assurance service. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
