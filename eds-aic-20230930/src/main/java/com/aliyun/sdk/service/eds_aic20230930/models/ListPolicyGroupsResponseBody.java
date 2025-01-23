// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ListPolicyGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicyGroupsResponseBody</p>
 */
public class ListPolicyGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PolicyGroupModel")
    private java.util.List<PolicyGroupModel> policyGroupModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPolicyGroupsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.policyGroupModel = builder.policyGroupModel;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return policyGroupModel
     */
    public java.util.List<PolicyGroupModel> getPolicyGroupModel() {
        return this.policyGroupModel;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<PolicyGroupModel> policyGroupModel; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PolicyGroupModel.
         */
        public Builder policyGroupModel(java.util.List<PolicyGroupModel> policyGroupModel) {
            this.policyGroupModel = policyGroupModel;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPolicyGroupsResponseBody build() {
            return new ListPolicyGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicyGroupsResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        private Rules(Builder builder) {
            this.ruleType = builder.ruleType;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String ruleType; 
            private String target; 

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicyGroupsResponseBody</p>
     */
    public static class NetRedirectPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomProxy")
        private String customProxy;

        @com.aliyun.core.annotation.NameInMap("HostAddr")
        private String hostAddr;

        @com.aliyun.core.annotation.NameInMap("NetRedirect")
        private String netRedirect;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ProxyPassword")
        private String proxyPassword;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        @com.aliyun.core.annotation.NameInMap("ProxyUserName")
        private String proxyUserName;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private NetRedirectPolicy(Builder builder) {
            this.customProxy = builder.customProxy;
            this.hostAddr = builder.hostAddr;
            this.netRedirect = builder.netRedirect;
            this.port = builder.port;
            this.proxyPassword = builder.proxyPassword;
            this.proxyType = builder.proxyType;
            this.proxyUserName = builder.proxyUserName;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetRedirectPolicy create() {
            return builder().build();
        }

        /**
         * @return customProxy
         */
        public String getCustomProxy() {
            return this.customProxy;
        }

        /**
         * @return hostAddr
         */
        public String getHostAddr() {
            return this.hostAddr;
        }

        /**
         * @return netRedirect
         */
        public String getNetRedirect() {
            return this.netRedirect;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return proxyPassword
         */
        public String getProxyPassword() {
            return this.proxyPassword;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        /**
         * @return proxyUserName
         */
        public String getProxyUserName() {
            return this.proxyUserName;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String customProxy; 
            private String hostAddr; 
            private String netRedirect; 
            private String port; 
            private String proxyPassword; 
            private String proxyType; 
            private String proxyUserName; 
            private java.util.List<Rules> rules; 

            /**
             * CustomProxy.
             */
            public Builder customProxy(String customProxy) {
                this.customProxy = customProxy;
                return this;
            }

            /**
             * HostAddr.
             */
            public Builder hostAddr(String hostAddr) {
                this.hostAddr = hostAddr;
                return this;
            }

            /**
             * NetRedirect.
             */
            public Builder netRedirect(String netRedirect) {
                this.netRedirect = netRedirect;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * ProxyPassword.
             */
            public Builder proxyPassword(String proxyPassword) {
                this.proxyPassword = proxyPassword;
                return this;
            }

            /**
             * ProxyType.
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * ProxyUserName.
             */
            public Builder proxyUserName(String proxyUserName) {
                this.proxyUserName = proxyUserName;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public NetRedirectPolicy build() {
                return new NetRedirectPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPolicyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicyGroupsResponseBody</p>
     */
    public static class PolicyGroupModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CameraRedirect")
        private String cameraRedirect;

        @com.aliyun.core.annotation.NameInMap("Clipboard")
        private String clipboard;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Html5FileTransfer")
        private String html5FileTransfer;

        @com.aliyun.core.annotation.NameInMap("LocalDrive")
        private String localDrive;

        @com.aliyun.core.annotation.NameInMap("LockResolution")
        private String lockResolution;

        @com.aliyun.core.annotation.NameInMap("NetRedirectPolicy")
        private NetRedirectPolicy netRedirectPolicy;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupName")
        private String policyGroupName;

        @com.aliyun.core.annotation.NameInMap("SessionResolutionHeight")
        private Integer sessionResolutionHeight;

        @com.aliyun.core.annotation.NameInMap("SessionResolutionWidth")
        private Integer sessionResolutionWidth;

        private PolicyGroupModel(Builder builder) {
            this.cameraRedirect = builder.cameraRedirect;
            this.clipboard = builder.clipboard;
            this.gmtCreate = builder.gmtCreate;
            this.html5FileTransfer = builder.html5FileTransfer;
            this.localDrive = builder.localDrive;
            this.lockResolution = builder.lockResolution;
            this.netRedirectPolicy = builder.netRedirectPolicy;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupName = builder.policyGroupName;
            this.sessionResolutionHeight = builder.sessionResolutionHeight;
            this.sessionResolutionWidth = builder.sessionResolutionWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyGroupModel create() {
            return builder().build();
        }

        /**
         * @return cameraRedirect
         */
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        /**
         * @return clipboard
         */
        public String getClipboard() {
            return this.clipboard;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return html5FileTransfer
         */
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        /**
         * @return localDrive
         */
        public String getLocalDrive() {
            return this.localDrive;
        }

        /**
         * @return lockResolution
         */
        public String getLockResolution() {
            return this.lockResolution;
        }

        /**
         * @return netRedirectPolicy
         */
        public NetRedirectPolicy getNetRedirectPolicy() {
            return this.netRedirectPolicy;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return policyGroupName
         */
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        /**
         * @return sessionResolutionHeight
         */
        public Integer getSessionResolutionHeight() {
            return this.sessionResolutionHeight;
        }

        /**
         * @return sessionResolutionWidth
         */
        public Integer getSessionResolutionWidth() {
            return this.sessionResolutionWidth;
        }

        public static final class Builder {
            private String cameraRedirect; 
            private String clipboard; 
            private String gmtCreate; 
            private String html5FileTransfer; 
            private String localDrive; 
            private String lockResolution; 
            private NetRedirectPolicy netRedirectPolicy; 
            private String policyGroupId; 
            private String policyGroupName; 
            private Integer sessionResolutionHeight; 
            private Integer sessionResolutionWidth; 

            /**
             * CameraRedirect.
             */
            public Builder cameraRedirect(String cameraRedirect) {
                this.cameraRedirect = cameraRedirect;
                return this;
            }

            /**
             * Clipboard.
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
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
             * Html5FileTransfer.
             */
            public Builder html5FileTransfer(String html5FileTransfer) {
                this.html5FileTransfer = html5FileTransfer;
                return this;
            }

            /**
             * LocalDrive.
             */
            public Builder localDrive(String localDrive) {
                this.localDrive = localDrive;
                return this;
            }

            /**
             * LockResolution.
             */
            public Builder lockResolution(String lockResolution) {
                this.lockResolution = lockResolution;
                return this;
            }

            /**
             * NetRedirectPolicy.
             */
            public Builder netRedirectPolicy(NetRedirectPolicy netRedirectPolicy) {
                this.netRedirectPolicy = netRedirectPolicy;
                return this;
            }

            /**
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * PolicyGroupName.
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * SessionResolutionHeight.
             */
            public Builder sessionResolutionHeight(Integer sessionResolutionHeight) {
                this.sessionResolutionHeight = sessionResolutionHeight;
                return this;
            }

            /**
             * SessionResolutionWidth.
             */
            public Builder sessionResolutionWidth(Integer sessionResolutionWidth) {
                this.sessionResolutionWidth = sessionResolutionWidth;
                return this;
            }

            public PolicyGroupModel build() {
                return new PolicyGroupModel(this);
            } 

        } 

    }
}
