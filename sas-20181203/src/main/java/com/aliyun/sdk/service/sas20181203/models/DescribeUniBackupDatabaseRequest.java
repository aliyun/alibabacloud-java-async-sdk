// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniBackupDatabaseRequest} extends {@link RequestModel}
 *
 * <p>DescribeUniBackupDatabaseRequest</p>
 */
public class DescribeUniBackupDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseType")
    private String databaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniRegionId")
    private String uniRegionId;

    private DescribeUniBackupDatabaseRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.databaseType = builder.databaseType;
        this.instanceName = builder.instanceName;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.uniRegionId = builder.uniRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return uniRegionId
     */
    public String getUniRegionId() {
        return this.uniRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeUniBackupDatabaseRequest, Builder> {
        private Integer currentPage; 
        private String databaseType; 
        private String instanceName; 
        private Integer pageSize; 
        private String queryType; 
        private String uniRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUniBackupDatabaseRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.databaseType = request.databaseType;
            this.instanceName = request.instanceName;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.uniRegionId = request.uniRegionId;
        } 

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The type of the database. Valid values:
         * <p>
         * 
         * *   **MYSQL**
         * *   **MSSQL**
         * *   **Oracle**
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * The name of the Elastic Compute Service (ECS) instance.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The condition that is used to query the database. Valid values:
         * <p>
         * 
         * *   **create**: newly created
         * *   **restore**: restored
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * The region ID of the server that hosts the database.
         */
        public Builder uniRegionId(String uniRegionId) {
            this.putQueryParameter("UniRegionId", uniRegionId);
            this.uniRegionId = uniRegionId;
            return this;
        }

        @Override
        public DescribeUniBackupDatabaseRequest build() {
            return new DescribeUniBackupDatabaseRequest(this);
        } 

    } 

}
