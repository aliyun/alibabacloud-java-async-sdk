// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShopsRequest} extends {@link RequestModel}
 *
 * <p>ListShopsRequest</p>
 */
public class ListShopsRequest extends Request {
    @Query
    @NameInMap("channelSupplierId")
    private String channelSupplierId;

    @Query
    @NameInMap("endDate")
    private String endDate;

    @Query
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("shopId")
    private String shopId;

    @Query
    @NameInMap("shopName")
    private String shopName;

    @Query
    @NameInMap("startDate")
    private String startDate;

    private ListShopsRequest(Builder builder) {
        super(builder);
        this.channelSupplierId = builder.channelSupplierId;
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.shopId = builder.shopId;
        this.shopName = builder.shopName;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShopsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelSupplierId
     */
    public String getChannelSupplierId() {
        return this.channelSupplierId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return shopName
     */
    public String getShopName() {
        return this.shopName;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ListShopsRequest, Builder> {
        private String channelSupplierId; 
        private String endDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String shopId; 
        private String shopName; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ListShopsRequest request) {
            super(request);
            this.channelSupplierId = request.channelSupplierId;
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.shopId = request.shopId;
            this.shopName = request.shopName;
            this.startDate = request.startDate;
        } 

        /**
         * channelSupplierId.
         */
        public Builder channelSupplierId(String channelSupplierId) {
            this.putQueryParameter("channelSupplierId", channelSupplierId);
            this.channelSupplierId = channelSupplierId;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.putQueryParameter("shopId", shopId);
            this.shopId = shopId;
            return this;
        }

        /**
         * shopName.
         */
        public Builder shopName(String shopName) {
            this.putQueryParameter("shopName", shopName);
            this.shopName = shopName;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ListShopsRequest build() {
            return new ListShopsRequest(this);
        } 

    } 

}
