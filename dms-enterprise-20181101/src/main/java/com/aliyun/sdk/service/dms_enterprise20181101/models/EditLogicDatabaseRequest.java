// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditLogicDatabaseRequest} extends {@link RequestModel}
 *
 * <p>EditLogicDatabaseRequest</p>
 */
public class EditLogicDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > databaseIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicDbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long logicDbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private EditLogicDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alias = builder.alias;
        this.databaseIds = builder.databaseIds;
        this.logicDbId = builder.logicDbId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditLogicDatabaseRequest create() {
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
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return databaseIds
     */
    public java.util.List < Long > getDatabaseIds() {
        return this.databaseIds;
    }

    /**
     * @return logicDbId
     */
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<EditLogicDatabaseRequest, Builder> {
        private String regionId; 
        private String alias; 
        private java.util.List < Long > databaseIds; 
        private Long logicDbId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(EditLogicDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alias = request.alias;
            this.databaseIds = request.databaseIds;
            this.logicDbId = request.logicDbId;
            this.tid = request.tid;
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
         * - The alias of the logical database. If you want to change the alias, specify a new alias.
         * <p>
         * - If you do not need to change the alias of the logical database, call the [GetLogicDatabase](https://www.alibabacloud.com/help/en/data-management-service/latest/getlogicdatabase) or [GetDBTopology](https://www.alibabacloud.com/help/en/data-management-service/latest/getdbtopology) operation to query the alias of the logical database.
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * - The IDs of the physical databases that compose the logical database. If you want to change the physical databases, you can call the [ListDatabases](https://www.alibabacloud.com/help/en/data-management-service/latest/listdatabases) or [SearchDatabase](https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase) operation to query the IDs of the new physical databases that you want to specify.
         * <p>
         * - If you do not want to change the physical databases, you can call the [GetDBTopology](https://www.alibabacloud.com/help/en/data-management-service/latest/getdbtopology) operation to query the IDs of the physical databases that compose the logical database.
         */
        public Builder databaseIds(java.util.List < Long > databaseIds) {
            String databaseIdsShrink = shrink(databaseIds, "DatabaseIds", "json");
            this.putQueryParameter("DatabaseIds", databaseIdsShrink);
            this.databaseIds = databaseIds;
            return this;
        }

        /**
         * The ID of the logical database. You can call the [ListLogicDatabases](https://www.alibabacloud.com/help/en/data-management-service/latest/listlogicdatabases) operation to query the ID of the logical database.
         */
        public Builder logicDbId(Long logicDbId) {
            this.putQueryParameter("LogicDbId", logicDbId);
            this.logicDbId = logicDbId;
            return this;
        }

        /**
         * The ID of the tenant. 
         * <p>
         * 
         * >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://www.alibabacloud.com/help/en/data-management-service/latest/manage-dms-tenants) topic.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public EditLogicDatabaseRequest build() {
            return new EditLogicDatabaseRequest(this);
        } 

    } 

}
