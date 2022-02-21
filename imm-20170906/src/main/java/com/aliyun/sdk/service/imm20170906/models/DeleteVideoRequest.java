// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoRequest} extends {@link RequestModel}
 *
 * <p>DeleteVideoRequest</p>
 */
public class DeleteVideoRequest extends Request {
    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Resources")
    private Boolean resources;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    @Query
    @NameInMap("VideoUri")
    @Validation(required = true)
    private String videoUri;

    private DeleteVideoRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.resources = builder.resources;
        this.setId = builder.setId;
        this.videoUri = builder.videoUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVideoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resources
     */
    public Boolean getResources() {
        return this.resources;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return videoUri
     */
    public String getVideoUri() {
        return this.videoUri;
    }

    public static final class Builder extends Request.Builder<DeleteVideoRequest, Builder> {
        private String project; 
        private String regionId; 
        private Boolean resources; 
        private String setId; 
        private String videoUri; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVideoRequest response) {
            super(response);
            this.project = response.project;
            this.regionId = response.regionId;
            this.resources = response.resources;
            this.setId = response.setId;
            this.videoUri = response.videoUri;
        } 

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
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

        /**
         * Resources.
         */
        public Builder resources(Boolean resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.putQueryParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        /**
         * VideoUri.
         */
        public Builder videoUri(String videoUri) {
            this.putQueryParameter("VideoUri", videoUri);
            this.videoUri = videoUri;
            return this;
        }

        @Override
        public DeleteVideoRequest build() {
            return new DeleteVideoRequest(this);
        } 

    } 

}
