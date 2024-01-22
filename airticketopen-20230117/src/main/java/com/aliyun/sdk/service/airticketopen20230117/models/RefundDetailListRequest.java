// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundDetailListRequest} extends {@link RequestModel}
 *
 * <p>RefundDetailListRequest</p>
 */
public class RefundDetailListRequest extends Request {
    @Query
    @NameInMap("order_num")
    private Long orderNum;

    @Query
    @NameInMap("page_index")
    private Integer pageIndex;

    @Query
    @NameInMap("page_size")
    private Integer pageSize;

    @Query
    @NameInMap("refund_create_begin_time")
    @Validation(required = true)
    private Long refundCreateBeginTime;

    @Query
    @NameInMap("refund_create_end_time")
    @Validation(required = true)
    private Long refundCreateEndTime;

    @Header
    @NameInMap("x-acs-airticket-access-token")
    @Validation(required = true)
    private String xAcsAirticketAccessToken;

    @Header
    @NameInMap("x-acs-airticket-language")
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
         * order_num.
         */
        public Builder orderNum(Long orderNum) {
            this.putQueryParameter("order_num", orderNum);
            this.orderNum = orderNum;
            return this;
        }

        /**
         * page_index.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("page_index", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * refund_create_begin_time.
         */
        public Builder refundCreateBeginTime(Long refundCreateBeginTime) {
            this.putQueryParameter("refund_create_begin_time", refundCreateBeginTime);
            this.refundCreateBeginTime = refundCreateBeginTime;
            return this;
        }

        /**
         * refund_create_end_time.
         */
        public Builder refundCreateEndTime(Long refundCreateEndTime) {
            this.putQueryParameter("refund_create_end_time", refundCreateEndTime);
            this.refundCreateEndTime = refundCreateEndTime;
            return this;
        }

        /**
         * access_token
         */
        public Builder xAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
            this.putHeaderParameter("x-acs-airticket-access-token", xAcsAirticketAccessToken);
            this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
            return this;
        }

        /**
         * x-acs-airticket-language.
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
