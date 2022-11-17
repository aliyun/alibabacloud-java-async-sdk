// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatabasesRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatabasesRequest</p>
 */
public class DeleteDatabasesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DatabaseNames")
    @Validation(required = true)
    private String databaseNames;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DeleteDatabasesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseNames = builder.databaseNames;
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatabasesRequest create() {
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
     * @return databaseNames
     */
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DeleteDatabasesRequest, Builder> {
        private String regionId; 
        private String databaseNames; 
        private String instanceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatabasesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseNames = request.databaseNames;
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 数据库名称列表。 其为Json格式的数组，数组中每个对象都为数据库名称的字符串。
         */
        public Builder databaseNames(String databaseNames) {
            this.putBodyParameter("DatabaseNames", databaseNames);
            this.databaseNames = databaseNames;
            return this;
        }

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 租户ID。
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DeleteDatabasesRequest build() {
            return new DeleteDatabasesRequest(this);
        } 

    } 

}
