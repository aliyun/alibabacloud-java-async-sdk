// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link ListOrganizationalUnitParentIdsRequest} extends {@link RequestModel}
 *
 * <p>ListOrganizationalUnitParentIdsRequest</p>
 */
public class ListOrganizationalUnitParentIdsRequest extends Request {
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

    @Path
    @NameInMap("organizationalUnitId")
    @Validation(required = true)
    private String organizationalUnitId;

    @Header
    @NameInMap("Authorization")
    @Validation(required = true)
    private String authorization;

    private ListOrganizationalUnitParentIdsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.organizationalUnitId = builder.organizationalUnitId;
        this.authorization = builder.authorization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitParentIdsRequest create() {
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
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    public static final class Builder extends Request.Builder<ListOrganizationalUnitParentIdsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String organizationalUnitId; 
        private String authorization; 

        private Builder() {
            super();
        } 

        private Builder(ListOrganizationalUnitParentIdsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.organizationalUnitId = request.organizationalUnitId;
            this.authorization = request.authorization;
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
         * organizationalUnitId.
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.putPathParameter("organizationalUnitId", organizationalUnitId);
            this.organizationalUnitId = organizationalUnitId;
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

        @Override
        public ListOrganizationalUnitParentIdsRequest build() {
            return new ListOrganizationalUnitParentIdsRequest(this);
        } 

    } 

}
