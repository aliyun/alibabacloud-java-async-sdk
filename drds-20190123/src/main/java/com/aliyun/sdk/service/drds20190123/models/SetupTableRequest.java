// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link SetupTableRequest} extends {@link RequestModel}
 *
 * <p>SetupTableRequest</p>
 */
public class SetupTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowFullTableScan")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean allowFullTableScan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> tableName;

    private SetupTableRequest(Builder builder) {
        super(builder);
        this.allowFullTableScan = builder.allowFullTableScan;
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.regionId = builder.regionId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetupTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowFullTableScan
     */
    public Boolean getAllowFullTableScan() {
        return this.allowFullTableScan;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableName
     */
    public java.util.List<String> getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<SetupTableRequest, Builder> {
        private Boolean allowFullTableScan; 
        private String dbName; 
        private String drdsInstanceId; 
        private String regionId; 
        private java.util.List<String> tableName; 

        private Builder() {
            super();
        } 

        private Builder(SetupTableRequest request) {
            super(request);
            this.allowFullTableScan = request.allowFullTableScan;
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.regionId = request.regionId;
            this.tableName = request.tableName;
        } 

        /**
         * <p>Specifies whether to enable full table scan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowFullTableScan(Boolean allowFullTableScan) {
            this.putQueryParameter("AllowFullTableScan", allowFullTableScan);
            this.allowFullTableScan = allowFullTableScan;
            return this;
        }

        /**
         * <p>The name of the database in which the table resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The ID of the DRDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region where the streaming domain resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tableName(java.util.List<String> tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public SetupTableRequest build() {
            return new SetupTableRequest(this);
        } 

    } 

}
