// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationAuthorizationTypeRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationAuthorizationTypeRequest</p>
 */
public class UpdateApplicationAuthorizationTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateApplicationAuthorizationTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.authorizationType = builder.authorizationType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationAuthorizationTypeRequest create() {
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
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationAuthorizationTypeRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String authorizationType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationAuthorizationTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.authorizationType = request.authorizationType;
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
         * The authorization type of the application. Valid values:
         * <p>
         * 
         * *   authorize_required: Only the user with explicit authorization can access the application.
         * *   default_all: By default, all users can access the application.
         */
        public Builder authorizationType(String authorizationType) {
            this.putQueryParameter("AuthorizationType", authorizationType);
            this.authorizationType = authorizationType;
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
        public UpdateApplicationAuthorizationTypeRequest build() {
            return new UpdateApplicationAuthorizationTypeRequest(this);
        } 

    } 

}
