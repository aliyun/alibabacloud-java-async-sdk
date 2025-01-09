// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link RefundDetailListRequest} extends {@link RequestModel}
 *
 * <p>RefundDetailListRequest</p>
 */
public class RefundDetailListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_num")
    private Long orderNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_index")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("refund_create_begin_time")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long refundCreateBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("refund_create_end_time")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long refundCreateEndTime;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private RefundDetailListRequest(Builder builder) {
        super(builder);
        this.orderNum = builder.orderNum;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.refundCreateBeginTime = builder.refundCreateBeginTime;
        this.refundCreateEndTime = builder.refundCreateEndTime;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundDetailListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderNum
     */
    public Long getOrderNum() {
        return this.orderNum;
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
     * @return refundCreateBeginTime
     */
    public Long getRefundCreateBeginTime() {
        return this.refundCreateBeginTime;
    }

    /**
     * @return refundCreateEndTime
     */
    public Long getRefundCreateEndTime() {
        return this.refundCreateEndTime;
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

    public static final class Builder extends Request.Builder<RefundDetailListRequest, Builder> {
        private Long orderNum; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long refundCreateBeginTime; 
        private Long refundCreateEndTime; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(RefundDetailListRequest request) {
            super(request);
            this.orderNum = request.orderNum;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.refundCreateBeginTime = request.refundCreateBeginTime;
            this.refundCreateEndTime = request.refundCreateEndTime;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * <p>order number returned by Book</p>
         * 
         * <strong>example:</strong>
         * <p>49884*****950</p>
         */
        public Builder orderNum(Long orderNum) {
            this.putQueryParameter("order_num", orderNum);
            this.orderNum = orderNum;
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
         * <p>the earliest time(timestamp) of refund order creation</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1677229002000</p>
         */
        public Builder refundCreateBeginTime(Long refundCreateBeginTime) {
            this.putQueryParameter("refund_create_begin_time", refundCreateBeginTime);
            this.refundCreateBeginTime = refundCreateBeginTime;
            return this;
        }

        /**
         * <p>the latest time(timestamp) of refund order creation</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1677229005000</p>
         */
        public Builder refundCreateEndTime(Long refundCreateEndTime) {
            this.putQueryParameter("refund_create_end_time", refundCreateEndTime);
            this.refundCreateEndTime = refundCreateEndTime;
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
        public RefundDetailListRequest build() {
            return new RefundDetailListRequest(this);
        } 

    } 

}
