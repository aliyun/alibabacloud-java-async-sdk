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
 * {@link UpdateDatasourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasourceRequest</p>
 */
public class UpdateDatasourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    private UpdateDatasourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.datasourceId = builder.datasourceId;
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.name = builder.name;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasourceRequest create() {
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
     * @return datasourceId
     */
    public String getDatasourceId() {
        return this.datasourceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<UpdateDatasourceRequest, Builder> {
        private String instanceId; 
        private String datasourceId; 
        private String regionId; 
        private String config; 
        private String name; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.datasourceId = request.datasourceId;
            this.regionId = request.regionId;
            this.config = request.config;
            this.name = request.name;
            this.uri = request.uri;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder datasourceId(String datasourceId) {
            this.putPathParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
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
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>datasource1</p>
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
         * <p>igraph_instance1</p>
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public UpdateDatasourceRequest build() {
            return new UpdateDatasourceRequest(this);
        } 

    } 

}
