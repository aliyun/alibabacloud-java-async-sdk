// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OrderListRequest} extends {@link RequestModel}
 *
 * <p>OrderListRequest</p>
 */
public class OrderListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("book_time_end")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bookTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("book_time_start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bookTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_index")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private OrderListRequest(Builder builder) {
        super(builder);
        this.bookTimeEnd = builder.bookTimeEnd;
        this.bookTimeStart = builder.bookTimeStart;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bookTimeEnd
     */
    public Long getBookTimeEnd() {
        return this.bookTimeEnd;
    }

    /**
     * @return bookTimeStart
     */
    public Long getBookTimeStart() {
        return this.bookTimeStart;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return xAcsAirticketAccessToken
     */
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    /**
     * @return xAcsAirticketLanguage
     */
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

    public static final class Builder extends Request.Builder<OrderListRequest, Builder> {
        private Long bookTimeEnd; 
        private Long bookTimeStart; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Integer status; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(OrderListRequest request) {
            super(request);
            this.bookTimeEnd = request.bookTimeEnd;
            this.bookTimeStart = request.bookTimeStart;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * <p>latest booking time (timestamp)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-02 11:20:00</p>
         */
        public Builder bookTimeEnd(Long bookTimeEnd) {
            this.putQueryParameter("book_time_end", bookTimeEnd);
            this.bookTimeEnd = bookTimeEnd;
            return this;
        }

        /**
         * <p>earliest book time(timestamp)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-01 11:20:00</p>
         */
        public Builder bookTimeStart(Long bookTimeStart) {
            this.putQueryParameter("book_time_start", bookTimeStart);
            this.bookTimeStart = bookTimeStart;
            return this;
        }

        /**
         * <p>pagination query parameters, from which page to start querying</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("page_index", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>pagination query parameters, how many orders to return</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>which order status will be query</p>
         * <p>1: order reservation in process</p>
         * <p>2: order reservation successful</p>
         * <p>3: order paid</p>
         * <p>4: order successful</p>
         * <p>5: order closed</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>access token</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGciOiJSUzI1NiIsImtpZCI6InN1ZXpfa2V5aWQifQ.eyJqdGkiOiJCQldMaWIzN0VxbC0xMjhhR2N5elJ3IiwiaWF0IjoxNjc3MDY2NTAxLCJleHAiOjE2NzcwNzM3MDEsIm5iZiI6MTY3NzA2NjQ0MX0.AF0DxsZK4Edyg0C6ObRQFUo36R1VYrb5IYmak25TmL1OfR5RkIUc3PpqFuQKNLKXf5fOtVQaKjaexzwodVeWZQDKEG_RPt_Ybb99EnEm6vPKs6e3pWFbKiBq71WleLHhVrdFb4YPowRKjc7bG0jyGUxiQ2iXy0RWDj9tIjfI-KEdzNp5oVnX7j4p3H12DwQrRPmd1nz3BciAQNINvDpzqusuIUw8JXyLFCz838Y0NhwB1_bYZyctxRLSzrGZuI5rrWtItgupqMsOlJ3RNy1QrIbQ2g6nPmzl-atOqcQ4Nw0HeDLR8dhM1OsIcFLbKXBUtwXofflhzAQrkDxhwYiXii</p>
         */
        public Builder xAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
            this.putHeaderParameter("x-acs-airticket-access-token", xAcsAirticketAccessToken);
            this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
            return this;
        }

        /**
         * <p>language code(refer to ISO_639), defaults to the buyer&quot;s account configuration</p>
         * 
         * <strong>example:</strong>
         * <p>en_US</p>
         */
        public Builder xAcsAirticketLanguage(String xAcsAirticketLanguage) {
            this.putHeaderParameter("x-acs-airticket-language", xAcsAirticketLanguage);
            this.xAcsAirticketLanguage = xAcsAirticketLanguage;
            return this;
        }

        @Override
        public OrderListRequest build() {
            return new OrderListRequest(this);
        } 

    } 

}
