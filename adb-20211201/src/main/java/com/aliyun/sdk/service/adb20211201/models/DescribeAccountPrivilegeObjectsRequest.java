// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAccountPrivilegeObjectsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccountPrivilegeObjectsRequest</p>
 */
public class DescribeAccountPrivilegeObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnPrivilegeObject")
    private String columnPrivilegeObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePrivilegeObject")
    private String databasePrivilegeObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivilegeType")
    private String privilegeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TablePrivilegeObject")
    private String tablePrivilegeObject;

    private DescribeAccountPrivilegeObjectsRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.columnPrivilegeObject = builder.columnPrivilegeObject;
        this.DBClusterId = builder.DBClusterId;
        this.databasePrivilegeObject = builder.databasePrivilegeObject;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.privilegeType = builder.privilegeType;
        this.regionId = builder.regionId;
        this.tablePrivilegeObject = builder.tablePrivilegeObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountPrivilegeObjectsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return columnPrivilegeObject
     */
    public String getColumnPrivilegeObject() {
        return this.columnPrivilegeObject;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return databasePrivilegeObject
     */
    public String getDatabasePrivilegeObject() {
        return this.databasePrivilegeObject;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return privilegeType
     */
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tablePrivilegeObject
     */
    public String getTablePrivilegeObject() {
        return this.tablePrivilegeObject;
    }

    public static final class Builder extends Request.Builder<DescribeAccountPrivilegeObjectsRequest, Builder> {
        private String accountName; 
        private String columnPrivilegeObject; 
        private String DBClusterId; 
        private String databasePrivilegeObject; 
        private String pageNumber; 
        private String pageSize; 
        private String privilegeType; 
        private String regionId; 
        private String tablePrivilegeObject; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccountPrivilegeObjectsRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.columnPrivilegeObject = request.columnPrivilegeObject;
            this.DBClusterId = request.DBClusterId;
            this.databasePrivilegeObject = request.databasePrivilegeObject;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.privilegeType = request.privilegeType;
            this.regionId = request.regionId;
            this.tablePrivilegeObject = request.tablePrivilegeObject;
        } 

        /**
         * <p>The name of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The column name that is used to filter columns.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        public Builder columnPrivilegeObject(String columnPrivilegeObject) {
            this.putQueryParameter("ColumnPrivilegeObject", columnPrivilegeObject);
            this.columnPrivilegeObject = columnPrivilegeObject;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1k3wdmt139****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database name that is used to filter databases.</p>
         * 
         * <strong>example:</strong>
         * <p>database1</p>
         */
        public Builder databasePrivilegeObject(String databasePrivilegeObject) {
            this.putQueryParameter("DatabasePrivilegeObject", databasePrivilegeObject);
            this.databasePrivilegeObject = databasePrivilegeObject;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The permission level. Valid values: Database, Table, and Column. Global is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Column</p>
         */
        public Builder privilegeType(String privilegeType) {
            this.putQueryParameter("PrivilegeType", privilegeType);
            this.privilegeType = privilegeType;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ch-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The table name that is used to filter tables.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        public Builder tablePrivilegeObject(String tablePrivilegeObject) {
            this.putQueryParameter("TablePrivilegeObject", tablePrivilegeObject);
            this.tablePrivilegeObject = tablePrivilegeObject;
            return this;
        }

        @Override
        public DescribeAccountPrivilegeObjectsRequest build() {
            return new DescribeAccountPrivilegeObjectsRequest(this);
        } 

    } 

}
