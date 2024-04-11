// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCheckTableDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataCheckTableDetailsRequest</p>
 */
public class DescribeDataCheckTableDetailsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CheckType")
    @Validation(required = true)
    private Integer checkType;

    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SchemaName")
    private String schemaName;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TableName")
    private String tableName;

    private DescribeDataCheckTableDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkType = builder.checkType;
        this.dtsJobId = builder.dtsJobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.schemaName = builder.schemaName;
        this.status = builder.status;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCheckTableDetailsRequest create() {
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
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<DescribeDataCheckTableDetailsRequest, Builder> {
        private String regionId; 
        private Integer checkType; 
        private String dtsJobId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String schemaName; 
        private String status; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataCheckTableDetailsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkType = request.checkType;
            this.dtsJobId = request.dtsJobId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.schemaName = request.schemaName;
            this.status = request.status;
            this.tableName = request.tableName;
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
         * The data verification method. Valid values:
         * <p>
         * 
         * *   **1**: full data verification.
         * *   **2**: incremental data verification.
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * The ID of the data migration or data synchronization task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The number of the page to return. The value must be an integer that is greater than **0**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the schema whose data is verified in the source database.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * The status of the data verification result. Valid values:
         * <p>
         * 
         * *   **-1** (default): All status.
         * *   **6**: Inconsistent data detected in the table.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The name of the table whose data is verified in the source database.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public DescribeDataCheckTableDetailsRequest build() {
            return new DescribeDataCheckTableDetailsRequest(this);
        } 

    } 

}
