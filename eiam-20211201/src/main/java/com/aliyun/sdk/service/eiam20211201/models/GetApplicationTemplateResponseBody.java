// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetApplicationTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationTemplateResponseBody</p>
 */
public class GetApplicationTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplate")
    private ApplicationTemplate applicationTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationTemplateResponseBody(Builder builder) {
        this.applicationTemplate = builder.applicationTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTemplate
     */
    public ApplicationTemplate getApplicationTemplate() {
        return this.applicationTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationTemplate applicationTemplate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationTemplateResponseBody model) {
            this.applicationTemplate = model.applicationTemplate;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationTemplate.
         */
        public Builder applicationTemplate(ApplicationTemplate applicationTemplate) {
            this.applicationTemplate = applicationTemplate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationTemplateResponseBody build() {
            return new GetApplicationTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationTemplateResponseBody</p>
     */
    public static class SaleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlwaysFree")
        private Boolean alwaysFree;

        private SaleInfo(Builder builder) {
            this.alwaysFree = builder.alwaysFree;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleInfo create() {
            return builder().build();
        }

        /**
         * @return alwaysFree
         */
        public Boolean getAlwaysFree() {
            return this.alwaysFree;
        }

        public static final class Builder {
            private Boolean alwaysFree; 

            private Builder() {
            } 

            private Builder(SaleInfo model) {
                this.alwaysFree = model.alwaysFree;
            } 

            /**
             * <p>是否永久免费</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder alwaysFree(Boolean alwaysFree) {
                this.alwaysFree = alwaysFree;
                return this;
            }

            public SaleInfo build() {
                return new SaleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationTemplateResponseBody</p>
     */
    public static class ApplicationTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
        private String applicationTemplateId;

        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateName")
        private String applicationTemplateName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HelpDocumentUrl")
        private String helpDocumentUrl;

        @com.aliyun.core.annotation.NameInMap("LogoUrl")
        private String logoUrl;

        @com.aliyun.core.annotation.NameInMap("ManagedServiceCode")
        private String managedServiceCode;

        @com.aliyun.core.annotation.NameInMap("SaleInfo")
        private SaleInfo saleInfo;

        @com.aliyun.core.annotation.NameInMap("ServiceConsoleUrl")
        private String serviceConsoleUrl;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("SsoTypes")
        private java.util.List<String> ssoTypes;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private ApplicationTemplate(Builder builder) {
            this.applicationTemplateId = builder.applicationTemplateId;
            this.applicationTemplateName = builder.applicationTemplateName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.helpDocumentUrl = builder.helpDocumentUrl;
            this.logoUrl = builder.logoUrl;
            this.managedServiceCode = builder.managedServiceCode;
            this.saleInfo = builder.saleInfo;
            this.serviceConsoleUrl = builder.serviceConsoleUrl;
            this.serviceManaged = builder.serviceManaged;
            this.ssoTypes = builder.ssoTypes;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationTemplate create() {
            return builder().build();
        }

        /**
         * @return applicationTemplateId
         */
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        /**
         * @return applicationTemplateName
         */
        public String getApplicationTemplateName() {
            return this.applicationTemplateName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return helpDocumentUrl
         */
        public String getHelpDocumentUrl() {
            return this.helpDocumentUrl;
        }

        /**
         * @return logoUrl
         */
        public String getLogoUrl() {
            return this.logoUrl;
        }

        /**
         * @return managedServiceCode
         */
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        /**
         * @return saleInfo
         */
        public SaleInfo getSaleInfo() {
            return this.saleInfo;
        }

        /**
         * @return serviceConsoleUrl
         */
        public String getServiceConsoleUrl() {
            return this.serviceConsoleUrl;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return ssoTypes
         */
        public java.util.List<String> getSsoTypes() {
            return this.ssoTypes;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String applicationTemplateId; 
            private String applicationTemplateName; 
            private Long createTime; 
            private String description; 
            private String helpDocumentUrl; 
            private String logoUrl; 
            private String managedServiceCode; 
            private SaleInfo saleInfo; 
            private String serviceConsoleUrl; 
            private Boolean serviceManaged; 
            private java.util.List<String> ssoTypes; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ApplicationTemplate model) {
                this.applicationTemplateId = model.applicationTemplateId;
                this.applicationTemplateName = model.applicationTemplateName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.helpDocumentUrl = model.helpDocumentUrl;
                this.logoUrl = model.logoUrl;
                this.managedServiceCode = model.managedServiceCode;
                this.saleInfo = model.saleInfo;
                this.serviceConsoleUrl = model.serviceConsoleUrl;
                this.serviceManaged = model.serviceManaged;
                this.ssoTypes = model.ssoTypes;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>应用模板Id</p>
             * 
             * <strong>example:</strong>
             * <p>apt_ramintlrole_ixxxxx</p>
             */
            public Builder applicationTemplateId(String applicationTemplateId) {
                this.applicationTemplateId = applicationTemplateId;
                return this;
            }

            /**
             * <p>应用模板名称</p>
             */
            public Builder applicationTemplateName(String applicationTemplateName) {
                this.applicationTemplateName = applicationTemplateName;
                return this;
            }

            /**
             * <p>应用模板创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1730341123000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>应用模板描述信息</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>应用模板对应帮助文档地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/document_detail/409xxx.html">https://example.com/document_detail/409xxx.html</a></p>
             */
            public Builder helpDocumentUrl(String helpDocumentUrl) {
                this.helpDocumentUrl = helpDocumentUrl;
                return this;
            }

            /**
             * <p>应用模板Logo地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/imgextra/i4/O1CN01xTLxLb1WtyKksHW1H_!!6000000002847-2-tps-xxx-xxx.png">https://example.com/imgextra/i4/O1CN01xTLxLb1WtyKksHW1H_!!6000000002847-2-tps-xxx-xxx.png</a></p>
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * <p>托管应用模板的云产品ServiceCode。当且仅当ServiceManaged为true是返回。</p>
             * 
             * <strong>example:</strong>
             * <p>bastionhost</p>
             */
            public Builder managedServiceCode(String managedServiceCode) {
                this.managedServiceCode = managedServiceCode;
                return this;
            }

            /**
             * <p>应用模板售卖信息</p>
             */
            public Builder saleInfo(SaleInfo saleInfo) {
                this.saleInfo = saleInfo;
                return this;
            }

            /**
             * <p>托管应用模板的云产品控制台地址。当且仅当ServiceManaged为true是返回。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/?p=bastion">https://example.com/?p=bastion</a></p>
             */
            public Builder serviceConsoleUrl(String serviceConsoleUrl) {
                this.serviceConsoleUrl = serviceConsoleUrl;
                return this;
            }

            /**
             * <p>应用模板是否被云产品托管。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>支持SSO协议</p>
             */
            public Builder ssoTypes(java.util.List<String> ssoTypes) {
                this.ssoTypes = ssoTypes;
                return this;
            }

            /**
             * <p>应用模板更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1730341124000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ApplicationTemplate build() {
                return new ApplicationTemplate(this);
            } 

        } 

    }
}
