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
 * {@link DescribeAccountPrivilegesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccountPrivilegesRequest</p>
 */
public class DescribeAccountPrivilegesRequest extends Request {
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

    private DescribeAccountPrivilegesRequest(Builder builder) {
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

    public static DescribeAccountPrivilegesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAccountPrivilegesRequest, Builder> {
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

        private Builder(DescribeAccountPrivilegesRequest request) {
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
         * <p>The name of the database account whose privileges you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account1</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>Filters the results by column name. This parameter is used only when <code>PrivilegeType</code> is set to <code>Column</code>.</p>
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
         * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Lakehouse Edition cluster.
         * &lt;props=&quot;intl&quot;&gt;The ID of the Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1k5p066e1a****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Filters the results by database name. This parameter is used only when <code>PrivilegeType</code> is set to <code>Database</code>, <code>Table</code>, or <code>Column</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>db1</p>
         */
        public Builder databasePrivilegeObject(String databasePrivilegeObject) {
            this.putQueryParameter("DatabasePrivilegeObject", databasePrivilegeObject);
            this.databasePrivilegeObject = databasePrivilegeObject;
            return this;
        }

        /**
         * <p>The page number. Pages start at 1. Default value: 1.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The privilege level to query. To obtain the valid values for this parameter, call the <code>DescribeEnabledPrivileges</code> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        public Builder privilegeType(String privilegeType) {
            this.putQueryParameter("PrivilegeType", privilegeType);
            this.privilegeType = privilegeType;
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
         * <p>Filters the results by table name. You can use this parameter with <code>DatabasePrivilegeObject</code> to refine the search. This parameter is used only when <code>PrivilegeType</code> is set to <code>Table</code> or <code>Column</code>.</p>
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
        public DescribeAccountPrivilegesRequest build() {
            return new DescribeAccountPrivilegesRequest(this);
        } 

    } 

}
