// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByUserExternalIdRequest} extends {@link RequestModel}
 *
 * <p>GetUserIdByUserExternalIdRequest</p>
 */
public class GetUserIdByUserExternalIdRequest extends Request {
    @Host
    @NameInMap("regionId")
    private String regionId;

    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("applicationId")
    @Validation(required = true)
    private String applicationId;

    @Header
    @NameInMap("Authorization")
    @Validation(required = true)
    private String authorization;

    @Body
    @NameInMap("userExternalId")
    @Validation(required = true)
    private String userExternalId;

    @Body
    @NameInMap("userSourceId")
    @Validation(required = true)
    private String userSourceId;

    @Body
    @NameInMap("userSourceType")
    @Validation(required = true)
    private String userSourceType;

    private GetUserIdByUserExternalIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.authorization = builder.authorization;
        this.userExternalId = builder.userExternalId;
        this.userSourceId = builder.userSourceId;
        this.userSourceType = builder.userSourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserIdByUserExternalIdRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
    }

    /**
     * @return userSourceId
     */
    public String getUserSourceId() {
        return this.userSourceId;
    }

    /**
     * @return userSourceType
     */
    public String getUserSourceType() {
        return this.userSourceType;
    }

    public static final class Builder extends Request.Builder<GetUserIdByUserExternalIdRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String authorization; 
        private String userExternalId; 
        private String userSourceId; 
        private String userSourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetUserIdByUserExternalIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.authorization = request.authorization;
            this.userExternalId = request.userExternalId;
            this.userSourceId = request.userSourceId;
            this.userSourceType = request.userSourceType;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * applicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Authorization.
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * userExternalId.
         */
        public Builder userExternalId(String userExternalId) {
            this.putBodyParameter("userExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * userSourceId.
         */
        public Builder userSourceId(String userSourceId) {
            this.putBodyParameter("userSourceId", userSourceId);
            this.userSourceId = userSourceId;
            return this;
        }

        /**
         * userSourceType.
         */
        public Builder userSourceType(String userSourceType) {
            this.putBodyParameter("userSourceType", userSourceType);
            this.userSourceType = userSourceType;
            return this;
        }

        @Override
        public GetUserIdByUserExternalIdRequest build() {
            return new GetUserIdByUserExternalIdRequest(this);
        } 

    } 

}
