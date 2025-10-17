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
         * ComponentId.
         */
        public Builder componentId(String componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * ModifyMode.
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * SecurityGroups.
         */
        public Builder securityGroups(String securityGroups) {
            this.putQueryParameter("SecurityGroups", securityGroups);
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * SecurityIPArrayName.
         */
        public Builder securityIPArrayName(String securityIPArrayName) {
            this.putQueryParameter("SecurityIPArrayName", securityIPArrayName);
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }

        /**
         * SecurityIPList.
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
