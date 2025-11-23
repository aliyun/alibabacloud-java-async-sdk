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
 * {@link GetTableKnowledgeInfoRequest} extends {@link RequestModel}
 *
 * <p>GetTableKnowledgeInfoRequest</p>
 */
public class GetTableKnowledgeInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableSchemaName")
    private String tableSchemaName;

    private GetTableKnowledgeInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.tableName = builder.tableName;
        this.tableSchemaName = builder.tableSchemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableKnowledgeInfoRequest create() {
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
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tableSchemaName
     */
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

    public static final class Builder extends Request.Builder<GetTableKnowledgeInfoRequest, Builder> {
        private String regionId; 
        private Integer dbId; 
        private String tableName; 
        private String tableSchemaName; 

        private Builder() {
            super();
        } 

        private Builder(GetTableKnowledgeInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.tableName = request.tableName;
            this.tableSchemaName = request.tableSchemaName;
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
         * <p>The ID of the physical database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>325</p>
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The schema name of the table, which is required only for SQL Server instances.</p>
         * 
         * <strong>example:</strong>
         * <p>dbo</p>
         */
        public Builder tableSchemaName(String tableSchemaName) {
            this.putQueryParameter("TableSchemaName", tableSchemaName);
            this.tableSchemaName = tableSchemaName;
            return this;
        }

        @Override
        public GetTableKnowledgeInfoRequest build() {
            return new GetTableKnowledgeInfoRequest(this);
        } 

    } 

}
