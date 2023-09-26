// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLogConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyLogConfigRequest</p>
 */
public class ModifyLogConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("LogType")
    private String logType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SlsLogStore")
    @Validation(required = true)
    private String slsLogStore;

    @Query
    @NameInMap("SlsProject")
    @Validation(required = true)
    private String slsProject;

    private ModifyLogConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.logType = builder.logType;
        this.securityToken = builder.securityToken;
        this.slsLogStore = builder.slsLogStore;
        this.slsProject = builder.slsProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return slsLogStore
     */
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    public static final class Builder extends Request.Builder<ModifyLogConfigRequest, Builder> {
        private String regionId; 
        private String logType; 
        private String securityToken; 
        private String slsLogStore; 
        private String slsProject; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLogConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.logType = request.logType;
            this.securityToken = request.securityToken;
            this.slsLogStore = request.slsLogStore;
            this.slsProject = request.slsProject;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SlsLogStore.
         */
        public Builder slsLogStore(String slsLogStore) {
            this.putQueryParameter("SlsLogStore", slsLogStore);
            this.slsLogStore = slsLogStore;
            return this;
        }

        /**
         * SlsProject.
         */
        public Builder slsProject(String slsProject) {
            this.putQueryParameter("SlsProject", slsProject);
            this.slsProject = slsProject;
            return this;
        }

        @Override
        public ModifyLogConfigRequest build() {
            return new ModifyLogConfigRequest(this);
        } 

    } 

}
