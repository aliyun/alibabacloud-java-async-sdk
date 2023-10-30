// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatasourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasourceRequest</p>
 */
public class DeleteDatasourceRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("DatasourceId")
    @Validation(required = true)
    private String datasourceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteDatasourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.datasourceId = builder.datasourceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasourceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDatasourceRequest, Builder> {
        private String instanceId; 
        private String datasourceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.datasourceId = request.datasourceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteDatasourceRequest build() {
            return new DeleteDatasourceRequest(this);
        } 

    } 

}
