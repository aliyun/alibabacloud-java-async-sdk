// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationAuthorizationTypeRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationAuthorizationTypeRequest</p>
 */
public class UpdateApplicationAuthorizationTypeRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true, maxLength = 64)
    private String applicationId;

    @Query
    @NameInMap("AuthorizationType")
    @Validation(required = true, maxLength = 64)
    private String authorizationType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateApplicationAuthorizationTypeRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.authorizationType = builder.authorizationType;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationAuthorizationTypeRequest, Builder> {
        private String applicationId; 
        private String authorizationType; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationAuthorizationTypeRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.authorizationType = request.authorizationType;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * IDaaS的应用主键id
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * 应用的授权类型
         */
        public Builder authorizationType(String authorizationType) {
            this.putQueryParameter("AuthorizationType", authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * IDaaS EIAM的实例id
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public UpdateApplicationAuthorizationTypeRequest build() {
            return new UpdateApplicationAuthorizationTypeRequest(this);
        } 

    } 

}
