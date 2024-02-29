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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("FollowerId")
    @Validation(required = true)
    private Long followerId;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    private DeleteQualityFollowerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.followerId = builder.followerId;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return followerId
     */
    public Long getFollowerId() {
        return this.followerId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<DeleteQualityFollowerRequest, Builder> {
        private String regionId; 
        private Long followerId; 
        private Long projectId; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQualityFollowerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.followerId = request.followerId;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
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
         * The ID of the subscription relationship between the partition filter expression and the subscriber. You can call the [GetQualityFollower](~~174000~~) operation to obtain the ID of the subscription relationship.
         */
        public Builder followerId(Long followerId) {
            this.putBodyParameter("FollowerId", followerId);
            this.followerId = followerId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the compute engine or data source for which the partition filter expression is configured. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Monitoring Rules page of Data Quality to obtain the name.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public DeleteQualityFollowerRequest build() {
            return new DeleteQualityFollowerRequest(this);
        } 

    } 

}
