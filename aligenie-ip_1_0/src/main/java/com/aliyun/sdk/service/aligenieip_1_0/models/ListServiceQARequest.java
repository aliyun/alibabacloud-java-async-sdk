// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceQARequest} extends {@link RequestModel}
 *
 * <p>ListServiceQARequest</p>
 */
public class ListServiceQARequest extends Request {
    @Body
    @NameInMap("Active")
    private Boolean active;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("Page")
    private Page page;

    private ListServiceQARequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.hotelId = builder.hotelId;
        this.keyword = builder.keyword;
        this.page = builder.page;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceQARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
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

    public static final class Builder extends Request.Builder<ListServiceQARequest, Builder> {
        private Boolean active; 
        private String hotelId; 
        private String keyword; 
        private Page page; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceQARequest request) {
            super(request);
            this.active = request.active;
            this.hotelId = request.hotelId;
            this.keyword = request.keyword;
            this.page = request.page;
        } 

        /**
         * Active.
         */
        public Builder active(Boolean active) {
            this.putBodyParameter("Active", active);
            this.active = active;
            return this;
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
        public ListServiceQARequest build() {
            return new ListServiceQARequest(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
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
