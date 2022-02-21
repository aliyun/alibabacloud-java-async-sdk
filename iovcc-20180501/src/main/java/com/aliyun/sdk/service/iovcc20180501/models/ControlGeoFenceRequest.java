// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlGeoFenceRequest} extends {@link RequestModel}
 *
 * <p>ControlGeoFenceRequest</p>
 */
public class ControlGeoFenceRequest extends Request {
    @Query
    @NameInMap("FenceId")
    @Validation(required = true)
    private Long fenceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Valid")
    @Validation(required = true)
    private Boolean valid;

    private ControlGeoFenceRequest(Builder builder) {
        super(builder);
        this.fenceId = builder.fenceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.valid = builder.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ControlGeoFenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fenceId
     */
    public Long getFenceId() {
        return this.fenceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return this.valid;
    }

    public static final class Builder extends Request.Builder<ControlGeoFenceRequest, Builder> {
        private Long fenceId; 
        private String projectId; 
        private String regionId; 
        private Boolean valid; 

        private Builder() {
            super();
        } 

        private Builder(ControlGeoFenceRequest response) {
            super(response);
            this.fenceId = response.fenceId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.valid = response.valid;
        } 

        /**
         * FenceId.
         */
        public Builder fenceId(Long fenceId) {
            this.putQueryParameter("FenceId", fenceId);
            this.fenceId = fenceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * Valid.
         */
        public Builder valid(Boolean valid) {
            this.putQueryParameter("Valid", valid);
            this.valid = valid;
            return this;
        }

        @Override
        public ControlGeoFenceRequest build() {
            return new ControlGeoFenceRequest(this);
        } 

    } 

}
