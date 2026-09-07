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
    @com.aliyun.core.annotation.NameInMap("AppRuleId")
    private String appRuleId;

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
    @com.aliyun.core.annotation.NameInMap("ChannelCookie")
    private String channelCookie;

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
    @com.aliyun.core.annotation.NameInMap("DesktopNameModel")
    private DesktopNameModel desktopNameModel;

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
    @com.aliyun.core.annotation.NameInMap("ExtendInfo")
    private String extendInfo;

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
    @com.aliyun.core.annotation.NameInMap("OuPath")
    private String ouPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PurchaseOptions")
    private PurchaseOptions purchaseOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosRuleId")
    private String qosRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SavingPlanId")
    private String savingPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotPolicyId")
    private String snapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubPayType")
    private String subPayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubnetId")
    private String subnetId;

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
        this.appRuleId = builder.appRuleId;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bundleId = builder.bundleId;
        this.bundleModels = builder.bundleModels;
        this.channelCookie = builder.channelCookie;
        this.chargeType = builder.chargeType;
        this.desktopAttachment = builder.desktopAttachment;
        this.desktopMemberIp = builder.desktopMemberIp;
        this.desktopName = builder.desktopName;
        this.desktopNameModel = builder.desktopNameModel;
        this.desktopNameSuffix = builder.desktopNameSuffix;
        this.desktopTimers = builder.desktopTimers;
        this.directoryId = builder.directoryId;
        this.endUserId = builder.endUserId;
        this.extendInfo = builder.extendInfo;
        this.groupId = builder.groupId;
        this.hostname = builder.hostname;
        this.monthDesktopSetting = builder.monthDesktopSetting;
        this.officeSiteId = builder.officeSiteId;
        this.ouPath = builder.ouPath;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.promotionId = builder.promotionId;
        this.purchaseOptions = builder.purchaseOptions;
        this.qosRuleId = builder.qosRuleId;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.resourceGroupId = builder.resourceGroupId;
        this.savingPlanId = builder.savingPlanId;
        this.snapshotPolicyId = builder.snapshotPolicyId;
        this.subPayType = builder.subPayType;
        this.subnetId = builder.subnetId;
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
     * @return appRuleId
     */
    public String getAppRuleId() {
        return this.appRuleId;
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
     * @return channelCookie
     */
    public String getChannelCookie() {
        return this.channelCookie;
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
     * @return desktopNameModel
     */
    public DesktopNameModel getDesktopNameModel() {
        return this.desktopNameModel;
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
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
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
     * @return ouPath
     */
    public String getOuPath() {
        return this.ouPath;
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
     * @return purchaseOptions
     */
    public PurchaseOptions getPurchaseOptions() {
        return this.purchaseOptions;
    }

    /**
     * @return qosRuleId
     */
    public String getQosRuleId() {
        return this.qosRuleId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return savingPlanId
     */
    public String getSavingPlanId() {
        return this.savingPlanId;
    }

    /**
     * @return snapshotPolicyId
     */
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    /**
     * @return subPayType
     */
    public String getSubPayType() {
        return this.subPayType;
    }

    /**
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
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
        private String appRuleId; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bundleId; 
        private java.util.List<BundleModels> bundleModels; 
        private String channelCookie; 
        private String chargeType; 
        private DesktopAttachment desktopAttachment; 
        private String desktopMemberIp; 
        private String desktopName; 
        private DesktopNameModel desktopNameModel; 
        private Boolean desktopNameSuffix; 
        private java.util.List<DesktopTimers> desktopTimers; 
        private String directoryId; 
        private java.util.List<String> endUserId; 
        private String extendInfo; 
        private String groupId; 
        private String hostname; 
        private MonthDesktopSetting monthDesktopSetting; 
        private String officeSiteId; 
        private String ouPath; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String promotionId; 
        private PurchaseOptions purchaseOptions; 
        private String qosRuleId; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private String resourceGroupId; 
        private String savingPlanId; 
        private String snapshotPolicyId; 
        private String subPayType; 
        private String subnetId; 
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
            this.appRuleId = request.appRuleId;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bundleId = request.bundleId;
            this.bundleModels = request.bundleModels;
            this.channelCookie = request.channelCookie;
            this.chargeType = request.chargeType;
            this.desktopAttachment = request.desktopAttachment;
            this.desktopMemberIp = request.desktopMemberIp;
            this.desktopName = request.desktopName;
            this.desktopNameModel = request.desktopNameModel;
            this.desktopNameSuffix = request.desktopNameSuffix;
            this.desktopTimers = request.desktopTimers;
            this.directoryId = request.directoryId;
            this.endUserId = request.endUserId;
            this.extendInfo = request.extendInfo;
            this.groupId = request.groupId;
            this.hostname = request.hostname;
            this.monthDesktopSetting = request.monthDesktopSetting;
            this.officeSiteId = request.officeSiteId;
            this.ouPath = request.ouPath;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.promotionId = request.promotionId;
            this.purchaseOptions = request.purchaseOptions;
            this.qosRuleId = request.qosRuleId;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.resourceGroupId = request.resourceGroupId;
            this.savingPlanId = request.savingPlanId;
            this.snapshotPolicyId = request.snapshotPolicyId;
            this.subPayType = request.subPayType;
            this.subnetId = request.subnetId;
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
         * <p>The number of cloud computers to create. Valid values: 1 to 300. Default value: 1.</p>
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
         * <p>The ID of the application control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>bwr-245d4e0e6b7d42f5afa97eb3fbc7e488</p>
         */
        public Builder appRuleId(String appRuleId) {
            this.putQueryParameter("AppRuleId", appRuleId);
            this.appRuleId = appRuleId;
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
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
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
         * <p>The cloud computer template ID. If no template ID is specified, you can create a cloud computer by providing the required fields.</p>
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
         * <p>The list of cloud computer templates.</p>
         */
        public Builder bundleModels(java.util.List<BundleModels> bundleModels) {
            this.putQueryParameter("BundleModels", bundleModels);
            this.bundleModels = bundleModels;
            return this;
        }

        /**
         * <blockquote>
         * <p>This field is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PBKB1QbqEl2tslEuU6gRrLxvCFBU2M%2FVD0Eru6Oo%2FI9LTU3XQhvq3PGMWarE%2BPJdkNvCqT3blqlRSthNy4A%2BJQ%3D%3D</p>
         */
        public Builder channelCookie(String channelCookie) {
            this.putQueryParameter("ChannelCookie", channelCookie);
            this.channelCookie = channelCookie;
            return this;
        }

        /**
         * <p>The billing method of the cloud computer.</p>
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
         * <p>The parameters for creating a cloud computer without a template. This parameter is invalid when the BundleId parameter is specified.</p>
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
         * <p>The cloud computer name. The naming rules are as follows:</p>
         * <ul>
         * <li>The name can be up to 64 characters in length.</li>
         * <li>The name must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The name can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), or hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer01</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * <p>Controls the format of the cloud computer name.</p>
         */
        public Builder desktopNameModel(DesktopNameModel desktopNameModel) {
            String desktopNameModelShrink = shrink(desktopNameModel, "DesktopNameModel", "json");
            this.putQueryParameter("DesktopNameModel", desktopNameModelShrink);
            this.desktopNameModel = desktopNameModel;
            return this;
        }

        /**
         * <p>Specifies whether to automatically append a suffix to the cloud computer name when creating multiple cloud computers in a batch.</p>
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
         * <p>The details of the cloud computer scheduled tasks. This parameter is being deprecated. Use the TimerGroupId parameter instead.</p>
         */
        public Builder desktopTimers(java.util.List<DesktopTimers> desktopTimers) {
            this.putQueryParameter("DesktopTimers", desktopTimers);
            this.desktopTimers = desktopTimers;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-300943****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The list of authorized user IDs to add to the cloud computer. You can specify 1 to 100 user IDs.</p>
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
         * <p>The extended information in JSON string format. This parameter is available only for internal customers.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extendInfo(String extendInfo) {
            this.putQueryParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * <p>The cloud computer pool ID.</p>
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
         * <p>The custom hostname of the cloud computer. Only cloud computers with a Windows operating system in an AD office network are supported.</p>
         * <p>The naming rules for the hostname are as follows:</p>
         * <ul>
         * <li>The hostname must be 2 to 15 characters in length.</li>
         * <li>The hostname can contain letters, digits, or hyphens (-). It cannot start or end with a hyphen, cannot contain consecutive hyphens, and cannot consist of only digits.</li>
         * </ul>
         * <p>When creating multiple cloud computers, you can use the <code>name_prefix[begin_number,bits]name_suffix</code> format to name them uniformly. For example, if Hostname is set to ecd-[1,4]-test, the hostname of the first cloud computer is ecd-0001-test, the hostname of the second cloud computer is ecd-0002-test, and so on.</p>
         * <ul>
         * <li><code>name_prefix</code>: the prefix of the hostname.</li>
         * <li><code>[begin_number,bits]</code>: the sequential number in the hostname. <code>begin_number</code> specifies the start number. Valid values: 0 to 999999. Default value: 0. <code>bits</code> specifies the number of digits. Valid values: 1 to 6. Default value: 6.</li>
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
         * <p>The purchase parameters for the monthly hours package.</p>
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
         * <p>cn-hangzhou+dir-387822****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The organizational unit (OU) path. After this parameter is specified, the cloud computer joins the corresponding OU in Active Directory (AD).</p>
         * 
         * <strong>example:</strong>
         * <p>test.com/wuyingtest/computers</p>
         */
        public Builder ouPath(String ouPath) {
            this.putQueryParameter("OuPath", ouPath);
            this.ouPath = ouPath;
            return this;
        }

        /**
         * <p>The subscription duration of the resource. The unit is specified by <code>PeriodUnit</code>. This parameter takes effect and is required only when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
         * <ul>
         * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values of this parameter:</p>
         * <ul>
         * <li>1</li>
         * <li>2</li>
         * <li>3</li>
         * <li>6</li>
         * </ul>
         * </li>
         * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values of this parameter:</p>
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
         * <p>The policy ID.</p>
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
         * <p>The promotion ID.</p>
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
         * <p>The additional parameters for a specific purchase type.</p>
         */
        public Builder purchaseOptions(PurchaseOptions purchaseOptions) {
            String purchaseOptionsShrink = shrink(purchaseOptions, "PurchaseOptions", "json");
            this.putQueryParameter("PurchaseOptions", purchaseOptionsShrink);
            this.purchaseOptions = purchaseOptions;
            return this;
        }

        /**
         * <p>The ID of the public network bandwidth throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-52fqmg6kvyro7zu4l</p>
         */
        public Builder qosRuleId(String qosRuleId) {
            this.putQueryParameter("QosRuleId", qosRuleId);
            this.qosRuleId = qosRuleId;
            return this;
        }

        /**
         * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service (EDS).</p>
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
         * <p>The ID of the resource owner in reseller mode. You do not need to specify this parameter if you are not in reseller mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1828644634819902</p>
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <p>The ID of the EDS resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-3mtuc28rx95lx****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This field is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>spn-26c1b7bcrjcI****</p>
         */
        public Builder savingPlanId(String savingPlanId) {
            this.putQueryParameter("SavingPlanId", savingPlanId);
            this.savingPlanId = savingPlanId;
            return this;
        }

        /**
         * <p>The ID of the Elastic Desktop Service (EDS) automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-28mp6my0l6zow****</p>
         */
        public Builder snapshotPolicyId(String snapshotPolicyId) {
            this.putQueryParameter("SnapshotPolicyId", snapshotPolicyId);
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }

        /**
         * <p>The purchase method of the cloud computer. Valid values:</p>
         * <ul>
         * <li>prePaid: monthly subscription with unlimited duration.</li>
         * <li>postPaid: pay-as-you-go.</li>
         * <li>monthPackage: monthly hours package.</li>
         * <li>jvsAgentPackage: JVS Agent hours package.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>monthPackage</p>
         */
        public Builder subPayType(String subPayType) {
            this.putQueryParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        /**
         * <p>The subnet ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1m*****</p>
         */
        public Builder subnetId(String subnetId) {
            this.putQueryParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the scheduled task group.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0caoeogrk9m5****</p>
         */
        public Builder timerGroupId(String timerGroupId) {
            this.putQueryParameter("TimerGroupId", timerGroupId);
            this.timerGroupId = timerGroupId;
            return this;
        }

        /**
         * <p>The cloud computer assignment mode.</p>
         * <blockquote>
         * <p>If <code>EndUserId</code> is not specified, the created cloud computers are not assigned to any user.</p>
         * </blockquote>
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
         * <p>The custom command script data.</p>
         */
        public Builder userCommands(java.util.List<UserCommands> userCommands) {
            this.putQueryParameter("UserCommands", userCommands);
            this.userCommands = userCommands;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>Specifies whether to enable cloud disk encryption.</p>
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
         * <p>The ID of the Key Management Service (KMS) key used for cloud disk encryption. Call <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> to query available keys.</p>
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
         * <p>This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6w8u60n8xbkg5el****</p>
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

            private Builder() {
            } 

            private Builder(BundleModels model) {
                this.amount = model.amount;
                this.bundleId = model.bundleId;
                this.desktopName = model.desktopName;
                this.endUserIds = model.endUserIds;
                this.hostname = model.hostname;
                this.volumeEncryptionEnabled = model.volumeEncryptionEnabled;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
            } 

            /**
             * <p>The number of cloud computers to create. Valid values: 1 to 300. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The cloud computer template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b-je9hani001wfn****</p>
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * <p>The cloud computer name. The naming rules are as follows:</p>
             * <ul>
             * <li>The name can be up to 64 characters in length.</li>
             * <li>The name must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
             * <li>The name can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), or hyphens (-).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DemoComputer02</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The list of users to whom the cloud computers are assigned.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The custom hostname of the cloud computer. Only cloud computers with a Windows operating system in an AD office network are supported.</p>
             * <p>The naming rules for the hostname are as follows:</p>
             * <ul>
             * <li>The hostname must be 2 to 15 characters in length.</li>
             * <li>The hostname can contain letters, digits, or hyphens (-). It cannot start or end with a hyphen, cannot contain consecutive hyphens, and cannot consist of only digits.</li>
             * </ul>
             * <p>When creating multiple cloud computers, you can use the <code>name_prefix[begin_number,bits]name_suffix</code> format to name them uniformly. For example, if Hostname is set to ecd-[1,4]-test, the hostname of the first cloud computer is ecd-0001-test, the hostname of the second cloud computer is ecd-0002-test, and so on.</p>
             * <ul>
             * <li><code>name_prefix</code>: the prefix of the hostname.</li>
             * <li><code>[begin_number,bits]</code>: the sequential number in the hostname. <code>begin_number</code> specifies the start number. Valid values: 0 to 999999. Default value: 0. <code>bits</code> specifies the number of digits. Valid values: 1 to 6. Default value: 6.</li>
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
             * <p>Specifies whether to enable cloud disk encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key used for cloud disk encryption. Call <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> to query available keys.</p>
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

            private Builder() {
            } 

            private Builder(DesktopAttachment model) {
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskPerLevel = model.dataDiskPerLevel;
                this.dataDiskSize = model.dataDiskSize;
                this.defaultLanguage = model.defaultLanguage;
                this.desktopType = model.desktopType;
                this.imageId = model.imageId;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskPerLevel = model.systemDiskPerLevel;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>The type of the data cloud disk. The system cloud disk and data cloud disk must be of the same type. Valid values:</p>
             * <ul>
             * <li>cloud_auto: enhanced SSD (ESSD) AutoPL cloud disk</li>
             * <li>cloud_essd: ESSD cloud disk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <p>The performance level of the ESSD cloud disk. This parameter is required if you select an ESSD cloud disk. Valid values:</p>
             * <ul>
             * <li>PL0</li>
             * <li>PL1</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder dataDiskPerLevel(String dataDiskPerLevel) {
                this.dataDiskPerLevel = dataDiskPerLevel;
                return this;
            }

            /**
             * <p>The capacity of the user disk. Valid values: 40 to 2040. The value must be a multiple of 10. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>The language. Valid values:</p>
             * <ul>
             * <li>zh-CN</li>
             * <li>zh-HK</li>
             * <li>en-US</li>
             * <li>ja-JP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder defaultLanguage(String defaultLanguage) {
                this.defaultLanguage = defaultLanguage;
                return this;
            }

            /**
             * <p>The cloud computer specification. You can call <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> to query the specification IDs supported by cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>eds.enterprise_office.8c16g</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-39ddhdb0ggzjx*****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The type of the system cloud disk. The system cloud disk and data cloud disk must be of the same type. Valid values:</p>
             * <ul>
             * <li>cloud_auto: enhanced SSD (ESSD) AutoPL cloud disk</li>
             * <li>cloud_essd: ESSD cloud disk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The performance level of the ESSD cloud disk. This parameter is required if you select an ESSD cloud disk. Valid values:</p>
             * <ul>
             * <li>PL0</li>
             * <li>PL1</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder systemDiskPerLevel(String systemDiskPerLevel) {
                this.systemDiskPerLevel = systemDiskPerLevel;
                return this;
            }

            /**
             * <p>The capacity of the system cloud disk. Valid values: 40 to 2040. The value must be a multiple of 10. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
    public static class DesktopNameModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopNameIsSuffix")
        private Boolean desktopNameIsSuffix;

        private DesktopNameModel(Builder builder) {
            this.desktopNameIsSuffix = builder.desktopNameIsSuffix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopNameModel create() {
            return builder().build();
        }

        /**
         * @return desktopNameIsSuffix
         */
        public Boolean getDesktopNameIsSuffix() {
            return this.desktopNameIsSuffix;
        }

        public static final class Builder {
            private Boolean desktopNameIsSuffix; 

            private Builder() {
            } 

            private Builder(DesktopNameModel model) {
                this.desktopNameIsSuffix = model.desktopNameIsSuffix;
            } 

            /**
             * <p>Specifies whether to automatically append a suffix to the cloud computer name when creating multiple cloud computers in a batch. Default value: true.</p>
             */
            public Builder desktopNameIsSuffix(Boolean desktopNameIsSuffix) {
                this.desktopNameIsSuffix = desktopNameIsSuffix;
                return this;
            }

            public DesktopNameModel build() {
                return new DesktopNameModel(this);
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

            private Builder() {
            } 

            private Builder(DesktopTimers model) {
                this.allowClientSetting = model.allowClientSetting;
                this.cronExpression = model.cronExpression;
                this.enforce = model.enforce;
                this.interval = model.interval;
                this.operationType = model.operationType;
                this.resetType = model.resetType;
                this.timerType = model.timerType;
            } 

            /**
             * <p>Specifies whether to allow end users to configure scheduled tasks on their own.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The cron expression of the scheduled task.</p>
             * <blockquote>
             * <p>Notice: Specify the time in UTC. For example, to schedule a task at 00:00 (UTC+8) every day, set this parameter to 0 0 16 ? * 1,2,3,4,5,6,7.</notice></p>
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
             * <p>Specifies whether to forcefully execute the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The time interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The operation type of the scheduled task. Currently, only the disconnection scheduled task is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The reset type of the cloud computer.</p>
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

            private Builder() {
            } 

            private Builder(MonthDesktopSetting model) {
                this.buyerId = model.buyerId;
                this.desktopId = model.desktopId;
                this.useDuration = model.useDuration;
            } 

            /**
             * <blockquote>
             * <p>This field is not publicly available.</p>
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
             * <p>This field is not publicly available.</p>
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
             * <p>The plan selected when purchasing a monthly hours package. Valid values: 120, 250, and 360.</p>
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
    public static class PurchaseOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreditPackageAmountSpec")
        private Integer creditPackageAmountSpec;

        @com.aliyun.core.annotation.NameInMap("CreditPackagePeriod")
        private Integer creditPackagePeriod;

        @com.aliyun.core.annotation.NameInMap("CreditPackagePeriodUnit")
        private String creditPackagePeriodUnit;

        @com.aliyun.core.annotation.NameInMap("MonthlyCredits")
        private Integer monthlyCredits;

        private PurchaseOptions(Builder builder) {
            this.creditPackageAmountSpec = builder.creditPackageAmountSpec;
            this.creditPackagePeriod = builder.creditPackagePeriod;
            this.creditPackagePeriodUnit = builder.creditPackagePeriodUnit;
            this.monthlyCredits = builder.monthlyCredits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PurchaseOptions create() {
            return builder().build();
        }

        /**
         * @return creditPackageAmountSpec
         */
        public Integer getCreditPackageAmountSpec() {
            return this.creditPackageAmountSpec;
        }

        /**
         * @return creditPackagePeriod
         */
        public Integer getCreditPackagePeriod() {
            return this.creditPackagePeriod;
        }

        /**
         * @return creditPackagePeriodUnit
         */
        public String getCreditPackagePeriodUnit() {
            return this.creditPackagePeriodUnit;
        }

        /**
         * @return monthlyCredits
         */
        public Integer getMonthlyCredits() {
            return this.monthlyCredits;
        }

        public static final class Builder {
            private Integer creditPackageAmountSpec; 
            private Integer creditPackagePeriod; 
            private String creditPackagePeriodUnit; 
            private Integer monthlyCredits; 

            private Builder() {
            } 

            private Builder(PurchaseOptions model) {
                this.creditPackageAmountSpec = model.creditPackageAmountSpec;
                this.creditPackagePeriod = model.creditPackagePeriod;
                this.creditPackagePeriodUnit = model.creditPackagePeriodUnit;
                this.monthlyCredits = model.monthlyCredits;
            } 

            /**
             * <p>The EDS credit package quota.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder creditPackageAmountSpec(Integer creditPackageAmountSpec) {
                this.creditPackageAmountSpec = creditPackageAmountSpec;
                return this;
            }

            /**
             * <p>The EDS credit package duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder creditPackagePeriod(Integer creditPackagePeriod) {
                this.creditPackagePeriod = creditPackagePeriod;
                return this;
            }

            /**
             * <p>The unit of the credit package duration.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder creditPackagePeriodUnit(String creditPackagePeriodUnit) {
                this.creditPackagePeriodUnit = creditPackagePeriodUnit;
                return this;
            }

            /**
             * <p>The monthly credit package. This parameter specifies the credit plan when purchasing Agent resources. Valid values: 200, 1600, and 4000.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder monthlyCredits(Integer monthlyCredits) {
                this.monthlyCredits = monthlyCredits;
                return this;
            }

            public PurchaseOptions build() {
                return new PurchaseOptions(this);
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. You can specify 1 to 20 tag keys.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. You can specify 1 to 20 tag values.</p>
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

            private Builder() {
            } 

            private Builder(UserCommands model) {
                this.content = model.content;
                this.contentEncoding = model.contentEncoding;
                this.contentType = model.contentType;
            } 

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
             * <p>The encoding method of the command content (CommandContent).</p>
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
