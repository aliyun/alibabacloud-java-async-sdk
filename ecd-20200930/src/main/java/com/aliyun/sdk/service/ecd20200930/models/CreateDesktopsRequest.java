// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopsRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopsRequest</p>
 */
public class CreateDesktopsRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(maximum = 500)
    private Integer amount;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("BundleId")
    private String bundleId;

    @Query
    @NameInMap("BundleModels")
    private java.util.List < BundleModels> bundleModels;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("DesktopName")
    private String desktopName;

    @Query
    @NameInMap("DesktopNameSuffix")
    private Boolean desktopNameSuffix;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("EndUserId")
    private java.util.List < String > endUserId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Hostname")
    private String hostname;

    @Query
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PolicyGroupId")
    @Validation(required = true)
    private String policyGroupId;

    @Query
    @NameInMap("PromotionId")
    private String promotionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UserAssignMode")
    private String userAssignMode;

    @Query
    @NameInMap("UserCommands")
    private java.util.List < UserCommands> userCommands;

    @Query
    @NameInMap("UserName")
    private String userName;

    @Query
    @NameInMap("VolumeEncryptionEnabled")
    private Boolean volumeEncryptionEnabled;

    @Query
    @NameInMap("VolumeEncryptionKey")
    private String volumeEncryptionKey;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private CreateDesktopsRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bundleId = builder.bundleId;
        this.bundleModels = builder.bundleModels;
        this.chargeType = builder.chargeType;
        this.desktopName = builder.desktopName;
        this.desktopNameSuffix = builder.desktopNameSuffix;
        this.directoryId = builder.directoryId;
        this.endUserId = builder.endUserId;
        this.groupId = builder.groupId;
        this.hostname = builder.hostname;
        this.officeSiteId = builder.officeSiteId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
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
        private String desktopName; 
        private Boolean desktopNameSuffix; 
        private String directoryId; 
        private java.util.List < String > endUserId; 
        private String groupId; 
        private String hostname; 
        private String officeSiteId; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String promotionId; 
        private String regionId; 
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
            this.desktopName = request.desktopName;
            this.desktopNameSuffix = request.desktopNameSuffix;
            this.directoryId = request.directoryId;
            this.endUserId = request.endUserId;
            this.groupId = request.groupId;
            this.hostname = request.hostname;
            this.officeSiteId = request.officeSiteId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.tag = request.tag;
            this.userAssignMode = request.userAssignMode;
            this.userCommands = request.userCommands;
            this.userName = request.userName;
            this.volumeEncryptionEnabled = request.volumeEncryptionEnabled;
            this.volumeEncryptionKey = request.volumeEncryptionKey;
            this.vpcId = request.vpcId;
        } 

        /**
         * The number of cloud desktops that you want to create. Valid values: 1 to 300. Default value: 1.
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
         * Specifies whether to enable auto-renewal. This parameter takes effect only when the ChargeType parameter is set to PrePaid.````
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The ID of the desktop template.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * The desktop templates that you want to use.
         */
        public Builder bundleModels(java.util.List < BundleModels> bundleModels) {
            this.putQueryParameter("BundleModels", bundleModels);
            this.bundleModels = bundleModels;
            return this;
        }

        /**
         * The billing method of the cloud desktop.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The name of the cloud desktop. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must be 1 to 64 characters in length.
         * *   The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). It must start with a letter but cannot start with http:// or https://.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * Specifies whether to automatically add a suffix to the cloud desktop name when you create multiple cloud desktops at a time.
         */
        public Builder desktopNameSuffix(Boolean desktopNameSuffix) {
            this.putQueryParameter("DesktopNameSuffix", desktopNameSuffix);
            this.desktopNameSuffix = desktopNameSuffix;
            return this;
        }

        /**
         * This parameter is not available.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The IDs of the users that you want to authorize to use the cloud desktop. The cloud desktop is assigned to the users. You can specify IDs of 1 to 100 users.
         * <p>
         * 
         * *   Only one user can use the cloud desktop at a time.
         * *   If you do not specify the `EndUserId` parameter, the cloud desktop that you create is not assigned to users.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The ID of the desktop group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The hostname that you specify for the cloud desktop. You can specify only the hostname of a Windows cloud desktop in the workspace of the enterprise AD account type.
         * <p>
         * 
         * The hostname must meet the following requirements:
         * 
         * *   It must be 2 to 15 characters in length.
         * *   It can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.
         * 
         * If you create multiple cloud desktops, you can use the`  name_prefix[begin_number,bits]name_suffix ` format to determine the hostnames of the cloud desktops. For example, if you set Hostname to ecd-\[1,4]-test, the hostname of the first cloud desktop is ecd-0001-test and the hostname of the second cloud desktop is ecd-0002-test. Other hostnames follow the same rule.
         * 
         * *   `name_prefix`: the prefix of the hostname.
         * *   `[begin_number,bits]`: the ordered numbers in the hostname. begin_number: the start number. Valid values: 0 to 999999. Default value: 0. bits: the digit. Valid values: 1 to 6. Default value: 6.
         * *   `name_suffix`: the suffix of the hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * The ID of the workspace.
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
         * The tags that you want to add to the cloud desktop.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The assignment mode of the cloud desktop.
         * <p>
         * 
         * > If you do not specify the `EndUserId` parameter, the cloud desktop that you create is not assigned to users.
         */
        public Builder userAssignMode(String userAssignMode) {
            this.putQueryParameter("UserAssignMode", userAssignMode);
            this.userAssignMode = userAssignMode;
            return this;
        }

        /**
         * The custom command scripts of the user.
         */
        public Builder userCommands(java.util.List < UserCommands> userCommands) {
            this.putQueryParameter("UserCommands", userCommands);
            this.userCommands = userCommands;
            return this;
        }

        /**
         * This parameter is not available.
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
         * This parameter is not available.
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
        @NameInMap("Amount")
        @Validation(maximum = 300)
        private Integer amount;

        @NameInMap("BundleId")
        private String bundleId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("EndUserIds")
        private java.util.List < String > endUserIds;

        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
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
             * The number of cloud desktops that you want to create. Valid values: 1 to 300. Default value: 0.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The ID of the desktop template.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * The name of the cloud desktop.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The users to whom you want to assign the cloud desktops.
             */
            public Builder endUserIds(java.util.List < String > endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * The hostname that you specify for the cloud desktop. You can only specify the hostname of a Windows cloud desktop in the workspace of the enterprise AD account type.
             * <p>
             * 
             * The hostname must meet the following requirements:
             * 
             * *   It must be 2 to 15 characters in length.
             * *   It can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.
             * 
             * If you create multiple cloud desktops, you can use the`  name_prefix[begin_number,bits]name_suffix ` format to determine the hostnames of the cloud desktops. For example, if you set Hostname to ecd-\[1,4]-test, the hostname of the first cloud desktop is ecd-0001-test and the hostname of the second cloud desktop is ecd-0002-test. Other hostnames follow the same rule.
             * 
             * *   `name_prefix`: the prefix of the hostname.
             * *   `[begin_number,bits]`: the ordered numbers in the hostname. begin_number: the start number. Valid values: 0 to 999999. Default value: 0. bits: the digit. Valid values: 1 to 6. Default value: 6.
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
             * The ID of the Key Management Service (KMS) key that you want to use when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.
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
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
        @NameInMap("Content")
        @Validation(maxLength = 15000)
        private String content;

        @NameInMap("ContentEncoding")
        private String contentEncoding;

        @NameInMap("ContentType")
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
             * The content of the command.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The encoding mode of the command content (CommandContent).
             */
            public Builder contentEncoding(String contentEncoding) {
                this.contentEncoding = contentEncoding;
                return this;
            }

            /**
             * The language type of the command.
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
