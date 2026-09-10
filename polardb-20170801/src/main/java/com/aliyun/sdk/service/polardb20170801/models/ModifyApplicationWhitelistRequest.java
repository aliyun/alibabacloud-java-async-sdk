// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyApplicationWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyApplicationWhitelistRequest</p>
 */
public class ModifyApplicationWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    private String componentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroups")
    private String securityGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPArrayName")
    private String securityIPArrayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    private ModifyApplicationWhitelistRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.componentId = builder.componentId;
        this.modifyMode = builder.modifyMode;
        this.securityGroups = builder.securityGroups;
        this.securityIPArrayName = builder.securityIPArrayName;
        this.securityIPList = builder.securityIPList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return securityGroups
     */
    public String getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return securityIPArrayName
     */
    public String getSecurityIPArrayName() {
        return this.securityIPArrayName;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public static final class Builder extends Request.Builder<ModifyApplicationWhitelistRequest, Builder> {
        private String applicationId; 
        private String componentId; 
        private String modifyMode; 
        private String securityGroups; 
        private String securityIPArrayName; 
        private String securityIPList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApplicationWhitelistRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.componentId = request.componentId;
            this.modifyMode = request.modifyMode;
            this.securityGroups = request.securityGroups;
            this.securityIPArrayName = request.securityIPArrayName;
            this.securityIPList = request.securityIPList;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The ID of the application subcomponent. If you specify this parameter, the whitelist modification takes effect only for this subcomponent.</p>
         * 
         * <strong>example:</strong>
         * <p>pac-*******************</p>
         */
        public Builder componentId(String componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * <p>The method to modify the whitelist. Valid values:</p>
         * <ul>
         * <li><p><strong>Cover</strong>: Overwrites the original IP address whitelist. This is the default value.</p>
         * </li>
         * <li><p><strong>Append</strong>: Appends IP addresses.</p>
         * </li>
         * <li><p><strong>Delete</strong>: Deletes IP addresses.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Append</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * <p>The list of security group IDs. Separate multiple IDs with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-**************</p>
         */
        public Builder securityGroups(String securityGroups) {
            this.putQueryParameter("SecurityGroups", securityGroups);
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * <p>The name of the IP address group. The default value is <code>default</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder securityIPArrayName(String securityIPArrayName) {
            this.putQueryParameter("SecurityIPArrayName", securityIPArrayName);
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }

        /**
         * <p>The IP addresses for the whitelist. Separate multiple IP addresses with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,172.17.0.0/24</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        @Override
        public ModifyApplicationWhitelistRequest build() {
            return new ModifyApplicationWhitelistRequest(this);
        } 

    } 

}
