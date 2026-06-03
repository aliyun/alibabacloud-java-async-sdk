// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppOperationAddress} extends {@link TeaModel}
 *
 * <p>AppOperationAddress</p>
 */
public class AppOperationAddress extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Actions")
    private java.util.List<AppOperateAction> actions;

    @com.aliyun.core.annotation.NameInMap("AiCustomerConfigUrl")
    private String aiCustomerConfigUrl;

    @com.aliyun.core.annotation.NameInMap("AiDesignUrl")
    private String aiDesignUrl;

    @com.aliyun.core.annotation.NameInMap("AppPublishUrl")
    private String appPublishUrl;

    @com.aliyun.core.annotation.NameInMap("DashboardActions")
    private java.util.List<AppOperateAction> dashboardActions;

    @com.aliyun.core.annotation.NameInMap("DesignUrl")
    private String designUrl;

    @com.aliyun.core.annotation.NameInMap("InstanceLoginUrl")
    private String instanceLoginUrl;

    @com.aliyun.core.annotation.NameInMap("RenewBuyUrl")
    private String renewBuyUrl;

    @com.aliyun.core.annotation.NameInMap("ServerDeliveryUrl")
    private String serverDeliveryUrl;

    @com.aliyun.core.annotation.NameInMap("UpgradeBuyUrl")
    private String upgradeBuyUrl;

    private AppOperationAddress(Builder builder) {
        this.actions = builder.actions;
        this.aiCustomerConfigUrl = builder.aiCustomerConfigUrl;
        this.aiDesignUrl = builder.aiDesignUrl;
        this.appPublishUrl = builder.appPublishUrl;
        this.dashboardActions = builder.dashboardActions;
        this.designUrl = builder.designUrl;
        this.instanceLoginUrl = builder.instanceLoginUrl;
        this.renewBuyUrl = builder.renewBuyUrl;
        this.serverDeliveryUrl = builder.serverDeliveryUrl;
        this.upgradeBuyUrl = builder.upgradeBuyUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppOperationAddress create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public java.util.List<AppOperateAction> getActions() {
        return this.actions;
    }

    /**
     * @return aiCustomerConfigUrl
     */
    public String getAiCustomerConfigUrl() {
        return this.aiCustomerConfigUrl;
    }

    /**
     * @return aiDesignUrl
     */
    public String getAiDesignUrl() {
        return this.aiDesignUrl;
    }

    /**
     * @return appPublishUrl
     */
    public String getAppPublishUrl() {
        return this.appPublishUrl;
    }

    /**
     * @return dashboardActions
     */
    public java.util.List<AppOperateAction> getDashboardActions() {
        return this.dashboardActions;
    }

    /**
     * @return designUrl
     */
    public String getDesignUrl() {
        return this.designUrl;
    }

    /**
     * @return instanceLoginUrl
     */
    public String getInstanceLoginUrl() {
        return this.instanceLoginUrl;
    }

    /**
     * @return renewBuyUrl
     */
    public String getRenewBuyUrl() {
        return this.renewBuyUrl;
    }

    /**
     * @return serverDeliveryUrl
     */
    public String getServerDeliveryUrl() {
        return this.serverDeliveryUrl;
    }

    /**
     * @return upgradeBuyUrl
     */
    public String getUpgradeBuyUrl() {
        return this.upgradeBuyUrl;
    }

    public static final class Builder {
        private java.util.List<AppOperateAction> actions; 
        private String aiCustomerConfigUrl; 
        private String aiDesignUrl; 
        private String appPublishUrl; 
        private java.util.List<AppOperateAction> dashboardActions; 
        private String designUrl; 
        private String instanceLoginUrl; 
        private String renewBuyUrl; 
        private String serverDeliveryUrl; 
        private String upgradeBuyUrl; 

        private Builder() {
        } 

        private Builder(AppOperationAddress model) {
            this.actions = model.actions;
            this.aiCustomerConfigUrl = model.aiCustomerConfigUrl;
            this.aiDesignUrl = model.aiDesignUrl;
            this.appPublishUrl = model.appPublishUrl;
            this.dashboardActions = model.dashboardActions;
            this.designUrl = model.designUrl;
            this.instanceLoginUrl = model.instanceLoginUrl;
            this.renewBuyUrl = model.renewBuyUrl;
            this.serverDeliveryUrl = model.serverDeliveryUrl;
            this.upgradeBuyUrl = model.upgradeBuyUrl;
        } 

        /**
         * Actions.
         */
        public Builder actions(java.util.List<AppOperateAction> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * AiCustomerConfigUrl.
         */
        public Builder aiCustomerConfigUrl(String aiCustomerConfigUrl) {
            this.aiCustomerConfigUrl = aiCustomerConfigUrl;
            return this;
        }

        /**
         * AiDesignUrl.
         */
        public Builder aiDesignUrl(String aiDesignUrl) {
            this.aiDesignUrl = aiDesignUrl;
            return this;
        }

        /**
         * AppPublishUrl.
         */
        public Builder appPublishUrl(String appPublishUrl) {
            this.appPublishUrl = appPublishUrl;
            return this;
        }

        /**
         * DashboardActions.
         */
        public Builder dashboardActions(java.util.List<AppOperateAction> dashboardActions) {
            this.dashboardActions = dashboardActions;
            return this;
        }

        /**
         * DesignUrl.
         */
        public Builder designUrl(String designUrl) {
            this.designUrl = designUrl;
            return this;
        }

        /**
         * InstanceLoginUrl.
         */
        public Builder instanceLoginUrl(String instanceLoginUrl) {
            this.instanceLoginUrl = instanceLoginUrl;
            return this;
        }

        /**
         * RenewBuyUrl.
         */
        public Builder renewBuyUrl(String renewBuyUrl) {
            this.renewBuyUrl = renewBuyUrl;
            return this;
        }

        /**
         * ServerDeliveryUrl.
         */
        public Builder serverDeliveryUrl(String serverDeliveryUrl) {
            this.serverDeliveryUrl = serverDeliveryUrl;
            return this;
        }

        /**
         * UpgradeBuyUrl.
         */
        public Builder upgradeBuyUrl(String upgradeBuyUrl) {
            this.upgradeBuyUrl = upgradeBuyUrl;
            return this;
        }

        public AppOperationAddress build() {
            return new AppOperationAddress(this);
        } 

    } 

}
