// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniBackupDatabaseRequest} extends {@link RequestModel}
 *
 * <p>DescribeUniBackupDatabaseRequest</p>
 */
public class DescribeUniBackupDatabaseRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DatabaseType")
    private String databaseType;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryType")
    private String queryType;

    @Query
    @NameInMap("UniRegionId")
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DatabaseType.
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * UniRegionId.
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
