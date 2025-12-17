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
 * {@link CreateAppInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAppInstanceGroupRequest</p>
 */
public class CreateAppInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppCenterImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCenterImageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppPackageType")
    private String appPackageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppPolicyId")
    private String appPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthMode")
    private String authMode;

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
    @com.aliyun.core.annotation.NameInMap("ChargeResourceMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeResourceMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Network")
    private Network network;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodePool")
    private NodePool nodePool;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreOpenAppId")
    private String preOpenAppId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimePolicy")
    private RuntimePolicy runtimePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityPolicy")
    private SecurityPolicy securityPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionTimeout")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 300)
    private Integer sessionTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoragePolicy")
    private StoragePolicy storagePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubPayType")
    private String subPayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefinePolicy")
    private UserDefinePolicy userDefinePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<String> users;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoPolicy")
    private VideoPolicy videoPolicy;

    private CreateAppInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appCenterImageId = builder.appCenterImageId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.appPackageType = builder.appPackageType;
        this.appPolicyId = builder.appPolicyId;
        this.authMode = builder.authMode;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizRegionId = builder.bizRegionId;
        this.chargeResourceMode = builder.chargeResourceMode;
        this.chargeType = builder.chargeType;
        this.clusterId = builder.clusterId;
        this.network = builder.network;
        this.nodePool = builder.nodePool;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.preOpenAppId = builder.preOpenAppId;
        this.productType = builder.productType;
        this.promotionId = builder.promotionId;
        this.runtimePolicy = builder.runtimePolicy;
        this.securityPolicy = builder.securityPolicy;
        this.sessionTimeout = builder.sessionTimeout;
        this.storagePolicy = builder.storagePolicy;
        this.subPayType = builder.subPayType;
        this.userDefinePolicy = builder.userDefinePolicy;
        this.userGroupIds = builder.userGroupIds;
        this.userInfo = builder.userInfo;
        this.users = builder.users;
        this.videoPolicy = builder.videoPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCenterImageId
     */
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    /**
     * @return appInstanceGroupName
     */
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    /**
     * @return appPackageType
     */
    public String getAppPackageType() {
        return this.appPackageType;
    }

    /**
     * @return appPolicyId
     */
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    /**
     * @return authMode
     */
    public String getAuthMode() {
        return this.authMode;
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return preOpenAppId
     */
    public String getPreOpenAppId() {
        return this.preOpenAppId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return runtimePolicy
     */
    public RuntimePolicy getRuntimePolicy() {
        return this.runtimePolicy;
    }

    /**
     * @return securityPolicy
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    /**
     * @return sessionTimeout
     */
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
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
     * @return userDefinePolicy
     */
    public UserDefinePolicy getUserDefinePolicy() {
        return this.userDefinePolicy;
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
    public java.util.List<String> getUsers() {
        return this.users;
    }

    /**
     * @return videoPolicy
     */
    public VideoPolicy getVideoPolicy() {
        return this.videoPolicy;
    }

    public static final class Builder extends Request.Builder<CreateAppInstanceGroupRequest, Builder> {
        private String appCenterImageId; 
        private String appInstanceGroupName; 
        private String appPackageType; 
        private String appPolicyId; 
        private String authMode; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bizRegionId; 
        private String chargeResourceMode; 
        private String chargeType; 
        private String clusterId; 
        private Network network; 
        private NodePool nodePool; 
        private Integer period; 
        private String periodUnit; 
        private String preOpenAppId; 
        private String productType; 
        private String promotionId; 
        private RuntimePolicy runtimePolicy; 
        private SecurityPolicy securityPolicy; 
        private Integer sessionTimeout; 
        private StoragePolicy storagePolicy; 
        private String subPayType; 
        private UserDefinePolicy userDefinePolicy; 
        private java.util.List<String> userGroupIds; 
        private UserInfo userInfo; 
        private java.util.List<String> users; 
        private VideoPolicy videoPolicy; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppInstanceGroupRequest request) {
            super(request);
            this.appCenterImageId = request.appCenterImageId;
            this.appInstanceGroupName = request.appInstanceGroupName;
            this.appPackageType = request.appPackageType;
            this.appPolicyId = request.appPolicyId;
            this.authMode = request.authMode;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizRegionId = request.bizRegionId;
            this.chargeResourceMode = request.chargeResourceMode;
            this.chargeType = request.chargeType;
            this.clusterId = request.clusterId;
            this.network = request.network;
            this.nodePool = request.nodePool;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.preOpenAppId = request.preOpenAppId;
            this.productType = request.productType;
            this.promotionId = request.promotionId;
            this.runtimePolicy = request.runtimePolicy;
            this.securityPolicy = request.securityPolicy;
            this.sessionTimeout = request.sessionTimeout;
            this.storagePolicy = request.storagePolicy;
            this.subPayType = request.subPayType;
            this.userDefinePolicy = request.userDefinePolicy;
            this.userGroupIds = request.userGroupIds;
            this.userInfo = request.userInfo;
            this.users = request.users;
            this.videoPolicy = request.videoPolicy;
        } 

        /**
         * <p>The image ID of the application. To obtain the image ID, log on to the <a href="https://appstreaming.console.aliyun.com/">App Streaming console</a>. In the left-side navigation pane, choose <strong>Maintenance</strong> &gt; <strong>Custom Images</strong> or Maintenance &gt; <strong>System Images</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>img-8z4nztpaqvay4****</p>
         */
        public Builder appCenterImageId(String appCenterImageId) {
            this.putBodyParameter("AppCenterImageId", appCenterImageId);
            this.appCenterImageId = appCenterImageId;
            return this;
        }

        /**
         * <p>The name of the delivery group.</p>
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putBodyParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * <p>Package type.</p>
         * 
         * <strong>example:</strong>
         * <p>browser.package.5.250.appstreaming.general.basic</p>
         */
        public Builder appPackageType(String appPackageType) {
            this.putBodyParameter("AppPackageType", appPackageType);
            this.appPackageType = appPackageType;
            return this;
        }

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-0clfzcy0adpcf****</p>
         */
        public Builder appPolicyId(String appPolicyId) {
            this.putBodyParameter("AppPolicyId", appPolicyId);
            this.appPolicyId = appPolicyId;
            return this;
        }

        /**
         * <p>The authentication mode of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        public Builder authMode(String authMode) {
            this.putBodyParameter("AuthMode", authMode);
            this.authMode = authMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false: manual payment. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false: manual payment. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The ID of the region where the delivery group resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-hangzhou: China (Hangzhou)</li>
         * </ul>
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
         * <p>The sales mode.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Node: by resource</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Node</p>
         */
        public Builder chargeResourceMode(String chargeResourceMode) {
            this.putBodyParameter("ChargeResourceMode", chargeResourceMode);
            this.chargeResourceMode = chargeResourceMode;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>Cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cls-d39iq73l5c0a8****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The network settings.</p>
         * <blockquote>
         * <p> If you want to use this parameter, submit a ticket.</p>
         * </blockquote>
         */
        public Builder network(Network network) {
            String networkShrink = shrink(network, "Network", "json");
            this.putBodyParameter("Network", networkShrink);
            this.network = network;
            return this;
        }

        /**
         * <p>The node pool object.</p>
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putBodyParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
         * <p>The subscription duration of resources. This parameter is required if you set <code>ChargeType</code> to <code>PrePaid</code>. The unit of this parameter is specified by <code>PeriodUnit</code>.</p>
         * <ul>
         * <li><p>Valid value if you set <code>PeriodUnit</code> to <code>Week</code>:</p>
         * <ul>
         * <li>1</li>
         * </ul>
         * </li>
         * <li><p>Valid values if you set <code>PeriodUnit</code> to <code>Month</code>:</p>
         * <ul>
         * <li>1</li>
         * <li>2</li>
         * <li>3</li>
         * <li>6</li>
         * </ul>
         * </li>
         * <li><p>Valid values if you set <code>PeriodUnit</code> to <code>Year</code>:</p>
         * <ul>
         * <li>1</li>
         * <li>2</li>
         * <li>3</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If you set <code>ChargeType</code> to <code>PostPaid</code>, set this parameter to 1.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. This parameter is available if you set <code>ChargeType</code> to <code>PrePaid</code>.</p>
         * <blockquote>
         * <p> The value of this parameter is case-insensitive. For example, <code>Week</code> is valid and <code>week</code> is invalid. If you specify an invalid value combination for Period and PeriodUnit, such as <code>2 Week</code>, the operation can still be called. However, an error occurs when you place the order.</p>
         * </blockquote>
         * <blockquote>
         * <p> If you set <code>ChargeType</code> to <code>PostPaid</code>, set this parameter to <code>Month</code>.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * <li>Week</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Week</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the pre-open application.</p>
         * 
         * <strong>example:</strong>
         * <p>cag-b2ron*******</p>
         */
        public Builder preOpenAppId(String preOpenAppId) {
            this.putBodyParameter("PreOpenAppId", preOpenAppId);
            this.preOpenAppId = preOpenAppId;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The promotion ID. You can call the <a href="https://help.aliyun.com/document_detail/428503.html">GetResourcePrice</a> operation to obtain the ID.</p>
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
         * <p>The runtime policy.</p>
         */
        public Builder runtimePolicy(RuntimePolicy runtimePolicy) {
            String runtimePolicyShrink = shrink(runtimePolicy, "RuntimePolicy", "json");
            this.putBodyParameter("RuntimePolicy", runtimePolicyShrink);
            this.runtimePolicy = runtimePolicy;
            return this;
        }

        /**
         * <p>The security policy.</p>
         */
        public Builder securityPolicy(SecurityPolicy securityPolicy) {
            String securityPolicyShrink = shrink(securityPolicy, "SecurityPolicy", "json");
            this.putBodyParameter("SecurityPolicy", securityPolicyShrink);
            this.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * <p>The period of time during which the application can be recycled. The recycling period is the period of time between the time when the end user disconnects from the application and the time when processes exit the application. If you do not want to recycle the application, set this parameter to <code>-1</code>. Valid values:-1 and 3 to 300. The value must be an integer. Default value: <code>15</code>. Unit: minutes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putBodyParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * <p>The storage policy.</p>
         */
        public Builder storagePolicy(StoragePolicy storagePolicy) {
            String storagePolicyShrink = shrink(storagePolicy, "StoragePolicy", "json");
            this.putBodyParameter("StoragePolicy", storagePolicyShrink);
            this.storagePolicy = storagePolicy;
            return this;
        }

        /**
         * <p>Payment method subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>postPaid</p>
         */
        public Builder subPayType(String subPayType) {
            this.putBodyParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        /**
         * <p>The custom policy.</p>
         */
        public Builder userDefinePolicy(UserDefinePolicy userDefinePolicy) {
            String userDefinePolicyShrink = shrink(userDefinePolicy, "UserDefinePolicy", "json");
            this.putQueryParameter("UserDefinePolicy", userDefinePolicyShrink);
            this.userDefinePolicy = userDefinePolicy;
            return this;
        }

        /**
         * <p>List of authorized user group IDs.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The information about the user that you want to add to the assigned user list of the delivery group. This parameter is required if you configure <code>Users</code>.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        /**
         * <p>The users that you want to add to the assigned user list of the delivery group.</p>
         */
        public Builder users(java.util.List<String> users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        /**
         * <p>Display policy.</p>
         */
        public Builder videoPolicy(VideoPolicy videoPolicy) {
            String videoPolicyShrink = shrink(videoPolicy, "VideoPolicy", "json");
            this.putBodyParameter("VideoPolicy", videoPolicyShrink);
            this.videoPolicy = videoPolicy;
            return this;
        }

        @Override
        public CreateAppInstanceGroupRequest build() {
            return new CreateAppInstanceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class DomainRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        private DomainRules(Builder builder) {
            this.domain = builder.domain;
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainRules create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private String domain; 
            private String policy; 

            private Builder() {
            } 

            private Builder(DomainRules model) {
                this.domain = model.domain;
                this.policy = model.policy;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The policy used for the domain name.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>allow</li>
             * <li>block</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            public DomainRules build() {
                return new DomainRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private Routes(Builder builder) {
            this.destination = builder.destination;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routes create() {
            return builder().build();
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String destination; 
            private String mode; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.destination = model.destination;
                this.mode = model.mode;
            } 

            /**
             * <p>The destination. The value is a CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>139.196.XX.XX/32</p>
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>The network egress mode.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Shared: accesses the network by using NAT Gateway.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Shared</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainRules")
        private java.util.List<DomainRules> domainRules;

        @com.aliyun.core.annotation.NameInMap("IpExpireMinutes")
        private Integer ipExpireMinutes;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("Routes")
        private java.util.List<Routes> routes;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private Network(Builder builder) {
            this.domainRules = builder.domainRules;
            this.ipExpireMinutes = builder.ipExpireMinutes;
            this.officeSiteId = builder.officeSiteId;
            this.routes = builder.routes;
            this.strategyType = builder.strategyType;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return domainRules
         */
        public java.util.List<DomainRules> getDomainRules() {
            return this.domainRules;
        }

        /**
         * @return ipExpireMinutes
         */
        public Integer getIpExpireMinutes() {
            return this.ipExpireMinutes;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return routes
         */
        public java.util.List<Routes> getRoutes() {
            return this.routes;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private java.util.List<DomainRules> domainRules; 
            private Integer ipExpireMinutes; 
            private String officeSiteId; 
            private java.util.List<Routes> routes; 
            private String strategyType; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.domainRules = model.domainRules;
                this.ipExpireMinutes = model.ipExpireMinutes;
                this.officeSiteId = model.officeSiteId;
                this.routes = model.routes;
                this.strategyType = model.strategyType;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The domain name rules.</p>
             */
            public Builder domainRules(java.util.List<DomainRules> domainRules) {
                this.domainRules = domainRules;
                return this;
            }

            /**
             * <p>The validity period of the public IP address. If the specified value is exceeded, the IP address is updated at next logon. Minimum value: 60. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ipExpireMinutes(Integer ipExpireMinutes) {
                this.ipExpireMinutes = ipExpireMinutes;
                return this;
            }

            /**
             * <p>Office Network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hongkong+dir-842567****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The route settings. This parameter is available only if you set <code>StrategyType</code> to <code>Mixed</code>.</p>
             */
            public Builder routes(java.util.List<Routes> routes) {
                this.routes = routes;
                return this;
            }

            /**
             * <p>The type of the network policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Mixed: the hybrid mode. In this mode, a device is deployed in one virtual private cloud (VPC). Two NICs are provided and an independent public IP address is configured for the device.</li>
             * <li>Shared: the shared mode. In this mode, a single NIC is provided for a device and the network is accessed by using NAT Gateway.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Shared</p>
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * <p>List of virtual switch IDs.</p>
             * <ul>
             * <li>Valid only for custom office networks.</li>
             * </ul>
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
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class TimerPeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private TimerPeriods(Builder builder) {
            this.amount = builder.amount;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimerPeriods create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer amount; 
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(TimerPeriods model) {
                this.amount = model.amount;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The end time of the time period. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>15:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the time period. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimerPeriods build() {
                return new TimerPeriods(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class RecurrenceSchedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValues")
        private java.util.List<Integer> recurrenceValues;

        @com.aliyun.core.annotation.NameInMap("TimerPeriods")
        private java.util.List<TimerPeriods> timerPeriods;

        private RecurrenceSchedules(Builder builder) {
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValues = builder.recurrenceValues;
            this.timerPeriods = builder.timerPeriods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecurrenceSchedules create() {
            return builder().build();
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValues
         */
        public java.util.List<Integer> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        /**
         * @return timerPeriods
         */
        public java.util.List<TimerPeriods> getTimerPeriods() {
            return this.timerPeriods;
        }

        public static final class Builder {
            private String recurrenceType; 
            private java.util.List<Integer> recurrenceValues; 
            private java.util.List<TimerPeriods> timerPeriods; 

            private Builder() {
            } 

            private Builder(RecurrenceSchedules model) {
                this.recurrenceType = model.recurrenceType;
                this.recurrenceValues = model.recurrenceValues;
                this.timerPeriods = model.timerPeriods;
            } 

            /**
             * <p>The schedule type of the scaling policy. This parameter must be configured together with <code>RecurrenceValues</code>.``</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Weekly: The scaling policy is executed on specific days each week.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>weekly</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>The days of each week on which the scaling policy is executed.</p>
             */
            public Builder recurrenceValues(java.util.List<Integer> recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * <p>The time periods during which the scaling policy can be executed. The time periods must meet the following requirements:</p>
             * <ul>
             * <li>Up to three time periods can be added.</li>
             * <li>Time periods cannot be overlapped.</li>
             * <li>The interval between two consecutive time periods must be greater than or equal to 5 minutes.</li>
             * <li>Each time period must be greater than or equal to 15 minutes.</li>
             * <li>The total length of the time periods that you specify cannot be greater than a day.</li>
             * </ul>
             */
            public Builder timerPeriods(java.util.List<TimerPeriods> timerPeriods) {
                this.timerPeriods = timerPeriods;
                return this;
            }

            public RecurrenceSchedules build() {
                return new RecurrenceSchedules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class NodePool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxIdleAppInstanceAmount")
        private Integer maxIdleAppInstanceAmount;

        @com.aliyun.core.annotation.NameInMap("MaxScalingAmount")
        private Integer maxScalingAmount;

        @com.aliyun.core.annotation.NameInMap("NodeAmount")
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("NodeCapacity")
        private Integer nodeCapacity;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
        private String nodeInstanceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceSchedules")
        private java.util.List<RecurrenceSchedules> recurrenceSchedules;

        @com.aliyun.core.annotation.NameInMap("ScalingDownAfterIdleMinutes")
        private Integer scalingDownAfterIdleMinutes;

        @com.aliyun.core.annotation.NameInMap("ScalingStep")
        private Integer scalingStep;

        @com.aliyun.core.annotation.NameInMap("ScalingUsageThreshold")
        private String scalingUsageThreshold;

        @com.aliyun.core.annotation.NameInMap("StrategyDisableDate")
        private String strategyDisableDate;

        @com.aliyun.core.annotation.NameInMap("StrategyEnableDate")
        private String strategyEnableDate;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        @com.aliyun.core.annotation.NameInMap("WarmUp")
        private Boolean warmUp;

        private NodePool(Builder builder) {
            this.maxIdleAppInstanceAmount = builder.maxIdleAppInstanceAmount;
            this.maxScalingAmount = builder.maxScalingAmount;
            this.nodeAmount = builder.nodeAmount;
            this.nodeCapacity = builder.nodeCapacity;
            this.nodeInstanceType = builder.nodeInstanceType;
            this.recurrenceSchedules = builder.recurrenceSchedules;
            this.scalingDownAfterIdleMinutes = builder.scalingDownAfterIdleMinutes;
            this.scalingStep = builder.scalingStep;
            this.scalingUsageThreshold = builder.scalingUsageThreshold;
            this.strategyDisableDate = builder.strategyDisableDate;
            this.strategyEnableDate = builder.strategyEnableDate;
            this.strategyType = builder.strategyType;
            this.warmUp = builder.warmUp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePool create() {
            return builder().build();
        }

        /**
         * @return maxIdleAppInstanceAmount
         */
        public Integer getMaxIdleAppInstanceAmount() {
            return this.maxIdleAppInstanceAmount;
        }

        /**
         * @return maxScalingAmount
         */
        public Integer getMaxScalingAmount() {
            return this.maxScalingAmount;
        }

        /**
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return nodeCapacity
         */
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        /**
         * @return nodeInstanceType
         */
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        /**
         * @return recurrenceSchedules
         */
        public java.util.List<RecurrenceSchedules> getRecurrenceSchedules() {
            return this.recurrenceSchedules;
        }

        /**
         * @return scalingDownAfterIdleMinutes
         */
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        /**
         * @return scalingStep
         */
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        /**
         * @return scalingUsageThreshold
         */
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        /**
         * @return strategyDisableDate
         */
        public String getStrategyDisableDate() {
            return this.strategyDisableDate;
        }

        /**
         * @return strategyEnableDate
         */
        public String getStrategyEnableDate() {
            return this.strategyEnableDate;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        /**
         * @return warmUp
         */
        public Boolean getWarmUp() {
            return this.warmUp;
        }

        public static final class Builder {
            private Integer maxIdleAppInstanceAmount; 
            private Integer maxScalingAmount; 
            private Integer nodeAmount; 
            private Integer nodeCapacity; 
            private String nodeInstanceType; 
            private java.util.List<RecurrenceSchedules> recurrenceSchedules; 
            private Integer scalingDownAfterIdleMinutes; 
            private Integer scalingStep; 
            private String scalingUsageThreshold; 
            private String strategyDisableDate; 
            private String strategyEnableDate; 
            private String strategyType; 
            private Boolean warmUp; 

            private Builder() {
            } 

            private Builder(NodePool model) {
                this.maxIdleAppInstanceAmount = model.maxIdleAppInstanceAmount;
                this.maxScalingAmount = model.maxScalingAmount;
                this.nodeAmount = model.nodeAmount;
                this.nodeCapacity = model.nodeCapacity;
                this.nodeInstanceType = model.nodeInstanceType;
                this.recurrenceSchedules = model.recurrenceSchedules;
                this.scalingDownAfterIdleMinutes = model.scalingDownAfterIdleMinutes;
                this.scalingStep = model.scalingStep;
                this.scalingUsageThreshold = model.scalingUsageThreshold;
                this.strategyDisableDate = model.strategyDisableDate;
                this.strategyEnableDate = model.strategyEnableDate;
                this.strategyType = model.strategyType;
                this.warmUp = model.warmUp;
            } 

            /**
             * <p>Maximum number of idle sessions. When this value is specified, auto-scaling is triggered only if the session utilization exceeds <code>ScalingUsageThreshold</code> and the current number of idle sessions in the delivery group is less than <code>MaxIdleAppInstanceAmount</code>. Otherwise, it is considered that sufficient idle sessions are available, and no auto-scaling will occur. This parameter allows flexible control over elastic scaling behavior and helps reduce usage costs.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
                this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
                return this;
            }

            /**
             * <p>The maximum number of resources that can be created for scale-out. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * <p>The number of resources that you want to purchase. Valid values: 1 to 100.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is required if the resources are subscription resources.</p>
             * </li>
             * <li><p>If the resources are pay-as-you-go resources, this parameter is required only if you set <code>StrategyType</code> to <code>NODE_FIXED</code> or <code>NODE_SCALING_BY_USAGE</code>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The maximum number of sessions to which a resource can connect at the same time. If a resource connects to a large number of sessions at the same time, the user experience can be compromised. The value range varies based on the resource type. The following items describe the value ranges of different resource types:</p>
             * <ul>
             * <li>appstreaming.general.4c8g: 1 to 2</li>
             * <li>appstreaming.general.8c16g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
             * <li>appstreaming.vgpu.14c93g.12g: 1 to 6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * <p>The ID of the resource type that you want to purchase. You can call the <a href="https://help.aliyun.com/document_detail/428502.html">ListNodeInstanceType</a> operation to obtain the ID.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>appstreaming.vgpu.8c16g.4g: WUYING - Graphics_8 vCPUs, 16 GiB Memory, 4 GiB GPU Memory</li>
             * <li>appstreaming.general.8c16g: WUYING - General_8 vCPUs, 16 GiB Memory</li>
             * <li>appstreaming.general.4c8g: WUYING - General_4 vCPUs, 8 GiB Memory</li>
             * <li>appstreaming.vgpu.14c93g.12g: WUYING - Graphics_14 vCPUs, 93 GiB Memory, 12 GiB GPU Memory.</li>
             * <li>appstreaming.vgpu.8c31g.16g: WUYING - Graphics_8 vCPUs, 31 GiB Memory, 16 GiB GPU Memory</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.general.4c8g</p>
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * <p>The schedules of the scaling policy. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
             */
            public Builder recurrenceSchedules(java.util.List<RecurrenceSchedules> recurrenceSchedules) {
                this.recurrenceSchedules = recurrenceSchedules;
                return this;
            }

            /**
             * <p>The maximum retention period of a resource to which no session is connected. If no session is connected to a resource, the resource is automatically scaled in after the specified retention period elapses. Valid values: 5 to 120. Default value: 5. Unit: minutes. If one of the following situations occurs, the resource is not scaled in.</p>
             * <ul>
             * <li>If automatic scale-out is triggered after the resource is scaled in, the scale-in is not executed. This prevents repeated scale-in and scale-out.</li>
             * <li>If automatic scale-out is triggered due to an increase in the number of sessions during the specified period of time, the resource is not scaled in and the countdown restarts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * <p>The number of resources that are created each time resources are scaled out. Valid values: 1 to 10. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * <p>The upper limit of session usage. If the session usage exceeds the specified upper limit, auto scaling is automatically triggered. The session usage is calculated by using the following formula: <code>Session usage = Number of current sessions/(Total number of resources × Number of concurrent sessions) × 100%</code>. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>. Valid values: 0 to 100. Default value: 85.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * <p>The expiration date of the scaling policy. Format: yyyy-MM-dd. The interval between the expiration date and the effective date must be from 7 days to 1 year. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-08</p>
             */
            public Builder strategyDisableDate(String strategyDisableDate) {
                this.strategyDisableDate = strategyDisableDate;
                return this;
            }

            /**
             * <p>The effective date of the scaling policy. Format: yyyy-MM-dd. The date must be the same as or later than the current date. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01</p>
             */
            public Builder strategyEnableDate(String strategyEnableDate) {
                this.strategyEnableDate = strategyEnableDate;
                return this;
            }

            /**
             * <p>The scaling policy of resources.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p><code>NODE_FIXED</code>: fixed number of resources. This value is applicable to pay-as-you-go resources and subscription resources.</p>
             * </li>
             * <li><p><code>NODE_SCALING_BY_USAGE</code>: auto scaling. This value is applicable to pay-as-you-go resources and subscription resources.</p>
             * </li>
             * <li><p><code>NODE_SCALING_BY_SCHEDULE</code>: scheduled scaling. This value is applicable only to pay-as-you-go resources.</p>
             * </li>
             * </ul>
             * <p>Valid values:</p>
             * <ul>
             * <li>NODE_FIXED: fixed number of resources</li>
             * <li>NODE_SCALING_BY_SCHEDULE: scheduled scaling</li>
             * <li>NODE_SCALING_BY_USAGE: auto scaling</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NODE_FIXED</p>
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * <p>Specifies whether to enable the warmup policy for resources. This parameter is required if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder warmUp(Boolean warmUp) {
                this.warmUp = warmUp;
                return this;
            }

            public NodePool build() {
                return new NodePool(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class RuntimePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DebugMode")
        private String debugMode;

        @com.aliyun.core.annotation.NameInMap("PerSessionPerApp")
        private Boolean perSessionPerApp;

        @com.aliyun.core.annotation.NameInMap("PersistentAppInstanceScheduleMode")
        private String persistentAppInstanceScheduleMode;

        @com.aliyun.core.annotation.NameInMap("SessionPreOpen")
        private String sessionPreOpen;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("SessionUserGenerationMode")
        private String sessionUserGenerationMode;

        private RuntimePolicy(Builder builder) {
            this.debugMode = builder.debugMode;
            this.perSessionPerApp = builder.perSessionPerApp;
            this.persistentAppInstanceScheduleMode = builder.persistentAppInstanceScheduleMode;
            this.sessionPreOpen = builder.sessionPreOpen;
            this.sessionType = builder.sessionType;
            this.sessionUserGenerationMode = builder.sessionUserGenerationMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimePolicy create() {
            return builder().build();
        }

        /**
         * @return debugMode
         */
        public String getDebugMode() {
            return this.debugMode;
        }

        /**
         * @return perSessionPerApp
         */
        public Boolean getPerSessionPerApp() {
            return this.perSessionPerApp;
        }

        /**
         * @return persistentAppInstanceScheduleMode
         */
        public String getPersistentAppInstanceScheduleMode() {
            return this.persistentAppInstanceScheduleMode;
        }

        /**
         * @return sessionPreOpen
         */
        public String getSessionPreOpen() {
            return this.sessionPreOpen;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return sessionUserGenerationMode
         */
        public String getSessionUserGenerationMode() {
            return this.sessionUserGenerationMode;
        }

        public static final class Builder {
            private String debugMode; 
            private Boolean perSessionPerApp; 
            private String persistentAppInstanceScheduleMode; 
            private String sessionPreOpen; 
            private String sessionType; 
            private String sessionUserGenerationMode; 

            private Builder() {
            } 

            private Builder(RuntimePolicy model) {
                this.debugMode = model.debugMode;
                this.perSessionPerApp = model.perSessionPerApp;
                this.persistentAppInstanceScheduleMode = model.persistentAppInstanceScheduleMode;
                this.sessionPreOpen = model.sessionPreOpen;
                this.sessionType = model.sessionType;
                this.sessionUserGenerationMode = model.sessionUserGenerationMode;
            } 

            /**
             * <p>Specifies whether to enable the debugging mode. If you want to call the <code>GetDebugAppInstance</code> and <code>CreateImageFromAppInstanceGroup</code> operations, you must set this parameter to <code>ON</code>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>OFF</li>
             * <li>ON</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OFF</p>
             */
            public Builder debugMode(String debugMode) {
                this.debugMode = debugMode;
                return this;
            }

            /**
             * <p>Only one application is allowed to be opened within a single session.</p>
             * <ul>
             * <li>When enabled, launching multiple applications from the delivery group will allocate a separate session for each application, resulting in higher session consumption.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder perSessionPerApp(Boolean perSessionPerApp) {
                this.perSessionPerApp = perSessionPerApp;
                return this;
            }

            /**
             * <p>Persistent session scheduling mode.</p>
             * 
             * <strong>example:</strong>
             * <p>DYNAMIC</p>
             */
            public Builder persistentAppInstanceScheduleMode(String persistentAppInstanceScheduleMode) {
                this.persistentAppInstanceScheduleMode = persistentAppInstanceScheduleMode;
                return this;
            }

            /**
             * <p>Session pre-launch toggle.</p>
             * <ul>
             * <li>If not specified, the default value is true.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sessionPreOpen(String sessionPreOpen) {
                this.sessionPreOpen = sessionPreOpen;
                return this;
            }

            /**
             * <p>The session type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>CONSOLE: console session</li>
             * <li>NORMAL: Remote Desktop Protocol (RDP)-based O&amp;M session</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The generation mode of the session users. Valid value:</p>
             * <ul>
             * <li>wyid. In this case, you must set sessionPreOpen to false.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>wyid</p>
             */
            public Builder sessionUserGenerationMode(String sessionUserGenerationMode) {
                this.sessionUserGenerationMode = sessionUserGenerationMode;
                return this;
            }

            public RuntimePolicy build() {
                return new RuntimePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class SecurityPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResetAfterUnbind")
        private Boolean resetAfterUnbind;

        @com.aliyun.core.annotation.NameInMap("SkipUserAuthCheck")
        private Boolean skipUserAuthCheck;

        private SecurityPolicy(Builder builder) {
            this.resetAfterUnbind = builder.resetAfterUnbind;
            this.skipUserAuthCheck = builder.skipUserAuthCheck;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityPolicy create() {
            return builder().build();
        }

        /**
         * @return resetAfterUnbind
         */
        public Boolean getResetAfterUnbind() {
            return this.resetAfterUnbind;
        }

        /**
         * @return skipUserAuthCheck
         */
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

        public static final class Builder {
            private Boolean resetAfterUnbind; 
            private Boolean skipUserAuthCheck; 

            private Builder() {
            } 

            private Builder(SecurityPolicy model) {
                this.resetAfterUnbind = model.resetAfterUnbind;
                this.skipUserAuthCheck = model.skipUserAuthCheck;
            } 

            /**
             * <p>Specifies whether to reset after unbinding from a delivery group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder resetAfterUnbind(Boolean resetAfterUnbind) {
                this.resetAfterUnbind = resetAfterUnbind;
                return this;
            }

            /**
             * <p>Specifies whether to skip user permission verification.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false: This is the default value.</li>
             * </ul>
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
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class UserProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemoteStoragePath")
        private String remoteStoragePath;

        @com.aliyun.core.annotation.NameInMap("RemoteStorageType")
        private String remoteStorageType;

        @com.aliyun.core.annotation.NameInMap("UserProfileSwitch")
        private Boolean userProfileSwitch;

        private UserProfile(Builder builder) {
            this.remoteStoragePath = builder.remoteStoragePath;
            this.remoteStorageType = builder.remoteStorageType;
            this.userProfileSwitch = builder.userProfileSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProfile create() {
            return builder().build();
        }

        /**
         * @return remoteStoragePath
         */
        public String getRemoteStoragePath() {
            return this.remoteStoragePath;
        }

        /**
         * @return remoteStorageType
         */
        public String getRemoteStorageType() {
            return this.remoteStorageType;
        }

        /**
         * @return userProfileSwitch
         */
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

        public static final class Builder {
            private String remoteStoragePath; 
            private String remoteStorageType; 
            private Boolean userProfileSwitch; 

            private Builder() {
            } 

            private Builder(UserProfile model) {
                this.remoteStoragePath = model.remoteStoragePath;
                this.remoteStorageType = model.remoteStorageType;
                this.userProfileSwitch = model.userProfileSwitch;
            } 

            /**
             * <p>Remote storage path for user data roaming.</p>
             * <ul>
             * <li>If left empty, the default value is the delivery group ID.</li>
             * <li>For cross-delivery-group (within the same VPC) user data roaming, the same value must be configured for all participating delivery groups.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ID20250101</p>
             */
            public Builder remoteStoragePath(String remoteStoragePath) {
                this.remoteStoragePath = remoteStoragePath;
                return this;
            }

            /**
             * <p>Remote storage type used for user data roaming.</p>
             * 
             * <strong>example:</strong>
             * <p>NAS</p>
             */
            public Builder remoteStorageType(String remoteStorageType) {
                this.remoteStorageType = remoteStorageType;
                return this;
            }

            /**
             * <p>User data roaming toggle.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class StoragePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageTypeList")
        private java.util.List<String> storageTypeList;

        @com.aliyun.core.annotation.NameInMap("UserProfile")
        private UserProfile userProfile;

        private StoragePolicy(Builder builder) {
            this.storageTypeList = builder.storageTypeList;
            this.userProfile = builder.userProfile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoragePolicy create() {
            return builder().build();
        }

        /**
         * @return storageTypeList
         */
        public java.util.List<String> getStorageTypeList() {
            return this.storageTypeList;
        }

        /**
         * @return userProfile
         */
        public UserProfile getUserProfile() {
            return this.userProfile;
        }

        public static final class Builder {
            private java.util.List<String> storageTypeList; 
            private UserProfile userProfile; 

            private Builder() {
            } 

            private Builder(StoragePolicy model) {
                this.storageTypeList = model.storageTypeList;
                this.userProfile = model.userProfile;
            } 

            /**
             * <p>The storage types.</p>
             */
            public Builder storageTypeList(java.util.List<String> storageTypeList) {
                this.storageTypeList = storageTypeList;
                return this;
            }

            /**
             * <p>User data roaming configuration.</p>
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
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class UserDefinePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomConfig")
        private String customConfig;

        private UserDefinePolicy(Builder builder) {
            this.customConfig = builder.customConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDefinePolicy create() {
            return builder().build();
        }

        /**
         * @return customConfig
         */
        public String getCustomConfig() {
            return this.customConfig;
        }

        public static final class Builder {
            private String customConfig; 

            private Builder() {
            } 

            private Builder(UserDefinePolicy model) {
                this.customConfig = model.customConfig;
            } 

            /**
             * <p>The content of the custom policy. The content must meet the specifications of image versions. To use this parameter, submit a ticket to apply to enable the whitelist feature.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;target&quot;:&quot;agent&quot;,&quot;config&quot;:{&quot;abc&quot;:&quot;xxx&quot;}}]</p>
             */
            public Builder customConfig(String customConfig) {
                this.customConfig = customConfig;
                return this;
            }

            public UserDefinePolicy build() {
                return new UserDefinePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
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
             * <p>The account type of the user.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Simple: convenience account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Simple</p>
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
     * {@link CreateAppInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceGroupRequest</p>
     */
    public static class VideoPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private Integer frameRate;

        @com.aliyun.core.annotation.NameInMap("SessionResolutionHeight")
        private Integer sessionResolutionHeight;

        @com.aliyun.core.annotation.NameInMap("SessionResolutionWidth")
        private Integer sessionResolutionWidth;

        @com.aliyun.core.annotation.NameInMap("StreamingMode")
        private String streamingMode;

        @com.aliyun.core.annotation.NameInMap("TerminalResolutionAdaptive")
        private Boolean terminalResolutionAdaptive;

        @com.aliyun.core.annotation.NameInMap("Webrtc")
        private Boolean webrtc;

        private VideoPolicy(Builder builder) {
            this.frameRate = builder.frameRate;
            this.sessionResolutionHeight = builder.sessionResolutionHeight;
            this.sessionResolutionWidth = builder.sessionResolutionWidth;
            this.streamingMode = builder.streamingMode;
            this.terminalResolutionAdaptive = builder.terminalResolutionAdaptive;
            this.webrtc = builder.webrtc;
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

        /**
         * @return sessionResolutionHeight
         */
        public Integer getSessionResolutionHeight() {
            return this.sessionResolutionHeight;
        }

        /**
         * @return sessionResolutionWidth
         */
        public Integer getSessionResolutionWidth() {
            return this.sessionResolutionWidth;
        }

        /**
         * @return streamingMode
         */
        public String getStreamingMode() {
            return this.streamingMode;
        }

        /**
         * @return terminalResolutionAdaptive
         */
        public Boolean getTerminalResolutionAdaptive() {
            return this.terminalResolutionAdaptive;
        }

        /**
         * @return webrtc
         */
        public Boolean getWebrtc() {
            return this.webrtc;
        }

        public static final class Builder {
            private Integer frameRate; 
            private Integer sessionResolutionHeight; 
            private Integer sessionResolutionWidth; 
            private String streamingMode; 
            private Boolean terminalResolutionAdaptive; 
            private Boolean webrtc; 

            private Builder() {
            } 

            private Builder(VideoPolicy model) {
                this.frameRate = model.frameRate;
                this.sessionResolutionHeight = model.sessionResolutionHeight;
                this.sessionResolutionWidth = model.sessionResolutionWidth;
                this.streamingMode = model.streamingMode;
                this.terminalResolutionAdaptive = model.terminalResolutionAdaptive;
                this.webrtc = model.webrtc;
            } 

            /**
             * <p>Frame rate (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder frameRate(Integer frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * <p>Resolution height, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder sessionResolutionHeight(Integer sessionResolutionHeight) {
                this.sessionResolutionHeight = sessionResolutionHeight;
                return this;
            }

            /**
             * <p>Resolution width, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder sessionResolutionWidth(Integer sessionResolutionWidth) {
                this.sessionResolutionWidth = sessionResolutionWidth;
                return this;
            }

            /**
             * <p>Streaming mode. Combined with the Webrtc parameter, it indicates the protocol type.</p>
             * <ul>
             * <li>When Webrtc=true and StreamingMode=video, it indicates a WebRTC stream.</li>
             * <li>When Webrtc=false and StreamingMode=video, it indicates a video stream.</li>
             * <li>When Webrtc=false and StreamingMode=mix, it indicates a mixed stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder streamingMode(String streamingMode) {
                this.streamingMode = streamingMode;
                return this;
            }

            /**
             * <p>Whether to use adaptive resolution.</p>
             * <ul>
             * <li><p>true: The session resolution follows changes in the terminal&quot;s display area. In this case, SessionResolutionWidth and SessionResolutionHeight represent the maximum values for resolution adjustment.</p>
             * </li>
             * <li><p>false: The session resolution does not follow changes in the terminal&quot;s display area. In this case, the resolution is fixed to the values of SessionResolutionWidth and SessionResolutionHeight.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder terminalResolutionAdaptive(Boolean terminalResolutionAdaptive) {
                this.terminalResolutionAdaptive = terminalResolutionAdaptive;
                return this;
            }

            /**
             * <p>Whether to enable WebRTC. Combined with the StreamingMode parameter, it indicates the protocol type.</p>
             * <ul>
             * <li>When Webrtc=true and StreamingMode=video, it indicates a WebRTC stream.</li>
             * <li>When Webrtc=false and StreamingMode=video, it indicates a video stream.</li>
             * <li>When Webrtc=false and StreamingMode=mix, it indicates a mixed stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder webrtc(Boolean webrtc) {
                this.webrtc = webrtc;
                return this;
            }

            public VideoPolicy build() {
                return new VideoPolicy(this);
            } 

        } 

    }
}
