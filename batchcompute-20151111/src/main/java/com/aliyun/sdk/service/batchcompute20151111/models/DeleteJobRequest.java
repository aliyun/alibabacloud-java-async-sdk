// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobRequest</p>
 */
public class DeleteJobRequest extends Request {
    @Path
    @NameInMap("ResourceName")
    @Validation(required = true)
    private String resourceName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteJobRequest(Builder builder) {
        super(builder);
        this.resourceName = builder.resourceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteJobRequest, Builder> {
        private String resourceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobRequest response) {
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
        public DeleteJobRequest build() {
            return new DeleteJobRequest(this);
        } 

    } 

}
