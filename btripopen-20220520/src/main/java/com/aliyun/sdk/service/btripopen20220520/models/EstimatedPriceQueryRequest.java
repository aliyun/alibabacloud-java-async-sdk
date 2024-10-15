// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EstimatedPriceQueryRequest} extends {@link RequestModel}
 *
 * <p>EstimatedPriceQueryRequest</p>
 */
public class EstimatedPriceQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("arr_city")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arrCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_city")
    @com.aliyun.core.annotation.Validation(required = true)
    private String depCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end_time")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("itinerary_id")
    private String itineraryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start_time")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sub_corp_id")
    private String subCorpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
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
         * <p>This parameter is required.</p>
         */
        public Builder arrCity(String arrCity) {
            this.putQueryParameter("arr_city", arrCity);
            this.arrCity = arrCity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flight</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder depCity(String depCity) {
            this.putQueryParameter("dep_city", depCity);
            this.depCity = depCity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1670601600000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("end_time", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * itinerary_id.
         */
        public Builder itineraryId(String itineraryId) {
            this.putQueryParameter("itinerary_id", itineraryId);
            this.itineraryId = itineraryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1670428800000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("start_time", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * sub_corp_id.
         */
        public Builder subCorpId(String subCorpId) {
            this.putQueryParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
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
