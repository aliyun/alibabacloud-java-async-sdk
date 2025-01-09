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
 * {@link ListIdentityProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdentityProvidersResponseBody</p>
 */
public class ListIdentityProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProviders")
    private java.util.List<IdentityProviders> identityProviders;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIdentityProvidersResponseBody(Builder builder) {
        this.identityProviders = builder.identityProviders;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProvidersResponseBody create() {
        return builder().build();
    }

    /**
     * @return identityProviders
     */
    public java.util.List<IdentityProviders> getIdentityProviders() {
        return this.identityProviders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<IdentityProviders> identityProviders; 
        private String requestId; 
        private Long totalCount; 

        /**
         * IdentityProviders.
         */
        public Builder identityProviders(java.util.List<IdentityProviders> identityProviders) {
            this.identityProviders = identityProviders;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIdentityProvidersResponseBody build() {
            return new ListIdentityProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIdentityProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdentityProvidersResponseBody</p>
     */
    public static class IdentityProviders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedStatus")
        private String advancedStatus;

        @com.aliyun.core.annotation.NameInMap("AuthnSourceSupplier")
        private String authnSourceSupplier;

        @com.aliyun.core.annotation.NameInMap("AuthnSourceType")
        private String authnSourceType;

        @com.aliyun.core.annotation.NameInMap("AuthnStatus")
        private String authnStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderExternalId")
        private String identityProviderExternalId;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
        private String identityProviderId;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
        private String identityProviderName;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("IncrementalCallbackStatus")
        private String incrementalCallbackStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastStatusCheckJobResult")
        private String lastStatusCheckJobResult;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("LogoUrl")
        private String logoUrl;

        @com.aliyun.core.annotation.NameInMap("UdPullStatus")
        private String udPullStatus;

        @com.aliyun.core.annotation.NameInMap("UdPullTargetScope")
        private String udPullTargetScope;

        @com.aliyun.core.annotation.NameInMap("UdPushStatus")
        private String udPushStatus;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private IdentityProviders(Builder builder) {
            this.advancedStatus = builder.advancedStatus;
            this.authnSourceSupplier = builder.authnSourceSupplier;
            this.authnSourceType = builder.authnSourceType;
            this.authnStatus = builder.authnStatus;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.identityProviderExternalId = builder.identityProviderExternalId;
            this.identityProviderId = builder.identityProviderId;
            this.identityProviderName = builder.identityProviderName;
            this.identityProviderType = builder.identityProviderType;
            this.incrementalCallbackStatus = builder.incrementalCallbackStatus;
            this.instanceId = builder.instanceId;
            this.lastStatusCheckJobResult = builder.lastStatusCheckJobResult;
            this.lockReason = builder.lockReason;
            this.logoUrl = builder.logoUrl;
            this.udPullStatus = builder.udPullStatus;
            this.udPullTargetScope = builder.udPullTargetScope;
            this.udPushStatus = builder.udPushStatus;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityProviders create() {
            return builder().build();
        }

        /**
         * @return advancedStatus
         */
        public String getAdvancedStatus() {
            return this.advancedStatus;
        }

        /**
         * @return authnSourceSupplier
         */
        public String getAuthnSourceSupplier() {
            return this.authnSourceSupplier;
        }

        /**
         * @return authnSourceType
         */
        public String getAuthnSourceType() {
            return this.authnSourceType;
        }

        /**
         * @return authnStatus
         */
        public String getAuthnStatus() {
            return this.authnStatus;
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
         * @return identityProviderExternalId
         */
        public String getIdentityProviderExternalId() {
            return this.identityProviderExternalId;
        }

        /**
         * @return identityProviderId
         */
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        /**
         * @return identityProviderName
         */
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        /**
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        /**
         * @return incrementalCallbackStatus
         */
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastStatusCheckJobResult
         */
        public String getLastStatusCheckJobResult() {
            return this.lastStatusCheckJobResult;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return logoUrl
         */
        public String getLogoUrl() {
            return this.logoUrl;
        }

        /**
         * @return udPullStatus
         */
        public String getUdPullStatus() {
            return this.udPullStatus;
        }

        /**
         * @return udPullTargetScope
         */
        public String getUdPullTargetScope() {
            return this.udPullTargetScope;
        }

        /**
         * @return udPushStatus
         */
        public String getUdPushStatus() {
            return this.udPushStatus;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String advancedStatus; 
            private String authnSourceSupplier; 
            private String authnSourceType; 
            private String authnStatus; 
            private Long createTime; 
            private String description; 
            private String identityProviderExternalId; 
            private String identityProviderId; 
            private String identityProviderName; 
            private String identityProviderType; 
            private String incrementalCallbackStatus; 
            private String instanceId; 
            private String lastStatusCheckJobResult; 
            private String lockReason; 
            private String logoUrl; 
            private String udPullStatus; 
            private String udPullTargetScope; 
            private String udPushStatus; 
            private Long updateTime; 

            /**
             * <p>高阶配置能力</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder advancedStatus(String advancedStatus) {
                this.advancedStatus = advancedStatus;
                return this;
            }

            /**
             * <p>IDaaS EIAM 对应的认证来源产品，okta or google or azure ad</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
             */
            public Builder authnSourceSupplier(String authnSourceSupplier) {
                this.authnSourceSupplier = authnSourceSupplier;
                return this;
            }

            /**
             * <p>IDaaS EIAM 认证方式类型 oidc or saml</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:authntype:oidc</p>
             */
            public Builder authnSourceType(String authnSourceType) {
                this.authnSourceType = authnSourceType;
                return this;
            }

            /**
             * <p>IDaaS EIAM 对应IdP是否支持认证</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder authnStatus(String authnStatus) {
                this.authnStatus = authnStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方外部ID</p>
             * 
             * <strong>example:</strong>
             * <p>test_123</p>
             */
            public Builder identityProviderExternalId(String identityProviderExternalId) {
                this.identityProviderExternalId = identityProviderExternalId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方ID</p>
             * 
             * <strong>example:</strong>
             * <p>idp_m5b5wd5s2hpq4t6iaehhXXX</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方名称</p>
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * <p>身份提供方同步类型</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:idp:bytedance:lark:pull</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_pbf4dth34l2qb7mydpntXXX</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LastStatusCheckJobResult.
             */
            public Builder lastStatusCheckJobResult(String lastStatusCheckJobResult) {
                this.lastStatusCheckJobResult = lastStatusCheckJobResult;
                return this;
            }

            /**
             * <p>锁定原因</p>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * LogoUrl.
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * <p>IDaaS EIAM 是否支持UD同步</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder udPullStatus(String udPullStatus) {
                this.udPullStatus = udPullStatus;
                return this;
            }

            /**
             * <p>当支持ud_pullIDaaS侧UD中的范围</p>
             * 
             * <strong>example:</strong>
             * <p>ou_2buqmxsa3ltyqkjgpwfijurXXX</p>
             */
            public Builder udPullTargetScope(String udPullTargetScope) {
                this.udPullTargetScope = udPullTargetScope;
                return this;
            }

            /**
             * <p>同步出能力</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder udPushStatus(String udPushStatus) {
                this.udPushStatus = udPushStatus;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public IdentityProviders build() {
                return new IdentityProviders(this);
            } 

        } 

    }
}
