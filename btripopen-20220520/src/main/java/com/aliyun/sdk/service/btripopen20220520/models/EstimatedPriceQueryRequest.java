// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EstimatedPriceQueryRequest} extends {@link RequestModel}
 *
 * <p>EstimatedPriceQueryRequest</p>
 */
public class EstimatedPriceQueryRequest extends Request {
    @Query
    @NameInMap("arr_city")
    @Validation(required = true)
    private String arrCity;

    @Query
    @NameInMap("category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("dep_city")
    @Validation(required = true)
    private String depCity;

    @Query
    @NameInMap("end_time")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("itinerary_id")
    private String itineraryId;

    @Query
    @NameInMap("start_time")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("sub_corp_id")
    private String subCorpId;

    @Query
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private EstimatedPriceQueryRequest(Builder builder) {
        super(builder);
        this.arrCity = builder.arrCity;
        this.category = builder.category;
        this.depCity = builder.depCity;
        this.endTime = builder.endTime;
        this.itineraryId = builder.itineraryId;
        this.startTime = builder.startTime;
        this.subCorpId = builder.subCorpId;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EstimatedPriceQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrCity
     */
    public String getArrCity() {
        return this.arrCity;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return depCity
     */
    public String getDepCity() {
        return this.depCity;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return itineraryId
     */
    public String getItineraryId() {
        return this.itineraryId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<EstimatedPriceQueryRequest, Builder> {
        private String arrCity; 
        private String category; 
        private String depCity; 
        private Long endTime; 
        private String itineraryId; 
        private Long startTime; 
        private String subCorpId; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(EstimatedPriceQueryRequest request) {
            super(request);
            this.arrCity = request.arrCity;
            this.category = request.category;
            this.depCity = request.depCity;
            this.endTime = request.endTime;
            this.itineraryId = request.itineraryId;
            this.startTime = request.startTime;
            this.subCorpId = request.subCorpId;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * 目的地。
         */
        public Builder arrCity(String arrCity) {
            this.putQueryParameter("arr_city", arrCity);
            this.arrCity = arrCity;
            return this;
        }

        /**
         * 类目：
         * <p>
         * flight：机票
         * hotel：酒店
         * train：火车
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * 出发地点。
         */
        public Builder depCity(String depCity) {
            this.putQueryParameter("dep_city", depCity);
            this.depCity = depCity;
            return this;
        }

        /**
         * 返程时间: 毫秒时间戳
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("end_time", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 行程ID。
         * <p>
         * 企业内部应用，通过获取申请单列表接口获取。
         * 第三方企业应用，通过获取申请单列表接口获取。
         */
        public Builder itineraryId(String itineraryId) {
            this.putQueryParameter("itinerary_id", itineraryId);
            this.itineraryId = itineraryId;
            return this;
        }

        /**
         * 出发时间: 毫秒时间戳
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("start_time", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 子企业corpId
         */
        public Builder subCorpId(String subCorpId) {
            this.putQueryParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
            return this;
        }

        /**
         * 用户的userid
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public EstimatedPriceQueryRequest build() {
            return new EstimatedPriceQueryRequest(this);
        } 

    } 

}
