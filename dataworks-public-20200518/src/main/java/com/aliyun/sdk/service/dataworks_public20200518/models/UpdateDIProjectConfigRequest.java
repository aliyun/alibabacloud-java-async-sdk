// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDIProjectConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateDIProjectConfigRequest</p>
 */
public class UpdateDIProjectConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DestinationType")
    @Validation(required = true)
    private String destinationType;

    @Query
    @NameInMap("ProjectConfig")
    @Validation(required = true)
    private String projectConfig;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    private UpdateDIProjectConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationType = builder.destinationType;
        this.projectConfig = builder.projectConfig;
        this.projectId = builder.projectId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDIProjectConfigRequest create() {
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
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return projectConfig
     */
    public String getProjectConfig() {
        return this.projectConfig;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<UpdateDIProjectConfigRequest, Builder> {
        private String regionId; 
        private String destinationType; 
        private String projectConfig; 
        private Long projectId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDIProjectConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationType = request.destinationType;
            this.projectConfig = request.projectConfig;
            this.projectId = request.projectId;
            this.sourceType = request.sourceType;
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
         * DestinationType.
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * ProjectConfig.
         */
        public Builder projectConfig(String projectConfig) {
            this.putQueryParameter("ProjectConfig", projectConfig);
            this.projectConfig = projectConfig;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public UpdateDIProjectConfigRequest build() {
            return new UpdateDIProjectConfigRequest(this);
        } 

    } 

}
