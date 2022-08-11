// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQualityFollowerRequest} extends {@link RequestModel}
 *
 * <p>DeleteQualityFollowerRequest</p>
 */
public class DeleteQualityFollowerRequest extends Request {
    @Body
    @NameInMap("FollowerId")
    @Validation(required = true)
    private Long followerId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteQualityFollowerRequest(Builder builder) {
        super(builder);
        this.followerId = builder.followerId;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQualityFollowerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return followerId
     */
    public Long getFollowerId() {
        return this.followerId;
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

    public static final class Builder extends Request.Builder<DeleteQualityFollowerRequest, Builder> {
        private Long followerId; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQualityFollowerRequest request) {
            super(request);
            this.followerId = request.followerId;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
        } 

        /**
         * FollowerId.
         */
        public Builder followerId(Long followerId) {
            this.putBodyParameter("FollowerId", followerId);
            this.followerId = followerId;
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
        public DeleteQualityFollowerRequest build() {
            return new DeleteQualityFollowerRequest(this);
        } 

    } 

}
