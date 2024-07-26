// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAddRequest} extends {@link RequestModel}
 *
 * <p>ApplyAddRequest</p>
 */
public class ApplyAddRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("budget")
    private Long budget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("budget_merge")
    private Integer budgetMerge;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("car_rule")
    private CarRule carRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("corp_name")
    private String corpName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("default_standard")
    private DefaultStandard defaultStandard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("depart_id")
    private String departId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("depart_name")
    private String departName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extend_field")
    private String extendField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("external_traveler_list")
    private java.util.List < ExternalTravelerList> externalTravelerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("external_traveler_standard")
    private ExternalTravelerStandard externalTravelerStandard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("flight_budget")
    private Long flightBudget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotel_budget")
    private Long hotelBudget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotel_share")
    private HotelShare hotelShare;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("international_flight_cabins")
    private String internationalFlightCabins;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itinerary_list")
    private java.util.List < ItineraryList> itineraryList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itinerary_rule")
    private Integer itineraryRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itinerary_set_list")
    private java.util.List < ItinerarySetList> itinerarySetList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit_traveler")
    private Integer limitTraveler;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("payment_department_id")
    private String paymentDepartmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("payment_department_name")
    private String paymentDepartmentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sub_corp_id")
    private String subCorpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdpartApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thirdpart_business_id")
    private String thirdpartBusinessId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thirdpart_depart_id")
    private String thirdpartDepartId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("together_book_rule")
    private Integer togetherBookRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("train_budget")
    private Long trainBudget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("traveler_list")
    private java.util.List < TravelerList> travelerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("traveler_standard")
    private java.util.List < TravelerStandard> travelerStandard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("trip_cause")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tripCause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("trip_day")
    private Integer tripDay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("trip_title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tripTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("union_no")
    private String unionNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vehicle_budget")
    private Long vehicleBudget;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ApplyAddRequest(Builder builder) {
        super(builder);
        this.budget = builder.budget;
        this.budgetMerge = builder.budgetMerge;
        this.carRule = builder.carRule;
        this.corpName = builder.corpName;
        this.defaultStandard = builder.defaultStandard;
        this.departId = builder.departId;
        this.departName = builder.departName;
        this.extendField = builder.extendField;
        this.externalTravelerList = builder.externalTravelerList;
        this.externalTravelerStandard = builder.externalTravelerStandard;
        this.flightBudget = builder.flightBudget;
        this.hotelBudget = builder.hotelBudget;
        this.hotelShare = builder.hotelShare;
        this.internationalFlightCabins = builder.internationalFlightCabins;
        this.itineraryList = builder.itineraryList;
        this.itineraryRule = builder.itineraryRule;
        this.itinerarySetList = builder.itinerarySetList;
        this.limitTraveler = builder.limitTraveler;
        this.paymentDepartmentId = builder.paymentDepartmentId;
        this.paymentDepartmentName = builder.paymentDepartmentName;
        this.status = builder.status;
        this.subCorpId = builder.subCorpId;
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
        this.type = builder.type;
        this.unionNo = builder.unionNo;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.vehicleBudget = builder.vehicleBudget;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAddRequest create() {
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
     * @return carRule
     */
    public CarRule getCarRule() {
        return this.carRule;
    }

    /**
     * @return corpName
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * @return defaultStandard
     */
    public DefaultStandard getDefaultStandard() {
        return this.defaultStandard;
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
     * @return internationalFlightCabins
     */
    public String getInternationalFlightCabins() {
        return this.internationalFlightCabins;
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
     * @return paymentDepartmentId
     */
    public String getPaymentDepartmentId() {
        return this.paymentDepartmentId;
    }

    /**
     * @return paymentDepartmentName
     */
    public String getPaymentDepartmentName() {
        return this.paymentDepartmentName;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
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
     * @return type
     */
    public Integer getType() {
        return this.type;
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

    public static final class Builder extends Request.Builder<ApplyAddRequest, Builder> {
        private Long budget; 
        private Integer budgetMerge; 
        private CarRule carRule; 
        private String corpName; 
        private DefaultStandard defaultStandard; 
        private String departId; 
        private String departName; 
        private String extendField; 
        private java.util.List < ExternalTravelerList> externalTravelerList; 
        private ExternalTravelerStandard externalTravelerStandard; 
        private Long flightBudget; 
        private Long hotelBudget; 
        private HotelShare hotelShare; 
        private String internationalFlightCabins; 
        private java.util.List < ItineraryList> itineraryList; 
        private Integer itineraryRule; 
        private java.util.List < ItinerarySetList> itinerarySetList; 
        private Integer limitTraveler; 
        private String paymentDepartmentId; 
        private String paymentDepartmentName; 
        private Integer status; 
        private String subCorpId; 
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
        private Integer type; 
        private String unionNo; 
        private String userId; 
        private String userName; 
        private Long vehicleBudget; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAddRequest request) {
            super(request);
            this.budget = request.budget;
            this.budgetMerge = request.budgetMerge;
            this.carRule = request.carRule;
            this.corpName = request.corpName;
            this.defaultStandard = request.defaultStandard;
            this.departId = request.departId;
            this.departName = request.departName;
            this.extendField = request.extendField;
            this.externalTravelerList = request.externalTravelerList;
            this.externalTravelerStandard = request.externalTravelerStandard;
            this.flightBudget = request.flightBudget;
            this.hotelBudget = request.hotelBudget;
            this.hotelShare = request.hotelShare;
            this.internationalFlightCabins = request.internationalFlightCabins;
            this.itineraryList = request.itineraryList;
            this.itineraryRule = request.itineraryRule;
            this.itinerarySetList = request.itinerarySetList;
            this.limitTraveler = request.limitTraveler;
            this.paymentDepartmentId = request.paymentDepartmentId;
            this.paymentDepartmentName = request.paymentDepartmentName;
            this.status = request.status;
            this.subCorpId = request.subCorpId;
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
            this.type = request.type;
            this.unionNo = request.unionNo;
            this.userId = request.userId;
            this.userName = request.userName;
            this.vehicleBudget = request.vehicleBudget;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * budget.
         */
        public Builder budget(Long budget) {
            this.putBodyParameter("budget", budget);
            this.budget = budget;
            return this;
        }

        /**
         * budget_merge.
         */
        public Builder budgetMerge(Integer budgetMerge) {
            this.putBodyParameter("budget_merge", budgetMerge);
            this.budgetMerge = budgetMerge;
            return this;
        }

        /**
         * car_rule.
         */
        public Builder carRule(CarRule carRule) {
            String carRuleShrink = shrink(carRule, "car_rule", "json");
            this.putBodyParameter("car_rule", carRuleShrink);
            this.carRule = carRule;
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
         * default_standard.
         */
        public Builder defaultStandard(DefaultStandard defaultStandard) {
            String defaultStandardShrink = shrink(defaultStandard, "default_standard", "json");
            this.putBodyParameter("default_standard", defaultStandardShrink);
            this.defaultStandard = defaultStandard;
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
         * flight_budget.
         */
        public Builder flightBudget(Long flightBudget) {
            this.putBodyParameter("flight_budget", flightBudget);
            this.flightBudget = flightBudget;
            return this;
        }

        /**
         * hotel_budget.
         */
        public Builder hotelBudget(Long hotelBudget) {
            this.putBodyParameter("hotel_budget", hotelBudget);
            this.hotelBudget = hotelBudget;
            return this;
        }

        /**
         * hotel_share.
         */
        public Builder hotelShare(HotelShare hotelShare) {
            String hotelShareShrink = shrink(hotelShare, "hotel_share", "json");
            this.putBodyParameter("hotel_share", hotelShareShrink);
            this.hotelShare = hotelShare;
            return this;
        }

        /**
         * international_flight_cabins.
         */
        public Builder internationalFlightCabins(String internationalFlightCabins) {
            this.putBodyParameter("international_flight_cabins", internationalFlightCabins);
            this.internationalFlightCabins = internationalFlightCabins;
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
         * itinerary_rule.
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
         * limit_traveler.
         */
        public Builder limitTraveler(Integer limitTraveler) {
            this.putBodyParameter("limit_traveler", limitTraveler);
            this.limitTraveler = limitTraveler;
            return this;
        }

        /**
         * payment_department_id.
         */
        public Builder paymentDepartmentId(String paymentDepartmentId) {
            this.putBodyParameter("payment_department_id", paymentDepartmentId);
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }

        /**
         * payment_department_name.
         */
        public Builder paymentDepartmentName(String paymentDepartmentName) {
            this.putBodyParameter("payment_department_name", paymentDepartmentName);
            this.paymentDepartmentName = paymentDepartmentName;
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
         * sub_corp_id.
         */
        public Builder subCorpId(String subCorpId) {
            this.putBodyParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
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
         * thirdpart_business_id.
         */
        public Builder thirdpartBusinessId(String thirdpartBusinessId) {
            this.putBodyParameter("thirdpart_business_id", thirdpartBusinessId);
            this.thirdpartBusinessId = thirdpartBusinessId;
            return this;
        }

        /**
         * thirdpart_depart_id.
         */
        public Builder thirdpartDepartId(String thirdpartDepartId) {
            this.putBodyParameter("thirdpart_depart_id", thirdpartDepartId);
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }

        /**
         * together_book_rule.
         */
        public Builder togetherBookRule(Integer togetherBookRule) {
            this.putBodyParameter("together_book_rule", togetherBookRule);
            this.togetherBookRule = togetherBookRule;
            return this;
        }

        /**
         * train_budget.
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
         * type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * union_no.
         */
        public Builder unionNo(String unionNo) {
            this.putBodyParameter("union_no", unionNo);
            this.unionNo = unionNo;
            return this;
        }

        /**
         * user_id.
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
         * vehicle_budget.
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
        public ApplyAddRequest build() {
            return new ApplyAddRequest(this);
        } 

    } 

    public static class CarRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scenario_template_id")
        private String scenarioTemplateId;

        @com.aliyun.core.annotation.NameInMap("scenario_template_name")
        private String scenarioTemplateName;

        private CarRule(Builder builder) {
            this.scenarioTemplateId = builder.scenarioTemplateId;
            this.scenarioTemplateName = builder.scenarioTemplateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CarRule create() {
            return builder().build();
        }

        /**
         * @return scenarioTemplateId
         */
        public String getScenarioTemplateId() {
            return this.scenarioTemplateId;
        }

        /**
         * @return scenarioTemplateName
         */
        public String getScenarioTemplateName() {
            return this.scenarioTemplateName;
        }

        public static final class Builder {
            private String scenarioTemplateId; 
            private String scenarioTemplateName; 

            /**
             * scenario_template_id.
             */
            public Builder scenarioTemplateId(String scenarioTemplateId) {
                this.scenarioTemplateId = scenarioTemplateId;
                return this;
            }

            /**
             * scenario_template_name.
             */
            public Builder scenarioTemplateName(String scenarioTemplateName) {
                this.scenarioTemplateName = scenarioTemplateName;
                return this;
            }

            public CarRule build() {
                return new CarRule(this);
            } 

        } 

    }
    public static class HotelCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
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
    public static class HotelIntlCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
        private Long fee;

        private HotelIntlCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelIntlCitys create() {
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

            public HotelIntlCitys build() {
                return new HotelIntlCitys(this);
            } 

        } 

    }
    public static class DefaultStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("business_discount")
        private Integer businessDiscount;

        @com.aliyun.core.annotation.NameInMap("economy_discount")
        private Integer economyDiscount;

        @com.aliyun.core.annotation.NameInMap("first_discount")
        private Integer firstDiscount;

        @com.aliyun.core.annotation.NameInMap("flight_cabins")
        private String flightCabins;

        @com.aliyun.core.annotation.NameInMap("flight_intl_rule_code")
        private Long flightIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("flight_rule_code")
        private Long flightRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_citys")
        private java.util.List < HotelCitys> hotelCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_citys")
        private java.util.List < HotelIntlCitys> hotelIntlCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_rule_code")
        private Long hotelIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_rule_code")
        private Long hotelRuleCode;

        @com.aliyun.core.annotation.NameInMap("international_flight_cabins")
        private String internationalFlightCabins;

        @com.aliyun.core.annotation.NameInMap("premium_economy_discount")
        private Integer premiumEconomyDiscount;

        @com.aliyun.core.annotation.NameInMap("reserve_type")
        private Integer reserveType;

        @com.aliyun.core.annotation.NameInMap("train_rule_code")
        private Long trainRuleCode;

        @com.aliyun.core.annotation.NameInMap("train_seats")
        private String trainSeats;

        private DefaultStandard(Builder builder) {
            this.businessDiscount = builder.businessDiscount;
            this.economyDiscount = builder.economyDiscount;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.flightIntlRuleCode = builder.flightIntlRuleCode;
            this.flightRuleCode = builder.flightRuleCode;
            this.hotelCitys = builder.hotelCitys;
            this.hotelIntlCitys = builder.hotelIntlCitys;
            this.hotelIntlRuleCode = builder.hotelIntlRuleCode;
            this.hotelRuleCode = builder.hotelRuleCode;
            this.internationalFlightCabins = builder.internationalFlightCabins;
            this.premiumEconomyDiscount = builder.premiumEconomyDiscount;
            this.reserveType = builder.reserveType;
            this.trainRuleCode = builder.trainRuleCode;
            this.trainSeats = builder.trainSeats;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultStandard create() {
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
         * @return flightIntlRuleCode
         */
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        /**
         * @return flightRuleCode
         */
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        /**
         * @return hotelCitys
         */
        public java.util.List < HotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return hotelIntlCitys
         */
        public java.util.List < HotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        /**
         * @return hotelIntlRuleCode
         */
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        /**
         * @return hotelRuleCode
         */
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        /**
         * @return internationalFlightCabins
         */
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
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
         * @return trainRuleCode
         */
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
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
            private Long flightIntlRuleCode; 
            private Long flightRuleCode; 
            private java.util.List < HotelCitys> hotelCitys; 
            private java.util.List < HotelIntlCitys> hotelIntlCitys; 
            private Long hotelIntlRuleCode; 
            private Long hotelRuleCode; 
            private String internationalFlightCabins; 
            private Integer premiumEconomyDiscount; 
            private Integer reserveType; 
            private Long trainRuleCode; 
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
             * flight_cabins.
             */
            public Builder flightCabins(String flightCabins) {
                this.flightCabins = flightCabins;
                return this;
            }

            /**
             * flight_intl_rule_code.
             */
            public Builder flightIntlRuleCode(Long flightIntlRuleCode) {
                this.flightIntlRuleCode = flightIntlRuleCode;
                return this;
            }

            /**
             * flight_rule_code.
             */
            public Builder flightRuleCode(Long flightRuleCode) {
                this.flightRuleCode = flightRuleCode;
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
             * hotel_intl_citys.
             */
            public Builder hotelIntlCitys(java.util.List < HotelIntlCitys> hotelIntlCitys) {
                this.hotelIntlCitys = hotelIntlCitys;
                return this;
            }

            /**
             * hotel_intl_rule_code.
             */
            public Builder hotelIntlRuleCode(Long hotelIntlRuleCode) {
                this.hotelIntlRuleCode = hotelIntlRuleCode;
                return this;
            }

            /**
             * hotel_rule_code.
             */
            public Builder hotelRuleCode(Long hotelRuleCode) {
                this.hotelRuleCode = hotelRuleCode;
                return this;
            }

            /**
             * international_flight_cabins.
             */
            public Builder internationalFlightCabins(String internationalFlightCabins) {
                this.internationalFlightCabins = internationalFlightCabins;
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
             * reserve_type.
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
                return this;
            }

            /**
             * train_rule_code.
             */
            public Builder trainRuleCode(Long trainRuleCode) {
                this.trainRuleCode = trainRuleCode;
                return this;
            }

            /**
             * train_seats.
             */
            public Builder trainSeats(String trainSeats) {
                this.trainSeats = trainSeats;
                return this;
            }

            public DefaultStandard build() {
                return new DefaultStandard(this);
            } 

        } 

    }
    public static class ExternalTravelerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private Long invoiceId;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("user_name_en")
        private String userNameEn;

        private ExternalTravelerList(Builder builder) {
            this.attribute = builder.attribute;
            this.costCenterId = builder.costCenterId;
            this.invoiceId = builder.invoiceId;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.thirdpartDepartId = builder.thirdpartDepartId;
            this.userName = builder.userName;
            this.userNameEn = builder.userNameEn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalTravelerList create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return paymentDepartmentId
         */
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        /**
         * @return paymentDepartmentName
         */
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
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
         * @return thirdpartDepartId
         */
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userNameEn
         */
        public String getUserNameEn() {
            return this.userNameEn;
        }

        public static final class Builder {
            private String attribute; 
            private Long costCenterId; 
            private Long invoiceId; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdPartInvoiceId; 
            private String thirdpartCostCenterId; 
            private String thirdpartDepartId; 
            private String userName; 
            private String userNameEn; 

            /**
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
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
             * invoice_id.
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * payment_department_id.
             */
            public Builder paymentDepartmentId(String paymentDepartmentId) {
                this.paymentDepartmentId = paymentDepartmentId;
                return this;
            }

            /**
             * payment_department_name.
             */
            public Builder paymentDepartmentName(String paymentDepartmentName) {
                this.paymentDepartmentName = paymentDepartmentName;
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
             * thirdpart_depart_id.
             */
            public Builder thirdpartDepartId(String thirdpartDepartId) {
                this.thirdpartDepartId = thirdpartDepartId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * user_name_en.
             */
            public Builder userNameEn(String userNameEn) {
                this.userNameEn = userNameEn;
                return this;
            }

            public ExternalTravelerList build() {
                return new ExternalTravelerList(this);
            } 

        } 

    }
    public static class ExternalTravelerStandardHotelCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
        private Long fee;

        private ExternalTravelerStandardHotelCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalTravelerStandardHotelCitys create() {
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

            public ExternalTravelerStandardHotelCitys build() {
                return new ExternalTravelerStandardHotelCitys(this);
            } 

        } 

    }
    public static class ExternalTravelerStandardHotelIntlCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
        private Long fee;

        private ExternalTravelerStandardHotelIntlCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalTravelerStandardHotelIntlCitys create() {
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

            public ExternalTravelerStandardHotelIntlCitys build() {
                return new ExternalTravelerStandardHotelIntlCitys(this);
            } 

        } 

    }
    public static class ExternalTravelerStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("business_discount")
        private Integer businessDiscount;

        @com.aliyun.core.annotation.NameInMap("economy_discount")
        private Integer economyDiscount;

        @com.aliyun.core.annotation.NameInMap("first_discount")
        private Integer firstDiscount;

        @com.aliyun.core.annotation.NameInMap("flight_cabins")
        private String flightCabins;

        @com.aliyun.core.annotation.NameInMap("flight_intl_rule_code")
        private Long flightIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("flight_rule_code")
        private Long flightRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_citys")
        private java.util.List < ExternalTravelerStandardHotelCitys> hotelCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_citys")
        private java.util.List < ExternalTravelerStandardHotelIntlCitys> hotelIntlCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_rule_code")
        private Long hotelIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_rule_code")
        private Long hotelRuleCode;

        @com.aliyun.core.annotation.NameInMap("international_flight_cabins")
        private String internationalFlightCabins;

        @com.aliyun.core.annotation.NameInMap("premium_economy_discount")
        private Integer premiumEconomyDiscount;

        @com.aliyun.core.annotation.NameInMap("reserve_type")
        private Integer reserveType;

        @com.aliyun.core.annotation.NameInMap("train_rule_code")
        private Long trainRuleCode;

        @com.aliyun.core.annotation.NameInMap("train_seats")
        private String trainSeats;

        private ExternalTravelerStandard(Builder builder) {
            this.businessDiscount = builder.businessDiscount;
            this.economyDiscount = builder.economyDiscount;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.flightIntlRuleCode = builder.flightIntlRuleCode;
            this.flightRuleCode = builder.flightRuleCode;
            this.hotelCitys = builder.hotelCitys;
            this.hotelIntlCitys = builder.hotelIntlCitys;
            this.hotelIntlRuleCode = builder.hotelIntlRuleCode;
            this.hotelRuleCode = builder.hotelRuleCode;
            this.internationalFlightCabins = builder.internationalFlightCabins;
            this.premiumEconomyDiscount = builder.premiumEconomyDiscount;
            this.reserveType = builder.reserveType;
            this.trainRuleCode = builder.trainRuleCode;
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
         * @return flightIntlRuleCode
         */
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        /**
         * @return flightRuleCode
         */
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        /**
         * @return hotelCitys
         */
        public java.util.List < ExternalTravelerStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return hotelIntlCitys
         */
        public java.util.List < ExternalTravelerStandardHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        /**
         * @return hotelIntlRuleCode
         */
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        /**
         * @return hotelRuleCode
         */
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        /**
         * @return internationalFlightCabins
         */
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
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
         * @return trainRuleCode
         */
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
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
            private Long flightIntlRuleCode; 
            private Long flightRuleCode; 
            private java.util.List < ExternalTravelerStandardHotelCitys> hotelCitys; 
            private java.util.List < ExternalTravelerStandardHotelIntlCitys> hotelIntlCitys; 
            private Long hotelIntlRuleCode; 
            private Long hotelRuleCode; 
            private String internationalFlightCabins; 
            private Integer premiumEconomyDiscount; 
            private Integer reserveType; 
            private Long trainRuleCode; 
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
             * flight_cabins.
             */
            public Builder flightCabins(String flightCabins) {
                this.flightCabins = flightCabins;
                return this;
            }

            /**
             * flight_intl_rule_code.
             */
            public Builder flightIntlRuleCode(Long flightIntlRuleCode) {
                this.flightIntlRuleCode = flightIntlRuleCode;
                return this;
            }

            /**
             * flight_rule_code.
             */
            public Builder flightRuleCode(Long flightRuleCode) {
                this.flightRuleCode = flightRuleCode;
                return this;
            }

            /**
             * hotel_citys.
             */
            public Builder hotelCitys(java.util.List < ExternalTravelerStandardHotelCitys> hotelCitys) {
                this.hotelCitys = hotelCitys;
                return this;
            }

            /**
             * hotel_intl_citys.
             */
            public Builder hotelIntlCitys(java.util.List < ExternalTravelerStandardHotelIntlCitys> hotelIntlCitys) {
                this.hotelIntlCitys = hotelIntlCitys;
                return this;
            }

            /**
             * hotel_intl_rule_code.
             */
            public Builder hotelIntlRuleCode(Long hotelIntlRuleCode) {
                this.hotelIntlRuleCode = hotelIntlRuleCode;
                return this;
            }

            /**
             * hotel_rule_code.
             */
            public Builder hotelRuleCode(Long hotelRuleCode) {
                this.hotelRuleCode = hotelRuleCode;
                return this;
            }

            /**
             * international_flight_cabins.
             */
            public Builder internationalFlightCabins(String internationalFlightCabins) {
                this.internationalFlightCabins = internationalFlightCabins;
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
             * reserve_type.
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
                return this;
            }

            /**
             * train_rule_code.
             */
            public Builder trainRuleCode(Long trainRuleCode) {
                this.trainRuleCode = trainRuleCode;
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
        @com.aliyun.core.annotation.NameInMap("param")
        private String param;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * param.
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * type.
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
    public static class ItineraryTravelStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotel_available_nights_per_day")
        private Integer hotelAvailableNightsPerDay;

        private ItineraryTravelStandard(Builder builder) {
            this.hotelAvailableNightsPerDay = builder.hotelAvailableNightsPerDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItineraryTravelStandard create() {
            return builder().build();
        }

        /**
         * @return hotelAvailableNightsPerDay
         */
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

        public static final class Builder {
            private Integer hotelAvailableNightsPerDay; 

            /**
             * hotel_available_nights_per_day.
             */
            public Builder hotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
                this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
                return this;
            }

            public ItineraryTravelStandard build() {
                return new ItineraryTravelStandard(this);
            } 

        } 

    }
    public static class ItineraryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private Long invoiceId;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("itinerary_travel_standard")
        private ItineraryTravelStandard itineraryTravelStandard;

        @com.aliyun.core.annotation.NameInMap("need_hotel")
        private Boolean needHotel;

        @com.aliyun.core.annotation.NameInMap("need_traffic")
        private Boolean needTraffic;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("province_travel_city_adcodes")
        private java.util.List < String > provinceTravelCityAdcodes;

        @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("traffic_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer trafficType;

        @com.aliyun.core.annotation.NameInMap("trip_way")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer tripWay;

        private ItineraryList(Builder builder) {
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrDate = builder.arrDate;
            this.attribute = builder.attribute;
            this.costCenterId = builder.costCenterId;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depDate = builder.depDate;
            this.invoiceId = builder.invoiceId;
            this.itineraryId = builder.itineraryId;
            this.itineraryTravelStandard = builder.itineraryTravelStandard;
            this.needHotel = builder.needHotel;
            this.needTraffic = builder.needTraffic;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.provinceTravelCityAdcodes = builder.provinceTravelCityAdcodes;
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
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
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
         * @return itineraryTravelStandard
         */
        public ItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
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
         * @return provinceTravelCityAdcodes
         */
        public java.util.List < String > getProvinceTravelCityAdcodes() {
            return this.provinceTravelCityAdcodes;
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
            private String attribute; 
            private Long costCenterId; 
            private String depCity; 
            private String depCityCode; 
            private String depDate; 
            private Long invoiceId; 
            private String itineraryId; 
            private ItineraryTravelStandard itineraryTravelStandard; 
            private Boolean needHotel; 
            private Boolean needTraffic; 
            private String projectCode; 
            private String projectTitle; 
            private java.util.List < String > provinceTravelCityAdcodes; 
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
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
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
             * itinerary_travel_standard.
             */
            public Builder itineraryTravelStandard(ItineraryTravelStandard itineraryTravelStandard) {
                this.itineraryTravelStandard = itineraryTravelStandard;
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
             * province_travel_city_adcodes.
             */
            public Builder provinceTravelCityAdcodes(java.util.List < String > provinceTravelCityAdcodes) {
                this.provinceTravelCityAdcodes = provinceTravelCityAdcodes;
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
             * traffic_type.
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
    public static class ItinerarySetListItineraryTravelStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotel_available_nights_per_day")
        private Integer hotelAvailableNightsPerDay;

        private ItinerarySetListItineraryTravelStandard(Builder builder) {
            this.hotelAvailableNightsPerDay = builder.hotelAvailableNightsPerDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItinerarySetListItineraryTravelStandard create() {
            return builder().build();
        }

        /**
         * @return hotelAvailableNightsPerDay
         */
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

        public static final class Builder {
            private Integer hotelAvailableNightsPerDay; 

            /**
             * hotel_available_nights_per_day.
             */
            public Builder hotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
                this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
                return this;
            }

            public ItinerarySetListItineraryTravelStandard build() {
                return new ItinerarySetListItineraryTravelStandard(this);
            } 

        } 

    }
    public static class ItinerarySetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("city_code_set")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cityCodeSet;

        @com.aliyun.core.annotation.NameInMap("city_set")
        @com.aliyun.core.annotation.Validation(required = true)
        private String citySet;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private Long invoiceId;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("itinerary_travel_standard")
        private ItinerarySetListItineraryTravelStandard itineraryTravelStandard;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("province_travel_city_adcodes")
        private java.util.List < String > provinceTravelCityAdcodes;

        @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("traffic_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer trafficType;

        private ItinerarySetList(Builder builder) {
            this.arrDate = builder.arrDate;
            this.attribute = builder.attribute;
            this.cityCodeSet = builder.cityCodeSet;
            this.citySet = builder.citySet;
            this.costCenterId = builder.costCenterId;
            this.depDate = builder.depDate;
            this.invoiceId = builder.invoiceId;
            this.itineraryId = builder.itineraryId;
            this.itineraryTravelStandard = builder.itineraryTravelStandard;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.provinceTravelCityAdcodes = builder.provinceTravelCityAdcodes;
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
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
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
         * @return itineraryTravelStandard
         */
        public ItinerarySetListItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
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
         * @return provinceTravelCityAdcodes
         */
        public java.util.List < String > getProvinceTravelCityAdcodes() {
            return this.provinceTravelCityAdcodes;
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
            private String attribute; 
            private String cityCodeSet; 
            private String citySet; 
            private Long costCenterId; 
            private String depDate; 
            private Long invoiceId; 
            private String itineraryId; 
            private ItinerarySetListItineraryTravelStandard itineraryTravelStandard; 
            private String projectCode; 
            private String projectTitle; 
            private java.util.List < String > provinceTravelCityAdcodes; 
            private String thirdPartInvoiceId; 
            private String thirdpartCostCenterId; 
            private Integer trafficType; 

            /**
             * arr_date.
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * city_code_set.
             */
            public Builder cityCodeSet(String cityCodeSet) {
                this.cityCodeSet = cityCodeSet;
                return this;
            }

            /**
             * city_set.
             */
            public Builder citySet(String citySet) {
                this.citySet = citySet;
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
             * itinerary_travel_standard.
             */
            public Builder itineraryTravelStandard(ItinerarySetListItineraryTravelStandard itineraryTravelStandard) {
                this.itineraryTravelStandard = itineraryTravelStandard;
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
             * province_travel_city_adcodes.
             */
            public Builder provinceTravelCityAdcodes(java.util.List < String > provinceTravelCityAdcodes) {
                this.provinceTravelCityAdcodes = provinceTravelCityAdcodes;
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
             * traffic_type.
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
        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private Long invoiceId;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private TravelerList(Builder builder) {
            this.attribute = builder.attribute;
            this.costCenterId = builder.costCenterId;
            this.invoiceId = builder.invoiceId;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.thirdpartDepartId = builder.thirdpartDepartId;
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
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return paymentDepartmentId
         */
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        /**
         * @return paymentDepartmentName
         */
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
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
         * @return thirdpartDepartId
         */
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
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
            private String attribute; 
            private Long costCenterId; 
            private Long invoiceId; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdPartInvoiceId; 
            private String thirdpartCostCenterId; 
            private String thirdpartDepartId; 
            private String userId; 
            private String userName; 

            /**
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
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
             * invoice_id.
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * payment_department_id.
             */
            public Builder paymentDepartmentId(String paymentDepartmentId) {
                this.paymentDepartmentId = paymentDepartmentId;
                return this;
            }

            /**
             * payment_department_name.
             */
            public Builder paymentDepartmentName(String paymentDepartmentName) {
                this.paymentDepartmentName = paymentDepartmentName;
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
             * thirdpart_depart_id.
             */
            public Builder thirdpartDepartId(String thirdpartDepartId) {
                this.thirdpartDepartId = thirdpartDepartId;
                return this;
            }

            /**
             * user_id.
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
    public static class CarCitySet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cityName;

        private CarCitySet(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CarCitySet create() {
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

        public static final class Builder {
            private String cityCode; 
            private String cityName; 

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

            public CarCitySet build() {
                return new CarCitySet(this);
            } 

        } 

    }
    public static class TravelerStandardHotelCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
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
    public static class TravelerStandardHotelIntlCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
        private Long fee;

        private TravelerStandardHotelIntlCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerStandardHotelIntlCitys create() {
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

            public TravelerStandardHotelIntlCitys build() {
                return new TravelerStandardHotelIntlCitys(this);
            } 

        } 

    }
    public static class TravelerStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("business_discount")
        private Integer businessDiscount;

        @com.aliyun.core.annotation.NameInMap("car_city_set")
        private java.util.List < CarCitySet> carCitySet;

        @com.aliyun.core.annotation.NameInMap("economy_discount")
        private Integer economyDiscount;

        @com.aliyun.core.annotation.NameInMap("first_discount")
        private Integer firstDiscount;

        @com.aliyun.core.annotation.NameInMap("flight_cabins")
        private String flightCabins;

        @com.aliyun.core.annotation.NameInMap("flight_intl_rule_code")
        private Long flightIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("flight_rule_code")
        private Long flightRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_citys")
        private java.util.List < TravelerStandardHotelCitys> hotelCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_citys")
        private java.util.List < TravelerStandardHotelIntlCitys> hotelIntlCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_rule_code")
        private Long hotelIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_rule_code")
        private Long hotelRuleCode;

        @com.aliyun.core.annotation.NameInMap("international_flight_cabins")
        private String internationalFlightCabins;

        @com.aliyun.core.annotation.NameInMap("premium_economy_discount")
        private Integer premiumEconomyDiscount;

        @com.aliyun.core.annotation.NameInMap("reserve_type")
        private Integer reserveType;

        @com.aliyun.core.annotation.NameInMap("train_rule_code")
        private Long trainRuleCode;

        @com.aliyun.core.annotation.NameInMap("train_seats")
        private String trainSeats;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private TravelerStandard(Builder builder) {
            this.businessDiscount = builder.businessDiscount;
            this.carCitySet = builder.carCitySet;
            this.economyDiscount = builder.economyDiscount;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.flightIntlRuleCode = builder.flightIntlRuleCode;
            this.flightRuleCode = builder.flightRuleCode;
            this.hotelCitys = builder.hotelCitys;
            this.hotelIntlCitys = builder.hotelIntlCitys;
            this.hotelIntlRuleCode = builder.hotelIntlRuleCode;
            this.hotelRuleCode = builder.hotelRuleCode;
            this.internationalFlightCabins = builder.internationalFlightCabins;
            this.premiumEconomyDiscount = builder.premiumEconomyDiscount;
            this.reserveType = builder.reserveType;
            this.trainRuleCode = builder.trainRuleCode;
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
         * @return carCitySet
         */
        public java.util.List < CarCitySet> getCarCitySet() {
            return this.carCitySet;
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
         * @return flightIntlRuleCode
         */
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        /**
         * @return flightRuleCode
         */
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        /**
         * @return hotelCitys
         */
        public java.util.List < TravelerStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return hotelIntlCitys
         */
        public java.util.List < TravelerStandardHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        /**
         * @return hotelIntlRuleCode
         */
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        /**
         * @return hotelRuleCode
         */
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        /**
         * @return internationalFlightCabins
         */
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
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
         * @return trainRuleCode
         */
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
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
            private java.util.List < CarCitySet> carCitySet; 
            private Integer economyDiscount; 
            private Integer firstDiscount; 
            private String flightCabins; 
            private Long flightIntlRuleCode; 
            private Long flightRuleCode; 
            private java.util.List < TravelerStandardHotelCitys> hotelCitys; 
            private java.util.List < TravelerStandardHotelIntlCitys> hotelIntlCitys; 
            private Long hotelIntlRuleCode; 
            private Long hotelRuleCode; 
            private String internationalFlightCabins; 
            private Integer premiumEconomyDiscount; 
            private Integer reserveType; 
            private Long trainRuleCode; 
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
             * car_city_set.
             */
            public Builder carCitySet(java.util.List < CarCitySet> carCitySet) {
                this.carCitySet = carCitySet;
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
             * flight_cabins.
             */
            public Builder flightCabins(String flightCabins) {
                this.flightCabins = flightCabins;
                return this;
            }

            /**
             * flight_intl_rule_code.
             */
            public Builder flightIntlRuleCode(Long flightIntlRuleCode) {
                this.flightIntlRuleCode = flightIntlRuleCode;
                return this;
            }

            /**
             * flight_rule_code.
             */
            public Builder flightRuleCode(Long flightRuleCode) {
                this.flightRuleCode = flightRuleCode;
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
             * hotel_intl_citys.
             */
            public Builder hotelIntlCitys(java.util.List < TravelerStandardHotelIntlCitys> hotelIntlCitys) {
                this.hotelIntlCitys = hotelIntlCitys;
                return this;
            }

            /**
             * hotel_intl_rule_code.
             */
            public Builder hotelIntlRuleCode(Long hotelIntlRuleCode) {
                this.hotelIntlRuleCode = hotelIntlRuleCode;
                return this;
            }

            /**
             * hotel_rule_code.
             */
            public Builder hotelRuleCode(Long hotelRuleCode) {
                this.hotelRuleCode = hotelRuleCode;
                return this;
            }

            /**
             * international_flight_cabins.
             */
            public Builder internationalFlightCabins(String internationalFlightCabins) {
                this.internationalFlightCabins = internationalFlightCabins;
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
             * reserve_type.
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
                return this;
            }

            /**
             * train_rule_code.
             */
            public Builder trainRuleCode(Long trainRuleCode) {
                this.trainRuleCode = trainRuleCode;
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
             * user_id.
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
