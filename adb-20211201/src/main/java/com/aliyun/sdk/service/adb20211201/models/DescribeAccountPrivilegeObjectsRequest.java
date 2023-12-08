// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountPrivilegeObjectsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccountPrivilegeObjectsRequest</p>
 */
public class DescribeAccountPrivilegeObjectsRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("ColumnPrivilegeObject")
    private String columnPrivilegeObject;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DatabasePrivilegeObject")
    private String databasePrivilegeObject;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("PrivilegeType")
    private String privilegeType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TablePrivilegeObject")
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
         * The name of the database account.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The column name that is used to filter columns.
         */
        public Builder columnPrivilegeObject(String columnPrivilegeObject) {
            this.putQueryParameter("ColumnPrivilegeObject", columnPrivilegeObject);
            this.columnPrivilegeObject = columnPrivilegeObject;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The database name that is used to filter databases.
         */
        public Builder databasePrivilegeObject(String databasePrivilegeObject) {
            this.putQueryParameter("DatabasePrivilegeObject", databasePrivilegeObject);
            this.databasePrivilegeObject = databasePrivilegeObject;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The permission level. Valid values: Database, Table, and Column. Global is not supported.
         */
        public Builder privilegeType(String privilegeType) {
            this.putQueryParameter("PrivilegeType", privilegeType);
            this.privilegeType = privilegeType;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The table name that is used to filter tables.
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
