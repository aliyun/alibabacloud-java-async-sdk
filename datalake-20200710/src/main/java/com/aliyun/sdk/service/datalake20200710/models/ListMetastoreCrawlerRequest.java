// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetastoreCrawlerRequest} extends {@link RequestModel}
 *
 * <p>ListMetastoreCrawlerRequest</p>
 */
public class ListMetastoreCrawlerRequest extends Request {
    @Query
    @NameInMap("Creator")
    private String creator;

    @Query
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Query
    @NameInMap("ExecuteType")
    private String executeType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OrderCol")
    private String orderCol;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    private ListMetastoreCrawlerRequest(Builder builder) {
        super(builder);
        this.creator = builder.creator;
        this.dataSourceType = builder.dataSourceType;
        this.executeType = builder.executeType;
        this.name = builder.name;
        this.orderCol = builder.orderCol;
        this.orderType = builder.orderType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetastoreCrawlerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return executeType
     */
    public String getExecuteType() {
        return this.executeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderCol
     */
    public String getOrderCol() {
        return this.orderCol;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListMetastoreCrawlerRequest, Builder> {
        private String creator; 
        private String dataSourceType; 
        private String executeType; 
        private String name; 
        private String orderCol; 
        private String orderType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListMetastoreCrawlerRequest response) {
            super(response);
            this.creator = response.creator;
            this.dataSourceType = response.dataSourceType;
            this.executeType = response.executeType;
            this.name = response.name;
            this.orderCol = response.orderCol;
            this.orderType = response.orderType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.status = response.status;
        } 

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * ExecuteType.
         */
        public Builder executeType(String executeType) {
            this.putQueryParameter("ExecuteType", executeType);
            this.executeType = executeType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OrderCol.
         */
        public Builder orderCol(String orderCol) {
            this.putQueryParameter("OrderCol", orderCol);
            this.orderCol = orderCol;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListMetastoreCrawlerRequest build() {
            return new ListMetastoreCrawlerRequest(this);
        } 

    } 

}
