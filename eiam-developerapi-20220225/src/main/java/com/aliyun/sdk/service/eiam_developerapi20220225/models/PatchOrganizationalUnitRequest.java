// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link PatchOrganizationalUnitRequest} extends {@link RequestModel}
 *
 * <p>PatchOrganizationalUnitRequest</p>
 */
public class PatchOrganizationalUnitRequest extends Request {
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

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("organizationalUnitName")
    private String organizationalUnitName;

    @Host
    @NameInMap("regionId")
    private String regionId;

    private PatchOrganizationalUnitRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.organizationalUnitId = builder.organizationalUnitId;
        this.authorization = builder.authorization;
        this.description = builder.description;
        this.organizationalUnitName = builder.organizationalUnitName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PatchOrganizationalUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return organizationalUnitName
     */
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<PatchOrganizationalUnitRequest, Builder> {
        private String instanceId; 
        private String applicationId; 
        private String organizationalUnitId; 
        private String authorization; 
        private String description; 
        private String organizationalUnitName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(PatchOrganizationalUnitRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.organizationalUnitId = request.organizationalUnitId;
            this.authorization = request.authorization;
            this.description = request.description;
            this.organizationalUnitName = request.organizationalUnitName;
            this.regionId = request.regionId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * 机构ID
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.putPathParameter("organizationalUnitId", organizationalUnitId);
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        /**
         * 认证信息，格式:Bearer access_token
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * 机构描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 机构名称
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.putBodyParameter("organizationalUnitName", organizationalUnitName);
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public PatchOrganizationalUnitRequest build() {
            return new PatchOrganizationalUnitRequest(this);
        } 

    } 

}
