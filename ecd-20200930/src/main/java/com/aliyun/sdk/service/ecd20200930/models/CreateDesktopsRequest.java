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
    private java.util.List<BundleModels> bundleModels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopAttachment")
    private DesktopAttachment desktopAttachment;

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
    private java.util.List<DesktopTimers> desktopTimers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private java.util.List<String> endUserId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotPolicyId")
    private String snapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerGroupId")
    private String timerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAssignMode")
    private String userAssignMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCommands")
    private java.util.List<UserCommands> userCommands;

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
        this.desktopAttachment = builder.desktopAttachment;
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
        this.resourceGroupId = builder.resourceGroupId;
        this.snapshotPolicyId = builder.snapshotPolicyId;
        this.tag = builder.tag;
        this.timerGroupId = builder.timerGroupId;
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
    public java.util.List<BundleModels> getBundleModels() {
        return this.bundleModels;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return desktopAttachment
     */
    public DesktopAttachment getDesktopAttachment() {
        return this.desktopAttachment;
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
    public java.util.List<DesktopTimers> getDesktopTimers() {
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
    public java.util.List<String> getEndUserId() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timerGroupId
     */
    public String getTimerGroupId() {
        return this.timerGroupId;
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
    public java.util.List<UserCommands> getUserCommands() {
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
        private java.util.List<BundleModels> bundleModels; 
        private String chargeType; 
        private DesktopAttachment desktopAttachment; 
        private String desktopMemberIp; 
        private String desktopName; 
        private Boolean desktopNameSuffix; 
        private java.util.List<DesktopTimers> desktopTimers; 
        private String directoryId; 
        private java.util.List<String> endUserId; 
        private String groupId; 
        private String hostname; 
        private MonthDesktopSetting monthDesktopSetting; 
        private String officeSiteId; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String promotionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String snapshotPolicyId; 
        private java.util.List<Tag> tag; 
        private String timerGroupId; 
        private String userAssignMode; 
        private java.util.List<UserCommands> userCommands; 
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
            this.desktopAttachment = request.desktopAttachment;
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
            this.resourceGroupId = request.resourceGroupId;
            this.snapshotPolicyId = request.snapshotPolicyId;
            this.tag = request.tag;
            this.timerGroupId = request.timerGroupId;
            this.userAssignMode = request.userAssignMode;
            this.userCommands = request.userCommands;
            this.userName = request.userName;
            this.volumeEncryptionEnabled = request.volumeEncryptionEnabled;
            this.volumeEncryptionKey = request.volumeEncryptionKey;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The number of cloud computers that you want to create. Valid values: 1 to 300. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
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
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the ChargeType parameter is set to PrePaid.</p>
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
         * <p>The ID of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>b-je9hani001wfn****</p>
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * <p>The cloud computer templates.</p>
         */
        public Builder bundleModels(java.util.List<BundleModels> bundleModels) {
            this.putQueryParameter("BundleModels", bundleModels);
            this.bundleModels = bundleModels;
            return this;
        }

        /**
         * <p>The billing method of the cloud computers.</p>
         * <p>Default value: PostPaid. Valid values:</p>
         * <ul>
         * <li><p>Postpaid: pay-as-you-go</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PrePaid: subscription</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * DesktopAttachment.
         */
        public Builder desktopAttachment(DesktopAttachment desktopAttachment) {
            String desktopAttachmentShrink = shrink(desktopAttachment, "DesktopAttachment", "json");
            this.putQueryParameter("DesktopAttachment", desktopAttachmentShrink);
            this.desktopAttachment = desktopAttachment;
            return this;
        }

        /**
         * <p>The private IP address of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        public Builder desktopMemberIp(String desktopMemberIp) {
            this.putQueryParameter("DesktopMemberIp", desktopMemberIp);
            this.desktopMemberIp = desktopMemberIp;
            return this;
        }

        /**
         * <p>The name of the cloud computer. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 1 to 64 characters in length.</li>
         * <li>The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The name can only contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testDesktopName</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * <p>Specifies whether to automatically add suffixes to the names of cloud computers when you create multiple cloud computers at the same time.</p>
         * <p>Default value: true. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>False</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder desktopNameSuffix(Boolean desktopNameSuffix) {
            this.putQueryParameter("DesktopNameSuffix", desktopNameSuffix);
            this.desktopNameSuffix = desktopNameSuffix;
            return this;
        }

        /**
         * <p>The details of the scheduled task on cloud computers.</p>
         */
        public Builder desktopTimers(java.util.List<DesktopTimers> desktopTimers) {
            this.putQueryParameter("DesktopTimers", desktopTimers);
            this.desktopTimers = desktopTimers;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>To be hidden.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The IDs of the end users to which you want to assign the cloud computers. You can specify 1 to 100 IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder endUserId(java.util.List<String> endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The ID of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-boyczi8enfyc5****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The custom hostnames of the cloud computers. This parameter is valid only if the office network is an AD office network and the operating system type of the cloud computers is Windows.</p>
         * <p>The hostnames must meet the following requirements:</p>
         * <ul>
         * <li>The hostnames must be 2 to 15 characters in length.</li>
         * <li>The hostnames can contain only letters, digits, and hyphens (-). The hostnames cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</li>
         * </ul>
         * <p>When you create multiple cloud computers, you can use the <code>name_prefix[begin_number,bits]name_suffix</code> naming format to name the cloud computers. For example, if you set the value of the Hostname parameter to ecd-[1,4]-test, the hostname of the first cloud computer is ecd-0001-test, the hostname of the second cloud computer is ecd-0002-test, and so on.</p>
         * <ul>
         * <li><code>name_prefix</code>: the prefix of the hostname.</li>
         * <li><code>[begin_number,bits]</code>: the sequential number in the hostname. The <code>begin_number</code> value is the starting digit. Valid values of begin_number: 0 to 999999. Default value: 0. The <code>bits</code> value is the number of digits. Valid values: 1 to 6. Default value: 6.</li>
         * <li><code>name_suffix</code>: the suffix of the hostname.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testhost</p>
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         */
        public Builder monthDesktopSetting(MonthDesktopSetting monthDesktopSetting) {
            this.putQueryParameter("MonthDesktopSetting", monthDesktopSetting);
            this.monthDesktopSetting = monthDesktopSetting;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+os-c5cy7q578s8jc****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The subscription duration of the cloud desktop that you want to create. The unit is specified by the <code>PeriodUnit</code> parameter. This parameter takes effect and is required only when the <code>ChargeType</code> parameter is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li><p>Valid values if the <code>PeriodUnit</code> parameter is set to <code>Month</code>:</p>
         * <ul>
         * <li>1</li>
         * <li>2</li>
         * <li>3</li>
         * <li>6</li>
         * </ul>
         * </li>
         * <li><p>Valid values if the <code>PeriodUnit</code> parameter is set to <code>Year</code>:</p>
         * <ul>
         * <li>1</li>
         * <li>2</li>
         * <li>3</li>
         * <li>4</li>
         * <li>5</li>
         * </ul>
         * </li>
         * </ul>
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
         * <p>The unit of the subscription duration.</p>
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
         * <p>The ID of the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>system-all-enabled-policy</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The ID of the sales promotion.</p>
         * 
         * <strong>example:</strong>
         * <p>23141</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The tags that you want to add to the cloud desktop.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TimerGroupId.
         */
        public Builder timerGroupId(String timerGroupId) {
            this.putQueryParameter("TimerGroupId", timerGroupId);
            this.timerGroupId = timerGroupId;
            return this;
        }

        /**
         * <p>How the cloud computers are assigned.</p>
         * <blockquote>
         * <p> If you do not specify the <code>EndUserId</code> parameter, the cloud computers are not assigned to end users after the cloud computers are created.</p>
         * </blockquote>
         * <p>Default value: ALL. Valid values:</p>
         * <ul>
         * <li><p>ALL: If you specify the EndUserId parameter, the cloud computers are assigned to all specified end users after the cloud computers are created.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PER_USER: If you specify the EndUserId parameter, the cloud computers are evenly assigned to the specified end users after the cloud computers are created.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>In this case, you must make sure that the value of the Amount parameter can be divided by the N value of the EndUserId.N parameter that you specify.</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder userAssignMode(String userAssignMode) {
            this.putQueryParameter("UserAssignMode", userAssignMode);
            this.userAssignMode = userAssignMode;
            return this;
        }

        /**
         * <p>Details about the custom command scripts.</p>
         */
        public Builder userCommands(java.util.List<UserCommands> userCommands) {
            this.putQueryParameter("UserCommands", userCommands);
            this.userCommands = userCommands;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>To be hidden.</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>Specifies whether to enable disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled);
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }

        /**
         * <p>The ID of the Key Management Service (KMS) key that you want to use when disk encryption is enabled. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to obtain a list of KMS keys.</p>
         * 
         * <strong>example:</strong>
         * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
         */
        public Builder volumeEncryptionKey(String volumeEncryptionKey) {
            this.putQueryParameter("VolumeEncryptionKey", volumeEncryptionKey);
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>To be hidden.</p>
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

    /**
     * 
     * {@link CreateDesktopsRequest} extends {@link TeaModel}
     *
     * <p>CreateDesktopsRequest</p>
     */
    public static class BundleModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        @com.aliyun.core.annotation.Validation(maximum = 300)
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

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
        public java.util.List<String> getEndUserIds() {
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
            private java.util.List<String> endUserIds; 
            private String hostname; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            /**
             * <p>The number of cloud computers that you want to create. Valid values: 1 to 300. Default value: null.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The ID of a cloud computer template.</p>
             * 
             * <strong>example:</strong>
             * <p>b-je9hani001wfn****</p>
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * <p>The name of the cloud computer. The name must meet the following requirements:</p>
             * <ul>
             * <li>The name must be 1 to 64 characters in length.</li>
             * <li>The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
             * <li>The name can only contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testDesktopName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The IDs of the end users to whom the cloud computer are assigned.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The custom hostnames of the cloud computers. This parameter is valid only if the office network is an AD office network and the operating system type of the cloud computers is Windows.</p>
             * <p>The hostnames must meet the following requirements:</p>
             * <ul>
             * <li>The hostnames must be 2 to 15 characters in length.</li>
             * <li>The hostnames can contain only letters, digits, and hyphens (-). The hostnames cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</li>
             * </ul>
             * <p>When you create multiple cloud computers, you can use the <code>name_prefix[begin_number,bits]name_suffix</code> naming format to name the cloud computers. For example, if you set the value of the Hostname parameter to ecd-[1,4]-test, the hostname of the first cloud computer is ecd-0001-test, the hostname of the second cloud computer is ecd-0002-test, and so on.</p>
             * <ul>
             * <li><code>name_prefix</code>: the prefix of the hostname.</li>
             * <li><code>[begin_number,bits]</code>: the sequential number in the hostname. The <code>begin_number</code> value is the starting digit. Valid values of begin_number: 0 to 999999. Default value: 0. The <code>bits</code> value is the number of digits. Valid values: 1 to 6. Default value: 6.</li>
             * <li><code>name_suffix</code>: the suffix of the hostname.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testhost</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Specifies whether to enable disk encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to query the list of KMS keys.</p>
             * 
             * <strong>example:</strong>
             * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
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
    /**
     * 
     * {@link CreateDesktopsRequest} extends {@link TeaModel}
     *
     * <p>CreateDesktopsRequest</p>
     */
    public static class DesktopAttachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("DataDiskPerLevel")
        private String dataDiskPerLevel;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("DefaultLanguage")
        private String defaultLanguage;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskPerLevel")
        private String systemDiskPerLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private DesktopAttachment(Builder builder) {
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskPerLevel = builder.dataDiskPerLevel;
            this.dataDiskSize = builder.dataDiskSize;
            this.defaultLanguage = builder.defaultLanguage;
            this.desktopType = builder.desktopType;
            this.imageId = builder.imageId;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskPerLevel = builder.systemDiskPerLevel;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopAttachment create() {
            return builder().build();
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskPerLevel
         */
        public String getDataDiskPerLevel() {
            return this.dataDiskPerLevel;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return defaultLanguage
         */
        public String getDefaultLanguage() {
            return this.defaultLanguage;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskPerLevel
         */
        public String getSystemDiskPerLevel() {
            return this.systemDiskPerLevel;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private String dataDiskCategory; 
            private String dataDiskPerLevel; 
            private Integer dataDiskSize; 
            private String defaultLanguage; 
            private String desktopType; 
            private String imageId; 
            private String systemDiskCategory; 
            private String systemDiskPerLevel; 
            private Integer systemDiskSize; 

            /**
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskPerLevel.
             */
            public Builder dataDiskPerLevel(String dataDiskPerLevel) {
                this.dataDiskPerLevel = dataDiskPerLevel;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DefaultLanguage.
             */
            public Builder defaultLanguage(String defaultLanguage) {
                this.defaultLanguage = defaultLanguage;
                return this;
            }

            /**
             * DesktopType.
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskPerLevel.
             */
            public Builder systemDiskPerLevel(String systemDiskPerLevel) {
                this.systemDiskPerLevel = systemDiskPerLevel;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public DesktopAttachment build() {
                return new DesktopAttachment(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDesktopsRequest} extends {@link TeaModel}
     *
     * <p>CreateDesktopsRequest</p>
     */
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
             * <p>Specifies whether to allow the end user to configure the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The cron expression for the scheduled task.</p>
             * <blockquote>
             * <p> The time must be in UTC. For example, for 24:00 (UTC+8), you must set the value to 0 0 16 ? * 1,2,3,4,5,6,7</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0 40 7 ? * 1,2,3,4,5,6,7</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Specifies whether to forcibly execute the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true: forcibly executes the scheduled task regardless of the status and connection of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false: does not forcibly execute the scheduled task.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The interval at which cloud computers are created. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The operations that scheduled tasks support. This parameter is valid only when TimerType is set to NoConnect.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Hibernate: hibernates the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Shutdown: stops the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The reset type of the cloud computers.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>RESET_TYPE_SYSTEM: resets the system disks.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>RESET_TYPE_BOTH: resets the system disks and data disks.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESET_TYPE_SYSTEM</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>NoOperationReboot</p>
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
    /**
     * 
     * {@link CreateDesktopsRequest} extends {@link TeaModel}
     *
     * <p>CreateDesktopsRequest</p>
     */
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
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder buyerId(Long buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
    /**
     * 
     * {@link CreateDesktopsRequest} extends {@link TeaModel}
     *
     * <p>CreateDesktopsRequest</p>
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

            /**
             * <p>The key of the tag. You can specify 1 to 20 keys for a tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. You can specify 1 to 20 values for a tag.</p>
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
    /**
     * 
     * {@link CreateDesktopsRequest} extends {@link TeaModel}
     *
     * <p>CreateDesktopsRequest</p>
     */
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
             * <p>The command content.</p>
             * 
             * <strong>example:</strong>
             * <p>bmV3LWl0ZW0gZDpcdGVzdF91c2VyX2NvbW1hbmRzLnR4dCAtdHlwZSBm****</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The encoding mode of the command content.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Base64: encodes the command content in Base64.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>PlainText: does not encode the command content.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Base64</p>
             */
            public Builder contentEncoding(String contentEncoding) {
                this.contentEncoding = contentEncoding;
                return this;
            }

            /**
             * <p>The language type of the command.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>RunPowerShellScript: PowerShell commands (applicable to Windows cloud computers).</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>RunShellScript: shell commands (applicable to Linux cloud computers).</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>RunBatScript: batch commands (applicable to Windows cloud computers).</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RunPowerShellScript</p>
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
