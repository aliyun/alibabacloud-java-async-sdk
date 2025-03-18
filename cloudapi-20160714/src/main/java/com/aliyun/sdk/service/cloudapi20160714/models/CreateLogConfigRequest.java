// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateLogConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateLogConfigRequest</p>
 */
public class CreateLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSlr")
    private Boolean createSlr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogType")
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsLogStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsLogStore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsProject;

    private CreateLogConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createSlr = builder.createSlr;
        this.logType = builder.logType;
        this.securityToken = builder.securityToken;
        this.slsLogStore = builder.slsLogStore;
        this.slsProject = builder.slsProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogConfigRequest create() {
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
     * @return createSlr
     */
    public Boolean getCreateSlr() {
        return this.createSlr;
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

    public static final class Builder extends Request.Builder<CreateLogConfigRequest, Builder> {
        private String regionId; 
        private Boolean createSlr; 
        private String logType; 
        private String securityToken; 
        private String slsLogStore; 
        private String slsProject; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createSlr = request.createSlr;
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
         * <p>Specifies to create a service-linked role.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder createSlr(Boolean createSlr) {
            this.putQueryParameter("CreateSlr", createSlr);
            this.createSlr = createSlr;
            return this;
        }

        /**
         * <p>The log type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PROVIDER</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROVIDER</p>
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
         * <p>slslogstore</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-gateway</p>
         */
        public Builder slsLogStore(String slsLogStore) {
            this.putQueryParameter("SlsLogStore", slsLogStore);
            this.slsLogStore = slsLogStore;
            return this;
        }

        /**
         * <p>The name of the Log Service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rec-lq-sls</p>
         */
        public Builder slsProject(String slsProject) {
            this.putQueryParameter("SlsProject", slsProject);
            this.slsProject = slsProject;
            return this;
        }

        @Override
        public CreateLogConfigRequest build() {
            return new CreateLogConfigRequest(this);
        } 

    } 

}
