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
 * {@link AppInstanceProfile} extends {@link TeaModel}
 *
 * <p>AppInstanceProfile</p>
 */
public class AppInstanceProfile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.NameInMap("ApplicationTypeText")
    private String applicationTypeText;

    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("CustomerService")
    private String customerService;

    @com.aliyun.core.annotation.NameInMap("DeployArea")
    private String deployArea;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("OrdTime")
    private String ordTime;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("PayTime")
    private String payTime;

    @com.aliyun.core.annotation.NameInMap("SeoSite")
    private String seoSite;

    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private String siteVersion;

    @com.aliyun.core.annotation.NameInMap("SiteVersionText")
    private String siteVersionText;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("TemplateEtag")
    private String templateEtag;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private AppInstanceProfile(Builder builder) {
        this.applicationType = builder.applicationType;
        this.applicationTypeText = builder.applicationTypeText;
        this.bizId = builder.bizId;
        this.commodityCode = builder.commodityCode;
        this.customerService = builder.customerService;
        this.deployArea = builder.deployArea;
        this.instanceId = builder.instanceId;
        this.ordTime = builder.ordTime;
        this.orderId = builder.orderId;
        this.payTime = builder.payTime;
        this.seoSite = builder.seoSite;
        this.siteVersion = builder.siteVersion;
        this.siteVersionText = builder.siteVersionText;
        this.source = builder.source;
        this.templateEtag = builder.templateEtag;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppInstanceProfile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return applicationTypeText
     */
    public String getApplicationTypeText() {
        return this.applicationTypeText;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return customerService
     */
    public String getCustomerService() {
        return this.customerService;
    }

    /**
     * @return deployArea
     */
    public String getDeployArea() {
        return this.deployArea;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ordTime
     */
    public String getOrdTime() {
        return this.ordTime;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return payTime
     */
    public String getPayTime() {
        return this.payTime;
    }

    /**
     * @return seoSite
     */
    public String getSeoSite() {
        return this.seoSite;
    }

    /**
     * @return siteVersion
     */
    public String getSiteVersion() {
        return this.siteVersion;
    }

    /**
     * @return siteVersionText
     */
    public String getSiteVersionText() {
        return this.siteVersionText;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return templateEtag
     */
    public String getTemplateEtag() {
        return this.templateEtag;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String applicationType; 
        private String applicationTypeText; 
        private String bizId; 
        private String commodityCode; 
        private String customerService; 
        private String deployArea; 
        private String instanceId; 
        private String ordTime; 
        private String orderId; 
        private String payTime; 
        private String seoSite; 
        private String siteVersion; 
        private String siteVersionText; 
        private String source; 
        private String templateEtag; 
        private String templateId; 

        private Builder() {
        } 

        private Builder(AppInstanceProfile model) {
            this.applicationType = model.applicationType;
            this.applicationTypeText = model.applicationTypeText;
            this.bizId = model.bizId;
            this.commodityCode = model.commodityCode;
            this.customerService = model.customerService;
            this.deployArea = model.deployArea;
            this.instanceId = model.instanceId;
            this.ordTime = model.ordTime;
            this.orderId = model.orderId;
            this.payTime = model.payTime;
            this.seoSite = model.seoSite;
            this.siteVersion = model.siteVersion;
            this.siteVersionText = model.siteVersionText;
            this.source = model.source;
            this.templateEtag = model.templateEtag;
            this.templateId = model.templateId;
        } 

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /**
         * ApplicationTypeText.
         */
        public Builder applicationTypeText(String applicationTypeText) {
            this.applicationTypeText = applicationTypeText;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * CustomerService.
         */
        public Builder customerService(String customerService) {
            this.customerService = customerService;
            return this;
        }

        /**
         * DeployArea.
         */
        public Builder deployArea(String deployArea) {
            this.deployArea = deployArea;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OrdTime.
         */
        public Builder ordTime(String ordTime) {
            this.ordTime = ordTime;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PayTime.
         */
        public Builder payTime(String payTime) {
            this.payTime = payTime;
            return this;
        }

        /**
         * SeoSite.
         */
        public Builder seoSite(String seoSite) {
            this.seoSite = seoSite;
            return this;
        }

        /**
         * SiteVersion.
         */
        public Builder siteVersion(String siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * SiteVersionText.
         */
        public Builder siteVersionText(String siteVersionText) {
            this.siteVersionText = siteVersionText;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * TemplateEtag.
         */
        public Builder templateEtag(String templateEtag) {
            this.templateEtag = templateEtag;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public AppInstanceProfile build() {
            return new AppInstanceProfile(this);
        } 

    } 

}
