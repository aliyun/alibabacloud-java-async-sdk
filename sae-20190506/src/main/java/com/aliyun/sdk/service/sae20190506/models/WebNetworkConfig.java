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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(WebNetworkConfig model) {
            this.internetAccess = model.internetAccess;
            this.securityGroupId = model.securityGroupId;
            this.vSwitchIds = model.vSwitchIds;
        } 

        /**
         * <p>Specifies whether to enable Internet access for the application. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables Internet access.</li>
         * <li><strong>false</strong>: disables Internet access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * <p>The ID of a security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp18hj1wtxgy3b0***</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The list of vSwitches.</p>
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
