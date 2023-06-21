// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationDescriptionRequest</p>
 */
public class UpdateApplicationDescriptionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true, maxLength = 64)
    private String applicationId;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 128)
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateApplicationDescriptionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationDescriptionRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationDescriptionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.description = request.description;
            this.instanceId = request.instanceId;
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
         * The ID of the application that you want to modify.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * The description of the application.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateApplicationDescriptionRequest build() {
            return new UpdateApplicationDescriptionRequest(this);
        } 

    } 

}
