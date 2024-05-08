// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationGroupRequest</p>
 */
public class CreateApplicationGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmsGroupId")
    private String cmsGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deployRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportTagKey")
    private String importTagKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportTagValue")
    private String importTagValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateApplicationGroupRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.clientToken = builder.clientToken;
        this.cmsGroupId = builder.cmsGroupId;
        this.deployRegionId = builder.deployRegionId;
        this.description = builder.description;
        this.importTagKey = builder.importTagKey;
        this.importTagValue = builder.importTagValue;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cmsGroupId
     */
    public String getCmsGroupId() {
        return this.cmsGroupId;
    }

    /**
     * @return deployRegionId
     */
    public String getDeployRegionId() {
        return this.deployRegionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return importTagKey
     */
    public String getImportTagKey() {
        return this.importTagKey;
    }

    /**
     * @return importTagValue
     */
    public String getImportTagValue() {
        return this.importTagValue;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateApplicationGroupRequest, Builder> {
        private String applicationName; 
        private String clientToken; 
        private String cmsGroupId; 
        private String deployRegionId; 
        private String description; 
        private String importTagKey; 
        private String importTagValue; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationGroupRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.clientToken = request.clientToken;
            this.cmsGroupId = request.cmsGroupId;
            this.deployRegionId = request.deployRegionId;
            this.description = request.description;
            this.importTagKey = request.importTagKey;
            this.importTagValue = request.importTagValue;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * The application name.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the application group in CloudMonitor.
         */
        public Builder cmsGroupId(String cmsGroupId) {
            this.putQueryParameter("CmsGroupId", cmsGroupId);
            this.cmsGroupId = cmsGroupId;
            return this;
        }

        /**
         * The ID of the region in which the related sources reside.
         */
        public Builder deployRegionId(String deployRegionId) {
            this.putQueryParameter("DeployRegionId", deployRegionId);
            this.deployRegionId = deployRegionId;
            return this;
        }

        /**
         * The description of the application group.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The key of the tag. You must set both the ImportTagKey and the ImportTagValue parameters, or leave both of them empty. If you do not set the ImportTagKey and ImportTagValue parameters, the application name is used for this parameter by default.
         */
        public Builder importTagKey(String importTagKey) {
            this.putQueryParameter("ImportTagKey", importTagKey);
            this.importTagKey = importTagKey;
            return this;
        }

        /**
         * The value of the tag. You must set both the ImportTagKey and the ImportTagValue parameters, or leave both of them empty. If you do not set the ImportTagKey and ImportTagValue parameters, the application group name is used for this parameter by default.
         */
        public Builder importTagValue(String importTagValue) {
            this.putQueryParameter("ImportTagValue", importTagValue);
            this.importTagValue = importTagValue;
            return this;
        }

        /**
         * The name of the application group.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The region ID. Set the value to cn-hangzhou.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateApplicationGroupRequest build() {
            return new CreateApplicationGroupRequest(this);
        } 

    } 

}
