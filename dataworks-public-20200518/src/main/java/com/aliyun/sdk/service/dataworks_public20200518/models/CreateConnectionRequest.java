// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateConnectionRequest</p>
 */
public class CreateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubType")
    private String subType;

    private CreateConnectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connectionType = builder.connectionType;
        this.content = builder.content;
        this.description = builder.description;
        this.envType = builder.envType;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionRequest create() {
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
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    public static final class Builder extends Request.Builder<CreateConnectionRequest, Builder> {
        private String regionId; 
        private String connectionType; 
        private String content; 
        private String description; 
        private Integer envType; 
        private String name; 
        private Long projectId; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connectionType = request.connectionType;
            this.content = request.content;
            this.description = request.description;
            this.envType = request.envType;
            this.name = request.name;
            this.projectId = request.projectId;
            this.subType = request.subType;
        } 

        /**
         * The ID of the region where your project resides.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the connection string.
         */
        public Builder connectionType(String connectionType) {
            this.putQueryParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Details of the data source.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The description of the connection string.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Environment of the data source.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the workspace to be associated with the data source.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The sub-type of a connection string.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        @Override
        public CreateConnectionRequest build() {
            return new CreateConnectionRequest(this);
        } 

    } 

}
