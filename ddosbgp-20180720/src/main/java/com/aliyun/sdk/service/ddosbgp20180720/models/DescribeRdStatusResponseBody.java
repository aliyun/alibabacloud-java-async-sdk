// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRdStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdStatusResponseBody</p>
 */
public class DescribeRdStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentUid")
    private String currentUid;

    @com.aliyun.core.annotation.NameInMap("CurrentUidType")
    private String currentUidType;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("LocalEnable")
    private Boolean localEnable;

    @com.aliyun.core.annotation.NameInMap("MasterUid")
    private String masterUid;

    @com.aliyun.core.annotation.NameInMap("RemoteEnable")
    private Boolean remoteEnable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootUid")
    private String rootUid;

    @com.aliyun.core.annotation.NameInMap("ServicePrincipalEnabled")
    private Boolean servicePrincipalEnabled;

    private DescribeRdStatusResponseBody(Builder builder) {
        this.currentUid = builder.currentUid;
        this.currentUidType = builder.currentUidType;
        this.enabled = builder.enabled;
        this.localEnable = builder.localEnable;
        this.masterUid = builder.masterUid;
        this.remoteEnable = builder.remoteEnable;
        this.requestId = builder.requestId;
        this.rootUid = builder.rootUid;
        this.servicePrincipalEnabled = builder.servicePrincipalEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentUid
     */
    public String getCurrentUid() {
        return this.currentUid;
    }

    /**
     * @return currentUidType
     */
    public String getCurrentUidType() {
        return this.currentUidType;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return localEnable
     */
    public Boolean getLocalEnable() {
        return this.localEnable;
    }

    /**
     * @return masterUid
     */
    public String getMasterUid() {
        return this.masterUid;
    }

    /**
     * @return remoteEnable
     */
    public Boolean getRemoteEnable() {
        return this.remoteEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootUid
     */
    public String getRootUid() {
        return this.rootUid;
    }

    /**
     * @return servicePrincipalEnabled
     */
    public Boolean getServicePrincipalEnabled() {
        return this.servicePrincipalEnabled;
    }

    public static final class Builder {
        private String currentUid; 
        private String currentUidType; 
        private Boolean enabled; 
        private Boolean localEnable; 
        private String masterUid; 
        private Boolean remoteEnable; 
        private String requestId; 
        private String rootUid; 
        private Boolean servicePrincipalEnabled; 

        /**
         * <p>The Alibaba Cloud account ID of the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>125085778340****</p>
         */
        public Builder currentUid(String currentUid) {
            this.currentUid = currentUid;
            return this;
        }

        /**
         * <p>The type of the Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><strong>MasterAccount</strong>: management account</li>
         * <li><strong>DelegatedAdminAccount</strong>: delegated administrator account</li>
         * <li><strong>MasterAccount</strong>: member</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MemberAccount</p>
         */
        public Builder currentUidType(String currentUidType) {
            this.currentUidType = currentUidType;
            return this;
        }

        /**
         * <p>Indicates whether the multi-account management feature is enabled for Anti-DDoS Origin.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Indicates whether the multi-account management feature is enabled for the current account in Anti-DDoS Origin.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder localEnable(Boolean localEnable) {
            this.localEnable = localEnable;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the management account in the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>125085778340****</p>
         */
        public Builder masterUid(String masterUid) {
            this.masterUid = masterUid;
            return this;
        }

        /**
         * <p>Indicates whether Resource Directory is enabled in the <a href="https://resourcemanager.console.aliyun.com">Resource Management console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder remoteEnable(Boolean remoteEnable) {
            this.remoteEnable = remoteEnable;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1B0F7EC6-51D7-4D70-B0EC-CD8A9E998D86</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the management account for which the multi-account management feature is enabled in Anti-DDoS Origin.</p>
         * 
         * <strong>example:</strong>
         * <p>125085778340****</p>
         */
        public Builder rootUid(String rootUid) {
            this.rootUid = rootUid;
            return this;
        }

        /**
         * <p>Indicates whether the trusted service is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder servicePrincipalEnabled(Boolean servicePrincipalEnabled) {
            this.servicePrincipalEnabled = servicePrincipalEnabled;
            return this;
        }

        public DescribeRdStatusResponseBody build() {
            return new DescribeRdStatusResponseBody(this);
        } 

    } 

}
