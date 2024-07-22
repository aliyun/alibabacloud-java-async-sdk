// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopsRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopsRequest</p>
 */
public class CreateDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleModels")
    private java.util.List < BundleModels> bundleModels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopMemberIp")
    private String desktopMemberIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopName")
    private String desktopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopNameSuffix")
    private Boolean desktopNameSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopTimers")
    private java.util.List < DesktopTimers> desktopTimers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private java.util.List < String > endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonthDesktopSetting")
    private MonthDesktopSetting monthDesktopSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotPolicyId")
    private String snapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAssignMode")
    private String userAssignMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCommands")
    private java.util.List < UserCommands> userCommands;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
    private Boolean volumeEncryptionEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
    private String volumeEncryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateDesktopsRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bundleId = builder.bundleId;
        this.bundleModels = builder.bundleModels;
        this.chargeType = builder.chargeType;
        this.desktopMemberIp = builder.desktopMemberIp;
        this.desktopName = builder.desktopName;
        this.desktopNameSuffix = builder.desktopNameSuffix;
        this.desktopTimers = builder.desktopTimers;
        this.directoryId = builder.directoryId;
        this.endUserId = builder.endUserId;
        this.groupId = builder.groupId;
        this.hostname = builder.hostname;
        this.monthDesktopSetting = builder.monthDesktopSetting;
        this.officeSiteId = builder.officeSiteId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.snapshotPolicyId = builder.snapshotPolicyId;
        this.tag = builder.tag;
        this.userAssignMode = builder.userAssignMode;
        this.userCommands = builder.userCommands;
        this.userName = builder.userName;
        this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
        this.volumeEncryptionKey = builder.volumeEncryptionKey;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDesktopsRequest create() {
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
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return bundleModels
     */
    public java.util.List < BundleModels> getBundleModels() {
        return this.bundleModels;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return desktopMemberIp
     */
    public String getDesktopMemberIp() {
        return this.desktopMemberIp;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return desktopNameSuffix
     */
    public Boolean getDesktopNameSuffix() {
        return this.desktopNameSuffix;
    }

    /**
     * @return desktopTimers
     */
    public java.util.List < DesktopTimers> getDesktopTimers() {
        return this.desktopTimers;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return endUserId
     */
    public java.util.List < String > getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return monthDesktopSetting
     */
    public MonthDesktopSetting getMonthDesktopSetting() {
        return this.monthDesktopSetting;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
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
     * @return snapshotPolicyId
     */
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userAssignMode
     */
    public String getUserAssignMode() {
        return this.userAssignMode;
    }

    /**
     * @return userCommands
     */
    public java.util.List < UserCommands> getUserCommands() {
        return this.userCommands;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return volumeEncryptionEnabled
     */
    public Boolean getVolumeEncryptionEnabled() {
        return this.volumeEncryptionEnabled;
    }

    /**
     * @return volumeEncryptionKey
     */
    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateDesktopsRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bundleId; 
        private java.util.List < BundleModels> bundleModels; 
        private String chargeType; 
        private String desktopMemberIp; 
        private String desktopName; 
        private Boolean desktopNameSuffix; 
        private java.util.List < DesktopTimers> desktopTimers; 
        private String directoryId; 
        private java.util.List < String > endUserId; 
        private String groupId; 
        private String hostname; 
        private MonthDesktopSetting monthDesktopSetting; 
        private String officeSiteId; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String promotionId; 
        private String regionId; 
        private String snapshotPolicyId; 
        private java.util.List < Tag> tag; 
        private String userAssignMode; 
        private java.util.List < UserCommands> userCommands; 
        private String userName; 
        private Boolean volumeEncryptionEnabled; 
        private String volumeEncryptionKey; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDesktopsRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bundleId = request.bundleId;
            this.bundleModels = request.bundleModels;
            this.chargeType = request.chargeType;
            this.desktopMemberIp = request.desktopMemberIp;
            this.desktopName = request.desktopName;
            this.desktopNameSuffix = request.desktopNameSuffix;
            this.desktopTimers = request.desktopTimers;
            this.directoryId = request.directoryId;
            this.endUserId = request.endUserId;
            this.groupId = request.groupId;
            this.hostname = request.hostname;
            this.monthDesktopSetting = request.monthDesktopSetting;
            this.officeSiteId = request.officeSiteId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.snapshotPolicyId = request.snapshotPolicyId;
            this.tag = request.tag;
            this.userAssignMode = request.userAssignMode;
            this.userCommands = request.userCommands;
            this.userName = request.userName;
            this.volumeEncryptionEnabled = request.volumeEncryptionEnabled;
            this.volumeEncryptionKey = request.volumeEncryptionKey;
            this.vpcId = request.vpcId;
        } 

        /**
         * The number of cloud computers that you want to create. Valid values: 1 to 300. Default value: 1.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * Specifies whether to enable automatic payment.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal. This parameter takes effect only when the ChargeType parameter is set to PrePaid.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The ID of the cloud computer template.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * The cloud computer templates.
         */
        public Builder bundleModels(java.util.List < BundleModels> bundleModels) {
            this.putQueryParameter("BundleModels", bundleModels);
            this.bundleModels = bundleModels;
            return this;
        }

        /**
         * The billing method of the cloud computers.
         * <p>
         * 
         * Default value: PostPaid. Valid values:
         * 
         * *   Postpaid: pay-as-you-go
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PrePaid: subscription
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The private IP address of the cloud computer.
         */
        public Builder desktopMemberIp(String desktopMemberIp) {
            this.putQueryParameter("DesktopMemberIp", desktopMemberIp);
            this.desktopMemberIp = desktopMemberIp;
            return this;
        }

        /**
         * The name of the cloud computer. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must be 1 to 64 characters in length.
         * *   The name must start with a letter but cannot start with `http://` or `https://`.
         * *   The name can only contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * Specifies whether to automatically add suffixes to the names of cloud computers when you create multiple cloud computers at the same time.
         * <p>
         * 
         * Default value: true. Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   False
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder desktopNameSuffix(Boolean desktopNameSuffix) {
            this.putQueryParameter("DesktopNameSuffix", desktopNameSuffix);
            this.desktopNameSuffix = desktopNameSuffix;
            return this;
        }

        /**
         * The details of the scheduled task on cloud computers.
         */
        public Builder desktopTimers(java.util.List < DesktopTimers> desktopTimers) {
            this.putQueryParameter("DesktopTimers", desktopTimers);
            this.desktopTimers = desktopTimers;
            return this;
        }

        /**
         * >  This parameter is not publicly available.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The IDs of the end users to which you want to assign the cloud computers. You can specify 1 to 100 IDs.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The ID of the cloud computer pool.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The custom hostnames of the cloud computers. This parameter is valid only if the office network is an AD office network and the operating system type of the cloud computers is Windows.
         * <p>
         * 
         * The hostnames must meet the following requirements:
         * 
         * *   The hostnames must be 2 to 15 characters in length.
         * *   The hostnames can contain only letters, digits, and hyphens (-). The hostnames cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.
         * 
         * When you create multiple cloud computers, you can use the `name_prefix[begin_number,bits]name_suffix` naming format to name the cloud computers. For example, if you set the value of the Hostname parameter to ecd-\[1,4]-test, the hostname of the first cloud computer is ecd-0001-test, the hostname of the second cloud computer is ecd-0002-test, and so on.
         * 
         * *   `name_prefix`: the prefix of the hostname.
         * *   `[begin_number,bits]`: the sequential number in the hostname. The `begin_number` value is the starting digit. Valid values of begin_number: 0 to 999999. Default value: 0. The `bits` value is the number of digits. Valid values: 1 to 6. Default value: 6.
         * *   `name_suffix`: the suffix of the hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * > This parameter is not publicly available.
         */
        public Builder monthDesktopSetting(MonthDesktopSetting monthDesktopSetting) {
            this.putQueryParameter("MonthDesktopSetting", monthDesktopSetting);
            this.monthDesktopSetting = monthDesktopSetting;
            return this;
        }

        /**
         * The office network ID.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The subscription duration of the cloud desktop that you want to create. The unit is specified by the `PeriodUnit` parameter. This parameter takes effect and is required only when the `ChargeType` parameter is set to `PrePaid`.
         * <p>
         * 
         * *   Valid values if the `PeriodUnit` parameter is set to `Month`:
         * 
         *     *   1
         *     *   2
         *     *   3
         *     *   6
         * 
         * *   Valid values if the `PeriodUnit` parameter is set to `Year`:
         * 
         *     *   1
         *     *   2
         *     *   3
         *     *   4
         *     *   5
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * The ID of the sales promotion.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SnapshotPolicyId.
         */
        public Builder snapshotPolicyId(String snapshotPolicyId) {
            this.putQueryParameter("SnapshotPolicyId", snapshotPolicyId);
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }

        /**
         * The tags that you want to add to the cloud desktop.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * How the cloud computers are assigned.
         * <p>
         * 
         * >  If you do not specify the `EndUserId` parameter, the cloud computers are not assigned to end users after the cloud computers are created.
         * 
         * Default value: ALL. Valid values:
         * 
         * *   ALL: If you specify the EndUserId parameter, the cloud computers are assigned to all specified end users after the cloud computers are created.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PER_USER: If you specify the EndUserId parameter, the cloud computers are evenly assigned to the specified end users after the cloud computers are created.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     In this case, you must make sure that the value of the Amount parameter can be divided by the N value of the EndUserId.N parameter that you specify.
         * 
         *     <!-- -->
         */
        public Builder userAssignMode(String userAssignMode) {
            this.putQueryParameter("UserAssignMode", userAssignMode);
            this.userAssignMode = userAssignMode;
            return this;
        }

        /**
         * Details about the custom command scripts.
         */
        public Builder userCommands(java.util.List < UserCommands> userCommands) {
            this.putQueryParameter("UserCommands", userCommands);
            this.userCommands = userCommands;
            return this;
        }

        /**
         * >  This parameter is not publicly available.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * Specifies whether to enable disk encryption.
         */
        public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled);
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }

        /**
         * The ID of the Key Management Service (KMS) key that you want to use when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.
         */
        public Builder volumeEncryptionKey(String volumeEncryptionKey) {
            this.putQueryParameter("VolumeEncryptionKey", volumeEncryptionKey);
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }

        /**
         * >  This parameter is not publicly available.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateDesktopsRequest build() {
            return new CreateDesktopsRequest(this);
        } 

    } 

    public static class BundleModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        @com.aliyun.core.annotation.Validation(maximum = 300)
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List < String > endUserIds;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private BundleModels(Builder builder) {
            this.amount = builder.amount;
            this.bundleId = builder.bundleId;
            this.desktopName = builder.desktopName;
            this.endUserIds = builder.endUserIds;
            this.hostname = builder.hostname;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BundleModels create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return endUserIds
         */
        public java.util.List < String > getEndUserIds() {
            return this.endUserIds;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return volumeEncryptionEnabled
         */
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        /**
         * @return volumeEncryptionKey
         */
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public static final class Builder {
            private Integer amount; 
            private String bundleId; 
            private String desktopName; 
            private java.util.List < String > endUserIds; 
            private String hostname; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            /**
             * The number of cloud computers that you want to create. Valid values: 1 to 300. Default value: null.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The ID of a cloud computer template.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * The name of the cloud computer. The name must meet the following requirements:
             * <p>
             * 
             * *   The name must be 1 to 64 characters in length.
             * *   The name must start with a letter but cannot start with `http://` or `https://`.
             * *   The name can only contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The IDs of the end users to whom the cloud computer are assigned.
             */
            public Builder endUserIds(java.util.List < String > endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * The custom hostnames of the cloud computers. This parameter is valid only if the office network is an AD office network and the operating system type of the cloud computers is Windows.
             * <p>
             * 
             * The hostnames must meet the following requirements:
             * 
             * *   The hostnames must be 2 to 15 characters in length.
             * *   The hostnames can contain only letters, digits, and hyphens (-). The hostnames cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.
             * 
             * When you create multiple cloud computers, you can use the `name_prefix[begin_number,bits]name_suffix` naming format to name the cloud computers. For example, if you set the value of the Hostname parameter to ecd-\[1,4]-test, the hostname of the first cloud computer is ecd-0001-test, the hostname of the second cloud computer is ecd-0002-test, and so on.
             * 
             * *   `name_prefix`: the prefix of the hostname.
             * *   `[begin_number,bits]`: the sequential number in the hostname. The `begin_number` value is the starting digit. Valid values of begin_number: 0 to 999999. Default value: 0. The `bits` value is the number of digits. Valid values: 1 to 6. Default value: 6.
             * *   `name_suffix`: the suffix of the hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * Specifies whether to enable disk encryption.
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to query the list of KMS keys.
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            public BundleModels build() {
                return new BundleModels(this);
            } 

        } 

    }
    public static class DesktopTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowClientSetting")
        private Boolean allowClientSetting;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        private DesktopTimers(Builder builder) {
            this.allowClientSetting = builder.allowClientSetting;
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.interval = builder.interval;
            this.operationType = builder.operationType;
            this.resetType = builder.resetType;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTimers create() {
            return builder().build();
        }

        /**
         * @return allowClientSetting
         */
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private Boolean allowClientSetting; 
            private String cronExpression; 
            private Boolean enforce; 
            private Integer interval; 
            private String operationType; 
            private String resetType; 
            private String timerType; 

            /**
             * Specifies whether to allow the end user to configure the scheduled task.
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * The cron expression for the scheduled task.
             * <p>
             * 
             * >  The time must be in UTC. For example, for 24:00 (UTC+8), you must set the value to 0 0 16 ? \* 1,2,3,4,5,6,7
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Specifies whether to forcibly execute the scheduled task.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: forcibly executes the scheduled task regardless of the status and connection of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false: does not forcibly execute the scheduled task.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * The interval at which cloud computers are created. Unit: minutes.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The operations that scheduled tasks support. This parameter is valid only when TimerType is set to NoConnect.
             * <p>
             * 
             * Valid values:
             * 
             * *   Hibernate: hibernates the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Shutdown: stops the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * The reset type of the cloud computers.
             * <p>
             * 
             * Valid values:
             * 
             * *   RESET_TYPE_SYSTEM: resets the system disks.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   RESET_TYPE_BOTH: resets the system disks and data disks.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * The type of the scheduled task.
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public DesktopTimers build() {
                return new DesktopTimers(this);
            } 

        } 

    }
    public static class MonthDesktopSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyerId")
        private Long buyerId;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("UseDuration")
        private Integer useDuration;

        private MonthDesktopSetting(Builder builder) {
            this.buyerId = builder.buyerId;
            this.desktopId = builder.desktopId;
            this.useDuration = builder.useDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonthDesktopSetting create() {
            return builder().build();
        }

        /**
         * @return buyerId
         */
        public Long getBuyerId() {
            return this.buyerId;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return useDuration
         */
        public Integer getUseDuration() {
            return this.useDuration;
        }

        public static final class Builder {
            private Long buyerId; 
            private String desktopId; 
            private Integer useDuration; 

            /**
             * > This parameter is not publicly available.
             */
            public Builder buyerId(Long buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * > This parameter is not publicly available.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * > This parameter is not publicly available.
             */
            public Builder useDuration(Integer useDuration) {
                this.useDuration = useDuration;
                return this;
            }

            public MonthDesktopSetting build() {
                return new MonthDesktopSetting(this);
            } 

        } 

    }
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

            /**
             * The key of the tag. You can specify 1 to 20 keys for a tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. You can specify 1 to 20 values for a tag.
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
    public static class UserCommands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(maxLength = 15000)
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentEncoding")
        private String contentEncoding;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        private UserCommands(Builder builder) {
            this.content = builder.content;
            this.contentEncoding = builder.contentEncoding;
            this.contentType = builder.contentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserCommands create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentEncoding
         */
        public String getContentEncoding() {
            return this.contentEncoding;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        public static final class Builder {
            private String content; 
            private String contentEncoding; 
            private String contentType; 

            /**
             * The command content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The encoding mode of the command content.
             * <p>
             * 
             * Valid values:
             * 
             * *   Base64: encodes the command content in Base64.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   PlainText: does not encode the command content.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder contentEncoding(String contentEncoding) {
                this.contentEncoding = contentEncoding;
                return this;
            }

            /**
             * The language type of the command.
             * <p>
             * 
             * Valid values:
             * 
             * *   RunPowerShellScript: PowerShell commands (applicable to Windows cloud computers).
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   RunShellScript: shell commands (applicable to Linux cloud computers).
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   RunBatScript: batch commands (applicable to Windows cloud computers).
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            public UserCommands build() {
                return new UserCommands(this);
            } 

        } 

    }
}
