// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link CreateLogicDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateLogicDatabaseRequest</p>
 */
public class CreateLogicDatabaseRequest extends Request {
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
    private java.util.List<Long> databaseIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateLogicDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alias = builder.alias;
        this.databaseIds = builder.databaseIds;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogicDatabaseRequest create() {
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
    public java.util.List<Long> getDatabaseIds() {
        return this.databaseIds;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateLogicDatabaseRequest, Builder> {
        private String regionId; 
        private String alias; 
        private java.util.List<Long> databaseIds; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogicDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alias = request.alias;
            this.databaseIds = request.databaseIds;
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
         * <p>The alias of the logical database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_logic_db</p>
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * <p>The IDs of the physical databases that compose the logical database. You can specify one or more database IDs. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listdatabases">ListDatabases</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase">SearchDatabase</a> operation to query the IDs of the physical databases.</p>
         * <p>This parameter is required.</p>
         */
        public Builder databaseIds(java.util.List<Long> databaseIds) {
            String databaseIdsShrink = shrink(databaseIds, "DatabaseIds", "json");
            this.putQueryParameter("DatabaseIds", databaseIdsShrink);
            this.databaseIds = databaseIds;
            return this;
        }

        /**
         * <p>The ID of the tenant. </p>
         * <blockquote>
         * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/manage-dms-tenants">Manage DMS tenants</a> topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateLogicDatabaseRequest build() {
            return new CreateLogicDatabaseRequest(this);
        } 

    } 

}
