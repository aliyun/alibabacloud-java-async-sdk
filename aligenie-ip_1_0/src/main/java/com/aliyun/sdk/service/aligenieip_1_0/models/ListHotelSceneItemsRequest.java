// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHotelSceneItemsRequest} extends {@link RequestModel}
 *
 * <p>ListHotelSceneItemsRequest</p>
 */
public class ListHotelSceneItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListHotelSceneReq")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListHotelSceneReq listHotelSceneReq;

    private ListHotelSceneItemsRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.listHotelSceneReq = builder.listHotelSceneReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelSceneItemsRequest create() {
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
     * @return listHotelSceneReq
     */
    public ListHotelSceneReq getListHotelSceneReq() {
        return this.listHotelSceneReq;
    }

    public static final class Builder extends Request.Builder<ListHotelSceneItemsRequest, Builder> {
        private String hotelId; 
        private ListHotelSceneReq listHotelSceneReq; 

        private Builder() {
            super();
        } 

        private Builder(ListHotelSceneItemsRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.listHotelSceneReq = request.listHotelSceneReq;
        } 

        /**
         * <p>hotelID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>ListHotelSceneReq</p>
         * <p>This parameter is required.</p>
         */
        public Builder listHotelSceneReq(ListHotelSceneReq listHotelSceneReq) {
            String listHotelSceneReqShrink = shrink(listHotelSceneReq, "ListHotelSceneReq", "json");
            this.putQueryParameter("ListHotelSceneReq", listHotelSceneReqShrink);
            this.listHotelSceneReq = listHotelSceneReq;
            return this;
        }

        @Override
        public ListHotelSceneItemsRequest build() {
            return new ListHotelSceneItemsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListHotelSceneItemsRequest} extends {@link TeaModel}
     *
     * <p>ListHotelSceneItemsRequest</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
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

            private Builder() {
            } 

            private Builder(Page model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
            } 

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
    /**
     * 
     * {@link ListHotelSceneItemsRequest} extends {@link TeaModel}
     *
     * <p>ListHotelSceneItemsRequest</p>
     */
    public static class ListHotelSceneReq extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private String keywords;

        @com.aliyun.core.annotation.NameInMap("Page")
        @com.aliyun.core.annotation.Validation(required = true)
        private Page page;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private ListHotelSceneReq(Builder builder) {
            this.category = builder.category;
            this.keywords = builder.keywords;
            this.page = builder.page;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListHotelSceneReq create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return keywords
         */
        public String getKeywords() {
            return this.keywords;
        }

        /**
         * @return page
         */
        public Page getPage() {
            return this.page;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private String keywords; 
            private Page page; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(ListHotelSceneReq model) {
                this.category = model.category;
                this.keywords = model.keywords;
                this.page = model.page;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>GOODS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ListHotelSceneReq build() {
                return new ListHotelSceneReq(this);
            } 

        } 

    }
}
