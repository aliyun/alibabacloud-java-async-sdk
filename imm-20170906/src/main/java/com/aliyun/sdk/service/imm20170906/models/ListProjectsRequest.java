// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectsRequest</p>
 */
public class ListProjectsRequest extends Request {
    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("MaxKeys")
    private Integer maxKeys;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListProjectsRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsRequest create() {
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
     * @return maxKeys
     */
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListProjectsRequest, Builder> {
        private String marker; 
        private Integer maxKeys; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectsRequest response) {
            super(response);
            this.marker = response.marker;
            this.maxKeys = response.maxKeys;
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
         * MaxKeys.
         */
        public Builder maxKeys(Integer maxKeys) {
            this.putQueryParameter("MaxKeys", maxKeys);
            this.maxKeys = maxKeys;
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
        public ListProjectsRequest build() {
            return new ListProjectsRequest(this);
        } 

    } 

}
