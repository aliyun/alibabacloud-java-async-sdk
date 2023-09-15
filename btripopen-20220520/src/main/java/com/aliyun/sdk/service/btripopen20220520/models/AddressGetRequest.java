// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddressGetRequest} extends {@link RequestModel}
 *
 * <p>AddressGetRequest</p>
 */
public class AddressGetRequest extends Request {
    @Query
    @NameInMap("action_type")
    @Validation(required = true)
    private Integer actionType;

    @Query
    @NameInMap("arr_city_code")
    private String arrCityCode;

    @Query
    @NameInMap("arr_city_name")
    private String arrCityName;

    @Query
    @NameInMap("car_scenes_code")
    private String carScenesCode;

    @Query
    @NameInMap("dep_city_code")
    private String depCityCode;

    @Query
    @NameInMap("dep_city_name")
    private String depCityName;

    @Query
    @NameInMap("dep_date")
    private String depDate;

    @Query
    @NameInMap("itinerary_id")
    private String itineraryId;

    @Query
    @NameInMap("order_Id")
    private String orderId;

    @Query
    @NameInMap("phone")
    private String phone;

    @Query
    @NameInMap("sub_corp_id")
    private String subCorpId;

    @Query
    @NameInMap("taobao_callback_url")
    private String taobaoCallbackUrl;

    @Query
    @NameInMap("type")
    private Integer type;

    @Query
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private AddressGetRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.arrCityCode = builder.arrCityCode;
        this.arrCityName = builder.arrCityName;
        this.carScenesCode = builder.carScenesCode;
        this.depCityCode = builder.depCityCode;
        this.depCityName = builder.depCityName;
        this.depDate = builder.depDate;
        this.itineraryId = builder.itineraryId;
        this.orderId = builder.orderId;
        this.phone = builder.phone;
        this.subCorpId = builder.subCorpId;
        this.taobaoCallbackUrl = builder.taobaoCallbackUrl;
        this.type = builder.type;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressGetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public Integer getActionType() {
        return this.actionType;
    }

    /**
     * @return arrCityCode
     */
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    /**
     * @return arrCityName
     */
    public String getArrCityName() {
        return this.arrCityName;
    }

    /**
     * @return carScenesCode
     */
    public String getCarScenesCode() {
        return this.carScenesCode;
    }

    /**
     * @return depCityCode
     */
    public String getDepCityCode() {
        return this.depCityCode;
    }

    /**
     * @return depCityName
     */
    public String getDepCityName() {
        return this.depCityName;
    }

    /**
     * @return depDate
     */
    public String getDepDate() {
        return this.depDate;
    }

    /**
     * @return itineraryId
     */
    public String getItineraryId() {
        return this.itineraryId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
    }

    /**
     * @return taobaoCallbackUrl
     */
    public String getTaobaoCallbackUrl() {
        return this.taobaoCallbackUrl;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
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

    public static final class Builder extends Request.Builder<AddressGetRequest, Builder> {
        private Integer actionType; 
        private String arrCityCode; 
        private String arrCityName; 
        private String carScenesCode; 
        private String depCityCode; 
        private String depCityName; 
        private String depDate; 
        private String itineraryId; 
        private String orderId; 
        private String phone; 
        private String subCorpId; 
        private String taobaoCallbackUrl; 
        private Integer type; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(AddressGetRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.arrCityCode = request.arrCityCode;
            this.arrCityName = request.arrCityName;
            this.carScenesCode = request.carScenesCode;
            this.depCityCode = request.depCityCode;
            this.depCityName = request.depCityName;
            this.depDate = request.depDate;
            this.itineraryId = request.itineraryId;
            this.orderId = request.orderId;
            this.phone = request.phone;
            this.subCorpId = request.subCorpId;
            this.taobaoCallbackUrl = request.taobaoCallbackUrl;
            this.type = request.type;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * action_type.
         */
        public Builder actionType(Integer actionType) {
            this.putQueryParameter("action_type", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * arr_city_code.
         */
        public Builder arrCityCode(String arrCityCode) {
            this.putQueryParameter("arr_city_code", arrCityCode);
            this.arrCityCode = arrCityCode;
            return this;
        }

        /**
         * arr_city_name.
         */
        public Builder arrCityName(String arrCityName) {
            this.putQueryParameter("arr_city_name", arrCityName);
            this.arrCityName = arrCityName;
            return this;
        }

        /**
         * car_scenes_code.
         */
        public Builder carScenesCode(String carScenesCode) {
            this.putQueryParameter("car_scenes_code", carScenesCode);
            this.carScenesCode = carScenesCode;
            return this;
        }

        /**
         * dep_city_code.
         */
        public Builder depCityCode(String depCityCode) {
            this.putQueryParameter("dep_city_code", depCityCode);
            this.depCityCode = depCityCode;
            return this;
        }

        /**
         * dep_city_name.
         */
        public Builder depCityName(String depCityName) {
            this.putQueryParameter("dep_city_name", depCityName);
            this.depCityName = depCityName;
            return this;
        }

        /**
         * dep_date.
         */
        public Builder depDate(String depDate) {
            this.putQueryParameter("dep_date", depDate);
            this.depDate = depDate;
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
         * order_Id.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("order_Id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("phone", phone);
            this.phone = phone;
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
         * taobao_callback_url.
         */
        public Builder taobaoCallbackUrl(String taobaoCallbackUrl) {
            this.putQueryParameter("taobao_callback_url", taobaoCallbackUrl);
            this.taobaoCallbackUrl = taobaoCallbackUrl;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * user_id.
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
        public AddressGetRequest build() {
            return new AddressGetRequest(this);
        } 

    } 

}
