// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelSuggestV2Request} extends {@link RequestModel}
 *
 * <p>HotelSuggestV2Request</p>
 */
public class HotelSuggestV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("check_in")
    private String checkIn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("check_out")
    private String checkOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("city_code")
    private String cityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer searchType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelSuggestV2Request(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.checkIn = builder.checkIn;
        this.checkOut = builder.checkOut;
        this.cityCode = builder.cityCode;
        this.keyword = builder.keyword;
        this.searchType = builder.searchType;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelSuggestV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return checkIn
     */
    public String getCheckIn() {
        return this.checkIn;
    }

    /**
     * @return checkOut
     */
    public String getCheckOut() {
        return this.checkOut;
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return searchType
     */
    public Integer getSearchType() {
        return this.searchType;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelSuggestV2Request, Builder> {
        private String btripUserId; 
        private String checkIn; 
        private String checkOut; 
        private String cityCode; 
        private String keyword; 
        private Integer searchType; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelSuggestV2Request request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.checkIn = request.checkIn;
            this.checkOut = request.checkOut;
            this.cityCode = request.cityCode;
            this.keyword = request.keyword;
            this.searchType = request.searchType;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putQueryParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * check_in.
         */
        public Builder checkIn(String checkIn) {
            this.putQueryParameter("check_in", checkIn);
            this.checkIn = checkIn;
            return this;
        }

        /**
         * check_out.
         */
        public Builder checkOut(String checkOut) {
            this.putQueryParameter("check_out", checkOut);
            this.checkOut = checkOut;
            return this;
        }

        /**
         * city_code.
         */
        public Builder cityCode(String cityCode) {
            this.putQueryParameter("city_code", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * search_type.
         */
        public Builder searchType(Integer searchType) {
            this.putQueryParameter("search_type", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public HotelSuggestV2Request build() {
            return new HotelSuggestV2Request(this);
        } 

    } 

}
