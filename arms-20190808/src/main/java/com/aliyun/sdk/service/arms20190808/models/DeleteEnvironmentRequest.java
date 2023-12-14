// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentRequest</p>
 */
public class DeleteEnvironmentRequest extends Request {
    @Query
    @NameInMap("DeletePromInstance")
    private Boolean deletePromInstance;

    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteEnvironmentRequest(Builder builder) {
        super(builder);
        this.deletePromInstance = builder.deletePromInstance;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletePromInstance
     */
    public Boolean getDeletePromInstance() {
        return this.deletePromInstance;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteEnvironmentRequest, Builder> {
        private Boolean deletePromInstance; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentRequest request) {
            super(request);
            this.deletePromInstance = request.deletePromInstance;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
        } 

        /**
         * cascade delete Prometheus instance.
         */
        public Builder deletePromInstance(Boolean deletePromInstance) {
            this.putQueryParameter("DeletePromInstance", deletePromInstance);
            this.deletePromInstance = deletePromInstance;
            return this;
        }

        /**
         * The ID of the environment instance.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteEnvironmentRequest build() {
            return new DeleteEnvironmentRequest(this);
        } 

    } 

}
