// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OfflineDatasourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String offlineDatasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OfflineLifeCycle")
    private Integer offlineLifeCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnlineDatasourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String onlineDatasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder onlineDatasourceId(String onlineDatasourceId) {
            this.putBodyParameter("OnlineDatasourceId", onlineDatasourceId);
            this.onlineDatasourceId = onlineDatasourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>324</p>
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
