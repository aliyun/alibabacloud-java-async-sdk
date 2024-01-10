// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationRequest</p>
 */
public class DeleteApplicationRequest extends Request {
    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RetainResource")
    private Boolean retainResource;

    private DeleteApplicationRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.retainResource = builder.retainResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retainResource
     */
    public Boolean getRetainResource() {
        return this.retainResource;
    }

    public static final class Builder extends Request.Builder<DeleteApplicationRequest, Builder> {
        private Boolean force; 
        private String name; 
        private String regionId; 
        private Boolean retainResource; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationRequest request) {
            super(request);
            this.force = request.force;
            this.name = request.name;
            this.regionId = request.regionId;
            this.retainResource = request.retainResource;
        } 

        /**
         * Specifies whether to forcibly delete the application. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The application name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The region ID. Set the value to cn-hangzhou.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to retain resources created by application manager when deleting the application. Valid values:
         * <p>
         * - true
         * - false
         */
        public Builder retainResource(Boolean retainResource) {
            this.putQueryParameter("RetainResource", retainResource);
            this.retainResource = retainResource;
            return this;
        }

        @Override
        public DeleteApplicationRequest build() {
            return new DeleteApplicationRequest(this);
        } 

    } 

}
