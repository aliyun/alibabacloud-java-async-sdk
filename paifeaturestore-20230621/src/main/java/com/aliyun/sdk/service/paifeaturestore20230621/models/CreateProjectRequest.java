// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("OfflineDatasourceId")
    @Validation(required = true)
    private String offlineDatasourceId;

    @Body
    @NameInMap("OfflineLifeCycle")
    private Integer offlineLifeCycle;

    @Body
    @NameInMap("OnlineDatasourceId")
    @Validation(required = true)
    private String onlineDatasourceId;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.name = builder.name;
        this.offlineDatasourceId = builder.offlineDatasourceId;
        this.offlineLifeCycle = builder.offlineLifeCycle;
        this.onlineDatasourceId = builder.onlineDatasourceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return offlineDatasourceId
     */
    public String getOfflineDatasourceId() {
        return this.offlineDatasourceId;
    }

    /**
     * @return offlineLifeCycle
     */
    public Integer getOfflineLifeCycle() {
        return this.offlineLifeCycle;
    }

    /**
     * @return onlineDatasourceId
     */
    public String getOnlineDatasourceId() {
        return this.onlineDatasourceId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String description; 
        private String name; 
        private String offlineDatasourceId; 
        private Integer offlineLifeCycle; 
        private String onlineDatasourceId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.name = request.name;
            this.offlineDatasourceId = request.offlineDatasourceId;
            this.offlineLifeCycle = request.offlineLifeCycle;
            this.onlineDatasourceId = request.onlineDatasourceId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
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

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OfflineDatasourceId.
         */
        public Builder offlineDatasourceId(String offlineDatasourceId) {
            this.putBodyParameter("OfflineDatasourceId", offlineDatasourceId);
            this.offlineDatasourceId = offlineDatasourceId;
            return this;
        }

        /**
         * OfflineLifeCycle.
         */
        public Builder offlineLifeCycle(Integer offlineLifeCycle) {
            this.putBodyParameter("OfflineLifeCycle", offlineLifeCycle);
            this.offlineLifeCycle = offlineLifeCycle;
            return this;
        }

        /**
         * OnlineDatasourceId.
         */
        public Builder onlineDatasourceId(String onlineDatasourceId) {
            this.putBodyParameter("OnlineDatasourceId", onlineDatasourceId);
            this.onlineDatasourceId = onlineDatasourceId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

}
