// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeDetailListOfBuyerRequest} extends {@link RequestModel}
 *
 * <p>ChangeDetailListOfBuyerRequest</p>
 */
public class ChangeDetailListOfBuyerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_index")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("utc_create_begin")
    private Long utcCreateBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("utc_create_end")
    private Long utcCreateEnd;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private ChangeDetailListOfBuyerRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.utcCreateBegin = builder.utcCreateBegin;
        this.utcCreateEnd = builder.utcCreateEnd;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeDetailListOfBuyerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return utcCreateBegin
     */
    public Long getUtcCreateBegin() {
        return this.utcCreateBegin;
    }

    /**
     * @return utcCreateEnd
     */
    public Long getUtcCreateEnd() {
        return this.utcCreateEnd;
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

    public static final class Builder extends Request.Builder<ChangeDetailListOfBuyerRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long utcCreateBegin; 
        private Long utcCreateEnd; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(ChangeDetailListOfBuyerRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.utcCreateBegin = request.utcCreateBegin;
            this.utcCreateEnd = request.utcCreateEnd;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
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
         * utc_create_begin.
         */
        public Builder utcCreateBegin(Long utcCreateBegin) {
            this.putQueryParameter("utc_create_begin", utcCreateBegin);
            this.utcCreateBegin = utcCreateBegin;
            return this;
        }

        /**
         * utc_create_end.
         */
        public Builder utcCreateEnd(Long utcCreateEnd) {
            this.putQueryParameter("utc_create_end", utcCreateEnd);
            this.utcCreateEnd = utcCreateEnd;
            return this;
        }

        /**
         * <p>access_token</p>
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
         * x-acs-airticket-language.
         */
        public Builder xAcsAirticketLanguage(String xAcsAirticketLanguage) {
            this.putHeaderParameter("x-acs-airticket-language", xAcsAirticketLanguage);
            this.xAcsAirticketLanguage = xAcsAirticketLanguage;
            return this;
        }

        @Override
        public ChangeDetailListOfBuyerRequest build() {
            return new ChangeDetailListOfBuyerRequest(this);
        } 

    } 

}
