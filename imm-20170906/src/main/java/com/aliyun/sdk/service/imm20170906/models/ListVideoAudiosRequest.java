// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideoAudiosRequest} extends {@link RequestModel}
 *
 * <p>ListVideoAudiosRequest</p>
 */
public class ListVideoAudiosRequest extends Request {
    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    @Query
    @NameInMap("VideoUri")
    @Validation(required = true)
    private String videoUri;

    private ListVideoAudiosRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.setId = builder.setId;
        this.videoUri = builder.videoUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVideoAudiosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
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

    public static final class Builder extends Request.Builder<ListVideoAudiosRequest, Builder> {
        private String marker; 
        private String project; 
        private String regionId; 
        private String setId; 
        private String videoUri; 

        private Builder() {
            super();
        } 

        private Builder(ListVideoAudiosRequest response) {
            super(response);
            this.marker = response.marker;
            this.project = response.project;
            this.regionId = response.regionId;
            this.setId = response.setId;
            this.videoUri = response.videoUri;
        } 

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
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
        public ListVideoAudiosRequest build() {
            return new ListVideoAudiosRequest(this);
        } 

    } 

}
