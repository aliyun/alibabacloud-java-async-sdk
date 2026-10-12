// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateComputeResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateComputeResourceRequest</p>
 */
public class UpdateComputeResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionProperties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionPropertiesMode")
    private String connectionPropertiesMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private UpdateComputeResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connectionProperties = builder.connectionProperties;
        this.connectionPropertiesMode = builder.connectionPropertiesMode;
        this.description = builder.description;
        this.id = builder.id;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComputeResourceRequest create() {
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
     * @return connectionProperties
     */
    public String getConnectionProperties() {
        return this.connectionProperties;
    }

    /**
     * @return connectionPropertiesMode
     */
    public String getConnectionPropertiesMode() {
        return this.connectionPropertiesMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<UpdateComputeResourceRequest, Builder> {
        private String regionId; 
        private String connectionProperties; 
        private String connectionPropertiesMode; 
        private String description; 
        private Long id; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComputeResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connectionProperties = request.connectionProperties;
            this.connectionPropertiesMode = request.connectionPropertiesMode;
            this.description = request.description;
            this.id = request.id;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The specific connection configuration information of the compute resource, including the endpoint, access identity, and environment context. The EnvType property of the compute resource environment is a member attribute of this object. Valid values include DEV (development environment) and PROD (production environment). The value is case-insensitive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;envType&quot;: &quot;Prod&quot;,
         *     &quot;regionId&quot;: &quot;cn-beijing&quot;,
         *     &quot;instanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,
         *     &quot;database&quot;: &quot;testdb&quot;,
         *     &quot;securityProtocol&quot;: &quot;authTypeNone&quot;,
         *     &quot;authType&quot;: &quot;Executor&quot;,
         *     &quot;authIdentity&quot;: &quot;1107550004253538&quot;
         * }</p>
         */
        public Builder connectionProperties(String connectionProperties) {
            this.putQueryParameter("ConnectionProperties", connectionProperties);
            this.connectionProperties = connectionProperties;
            return this;
        }

        /**
         * <p>The category of the added compute resource. Different types have different subtypes, which correspond to different parameter schema constraints. Examples: InstanceMode for instance mode and UrlMode for connection string mode.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceMode</p>
         */
        public Builder connectionPropertiesMode(String connectionPropertiesMode) {
            this.putQueryParameter("ConnectionPropertiesMode", connectionPropertiesMode);
            this.connectionPropertiesMode = connectionPropertiesMode;
            return this;
        }

        /**
         * <p>The description of the compute resource. The description can be up to 3,000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Hierarchical description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The compute resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public UpdateComputeResourceRequest build() {
            return new UpdateComputeResourceRequest(this);
        } 

    } 

}
