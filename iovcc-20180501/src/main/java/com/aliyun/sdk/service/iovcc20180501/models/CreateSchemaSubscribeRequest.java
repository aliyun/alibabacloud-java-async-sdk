// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchemaSubscribeRequest} extends {@link RequestModel}
 *
 * <p>CreateSchemaSubscribeRequest</p>
 */
public class CreateSchemaSubscribeRequest extends Request {
    @Query
    @NameInMap("DeviceModel")
    @Validation(required = true)
    private String deviceModel;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("SubscribeList")
    private String subscribeList;

    private CreateSchemaSubscribeRequest(Builder builder) {
        super(builder);
        this.deviceModel = builder.deviceModel;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.schemaVersion = builder.schemaVersion;
        this.subscribeList = builder.subscribeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchemaSubscribeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
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
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return subscribeList
     */
    public String getSubscribeList() {
        return this.subscribeList;
    }

    public static final class Builder extends Request.Builder<CreateSchemaSubscribeRequest, Builder> {
        private String deviceModel; 
        private String projectId; 
        private String regionId; 
        private String schemaVersion; 
        private String subscribeList; 

        private Builder() {
            super();
        } 

        private Builder(CreateSchemaSubscribeRequest response) {
            super(response);
            this.deviceModel = response.deviceModel;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.schemaVersion = response.schemaVersion;
            this.subscribeList = response.subscribeList;
        } 

        /**
         * DeviceModel.
         */
        public Builder deviceModel(String deviceModel) {
            this.putQueryParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
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
         * SchemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.putQueryParameter("SchemaVersion", schemaVersion);
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * SubscribeList.
         */
        public Builder subscribeList(String subscribeList) {
            this.putQueryParameter("SubscribeList", subscribeList);
            this.subscribeList = subscribeList;
            return this;
        }

        @Override
        public CreateSchemaSubscribeRequest build() {
            return new CreateSchemaSubscribeRequest(this);
        } 

    } 

}
