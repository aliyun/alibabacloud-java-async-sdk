// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ProvisionExternalApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ProvisionExternalApplicationResponseBody</p>
 */
public class ProvisionExternalApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExternalApplication")
    private ExternalApplication externalApplication;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ProvisionExternalApplicationResponseBody(Builder builder) {
        this.externalApplication = builder.externalApplication;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProvisionExternalApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return externalApplication
     */
    public ExternalApplication getExternalApplication() {
        return this.externalApplication;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ExternalApplication externalApplication; 
        private String requestId; 

        /**
         * <p>The information about the external application.</p>
         */
        public Builder externalApplication(ExternalApplication externalApplication) {
            this.externalApplication = externalApplication;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>55535873-9A6B-5C87-853F-C7CD258826F2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ProvisionExternalApplicationResponseBody build() {
            return new ProvisionExternalApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ProvisionExternalApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ProvisionExternalApplicationResponseBody</p>
     */
    public static class PredefinedScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private PredefinedScope(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredefinedScope create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String name; 

            /**
             * <p>The description of the permission scope.</p>
             * 
             * <strong>example:</strong>
             * <p>Obtains the OpenID of the user. This is the default scope and cannot be deleted.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the permission scope.</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PredefinedScope build() {
                return new PredefinedScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProvisionExternalApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ProvisionExternalApplicationResponseBody</p>
     */
    public static class PredefinedScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PredefinedScope")
        private java.util.List<PredefinedScope> predefinedScope;

        private PredefinedScopes(Builder builder) {
            this.predefinedScope = builder.predefinedScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredefinedScopes create() {
            return builder().build();
        }

        /**
         * @return predefinedScope
         */
        public java.util.List<PredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

        public static final class Builder {
            private java.util.List<PredefinedScope> predefinedScope; 

            /**
             * PredefinedScope.
             */
            public Builder predefinedScope(java.util.List<PredefinedScope> predefinedScope) {
                this.predefinedScope = predefinedScope;
                return this;
            }

            public PredefinedScopes build() {
                return new PredefinedScopes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProvisionExternalApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ProvisionExternalApplicationResponseBody</p>
     */
    public static class DelegatedScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PredefinedScopes")
        private PredefinedScopes predefinedScopes;

        private DelegatedScope(Builder builder) {
            this.predefinedScopes = builder.predefinedScopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelegatedScope create() {
            return builder().build();
        }

        /**
         * @return predefinedScopes
         */
        public PredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

        public static final class Builder {
            private PredefinedScopes predefinedScopes; 

            /**
             * <p>The information about the scopes of permissions that are granted to the application.</p>
             */
            public Builder predefinedScopes(PredefinedScopes predefinedScopes) {
                this.predefinedScopes = predefinedScopes;
                return this;
            }

            public DelegatedScope build() {
                return new DelegatedScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProvisionExternalApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ProvisionExternalApplicationResponseBody</p>
     */
    public static class ExternalApplication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppPrincipalName")
        private String appPrincipalName;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DelegatedScope")
        private DelegatedScope delegatedScope;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("ForeignAppId")
        private String foreignAppId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private ExternalApplication(Builder builder) {
            this.appPrincipalName = builder.appPrincipalName;
            this.createDate = builder.createDate;
            this.delegatedScope = builder.delegatedScope;
            this.displayName = builder.displayName;
            this.foreignAppId = builder.foreignAppId;
            this.tenantId = builder.tenantId;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalApplication create() {
            return builder().build();
        }

        /**
         * @return appPrincipalName
         */
        public String getAppPrincipalName() {
            return this.appPrincipalName;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return delegatedScope
         */
        public DelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return foreignAppId
         */
        public String getForeignAppId() {
            return this.foreignAppId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String appPrincipalName; 
            private String createDate; 
            private DelegatedScope delegatedScope; 
            private String displayName; 
            private String foreignAppId; 
            private String tenantId; 
            private String updateDate; 

            /**
             * <p>The name of the application principal. The value is in the <code>&lt;app_name&gt;@app.&lt;account_id&gt;.onaliyun.com</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:GiteePrd@app.177242285274">GiteePrd@app.177242285274</a>****.onaliyun.com</p>
             */
            public Builder appPrincipalName(String appPrincipalName) {
                this.appPrincipalName = appPrincipalName;
                return this;
            }

            /**
             * <p>The time when the application was installed. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1603693518000</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The information about the scopes of permissions that are granted to the application.</p>
             */
            public Builder delegatedScope(DelegatedScope delegatedScope) {
                this.delegatedScope = delegatedScope;
                return this;
            }

            /**
             * <p>The display name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>GiteeAliyun</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>403550611646604****</p>
             */
            public Builder foreignAppId(String foreignAppId) {
                this.foreignAppId = foreignAppId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the external application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>157242285274****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The update time. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1603693518000</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ExternalApplication build() {
                return new ExternalApplication(this);
            } 

        } 

    }
}
