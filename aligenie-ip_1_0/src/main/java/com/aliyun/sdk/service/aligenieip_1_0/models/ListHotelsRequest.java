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
 * {@link ListHotelsRequest} extends {@link RequestModel}
 *
 * <p>ListHotelsRequest</p>
 */
public class ListHotelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotelRequest")
    private HotelRequest hotelRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Page page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    private ListHotelsRequest(Builder builder) {
        super(builder);
        this.hotelRequest = builder.hotelRequest;
        this.page = builder.page;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelRequest
     */
    public HotelRequest getHotelRequest() {
        return this.hotelRequest;
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
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListHotelsRequest, Builder> {
        private HotelRequest hotelRequest; 
        private Page page; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ListHotelsRequest request) {
            super(request);
            this.hotelRequest = request.hotelRequest;
            this.page = request.page;
            this.status = request.status;
        } 

        /**
         * HotelRequest.
         */
        public Builder hotelRequest(HotelRequest hotelRequest) {
            String hotelRequestShrink = shrink(hotelRequest, "HotelRequest", "json");
            this.putQueryParameter("HotelRequest", hotelRequestShrink);
            this.hotelRequest = hotelRequest;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putQueryParameter("Page", pageShrink);
            this.page = page;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListHotelsRequest build() {
            return new ListHotelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListHotelsRequest} extends {@link TeaModel}
     *
     * <p>ListHotelsRequest</p>
     */
    public static class HotelRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotelId")
        private String hotelId;

        private HotelRequest(Builder builder) {
            this.hotelId = builder.hotelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelRequest create() {
            return builder().build();
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        public static final class Builder {
            private String hotelId; 

            private Builder() {
            } 

            private Builder(HotelRequest model) {
                this.hotelId = model.hotelId;
            } 

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            public HotelRequest build() {
                return new HotelRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotelsRequest} extends {@link TeaModel}
     *
     * <p>ListHotelsRequest</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
