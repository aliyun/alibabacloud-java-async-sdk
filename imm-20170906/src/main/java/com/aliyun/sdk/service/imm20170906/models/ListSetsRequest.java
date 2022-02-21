// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSetsRequest} extends {@link RequestModel}
 *
 * <p>ListSetsRequest</p>
 */
public class ListSetsRequest extends Request {
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

    private ListSetsRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.project = builder.project;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSetsRequest create() {
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

    public static final class Builder extends Request.Builder<ListSetsRequest, Builder> {
        private String marker; 
        private String project; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSetsRequest response) {
            super(response);
            this.marker = response.marker;
            this.project = response.project;
            this.regionId = response.regionId;
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

        @Override
        public ListSetsRequest build() {
            return new ListSetsRequest(this);
        } 

    } 

}
