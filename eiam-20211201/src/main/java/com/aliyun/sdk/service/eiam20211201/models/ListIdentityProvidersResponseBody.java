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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListIdentityProvidersResponseBody model) {
            this.identityProviders = model.identityProviders;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Identity provider information array.</p>
         */
        public Builder identityProviders(java.util.List<IdentityProviders> identityProviders) {
            this.identityProviders = identityProviders;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncStatus")
        private String periodicSyncStatus;

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
            this.periodicSyncStatus = builder.periodicSyncStatus;
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
         * @return periodicSyncStatus
         */
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
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
            private String periodicSyncStatus; 
            private String udPullStatus; 
            private String udPullTargetScope; 
            private String udPushStatus; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(IdentityProviders model) {
                this.advancedStatus = model.advancedStatus;
                this.authnSourceSupplier = model.authnSourceSupplier;
                this.authnSourceType = model.authnSourceType;
                this.authnStatus = model.authnStatus;
                this.createTime = model.createTime;
                this.description = model.description;
                this.identityProviderExternalId = model.identityProviderExternalId;
                this.identityProviderId = model.identityProviderId;
                this.identityProviderName = model.identityProviderName;
                this.identityProviderType = model.identityProviderType;
                this.incrementalCallbackStatus = model.incrementalCallbackStatus;
                this.instanceId = model.instanceId;
                this.lastStatusCheckJobResult = model.lastStatusCheckJobResult;
                this.lockReason = model.lockReason;
                this.logoUrl = model.logoUrl;
                this.periodicSyncStatus = model.periodicSyncStatus;
                this.udPullStatus = model.udPullStatus;
                this.udPullTargetScope = model.udPullTargetScope;
                this.udPushStatus = model.udPushStatus;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Advanced configuration capabilities</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder advancedStatus(String advancedStatus) {
                this.advancedStatus = advancedStatus;
                return this;
            }

            /**
             * <p>Authentication source product.</p>
             * <ul>
             * <li>urn:alibaba:idaas:idp:okta:okta</li>
             * <li>urn:alibaba:idaas:idp:google:account</li>
             * <li>urn:alibaba:idaas:idp:microsoft:aad</li>
             * <li>urn:alibaba:idaas:idp:microsoft:ad</li>
             * <li>urn:alibaba:idaas:idp:bytedance:lark</li>
             * <li>urn:alibaba:idaas:idp:unknown:ldap</li>
             * <li>urn:alibaba:idaas:idp:alibaba:idaas</li>
             * <li>urn:alibaba:idaas:idp:tencent:wecom</li>
             * <li>urn:alibaba:idaas:idp:alibaba:aliyunram</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
             */
            public Builder authnSourceSupplier(String authnSourceSupplier) {
                this.authnSourceSupplier = authnSourceSupplier;
                return this;
            }

            /**
             * <p>Authentication method type.</p>
             * <ul>
             * <li>urn:alibaba:idaas:authntype:oidc</li>
             * <li>urn:alibaba:idaas:authntype:saml2</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:authntype:oidc</p>
             */
            public Builder authnSourceType(String authnSourceType) {
                this.authnSourceType = authnSourceType;
                return this;
            }

            /**
             * <p>Does the corresponding IdP support authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder authnStatus(String authnStatus) {
                this.authnStatus = authnStatus;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1712561597000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the Identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Identity provider external ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test_123xxx</p>
             */
            public Builder identityProviderExternalId(String identityProviderExternalId) {
                this.identityProviderExternalId = identityProviderExternalId;
                return this;
            }

            /**
             * <p>Identity provider ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idp_m5b5wd5s2hpq4t6iaehhXXX</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>Identity provider name.</p>
             * 
             * <strong>example:</strong>
             * <p>ceshi</p>
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * <p>Identity provider synchronization type.</p>
             * <ul>
             * <li><p>Inbound to DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:pull</p>
             * </li>
             * <li><p>Outbound to DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
             * </li>
             * <li><p>Inbound to WeCom: urn:alibaba:idaas:idp:tencent:wecom:pull</p>
             * </li>
             * <li><p>Inbound to Lark: urn:alibaba:idaas:idp:bytedance:lark:pull</p>
             * </li>
             * <li><p>Inbound to AD: urn:alibaba:idaas:idp:microsoft:ad:pull</p>
             * </li>
             * <li><p>Inbound to LDAP: urn:alibaba:idaas:idp:unknown:ldap:pull</p>
             * </li>
             * <li><p>Standard OIDC: urn:alibaba:idaas:idp:standard:oidc</p>
             * </li>
             * <li><p>SASE Custom OIDC: urn:alibaba:idaas:idp:alibaba:sase</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:idp:bytedance:lark:pull</p>
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * <p>Incremental callback status, whether to process the incremental callback data from IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_pbf4dth34l2qb7mydpntXXX</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Last status check result.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder lastStatusCheckJobResult(String lastStatusCheckJobResult) {
                this.lastStatusCheckJobResult = lastStatusCheckJobResult;
                return this;
            }

            /**
             * <p>The reason why write operations are locked.</p>
             * 
             * <strong>example:</strong>
             * <p>ConfigNotReady.UuidIsNul</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>IdP logo url.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cdn-cn-hangzhou.aliyunidaas.com/xx/logos/xx">https://cdn-cn-hangzhou.aliyunidaas.com/xx/logos/xx</a></p>
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * <p>Regular verification status.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder periodicSyncStatus(String periodicSyncStatus) {
                this.periodicSyncStatus = periodicSyncStatus;
                return this;
            }

            /**
             * <p>Whether support UD synchronization.Values:</p>
             * <ul>
             * <li>enabled</li>
             * <li>disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder udPullStatus(String udPullStatus) {
                this.udPullStatus = udPullStatus;
                return this;
            }

            /**
             * <p>When supporting the range in the UD of ud_pullIDaaS side.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_2buqmxsa3ltyqkjgpwfijurXXX</p>
             */
            public Builder udPullTargetScope(String udPullTargetScope) {
                this.udPullTargetScope = udPullTargetScope;
                return this;
            }

            /**
             * <p>Synchronize capabilities</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder udPushStatus(String udPushStatus) {
                this.udPushStatus = udPushStatus;
                return this;
            }

            /**
             * <p>The time when the service was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1712561597000</p>
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
