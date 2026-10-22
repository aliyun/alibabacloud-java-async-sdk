// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListOperationDatabaseAccountsRequest} extends {@link RequestModel}
 *
 * <p>ListOperationDatabaseAccountsRequest</p>
 */
public class ListOperationDatabaseAccountsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseAccountName")
    private String databaseAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseId")
    private String databaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationProjectId")
    private String operationProjectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListOperationDatabaseAccountsRequest(Builder builder) {
        super(builder);
        this.databaseAccountName = builder.databaseAccountName;
        this.databaseId = builder.databaseId;
        this.instanceId = builder.instanceId;
        this.operationProjectId = builder.operationProjectId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationDatabaseAccountsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccountName
     */
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operationProjectId
     */
    public String getOperationProjectId() {
        return this.operationProjectId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListOperationDatabaseAccountsRequest, Builder> {
        private String databaseAccountName; 
        private String databaseId; 
        private String instanceId; 
        private String operationProjectId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationDatabaseAccountsRequest request) {
            super(request);
            this.databaseAccountName = request.databaseAccountName;
            this.databaseId = request.databaseId;
            this.instanceId = request.instanceId;
            this.operationProjectId = request.operationProjectId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the database account. Exact match.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder databaseAccountName(String databaseAccountName) {
            this.putQueryParameter("DatabaseAccountName", databaseAccountName);
            this.databaseAccountName = databaseAccountName;
            return this;
        }

        /**
         * <p>The database instance ID.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/2758856.html">ListOperationDatabases</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
            return this;
        }

        /**
         * <p>The ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-2r42t9cvf0i</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder operationProjectId(String operationProjectId) {
            this.putQueryParameter("OperationProjectId", operationProjectId);
            this.operationProjectId = operationProjectId;
            return this;
        }

        /**
         * <p>The page number of the current page for a paged query. Default value: <strong>1</strong>.</p>
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
         * <p>The maximum number of entries to return on each page for a paged query.
         * <br>The maximum value of the PageSize parameter is 100. The default number of entries returned per page is 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
         * <blockquote>
         * <p>Do not leave the PageSize parameter empty.</p>
         * </blockquote>
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
         * <p>The region ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListOperationDatabaseAccountsRequest build() {
            return new ListOperationDatabaseAccountsRequest(this);
        } 

    } 

}
