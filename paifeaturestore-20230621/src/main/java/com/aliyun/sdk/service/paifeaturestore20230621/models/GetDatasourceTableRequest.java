// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatasourceTableRequest} extends {@link RequestModel}
 *
 * <p>GetDatasourceTableRequest</p>
 */
public class GetDatasourceTableRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("DatasourceId")
    @Validation(required = true)
    private String datasourceId;

    @Path
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    @Host
    @NameInMap("RegionId")
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * DatasourceId.
         */
        public Builder datasourceId(String datasourceId) {
            this.putPathParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * TableName.
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
