// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBlueprintInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListBlueprintInstancesRequest</p>
 */
public class ListBlueprintInstancesRequest extends Request {
    @Query
    @NameInMap("BlueprintInstanceId")
    private String blueprintInstanceId;

    @Query
    @NameInMap("BlueprintType")
    private String blueprintType;

    @Query
    @NameInMap("CreatorUid")
    private String creatorUid;

    @Query
    @NameInMap("ExecuteType")
    private String executeType;

    @Query
    @NameInMap("NamePrefix")
    private String namePrefix;

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

    private ListBlueprintInstancesRequest(Builder builder) {
        super(builder);
        this.blueprintInstanceId = builder.blueprintInstanceId;
        this.blueprintType = builder.blueprintType;
        this.creatorUid = builder.creatorUid;
        this.executeType = builder.executeType;
        this.namePrefix = builder.namePrefix;
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

    public static ListBlueprintInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blueprintInstanceId
     */
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    /**
     * @return blueprintType
     */
    public String getBlueprintType() {
        return this.blueprintType;
    }

    /**
     * @return creatorUid
     */
    public String getCreatorUid() {
        return this.creatorUid;
    }

    /**
     * @return executeType
     */
    public String getExecuteType() {
        return this.executeType;
    }

    /**
     * @return namePrefix
     */
    public String getNamePrefix() {
        return this.namePrefix;
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

    public static final class Builder extends Request.Builder<ListBlueprintInstancesRequest, Builder> {
        private String blueprintInstanceId; 
        private String blueprintType; 
        private String creatorUid; 
        private String executeType; 
        private String namePrefix; 
        private String orderCol; 
        private String orderType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListBlueprintInstancesRequest response) {
            super(response);
            this.blueprintInstanceId = response.blueprintInstanceId;
            this.blueprintType = response.blueprintType;
            this.creatorUid = response.creatorUid;
            this.executeType = response.executeType;
            this.namePrefix = response.namePrefix;
            this.orderCol = response.orderCol;
            this.orderType = response.orderType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.status = response.status;
        } 

        /**
         * BlueprintInstanceId.
         */
        public Builder blueprintInstanceId(String blueprintInstanceId) {
            this.putQueryParameter("BlueprintInstanceId", blueprintInstanceId);
            this.blueprintInstanceId = blueprintInstanceId;
            return this;
        }

        /**
         * BlueprintType.
         */
        public Builder blueprintType(String blueprintType) {
            this.putQueryParameter("BlueprintType", blueprintType);
            this.blueprintType = blueprintType;
            return this;
        }

        /**
         * CreatorUid.
         */
        public Builder creatorUid(String creatorUid) {
            this.putQueryParameter("CreatorUid", creatorUid);
            this.creatorUid = creatorUid;
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
         * NamePrefix.
         */
        public Builder namePrefix(String namePrefix) {
            this.putQueryParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
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
        public ListBlueprintInstancesRequest build() {
            return new ListBlueprintInstancesRequest(this);
        } 

    } 

}
