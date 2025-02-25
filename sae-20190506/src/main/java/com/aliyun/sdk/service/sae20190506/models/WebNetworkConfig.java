// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebNetworkConfig} extends {@link TeaModel}
 *
 * <p>WebNetworkConfig</p>
 */
public class WebNetworkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InternetAccess")
    private Boolean internetAccess;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(maxLength = 50)
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    private WebNetworkConfig(Builder builder) {
        this.internetAccess = builder.internetAccess;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchIds = builder.vSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebNetworkConfig create() {
        return builder().build();
    }

    /**
     * @return internetAccess
     */
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder {
        private Boolean internetAccess; 
        private String securityGroupId; 
        private java.util.List<String> vSwitchIds; 

        /**
         * InternetAccess.
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * VSwitchIds.
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        public WebNetworkConfig build() {
            return new WebNetworkConfig(this);
        } 

    } 

}
