// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableIoTCloudConnectorAccessLogRequest} extends {@link RequestModel}
 *
 * <p>EnableIoTCloudConnectorAccessLogRequest</p>
 */
public class EnableIoTCloudConnectorAccessLogRequest extends Request {
    @Query
    @NameInMap("AccessLogSlsLogStore")
    @Validation(required = true)
    private String accessLogSlsLogStore;

    @Query
    @NameInMap("AccessLogSlsProject")
    @Validation(required = true)
    private String accessLogSlsProject;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private EnableIoTCloudConnectorAccessLogRequest(Builder builder) {
        super(builder);
        this.accessLogSlsLogStore = builder.accessLogSlsLogStore;
        this.accessLogSlsProject = builder.accessLogSlsProject;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableIoTCloudConnectorAccessLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLogSlsLogStore
     */
    public String getAccessLogSlsLogStore() {
        return this.accessLogSlsLogStore;
    }

    /**
     * @return accessLogSlsProject
     */
    public String getAccessLogSlsProject() {
        return this.accessLogSlsProject;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EnableIoTCloudConnectorAccessLogRequest, Builder> {
        private String accessLogSlsLogStore; 
        private String accessLogSlsProject; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableIoTCloudConnectorAccessLogRequest request) {
            super(request);
            this.accessLogSlsLogStore = request.accessLogSlsLogStore;
            this.accessLogSlsProject = request.accessLogSlsProject;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.regionId = request.regionId;
        } 

        /**
         * AccessLogSlsLogStore.
         */
        public Builder accessLogSlsLogStore(String accessLogSlsLogStore) {
            this.putQueryParameter("AccessLogSlsLogStore", accessLogSlsLogStore);
            this.accessLogSlsLogStore = accessLogSlsLogStore;
            return this;
        }

        /**
         * AccessLogSlsProject.
         */
        public Builder accessLogSlsProject(String accessLogSlsProject) {
            this.putQueryParameter("AccessLogSlsProject", accessLogSlsProject);
            this.accessLogSlsProject = accessLogSlsProject;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public EnableIoTCloudConnectorAccessLogRequest build() {
            return new EnableIoTCloudConnectorAccessLogRequest(this);
        } 

    } 

}
