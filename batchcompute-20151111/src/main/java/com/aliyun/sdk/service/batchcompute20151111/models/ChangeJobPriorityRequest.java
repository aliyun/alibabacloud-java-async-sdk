// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeJobPriorityRequest} extends {@link RequestModel}
 *
 * <p>ChangeJobPriorityRequest</p>
 */
public class ChangeJobPriorityRequest extends Request {
    @Path
    @NameInMap("ResourceName")
    @Validation(required = true)
    private String resourceName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ChangeJobPriorityRequest(Builder builder) {
        super(builder);
        this.resourceName = builder.resourceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeJobPriorityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ChangeJobPriorityRequest, Builder> {
        private String resourceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeJobPriorityRequest response) {
            super(response);
            this.resourceName = response.resourceName;
            this.regionId = response.regionId;
        } 

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putPathParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ChangeJobPriorityRequest build() {
            return new ChangeJobPriorityRequest(this);
        } 

    } 

}
