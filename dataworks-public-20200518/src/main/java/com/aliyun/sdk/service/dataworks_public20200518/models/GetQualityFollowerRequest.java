// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityFollowerRequest} extends {@link RequestModel}
 *
 * <p>GetQualityFollowerRequest</p>
 */
public class GetQualityFollowerRequest extends Request {
    @Body
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetQualityFollowerRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityFollowerRequest create() {
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

    public static final class Builder extends Request.Builder<GetQualityFollowerRequest, Builder> {
        private Long entityId; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityFollowerRequest request) {
            super(request);
            this.entityId = request.entityId;
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
        public GetQualityFollowerRequest build() {
            return new GetQualityFollowerRequest(this);
        } 

    } 

}
