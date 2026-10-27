// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ExecuteMetaQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteMetaQueryRequest</p>
 */
public class ExecuteMetaQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResultRows")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Long maxResultRows;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageInstId")
    private String storageInstId;

    private ExecuteMetaQueryRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.maxResultRows = builder.maxResultRows;
        this.regionId = builder.regionId;
        this.sql = builder.sql;
        this.storageInstId = builder.storageInstId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteMetaQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return maxResultRows
     */
    public Long getMaxResultRows() {
        return this.maxResultRows;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return storageInstId
     */
    public String getStorageInstId() {
        return this.storageInstId;
    }

    public static final class Builder extends Request.Builder<ExecuteMetaQueryRequest, Builder> {
        private String DBInstanceName; 
        private Long maxResultRows; 
        private String regionId; 
        private String sql; 
        private String storageInstId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteMetaQueryRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.maxResultRows = request.maxResultRows;
            this.regionId = request.regionId;
            this.sql = request.sql;
            this.storageInstId = request.storageInstId;
        } 

        /**
         * <p>The primary instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxsp-*********</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The maximum number of result rows to return for this request. Valid values: 1 to 1000. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxResultRows(Long maxResultRows) {
            this.putQueryParameter("MaxResultRows", maxResultRows);
            this.maxResultRows = maxResultRows;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>The SQL statement to execute.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>show databases;</p>
         */
        public Builder sql(String sql) {
            this.putQueryParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        /**
         * <p>The data node (DN) instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xdb-s-*</p>
         */
        public Builder storageInstId(String storageInstId) {
            this.putQueryParameter("StorageInstId", storageInstId);
            this.storageInstId = storageInstId;
            return this;
        }

        @Override
        public ExecuteMetaQueryRequest build() {
            return new ExecuteMetaQueryRequest(this);
        } 

    } 

}
