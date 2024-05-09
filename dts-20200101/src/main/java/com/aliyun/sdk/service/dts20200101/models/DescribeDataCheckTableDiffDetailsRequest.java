// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCheckTableDiffDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataCheckTableDiffDetailsRequest</p>
 */
public class DescribeDataCheckTableDiffDetailsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tbName;

    private DescribeDataCheckTableDiffDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkType = builder.checkType;
        this.dbName = builder.dbName;
        this.dtsJobId = builder.dtsJobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.tbName = builder.tbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCheckTableDiffDetailsRequest create() {
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
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tbName
     */
    public String getTbName() {
        return this.tbName;
    }

    public static final class Builder extends Request.Builder<DescribeDataCheckTableDiffDetailsRequest, Builder> {
        private String regionId; 
        private Integer checkType; 
        private String dbName; 
        private String dtsJobId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String resourceGroupId; 
        private String tbName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataCheckTableDiffDetailsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkType = request.checkType;
            this.dbName = request.dbName;
            this.dtsJobId = request.dtsJobId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.tbName = request.tbName;
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
         * CheckType.
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * TbName.
         */
        public Builder tbName(String tbName) {
            this.putQueryParameter("TbName", tbName);
            this.tbName = tbName;
            return this;
        }

        @Override
        public DescribeDataCheckTableDiffDetailsRequest build() {
            return new DescribeDataCheckTableDiffDetailsRequest(this);
        } 

    } 

}
