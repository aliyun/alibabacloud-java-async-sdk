// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelSceneBookItemsRequest} extends {@link RequestModel}
 *
 * <p>ListHotelSceneBookItemsRequest</p>
 */
public class ListHotelSceneBookItemsRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Page page;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ListHotelSceneBookItemsRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.page = builder.page;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelSceneBookItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListHotelSceneBookItemsRequest, Builder> {
        private String hotelId; 
        private Page page; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListHotelSceneBookItemsRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.page = request.page;
            this.type = request.type;
        } 

        /**
         * hotelID
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putQueryParameter("Page", pageShrink);
            this.page = page;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListHotelSceneBookItemsRequest build() {
            return new ListHotelSceneBookItemsRequest(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        private Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        private Integer pageSize;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
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

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
