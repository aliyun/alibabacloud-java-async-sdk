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
 * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppInstanceForPartnerResponseBody</p>
 */
public class GetAppInstanceForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private GetAppInstanceForPartnerResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppInstanceForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(GetAppInstanceForPartnerResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetAppInstanceForPartnerResponseBody build() {
            return new GetAppInstanceForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class AiStaffList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StaffId")
        private String staffId;

        @com.aliyun.core.annotation.NameInMap("StaffName")
        private String staffName;

        @com.aliyun.core.annotation.NameInMap("StaffType")
        private String staffType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AiStaffList(Builder builder) {
            this.staffId = builder.staffId;
            this.staffName = builder.staffName;
            this.staffType = builder.staffType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiStaffList create() {
            return builder().build();
        }

        /**
         * @return staffId
         */
        public String getStaffId() {
            return this.staffId;
        }

        /**
         * @return staffName
         */
        public String getStaffName() {
            return this.staffName;
        }

        /**
         * @return staffType
         */
        public String getStaffType() {
            return this.staffType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String staffId; 
            private String staffName; 
            private String staffType; 
            private String status; 

            private Builder() {
            } 

            private Builder(AiStaffList model) {
                this.staffId = model.staffId;
                this.staffName = model.staffName;
                this.staffType = model.staffType;
                this.status = model.status;
            } 

            /**
             * StaffId.
             */
            public Builder staffId(String staffId) {
                this.staffId = staffId;
                return this;
            }

            /**
             * StaffName.
             */
            public Builder staffName(String staffName) {
                this.staffName = staffName;
                return this;
            }

            /**
             * StaffType.
             */
            public Builder staffType(String staffType) {
                this.staffType = staffType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AiStaffList build() {
                return new AiStaffList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class AppDesignSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bilingual")
        private Boolean bilingual;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("BusinessScope")
        private String businessScope;

        @com.aliyun.core.annotation.NameInMap("ColorStyle")
        private String colorStyle;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("DeployArea")
        private String deployArea;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MainBusiness")
        private String mainBusiness;

        @com.aliyun.core.annotation.NameInMap("ReferenceWebsite")
        private String referenceWebsite;

        @com.aliyun.core.annotation.NameInMap("SiteGoals")
        private String siteGoals;

        @com.aliyun.core.annotation.NameInMap("SiteLanguage")
        private String siteLanguage;

        @com.aliyun.core.annotation.NameInMap("SiteLogo")
        private String siteLogo;

        @com.aliyun.core.annotation.NameInMap("SiteSlogan")
        private String siteSlogan;

        @com.aliyun.core.annotation.NameInMap("SiteStyle")
        private String siteStyle;

        @com.aliyun.core.annotation.NameInMap("SiteTitle")
        private String siteTitle;

        @com.aliyun.core.annotation.NameInMap("SiteType")
        private String siteType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AppDesignSpec(Builder builder) {
            this.bilingual = builder.bilingual;
            this.bizId = builder.bizId;
            this.businessScope = builder.businessScope;
            this.colorStyle = builder.colorStyle;
            this.companyName = builder.companyName;
            this.deployArea = builder.deployArea;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mainBusiness = builder.mainBusiness;
            this.referenceWebsite = builder.referenceWebsite;
            this.siteGoals = builder.siteGoals;
            this.siteLanguage = builder.siteLanguage;
            this.siteLogo = builder.siteLogo;
            this.siteSlogan = builder.siteSlogan;
            this.siteStyle = builder.siteStyle;
            this.siteTitle = builder.siteTitle;
            this.siteType = builder.siteType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppDesignSpec create() {
            return builder().build();
        }

        /**
         * @return bilingual
         */
        public Boolean getBilingual() {
            return this.bilingual;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return businessScope
         */
        public String getBusinessScope() {
            return this.businessScope;
        }

        /**
         * @return colorStyle
         */
        public String getColorStyle() {
            return this.colorStyle;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return deployArea
         */
        public String getDeployArea() {
            return this.deployArea;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mainBusiness
         */
        public String getMainBusiness() {
            return this.mainBusiness;
        }

        /**
         * @return referenceWebsite
         */
        public String getReferenceWebsite() {
            return this.referenceWebsite;
        }

        /**
         * @return siteGoals
         */
        public String getSiteGoals() {
            return this.siteGoals;
        }

        /**
         * @return siteLanguage
         */
        public String getSiteLanguage() {
            return this.siteLanguage;
        }

        /**
         * @return siteLogo
         */
        public String getSiteLogo() {
            return this.siteLogo;
        }

        /**
         * @return siteSlogan
         */
        public String getSiteSlogan() {
            return this.siteSlogan;
        }

        /**
         * @return siteStyle
         */
        public String getSiteStyle() {
            return this.siteStyle;
        }

        /**
         * @return siteTitle
         */
        public String getSiteTitle() {
            return this.siteTitle;
        }

        /**
         * @return siteType
         */
        public String getSiteType() {
            return this.siteType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean bilingual; 
            private String bizId; 
            private String businessScope; 
            private String colorStyle; 
            private String companyName; 
            private String deployArea; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String mainBusiness; 
            private String referenceWebsite; 
            private String siteGoals; 
            private String siteLanguage; 
            private String siteLogo; 
            private String siteSlogan; 
            private String siteStyle; 
            private String siteTitle; 
            private String siteType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AppDesignSpec model) {
                this.bilingual = model.bilingual;
                this.bizId = model.bizId;
                this.businessScope = model.businessScope;
                this.colorStyle = model.colorStyle;
                this.companyName = model.companyName;
                this.deployArea = model.deployArea;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mainBusiness = model.mainBusiness;
                this.referenceWebsite = model.referenceWebsite;
                this.siteGoals = model.siteGoals;
                this.siteLanguage = model.siteLanguage;
                this.siteLogo = model.siteLogo;
                this.siteSlogan = model.siteSlogan;
                this.siteStyle = model.siteStyle;
                this.siteTitle = model.siteTitle;
                this.siteType = model.siteType;
                this.userId = model.userId;
            } 

            /**
             * <p>bill</p>
             * 
             * <strong>example:</strong>
             * <p>bilingual</p>
             */
            public Builder bilingual(Boolean bilingual) {
                this.bilingual = bilingual;
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
             * <p>busincessScope</p>
             * 
             * <strong>example:</strong>
             * <p>scopre</p>
             */
            public Builder businessScope(String businessScope) {
                this.businessScope = businessScope;
                return this;
            }

            /**
             * ColorStyle.
             */
            public Builder colorStyle(String colorStyle) {
                this.colorStyle = colorStyle;
                return this;
            }

            /**
             * CompanyName.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>business</p>
             * 
             * <strong>example:</strong>
             * <p>business</p>
             */
            public Builder mainBusiness(String mainBusiness) {
                this.mainBusiness = mainBusiness;
                return this;
            }

            /**
             * <p>website</p>
             * 
             * <strong>example:</strong>
             * <p>website</p>
             */
            public Builder referenceWebsite(String referenceWebsite) {
                this.referenceWebsite = referenceWebsite;
                return this;
            }

            /**
             * <p>sitegolas</p>
             * 
             * <strong>example:</strong>
             * <p>goals</p>
             */
            public Builder siteGoals(String siteGoals) {
                this.siteGoals = siteGoals;
                return this;
            }

            /**
             * <p>language</p>
             * 
             * <strong>example:</strong>
             * <p>sitelanguage</p>
             */
            public Builder siteLanguage(String siteLanguage) {
                this.siteLanguage = siteLanguage;
                return this;
            }

            /**
             * <p>sitelogo</p>
             * 
             * <strong>example:</strong>
             * <p>logo</p>
             */
            public Builder siteLogo(String siteLogo) {
                this.siteLogo = siteLogo;
                return this;
            }

            /**
             * <p>siteslogan</p>
             * 
             * <strong>example:</strong>
             * <p>slogan</p>
             */
            public Builder siteSlogan(String siteSlogan) {
                this.siteSlogan = siteSlogan;
                return this;
            }

            /**
             * <p>sitestyle</p>
             * 
             * <strong>example:</strong>
             * <p>style</p>
             */
            public Builder siteStyle(String siteStyle) {
                this.siteStyle = siteStyle;
                return this;
            }

            /**
             * <p>sitetitle</p>
             * 
             * <strong>example:</strong>
             * <p>title</p>
             */
            public Builder siteTitle(String siteTitle) {
                this.siteTitle = siteTitle;
                return this;
            }

            /**
             * SiteType.
             */
            public Builder siteType(String siteType) {
                this.siteType = siteType;
                return this;
            }

            /**
             * <p>userid</p>
             * 
             * <strong>example:</strong>
             * <p>userid</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AppDesignSpec build() {
                return new AppDesignSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionKey")
        private String actionKey;

        @com.aliyun.core.annotation.NameInMap("ActionText")
        private String actionText;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Href")
        private String href;

        private Actions(Builder builder) {
            this.actionKey = builder.actionKey;
            this.actionText = builder.actionText;
            this.enable = builder.enable;
            this.href = builder.href;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return actionKey
         */
        public String getActionKey() {
            return this.actionKey;
        }

        /**
         * @return actionText
         */
        public String getActionText() {
            return this.actionText;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return href
         */
        public String getHref() {
            return this.href;
        }

        public static final class Builder {
            private String actionKey; 
            private String actionText; 
            private Boolean enable; 
            private String href; 

            private Builder() {
            } 

            private Builder(Actions model) {
                this.actionKey = model.actionKey;
                this.actionText = model.actionText;
                this.enable = model.enable;
                this.href = model.href;
            } 

            /**
             * ActionKey.
             */
            public Builder actionKey(String actionKey) {
                this.actionKey = actionKey;
                return this;
            }

            /**
             * ActionText.
             */
            public Builder actionText(String actionText) {
                this.actionText = actionText;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Href.
             */
            public Builder href(String href) {
                this.href = href;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class DashboardActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionKey")
        private String actionKey;

        @com.aliyun.core.annotation.NameInMap("ActionText")
        private String actionText;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Href")
        private String href;

        private DashboardActions(Builder builder) {
            this.actionKey = builder.actionKey;
            this.actionText = builder.actionText;
            this.enable = builder.enable;
            this.href = builder.href;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashboardActions create() {
            return builder().build();
        }

        /**
         * @return actionKey
         */
        public String getActionKey() {
            return this.actionKey;
        }

        /**
         * @return actionText
         */
        public String getActionText() {
            return this.actionText;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return href
         */
        public String getHref() {
            return this.href;
        }

        public static final class Builder {
            private String actionKey; 
            private String actionText; 
            private Boolean enable; 
            private String href; 

            private Builder() {
            } 

            private Builder(DashboardActions model) {
                this.actionKey = model.actionKey;
                this.actionText = model.actionText;
                this.enable = model.enable;
                this.href = model.href;
            } 

            /**
             * ActionKey.
             */
            public Builder actionKey(String actionKey) {
                this.actionKey = actionKey;
                return this;
            }

            /**
             * ActionText.
             */
            public Builder actionText(String actionText) {
                this.actionText = actionText;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Href.
             */
            public Builder href(String href) {
                this.href = href;
                return this;
            }

            public DashboardActions build() {
                return new DashboardActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class AppOperationAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List<Actions> actions;

        @com.aliyun.core.annotation.NameInMap("AiCustomerConfigUrl")
        private String aiCustomerConfigUrl;

        @com.aliyun.core.annotation.NameInMap("AiDesignUrl")
        private String aiDesignUrl;

        @com.aliyun.core.annotation.NameInMap("AppPublishUrl")
        private String appPublishUrl;

        @com.aliyun.core.annotation.NameInMap("DashboardActions")
        private java.util.List<DashboardActions> dashboardActions;

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

        /**
         * @return actions
         */
        public java.util.List<Actions> getActions() {
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
        public java.util.List<DashboardActions> getDashboardActions() {
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
            private java.util.List<Actions> actions; 
            private String aiCustomerConfigUrl; 
            private String aiDesignUrl; 
            private String appPublishUrl; 
            private java.util.List<DashboardActions> dashboardActions; 
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
            public Builder actions(java.util.List<Actions> actions) {
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
            public Builder dashboardActions(java.util.List<DashboardActions> dashboardActions) {
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
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QrCode")
        private String qrCode;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Group(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.qrCode = builder.qrCode;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return qrCode
         */
        public String getQrCode() {
            return this.qrCode;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String qrCode; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Group model) {
                this.id = model.id;
                this.name = model.name;
                this.qrCode = model.qrCode;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>QrCode</p>
             * 
             * <strong>example:</strong>
             * <p>qrcode</p>
             */
            public Builder qrCode(String qrCode) {
                this.qrCode = qrCode;
                return this;
            }

            /**
             * <p>dingtalk wx...</p>
             * 
             * <strong>example:</strong>
             * <p>hive</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class NodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<?> children;

        @com.aliyun.core.annotation.NameInMap("FinalStepNo")
        private Integer finalStepNo;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("IsContainerNode")
        private Boolean isContainerNode;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("OperatorRole")
        private String operatorRole;

        @com.aliyun.core.annotation.NameInMap("ParentNodeId")
        private String parentNodeId;

        @com.aliyun.core.annotation.NameInMap("StepNo")
        private Integer stepNo;

        private NodeList(Builder builder) {
            this.children = builder.children;
            this.finalStepNo = builder.finalStepNo;
            this.finishTime = builder.finishTime;
            this.isContainerNode = builder.isContainerNode;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeStatus = builder.nodeStatus;
            this.operatorRole = builder.operatorRole;
            this.parentNodeId = builder.parentNodeId;
            this.stepNo = builder.stepNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeList create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<?> getChildren() {
            return this.children;
        }

        /**
         * @return finalStepNo
         */
        public Integer getFinalStepNo() {
            return this.finalStepNo;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return isContainerNode
         */
        public Boolean getIsContainerNode() {
            return this.isContainerNode;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return operatorRole
         */
        public String getOperatorRole() {
            return this.operatorRole;
        }

        /**
         * @return parentNodeId
         */
        public String getParentNodeId() {
            return this.parentNodeId;
        }

        /**
         * @return stepNo
         */
        public Integer getStepNo() {
            return this.stepNo;
        }

        public static final class Builder {
            private java.util.List<?> children; 
            private Integer finalStepNo; 
            private Long finishTime; 
            private Boolean isContainerNode; 
            private String nodeId; 
            private String nodeName; 
            private String nodeStatus; 
            private String operatorRole; 
            private String parentNodeId; 
            private Integer stepNo; 

            private Builder() {
            } 

            private Builder(NodeList model) {
                this.children = model.children;
                this.finalStepNo = model.finalStepNo;
                this.finishTime = model.finishTime;
                this.isContainerNode = model.isContainerNode;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeStatus = model.nodeStatus;
                this.operatorRole = model.operatorRole;
                this.parentNodeId = model.parentNodeId;
                this.stepNo = model.stepNo;
            } 

            /**
             * Children.
             */
            public Builder children(java.util.List<?> children) {
                this.children = children;
                return this;
            }

            /**
             * FinalStepNo.
             */
            public Builder finalStepNo(Integer finalStepNo) {
                this.finalStepNo = finalStepNo;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>IsContainerNode</p>
             * 
             * <strong>example:</strong>
             * <p>IsContainerNode</p>
             */
            public Builder isContainerNode(Boolean isContainerNode) {
                this.isContainerNode = isContainerNode;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * OperatorRole.
             */
            public Builder operatorRole(String operatorRole) {
                this.operatorRole = operatorRole;
                return this;
            }

            /**
             * ParentNodeId.
             */
            public Builder parentNodeId(String parentNodeId) {
                this.parentNodeId = parentNodeId;
                return this;
            }

            /**
             * StepNo.
             */
            public Builder stepNo(Integer stepNo) {
                this.stepNo = stepNo;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class OperationAddressActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionKey")
        private String actionKey;

        @com.aliyun.core.annotation.NameInMap("ActionText")
        private String actionText;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Href")
        private String href;

        private OperationAddressActions(Builder builder) {
            this.actionKey = builder.actionKey;
            this.actionText = builder.actionText;
            this.enable = builder.enable;
            this.href = builder.href;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationAddressActions create() {
            return builder().build();
        }

        /**
         * @return actionKey
         */
        public String getActionKey() {
            return this.actionKey;
        }

        /**
         * @return actionText
         */
        public String getActionText() {
            return this.actionText;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return href
         */
        public String getHref() {
            return this.href;
        }

        public static final class Builder {
            private String actionKey; 
            private String actionText; 
            private Boolean enable; 
            private String href; 

            private Builder() {
            } 

            private Builder(OperationAddressActions model) {
                this.actionKey = model.actionKey;
                this.actionText = model.actionText;
                this.enable = model.enable;
                this.href = model.href;
            } 

            /**
             * ActionKey.
             */
            public Builder actionKey(String actionKey) {
                this.actionKey = actionKey;
                return this;
            }

            /**
             * ActionText.
             */
            public Builder actionText(String actionText) {
                this.actionText = actionText;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Href.
             */
            public Builder href(String href) {
                this.href = href;
                return this;
            }

            public OperationAddressActions build() {
                return new OperationAddressActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class OperationAddressDashboardActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionKey")
        private String actionKey;

        @com.aliyun.core.annotation.NameInMap("ActionText")
        private String actionText;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Href")
        private String href;

        private OperationAddressDashboardActions(Builder builder) {
            this.actionKey = builder.actionKey;
            this.actionText = builder.actionText;
            this.enable = builder.enable;
            this.href = builder.href;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationAddressDashboardActions create() {
            return builder().build();
        }

        /**
         * @return actionKey
         */
        public String getActionKey() {
            return this.actionKey;
        }

        /**
         * @return actionText
         */
        public String getActionText() {
            return this.actionText;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return href
         */
        public String getHref() {
            return this.href;
        }

        public static final class Builder {
            private String actionKey; 
            private String actionText; 
            private Boolean enable; 
            private String href; 

            private Builder() {
            } 

            private Builder(OperationAddressDashboardActions model) {
                this.actionKey = model.actionKey;
                this.actionText = model.actionText;
                this.enable = model.enable;
                this.href = model.href;
            } 

            /**
             * ActionKey.
             */
            public Builder actionKey(String actionKey) {
                this.actionKey = actionKey;
                return this;
            }

            /**
             * ActionText.
             */
            public Builder actionText(String actionText) {
                this.actionText = actionText;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Href.
             */
            public Builder href(String href) {
                this.href = href;
                return this;
            }

            public OperationAddressDashboardActions build() {
                return new OperationAddressDashboardActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class OperationAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List<OperationAddressActions> actions;

        @com.aliyun.core.annotation.NameInMap("AiCustomerConfigUrl")
        private String aiCustomerConfigUrl;

        @com.aliyun.core.annotation.NameInMap("AiDesignUrl")
        private String aiDesignUrl;

        @com.aliyun.core.annotation.NameInMap("AppPublishUrl")
        private String appPublishUrl;

        @com.aliyun.core.annotation.NameInMap("DashboardActions")
        private java.util.List<OperationAddressDashboardActions> dashboardActions;

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

        private OperationAddress(Builder builder) {
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

        public static OperationAddress create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<OperationAddressActions> getActions() {
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
        public java.util.List<OperationAddressDashboardActions> getDashboardActions() {
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
            private java.util.List<OperationAddressActions> actions; 
            private String aiCustomerConfigUrl; 
            private String aiDesignUrl; 
            private String appPublishUrl; 
            private java.util.List<OperationAddressDashboardActions> dashboardActions; 
            private String designUrl; 
            private String instanceLoginUrl; 
            private String renewBuyUrl; 
            private String serverDeliveryUrl; 
            private String upgradeBuyUrl; 

            private Builder() {
            } 

            private Builder(OperationAddress model) {
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
            public Builder actions(java.util.List<OperationAddressActions> actions) {
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
            public Builder dashboardActions(java.util.List<OperationAddressDashboardActions> dashboardActions) {
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

            public OperationAddress build() {
                return new OperationAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class Profile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("DesignType")
        private String designType;

        @com.aliyun.core.annotation.NameInMap("DesignTypeText")
        private String designTypeText;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LxInstanceId")
        private String lxInstanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("ServiceSpec")
        private String serviceSpec;

        @com.aliyun.core.annotation.NameInMap("ServiceSpecText")
        private String serviceSpecText;

        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private String upgradeStatus;

        private Profile(Builder builder) {
            this.bizId = builder.bizId;
            this.designType = builder.designType;
            this.designTypeText = builder.designTypeText;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lxInstanceId = builder.lxInstanceId;
            this.orderId = builder.orderId;
            this.serviceSpec = builder.serviceSpec;
            this.serviceSpecText = builder.serviceSpecText;
            this.upgradeStatus = builder.upgradeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profile create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return designType
         */
        public String getDesignType() {
            return this.designType;
        }

        /**
         * @return designTypeText
         */
        public String getDesignTypeText() {
            return this.designTypeText;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lxInstanceId
         */
        public String getLxInstanceId() {
            return this.lxInstanceId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return serviceSpec
         */
        public String getServiceSpec() {
            return this.serviceSpec;
        }

        /**
         * @return serviceSpecText
         */
        public String getServiceSpecText() {
            return this.serviceSpecText;
        }

        /**
         * @return upgradeStatus
         */
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public static final class Builder {
            private String bizId; 
            private String designType; 
            private String designTypeText; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String lxInstanceId; 
            private String orderId; 
            private String serviceSpec; 
            private String serviceSpecText; 
            private String upgradeStatus; 

            private Builder() {
            } 

            private Builder(Profile model) {
                this.bizId = model.bizId;
                this.designType = model.designType;
                this.designTypeText = model.designTypeText;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.lxInstanceId = model.lxInstanceId;
                this.orderId = model.orderId;
                this.serviceSpec = model.serviceSpec;
                this.serviceSpecText = model.serviceSpecText;
                this.upgradeStatus = model.upgradeStatus;
            } 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * DesignType.
             */
            public Builder designType(String designType) {
                this.designType = designType;
                return this;
            }

            /**
             * DesignTypeText.
             */
            public Builder designTypeText(String designTypeText) {
                this.designTypeText = designTypeText;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LxInstanceId.
             */
            public Builder lxInstanceId(String lxInstanceId) {
                this.lxInstanceId = lxInstanceId;
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
             * ServiceSpec.
             */
            public Builder serviceSpec(String serviceSpec) {
                this.serviceSpec = serviceSpec;
                return this;
            }

            /**
             * ServiceSpecText.
             */
            public Builder serviceSpecText(String serviceSpecText) {
                this.serviceSpecText = serviceSpecText;
                return this;
            }

            /**
             * UpgradeStatus.
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            public Profile build() {
                return new Profile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class AppServiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Integer deleted;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EspBizId")
        private String espBizId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Group")
        private Group group;

        @com.aliyun.core.annotation.NameInMap("InstanceBizId")
        private String instanceBizId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeList")
        private java.util.List<NodeList> nodeList;

        @com.aliyun.core.annotation.NameInMap("OperationAddress")
        private OperationAddress operationAddress;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private Profile profile;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("ServiceTypeText")
        private String serviceTypeText;

        @com.aliyun.core.annotation.NameInMap("Slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AppServiceList(Builder builder) {
            this.bizId = builder.bizId;
            this.deleted = builder.deleted;
            this.endTime = builder.endTime;
            this.espBizId = builder.espBizId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.group = builder.group;
            this.instanceBizId = builder.instanceBizId;
            this.name = builder.name;
            this.nodeList = builder.nodeList;
            this.operationAddress = builder.operationAddress;
            this.orderId = builder.orderId;
            this.profile = builder.profile;
            this.serviceType = builder.serviceType;
            this.serviceTypeText = builder.serviceTypeText;
            this.slug = builder.slug;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppServiceList create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return deleted
         */
        public Integer getDeleted() {
            return this.deleted;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return espBizId
         */
        public String getEspBizId() {
            return this.espBizId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return group
         */
        public Group getGroup() {
            return this.group;
        }

        /**
         * @return instanceBizId
         */
        public String getInstanceBizId() {
            return this.instanceBizId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeList
         */
        public java.util.List<NodeList> getNodeList() {
            return this.nodeList;
        }

        /**
         * @return operationAddress
         */
        public OperationAddress getOperationAddress() {
            return this.operationAddress;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return profile
         */
        public Profile getProfile() {
            return this.profile;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return serviceTypeText
         */
        public String getServiceTypeText() {
            return this.serviceTypeText;
        }

        /**
         * @return slug
         */
        public String getSlug() {
            return this.slug;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bizId; 
            private Integer deleted; 
            private String endTime; 
            private String espBizId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Group group; 
            private String instanceBizId; 
            private String name; 
            private java.util.List<NodeList> nodeList; 
            private OperationAddress operationAddress; 
            private String orderId; 
            private Profile profile; 
            private String serviceType; 
            private String serviceTypeText; 
            private String slug; 
            private String startTime; 
            private String status; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AppServiceList model) {
                this.bizId = model.bizId;
                this.deleted = model.deleted;
                this.endTime = model.endTime;
                this.espBizId = model.espBizId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.group = model.group;
                this.instanceBizId = model.instanceBizId;
                this.name = model.name;
                this.nodeList = model.nodeList;
                this.operationAddress = model.operationAddress;
                this.orderId = model.orderId;
                this.profile = model.profile;
                this.serviceType = model.serviceType;
                this.serviceTypeText = model.serviceTypeText;
                this.slug = model.slug;
                this.startTime = model.startTime;
                this.status = model.status;
                this.userId = model.userId;
            } 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
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
             * <p>esp bizId</p>
             * 
             * <strong>example:</strong>
             * <p>EspBizId</p>
             */
            public Builder espBizId(String espBizId) {
                this.espBizId = espBizId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(Group group) {
                this.group = group;
                return this;
            }

            /**
             * InstanceBizId.
             */
            public Builder instanceBizId(String instanceBizId) {
                this.instanceBizId = instanceBizId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeList.
             */
            public Builder nodeList(java.util.List<NodeList> nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            /**
             * OperationAddress.
             */
            public Builder operationAddress(OperationAddress operationAddress) {
                this.operationAddress = operationAddress;
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
             * Profile.
             */
            public Builder profile(Profile profile) {
                this.profile = profile;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * ServiceTypeText.
             */
            public Builder serviceTypeText(String serviceTypeText) {
                this.serviceTypeText = serviceTypeText;
                return this;
            }

            /**
             * Slug.
             */
            public Builder slug(String slug) {
                this.slug = slug;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>userid</p>
             * 
             * <strong>example:</strong>
             * <p>userid</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AppServiceList build() {
                return new AppServiceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class BindData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GrantAliyunPk")
        private String grantAliyunPk;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("ParentPk")
        private String parentPk;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("UserDisplayName")
        private String userDisplayName;

        private BindData(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.bizId = builder.bizId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.grantAliyunPk = builder.grantAliyunPk;
            this.mobile = builder.mobile;
            this.parentPk = builder.parentPk;
            this.partnerId = builder.partnerId;
            this.userDisplayName = builder.userDisplayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindData create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return grantAliyunPk
         */
        public String getGrantAliyunPk() {
            return this.grantAliyunPk;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return parentPk
         */
        public String getParentPk() {
            return this.parentPk;
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return userDisplayName
         */
        public String getUserDisplayName() {
            return this.userDisplayName;
        }

        public static final class Builder {
            private String aliyunPk; 
            private String bizId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String grantAliyunPk; 
            private String mobile; 
            private String parentPk; 
            private String partnerId; 
            private String userDisplayName; 

            private Builder() {
            } 

            private Builder(BindData model) {
                this.aliyunPk = model.aliyunPk;
                this.bizId = model.bizId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.grantAliyunPk = model.grantAliyunPk;
                this.mobile = model.mobile;
                this.parentPk = model.parentPk;
                this.partnerId = model.partnerId;
                this.userDisplayName = model.userDisplayName;
            } 

            /**
             * <p>aliyun_pk</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GrantAliyunPk.
             */
            public Builder grantAliyunPk(String grantAliyunPk) {
                this.grantAliyunPk = grantAliyunPk;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>parent_pk</p>
             * 
             * <strong>example:</strong>
             * <p>1123213</p>
             */
            public Builder parentPk(String parentPk) {
                this.parentPk = parentPk;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * UserDisplayName.
             */
            public Builder userDisplayName(String userDisplayName) {
                this.userDisplayName = userDisplayName;
                return this;
            }

            public BindData build() {
                return new BindData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class PartnerDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindData")
        private BindData bindData;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PartnerDetail(Builder builder) {
            this.bindData = builder.bindData;
            this.partnerId = builder.partnerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartnerDetail create() {
            return builder().build();
        }

        /**
         * @return bindData
         */
        public BindData getBindData() {
            return this.bindData;
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private BindData bindData; 
            private String partnerId; 
            private String status; 

            private Builder() {
            } 

            private Builder(PartnerDetail model) {
                this.bindData = model.bindData;
                this.partnerId = model.partnerId;
                this.status = model.status;
            } 

            /**
             * <p>data</p>
             */
            public Builder bindData(BindData bindData) {
                this.bindData = bindData;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PartnerDetail build() {
                return new PartnerDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class ModuleProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminUrl")
        private String adminUrl;

        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("ApplicationTypeText")
        private String applicationTypeText;

        @com.aliyun.core.annotation.NameInMap("BindCname")
        private String bindCname;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CustomerService")
        private String customerService;

        @com.aliyun.core.annotation.NameInMap("DeployArea")
        private String deployArea;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private String domainList;

        @com.aliyun.core.annotation.NameInMap("EditorUrl")
        private String editorUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IcpbaNo")
        private String icpbaNo;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private String imageList;

        @com.aliyun.core.annotation.NameInMap("LxInstanceId")
        private String lxInstanceId;

        @com.aliyun.core.annotation.NameInMap("OrdTime")
        private String ordTime;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderNum")
        private Integer orderNum;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("PayTime")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("PreviewUrl")
        private String previewUrl;

        @com.aliyun.core.annotation.NameInMap("SeoSite")
        private String seoSite;

        @com.aliyun.core.annotation.NameInMap("SiteLogo")
        private String siteLogo;

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

        @com.aliyun.core.annotation.NameInMap("TextList")
        private String textList;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private String upgradeStatus;

        private ModuleProfile(Builder builder) {
            this.adminUrl = builder.adminUrl;
            this.applicationType = builder.applicationType;
            this.applicationTypeText = builder.applicationTypeText;
            this.bindCname = builder.bindCname;
            this.bizId = builder.bizId;
            this.commodityCode = builder.commodityCode;
            this.customerService = builder.customerService;
            this.deployArea = builder.deployArea;
            this.domainList = builder.domainList;
            this.editorUrl = builder.editorUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.icpbaNo = builder.icpbaNo;
            this.imageList = builder.imageList;
            this.lxInstanceId = builder.lxInstanceId;
            this.ordTime = builder.ordTime;
            this.orderId = builder.orderId;
            this.orderNum = builder.orderNum;
            this.partnerId = builder.partnerId;
            this.payTime = builder.payTime;
            this.previewUrl = builder.previewUrl;
            this.seoSite = builder.seoSite;
            this.siteLogo = builder.siteLogo;
            this.siteVersion = builder.siteVersion;
            this.siteVersionText = builder.siteVersionText;
            this.source = builder.source;
            this.templateEtag = builder.templateEtag;
            this.templateId = builder.templateId;
            this.textList = builder.textList;
            this.thumbnail = builder.thumbnail;
            this.upgradeStatus = builder.upgradeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleProfile create() {
            return builder().build();
        }

        /**
         * @return adminUrl
         */
        public String getAdminUrl() {
            return this.adminUrl;
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
         * @return bindCname
         */
        public String getBindCname() {
            return this.bindCname;
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
         * @return domainList
         */
        public String getDomainList() {
            return this.domainList;
        }

        /**
         * @return editorUrl
         */
        public String getEditorUrl() {
            return this.editorUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return icpbaNo
         */
        public String getIcpbaNo() {
            return this.icpbaNo;
        }

        /**
         * @return imageList
         */
        public String getImageList() {
            return this.imageList;
        }

        /**
         * @return lxInstanceId
         */
        public String getLxInstanceId() {
            return this.lxInstanceId;
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
         * @return orderNum
         */
        public Integer getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
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
         * @return siteLogo
         */
        public String getSiteLogo() {
            return this.siteLogo;
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
         * @return textList
         */
        public String getTextList() {
            return this.textList;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return upgradeStatus
         */
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public static final class Builder {
            private String adminUrl; 
            private String applicationType; 
            private String applicationTypeText; 
            private String bindCname; 
            private String bizId; 
            private String commodityCode; 
            private String customerService; 
            private String deployArea; 
            private String domainList; 
            private String editorUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private String icpbaNo; 
            private String imageList; 
            private String lxInstanceId; 
            private String ordTime; 
            private String orderId; 
            private Integer orderNum; 
            private String partnerId; 
            private String payTime; 
            private String previewUrl; 
            private String seoSite; 
            private String siteLogo; 
            private String siteVersion; 
            private String siteVersionText; 
            private String source; 
            private String templateEtag; 
            private String templateId; 
            private String textList; 
            private String thumbnail; 
            private String upgradeStatus; 

            private Builder() {
            } 

            private Builder(ModuleProfile model) {
                this.adminUrl = model.adminUrl;
                this.applicationType = model.applicationType;
                this.applicationTypeText = model.applicationTypeText;
                this.bindCname = model.bindCname;
                this.bizId = model.bizId;
                this.commodityCode = model.commodityCode;
                this.customerService = model.customerService;
                this.deployArea = model.deployArea;
                this.domainList = model.domainList;
                this.editorUrl = model.editorUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.icpbaNo = model.icpbaNo;
                this.imageList = model.imageList;
                this.lxInstanceId = model.lxInstanceId;
                this.ordTime = model.ordTime;
                this.orderId = model.orderId;
                this.orderNum = model.orderNum;
                this.partnerId = model.partnerId;
                this.payTime = model.payTime;
                this.previewUrl = model.previewUrl;
                this.seoSite = model.seoSite;
                this.siteLogo = model.siteLogo;
                this.siteVersion = model.siteVersion;
                this.siteVersionText = model.siteVersionText;
                this.source = model.source;
                this.templateEtag = model.templateEtag;
                this.templateId = model.templateId;
                this.textList = model.textList;
                this.thumbnail = model.thumbnail;
                this.upgradeStatus = model.upgradeStatus;
            } 

            /**
             * AdminUrl.
             */
            public Builder adminUrl(String adminUrl) {
                this.adminUrl = adminUrl;
                return this;
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
             * BindCname.
             */
            public Builder bindCname(String bindCname) {
                this.bindCname = bindCname;
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
             * DomainList.
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * EditorUrl.
             */
            public Builder editorUrl(String editorUrl) {
                this.editorUrl = editorUrl;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IcpbaNo.
             */
            public Builder icpbaNo(String icpbaNo) {
                this.icpbaNo = icpbaNo;
                return this;
            }

            /**
             * ImageList.
             */
            public Builder imageList(String imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * LxInstanceId.
             */
            public Builder lxInstanceId(String lxInstanceId) {
                this.lxInstanceId = lxInstanceId;
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
             * OrderNum.
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
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
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
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
             * <p>sitelogo</p>
             * 
             * <strong>example:</strong>
             * <p>logo</p>
             */
            public Builder siteLogo(String siteLogo) {
                this.siteLogo = siteLogo;
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

            /**
             * TextList.
             */
            public Builder textList(String textList) {
                this.textList = textList;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * UpgradeStatus.
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            public ModuleProfile build() {
                return new ModuleProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class RelatedInstanceListProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminUrl")
        private String adminUrl;

        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("ApplicationTypeText")
        private String applicationTypeText;

        @com.aliyun.core.annotation.NameInMap("BindCname")
        private String bindCname;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CustomerService")
        private String customerService;

        @com.aliyun.core.annotation.NameInMap("DeployArea")
        private String deployArea;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private String domainList;

        @com.aliyun.core.annotation.NameInMap("EditorUrl")
        private String editorUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IcpbaNo")
        private String icpbaNo;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private String imageList;

        @com.aliyun.core.annotation.NameInMap("LxInstanceId")
        private String lxInstanceId;

        @com.aliyun.core.annotation.NameInMap("OrdTime")
        private String ordTime;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderNum")
        private Integer orderNum;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("PayTime")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("PreviewUrl")
        private String previewUrl;

        @com.aliyun.core.annotation.NameInMap("SeoSite")
        private String seoSite;

        @com.aliyun.core.annotation.NameInMap("SiteLogo")
        private String siteLogo;

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

        @com.aliyun.core.annotation.NameInMap("TextList")
        private String textList;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private String upgradeStatus;

        private RelatedInstanceListProfile(Builder builder) {
            this.adminUrl = builder.adminUrl;
            this.applicationType = builder.applicationType;
            this.applicationTypeText = builder.applicationTypeText;
            this.bindCname = builder.bindCname;
            this.bizId = builder.bizId;
            this.commodityCode = builder.commodityCode;
            this.customerService = builder.customerService;
            this.deployArea = builder.deployArea;
            this.domainList = builder.domainList;
            this.editorUrl = builder.editorUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.icpbaNo = builder.icpbaNo;
            this.imageList = builder.imageList;
            this.lxInstanceId = builder.lxInstanceId;
            this.ordTime = builder.ordTime;
            this.orderId = builder.orderId;
            this.orderNum = builder.orderNum;
            this.partnerId = builder.partnerId;
            this.payTime = builder.payTime;
            this.previewUrl = builder.previewUrl;
            this.seoSite = builder.seoSite;
            this.siteLogo = builder.siteLogo;
            this.siteVersion = builder.siteVersion;
            this.siteVersionText = builder.siteVersionText;
            this.source = builder.source;
            this.templateEtag = builder.templateEtag;
            this.templateId = builder.templateId;
            this.textList = builder.textList;
            this.thumbnail = builder.thumbnail;
            this.upgradeStatus = builder.upgradeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedInstanceListProfile create() {
            return builder().build();
        }

        /**
         * @return adminUrl
         */
        public String getAdminUrl() {
            return this.adminUrl;
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
         * @return bindCname
         */
        public String getBindCname() {
            return this.bindCname;
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
         * @return domainList
         */
        public String getDomainList() {
            return this.domainList;
        }

        /**
         * @return editorUrl
         */
        public String getEditorUrl() {
            return this.editorUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return icpbaNo
         */
        public String getIcpbaNo() {
            return this.icpbaNo;
        }

        /**
         * @return imageList
         */
        public String getImageList() {
            return this.imageList;
        }

        /**
         * @return lxInstanceId
         */
        public String getLxInstanceId() {
            return this.lxInstanceId;
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
         * @return orderNum
         */
        public Integer getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
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
         * @return siteLogo
         */
        public String getSiteLogo() {
            return this.siteLogo;
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
         * @return textList
         */
        public String getTextList() {
            return this.textList;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return upgradeStatus
         */
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public static final class Builder {
            private String adminUrl; 
            private String applicationType; 
            private String applicationTypeText; 
            private String bindCname; 
            private String bizId; 
            private String commodityCode; 
            private String customerService; 
            private String deployArea; 
            private String domainList; 
            private String editorUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private String icpbaNo; 
            private String imageList; 
            private String lxInstanceId; 
            private String ordTime; 
            private String orderId; 
            private Integer orderNum; 
            private String partnerId; 
            private String payTime; 
            private String previewUrl; 
            private String seoSite; 
            private String siteLogo; 
            private String siteVersion; 
            private String siteVersionText; 
            private String source; 
            private String templateEtag; 
            private String templateId; 
            private String textList; 
            private String thumbnail; 
            private String upgradeStatus; 

            private Builder() {
            } 

            private Builder(RelatedInstanceListProfile model) {
                this.adminUrl = model.adminUrl;
                this.applicationType = model.applicationType;
                this.applicationTypeText = model.applicationTypeText;
                this.bindCname = model.bindCname;
                this.bizId = model.bizId;
                this.commodityCode = model.commodityCode;
                this.customerService = model.customerService;
                this.deployArea = model.deployArea;
                this.domainList = model.domainList;
                this.editorUrl = model.editorUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.icpbaNo = model.icpbaNo;
                this.imageList = model.imageList;
                this.lxInstanceId = model.lxInstanceId;
                this.ordTime = model.ordTime;
                this.orderId = model.orderId;
                this.orderNum = model.orderNum;
                this.partnerId = model.partnerId;
                this.payTime = model.payTime;
                this.previewUrl = model.previewUrl;
                this.seoSite = model.seoSite;
                this.siteLogo = model.siteLogo;
                this.siteVersion = model.siteVersion;
                this.siteVersionText = model.siteVersionText;
                this.source = model.source;
                this.templateEtag = model.templateEtag;
                this.templateId = model.templateId;
                this.textList = model.textList;
                this.thumbnail = model.thumbnail;
                this.upgradeStatus = model.upgradeStatus;
            } 

            /**
             * AdminUrl.
             */
            public Builder adminUrl(String adminUrl) {
                this.adminUrl = adminUrl;
                return this;
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
             * BindCname.
             */
            public Builder bindCname(String bindCname) {
                this.bindCname = bindCname;
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
             * DomainList.
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * EditorUrl.
             */
            public Builder editorUrl(String editorUrl) {
                this.editorUrl = editorUrl;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IcpbaNo.
             */
            public Builder icpbaNo(String icpbaNo) {
                this.icpbaNo = icpbaNo;
                return this;
            }

            /**
             * ImageList.
             */
            public Builder imageList(String imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * LxInstanceId.
             */
            public Builder lxInstanceId(String lxInstanceId) {
                this.lxInstanceId = lxInstanceId;
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
             * OrderNum.
             */
            public Builder orderNum(Integer orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
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
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
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
             * <p>sitelogo</p>
             * 
             * <strong>example:</strong>
             * <p>logo</p>
             */
            public Builder siteLogo(String siteLogo) {
                this.siteLogo = siteLogo;
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

            /**
             * TextList.
             */
            public Builder textList(String textList) {
                this.textList = textList;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * UpgradeStatus.
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            public RelatedInstanceListProfile build() {
                return new RelatedInstanceListProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class RelatedInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppSubType")
        private String appSubType;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("BuildType")
        private String buildType;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Integer deleted;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesignSpecBizId")
        private String designSpecBizId;

        @com.aliyun.core.annotation.NameInMap("DesignSpecId")
        private String designSpecId;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("EspBizId")
        private String espBizId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtDelete")
        private String gmtDelete;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtPublish")
        private String gmtPublish;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private RelatedInstanceListProfile profile;

        @com.aliyun.core.annotation.NameInMap("SiteHost")
        private String siteHost;

        @com.aliyun.core.annotation.NameInMap("Slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusText")
        private String statusText;

        @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
        private String thumbnailUrl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private RelatedInstanceList(Builder builder) {
            this.appSubType = builder.appSubType;
            this.appType = builder.appType;
            this.bizId = builder.bizId;
            this.buildType = builder.buildType;
            this.deleted = builder.deleted;
            this.description = builder.description;
            this.designSpecBizId = builder.designSpecBizId;
            this.designSpecId = builder.designSpecId;
            this.domain = builder.domain;
            this.endTime = builder.endTime;
            this.env = builder.env;
            this.espBizId = builder.espBizId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtDelete = builder.gmtDelete;
            this.gmtModified = builder.gmtModified;
            this.gmtPublish = builder.gmtPublish;
            this.iconUrl = builder.iconUrl;
            this.name = builder.name;
            this.orderId = builder.orderId;
            this.profile = builder.profile;
            this.siteHost = builder.siteHost;
            this.slug = builder.slug;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusText = builder.statusText;
            this.thumbnailUrl = builder.thumbnailUrl;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedInstanceList create() {
            return builder().build();
        }

        /**
         * @return appSubType
         */
        public String getAppSubType() {
            return this.appSubType;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return buildType
         */
        public String getBuildType() {
            return this.buildType;
        }

        /**
         * @return deleted
         */
        public Integer getDeleted() {
            return this.deleted;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return designSpecBizId
         */
        public String getDesignSpecBizId() {
            return this.designSpecBizId;
        }

        /**
         * @return designSpecId
         */
        public String getDesignSpecId() {
            return this.designSpecId;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return espBizId
         */
        public String getEspBizId() {
            return this.espBizId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtDelete
         */
        public String getGmtDelete() {
            return this.gmtDelete;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtPublish
         */
        public String getGmtPublish() {
            return this.gmtPublish;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return profile
         */
        public RelatedInstanceListProfile getProfile() {
            return this.profile;
        }

        /**
         * @return siteHost
         */
        public String getSiteHost() {
            return this.siteHost;
        }

        /**
         * @return slug
         */
        public String getSlug() {
            return this.slug;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusText
         */
        public String getStatusText() {
            return this.statusText;
        }

        /**
         * @return thumbnailUrl
         */
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appSubType; 
            private String appType; 
            private String bizId; 
            private String buildType; 
            private Integer deleted; 
            private String description; 
            private String designSpecBizId; 
            private String designSpecId; 
            private String domain; 
            private String endTime; 
            private String env; 
            private String espBizId; 
            private String gmtCreate; 
            private String gmtDelete; 
            private String gmtModified; 
            private String gmtPublish; 
            private String iconUrl; 
            private String name; 
            private String orderId; 
            private RelatedInstanceListProfile profile; 
            private String siteHost; 
            private String slug; 
            private String sourceType; 
            private String startTime; 
            private String status; 
            private String statusText; 
            private String thumbnailUrl; 
            private String userId; 
            private String version; 

            private Builder() {
            } 

            private Builder(RelatedInstanceList model) {
                this.appSubType = model.appSubType;
                this.appType = model.appType;
                this.bizId = model.bizId;
                this.buildType = model.buildType;
                this.deleted = model.deleted;
                this.description = model.description;
                this.designSpecBizId = model.designSpecBizId;
                this.designSpecId = model.designSpecId;
                this.domain = model.domain;
                this.endTime = model.endTime;
                this.env = model.env;
                this.espBizId = model.espBizId;
                this.gmtCreate = model.gmtCreate;
                this.gmtDelete = model.gmtDelete;
                this.gmtModified = model.gmtModified;
                this.gmtPublish = model.gmtPublish;
                this.iconUrl = model.iconUrl;
                this.name = model.name;
                this.orderId = model.orderId;
                this.profile = model.profile;
                this.siteHost = model.siteHost;
                this.slug = model.slug;
                this.sourceType = model.sourceType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusText = model.statusText;
                this.thumbnailUrl = model.thumbnailUrl;
                this.userId = model.userId;
                this.version = model.version;
            } 

            /**
             * AppSubType.
             */
            public Builder appSubType(String appSubType) {
                this.appSubType = appSubType;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
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
             * BuildType.
             */
            public Builder buildType(String buildType) {
                this.buildType = buildType;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>placeHolder</p>
             * 
             * <strong>example:</strong>
             * <p>placeHolder</p>
             */
            public Builder designSpecBizId(String designSpecBizId) {
                this.designSpecBizId = designSpecBizId;
                return this;
            }

            /**
             * DesignSpecId.
             */
            public Builder designSpecId(String designSpecId) {
                this.designSpecId = designSpecId;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>esp bizId</p>
             * 
             * <strong>example:</strong>
             * <p>EspBizId</p>
             */
            public Builder espBizId(String espBizId) {
                this.espBizId = espBizId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtDelete.
             */
            public Builder gmtDelete(String gmtDelete) {
                this.gmtDelete = gmtDelete;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtPublish.
             */
            public Builder gmtPublish(String gmtPublish) {
                this.gmtPublish = gmtPublish;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Profile.
             */
            public Builder profile(RelatedInstanceListProfile profile) {
                this.profile = profile;
                return this;
            }

            /**
             * SiteHost.
             */
            public Builder siteHost(String siteHost) {
                this.siteHost = siteHost;
                return this;
            }

            /**
             * Slug.
             */
            public Builder slug(String slug) {
                this.slug = slug;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusText.
             */
            public Builder statusText(String statusText) {
                this.statusText = statusText;
                return this;
            }

            /**
             * ThumbnailUrl.
             */
            public Builder thumbnailUrl(String thumbnailUrl) {
                this.thumbnailUrl = thumbnailUrl;
                return this;
            }

            /**
             * <p>userid</p>
             * 
             * <strong>example:</strong>
             * <p>userid</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public RelatedInstanceList build() {
                return new RelatedInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppInstanceForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppInstanceForPartnerResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiStaffList")
        private java.util.List<AiStaffList> aiStaffList;

        @com.aliyun.core.annotation.NameInMap("AppDesignSpec")
        private AppDesignSpec appDesignSpec;

        @com.aliyun.core.annotation.NameInMap("AppOperationAddress")
        private AppOperationAddress appOperationAddress;

        @com.aliyun.core.annotation.NameInMap("AppServiceList")
        private java.util.List<AppServiceList> appServiceList;

        @com.aliyun.core.annotation.NameInMap("AppSubType")
        private String appSubType;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("BuildType")
        private String buildType;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Integer deleted;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesignSpecBizId")
        private String designSpecBizId;

        @com.aliyun.core.annotation.NameInMap("DesignSpecId")
        private String designSpecId;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("EspBizId")
        private String espBizId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtDelete")
        private String gmtDelete;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtPublish")
        private String gmtPublish;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PartnerDetail")
        private PartnerDetail partnerDetail;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private ModuleProfile profile;

        @com.aliyun.core.annotation.NameInMap("RelatedInstanceList")
        private java.util.List<RelatedInstanceList> relatedInstanceList;

        @com.aliyun.core.annotation.NameInMap("SiteHost")
        private String siteHost;

        @com.aliyun.core.annotation.NameInMap("Slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusText")
        private String statusText;

        @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
        private String thumbnailUrl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Module(Builder builder) {
            this.aiStaffList = builder.aiStaffList;
            this.appDesignSpec = builder.appDesignSpec;
            this.appOperationAddress = builder.appOperationAddress;
            this.appServiceList = builder.appServiceList;
            this.appSubType = builder.appSubType;
            this.appType = builder.appType;
            this.bizId = builder.bizId;
            this.buildType = builder.buildType;
            this.deleted = builder.deleted;
            this.description = builder.description;
            this.designSpecBizId = builder.designSpecBizId;
            this.designSpecId = builder.designSpecId;
            this.domain = builder.domain;
            this.endTime = builder.endTime;
            this.env = builder.env;
            this.espBizId = builder.espBizId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtDelete = builder.gmtDelete;
            this.gmtModified = builder.gmtModified;
            this.gmtPublish = builder.gmtPublish;
            this.iconUrl = builder.iconUrl;
            this.name = builder.name;
            this.orderId = builder.orderId;
            this.partnerDetail = builder.partnerDetail;
            this.profile = builder.profile;
            this.relatedInstanceList = builder.relatedInstanceList;
            this.siteHost = builder.siteHost;
            this.slug = builder.slug;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusText = builder.statusText;
            this.thumbnailUrl = builder.thumbnailUrl;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return aiStaffList
         */
        public java.util.List<AiStaffList> getAiStaffList() {
            return this.aiStaffList;
        }

        /**
         * @return appDesignSpec
         */
        public AppDesignSpec getAppDesignSpec() {
            return this.appDesignSpec;
        }

        /**
         * @return appOperationAddress
         */
        public AppOperationAddress getAppOperationAddress() {
            return this.appOperationAddress;
        }

        /**
         * @return appServiceList
         */
        public java.util.List<AppServiceList> getAppServiceList() {
            return this.appServiceList;
        }

        /**
         * @return appSubType
         */
        public String getAppSubType() {
            return this.appSubType;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return buildType
         */
        public String getBuildType() {
            return this.buildType;
        }

        /**
         * @return deleted
         */
        public Integer getDeleted() {
            return this.deleted;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return designSpecBizId
         */
        public String getDesignSpecBizId() {
            return this.designSpecBizId;
        }

        /**
         * @return designSpecId
         */
        public String getDesignSpecId() {
            return this.designSpecId;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return espBizId
         */
        public String getEspBizId() {
            return this.espBizId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtDelete
         */
        public String getGmtDelete() {
            return this.gmtDelete;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtPublish
         */
        public String getGmtPublish() {
            return this.gmtPublish;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return partnerDetail
         */
        public PartnerDetail getPartnerDetail() {
            return this.partnerDetail;
        }

        /**
         * @return profile
         */
        public ModuleProfile getProfile() {
            return this.profile;
        }

        /**
         * @return relatedInstanceList
         */
        public java.util.List<RelatedInstanceList> getRelatedInstanceList() {
            return this.relatedInstanceList;
        }

        /**
         * @return siteHost
         */
        public String getSiteHost() {
            return this.siteHost;
        }

        /**
         * @return slug
         */
        public String getSlug() {
            return this.slug;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusText
         */
        public String getStatusText() {
            return this.statusText;
        }

        /**
         * @return thumbnailUrl
         */
        public String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<AiStaffList> aiStaffList; 
            private AppDesignSpec appDesignSpec; 
            private AppOperationAddress appOperationAddress; 
            private java.util.List<AppServiceList> appServiceList; 
            private String appSubType; 
            private String appType; 
            private String bizId; 
            private String buildType; 
            private Integer deleted; 
            private String description; 
            private String designSpecBizId; 
            private String designSpecId; 
            private String domain; 
            private String endTime; 
            private String env; 
            private String espBizId; 
            private String gmtCreate; 
            private String gmtDelete; 
            private String gmtModified; 
            private String gmtPublish; 
            private String iconUrl; 
            private String name; 
            private String orderId; 
            private PartnerDetail partnerDetail; 
            private ModuleProfile profile; 
            private java.util.List<RelatedInstanceList> relatedInstanceList; 
            private String siteHost; 
            private String slug; 
            private String sourceType; 
            private String startTime; 
            private String status; 
            private String statusText; 
            private String thumbnailUrl; 
            private String userId; 
            private String version; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.aiStaffList = model.aiStaffList;
                this.appDesignSpec = model.appDesignSpec;
                this.appOperationAddress = model.appOperationAddress;
                this.appServiceList = model.appServiceList;
                this.appSubType = model.appSubType;
                this.appType = model.appType;
                this.bizId = model.bizId;
                this.buildType = model.buildType;
                this.deleted = model.deleted;
                this.description = model.description;
                this.designSpecBizId = model.designSpecBizId;
                this.designSpecId = model.designSpecId;
                this.domain = model.domain;
                this.endTime = model.endTime;
                this.env = model.env;
                this.espBizId = model.espBizId;
                this.gmtCreate = model.gmtCreate;
                this.gmtDelete = model.gmtDelete;
                this.gmtModified = model.gmtModified;
                this.gmtPublish = model.gmtPublish;
                this.iconUrl = model.iconUrl;
                this.name = model.name;
                this.orderId = model.orderId;
                this.partnerDetail = model.partnerDetail;
                this.profile = model.profile;
                this.relatedInstanceList = model.relatedInstanceList;
                this.siteHost = model.siteHost;
                this.slug = model.slug;
                this.sourceType = model.sourceType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusText = model.statusText;
                this.thumbnailUrl = model.thumbnailUrl;
                this.userId = model.userId;
                this.version = model.version;
            } 

            /**
             * AiStaffList.
             */
            public Builder aiStaffList(java.util.List<AiStaffList> aiStaffList) {
                this.aiStaffList = aiStaffList;
                return this;
            }

            /**
             * AppDesignSpec.
             */
            public Builder appDesignSpec(AppDesignSpec appDesignSpec) {
                this.appDesignSpec = appDesignSpec;
                return this;
            }

            /**
             * AppOperationAddress.
             */
            public Builder appOperationAddress(AppOperationAddress appOperationAddress) {
                this.appOperationAddress = appOperationAddress;
                return this;
            }

            /**
             * AppServiceList.
             */
            public Builder appServiceList(java.util.List<AppServiceList> appServiceList) {
                this.appServiceList = appServiceList;
                return this;
            }

            /**
             * AppSubType.
             */
            public Builder appSubType(String appSubType) {
                this.appSubType = appSubType;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
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
             * BuildType.
             */
            public Builder buildType(String buildType) {
                this.buildType = buildType;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>placeHolder</p>
             * 
             * <strong>example:</strong>
             * <p>placeHolder</p>
             */
            public Builder designSpecBizId(String designSpecBizId) {
                this.designSpecBizId = designSpecBizId;
                return this;
            }

            /**
             * DesignSpecId.
             */
            public Builder designSpecId(String designSpecId) {
                this.designSpecId = designSpecId;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>esp bizId</p>
             * 
             * <strong>example:</strong>
             * <p>EspBizId</p>
             */
            public Builder espBizId(String espBizId) {
                this.espBizId = espBizId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtDelete.
             */
            public Builder gmtDelete(String gmtDelete) {
                this.gmtDelete = gmtDelete;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtPublish.
             */
            public Builder gmtPublish(String gmtPublish) {
                this.gmtPublish = gmtPublish;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * PartnerDetail.
             */
            public Builder partnerDetail(PartnerDetail partnerDetail) {
                this.partnerDetail = partnerDetail;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(ModuleProfile profile) {
                this.profile = profile;
                return this;
            }

            /**
             * RelatedInstanceList.
             */
            public Builder relatedInstanceList(java.util.List<RelatedInstanceList> relatedInstanceList) {
                this.relatedInstanceList = relatedInstanceList;
                return this;
            }

            /**
             * SiteHost.
             */
            public Builder siteHost(String siteHost) {
                this.siteHost = siteHost;
                return this;
            }

            /**
             * Slug.
             */
            public Builder slug(String slug) {
                this.slug = slug;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusText.
             */
            public Builder statusText(String statusText) {
                this.statusText = statusText;
                return this;
            }

            /**
             * ThumbnailUrl.
             */
            public Builder thumbnailUrl(String thumbnailUrl) {
                this.thumbnailUrl = thumbnailUrl;
                return this;
            }

            /**
             * <p>userid</p>
             * 
             * <strong>example:</strong>
             * <p>userid</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
