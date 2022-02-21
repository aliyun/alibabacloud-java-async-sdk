// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateShadowSchemaRequest} extends {@link RequestModel}
 *
 * <p>CreateShadowSchemaRequest</p>
 */
public class CreateShadowSchemaRequest extends Request {
    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("DeviceModelId")
    @Validation(required = true)
    private String deviceModelId;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Schema")
    private String schema;

    private CreateShadowSchemaRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
        this.deviceModelId = builder.deviceModelId;
        this.namespace = builder.namespace;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateShadowSchemaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return deviceModelId
     */
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<CreateShadowSchemaRequest, Builder> {
        private String authType; 
        private String deviceModelId; 
        private String namespace; 
        private String projectId; 
        private String regionId; 
        private String schema; 

        private Builder() {
            super();
        } 

        private Builder(CreateShadowSchemaRequest response) {
            super(response);
            this.authType = response.authType;
            this.deviceModelId = response.deviceModelId;
            this.namespace = response.namespace;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.schema = response.schema;
        } 

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * DeviceModelId.
         */
        public Builder deviceModelId(String deviceModelId) {
            this.putQueryParameter("DeviceModelId", deviceModelId);
            this.deviceModelId = deviceModelId;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        /**
         * Schema.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public CreateShadowSchemaRequest build() {
            return new CreateShadowSchemaRequest(this);
        } 

    } 

}
