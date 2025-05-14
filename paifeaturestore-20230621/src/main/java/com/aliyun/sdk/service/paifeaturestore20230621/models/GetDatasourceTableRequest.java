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
 * {@link GetDatasourceTableRequest} extends {@link RequestModel}
 *
 * <p>GetDatasourceTableRequest</p>
 */
public class GetDatasourceTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetDatasourceTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.datasourceId = builder.datasourceId;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasourceTableRequest create() {
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDatasourceTableRequest, Builder> {
        private String instanceId; 
        private String datasourceId; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDatasourceTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.datasourceId = request.datasourceId;
            this.tableName = request.tableName;
            this.regionId = request.regionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("TableName", tableName);
            this.tableName = tableName;
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

        @Override
        public GetDatasourceTableRequest build() {
            return new GetDatasourceTableRequest(this);
        } 

    } 

}
