// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQualityEntityRequest} extends {@link RequestModel}
 *
 * <p>DeleteQualityEntityRequest</p>
 */
public class DeleteQualityEntityRequest extends Request {
    @Body
    @NameInMap("EntityId")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Long entityId;

    @Body
    @NameInMap("EnvType")
    @Validation(required = true)
    private String envType;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteQualityEntityRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.envType = builder.envType;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQualityEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteQualityEntityRequest, Builder> {
        private Long entityId; 
        private String envType; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQualityEntityRequest request) {
            super(request);
            this.entityId = request.entityId;
            this.envType = request.envType;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
        } 

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteQualityEntityRequest build() {
            return new DeleteQualityEntityRequest(this);
        } 

    } 

}
