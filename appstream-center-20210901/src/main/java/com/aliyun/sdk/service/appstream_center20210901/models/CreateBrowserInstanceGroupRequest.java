// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateBrowserInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateBrowserInstanceGroupRequest</p>
 */
public class CreateBrowserInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppPackageType")
    private String appPackageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthNotificationEnabled")
    private Boolean authNotificationEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BrowserConfig")
    private BrowserConfig browserConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeResourceMode")
    private String chargeResourceMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudBrowserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudBrowserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxAmount")
    private Integer maxAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Network")
    private Network network;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodePool")
    private NodePool nodePool;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityPolicy")
    private SecurityPolicy securityPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoragePolicy")
    private StoragePolicy storagePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubPayType")
    private String subPayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timers")
    private java.util.List<Timers> timers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private CreateBrowserInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appPackageType = builder.appPackageType;
        this.authNotificationEnabled = builder.authNotificationEnabled;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizRegionId = builder.bizRegionId;
        this.browserConfig = builder.browserConfig;
        this.chargeResourceMode = builder.chargeResourceMode;
        this.chargeType = builder.chargeType;
        this.cloudBrowserName = builder.cloudBrowserName;
        this.imageId = builder.imageId;
        this.instanceType = builder.instanceType;
        this.maxAmount = builder.maxAmount;
        this.network = builder.network;
        this.nodePool = builder.nodePool;
        this.osType = builder.osType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policy = builder.policy;
        this.promotionId = builder.promotionId;
        this.securityPolicy = builder.securityPolicy;
        this.storagePolicy = builder.storagePolicy;
        this.subPayType = builder.subPayType;
        this.tag = builder.tag;
        this.timers = builder.timers;
        this.userGroupIds = builder.userGroupIds;
        this.userInfo = builder.userInfo;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBrowserInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appPackageType
     */
    public String getAppPackageType() {
        return this.appPackageType;
    }

    /**
     * @return authNotificationEnabled
     */
    public Boolean getAuthNotificationEnabled() {
        return this.authNotificationEnabled;
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return browserConfig
     */
    public BrowserConfig getBrowserConfig() {
        return this.browserConfig;
    }

    /**
     * @return chargeResourceMode
     */
    public String getChargeResourceMode() {
        return this.chargeResourceMode;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return cloudBrowserName
     */
    public String getCloudBrowserName() {
        return this.cloudBrowserName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return maxAmount
     */
    public Integer getMaxAmount() {
        return this.maxAmount;
    }

    /**
     * @return network
     */
    public Network getNetwork() {
        return this.network;
    }

    /**
     * @return nodePool
     */
    public NodePool getNodePool() {
        return this.nodePool;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
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
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return securityPolicy
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    /**
     * @return storagePolicy
     */
    public StoragePolicy getStoragePolicy() {
        return this.storagePolicy;
    }

    /**
     * @return subPayType
     */
    public String getSubPayType() {
        return this.subPayType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timers
     */
    public java.util.List<Timers> getTimers() {
        return this.timers;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateBrowserInstanceGroupRequest, Builder> {
        private String appPackageType; 
        private Boolean authNotificationEnabled; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bizRegionId; 
        private BrowserConfig browserConfig; 
        private String chargeResourceMode; 
        private String chargeType; 
        private String cloudBrowserName; 
        private String imageId; 
        private String instanceType; 
        private Integer maxAmount; 
        private Network network; 
        private NodePool nodePool; 
        private String osType; 
        private Integer period; 
        private String periodUnit; 
        private Policy policy; 
        private String promotionId; 
        private SecurityPolicy securityPolicy; 
        private StoragePolicy storagePolicy; 
        private String subPayType; 
        private java.util.List<Tag> tag; 
        private java.util.List<Timers> timers; 
        private java.util.List<String> userGroupIds; 
        private UserInfo userInfo; 
        private java.util.List<Users> users; 

        private Builder() {
            super();
        } 

        private Builder(CreateBrowserInstanceGroupRequest request) {
            super(request);
            this.appPackageType = request.appPackageType;
            this.authNotificationEnabled = request.authNotificationEnabled;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizRegionId = request.bizRegionId;
            this.browserConfig = request.browserConfig;
            this.chargeResourceMode = request.chargeResourceMode;
            this.chargeType = request.chargeType;
            this.cloudBrowserName = request.cloudBrowserName;
            this.imageId = request.imageId;
            this.instanceType = request.instanceType;
            this.maxAmount = request.maxAmount;
            this.network = request.network;
            this.nodePool = request.nodePool;
            this.osType = request.osType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policy = request.policy;
            this.promotionId = request.promotionId;
            this.securityPolicy = request.securityPolicy;
            this.storagePolicy = request.storagePolicy;
            this.subPayType = request.subPayType;
            this.tag = request.tag;
            this.timers = request.timers;
            this.userGroupIds = request.userGroupIds;
            this.userInfo = request.userInfo;
            this.users = request.users;
        } 

        /**
         * <p>The plan identifier.</p>
         * <p>Do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder appPackageType(String appPackageType) {
            this.putBodyParameter("AppPackageType", appPackageType);
            this.appPackageType = appPackageType;
            return this;
        }

        /**
         * <p>Specifies whether to send authorization and deauthorization notification emails.</p>
         * <ul>
         * <li><code>true</code>: Sends the notification.</li>
         * <li><code>false</code>: Does not send the notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder authNotificationEnabled(Boolean authNotificationEnabled) {
            this.putBodyParameter("AuthNotificationEnabled", authNotificationEnabled);
            this.authNotificationEnabled = authNotificationEnabled;
            return this;
        }

        /**
         * <p>The automatic payment parameter.</p>
         * <p>Do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The auto-renewal parameter.</p>
         * <p>Do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The business region ID. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The browser configuration.</p>
         */
        public Builder browserConfig(BrowserConfig browserConfig) {
            String browserConfigShrink = shrink(browserConfig, "BrowserConfig", "json");
            this.putBodyParameter("BrowserConfig", browserConfigShrink);
            this.browserConfig = browserConfig;
            return this;
        }

        /**
         * <p>The resource billing mode.</p>
         * <p><strong>For MAU scenarios:</strong> Set this parameter to <code>AppInstance</code> to bill by instance resource.</p>
         * 
         * <strong>example:</strong>
         * <p>AppInstance</p>
         */
        public Builder chargeResourceMode(String chargeResourceMode) {
            this.putBodyParameter("ChargeResourceMode", chargeResourceMode);
            this.chargeResourceMode = chargeResourceMode;
            return this;
        }

        /**
         * <p>The billing type.</p>
         * <p><strong>For MAU scenarios:</strong> Set this parameter to <code>PostPaid</code>, which indicates pay-as-you-go billing.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The name of the cloud browser group. This parameter cannot be empty. The name is used to distinguish different browser groups in business management scenarios.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BusinessOfficeBrowser</p>
         */
        public Builder cloudBrowserName(String cloudBrowserName) {
            this.putBodyParameter("CloudBrowserName", cloudBrowserName);
            this.cloudBrowserName = cloudBrowserName;
            return this;
        }

        /**
         * <p>The image identifier used by the cloud browser. The image must be compatible with the operating system.</p>
         * <p>If this parameter is omitted, the default image available for the account is used. If no default image is available, the creation may fail.</p>
         * <p><strong>Usage condition:</strong> When <code>CookiesSync</code> is enabled, explicitly specify an image that supports cookie synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance type identifier. Select an instance type that matches the target region, operating system, and inventory conditions.</p>
         * <p>If this parameter is omitted, the default instance type is used.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.general.basic</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The capacity configuration for the MAU billing scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxAmount(Integer maxAmount) {
            this.putBodyParameter("MaxAmount", maxAmount);
            this.maxAmount = maxAmount;
            return this;
        }

        /**
         * <p>The office network and website access restriction configurations. The selected office network must belong to the current account and be located in the region specified by <code>BizRegionId</code>.</p>
         */
        public Builder network(Network network) {
            String networkShrink = shrink(network, "Network", "json");
            this.putBodyParameter("Network", networkShrink);
            this.network = network;
            return this;
        }

        /**
         * <p>The node pool configuration.</p>
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putBodyParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
         * <p>The operating system type. This parameter is required.</p>
         * <p>Only <code>Windows</code> is supported. Other operating systems are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putBodyParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The number of subscription periods.</p>
         * <p>Do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription period.</p>
         * <p>Do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The clipboard, video, watermark, session, and client access policy configurations.</p>
         */
        public Builder policy(Policy policy) {
            String policyShrink = shrink(policy, "Policy", "json");
            this.putBodyParameter("Policy", policyShrink);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The promotion ID. Specifies the promotional campaign to apply to the order.</p>
         * <p>Whether the promotion is applicable depends on the campaign rules. Do not specify this parameter if no promotional campaign is used.</p>
         * 
         * <strong>example:</strong>
         * <p>17440009****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putBodyParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The connection security policy for the browser group.</p>
         */
        public Builder securityPolicy(SecurityPolicy securityPolicy) {
            String securityPolicyShrink = shrink(securityPolicy, "SecurityPolicy", "json");
            this.putBodyParameter("SecurityPolicy", securityPolicyShrink);
            this.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * <p>The user data storage configuration for the browser group.</p>
         */
        public Builder storagePolicy(StoragePolicy storagePolicy) {
            String storagePolicyShrink = shrink(storagePolicy, "StoragePolicy", "json");
            this.putBodyParameter("StoragePolicy", storagePolicyShrink);
            this.storagePolicy = storagePolicy;
            return this;
        }

        /**
         * <p>The billing subtype.</p>
         * <p><strong>Set this parameter to <code>mau</code> explicitly, which indicates billing by monthly active users.</strong> Omitting this field does not enable MAU billing.</p>
         * 
         * <strong>example:</strong>
         * <p>mau</p>
         */
        public Builder subPayType(String subPayType) {
            this.putBodyParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        /**
         * <p>Not supported. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putBodyParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Not supported. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder timers(java.util.List<Timers> timers) {
            String timersShrink = shrink(timers, "Timers", "json");
            this.putBodyParameter("Timers", timersShrink);
            this.timers = timers;
            return this;
        }

        /**
         * <p>The list of authorized user group identifiers. A maximum of 10 items are supported. The user groups must belong to the current account and match the workspace network account type.</p>
         * <p><strong>Limit:</strong> Cannot be specified together with a non-empty <code>Users</code>.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The authorized user account information. The value must match the user and workspace network type.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        /**
         * <p>The list of authorized users. A maximum of 200 users can be specified. Users must be created in advance and must match the account type.</p>
         * <p><strong>Restriction:</strong> This parameter cannot be specified together with a non-empty <code>UserGroupIds</code>.</p>
         */
        public Builder users(java.util.List<Users> users) {
            String usersShrink = shrink(users, "Users", "json");
            this.putBodyParameter("Users", usersShrink);
            this.users = users;
            return this;
        }

        @Override
        public CreateBrowserInstanceGroupRequest build() {
            return new CreateBrowserInstanceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class Bookmarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BookmarkFolder")
        private String bookmarkFolder;

        @com.aliyun.core.annotation.NameInMap("BookmarkName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bookmarkName;

        @com.aliyun.core.annotation.NameInMap("BookmarkURL")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bookmarkURL;

        private Bookmarks(Builder builder) {
            this.bookmarkFolder = builder.bookmarkFolder;
            this.bookmarkName = builder.bookmarkName;
            this.bookmarkURL = builder.bookmarkURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bookmarks create() {
            return builder().build();
        }

        /**
         * @return bookmarkFolder
         */
        public String getBookmarkFolder() {
            return this.bookmarkFolder;
        }

        /**
         * @return bookmarkName
         */
        public String getBookmarkName() {
            return this.bookmarkName;
        }

        /**
         * @return bookmarkURL
         */
        public String getBookmarkURL() {
            return this.bookmarkURL;
        }

        public static final class Builder {
            private String bookmarkFolder; 
            private String bookmarkName; 
            private String bookmarkURL; 

            private Builder() {
            } 

            private Builder(Bookmarks model) {
                this.bookmarkFolder = model.bookmarkFolder;
                this.bookmarkName = model.bookmarkName;
                this.bookmarkURL = model.bookmarkURL;
            } 

            /**
             * <p>The folder in which the bookmark is located. The length after trimming leading and trailing whitespace cannot exceed 64 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Work Portal</p>
             */
            public Builder bookmarkFolder(String bookmarkFolder) {
                this.bookmarkFolder = bookmarkFolder;
                return this;
            }

            /**
             * <p>The bookmark name. This parameter is required and cannot be empty when you create a bookmark. The length after trimming leading and trailing whitespace cannot exceed 64 characters.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Official Website</p>
             */
            public Builder bookmarkName(String bookmarkName) {
                this.bookmarkName = bookmarkName;
                return this;
            }

            /**
             * <p>The URL of the bookmark. This parameter is required when you create a bookmark. The length after trimming leading and trailing whitespace cannot exceed 1024 characters.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder bookmarkURL(String bookmarkURL) {
                this.bookmarkURL = bookmarkURL;
                return this;
            }

            public Bookmarks build() {
                return new Bookmarks(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class BrowserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bookmarks")
        private java.util.List<Bookmarks> bookmarks;

        @com.aliyun.core.annotation.NameInMap("BookmarksFilePath")
        private String bookmarksFilePath;

        @com.aliyun.core.annotation.NameInMap("BrowserParam")
        private String browserParam;

        @com.aliyun.core.annotation.NameInMap("CookiesSync")
        private Boolean cookiesSync;

        @com.aliyun.core.annotation.NameInMap("Homepage")
        private String homepage;

        private BrowserConfig(Builder builder) {
            this.bookmarks = builder.bookmarks;
            this.bookmarksFilePath = builder.bookmarksFilePath;
            this.browserParam = builder.browserParam;
            this.cookiesSync = builder.cookiesSync;
            this.homepage = builder.homepage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrowserConfig create() {
            return builder().build();
        }

        /**
         * @return bookmarks
         */
        public java.util.List<Bookmarks> getBookmarks() {
            return this.bookmarks;
        }

        /**
         * @return bookmarksFilePath
         */
        public String getBookmarksFilePath() {
            return this.bookmarksFilePath;
        }

        /**
         * @return browserParam
         */
        public String getBrowserParam() {
            return this.browserParam;
        }

        /**
         * @return cookiesSync
         */
        public Boolean getCookiesSync() {
            return this.cookiesSync;
        }

        /**
         * @return homepage
         */
        public String getHomepage() {
            return this.homepage;
        }

        public static final class Builder {
            private java.util.List<Bookmarks> bookmarks; 
            private String bookmarksFilePath; 
            private String browserParam; 
            private Boolean cookiesSync; 
            private String homepage; 

            private Builder() {
            } 

            private Builder(BrowserConfig model) {
                this.bookmarks = model.bookmarks;
                this.bookmarksFilePath = model.bookmarksFilePath;
                this.browserParam = model.browserParam;
                this.cookiesSync = model.cookiesSync;
                this.homepage = model.homepage;
            } 

            /**
             * <p>The list of browser bookmarks.</p>
             * <p><strong>Limit:</strong> Cannot be specified together with a non-empty <code>BookmarksFilePath</code>. Bookmark URLs must be unique.</p>
             */
            public Builder bookmarks(java.util.List<Bookmarks> bookmarks) {
                this.bookmarks = bookmarks;
                return this;
            }

            /**
             * <p>The path of the uploaded bookmark file. Cannot be specified together with a non-empty <code>Bookmarks</code>.</p>
             * <p><strong>File format:</strong> A headerless CSV file with four columns in the following order:</p>
             * <ol>
             * <li>Bookmark name.</li>
             * <li>URL.</li>
             * <li>Folder.</li>
             * <li>Root directory type: <code>bookmark_bar</code> indicates the bookmarks bar, and <code>other</code> indicates other bookmarks.</li>
             * </ol>
             * <p><strong>Limits:</strong></p>
             * <ul>
             * <li>Fields are separated by commas. Field values cannot contain commas or line breaks. Quote escaping is not supported.</li>
             * <li>The file path must belong to the upload directory specified for the current account and cannot contain <code>..</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou/aig_upm/xxx/temp/BrowserBookmarks/浏览器书签模版.csv</p>
             */
            public Builder bookmarksFilePath(String bookmarksFilePath) {
                this.bookmarksFilePath = bookmarksFilePath;
                return this;
            }

            /**
             * <p>The browser startup parameters. For example, --incognito opens the browser in incognito mode.</p>
             * 
             * <strong>example:</strong>
             * <p>--incognito</p>
             */
            public Builder browserParam(String browserParam) {
                this.browserParam = browserParam;
                return this;
            }

            /**
             * <p>Specifies whether to synchronize cookies.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder cookiesSync(Boolean cookiesSync) {
                this.cookiesSync = cookiesSync;
                return this;
            }

            /**
             * <p>The homepage URL that opens when the browser starts. The value must conform to URI syntax.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder homepage(String homepage) {
                this.homepage = homepage;
                return this;
            }

            public BrowserConfig build() {
                return new BrowserConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class RestrictedURLs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private RestrictedURLs(Builder builder) {
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestrictedURLs create() {
            return builder().build();
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String URL; 

            private Builder() {
            } 

            private Builder(RestrictedURLs model) {
                this.URL = model.URL;
            } 

            /**
             * <p>The URL of the allowed website.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.com</p>
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public RestrictedURLs build() {
                return new RestrictedURLs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRestriction")
        private String accessRestriction;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("RestrictedURLs")
        private java.util.List<RestrictedURLs> restrictedURLs;

        @com.aliyun.core.annotation.NameInMap("RestrictedURLsFilePath")
        private String restrictedURLsFilePath;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private Network(Builder builder) {
            this.accessRestriction = builder.accessRestriction;
            this.officeSiteId = builder.officeSiteId;
            this.restrictedURLs = builder.restrictedURLs;
            this.restrictedURLsFilePath = builder.restrictedURLsFilePath;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return accessRestriction
         */
        public String getAccessRestriction() {
            return this.accessRestriction;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return restrictedURLs
         */
        public java.util.List<RestrictedURLs> getRestrictedURLs() {
            return this.restrictedURLs;
        }

        /**
         * @return restrictedURLsFilePath
         */
        public String getRestrictedURLsFilePath() {
            return this.restrictedURLsFilePath;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String accessRestriction; 
            private String officeSiteId; 
            private java.util.List<RestrictedURLs> restrictedURLs; 
            private String restrictedURLsFilePath; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.accessRestriction = model.accessRestriction;
                this.officeSiteId = model.officeSiteId;
                this.restrictedURLs = model.restrictedURLs;
                this.restrictedURLsFilePath = model.restrictedURLsFilePath;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The website access restriction mode.</p>
             * <ul>
             * <li><code>ALLOW_ALL</code>: Allows access to all domain names.</li>
             * <li><code>ALLOW_LIST</code>: Allows access only to websites in the allowlist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALLOW_ALL</p>
             */
            public Builder accessRestriction(String accessRestriction) {
                this.accessRestriction = accessRestriction;
                return this;
            }

            /**
             * <p>The ID of the office network that has been created. The office network must belong to the current account and be located in the target region specified by BizRegionId.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-643067****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The list of allowed websites. This parameter is used in <code>ALLOW_LIST</code> mode.</p>
             * <p><strong>Restrictions:</strong></p>
             * <ul>
             * <li>A maximum of 20 URLs can be specified directly. If more than 20 URLs are required, use <code>RestrictedURLsFilePath</code> to import them from a file.</li>
             * <li>This parameter cannot be specified together with <code>RestrictedURLsFilePath</code>.</li>
             * <li>URLs in the list cannot be duplicated.</li>
             * </ul>
             */
            public Builder restrictedURLs(java.util.List<RestrictedURLs> restrictedURLs) {
                this.restrictedURLs = restrictedURLs;
                return this;
            }

            /**
             * <p>The path of the uploaded website allowlist file. This parameter is used in <code>ALLOW_LIST</code> mode.</p>
             * <p>If more than 20 URLs are required, use file import. A maximum of 1,000 URLs can be configured by default.</p>
             * <p>This parameter cannot be specified together with <code>RestrictedURLs</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou/aig_upm/xxx/temp/BrowserRestrictionUrls/URL白名单模版.csv</p>
             */
            public Builder restrictedURLsFilePath(String restrictedURLsFilePath) {
                this.restrictedURLsFilePath = restrictedURLsFilePath;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs.</p>
             * <p><strong>Usage condition:</strong> Specify this parameter only when you use a custom office network. Do not specify this parameter for other types of office networks.</p>
             * <p>Select vSwitches that match the target business region and the custom office network.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class NodePool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeAmount")
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
        private String nodeInstanceType;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        private NodePool(Builder builder) {
            this.nodeAmount = builder.nodeAmount;
            this.nodeInstanceType = builder.nodeInstanceType;
            this.strategyType = builder.strategyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePool create() {
            return builder().build();
        }

        /**
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return nodeInstanceType
         */
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        public static final class Builder {
            private Integer nodeAmount; 
            private String nodeInstanceType; 
            private String strategyType; 

            private Builder() {
            } 

            private Builder(NodePool model) {
                this.nodeAmount = model.nodeAmount;
                this.nodeInstanceType = model.nodeInstanceType;
                this.strategyType = model.strategyType;
            } 

            /**
             * <p>The number of nodes.</p>
             * <p>You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The node specifications identity.</p>
             * <p>You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * <p>The node scaling policy.</p>
             * <p>You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            public NodePool build() {
                return new NodePool(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class AuthorizeAccessPolicyRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private AuthorizeAccessPolicyRules(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeAccessPolicyRules create() {
            return builder().build();
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String cidrIp; 
            private String description; 

            private Builder() {
            } 

            private Builder(AuthorizeAccessPolicyRules model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
            } 

            /**
             * <p>The source CIDR block of clients that are allowed to access the cloud browser.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the client access IP address whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>OfficeNetworkAccess</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AuthorizeAccessPolicyRules build() {
                return new AuthorizeAccessPolicyRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class ClientTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ClientTypes(Builder builder) {
            this.clientType = builder.clientType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientTypes create() {
            return builder().build();
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clientType; 
            private String status; 

            private Builder() {
            } 

            private Builder(ClientTypes model) {
                this.clientType = model.clientType;
                this.status = model.status;
            } 

            /**
             * <p>The client type for which you want to configure an access policy.</p>
             * <ul>
             * <li><code>windows</code>: Windows client.</li>
             * <li><code>macos</code>: macOS client.</li>
             * <li><code>html5</code>: Web client.</li>
             * <li><code>android</code>: Android client.</li>
             * <li><code>ios</code>: iOS client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The access policy switch for the client type.</p>
             * <ul>
             * <li><code>on</code>: Allows access from this client type.</li>
             * <li><code>off</code>: Denies access from this client type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClientTypes build() {
                return new ClientTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class ClipboardPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private String clipboard;

        @com.aliyun.core.annotation.NameInMap("ClipboardReadLimit")
        private Integer clipboardReadLimit;

        @com.aliyun.core.annotation.NameInMap("ClipboardScope")
        private String clipboardScope;

        @com.aliyun.core.annotation.NameInMap("ClipboardSizeUnit")
        private String clipboardSizeUnit;

        @com.aliyun.core.annotation.NameInMap("ClipboardWriteLimit")
        private Integer clipboardWriteLimit;

        @com.aliyun.core.annotation.NameInMap("FileClipboard")
        private String fileClipboard;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboard")
        private String richTextClipboard;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardLimit")
        private Integer richTextClipboardLimit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardReadLimit")
        private Integer richTextClipboardReadLimit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardReadSizeUnit")
        private String richTextClipboardReadSizeUnit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardSizeUnit")
        private String richTextClipboardSizeUnit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardWriteLimit")
        private Integer richTextClipboardWriteLimit;

        @com.aliyun.core.annotation.NameInMap("RichTextClipboardWriteSizeUnit")
        private String richTextClipboardWriteSizeUnit;

        @com.aliyun.core.annotation.NameInMap("TextClipboard")
        private String textClipboard;

        @com.aliyun.core.annotation.NameInMap("TextClipboardReadLimit")
        private Integer textClipboardReadLimit;

        @com.aliyun.core.annotation.NameInMap("TextClipboardReadSizeUnit")
        private String textClipboardReadSizeUnit;

        @com.aliyun.core.annotation.NameInMap("TextClipboardWriteLimit")
        private Integer textClipboardWriteLimit;

        @com.aliyun.core.annotation.NameInMap("TextClipboardWriteSizeUnit")
        private String textClipboardWriteSizeUnit;

        private ClipboardPolicy(Builder builder) {
            this.clipboard = builder.clipboard;
            this.clipboardReadLimit = builder.clipboardReadLimit;
            this.clipboardScope = builder.clipboardScope;
            this.clipboardSizeUnit = builder.clipboardSizeUnit;
            this.clipboardWriteLimit = builder.clipboardWriteLimit;
            this.fileClipboard = builder.fileClipboard;
            this.richTextClipboard = builder.richTextClipboard;
            this.richTextClipboardLimit = builder.richTextClipboardLimit;
            this.richTextClipboardReadLimit = builder.richTextClipboardReadLimit;
            this.richTextClipboardReadSizeUnit = builder.richTextClipboardReadSizeUnit;
            this.richTextClipboardSizeUnit = builder.richTextClipboardSizeUnit;
            this.richTextClipboardWriteLimit = builder.richTextClipboardWriteLimit;
            this.richTextClipboardWriteSizeUnit = builder.richTextClipboardWriteSizeUnit;
            this.textClipboard = builder.textClipboard;
            this.textClipboardReadLimit = builder.textClipboardReadLimit;
            this.textClipboardReadSizeUnit = builder.textClipboardReadSizeUnit;
            this.textClipboardWriteLimit = builder.textClipboardWriteLimit;
            this.textClipboardWriteSizeUnit = builder.textClipboardWriteSizeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipboardPolicy create() {
            return builder().build();
        }

        /**
         * @return clipboard
         */
        public String getClipboard() {
            return this.clipboard;
        }

        /**
         * @return clipboardReadLimit
         */
        public Integer getClipboardReadLimit() {
            return this.clipboardReadLimit;
        }

        /**
         * @return clipboardScope
         */
        public String getClipboardScope() {
            return this.clipboardScope;
        }

        /**
         * @return clipboardSizeUnit
         */
        public String getClipboardSizeUnit() {
            return this.clipboardSizeUnit;
        }

        /**
         * @return clipboardWriteLimit
         */
        public Integer getClipboardWriteLimit() {
            return this.clipboardWriteLimit;
        }

        /**
         * @return fileClipboard
         */
        public String getFileClipboard() {
            return this.fileClipboard;
        }

        /**
         * @return richTextClipboard
         */
        public String getRichTextClipboard() {
            return this.richTextClipboard;
        }

        /**
         * @return richTextClipboardLimit
         */
        public Integer getRichTextClipboardLimit() {
            return this.richTextClipboardLimit;
        }

        /**
         * @return richTextClipboardReadLimit
         */
        public Integer getRichTextClipboardReadLimit() {
            return this.richTextClipboardReadLimit;
        }

        /**
         * @return richTextClipboardReadSizeUnit
         */
        public String getRichTextClipboardReadSizeUnit() {
            return this.richTextClipboardReadSizeUnit;
        }

        /**
         * @return richTextClipboardSizeUnit
         */
        public String getRichTextClipboardSizeUnit() {
            return this.richTextClipboardSizeUnit;
        }

        /**
         * @return richTextClipboardWriteLimit
         */
        public Integer getRichTextClipboardWriteLimit() {
            return this.richTextClipboardWriteLimit;
        }

        /**
         * @return richTextClipboardWriteSizeUnit
         */
        public String getRichTextClipboardWriteSizeUnit() {
            return this.richTextClipboardWriteSizeUnit;
        }

        /**
         * @return textClipboard
         */
        public String getTextClipboard() {
            return this.textClipboard;
        }

        /**
         * @return textClipboardReadLimit
         */
        public Integer getTextClipboardReadLimit() {
            return this.textClipboardReadLimit;
        }

        /**
         * @return textClipboardReadSizeUnit
         */
        public String getTextClipboardReadSizeUnit() {
            return this.textClipboardReadSizeUnit;
        }

        /**
         * @return textClipboardWriteLimit
         */
        public Integer getTextClipboardWriteLimit() {
            return this.textClipboardWriteLimit;
        }

        /**
         * @return textClipboardWriteSizeUnit
         */
        public String getTextClipboardWriteSizeUnit() {
            return this.textClipboardWriteSizeUnit;
        }

        public static final class Builder {
            private String clipboard; 
            private Integer clipboardReadLimit; 
            private String clipboardScope; 
            private String clipboardSizeUnit; 
            private Integer clipboardWriteLimit; 
            private String fileClipboard; 
            private String richTextClipboard; 
            private Integer richTextClipboardLimit; 
            private Integer richTextClipboardReadLimit; 
            private String richTextClipboardReadSizeUnit; 
            private String richTextClipboardSizeUnit; 
            private Integer richTextClipboardWriteLimit; 
            private String richTextClipboardWriteSizeUnit; 
            private String textClipboard; 
            private Integer textClipboardReadLimit; 
            private String textClipboardReadSizeUnit; 
            private Integer textClipboardWriteLimit; 
            private String textClipboardWriteSizeUnit; 

            private Builder() {
            } 

            private Builder(ClipboardPolicy model) {
                this.clipboard = model.clipboard;
                this.clipboardReadLimit = model.clipboardReadLimit;
                this.clipboardScope = model.clipboardScope;
                this.clipboardSizeUnit = model.clipboardSizeUnit;
                this.clipboardWriteLimit = model.clipboardWriteLimit;
                this.fileClipboard = model.fileClipboard;
                this.richTextClipboard = model.richTextClipboard;
                this.richTextClipboardLimit = model.richTextClipboardLimit;
                this.richTextClipboardReadLimit = model.richTextClipboardReadLimit;
                this.richTextClipboardReadSizeUnit = model.richTextClipboardReadSizeUnit;
                this.richTextClipboardSizeUnit = model.richTextClipboardSizeUnit;
                this.richTextClipboardWriteLimit = model.richTextClipboardWriteLimit;
                this.richTextClipboardWriteSizeUnit = model.richTextClipboardWriteSizeUnit;
                this.textClipboard = model.textClipboard;
                this.textClipboardReadLimit = model.textClipboardReadLimit;
                this.textClipboardReadSizeUnit = model.textClipboardReadSizeUnit;
                this.textClipboardWriteLimit = model.textClipboardWriteLimit;
                this.textClipboardWriteSizeUnit = model.textClipboardWriteSizeUnit;
            } 

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is disabled.</li>
             * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
             * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
             * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
             * <p><strong>Value range:</strong> 1 to 102400. The unit is specified by ClipboardSizeUnit.</p>
             * <p>The value range does not change with unit conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder clipboardReadLimit(Integer clipboardReadLimit) {
                this.clipboardReadLimit = clipboardReadLimit;
                return this;
            }

            /**
             * <p>The clipboard control granularity.</p>
             * <ul>
             * <li><code>global</code>: Unified control.</li>
             * <li><code>grained</code>: Separate control by text, rich text, and file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>grained</p>
             */
            public Builder clipboardScope(String clipboardScope) {
                this.clipboardScope = clipboardScope;
                return this;
            }

            /**
             * <p>The clipboard size unit.</p>
             * <ul>
             * <li><code>B</code>: Bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder clipboardSizeUnit(String clipboardSizeUnit) {
                this.clipboardSizeUnit = clipboardSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
             * <p><strong>Value range:</strong> 1 to 102400. The unit is specified by ClipboardSizeUnit.</p>
             * <p>The value range does not change with unit conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder clipboardWriteLimit(Integer clipboardWriteLimit) {
                this.clipboardWriteLimit = clipboardWriteLimit;
                return this;
            }

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is disabled.</li>
             * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
             * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
             * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder fileClipboard(String fileClipboard) {
                this.fileClipboard = fileClipboard;
                return this;
            }

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is disabled.</li>
             * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
             * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
             * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder richTextClipboard(String richTextClipboard) {
                this.richTextClipboard = richTextClipboard;
                return this;
            }

            /**
             * <p>The rich text clipboard size limit.</p>
             * <p><strong>Value range:</strong> 1 to 204800. The unit is specified by RichTextClipboardSizeUnit.</p>
             * <p>The value range does not change with unit conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder richTextClipboardLimit(Integer richTextClipboardLimit) {
                this.richTextClipboardLimit = richTextClipboardLimit;
                return this;
            }

            /**
             * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
             * <p><strong>Value range:</strong> 1 to 204800. The unit is specified by RichTextClipboardReadSizeUnit.</p>
             * <p>The value range does not change with unit conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder richTextClipboardReadLimit(Integer richTextClipboardReadLimit) {
                this.richTextClipboardReadLimit = richTextClipboardReadLimit;
                return this;
            }

            /**
             * <p>The clipboard size unit.</p>
             * <ul>
             * <li><code>B</code>: Bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * <p><strong>Default value:</strong> <code>KB</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder richTextClipboardReadSizeUnit(String richTextClipboardReadSizeUnit) {
                this.richTextClipboardReadSizeUnit = richTextClipboardReadSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard size unit.</p>
             * <ul>
             * <li><code>B</code>: Bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder richTextClipboardSizeUnit(String richTextClipboardSizeUnit) {
                this.richTextClipboardSizeUnit = richTextClipboardSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
             * <p><strong>Value range:</strong> 1 to 204800. The unit is specified by RichTextClipboardWriteSizeUnit.</p>
             * <p>The value range does not change with unit conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder richTextClipboardWriteLimit(Integer richTextClipboardWriteLimit) {
                this.richTextClipboardWriteLimit = richTextClipboardWriteLimit;
                return this;
            }

            /**
             * <p>The clipboard size unit.</p>
             * <ul>
             * <li><code>B</code>: Bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * <p><strong>Default value:</strong> <code>KB</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder richTextClipboardWriteSizeUnit(String richTextClipboardWriteSizeUnit) {
                this.richTextClipboardWriteSizeUnit = richTextClipboardWriteSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard transfer direction. The value is case-insensitive.</p>
             * <ul>
             * <li><code>off</code>: Bidirectional transfer is disabled.</li>
             * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
             * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
             * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder textClipboard(String textClipboard) {
                this.textClipboard = textClipboard;
                return this;
            }

            /**
             * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
             * <p><strong>Value range:</strong> 1 to 102400. The unit is specified by TextClipboardReadSizeUnit.</p>
             * <p>The value range does not change with unit conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder textClipboardReadLimit(Integer textClipboardReadLimit) {
                this.textClipboardReadLimit = textClipboardReadLimit;
                return this;
            }

            /**
             * <p>The clipboard size unit.</p>
             * <ul>
             * <li><code>B</code>: Bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * <p><strong>Default value:</strong> <code>KB</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder textClipboardReadSizeUnit(String textClipboardReadSizeUnit) {
                this.textClipboardReadSizeUnit = textClipboardReadSizeUnit;
                return this;
            }

            /**
             * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
             * <p><strong>Value range:</strong> 1 to 102400. The unit is specified by TextClipboardWriteSizeUnit.</p>
             * <p>The value range does not change with unit conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder textClipboardWriteLimit(Integer textClipboardWriteLimit) {
                this.textClipboardWriteLimit = textClipboardWriteLimit;
                return this;
            }

            /**
             * <p>The clipboard size unit.</p>
             * <ul>
             * <li><code>B</code>: Bytes.</li>
             * <li><code>KB</code>: 1024 bytes.</li>
             * </ul>
             * <p><strong>Default value:</strong> <code>KB</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder textClipboardWriteSizeUnit(String textClipboardWriteSizeUnit) {
                this.textClipboardWriteSizeUnit = textClipboardWriteSizeUnit;
                return this;
            }

            public ClipboardPolicy build() {
                return new ClipboardPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class VideoPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private Integer frameRate;

        private VideoPolicy(Builder builder) {
            this.frameRate = builder.frameRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoPolicy create() {
            return builder().build();
        }

        /**
         * @return frameRate
         */
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public static final class Builder {
            private Integer frameRate; 

            private Builder() {
            } 

            private Builder(VideoPolicy model) {
                this.frameRate = model.frameRate;
            } 

            /**
             * <p>The frame rate of the browser session.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder frameRate(Integer frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            public VideoPolicy build() {
                return new VideoPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class WatermarkPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WatermarkSwitch")
        private String watermarkSwitch;

        @com.aliyun.core.annotation.NameInMap("WatermarkTypes")
        private java.util.List<String> watermarkTypes;

        private WatermarkPolicy(Builder builder) {
            this.watermarkSwitch = builder.watermarkSwitch;
            this.watermarkTypes = builder.watermarkTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatermarkPolicy create() {
            return builder().build();
        }

        /**
         * @return watermarkSwitch
         */
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        /**
         * @return watermarkTypes
         */
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

        public static final class Builder {
            private String watermarkSwitch; 
            private java.util.List<String> watermarkTypes; 

            private Builder() {
            } 

            private Builder(WatermarkPolicy model) {
                this.watermarkSwitch = model.watermarkSwitch;
                this.watermarkTypes = model.watermarkTypes;
            } 

            /**
             * <p>The watermark switch. The value is case-insensitive.</p>
             * <ul>
             * <li><code>ON</code>: Enables the watermark.</li>
             * <li><code>OFF</code>: Disables the watermark.</li>
             * </ul>
             * <p>When disabled, the watermark content type list is not used.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder watermarkSwitch(String watermarkSwitch) {
                this.watermarkSwitch = watermarkSwitch;
                return this;
            }

            /**
             * <p>The list of watermark content types.</p>
             * <ul>
             * <li><code>EndUserId</code>: The user identifier.</li>
             * <li><code>InstanceGroupId</code>: The delivery group identifier.</li>
             * <li><code>ClientTime</code>: The current time on the client.</li>
             * </ul>
             * <p>Use watermark types supported by the browser and client.</p>
             */
            public Builder watermarkTypes(java.util.List<String> watermarkTypes) {
                this.watermarkTypes = watermarkTypes;
                return this;
            }

            public WatermarkPolicy build() {
                return new WatermarkPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppContentProtection")
        private String appContentProtection;

        @com.aliyun.core.annotation.NameInMap("AuthorizeAccessPolicyRules")
        private java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        @com.aliyun.core.annotation.NameInMap("ClientTypes")
        private java.util.List<ClientTypes> clientTypes;

        @com.aliyun.core.annotation.NameInMap("ClipboardPolicy")
        private ClipboardPolicy clipboardPolicy;

        @com.aliyun.core.annotation.NameInMap("DisconnectKeepSession")
        private String disconnectKeepSession;

        @com.aliyun.core.annotation.NameInMap("DisconnectKeepSessionTime")
        private Integer disconnectKeepSessionTime;

        @com.aliyun.core.annotation.NameInMap("FileManager")
        private String fileManager;

        @com.aliyun.core.annotation.NameInMap("Html5FileTransfer")
        private String html5FileTransfer;

        @com.aliyun.core.annotation.NameInMap("NoOperationDisconnect")
        private String noOperationDisconnect;

        @com.aliyun.core.annotation.NameInMap("NoOperationDisconnectTime")
        private Integer noOperationDisconnectTime;

        @com.aliyun.core.annotation.NameInMap("PolicyVersion")
        private String policyVersion;

        @com.aliyun.core.annotation.NameInMap("VideoPolicy")
        private VideoPolicy videoPolicy;

        @com.aliyun.core.annotation.NameInMap("WatermarkPolicy")
        private WatermarkPolicy watermarkPolicy;

        private Policy(Builder builder) {
            this.appContentProtection = builder.appContentProtection;
            this.authorizeAccessPolicyRules = builder.authorizeAccessPolicyRules;
            this.clientTypes = builder.clientTypes;
            this.clipboardPolicy = builder.clipboardPolicy;
            this.disconnectKeepSession = builder.disconnectKeepSession;
            this.disconnectKeepSessionTime = builder.disconnectKeepSessionTime;
            this.fileManager = builder.fileManager;
            this.html5FileTransfer = builder.html5FileTransfer;
            this.noOperationDisconnect = builder.noOperationDisconnect;
            this.noOperationDisconnectTime = builder.noOperationDisconnectTime;
            this.policyVersion = builder.policyVersion;
            this.videoPolicy = builder.videoPolicy;
            this.watermarkPolicy = builder.watermarkPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return appContentProtection
         */
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        /**
         * @return authorizeAccessPolicyRules
         */
        public java.util.List<AuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        /**
         * @return clientTypes
         */
        public java.util.List<ClientTypes> getClientTypes() {
            return this.clientTypes;
        }

        /**
         * @return clipboardPolicy
         */
        public ClipboardPolicy getClipboardPolicy() {
            return this.clipboardPolicy;
        }

        /**
         * @return disconnectKeepSession
         */
        public String getDisconnectKeepSession() {
            return this.disconnectKeepSession;
        }

        /**
         * @return disconnectKeepSessionTime
         */
        public Integer getDisconnectKeepSessionTime() {
            return this.disconnectKeepSessionTime;
        }

        /**
         * @return fileManager
         */
        public String getFileManager() {
            return this.fileManager;
        }

        /**
         * @return html5FileTransfer
         */
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        /**
         * @return noOperationDisconnect
         */
        public String getNoOperationDisconnect() {
            return this.noOperationDisconnect;
        }

        /**
         * @return noOperationDisconnectTime
         */
        public Integer getNoOperationDisconnectTime() {
            return this.noOperationDisconnectTime;
        }

        /**
         * @return policyVersion
         */
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        /**
         * @return videoPolicy
         */
        public VideoPolicy getVideoPolicy() {
            return this.videoPolicy;
        }

        /**
         * @return watermarkPolicy
         */
        public WatermarkPolicy getWatermarkPolicy() {
            return this.watermarkPolicy;
        }

        public static final class Builder {
            private String appContentProtection; 
            private java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules; 
            private java.util.List<ClientTypes> clientTypes; 
            private ClipboardPolicy clipboardPolicy; 
            private String disconnectKeepSession; 
            private Integer disconnectKeepSessionTime; 
            private String fileManager; 
            private String html5FileTransfer; 
            private String noOperationDisconnect; 
            private Integer noOperationDisconnectTime; 
            private String policyVersion; 
            private VideoPolicy videoPolicy; 
            private WatermarkPolicy watermarkPolicy; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.appContentProtection = model.appContentProtection;
                this.authorizeAccessPolicyRules = model.authorizeAccessPolicyRules;
                this.clientTypes = model.clientTypes;
                this.clipboardPolicy = model.clipboardPolicy;
                this.disconnectKeepSession = model.disconnectKeepSession;
                this.disconnectKeepSessionTime = model.disconnectKeepSessionTime;
                this.fileManager = model.fileManager;
                this.html5FileTransfer = model.html5FileTransfer;
                this.noOperationDisconnect = model.noOperationDisconnect;
                this.noOperationDisconnectTime = model.noOperationDisconnectTime;
                this.policyVersion = model.policyVersion;
                this.videoPolicy = model.videoPolicy;
                this.watermarkPolicy = model.watermarkPolicy;
            } 

            /**
             * <p>Specifies whether to enable screen capture prevention.</p>
             * <ul>
             * <li><code>on</code>: Enables screen capture prevention.</li>
             * <li><code>off</code>: Disables screen capture prevention.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder appContentProtection(String appContentProtection) {
                this.appContentProtection = appContentProtection;
                return this;
            }

            /**
             * <p>The client access IP address whitelist. This parameter is used to restrict the source IP addresses of clients that can access the cloud browser.</p>
             */
            public Builder authorizeAccessPolicyRules(java.util.List<AuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
                this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
                return this;
            }

            /**
             * <p>The client access control list.</p>
             */
            public Builder clientTypes(java.util.List<ClientTypes> clientTypes) {
                this.clientTypes = clientTypes;
                return this;
            }

            /**
             * <p>Specifies the clipboard transfer direction, content type, and size limit. read indicates transfer from the local PC to the cloud browser. write indicates transfer from the cloud browser to the local PC.</p>
             */
            public Builder clipboardPolicy(ClipboardPolicy clipboardPolicy) {
                this.clipboardPolicy = clipboardPolicy;
                return this;
            }

            /**
             * <p>The session data retention policy after disconnection.</p>
             * <ul>
             * <li><code>customTime</code>: Retains the session based on the session data retention policy. Customizing the duration through <code>DisconnectKeepSessionTime</code> is not supported.</li>
             * <li><code>persistent</code>: The session is not subject to automatic release based on disconnection duration.</li>
             * </ul>
             * <p><strong>Note:</strong> <code>persistent</code> is still subject to authorization and other release policies.</p>
             * 
             * <strong>example:</strong>
             * <p>customTime</p>
             */
            public Builder disconnectKeepSession(String disconnectKeepSession) {
                this.disconnectKeepSession = disconnectKeepSession;
                return this;
            }

            /**
             * <p>Not supported. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder disconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
                this.disconnectKeepSessionTime = disconnectKeepSessionTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable the floating ball file manager.</p>
             * <ul>
             * <li><code>on</code>: Enabled.</li>
             * <li><code>off</code>: Disabled.</li>
             * </ul>
             * <p><strong>Default value:</strong> <code>off</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder fileManager(String fileManager) {
                this.fileManager = fileManager;
                return this;
            }

            /**
             * <p>The file transfer policy for the web client.</p>
             * <ul>
             * <li><code>off</code>: File transfer is disabled.</li>
             * <li><code>upload</code>: Only upload is allowed.</li>
             * <li><code>download</code>: Only download is allowed.</li>
             * <li><code>full</code>: Both upload and download are allowed.</li>
             * </ul>
             * <p>Configure this parameter together with the clipboard policy.</p>
             * 
             * <strong>example:</strong>
             * <p>full</p>
             */
            public Builder html5FileTransfer(String html5FileTransfer) {
                this.html5FileTransfer = html5FileTransfer;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic disconnection on inactivity. The value is case-insensitive.</p>
             * <ul>
             * <li><code>on</code>: Enabled.</li>
             * <li><code>off</code>: Disabled.</li>
             * </ul>
             * <p>When enabled, set the wait duration through <code>NoOperationDisconnectTime</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder noOperationDisconnect(String noOperationDisconnect) {
                this.noOperationDisconnect = noOperationDisconnect;
                return this;
            }

            /**
             * <p>The wait duration before disconnection is triggered after user inactivity. Unit: seconds.</p>
             * <p><strong>Prerequisite:</strong> When <code>NoOperationDisconnect</code> is enabled, specify a value greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder noOperationDisconnectTime(Integer noOperationDisconnectTime) {
                this.noOperationDisconnectTime = noOperationDisconnectTime;
                return this;
            }

            /**
             * <p>The policy version. The value is case-insensitive.</p>
             * <ul>
             * <li><code>DEFAULT</code>: Legacy policy.</li>
             * <li><code>CENTER</code>: Centralized policy.</li>
             * </ul>
             * <p><strong>Default value:</strong> <code>DEFAULT</code>. The actual effective policy version depends on the policy configuration available for the account.</p>
             * 
             * <strong>example:</strong>
             * <p>CENTER</p>
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * <p>The video display policy for the browser session.</p>
             */
            public Builder videoPolicy(VideoPolicy videoPolicy) {
                this.videoPolicy = videoPolicy;
                return this;
            }

            /**
             * <p>The watermark display configuration for browser sessions.</p>
             */
            public Builder watermarkPolicy(WatermarkPolicy watermarkPolicy) {
                this.watermarkPolicy = watermarkPolicy;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class SecurityPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkipUserAuthCheck")
        private Boolean skipUserAuthCheck;

        private SecurityPolicy(Builder builder) {
            this.skipUserAuthCheck = builder.skipUserAuthCheck;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityPolicy create() {
            return builder().build();
        }

        /**
         * @return skipUserAuthCheck
         */
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

        public static final class Builder {
            private Boolean skipUserAuthCheck; 

            private Builder() {
            } 

            private Builder(SecurityPolicy model) {
                this.skipUserAuthCheck = model.skipUserAuthCheck;
            } 

            /**
             * <p>Specifies whether to skip the user authorization check when connecting to the application.</p>
             * <ul>
             * <li><code>true</code>: Skips the check.</li>
             * <li><code>false</code>: Performs the check.</li>
             * </ul>
             * <p>If this field is omitted when <code>SecurityPolicy</code> is configured, the user authorization check is performed.</p>
             * <p><strong>Note:</strong> This field cannot be used to skip OpenAPI identity authentication or RAM permission verification.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skipUserAuthCheck(Boolean skipUserAuthCheck) {
                this.skipUserAuthCheck = skipUserAuthCheck;
                return this;
            }

            public SecurityPolicy build() {
                return new SecurityPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class UserProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserProfileSize")
        private Long userProfileSize;

        @com.aliyun.core.annotation.NameInMap("UserProfileSwitch")
        private Boolean userProfileSwitch;

        private UserProfile(Builder builder) {
            this.userProfileSize = builder.userProfileSize;
            this.userProfileSwitch = builder.userProfileSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProfile create() {
            return builder().build();
        }

        /**
         * @return userProfileSize
         */
        public Long getUserProfileSize() {
            return this.userProfileSize;
        }

        /**
         * @return userProfileSwitch
         */
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

        public static final class Builder {
            private Long userProfileSize; 
            private Boolean userProfileSwitch; 

            private Builder() {
            } 

            private Builder(UserProfile model) {
                this.userProfileSize = model.userProfileSize;
                this.userProfileSwitch = model.userProfileSwitch;
            } 

            /**
             * <p>The size of the user data roaming cloud disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder userProfileSize(Long userProfileSize) {
                this.userProfileSize = userProfileSize;
                return this;
            }

            /**
             * <p>Specifies whether to enable user data roaming.</p>
             * <ul>
             * <li><code>true</code>: Enabled.</li>
             * <li><code>false</code>: Disabled.</li>
             * </ul>
             * <p>In Windows scenarios, if this field is explicitly specified, the specified value is used. If this field is omitted, the user roaming configuration of the current account is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder userProfileSwitch(Boolean userProfileSwitch) {
                this.userProfileSwitch = userProfileSwitch;
                return this;
            }

            public UserProfile build() {
                return new UserProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class StoragePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserProfile")
        private UserProfile userProfile;

        private StoragePolicy(Builder builder) {
            this.userProfile = builder.userProfile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoragePolicy create() {
            return builder().build();
        }

        /**
         * @return userProfile
         */
        public UserProfile getUserProfile() {
            return this.userProfile;
        }

        public static final class Builder {
            private UserProfile userProfile; 

            private Builder() {
            } 

            private Builder(StoragePolicy model) {
                this.userProfile = model.userProfile;
            } 

            /**
             * <p>The user data roaming configuration, which is used to retain user configuration data.</p>
             */
            public Builder userProfile(UserProfile userProfile) {
                this.userProfile = userProfile;
                return this;
            }

            public StoragePolicy build() {
                return new StoragePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
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
             * <p>Not supported. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Not supported. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
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
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class Timers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        private Timers(Builder builder) {
            this.interval = builder.interval;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timers create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private Integer interval; 
            private String timerType; 

            private Builder() {
            } 

            private Builder(Timers model) {
                this.interval = model.interval;
                this.timerType = model.timerType;
            } 

            /**
             * <p>Not supported. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>Not supported. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public Timers build() {
                return new Timers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserInfo(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.type = model.type;
            } 

            /**
             * <p>The account type of the authorized user.</p>
             * <ul>
             * <li><code>simple</code>: Convenience account.</li>
             * <li><code>ad</code>: AD domain account.</li>
             * </ul>
             * <p>The value must match the account type of the user and workspace network.</p>
             * 
             * <strong>example:</strong>
             * <p>simple</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateBrowserInstanceGroupRequest</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        private Users(Builder builder) {
            this.endUserId = builder.endUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        public static final class Builder {
            private String endUserId; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.endUserId = model.endUserId;
            } 

            /**
             * <p>The identity of the authorized user to be granted authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
