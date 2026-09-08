// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataCenterTableRequest} extends {@link RequestModel}
 *
 * <p>ListDataCenterTableRequest</p>
 */
public class ListDataCenterTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallFrom")
    private String callFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmsUnit")
    private String dmsUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportType")
    private String importType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private ListDataCenterTableRequest(Builder builder) {
        super(builder);
        this.callFrom = builder.callFrom;
        this.databaseName = builder.databaseName;
        this.dmsUnit = builder.dmsUnit;
        this.importType = builder.importType;
        this.instanceName = builder.instanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCenterTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callFrom
     */
    public String getCallFrom() {
        return this.callFrom;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return dmsUnit
     */
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    /**
     * @return importType
     */
    public String getImportType() {
        return this.importType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<ListDataCenterTableRequest, Builder> {
        private String callFrom; 
        private String databaseName; 
        private String dmsUnit; 
        private String importType; 
        private String instanceName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(ListDataCenterTableRequest request) {
            super(request);
            this.callFrom = request.callFrom;
            this.databaseName = request.databaseName;
            this.dmsUnit = request.dmsUnit;
            this.importType = request.importType;
            this.instanceName = request.instanceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.tableName = request.tableName;
        } 

        /**
         * <p>For frontend use only.</p>
         * 
         * <strong>example:</strong>
         * <p>仅前端使用</p>
         */
        public Builder callFrom(String callFrom) {
            this.putQueryParameter("CallFrom", callFrom);
            this.callFrom = callFrom;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <ul>
         * <li>If <code>ImportType</code> is <code>FILE</code>, this parameter represents the file name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>diamonds.csv</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The current DMS unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dmsUnit(String dmsUnit) {
            this.putQueryParameter("DmsUnit", dmsUnit);
            this.dmsUnit = dmsUnit;
            return this;
        }

        /**
         * <p>The import type.</p>
         * <ul>
         * <li>FILE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        public Builder importType(String importType) {
            this.putQueryParameter("ImportType", importType);
            this.importType = importType;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * <ul>
         * <li>If <code>ImportType</code> is <code>FILE</code>, this parameter represents the file ID of the data center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>f-ean8u5881qk4*********xh5y</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records to return per page. Default: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The keyword for a fuzzy search of database tables.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>diamonds</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public ListDataCenterTableRequest build() {
            return new ListDataCenterTableRequest(this);
        } 

    } 

}
