// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link AddressGetRequest} extends {@link RequestModel}
 *
 * <p>AddressGetRequest</p>
 */
public class AddressGetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("action_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("arr_city_code")
    private String arrCityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("arr_city_name")
    private String arrCityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("car_scenes_code")
    private String carScenesCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_city_code")
    private String depCityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_city_name")
    private String depCityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dep_date")
    private String depDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("itinerary_id")
    private String itineraryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("middle_page")
    private Integer middlePage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_Id")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sub_corp_id")
    private String subCorpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taobao_callback_url")
    private String taobaoCallbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
    private String thirdpartApplyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("traveler_id")
    private String travelerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("use_booking_proxy")
    private Integer useBookingProxy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
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
        this.middlePage = builder.middlePage;
        this.orderId = builder.orderId;
        this.phone = builder.phone;
        this.subCorpId = builder.subCorpId;
        this.taobaoCallbackUrl = builder.taobaoCallbackUrl;
        this.thirdpartApplyId = builder.thirdpartApplyId;
        this.travelerId = builder.travelerId;
        this.type = builder.type;
        this.useBookingProxy = builder.useBookingProxy;
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
     * @return middlePage
     */
    public Integer getMiddlePage() {
        return this.middlePage;
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
     * @return thirdpartApplyId
     */
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    /**
     * @return travelerId
     */
    public String getTravelerId() {
        return this.travelerId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return useBookingProxy
     */
    public Integer getUseBookingProxy() {
        return this.useBookingProxy;
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
        private Integer middlePage; 
        private String orderId; 
        private String phone; 
        private String subCorpId; 
        private String taobaoCallbackUrl; 
        private String thirdpartApplyId; 
        private String travelerId; 
        private Integer type; 
        private Integer useBookingProxy; 
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
            this.middlePage = request.middlePage;
            this.orderId = request.orderId;
            this.phone = request.phone;
            this.subCorpId = request.subCorpId;
            this.taobaoCallbackUrl = request.taobaoCallbackUrl;
            this.thirdpartApplyId = request.thirdpartApplyId;
            this.travelerId = request.travelerId;
            this.type = request.type;
            this.useBookingProxy = request.useBookingProxy;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * middle_page.
         */
        public Builder middlePage(Integer middlePage) {
            this.putQueryParameter("middle_page", middlePage);
            this.middlePage = middlePage;
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
         * thirdpart_apply_id.
         */
        public Builder thirdpartApplyId(String thirdpartApplyId) {
            this.putQueryParameter("thirdpart_apply_id", thirdpartApplyId);
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }

        /**
         * traveler_id.
         */
        public Builder travelerId(String travelerId) {
            this.putQueryParameter("traveler_id", travelerId);
            this.travelerId = travelerId;
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
         * use_booking_proxy.
         */
        public Builder useBookingProxy(Integer useBookingProxy) {
            this.putQueryParameter("use_booking_proxy", useBookingProxy);
            this.useBookingProxy = useBookingProxy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
