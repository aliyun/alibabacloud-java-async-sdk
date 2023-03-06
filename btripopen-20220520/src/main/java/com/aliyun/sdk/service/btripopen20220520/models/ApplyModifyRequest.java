// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyModifyRequest} extends {@link RequestModel}
 *
 * <p>ApplyModifyRequest</p>
 */
public class ApplyModifyRequest extends Request {
    @Body
    @NameInMap("budget")
    private Long budget;

    @Body
    @NameInMap("budget_merge")
    private Integer budgetMerge;

    @Body
    @NameInMap("corp_name")
    private String corpName;

    @Body
    @NameInMap("depart_id")
    private String departId;

    @Body
    @NameInMap("depart_name")
    private String departName;

    @Body
    @NameInMap("extend_field")
    private String extendField;

    @Body
    @NameInMap("external_traveler_list")
    private java.util.List < ExternalTravelerList> externalTravelerList;

    @Body
    @NameInMap("external_traveler_standard")
    private ExternalTravelerStandard externalTravelerStandard;

    @Body
    @NameInMap("flight_budget")
    private Long flightBudget;

    @Body
    @NameInMap("hotel_budget")
    private Long hotelBudget;

    @Body
    @NameInMap("hotel_share")
    private HotelShare hotelShare;

    @Body
    @NameInMap("itinerary_list")
    private java.util.List < ItineraryList> itineraryList;

    @Body
    @NameInMap("itinerary_rule")
    private Integer itineraryRule;

    @Body
    @NameInMap("itinerary_set_list")
    private java.util.List < ItinerarySetList> itinerarySetList;

    @Body
    @NameInMap("limit_traveler")
    private Integer limitTraveler;

    @Body
    @NameInMap("status")
    private Integer status;

    @Body
    @NameInMap("thirdpart_apply_id")
    @Validation(required = true)
    private String thirdpartApplyId;

    @Body
    @NameInMap("thirdpart_business_id")
    private String thirdpartBusinessId;

    @Body
    @NameInMap("thirdpart_depart_id")
    private String thirdpartDepartId;

    @Body
    @NameInMap("together_book_rule")
    private Integer togetherBookRule;

    @Body
    @NameInMap("train_budget")
    private Long trainBudget;

    @Body
    @NameInMap("traveler_list")
    private java.util.List < TravelerList> travelerList;

    @Body
    @NameInMap("traveler_standard")
    private java.util.List < TravelerStandard> travelerStandard;

    @Body
    @NameInMap("trip_cause")
    @Validation(required = true)
    private String tripCause;

    @Body
    @NameInMap("trip_day")
    private Integer tripDay;

    @Body
    @NameInMap("trip_title")
    @Validation(required = true)
    private String tripTitle;

    @Body
    @NameInMap("union_no")
    private String unionNo;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("user_name")
    private String userName;

    @Body
    @NameInMap("vehicle_budget")
    private Long vehicleBudget;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    @Validation(required = true)
    private String xAcsBtripSoCorpToken;

