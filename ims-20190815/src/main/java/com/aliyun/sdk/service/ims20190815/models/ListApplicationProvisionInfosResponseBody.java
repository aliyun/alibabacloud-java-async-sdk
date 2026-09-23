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
 * {@link ListApplicationProvisionInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationProvisionInfosResponseBody</p>
 */
public class ListApplicationProvisionInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationProvisionInfos")
    private ApplicationProvisionInfos applicationProvisionInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApplicationProvisionInfosResponseBody(Builder builder) {
        this.applicationProvisionInfos = builder.applicationProvisionInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationProvisionInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationProvisionInfos
     */
    public ApplicationProvisionInfos getApplicationProvisionInfos() {
        return this.applicationProvisionInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationProvisionInfos applicationProvisionInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApplicationProvisionInfosResponseBody model) {
            this.applicationProvisionInfos = model.applicationProvisionInfos;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationProvisionInfos.
         */
        public Builder applicationProvisionInfos(ApplicationProvisionInfos applicationProvisionInfos) {
            this.applicationProvisionInfos = applicationProvisionInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E403EBFD-C997-489D-BFC7-37C05E66D67C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationProvisionInfosResponseBody build() {
            return new ListApplicationProvisionInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationProvisionInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationProvisionInfosResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PredefinedScope model) {
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
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
     * {@link ListApplicationProvisionInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationProvisionInfosResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PredefinedScopes model) {
                this.predefinedScope = model.predefinedScope;
            } 

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
     * {@link ListApplicationProvisionInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationProvisionInfosResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DelegatedScope model) {
                this.predefinedScopes = model.predefinedScopes;
            } 

            /**
             * PredefinedScopes.
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
     * {@link ListApplicationProvisionInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationProvisionInfosResponseBody</p>
     */
    public static class ApplicationProvisionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AppCategory")
        private String appCategory;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AssignmentType")
        private String assignmentType;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DelegatedScope")
        private DelegatedScope delegatedScope;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("NeedPrincipalConsent")
        private Boolean needPrincipalConsent;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private ApplicationProvisionInfo(Builder builder) {
            this.accountId = builder.accountId;
            this.appCategory = builder.appCategory;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.assignmentType = builder.assignmentType;
            this.createDate = builder.createDate;
            this.delegatedScope = builder.delegatedScope;
            this.displayName = builder.displayName;
            this.needPrincipalConsent = builder.needPrincipalConsent;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationProvisionInfo create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return appCategory
         */
        public String getAppCategory() {
            return this.appCategory;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return assignmentType
         */
        public String getAssignmentType() {
            return this.assignmentType;
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
         * @return needPrincipalConsent
         */
        public Boolean getNeedPrincipalConsent() {
            return this.needPrincipalConsent;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String accountId; 
            private String appCategory; 
            private String appId; 
            private String appName; 
            private String assignmentType; 
            private String createDate; 
            private DelegatedScope delegatedScope; 
            private String displayName; 
            private Boolean needPrincipalConsent; 
            private String updateDate; 

            private Builder() {
            } 

            private Builder(ApplicationProvisionInfo model) {
                this.accountId = model.accountId;
                this.appCategory = model.appCategory;
                this.appId = model.appId;
                this.appName = model.appName;
                this.assignmentType = model.assignmentType;
                this.createDate = model.createDate;
                this.delegatedScope = model.delegatedScope;
                this.displayName = model.displayName;
                this.needPrincipalConsent = model.needPrincipalConsent;
                this.updateDate = model.updateDate;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AppCategory.
             */
            public Builder appCategory(String appCategory) {
                this.appCategory = appCategory;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * AssignmentType.
             */
            public Builder assignmentType(String assignmentType) {
                this.assignmentType = assignmentType;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * DelegatedScope.
             */
            public Builder delegatedScope(DelegatedScope delegatedScope) {
                this.delegatedScope = delegatedScope;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * NeedPrincipalConsent.
             */
            public Builder needPrincipalConsent(Boolean needPrincipalConsent) {
                this.needPrincipalConsent = needPrincipalConsent;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ApplicationProvisionInfo build() {
                return new ApplicationProvisionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationProvisionInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationProvisionInfosResponseBody</p>
     */
    public static class ApplicationProvisionInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationProvisionInfo")
        private java.util.List<ApplicationProvisionInfo> applicationProvisionInfo;

        private ApplicationProvisionInfos(Builder builder) {
            this.applicationProvisionInfo = builder.applicationProvisionInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationProvisionInfos create() {
            return builder().build();
        }

        /**
         * @return applicationProvisionInfo
         */
        public java.util.List<ApplicationProvisionInfo> getApplicationProvisionInfo() {
            return this.applicationProvisionInfo;
        }

        public static final class Builder {
            private java.util.List<ApplicationProvisionInfo> applicationProvisionInfo; 

            private Builder() {
            } 

            private Builder(ApplicationProvisionInfos model) {
                this.applicationProvisionInfo = model.applicationProvisionInfo;
            } 

            /**
             * ApplicationProvisionInfo.
             */
            public Builder applicationProvisionInfo(java.util.List<ApplicationProvisionInfo> applicationProvisionInfo) {
                this.applicationProvisionInfo = applicationProvisionInfo;
                return this;
            }

            public ApplicationProvisionInfos build() {
                return new ApplicationProvisionInfos(this);
            } 

        } 

    }
}
