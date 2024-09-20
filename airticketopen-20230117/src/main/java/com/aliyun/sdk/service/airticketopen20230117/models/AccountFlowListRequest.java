// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccountFlowListRequest} extends {@link RequestModel}
 *
 * <p>AccountFlowListRequest</p>
 */
public class AccountFlowListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("day_num")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dayNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_index")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("utc_begin_time")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long utcBeginTime;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private AccountFlowListRequest(Builder builder) {
        super(builder);
        this.dayNum = builder.dayNum;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.utcBeginTime = builder.utcBeginTime;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccountFlowListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dayNum
     */
    public Integer getDayNum() {
        return this.dayNum;
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
     * @return utcBeginTime
     */
    public Long getUtcBeginTime() {
        return this.utcBeginTime;
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

    public static final class Builder extends Request.Builder<AccountFlowListRequest, Builder> {
        private Integer dayNum; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long utcBeginTime; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(AccountFlowListRequest request) {
            super(request);
            this.dayNum = request.dayNum;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.utcBeginTime = request.utcBeginTime;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * day_num.
         */
        public Builder dayNum(Integer dayNum) {
            this.putQueryParameter("day_num", dayNum);
            this.dayNum = dayNum;
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
         * utc_begin_time.
         */
        public Builder utcBeginTime(Long utcBeginTime) {
            this.putQueryParameter("utc_begin_time", utcBeginTime);
            this.utcBeginTime = utcBeginTime;
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
        public AccountFlowListRequest build() {
            return new AccountFlowListRequest(this);
        } 

    } 

}
