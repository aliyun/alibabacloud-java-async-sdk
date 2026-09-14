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
 * {@link CreateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceRequest</p>
 */
public class CreateDataSourceRequest extends Request {
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

    private CreateDataSourceRequest(Builder builder) {
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

    public static CreateDataSourceRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {
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

        private Builder(CreateDataSourceRequest request) {
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
         * <p>The connection properties of the data source, including the endpoint, access identity, and environment context. The envType property is a member of this object and specifies the data source environment. Valid values:</p>
         * <ul>
         * <li>Dev: development environment.</li>
         * <li>Prod: production environment.</li>
         * </ul>
         * <p>Different data source types have different property specifications under different connection patterns (ConnectionPropertiesMode). For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection properties ConnectionProperties</a>.</p>
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
         * <p>The connection mode of the data source. Different types have different subtypes with different parameter constraints. For example, a MySQL data source supports the following modes:</p>
         * <ul>
         * <li>InstanceMode (instance mode)</li>
         * <li>UrlMode (connection string mode)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UrlMode</p>
         */
        public Builder connectionPropertiesMode(String connectionPropertiesMode) {
            this.putQueryParameter("ConnectionPropertiesMode", connectionPropertiesMode);
            this.connectionPropertiesMode = connectionPropertiesMode;
            return this;
        }

        /**
         * <p>The description of the data source. The description can be up to 3,000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a holo datasource</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the data source. The name can contain letters, digits, and underscores (_), and cannot start with a digit or underscore. The name can be up to 255 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_holo_datasource</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/overview">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
         * <p>This parameter specifies the DataWorks workspace for this API call.</p>
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
         * <p>The type of the data source. More than 70 data source types are supported. For more information about the enumerated data source types, refer to References: <a href="https://help.aliyun.com/document_detail/2852465.html">Data source type list</a>.</p>
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
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

}