    private ApplyModifyRequest(Builder builder) {
        super(builder);
        this.budget = builder.budget;
        this.budgetMerge = builder.budgetMerge;
        this.corpName = builder.corpName;
        this.departId = builder.departId;
        this.departName = builder.departName;
        this.extendField = builder.extendField;
        this.externalTravelerList = builder.externalTravelerList;
        this.externalTravelerStandard = builder.externalTravelerStandard;
        this.flightBudget = builder.flightBudget;
        this.hotelBudget = builder.hotelBudget;
        this.hotelShare = builder.hotelShare;
        this.itineraryList = builder.itineraryList;
        this.itineraryRule = builder.itineraryRule;
        this.itinerarySetList = builder.itinerarySetList;
        this.limitTraveler = builder.limitTraveler;
        this.status = builder.status;
        this.thirdpartApplyId = builder.thirdpartApplyId;
        this.thirdpartBusinessId = builder.thirdpartBusinessId;
        this.thirdpartDepartId = builder.thirdpartDepartId;
        this.togetherBookRule = builder.togetherBookRule;
        this.trainBudget = builder.trainBudget;
        this.travelerList = builder.travelerList;
        this.travelerStandard = builder.travelerStandard;
        this.tripCause = builder.tripCause;
        this.tripDay = builder.tripDay;
        this.tripTitle = builder.tripTitle;
        this.unionNo = builder.unionNo;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.vehicleBudget = builder.vehicleBudget;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyModifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return budget
     */
    public Long getBudget() {
        return this.budget;
    }

    /**
     * @return budgetMerge
     */
    public Integer getBudgetMerge() {
        return this.budgetMerge;
    }

    /**
     * @return corpName
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * @return departId
     */
    public String getDepartId() {
        return this.departId;
    }

    /**
     * @return departName
     */
    public String getDepartName() {
        return this.departName;
    }

    /**
     * @return extendField
     */
    public String getExtendField() {
        return this.extendField;
    }

    /**
     * @return externalTravelerList
     */
    public java.util.List < ExternalTravelerList> getExternalTravelerList() {
        return this.externalTravelerList;
    }

    /**
     * @return externalTravelerStandard
     */
    public ExternalTravelerStandard getExternalTravelerStandard() {
        return this.externalTravelerStandard;
    }

    /**
     * @return flightBudget
     */
    public Long getFlightBudget() {
        return this.flightBudget;
    }

    /**
     * @return hotelBudget
     */
    public Long getHotelBudget() {
        return this.hotelBudget;
    }

    /**
     * @return hotelShare
     */
    public HotelShare getHotelShare() {
        return this.hotelShare;
    }

    /**
     * @return itineraryList
     */
    public java.util.List < ItineraryList> getItineraryList() {
        return this.itineraryList;
    }

    /**
     * @return itineraryRule
     */
    public Integer getItineraryRule() {
        return this.itineraryRule;
    }

    /**
     * @return itinerarySetList
     */
    public java.util.List < ItinerarySetList> getItinerarySetList() {
        return this.itinerarySetList;
    }

    /**
     * @return limitTraveler
     */
    public Integer getLimitTraveler() {
        return this.limitTraveler;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return thirdpartApplyId
     */
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    /**
     * @return thirdpartBusinessId
     */
    public String getThirdpartBusinessId() {
        return this.thirdpartBusinessId;
    }

    /**
     * @return thirdpartDepartId
     */
    public String getThirdpartDepartId() {
        return this.thirdpartDepartId;
    }

    /**
     * @return togetherBookRule
     */
    public Integer getTogetherBookRule() {
        return this.togetherBookRule;
    }

    /**
     * @return trainBudget
     */
    public Long getTrainBudget() {
        return this.trainBudget;
    }

    /**
     * @return travelerList
     */
    public java.util.List < TravelerList> getTravelerList() {
        return this.travelerList;
    }

    /**
     * @return travelerStandard
     */
    public java.util.List < TravelerStandard> getTravelerStandard() {
        return this.travelerStandard;
    }

    /**
     * @return tripCause
     */
    public String getTripCause() {
        return this.tripCause;
    }

    /**
     * @return tripDay
     */
    public Integer getTripDay() {
        return this.tripDay;
    }

    /**
     * @return tripTitle
     */
    public String getTripTitle() {
        return this.tripTitle;
    }

    /**
     * @return unionNo
     */
    public String getUnionNo() {
        return this.unionNo;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vehicleBudget
     */
    public Long getVehicleBudget() {
        return this.vehicleBudget;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<ApplyModifyRequest, Builder> {
        private Long budget; 
        private Integer budgetMerge; 
        private String corpName; 
        private String departId; 
        private String departName; 
        private String extendField; 
        private java.util.List < ExternalTravelerList> externalTravelerList; 
        private ExternalTravelerStandard externalTravelerStandard; 
        private Long flightBudget; 
        private Long hotelBudget; 
        private HotelShare hotelShare; 
        private java.util.List < ItineraryList> itineraryList; 
        private Integer itineraryRule; 
        private java.util.List < ItinerarySetList> itinerarySetList; 
        private Integer limitTraveler; 
        private Integer status; 
        private String thirdpartApplyId; 
        private String thirdpartBusinessId; 
        private String thirdpartDepartId; 
        private Integer togetherBookRule; 
        private Long trainBudget; 
        private java.util.List < TravelerList> travelerList; 
        private java.util.List < TravelerStandard> travelerStandard; 
        private String tripCause; 
        private Integer tripDay; 
        private String tripTitle; 
        private String unionNo; 
        private String userId; 
        private String userName; 
        private Long vehicleBudget; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ApplyModifyRequest request) {
            super(request);
            this.budget = request.budget;
            this.budgetMerge = request.budgetMerge;
            this.corpName = request.corpName;
            this.departId = request.departId;
            this.departName = request.departName;
            this.extendField = request.extendField;
            this.externalTravelerList = request.externalTravelerList;
            this.externalTravelerStandard = request.externalTravelerStandard;
            this.flightBudget = request.flightBudget;
            this.hotelBudget = request.hotelBudget;
            this.hotelShare = request.hotelShare;
            this.itineraryList = request.itineraryList;
            this.itineraryRule = request.itineraryRule;
            this.itinerarySetList = request.itinerarySetList;
            this.limitTraveler = request.limitTraveler;
            this.status = request.status;
            this.thirdpartApplyId = request.thirdpartApplyId;
            this.thirdpartBusinessId = request.thirdpartBusinessId;
            this.thirdpartDepartId = request.thirdpartDepartId;
            this.togetherBookRule = request.togetherBookRule;
            this.trainBudget = request.trainBudget;
            this.travelerList = request.travelerList;
            this.travelerStandard = request.travelerStandard;
            this.tripCause = request.tripCause;
            this.tripDay = request.tripDay;
            this.tripTitle = request.tripTitle;
            this.unionNo = request.unionNo;
            this.userId = request.userId;
            this.userName = request.userName;
            this.vehicleBudget = request.vehicleBudget;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * 审批单总预算(分)
         */
        public Builder budget(Long budget) {
            this.putBodyParameter("budget", budget);
            this.budget = budget;
            return this;
        }

        /**
         * 多个申请单预算合并。
         */
        public Builder budgetMerge(Integer budgetMerge) {
            this.putBodyParameter("budget_merge", budgetMerge);
            this.budgetMerge = budgetMerge;
            return this;
        }

        /**
         * corp_name.
         */
        public Builder corpName(String corpName) {
            this.putBodyParameter("corp_name", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * depart_id.
         */
        public Builder departId(String departId) {
            this.putBodyParameter("depart_id", departId);
            this.departId = departId;
            return this;
        }

        /**
         * depart_name.
         */
        public Builder departName(String departName) {
            this.putBodyParameter("depart_name", departName);
            this.departName = departName;
            return this;
        }

        /**
         * 可将补充描述传入此字段，账单中将会体现此字段的值。可以用于企业的统计和对账
         */
        public Builder extendField(String extendField) {
            this.putBodyParameter("extend_field", extendField);
            this.extendField = extendField;
            return this;
        }

        /**
         * external_traveler_list.
         */
        public Builder externalTravelerList(java.util.List < ExternalTravelerList> externalTravelerList) {
            String externalTravelerListShrink = shrink(externalTravelerList, "external_traveler_list", "json");
            this.putBodyParameter("external_traveler_list", externalTravelerListShrink);
            this.externalTravelerList = externalTravelerList;
            return this;
        }

        /**
         * external_traveler_standard.
         */
        public Builder externalTravelerStandard(ExternalTravelerStandard externalTravelerStandard) {
            String externalTravelerStandardShrink = shrink(externalTravelerStandard, "external_traveler_standard", "json");
            this.putBodyParameter("external_traveler_standard", externalTravelerStandardShrink);
            this.externalTravelerStandard = externalTravelerStandard;
            return this;
        }

        /**
         * 审批单机票预算(分)
         */
        public Builder flightBudget(Long flightBudget) {
            this.putBodyParameter("flight_budget", flightBudget);
            this.flightBudget = flightBudget;
            return this;
        }

        /**
         * 审批单酒店预算(分)
         */
        public Builder hotelBudget(Long hotelBudget) {
            this.putBodyParameter("hotel_budget", hotelBudget);
            this.hotelBudget = hotelBudget;
            return this;
        }

        /**
         * 酒店合住规则
         */
        public Builder hotelShare(HotelShare hotelShare) {
            String hotelShareShrink = shrink(hotelShare, "hotel_share", "json");
            this.putBodyParameter("hotel_share", hotelShareShrink);
            this.hotelShare = hotelShare;
            return this;
        }

        /**
         * itinerary_list.
         */
        public Builder itineraryList(java.util.List < ItineraryList> itineraryList) {
            String itineraryListShrink = shrink(itineraryList, "itinerary_list", "json");
            this.putBodyParameter("itinerary_list", itineraryListShrink);
            this.itineraryList = itineraryList;
            return this;
        }

        /**
         * 申请单城市规则：
         * <p>
         * 0出发&目的地一对一，按列表传行程 
         * 1多选N个地点，城市集行程
         * 不传默认为0
         * 会根据商旅管理后台-通用差旅设置-行程城市规则中的设置，校验申请单本字段的值是否正确
         * 当行程城市规则中设置的是“1对1行程”时，必须传0
         * 当行程城市规则中设置的是“多对多城市集行程”时，必须传1
         * 会根据此字段传入的值，校验行程传参是否正确
         * 当申请单城市规则为0，itinerary_list行程列表必填
         * 当申请单城市规则为1，城市集行程必填
         */
        public Builder itineraryRule(Integer itineraryRule) {
            this.putBodyParameter("itinerary_rule", itineraryRule);
            this.itineraryRule = itineraryRule;
            return this;
        }

        /**
         * itinerary_set_list.
         */
        public Builder itinerarySetList(java.util.List < ItinerarySetList> itinerarySetList) {
            String itinerarySetListShrink = shrink(itinerarySetList, "itinerary_set_list", "json");
            this.putBodyParameter("itinerary_set_list", itinerarySetListShrink);
            this.itinerarySetList = itinerarySetList;
            return this;
        }

        /**
         * 是否限制审批单的出行人
         */
        public Builder limitTraveler(Integer limitTraveler) {
            this.putBodyParameter("limit_traveler", limitTraveler);
            this.limitTraveler = limitTraveler;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * thirdpart_apply_id.
         */
        public Builder thirdpartApplyId(String thirdpartApplyId) {
            this.putBodyParameter("thirdpart_apply_id", thirdpartApplyId);
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }

        /**
         * 审批单的展示id
         */
        public Builder thirdpartBusinessId(String thirdpartBusinessId) {
            this.putBodyParameter("thirdpart_business_id", thirdpartBusinessId);
            this.thirdpartBusinessId = thirdpartBusinessId;
            return this;
        }

        /**
         * 三方部门id
         * <p>
         * thirdpart_depart_id和depart_id中任意一个传值，以该字段为准
         * thirdpart_depart_id和depart_id均传值，以thirdpart_depart_id为准
         */
        public Builder thirdpartDepartId(String thirdpartDepartId) {
            this.putBodyParameter("thirdpart_depart_id", thirdpartDepartId);
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }

        /**
         * 同时预订(机票&火车票)规则。1：就高；2：就低。
         */
        public Builder togetherBookRule(Integer togetherBookRule) {
            this.putBodyParameter("together_book_rule", togetherBookRule);
            this.togetherBookRule = togetherBookRule;
            return this;
        }

        /**
         * 审批单火车票预算(分)
         */
        public Builder trainBudget(Long trainBudget) {
            this.putBodyParameter("train_budget", trainBudget);
            this.trainBudget = trainBudget;
            return this;
        }

        /**
         * traveler_list.
         */
        public Builder travelerList(java.util.List < TravelerList> travelerList) {
            String travelerListShrink = shrink(travelerList, "traveler_list", "json");
            this.putBodyParameter("traveler_list", travelerListShrink);
            this.travelerList = travelerList;
            return this;
        }

        /**
         * traveler_standard.
         */
        public Builder travelerStandard(java.util.List < TravelerStandard> travelerStandard) {
            String travelerStandardShrink = shrink(travelerStandard, "traveler_standard", "json");
            this.putBodyParameter("traveler_standard", travelerStandardShrink);
            this.travelerStandard = travelerStandard;
            return this;
        }

        /**
         * trip_cause.
         */
        public Builder tripCause(String tripCause) {
            this.putBodyParameter("trip_cause", tripCause);
            this.tripCause = tripCause;
            return this;
        }

        /**
         * trip_day.
         */
        public Builder tripDay(Integer tripDay) {
            this.putBodyParameter("trip_day", tripDay);
            this.tripDay = tripDay;
            return this;
        }

        /**
         * trip_title.
         */
        public Builder tripTitle(String tripTitle) {
            this.putBodyParameter("trip_title", tripTitle);
            this.tripTitle = tripTitle;
            return this;
        }

        /**
         * 关联单号
         */
        public Builder unionNo(String unionNo) {
            this.putBodyParameter("union_no", unionNo);
            this.unionNo = unionNo;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("user_name", userName);
            this.userName = userName;
            return this;
        }

        /**
         * 审批单用车预算(分)
         */
        public Builder vehicleBudget(Long vehicleBudget) {
            this.putBodyParameter("vehicle_budget", vehicleBudget);
            this.vehicleBudget = vehicleBudget;
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
        public ApplyModifyRequest build() {
            return new ApplyModifyRequest(this);
        } 

    } 

    public static class ExternalTravelerList extends TeaModel {
        @NameInMap("user_name")
        private String userName;

        private ExternalTravelerList(Builder builder) {
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalTravelerList create() {
            return builder().build();
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userName; 

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ExternalTravelerList build() {
                return new ExternalTravelerList(this);
            } 

        } 

    }
    public static class HotelCitys extends TeaModel {
        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("fee")
        private Long fee;

        private HotelCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelCitys create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return fee
         */
        public Long getFee() {
            return this.fee;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Long fee; 

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * fee.
             */
            public Builder fee(Long fee) {
                this.fee = fee;
                return this;
            }

            public HotelCitys build() {
                return new HotelCitys(this);
            } 

        } 

    }
    public static class ExternalTravelerStandard extends TeaModel {
        @NameInMap("business_discount")
        private Integer businessDiscount;

        @NameInMap("economy_discount")
        private Integer economyDiscount;

        @NameInMap("first_discount")
        private Integer firstDiscount;

        @NameInMap("flight_cabins")
        private String flightCabins;

        @NameInMap("hotel_citys")
        private java.util.List < HotelCitys> hotelCitys;

        @NameInMap("premium_economy_discount")
        private Integer premiumEconomyDiscount;

        @NameInMap("reserve_type")
        private Integer reserveType;

        @NameInMap("train_seats")
        private String trainSeats;

        private ExternalTravelerStandard(Builder builder) {
            this.businessDiscount = builder.businessDiscount;
            this.economyDiscount = builder.economyDiscount;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.hotelCitys = builder.hotelCitys;
            this.premiumEconomyDiscount = builder.premiumEconomyDiscount;
            this.reserveType = builder.reserveType;
            this.trainSeats = builder.trainSeats;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalTravelerStandard create() {
            return builder().build();
        }

        /**
         * @return businessDiscount
         */
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        /**
         * @return economyDiscount
         */
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        /**
         * @return firstDiscount
         */
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        /**
         * @return flightCabins
         */
        public String getFlightCabins() {
            return this.flightCabins;
        }

        /**
         * @return hotelCitys
         */
        public java.util.List < HotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return premiumEconomyDiscount
         */
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        /**
         * @return reserveType
         */
        public Integer getReserveType() {
            return this.reserveType;
        }

        /**
         * @return trainSeats
         */
        public String getTrainSeats() {
            return this.trainSeats;
        }

        public static final class Builder {
            private Integer businessDiscount; 
            private Integer economyDiscount; 
            private Integer firstDiscount; 
            private String flightCabins; 
            private java.util.List < HotelCitys> hotelCitys; 
            private Integer premiumEconomyDiscount; 
            private Integer reserveType; 
            private String trainSeats; 

            /**
             * business_discount.
             */
            public Builder businessDiscount(Integer businessDiscount) {
                this.businessDiscount = businessDiscount;
                return this;
            }

            /**
             * economy_discount.
             */
            public Builder economyDiscount(Integer economyDiscount) {
                this.economyDiscount = economyDiscount;
                return this;
            }

            /**
             * first_discount.
             */
            public Builder firstDiscount(Integer firstDiscount) {
                this.firstDiscount = firstDiscount;
                return this;
            }

            /**
             * 国内机票舱等，多值逗号分隔。F：头等舱，C：商务舱，Y：经济舱，P：超级经济舱
             */
            public Builder flightCabins(String flightCabins) {
                this.flightCabins = flightCabins;
                return this;
            }

            /**
             * hotel_citys.
             */
            public Builder hotelCitys(java.util.List < HotelCitys> hotelCitys) {
                this.hotelCitys = hotelCitys;
                return this;
            }

            /**
             * premium_economy_discount.
             */
            public Builder premiumEconomyDiscount(Integer premiumEconomyDiscount) {
                this.premiumEconomyDiscount = premiumEconomyDiscount;
                return this;
            }

            /**
             * 限制差标类型。0-不限差标，1-限制差标
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
                return this;
            }

            /**
             * train_seats.
             */
            public Builder trainSeats(String trainSeats) {
                this.trainSeats = trainSeats;
                return this;
            }

            public ExternalTravelerStandard build() {
                return new ExternalTravelerStandard(this);
            } 

        } 

    }
    public static class HotelShare extends TeaModel {
        @NameInMap("param")
        private String param;

        @NameInMap("type")
        private String type;

        private HotelShare(Builder builder) {
            this.param = builder.param;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelShare create() {
            return builder().build();
        }

        /**
         * @return param
         */
        public String getParam() {
            return this.param;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String param; 
            private String type; 

            /**
             * 比例/固定金额
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * 合住公式（HotelShareEnum.type）
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HotelShare build() {
                return new HotelShare(this);
            } 

        } 

    }
    public static class ItineraryList extends TeaModel {
        @NameInMap("arr_city")
        @Validation(required = true)
        private String arrCity;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_date")
        @Validation(required = true)
        private String arrDate;

        @NameInMap("cost_center_id")
        private Long costCenterId;

        @NameInMap("dep_city")
        @Validation(required = true)
        private String depCity;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_date")
        @Validation(required = true)
        private String depDate;

        @NameInMap("invoice_id")
        private Long invoiceId;

        @NameInMap("itinerary_id")
        @Validation(required = true)
        private String itineraryId;

        @NameInMap("need_hotel")
        private Boolean needHotel;

        @NameInMap("need_traffic")
        private Boolean needTraffic;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @NameInMap("traffic_type")
        @Validation(required = true)
        private Integer trafficType;

        @NameInMap("trip_way")
        @Validation(required = true)
        private Integer tripWay;

        private ItineraryList(Builder builder) {
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrDate = builder.arrDate;
            this.costCenterId = builder.costCenterId;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depDate = builder.depDate;
            this.invoiceId = builder.invoiceId;
            this.itineraryId = builder.itineraryId;
            this.needHotel = builder.needHotel;
            this.needTraffic = builder.needTraffic;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.trafficType = builder.trafficType;
            this.tripWay = builder.tripWay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItineraryList create() {
            return builder().build();
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return itineraryId
         */
        public String getItineraryId() {
            return this.itineraryId;
        }

        /**
         * @return needHotel
         */
        public Boolean getNeedHotel() {
            return this.needHotel;
        }

        /**
         * @return needTraffic
         */
        public Boolean getNeedTraffic() {
            return this.needTraffic;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return thirdPartInvoiceId
         */
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        /**
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        /**
         * @return trafficType
         */
        public Integer getTrafficType() {
            return this.trafficType;
        }

        /**
         * @return tripWay
         */
        public Integer getTripWay() {
            return this.tripWay;
        }

        public static final class Builder {
            private String arrCity; 
            private String arrCityCode; 
            private String arrDate; 
            private Long costCenterId; 
            private String depCity; 
            private String depCityCode; 
            private String depDate; 
            private Long invoiceId; 
            private String itineraryId; 
            private Boolean needHotel; 
            private Boolean needTraffic; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdPartInvoiceId; 
            private String thirdpartCostCenterId; 
            private Integer trafficType; 
            private Integer tripWay; 

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_date.
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * cost_center_id.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * dep_city.
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * invoice_id.
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * itinerary_id.
             */
            public Builder itineraryId(String itineraryId) {
                this.itineraryId = itineraryId;
                return this;
            }

            /**
             * need_hotel.
             */
            public Builder needHotel(Boolean needHotel) {
                this.needHotel = needHotel;
                return this;
            }

            /**
             * need_traffic.
             */
            public Builder needTraffic(Boolean needTraffic) {
                this.needTraffic = needTraffic;
                return this;
            }

            /**
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_title.
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            /**
             * third_part_invoice_id.
             */
            public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
                this.thirdPartInvoiceId = thirdPartInvoiceId;
                return this;
            }

            /**
             * thirdpart_cost_center_id.
             */
            public Builder thirdpartCostCenterId(String thirdpartCostCenterId) {
                this.thirdpartCostCenterId = thirdpartCostCenterId;
                return this;
            }

            /**
             * 交通方式： 0 飞机、酒店,  1 火车、酒店,  2 汽车、酒店,  3 酒店，5 不限，6 飞机，7 火车，9 飞机、火车、酒店
             */
            public Builder trafficType(Integer trafficType) {
                this.trafficType = trafficType;
                return this;
            }

            /**
             * trip_way.
             */
            public Builder tripWay(Integer tripWay) {
                this.tripWay = tripWay;
                return this;
            }

            public ItineraryList build() {
                return new ItineraryList(this);
            } 

        } 

    }
    public static class ItinerarySetList extends TeaModel {
        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("city_code_set")
        private String cityCodeSet;

        @NameInMap("city_set")
        private String citySet;

        @NameInMap("cost_center_id")
        private Long costCenterId;

        @NameInMap("dep_date")
        private String depDate;

        @NameInMap("invoice_id")
        private Long invoiceId;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @NameInMap("traffic_type")
        private Integer trafficType;

        private ItinerarySetList(Builder builder) {
            this.arrDate = builder.arrDate;
            this.cityCodeSet = builder.cityCodeSet;
            this.citySet = builder.citySet;
            this.costCenterId = builder.costCenterId;
            this.depDate = builder.depDate;
            this.invoiceId = builder.invoiceId;
            this.itineraryId = builder.itineraryId;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.trafficType = builder.trafficType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItinerarySetList create() {
            return builder().build();
        }

        /**
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
        }

        /**
         * @return cityCodeSet
         */
        public String getCityCodeSet() {
            return this.cityCodeSet;
        }

        /**
         * @return citySet
         */
        public String getCitySet() {
            return this.citySet;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return itineraryId
         */
        public String getItineraryId() {
            return this.itineraryId;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return thirdPartInvoiceId
         */
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        /**
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        /**
         * @return trafficType
         */
        public Integer getTrafficType() {
            return this.trafficType;
        }

        public static final class Builder {
            private String arrDate; 
            private String cityCodeSet; 
            private String citySet; 
            private Long costCenterId; 
            private String depDate; 
            private Long invoiceId; 
            private String itineraryId; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdPartInvoiceId; 
            private String thirdpartCostCenterId; 
            private Integer trafficType; 

            /**
             * 到达日期
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * 离抵城市code，多个城市请用中文“，”隔开
             * <p>
             * 当允许预订的类目为1/3/7/9时，仅传行政区划citycode允许通过
             * 当允许预订的类目为0/6时，仅传城市三字码允许通过
             */
            public Builder cityCodeSet(String cityCodeSet) {
                this.cityCodeSet = cityCodeSet;
                return this;
            }

            /**
             * 离抵城市名称，多个城市请用中文“，”隔开
             */
            public Builder citySet(String citySet) {
                this.citySet = citySet;
                return this;
            }

            /**
             * 商旅成本中心id，和第三方成本中心id二者选择其一即可
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * 出发日期
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * 商旅发票id，和第三方发票Id二者选择其一即可
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * 行程id
             */
            public Builder itineraryId(String itineraryId) {
                this.itineraryId = itineraryId;
                return this;
            }

            /**
             * 项目编号
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            /**
             * 第三方发票id，和商旅发票id二者选择其一即可
             */
            public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
                this.thirdPartInvoiceId = thirdPartInvoiceId;
                return this;
            }

            /**
             * 第三方成本中心id，和商旅成本中心id二者选择其一即可
             */
            public Builder thirdpartCostCenterId(String thirdpartCostCenterId) {
                this.thirdpartCostCenterId = thirdpartCostCenterId;
                return this;
            }

            /**
             * 交通方式： 0 飞机、酒店,  1 火车、酒店,  2 汽车、酒店,  3 酒店，5 不限，6 飞机，7 火车，9 飞机、火车、酒店
             */
            public Builder trafficType(Integer trafficType) {
                this.trafficType = trafficType;
                return this;
            }

            public ItinerarySetList build() {
                return new ItinerarySetList(this);
            } 

        } 

    }
    public static class TravelerList extends TeaModel {
        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private TravelerList(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerList create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            /**
             * 无userId时传缺省值superAdmin
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public TravelerList build() {
                return new TravelerList(this);
            } 

        } 

    }
    public static class TravelerStandardHotelCitys extends TeaModel {
        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("fee")
        private Long fee;

        private TravelerStandardHotelCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerStandardHotelCitys create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return fee
         */
        public Long getFee() {
            return this.fee;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Long fee; 

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * fee.
             */
            public Builder fee(Long fee) {
                this.fee = fee;
                return this;
            }

            public TravelerStandardHotelCitys build() {
                return new TravelerStandardHotelCitys(this);
            } 

        } 

    }
    public static class TravelerStandard extends TeaModel {
        @NameInMap("business_discount")
        private Integer businessDiscount;

        @NameInMap("economy_discount")
        private Integer economyDiscount;

        @NameInMap("first_discount")
        private Integer firstDiscount;

        @NameInMap("flight_cabins")
        private String flightCabins;

        @NameInMap("hotel_citys")
        private java.util.List < TravelerStandardHotelCitys> hotelCitys;

        @NameInMap("premium_economy_discount")
        private Integer premiumEconomyDiscount;

        @NameInMap("reserve_type")
        private Integer reserveType;

        @NameInMap("train_seats")
        private String trainSeats;

        @NameInMap("user_id")
        private String userId;

        private TravelerStandard(Builder builder) {
            this.businessDiscount = builder.businessDiscount;
            this.economyDiscount = builder.economyDiscount;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.hotelCitys = builder.hotelCitys;
            this.premiumEconomyDiscount = builder.premiumEconomyDiscount;
            this.reserveType = builder.reserveType;
            this.trainSeats = builder.trainSeats;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerStandard create() {
            return builder().build();
        }

        /**
         * @return businessDiscount
         */
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        /**
         * @return economyDiscount
         */
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        /**
         * @return firstDiscount
         */
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        /**
         * @return flightCabins
         */
        public String getFlightCabins() {
            return this.flightCabins;
        }

        /**
         * @return hotelCitys
         */
        public java.util.List < TravelerStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return premiumEconomyDiscount
         */
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        /**
         * @return reserveType
         */
        public Integer getReserveType() {
            return this.reserveType;
        }

        /**
         * @return trainSeats
         */
        public String getTrainSeats() {
            return this.trainSeats;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer businessDiscount; 
            private Integer economyDiscount; 
            private Integer firstDiscount; 
            private String flightCabins; 
            private java.util.List < TravelerStandardHotelCitys> hotelCitys; 
            private Integer premiumEconomyDiscount; 
            private Integer reserveType; 
            private String trainSeats; 
            private String userId; 

            /**
             * business_discount.
             */
            public Builder businessDiscount(Integer businessDiscount) {
                this.businessDiscount = businessDiscount;
                return this;
            }

            /**
             * economy_discount.
             */
            public Builder economyDiscount(Integer economyDiscount) {
                this.economyDiscount = economyDiscount;
                return this;
            }

            /**
             * first_discount.
             */
            public Builder firstDiscount(Integer firstDiscount) {
                this.firstDiscount = firstDiscount;
                return this;
            }

            /**
             * 国内机票舱等，多值逗号分隔。F：头等舱，C：商务舱，Y：经济舱，P：超级经济舱
             */
            public Builder flightCabins(String flightCabins) {
                this.flightCabins = flightCabins;
                return this;
            }

            /**
             * hotel_citys.
             */
            public Builder hotelCitys(java.util.List < TravelerStandardHotelCitys> hotelCitys) {
                this.hotelCitys = hotelCitys;
                return this;
            }

            /**
             * premium_economy_discount.
             */
            public Builder premiumEconomyDiscount(Integer premiumEconomyDiscount) {
                this.premiumEconomyDiscount = premiumEconomyDiscount;
                return this;
            }

            /**
             * 限制差标类型。0-不限差标，1-限制差标
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
                return this;
            }

            /**
             * train_seats.
             */
            public Builder trainSeats(String trainSeats) {
                this.trainSeats = trainSeats;
                return this;
            }

            /**
             * 无userId时传缺省值superAdmin
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TravelerStandard build() {
                return new TravelerStandard(this);
            } 

        } 

    }
}
