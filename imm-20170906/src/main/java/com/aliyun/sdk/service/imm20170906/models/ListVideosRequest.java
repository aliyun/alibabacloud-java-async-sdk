// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideosRequest} extends {@link RequestModel}
 *
 * <p>ListVideosRequest</p>
 */
public class ListVideosRequest extends Request {
    @Query
    @NameInMap("CreateTimeStart")
    private String createTimeStart;

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

    private ListVideosRequest(Builder builder) {
        super(builder);
        this.createTimeStart = builder.createTimeStart;
        this.marker = builder.marker;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVideosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
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

    public static final class Builder extends Request.Builder<ListVideosRequest, Builder> {
        private String createTimeStart; 
        private String marker; 
        private String project; 
        private String regionId; 
        private String setId; 

        private Builder() {
            super();
        } 

        private Builder(ListVideosRequest response) {
            super(response);
            this.createTimeStart = response.createTimeStart;
            this.marker = response.marker;
            this.project = response.project;
            this.regionId = response.regionId;
            this.setId = response.setId;
        } 

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
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

        @Override
        public ListVideosRequest build() {
            return new ListVideosRequest(this);
        } 

    } 

}
