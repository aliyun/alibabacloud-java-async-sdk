// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationGroupRequest</p>
 */
public class CreateApplicationGroupRequest extends Request {
    @Query
    @NameInMap("ApplicationName")
    @Validation(required = true)
    private String applicationName;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DeployRegionId")
    @Validation(required = true)
    private String deployRegionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImportTagKey")
    private String importTagKey;

    @Query
    @NameInMap("ImportTagValue")
    private String importTagValue;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateApplicationGroupRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.clientToken = builder.clientToken;
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
        private String deployRegionId; 
        private String description; 
        private String importTagKey; 
        private String importTagValue; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationGroupRequest response) {
            super(response);
            this.applicationName = response.applicationName;
            this.clientToken = response.clientToken;
            this.deployRegionId = response.deployRegionId;
            this.description = response.description;
            this.importTagKey = response.importTagKey;
            this.importTagValue = response.importTagValue;
            this.name = response.name;
            this.regionId = response.regionId;
        } 

        /**
         * ApplicationName.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DeployRegionId.
         */
        public Builder deployRegionId(String deployRegionId) {
            this.putQueryParameter("DeployRegionId", deployRegionId);
            this.deployRegionId = deployRegionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ImportTagKey.
         */
        public Builder importTagKey(String importTagKey) {
            this.putQueryParameter("ImportTagKey", importTagKey);
            this.importTagKey = importTagKey;
            return this;
        }

        /**
         * ImportTagValue.
         */
        public Builder importTagValue(String importTagValue) {
            this.putQueryParameter("ImportTagValue", importTagValue);
            this.importTagValue = importTagValue;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
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
