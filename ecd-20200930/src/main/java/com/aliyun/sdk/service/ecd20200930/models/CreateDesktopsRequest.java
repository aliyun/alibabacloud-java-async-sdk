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
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * BundleId.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * DesktopName.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * DesktopNameSuffix.
         */
        public Builder desktopNameSuffix(Boolean desktopNameSuffix) {
            this.putQueryParameter("DesktopNameSuffix", desktopNameSuffix);
            this.desktopNameSuffix = desktopNameSuffix;
            return this;
        }

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * UserAssignMode.
         */
        public Builder userAssignMode(String userAssignMode) {
            this.putQueryParameter("UserAssignMode", userAssignMode);
            this.userAssignMode = userAssignMode;
            return this;
        }

        /**
         * UserCommands.
         */
        public Builder userCommands(java.util.List < UserCommands> userCommands) {
            this.putQueryParameter("UserCommands", userCommands);
            this.userCommands = userCommands;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * VolumeEncryptionEnabled.
         */
        public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled);
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }

        /**
         * VolumeEncryptionKey.
         */
        public Builder volumeEncryptionKey(String volumeEncryptionKey) {
            this.putQueryParameter("VolumeEncryptionKey", volumeEncryptionKey);
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }

        /**
         * VpcId.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 自定义脚本命令编码，默认Base64编码
             */
            public Builder contentEncoding(String contentEncoding) {
                this.contentEncoding = contentEncoding;
                return this;
            }

            /**
             * ContentType.
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
