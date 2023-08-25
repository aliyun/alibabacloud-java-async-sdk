// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabasesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatabasesRequest</p>
 */
public class DescribeDatabasesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SearchKey")
    private String searchKey;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("WithTables")
    private Boolean withTables;

    private DescribeDatabasesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseName = builder.databaseName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.tenantId = builder.tenantId;
        this.withTables = builder.withTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabasesRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return withTables
     */
    public Boolean getWithTables() {
        return this.withTables;
    }

    public static final class Builder extends Request.Builder<DescribeDatabasesRequest, Builder> {
        private String regionId; 
        private String databaseName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 
        private String tenantId; 
        private Boolean withTables; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatabasesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseName = request.databaseName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.tenantId = request.tenantId;
            this.withTables = request.withTables;
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
         * It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * The return result of the request.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The information about the database tables.
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The role of the account.    
         * <p>
         * In MySQL mode, a role is a database-level role. Valid values:  
         * - ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.  
         * - ReadOnly: a role that has only the read-only privilege SELECT.   
         * - DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.   
         * - DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.
         */
        public Builder withTables(Boolean withTables) {
            this.putBodyParameter("WithTables", withTables);
            this.withTables = withTables;
            return this;
        }

        @Override
        public DescribeDatabasesRequest build() {
            return new DescribeDatabasesRequest(this);
        } 

    } 

}
