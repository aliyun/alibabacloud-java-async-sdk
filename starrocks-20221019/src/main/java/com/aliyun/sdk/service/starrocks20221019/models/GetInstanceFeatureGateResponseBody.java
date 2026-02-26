// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link GetInstanceFeatureGateResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceFeatureGateResponseBody</p>
 */
public class GetInstanceFeatureGateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetInstanceFeatureGateResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceFeatureGateResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(GetInstanceFeatureGateResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>AccessDeniedDetail</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetInstanceFeatureGateResponseBody build() {
            return new GetInstanceFeatureGateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceFeatureGateResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceFeatureGateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsoleControlRestart")
        private Boolean consoleControlRestart;

        @com.aliyun.core.annotation.NameInMap("EnableManageMv")
        private Boolean enableManageMv;

        @com.aliyun.core.annotation.NameInMap("FullManagedSecurityGroup")
        private Boolean fullManagedSecurityGroup;

        @com.aliyun.core.annotation.NameInMap("MountDlfMetaToken")
        private Boolean mountDlfMetaToken;

        @com.aliyun.core.annotation.NameInMap("SupportAddConfigTypes")
        private java.util.List<String> supportAddConfigTypes;

        @com.aliyun.core.annotation.NameInMap("SupportBackup")
        private Boolean supportBackup;

        @com.aliyun.core.annotation.NameInMap("SupportCreateAgent")
        private Boolean supportCreateAgent;

        @com.aliyun.core.annotation.NameInMap("SupportCreateNonStandardNodeGroup")
        private Boolean supportCreateNonStandardNodeGroup;

        @com.aliyun.core.annotation.NameInMap("SupportEed")
        private Boolean supportEed;

        @com.aliyun.core.annotation.NameInMap("SupportEnableAi")
        private Boolean supportEnableAi;

        @com.aliyun.core.annotation.NameInMap("SupportEnableSSL")
        private Boolean supportEnableSSL;

        @com.aliyun.core.annotation.NameInMap("SupportFastModeModifyConfig")
        private Boolean supportFastModeModifyConfig;

        @com.aliyun.core.annotation.NameInMap("SupportFastModeModifyResource")
        private Boolean supportFastModeModifyResource;

        @com.aliyun.core.annotation.NameInMap("SupportFastRestart")
        private Boolean supportFastRestart;

        @com.aliyun.core.annotation.NameInMap("SupportFeGateway")
        private Boolean supportFeGateway;

        @com.aliyun.core.annotation.NameInMap("SupportHostAlias")
        private Boolean supportHostAlias;

        @com.aliyun.core.annotation.NameInMap("SupportModifyTimezone")
        private Boolean supportModifyTimezone;

        @com.aliyun.core.annotation.NameInMap("SupportMultiAZ")
        private Boolean supportMultiAZ;

        @com.aliyun.core.annotation.NameInMap("UseComputeNode")
        private Boolean useComputeNode;

        @com.aliyun.core.annotation.NameInMap("supportCompactionService")
        private Boolean supportCompactionService;

        private Data(Builder builder) {
            this.consoleControlRestart = builder.consoleControlRestart;
            this.enableManageMv = builder.enableManageMv;
            this.fullManagedSecurityGroup = builder.fullManagedSecurityGroup;
            this.mountDlfMetaToken = builder.mountDlfMetaToken;
            this.supportAddConfigTypes = builder.supportAddConfigTypes;
            this.supportBackup = builder.supportBackup;
            this.supportCreateAgent = builder.supportCreateAgent;
            this.supportCreateNonStandardNodeGroup = builder.supportCreateNonStandardNodeGroup;
            this.supportEed = builder.supportEed;
            this.supportEnableAi = builder.supportEnableAi;
            this.supportEnableSSL = builder.supportEnableSSL;
            this.supportFastModeModifyConfig = builder.supportFastModeModifyConfig;
            this.supportFastModeModifyResource = builder.supportFastModeModifyResource;
            this.supportFastRestart = builder.supportFastRestart;
            this.supportFeGateway = builder.supportFeGateway;
            this.supportHostAlias = builder.supportHostAlias;
            this.supportModifyTimezone = builder.supportModifyTimezone;
            this.supportMultiAZ = builder.supportMultiAZ;
            this.useComputeNode = builder.useComputeNode;
            this.supportCompactionService = builder.supportCompactionService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consoleControlRestart
         */
        public Boolean getConsoleControlRestart() {
            return this.consoleControlRestart;
        }

        /**
         * @return enableManageMv
         */
        public Boolean getEnableManageMv() {
            return this.enableManageMv;
        }

        /**
         * @return fullManagedSecurityGroup
         */
        public Boolean getFullManagedSecurityGroup() {
            return this.fullManagedSecurityGroup;
        }

        /**
         * @return mountDlfMetaToken
         */
        public Boolean getMountDlfMetaToken() {
            return this.mountDlfMetaToken;
        }

        /**
         * @return supportAddConfigTypes
         */
        public java.util.List<String> getSupportAddConfigTypes() {
            return this.supportAddConfigTypes;
        }

        /**
         * @return supportBackup
         */
        public Boolean getSupportBackup() {
            return this.supportBackup;
        }

        /**
         * @return supportCreateAgent
         */
        public Boolean getSupportCreateAgent() {
            return this.supportCreateAgent;
        }

        /**
         * @return supportCreateNonStandardNodeGroup
         */
        public Boolean getSupportCreateNonStandardNodeGroup() {
            return this.supportCreateNonStandardNodeGroup;
        }

        /**
         * @return supportEed
         */
        public Boolean getSupportEed() {
            return this.supportEed;
        }

        /**
         * @return supportEnableAi
         */
        public Boolean getSupportEnableAi() {
            return this.supportEnableAi;
        }

        /**
         * @return supportEnableSSL
         */
        public Boolean getSupportEnableSSL() {
            return this.supportEnableSSL;
        }

        /**
         * @return supportFastModeModifyConfig
         */
        public Boolean getSupportFastModeModifyConfig() {
            return this.supportFastModeModifyConfig;
        }

        /**
         * @return supportFastModeModifyResource
         */
        public Boolean getSupportFastModeModifyResource() {
            return this.supportFastModeModifyResource;
        }

        /**
         * @return supportFastRestart
         */
        public Boolean getSupportFastRestart() {
            return this.supportFastRestart;
        }

        /**
         * @return supportFeGateway
         */
        public Boolean getSupportFeGateway() {
            return this.supportFeGateway;
        }

        /**
         * @return supportHostAlias
         */
        public Boolean getSupportHostAlias() {
            return this.supportHostAlias;
        }

        /**
         * @return supportModifyTimezone
         */
        public Boolean getSupportModifyTimezone() {
            return this.supportModifyTimezone;
        }

        /**
         * @return supportMultiAZ
         */
        public Boolean getSupportMultiAZ() {
            return this.supportMultiAZ;
        }

        /**
         * @return useComputeNode
         */
        public Boolean getUseComputeNode() {
            return this.useComputeNode;
        }

        /**
         * @return supportCompactionService
         */
        public Boolean getSupportCompactionService() {
            return this.supportCompactionService;
        }

        public static final class Builder {
            private Boolean consoleControlRestart; 
            private Boolean enableManageMv; 
            private Boolean fullManagedSecurityGroup; 
            private Boolean mountDlfMetaToken; 
            private java.util.List<String> supportAddConfigTypes; 
            private Boolean supportBackup; 
            private Boolean supportCreateAgent; 
            private Boolean supportCreateNonStandardNodeGroup; 
            private Boolean supportEed; 
            private Boolean supportEnableAi; 
            private Boolean supportEnableSSL; 
            private Boolean supportFastModeModifyConfig; 
            private Boolean supportFastModeModifyResource; 
            private Boolean supportFastRestart; 
            private Boolean supportFeGateway; 
            private Boolean supportHostAlias; 
            private Boolean supportModifyTimezone; 
            private Boolean supportMultiAZ; 
            private Boolean useComputeNode; 
            private Boolean supportCompactionService; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consoleControlRestart = model.consoleControlRestart;
                this.enableManageMv = model.enableManageMv;
                this.fullManagedSecurityGroup = model.fullManagedSecurityGroup;
                this.mountDlfMetaToken = model.mountDlfMetaToken;
                this.supportAddConfigTypes = model.supportAddConfigTypes;
                this.supportBackup = model.supportBackup;
                this.supportCreateAgent = model.supportCreateAgent;
                this.supportCreateNonStandardNodeGroup = model.supportCreateNonStandardNodeGroup;
                this.supportEed = model.supportEed;
                this.supportEnableAi = model.supportEnableAi;
                this.supportEnableSSL = model.supportEnableSSL;
                this.supportFastModeModifyConfig = model.supportFastModeModifyConfig;
                this.supportFastModeModifyResource = model.supportFastModeModifyResource;
                this.supportFastRestart = model.supportFastRestart;
                this.supportFeGateway = model.supportFeGateway;
                this.supportHostAlias = model.supportHostAlias;
                this.supportModifyTimezone = model.supportModifyTimezone;
                this.supportMultiAZ = model.supportMultiAZ;
                this.useComputeNode = model.useComputeNode;
                this.supportCompactionService = model.supportCompactionService;
            } 

            /**
             * ConsoleControlRestart.
             */
            public Builder consoleControlRestart(Boolean consoleControlRestart) {
                this.consoleControlRestart = consoleControlRestart;
                return this;
            }

            /**
             * EnableManageMv.
             */
            public Builder enableManageMv(Boolean enableManageMv) {
                this.enableManageMv = enableManageMv;
                return this;
            }

            /**
             * FullManagedSecurityGroup.
             */
            public Builder fullManagedSecurityGroup(Boolean fullManagedSecurityGroup) {
                this.fullManagedSecurityGroup = fullManagedSecurityGroup;
                return this;
            }

            /**
             * MountDlfMetaToken.
             */
            public Builder mountDlfMetaToken(Boolean mountDlfMetaToken) {
                this.mountDlfMetaToken = mountDlfMetaToken;
                return this;
            }

            /**
             * SupportAddConfigTypes.
             */
            public Builder supportAddConfigTypes(java.util.List<String> supportAddConfigTypes) {
                this.supportAddConfigTypes = supportAddConfigTypes;
                return this;
            }

            /**
             * SupportBackup.
             */
            public Builder supportBackup(Boolean supportBackup) {
                this.supportBackup = supportBackup;
                return this;
            }

            /**
             * SupportCreateAgent.
             */
            public Builder supportCreateAgent(Boolean supportCreateAgent) {
                this.supportCreateAgent = supportCreateAgent;
                return this;
            }

            /**
             * SupportCreateNonStandardNodeGroup.
             */
            public Builder supportCreateNonStandardNodeGroup(Boolean supportCreateNonStandardNodeGroup) {
                this.supportCreateNonStandardNodeGroup = supportCreateNonStandardNodeGroup;
                return this;
            }

            /**
             * SupportEed.
             */
            public Builder supportEed(Boolean supportEed) {
                this.supportEed = supportEed;
                return this;
            }

            /**
             * SupportEnableAi.
             */
            public Builder supportEnableAi(Boolean supportEnableAi) {
                this.supportEnableAi = supportEnableAi;
                return this;
            }

            /**
             * SupportEnableSSL.
             */
            public Builder supportEnableSSL(Boolean supportEnableSSL) {
                this.supportEnableSSL = supportEnableSSL;
                return this;
            }

            /**
             * SupportFastModeModifyConfig.
             */
            public Builder supportFastModeModifyConfig(Boolean supportFastModeModifyConfig) {
                this.supportFastModeModifyConfig = supportFastModeModifyConfig;
                return this;
            }

            /**
             * SupportFastModeModifyResource.
             */
            public Builder supportFastModeModifyResource(Boolean supportFastModeModifyResource) {
                this.supportFastModeModifyResource = supportFastModeModifyResource;
                return this;
            }

            /**
             * SupportFastRestart.
             */
            public Builder supportFastRestart(Boolean supportFastRestart) {
                this.supportFastRestart = supportFastRestart;
                return this;
            }

            /**
             * SupportFeGateway.
             */
            public Builder supportFeGateway(Boolean supportFeGateway) {
                this.supportFeGateway = supportFeGateway;
                return this;
            }

            /**
             * SupportHostAlias.
             */
            public Builder supportHostAlias(Boolean supportHostAlias) {
                this.supportHostAlias = supportHostAlias;
                return this;
            }

            /**
             * SupportModifyTimezone.
             */
            public Builder supportModifyTimezone(Boolean supportModifyTimezone) {
                this.supportModifyTimezone = supportModifyTimezone;
                return this;
            }

            /**
             * SupportMultiAZ.
             */
            public Builder supportMultiAZ(Boolean supportMultiAZ) {
                this.supportMultiAZ = supportMultiAZ;
                return this;
            }

            /**
             * UseComputeNode.
             */
            public Builder useComputeNode(Boolean useComputeNode) {
                this.useComputeNode = useComputeNode;
                return this;
            }

            /**
             * supportCompactionService.
             */
            public Builder supportCompactionService(Boolean supportCompactionService) {
                this.supportCompactionService = supportCompactionService;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
