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
            this.userInfo = request.userInfo;
            this.users = request.users;
            this.videoPolicy = request.videoPolicy;
        } 

        /**
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
         * AppInstanceGroupName.
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putBodyParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * AppPackageType.
         */
        public Builder appPackageType(String appPackageType) {
            this.putBodyParameter("AppPackageType", appPackageType);
            this.appPackageType = appPackageType;
            return this;
        }

        /**
         * AppPolicyId.
         */
        public Builder appPolicyId(String appPolicyId) {
            this.putBodyParameter("AppPolicyId", appPolicyId);
            this.appPolicyId = appPolicyId;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(Network network) {
            String networkShrink = shrink(network, "Network", "json");
            this.putBodyParameter("Network", networkShrink);
            this.network = network;
            return this;
        }

        /**
         * NodePool.
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putBodyParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PreOpenAppId.
         */
        public Builder preOpenAppId(String preOpenAppId) {
            this.putBodyParameter("PreOpenAppId", preOpenAppId);
            this.preOpenAppId = preOpenAppId;
            return this;
        }

        /**
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
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putBodyParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * RuntimePolicy.
         */
        public Builder runtimePolicy(RuntimePolicy runtimePolicy) {
            String runtimePolicyShrink = shrink(runtimePolicy, "RuntimePolicy", "json");
            this.putBodyParameter("RuntimePolicy", runtimePolicyShrink);
            this.runtimePolicy = runtimePolicy;
            return this;
        }

        /**
         * SecurityPolicy.
         */
        public Builder securityPolicy(SecurityPolicy securityPolicy) {
            String securityPolicyShrink = shrink(securityPolicy, "SecurityPolicy", "json");
            this.putBodyParameter("SecurityPolicy", securityPolicyShrink);
            this.securityPolicy = securityPolicy;
            return this;
        }

        /**
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
         * StoragePolicy.
         */
        public Builder storagePolicy(StoragePolicy storagePolicy) {
            String storagePolicyShrink = shrink(storagePolicy, "StoragePolicy", "json");
            this.putBodyParameter("StoragePolicy", storagePolicyShrink);
            this.storagePolicy = storagePolicy;
            return this;
        }

        /**
         * SubPayType.
         */
        public Builder subPayType(String subPayType) {
            this.putBodyParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        /**
         * UserDefinePolicy.
         */
        public Builder userDefinePolicy(UserDefinePolicy userDefinePolicy) {
            String userDefinePolicyShrink = shrink(userDefinePolicy, "UserDefinePolicy", "json");
            this.putQueryParameter("UserDefinePolicy", userDefinePolicyShrink);
            this.userDefinePolicy = userDefinePolicy;
            return this;
        }

        /**
         * UserInfo.
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List<String> users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        /**
         * VideoPolicy.
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

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Policy.
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

            /**
             * Destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * Mode.
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

            /**
             * DomainRules.
             */
            public Builder domainRules(java.util.List<DomainRules> domainRules) {
                this.domainRules = domainRules;
                return this;
            }

            /**
             * IpExpireMinutes.
             */
            public Builder ipExpireMinutes(Integer ipExpireMinutes) {
                this.ipExpireMinutes = ipExpireMinutes;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * Routes.
             */
            public Builder routes(java.util.List<Routes> routes) {
                this.routes = routes;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * VSwitchIds.
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

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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

            /**
             * RecurrenceType.
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * RecurrenceValues.
             */
            public Builder recurrenceValues(java.util.List<Integer> recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * TimerPeriods.
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

            /**
             * MaxIdleAppInstanceAmount.
             */
            public Builder maxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
                this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
                return this;
            }

            /**
             * MaxScalingAmount.
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * NodeAmount.
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * NodeCapacity.
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * NodeInstanceType.
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * RecurrenceSchedules.
             */
            public Builder recurrenceSchedules(java.util.List<RecurrenceSchedules> recurrenceSchedules) {
                this.recurrenceSchedules = recurrenceSchedules;
                return this;
            }

            /**
             * ScalingDownAfterIdleMinutes.
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * ScalingStep.
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * ScalingUsageThreshold.
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * StrategyDisableDate.
             */
            public Builder strategyDisableDate(String strategyDisableDate) {
                this.strategyDisableDate = strategyDisableDate;
                return this;
            }

            /**
             * StrategyEnableDate.
             */
            public Builder strategyEnableDate(String strategyEnableDate) {
                this.strategyEnableDate = strategyEnableDate;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * WarmUp.
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

        @com.aliyun.core.annotation.NameInMap("SessionPreOpen")
        private String sessionPreOpen;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("SessionUserGenerationMode")
        private String sessionUserGenerationMode;

        private RuntimePolicy(Builder builder) {
            this.debugMode = builder.debugMode;
            this.perSessionPerApp = builder.perSessionPerApp;
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
            private String sessionPreOpen; 
            private String sessionType; 
            private String sessionUserGenerationMode; 

            /**
             * DebugMode.
             */
            public Builder debugMode(String debugMode) {
                this.debugMode = debugMode;
                return this;
            }

            /**
             * PerSessionPerApp.
             */
            public Builder perSessionPerApp(Boolean perSessionPerApp) {
                this.perSessionPerApp = perSessionPerApp;
                return this;
            }

            /**
             * SessionPreOpen.
             */
            public Builder sessionPreOpen(String sessionPreOpen) {
                this.sessionPreOpen = sessionPreOpen;
                return this;
            }

            /**
             * <p>会话类型。</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * SessionUserGenerationMode.
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

            /**
             * ResetAfterUnbind.
             */
            public Builder resetAfterUnbind(Boolean resetAfterUnbind) {
                this.resetAfterUnbind = resetAfterUnbind;
                return this;
            }

            /**
             * SkipUserAuthCheck.
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

            /**
             * RemoteStoragePath.
             */
            public Builder remoteStoragePath(String remoteStoragePath) {
                this.remoteStoragePath = remoteStoragePath;
                return this;
            }

            /**
             * RemoteStorageType.
             */
            public Builder remoteStorageType(String remoteStorageType) {
                this.remoteStorageType = remoteStorageType;
                return this;
            }

            /**
             * UserProfileSwitch.
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

            /**
             * StorageTypeList.
             */
            public Builder storageTypeList(java.util.List<String> storageTypeList) {
                this.storageTypeList = storageTypeList;
                return this;
            }

            /**
             * UserProfile.
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

            /**
             * CustomConfig.
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

            /**
             * Type.
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

            /**
             * FrameRate.
             */
            public Builder frameRate(Integer frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * SessionResolutionHeight.
             */
            public Builder sessionResolutionHeight(Integer sessionResolutionHeight) {
                this.sessionResolutionHeight = sessionResolutionHeight;
                return this;
            }

            /**
             * SessionResolutionWidth.
             */
            public Builder sessionResolutionWidth(Integer sessionResolutionWidth) {
                this.sessionResolutionWidth = sessionResolutionWidth;
                return this;
            }

            /**
             * StreamingMode.
             */
            public Builder streamingMode(String streamingMode) {
                this.streamingMode = streamingMode;
                return this;
            }

            /**
             * TerminalResolutionAdaptive.
             */
            public Builder terminalResolutionAdaptive(Boolean terminalResolutionAdaptive) {
                this.terminalResolutionAdaptive = terminalResolutionAdaptive;
                return this;
            }

            /**
             * Webrtc.
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
