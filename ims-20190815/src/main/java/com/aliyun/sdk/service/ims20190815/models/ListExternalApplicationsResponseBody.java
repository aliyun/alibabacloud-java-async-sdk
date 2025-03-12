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
 * {@link ListExternalApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExternalApplicationsResponseBody</p>
 */
public class ListExternalApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExternalApplications")
    private ExternalApplications externalApplications;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListExternalApplicationsResponseBody(Builder builder) {
        this.externalApplications = builder.externalApplications;
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExternalApplicationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return externalApplications
     */
    public ExternalApplications getExternalApplications() {
        return this.externalApplications;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ExternalApplications externalApplications; 
        private Boolean isTruncated; 
        private String marker; 
        private String requestId; 

        /**
         * <p>The information about the external applications.</p>
         */
        public Builder externalApplications(ExternalApplications externalApplications) {
            this.externalApplications = externalApplications;
            return this;
        }

        /**
         * <p>Indicates whether the response is truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <blockquote>
         * <p> This parameter is returned only when <code>IsTruncated</code> is <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>936E1D9C-157D-45BD-8A3B-81C0716EB077</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExternalApplicationsResponseBody build() {
            return new ListExternalApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExternalApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExternalApplicationsResponseBody</p>
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
             * <p>The description of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>Obtains the OpenID of the user. This is the default scope and cannot be deleted.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the permission.</p>
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
     * {@link ListExternalApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExternalApplicationsResponseBody</p>
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
     * {@link ListExternalApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExternalApplicationsResponseBody</p>
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
             * <p>The information about the permissions that are granted to the external application.</p>
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
     * {@link ListExternalApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExternalApplicationsResponseBody</p>
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
             * <p>The name of the external application principal. The value is in the <code>&lt;app_name&gt;@app.&lt;account_id&gt;.onaliyun.com</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:GiteePrd@app.153082740420">GiteePrd@app.153082740420</a>****.onaliyun.com</p>
             */
            public Builder appPrincipalName(String appPrincipalName) {
                this.appPrincipalName = appPrincipalName;
                return this;
            }

            /**
             * <p>The time when the external application was installed. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1603693318000</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The information about the permissions that are granted to the external application.</p>
             */
            public Builder delegatedScope(DelegatedScope delegatedScope) {
                this.delegatedScope = delegatedScope;
                return this;
            }

            /**
             * <p>The display name of the external application.</p>
             * 
             * <strong>example:</strong>
             * <p>GiteeAliyun</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the external application.</p>
             * 
             * <strong>example:</strong>
             * <p>407426893752729****</p>
             */
            public Builder foreignAppId(String foreignAppId) {
                this.foreignAppId = foreignAppId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account for which the external application was installed.</p>
             * 
             * <strong>example:</strong>
             * <p>173082740420****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The update time of the external application. The value is a timestamp.</p>
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
    /**
     * 
     * {@link ListExternalApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExternalApplicationsResponseBody</p>
     */
    public static class ExternalApplications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalApplication")
        private java.util.List<ExternalApplication> externalApplication;

        private ExternalApplications(Builder builder) {
            this.externalApplication = builder.externalApplication;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalApplications create() {
            return builder().build();
        }

        /**
         * @return externalApplication
         */
        public java.util.List<ExternalApplication> getExternalApplication() {
            return this.externalApplication;
        }

        public static final class Builder {
            private java.util.List<ExternalApplication> externalApplication; 

            /**
             * ExternalApplication.
             */
            public Builder externalApplication(java.util.List<ExternalApplication> externalApplication) {
                this.externalApplication = externalApplication;
                return this;
            }

            public ExternalApplications build() {
                return new ExternalApplications(this);
            } 

        } 

    }
}
