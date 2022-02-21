// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunExecutionPlanRequest} extends {@link RequestModel}
 *
 * <p>RunExecutionPlanRequest</p>
 */
public class RunExecutionPlanRequest extends Request {
    @Query
    @NameInMap("Arguments")
    private java.util.Map < String, ? > arguments;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private RunExecutionPlanRequest(Builder builder) {
        super(builder);
        this.arguments = builder.arguments;
        this.id = builder.id;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunExecutionPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arguments
     */
    public java.util.Map < String, ? > getArguments() {
        return this.arguments;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<RunExecutionPlanRequest, Builder> {
        private java.util.Map < String, ? > arguments; 
        private String id; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(RunExecutionPlanRequest response) {
            super(response);
            this.arguments = response.arguments;
            this.id = response.id;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * Arguments.
         */
        public Builder arguments(java.util.Map < String, ? > arguments) {
            this.putQueryParameter("Arguments", arguments);
            this.arguments = arguments;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public RunExecutionPlanRequest build() {
            return new RunExecutionPlanRequest(this);
        } 

    } 

}
