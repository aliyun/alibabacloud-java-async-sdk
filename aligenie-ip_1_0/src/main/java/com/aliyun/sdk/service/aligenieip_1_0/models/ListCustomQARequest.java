// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomQARequest} extends {@link RequestModel}
 *
 * <p>ListCustomQARequest</p>
 */
public class ListCustomQARequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("Page")
    @Validation(required = true)
    private Page page;

    private ListCustomQARequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.keyword = builder.keyword;
        this.page = builder.page;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomQARequest create() {
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
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    public static final class Builder extends Request.Builder<ListCustomQARequest, Builder> {
        private String hotelId; 
        private String keyword; 
        private Page page; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomQARequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.keyword = request.keyword;
            this.page = request.page;
        } 

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putBodyParameter("Page", pageShrink);
            this.page = page;
            return this;
        }

        @Override
        public ListCustomQARequest build() {
            return new ListCustomQARequest(this);
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
