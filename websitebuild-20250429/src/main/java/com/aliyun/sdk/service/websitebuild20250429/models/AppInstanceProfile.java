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

    @com.aliyun.core.annotation.NameInMap("CaseAuditStatus")
    private String caseAuditStatus;

    @com.aliyun.core.annotation.NameInMap("CaseShelfStatus")
    private String caseShelfStatus;

    @com.aliyun.core.annotation.NameInMap("ChatbiTaskId")
    private String chatbiTaskId;

    @com.aliyun.core.annotation.NameInMap("ChatbiTaskStatus")
    private String chatbiTaskStatus;

    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("CustomerService")
    private String customerService;

    @com.aliyun.core.annotation.NameInMap("DeployArea")
    private String deployArea;

    @com.aliyun.core.annotation.NameInMap("IcpbaNo")
    private String icpbaNo;

    @com.aliyun.core.annotation.NameInMap("IndependentDeployment")
    private IndependentDeployment independentDeployment;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("OpenChatBi")
    private Boolean openChatBi;

    @com.aliyun.core.annotation.NameInMap("OrdTime")
    private String ordTime;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("PayTime")
    private String payTime;

    @com.aliyun.core.annotation.NameInMap("PreviewUrl")
    private String previewUrl;

    @com.aliyun.core.annotation.NameInMap("SeoSite")
    private String seoSite;

    @com.aliyun.core.annotation.NameInMap("ShareRenderWatermark")
    private String shareRenderWatermark;

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

    @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
    private String upgradeStatus;

    private AppInstanceProfile(Builder builder) {
        this.applicationType = builder.applicationType;
        this.applicationTypeText = builder.applicationTypeText;
        this.bizId = builder.bizId;
        this.caseAuditStatus = builder.caseAuditStatus;
        this.caseShelfStatus = builder.caseShelfStatus;
        this.chatbiTaskId = builder.chatbiTaskId;
        this.chatbiTaskStatus = builder.chatbiTaskStatus;
        this.commodityCode = builder.commodityCode;
        this.customerService = builder.customerService;
        this.deployArea = builder.deployArea;
        this.icpbaNo = builder.icpbaNo;
        this.independentDeployment = builder.independentDeployment;
        this.instanceId = builder.instanceId;
        this.openChatBi = builder.openChatBi;
        this.ordTime = builder.ordTime;
        this.orderId = builder.orderId;
        this.payTime = builder.payTime;
        this.previewUrl = builder.previewUrl;
        this.seoSite = builder.seoSite;
        this.shareRenderWatermark = builder.shareRenderWatermark;
        this.siteVersion = builder.siteVersion;
        this.siteVersionText = builder.siteVersionText;
        this.source = builder.source;
        this.templateEtag = builder.templateEtag;
        this.templateId = builder.templateId;
        this.upgradeStatus = builder.upgradeStatus;
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
     * @return caseAuditStatus
     */
    public String getCaseAuditStatus() {
        return this.caseAuditStatus;
    }

    /**
     * @return caseShelfStatus
     */
    public String getCaseShelfStatus() {
        return this.caseShelfStatus;
    }

    /**
     * @return chatbiTaskId
     */
    public String getChatbiTaskId() {
        return this.chatbiTaskId;
    }

    /**
     * @return chatbiTaskStatus
     */
    public String getChatbiTaskStatus() {
        return this.chatbiTaskStatus;
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
     * @return icpbaNo
     */
    public String getIcpbaNo() {
        return this.icpbaNo;
    }

    /**
     * @return independentDeployment
     */
    public IndependentDeployment getIndependentDeployment() {
        return this.independentDeployment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return openChatBi
     */
    public Boolean getOpenChatBi() {
        return this.openChatBi;
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
     * @return previewUrl
     */
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    /**
     * @return seoSite
     */
    public String getSeoSite() {
        return this.seoSite;
    }

    /**
     * @return shareRenderWatermark
     */
    public String getShareRenderWatermark() {
        return this.shareRenderWatermark;
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

    /**
     * @return upgradeStatus
     */
    public String getUpgradeStatus() {
        return this.upgradeStatus;
    }

    public static final class Builder {
        private String applicationType; 
        private String applicationTypeText; 
        private String bizId; 
        private String caseAuditStatus; 
        private String caseShelfStatus; 
        private String chatbiTaskId; 
        private String chatbiTaskStatus; 
        private String commodityCode; 
        private String customerService; 
        private String deployArea; 
        private String icpbaNo; 
        private IndependentDeployment independentDeployment; 
        private String instanceId; 
        private Boolean openChatBi; 
        private String ordTime; 
        private String orderId; 
        private String payTime; 
        private String previewUrl; 
        private String seoSite; 
        private String shareRenderWatermark; 
        private String siteVersion; 
        private String siteVersionText; 
        private String source; 
        private String templateEtag; 
        private String templateId; 
        private String upgradeStatus; 

        private Builder() {
        } 

        private Builder(AppInstanceProfile model) {
            this.applicationType = model.applicationType;
            this.applicationTypeText = model.applicationTypeText;
            this.bizId = model.bizId;
            this.caseAuditStatus = model.caseAuditStatus;
            this.caseShelfStatus = model.caseShelfStatus;
            this.chatbiTaskId = model.chatbiTaskId;
            this.chatbiTaskStatus = model.chatbiTaskStatus;
            this.commodityCode = model.commodityCode;
            this.customerService = model.customerService;
            this.deployArea = model.deployArea;
            this.icpbaNo = model.icpbaNo;
            this.independentDeployment = model.independentDeployment;
            this.instanceId = model.instanceId;
            this.openChatBi = model.openChatBi;
            this.ordTime = model.ordTime;
            this.orderId = model.orderId;
            this.payTime = model.payTime;
            this.previewUrl = model.previewUrl;
            this.seoSite = model.seoSite;
            this.shareRenderWatermark = model.shareRenderWatermark;
            this.siteVersion = model.siteVersion;
            this.siteVersionText = model.siteVersionText;
            this.source = model.source;
            this.templateEtag = model.templateEtag;
            this.templateId = model.templateId;
            this.upgradeStatus = model.upgradeStatus;
        } 

        /**
         * <p>The application type code. For example, PC_WebSite indicates a PC website.</p>
         * 
         * <strong>example:</strong>
         * <p>PC_WebSite</p>
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>The display name of the application type.</p>
         * 
         * <strong>example:</strong>
         * <p>PC Website</p>
         */
        public Builder applicationTypeText(String applicationTypeText) {
            this.applicationTypeText = applicationTypeText;
            return this;
        }

        /**
         * <p>The business identifier of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WS_SITE_1</p>
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The audit status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder caseAuditStatus(String caseAuditStatus) {
            this.caseAuditStatus = caseAuditStatus;
            return this;
        }

        /**
         * <p>The listing status.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder caseShelfStatus(String caseShelfStatus) {
            this.caseShelfStatus = caseShelfStatus;
            return this;
        }

        /**
         * <p>The ID of the ChatBI BuildSchemaIndex asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-1</p>
         */
        public Builder chatbiTaskId(String chatbiTaskId) {
            this.chatbiTaskId = chatbiTaskId;
            return this;
        }

        /**
         * <p>The status of the ChatBI BuildSchemaIndex task. Valid values: running, finish, and failed.</p>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        public Builder chatbiTaskStatus(String chatbiTaskStatus) {
            this.chatbiTaskStatus = chatbiTaskStatus;
            return this;
        }

        /**
         * <p>The commodity code used when placing the order.</p>
         * 
         * <strong>example:</strong>
         * <p>domain_website_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The customer service contact information or description.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:support@example.com">support@example.com</a></p>
         */
        public Builder customerService(String customerService) {
            this.customerService = customerService;
            return this;
        }

        /**
         * <p>The deployment region code of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>HongKong</p>
         */
        public Builder deployArea(String deployArea) {
            this.deployArea = deployArea;
            return this;
        }

        /**
         * <p>The ICP filing number bound to the custom domain name. Multiple filing numbers are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>京ICP备12345678号-1</p>
         */
        public Builder icpbaNo(String icpbaNo) {
            this.icpbaNo = icpbaNo;
            return this;
        }

        /**
         * <p>The dedicated server information. This field is computed in real time by DescribeAppInstance and is not populated in list API responses.</p>
         */
        public Builder independentDeployment(IndependentDeployment independentDeployment) {
            this.independentDeployment = independentDeployment;
            return this;
        }

        /**
         * <p>The ID of the associated Lingxiao instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lx-1</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether the current user is included in the ChatBI feature canary release whitelist.</p>
         */
        public Builder openChatBi(Boolean openChatBi) {
            this.openChatBi = openChatBi;
            return this;
        }

        /**
         * <p>The time when the order was placed, in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17 10:30:00</p>
         */
        public Builder ordTime(String ordTime) {
            this.ordTime = ordTime;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>order-1</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The time when the payment was made, in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17 10:35:00</p>
         */
        public Builder payTime(String payTime) {
            this.payTime = payTime;
            return this;
        }

        /**
         * <p>The URL used to access the application preview page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/preview">https://example.com/preview</a></p>
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
         * <p>The SEO site configuration identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>seo-site-1</p>
         */
        public Builder seoSite(String seoSite) {
            this.seoSite = seoSite;
            return this;
        }

        /**
         * <p>The switch for the share rendering watermark. A value of 1 indicates enabled, and a value of 0 indicates disabled. This field is empty if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder shareRenderWatermark(String shareRenderWatermark) {
            this.shareRenderWatermark = shareRenderWatermark;
            return this;
        }

        /**
         * <p>The site version code.</p>
         * 
         * <strong>example:</strong>
         * <p>Max_Edition</p>
         */
        public Builder siteVersion(String siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>The display name of the site version, including the deployment region.</p>
         * 
         * <strong>example:</strong>
         * <p>Flagship Edition [Hong Kong]</p>
         */
        public Builder siteVersionText(String siteVersionText) {
            this.siteVersionText = siteVersionText;
            return this;
        }

        /**
         * <p>The identifier of the creation or synchronization source.</p>
         * 
         * <strong>example:</strong>
         * <p>MARKET_CLOUD_DREAM</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The ETag identifier of the current application template.</p>
         * 
         * <strong>example:</strong>
         * <p>etag-1</p>
         */
        public Builder templateEtag(String templateEtag) {
            this.templateEtag = templateEtag;
            return this;
        }

        /**
         * <p>The template ID used by the current application.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-1</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * UpgradeStatus.
         */
        public Builder upgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }

        public AppInstanceProfile build() {
            return new AppInstanceProfile(this);
        } 

    } 

    /**
     * 
     * {@link AppInstanceProfile} extends {@link TeaModel}
     *
     * <p>AppInstanceProfile</p>
     */
    public static class IndependentDeployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanRetry")
        private Boolean canRetry;

        @com.aliyun.core.annotation.NameInMap("DeployArea")
        private String deployArea;

        @com.aliyun.core.annotation.NameInMap("DnsRecordType")
        private String dnsRecordType;

        @com.aliyun.core.annotation.NameInMap("Eligibility")
        private String eligibility;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("IndependentIp")
        private String independentIp;

        @com.aliyun.core.annotation.NameInMap("ServerSpec")
        private String serverSpec;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private IndependentDeployment(Builder builder) {
            this.canRetry = builder.canRetry;
            this.deployArea = builder.deployArea;
            this.dnsRecordType = builder.dnsRecordType;
            this.eligibility = builder.eligibility;
            this.enableStatus = builder.enableStatus;
            this.independentIp = builder.independentIp;
            this.serverSpec = builder.serverSpec;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndependentDeployment create() {
            return builder().build();
        }

        /**
         * @return canRetry
         */
        public Boolean getCanRetry() {
            return this.canRetry;
        }

        /**
         * @return deployArea
         */
        public String getDeployArea() {
            return this.deployArea;
        }

        /**
         * @return dnsRecordType
         */
        public String getDnsRecordType() {
            return this.dnsRecordType;
        }

        /**
         * @return eligibility
         */
        public String getEligibility() {
            return this.eligibility;
        }

        /**
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return independentIp
         */
        public String getIndependentIp() {
            return this.independentIp;
        }

        /**
         * @return serverSpec
         */
        public String getServerSpec() {
            return this.serverSpec;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Boolean canRetry; 
            private String deployArea; 
            private String dnsRecordType; 
            private String eligibility; 
            private String enableStatus; 
            private String independentIp; 
            private String serverSpec; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(IndependentDeployment model) {
                this.canRetry = model.canRetry;
                this.deployArea = model.deployArea;
                this.dnsRecordType = model.dnsRecordType;
                this.eligibility = model.eligibility;
                this.enableStatus = model.enableStatus;
                this.independentIp = model.independentIp;
                this.serverSpec = model.serverSpec;
                this.taskId = model.taskId;
            } 

            /**
             * <p>Specifies whether a retry is allowed after the dedicated server fails to start.</p>
             */
            public Builder canRetry(Boolean canRetry) {
                this.canRetry = canRetry;
                return this;
            }

            /**
             * <p>The deployment region code of the dedicated server.</p>
             * 
             * <strong>example:</strong>
             * <p>HongKong</p>
             */
            public Builder deployArea(String deployArea) {
                this.deployArea = deployArea;
                return this;
            }

            /**
             * <p>The DNS record type used when binding a domain name to the dedicated IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder dnsRecordType(String dnsRecordType) {
                this.dnsRecordType = dnsRecordType;
                return this;
            }

            /**
             * <p>The eligibility status of the dedicated server. Valid values:</p>
             * <ul>
             * <li>UPGRADE_REQUIRED: A version upgrade is required.</li>
             * <li>AVAILABLE: The dedicated server can be started.</li>
             * <li>UNAVAILABLE: The dedicated server is currently unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder eligibility(String eligibility) {
                this.eligibility = eligibility;
                return this;
            }

            /**
             * <p>The status of the dedicated server. Valid values:</p>
             * <ul>
             * <li>NOT_ENABLED: Not started.</li>
             * <li>ENABLING: Starting.</li>
             * <li>ACTIVE: Started.</li>
             * <li>FAILED: Failed to start.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>The dedicated IP address assigned after the dedicated server is started.</p>
             * 
             * <strong>example:</strong>
             * <p>203.0.113.10</p>
             */
            public Builder independentIp(String independentIp) {
                this.independentIp = independentIp;
                return this;
            }

            /**
             * <p>The display specification of the dedicated server. This does not represent the real-time resource usage of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>2 vCPUs 2 GB</p>
             */
            public Builder serverSpec(String serverSpec) {
                this.serverSpec = serverSpec;
                return this;
            }

            /**
             * <p>The task ID for starting the dedicated server.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public IndependentDeployment build() {
                return new IndependentDeployment(this);
            } 

        } 

    }
}
