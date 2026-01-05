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
 * {@link CreateComputeResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeResourceRequest</p>
 */
public class CreateComputeResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionProperties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionPropertiesMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionPropertiesMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateComputeResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connectionProperties = builder.connectionProperties;
        this.connectionPropertiesMode = builder.connectionPropertiesMode;
        this.description = builder.description;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeResourceRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateComputeResourceRequest, Builder> {
        private String regionId; 
        private String connectionProperties; 
        private String connectionPropertiesMode; 
        private String description; 
        private String name; 
        private Long projectId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connectionProperties = request.connectionProperties;
            this.connectionPropertiesMode = request.connectionPropertiesMode;
            this.description = request.description;
            this.name = request.name;
            this.projectId = request.projectId;
            this.type = request.type;
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
         * <p>The specific connection configuration of the computing resource, including the connection address, access identity, and environment information. The environment for the computing resource is a member attribute of this object. It includes DEV (development environment) and PROD (production environment). The value for EnvType is case-insensitive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;EndpointMode&quot;: &quot;custom&quot;,     &quot;Database&quot;: &quot;testdb&quot;,     &quot;TaskSubmitter&quot;: &quot;1107550004253538&quot;,     &quot;InstanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,     &quot;SecurityProtocol&quot;: &quot;authTypeNone&quot;,     &quot;RegionId&quot;: &quot;cn-beijing&quot;,     &quot;EnvType&quot;: &quot;Prod&quot;,     &quot;AuthType&quot;: &quot;Executor&quot; }</p>
         */
        public Builder connectionProperties(String connectionProperties) {
            this.putQueryParameter("ConnectionProperties", connectionProperties);
            this.connectionProperties = connectionProperties;
            return this;
        }

        /**
         * <p>Depending on the added source category, different types may have specific subtypes subject to distinct parameter constraints. For example, Hologres computing resources support InstanceMode and UrlMode.</p>
         * <p>This parameter is required.</p>
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
         * <p>The description of the computing resource. The maximum length is 3000 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_holo_cs</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the computing resource. It can contain letters, digits, and underscores (_), cannot start with a digit or an underscore, and has a maximum length of 255 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_holo_cs</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The type of the computing resource. Multiple computing resource types are currently supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hologres</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateComputeResourceRequest build() {
            return new CreateComputeResourceRequest(this);
        } 

    } 

}
