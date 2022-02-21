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
    @Body
    @NameInMap("DatabaseNames")
    @Validation(required = true)
    private String databaseNames;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DeleteDatabasesRequest(Builder builder) {
        super(builder);
        this.databaseNames = builder.databaseNames;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DeleteDatabasesRequest, Builder> {
        private String databaseNames; 
        private String instanceId; 
        private String regionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatabasesRequest response) {
            super(response);
            this.databaseNames = response.databaseNames;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.tenantId = response.tenantId;
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
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
