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
 * {@link UpdateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceRequest</p>
 */
public class UpdateDataSourceRequest extends Request {
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

    private UpdateDataSourceRequest(Builder builder) {
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

    public static UpdateDataSourceRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDataSourceRequest, Builder> {
        private String regionId; 
        private String connectionProperties; 
        private String connectionPropertiesMode; 
        private String description; 
        private Long id; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceRequest request) {
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
         * <p>The connection configurations of the data source, including the connection address, access identity, and environment information. The envType parameter specifies the environment in which the data source is used. Valid values of the envType parameter:</p>
         * <ul>
         * <li>Dev: development environment</li>
         * <li>Prod: production environment</li>
         * </ul>
         * <p>The parameters that you need to configure to the data source vary based on the mode in which the data source is added. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection information (ConnectionProperties)</a>.</p>
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
         * <p>The mode in which the data source is added. The mode varies based on the data source type. Valid values:</p>
         * <ul>
         * <li>InstanceMode: instance mode</li>
         * <li>UrlMode: connection string mode</li>
         * <li>CdhMode: CDH cluster mode</li>
         * </ul>
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
         * <p>The description of the data source. The description cannot exceed 3,000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16033</p>
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
         * <p>5678</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public UpdateDataSourceRequest build() {
            return new UpdateDataSourceRequest(this);
        } 

    } 

}
