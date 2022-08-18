// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetApplicationGrantScopeRequest} extends {@link RequestModel}
 *
 * <p>SetApplicationGrantScopeRequest</p>
 */
public class SetApplicationGrantScopeRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true, maxLength = 64)
    private String applicationId;

    @Query
    @NameInMap("GrantScopes")
    private java.util.List < String > grantScopes;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private SetApplicationGrantScopeRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.grantScopes = builder.grantScopes;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetApplicationGrantScopeRequest create() {
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
     * @return grantScopes
     */
    public java.util.List < String > getGrantScopes() {
        return this.grantScopes;
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

    public static final class Builder extends Request.Builder<SetApplicationGrantScopeRequest, Builder> {
        private String applicationId; 
        private java.util.List < String > grantScopes; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetApplicationGrantScopeRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.grantScopes = request.grantScopes;
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
         * api调用的授权范围
         */
        public Builder grantScopes(java.util.List < String > grantScopes) {
            this.putQueryParameter("GrantScopes", grantScopes);
            this.grantScopes = grantScopes;
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
        public SetApplicationGrantScopeRequest build() {
            return new SetApplicationGrantScopeRequest(this);
        } 

    } 

}
