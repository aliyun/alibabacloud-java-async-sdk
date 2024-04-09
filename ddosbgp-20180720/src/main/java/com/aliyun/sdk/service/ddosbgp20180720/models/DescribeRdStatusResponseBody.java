// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdStatusResponseBody</p>
 */
public class DescribeRdStatusResponseBody extends TeaModel {
    @NameInMap("CurrentUid")
    private String currentUid;

    @NameInMap("CurrentUidType")
    private String currentUidType;

    @NameInMap("Enabled")
    private Boolean enabled;

    @NameInMap("LocalEnable")
    private Boolean localEnable;

    @NameInMap("MasterUid")
    private String masterUid;

    @NameInMap("RemoteEnable")
    private Boolean remoteEnable;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RootUid")
    private String rootUid;

    @NameInMap("ServicePrincipalEnabled")
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
         * CurrentUid.
         */
        public Builder currentUid(String currentUid) {
            this.currentUid = currentUid;
            return this;
        }

        /**
         * CurrentUidType.
         */
        public Builder currentUidType(String currentUidType) {
            this.currentUidType = currentUidType;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * LocalEnable.
         */
        public Builder localEnable(Boolean localEnable) {
            this.localEnable = localEnable;
            return this;
        }

        /**
         * MasterUid.
         */
        public Builder masterUid(String masterUid) {
            this.masterUid = masterUid;
            return this;
        }

        /**
         * RemoteEnable.
         */
        public Builder remoteEnable(Boolean remoteEnable) {
            this.remoteEnable = remoteEnable;
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
         * RootUid.
         */
        public Builder rootUid(String rootUid) {
            this.rootUid = rootUid;
            return this;
        }

        /**
         * ServicePrincipalEnabled.
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
