// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataCorrectPreCheckSQLRequest} extends {@link RequestModel}
 *
 * <p>ListDataCorrectPreCheckSQLRequest</p>
 */
public class ListDataCorrectPreCheckSQLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    private Long dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListDataCorrectPreCheckSQLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.orderId = builder.orderId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCorrectPreCheckSQLRequest create() {
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
     * @return dbId
     */
    public Long getDbId() {
        return this.dbId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListDataCorrectPreCheckSQLRequest, Builder> {
        private String regionId; 
        private Long dbId; 
        private Long orderId; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListDataCorrectPreCheckSQLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.orderId = request.orderId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tid = request.tid;
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
         * The ID of the database. The database can be a physical database or a logical database.
         * <p>
         * 
         * *   To query the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.
         * *   To query the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * The ID of the data change ticket. You can call the [ListOrders](~~144643~~) operation to query the ID of the data change ticket.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListDataCorrectPreCheckSQLRequest build() {
            return new ListDataCorrectPreCheckSQLRequest(this);
        } 

    } 

}
