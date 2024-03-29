// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetOrganizationalUnitIdByExternalIdRequest} extends {@link RequestModel}
 *
 * <p>GetOrganizationalUnitIdByExternalIdRequest</p>
 */
public class GetOrganizationalUnitIdByExternalIdRequest extends Request {
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
    @NameInMap("organizationalUnitExternalId")
    @Validation(required = true)
    private String organizationalUnitExternalId;

    @Body
    @NameInMap("organizationalUnitSourceId")
    @Validation(required = true)
    private String organizationalUnitSourceId;

    @Body
    @NameInMap("organizationalUnitSourceType")
    @Validation(required = true)
    private String organizationalUnitSourceType;

    private GetOrganizationalUnitIdByExternalIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.authorization = builder.authorization;
        this.organizationalUnitExternalId = builder.organizationalUnitExternalId;
        this.organizationalUnitSourceId = builder.organizationalUnitSourceId;
        this.organizationalUnitSourceType = builder.organizationalUnitSourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationalUnitIdByExternalIdRequest create() {
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
     * @return organizationalUnitExternalId
     */
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    /**
     * @return organizationalUnitSourceId
     */
    public String getOrganizationalUnitSourceId() {
        return this.organizationalUnitSourceId;
    }

    /**
     * @return organizationalUnitSourceType
     */
    public String getOrganizationalUnitSourceType() {
        return this.organizationalUnitSourceType;
    }

    public static final class Builder extends Request.Builder<GetOrganizationalUnitIdByExternalIdRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String authorization; 
        private String organizationalUnitExternalId; 
        private String organizationalUnitSourceId; 
        private String organizationalUnitSourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetOrganizationalUnitIdByExternalIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.authorization = request.authorization;
            this.organizationalUnitExternalId = request.organizationalUnitExternalId;
            this.organizationalUnitSourceId = request.organizationalUnitSourceId;
            this.organizationalUnitSourceType = request.organizationalUnitSourceType;
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
         * organizationalUnitExternalId.
         */
        public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
            this.putBodyParameter("organizationalUnitExternalId", organizationalUnitExternalId);
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }

        /**
         * organizationalUnitSourceId.
         */
        public Builder organizationalUnitSourceId(String organizationalUnitSourceId) {
            this.putBodyParameter("organizationalUnitSourceId", organizationalUnitSourceId);
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }

        /**
         * organizationalUnitSourceType.
         */
        public Builder organizationalUnitSourceType(String organizationalUnitSourceType) {
            this.putBodyParameter("organizationalUnitSourceType", organizationalUnitSourceType);
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }

        @Override
        public GetOrganizationalUnitIdByExternalIdRequest build() {
            return new GetOrganizationalUnitIdByExternalIdRequest(this);
        } 

    } 

}
