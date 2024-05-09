// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainOrderListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TrainOrderListQueryResponseBody</p>
 */
public class TrainOrderListQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List < Module> module;

    @com.aliyun.core.annotation.NameInMap("page_info")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TrainOrderListQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainOrderListQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public java.util.List < Module> getModule() {
        return this.module;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < Module> module; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(java.util.List < Module> module) {
            this.module = module;
            return this;
        }

        /**
         * page_info.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainOrderListQueryResponseBody build() {
            return new TrainOrderListQueryResponseBody(this);
        } 

    } 

    public static class CostCenter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("number")
        private String number;

        private CostCenter(Builder builder) {
            this.corpId = builder.corpId;
            this.id = builder.id;
            this.name = builder.name;
            this.number = builder.number;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenter create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        public static final class Builder {
            private String corpId; 
            private Long id; 
            private String name; 
            private String number; 

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            public CostCenter build() {
                return new CostCenter(this);
            } 

        } 

    }
    public static class Invoice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Invoice(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invoice create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private String title; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Invoice build() {
                return new Invoice(this);
            } 

        } 

    }
    public static class PriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category_code")
        private Integer categoryCode;

        @com.aliyun.core.annotation.NameInMap("category_type")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("end_city")
        private String endCity;

        @com.aliyun.core.annotation.NameInMap("end_time")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("original_train_no")
        private String originalTrainNo;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("start_city")
        private String startCity;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("trade_id")
        private String tradeId;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.categoryType = builder.categoryType;
            this.endCity = builder.endCity;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.originalTrainNo = builder.originalTrainNo;
            this.passengerName = builder.passengerName;
            this.payType = builder.payType;
            this.price = builder.price;
            this.seatType = builder.seatType;
            this.startCity = builder.startCity;
            this.startTime = builder.startTime;
            this.tradeId = builder.tradeId;
            this.trainNo = builder.trainNo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryCode
         */
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return endCity
         */
        public String getEndCity() {
            return this.endCity;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return originalTrainNo
         */
        public String getOriginalTrainNo() {
            return this.originalTrainNo;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return startCity
         */
        public String getStartCity() {
            return this.startCity;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return tradeId
         */
        public String getTradeId() {
            return this.tradeId;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer categoryCode; 
            private Integer categoryType; 
            private String endCity; 
            private String endTime; 
            private String gmtCreate; 
            private String originalTrainNo; 
            private String passengerName; 
            private Integer payType; 
            private Double price; 
            private String seatType; 
            private String startCity; 
            private String startTime; 
            private String tradeId; 
            private String trainNo; 
            private Integer type; 

            /**
             * category_code.
             */
            public Builder categoryCode(Integer categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * category_type.
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * end_city.
             */
            public Builder endCity(String endCity) {
                this.endCity = endCity;
                return this;
            }

            /**
             * end_time.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * original_train_no.
             */
            public Builder originalTrainNo(String originalTrainNo) {
                this.originalTrainNo = originalTrainNo;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * pay_type.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * seat_type.
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * start_city.
             */
            public Builder startCity(String startCity) {
                this.startCity = startCity;
                return this;
            }

            /**
             * start_time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * trade_id.
             */
            public Builder tradeId(String tradeId) {
                this.tradeId = tradeId;
                return this;
            }

            /**
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public PriceInfoList build() {
                return new PriceInfoList(this);
            } 

        } 

    }
    public static class UserAffiliateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private UserAffiliateList(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAffiliateList create() {
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

            public UserAffiliateList build() {
                return new UserAffiliateList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_ad_code")
        private String arrCityAdCode;

        @com.aliyun.core.annotation.NameInMap("arr_station")
        private String arrStation;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("btrip_title")
        private String btripTitle;

        @com.aliyun.core.annotation.NameInMap("contact_name")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private CostCenter costCenter;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_ad_code")
        private String depCityAdCode;

        @com.aliyun.core.annotation.NameInMap("dep_station")
        private String depStation;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("invoice")
        private Invoice invoice;

        @com.aliyun.core.annotation.NameInMap("price_info_list")
        private java.util.List < PriceInfoList> priceInfoList;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_id")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("rider_name")
        private String riderName;

        @com.aliyun.core.annotation.NameInMap("run_time")
        private String runTime;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("third_part_project_id")
        private String thirdPartProjectId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("ticket_count")
        private Integer ticketCount;

        @com.aliyun.core.annotation.NameInMap("ticket_no12306")
        private String ticketNo12306;

        @com.aliyun.core.annotation.NameInMap("train_number")
        private String trainNumber;

        @com.aliyun.core.annotation.NameInMap("train_type")
        private String trainType;

        @com.aliyun.core.annotation.NameInMap("user_affiliate_list")
        private java.util.List < UserAffiliateList> userAffiliateList;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.arrCity = builder.arrCity;
            this.arrCityAdCode = builder.arrCityAdCode;
            this.arrStation = builder.arrStation;
            this.arrTime = builder.arrTime;
            this.btripTitle = builder.btripTitle;
            this.contactName = builder.contactName;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.costCenter = builder.costCenter;
            this.depCity = builder.depCity;
            this.depCityAdCode = builder.depCityAdCode;
            this.depStation = builder.depStation;
            this.depTime = builder.depTime;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.invoice = builder.invoice;
            this.priceInfoList = builder.priceInfoList;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.riderName = builder.riderName;
            this.runTime = builder.runTime;
            this.seatType = builder.seatType;
            this.status = builder.status;
            this.thirdPartProjectId = builder.thirdPartProjectId;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.ticketCount = builder.ticketCount;
            this.ticketNo12306 = builder.ticketNo12306;
            this.trainNumber = builder.trainNumber;
            this.trainType = builder.trainType;
            this.userAffiliateList = builder.userAffiliateList;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return arrCityAdCode
         */
        public String getArrCityAdCode() {
            return this.arrCityAdCode;
        }

        /**
         * @return arrStation
         */
        public String getArrStation() {
            return this.arrStation;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return btripTitle
         */
        public String getBtripTitle() {
            return this.btripTitle;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return costCenter
         */
        public CostCenter getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
        }

        /**
         * @return depCityAdCode
         */
        public String getDepCityAdCode() {
            return this.depCityAdCode;
        }

        /**
         * @return depStation
         */
        public String getDepStation() {
            return this.depStation;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return invoice
         */
        public Invoice getInvoice() {
            return this.invoice;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List < PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return riderName
         */
        public String getRiderName() {
            return this.riderName;
        }

        /**
         * @return runTime
         */
        public String getRunTime() {
            return this.runTime;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return thirdPartProjectId
         */
        public String getThirdPartProjectId() {
            return this.thirdPartProjectId;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return ticketCount
         */
        public Integer getTicketCount() {
            return this.ticketCount;
        }

        /**
         * @return ticketNo12306
         */
        public String getTicketNo12306() {
            return this.ticketNo12306;
        }

        /**
         * @return trainNumber
         */
        public String getTrainNumber() {
            return this.trainNumber;
        }

        /**
         * @return trainType
         */
        public String getTrainType() {
            return this.trainType;
        }

        /**
         * @return userAffiliateList
         */
        public java.util.List < UserAffiliateList> getUserAffiliateList() {
            return this.userAffiliateList;
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
            private Long applyId; 
            private String arrCity; 
            private String arrCityAdCode; 
            private String arrStation; 
            private String arrTime; 
            private String btripTitle; 
            private String contactName; 
            private String corpId; 
            private String corpName; 
            private CostCenter costCenter; 
            private String depCity; 
            private String depCityAdCode; 
            private String depStation; 
            private String depTime; 
            private String departId; 
            private String departName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Invoice invoice; 
            private java.util.List < PriceInfoList> priceInfoList; 
            private String projectCode; 
            private Long projectId; 
            private String projectTitle; 
            private String riderName; 
            private String runTime; 
            private String seatType; 
            private Integer status; 
            private String thirdPartProjectId; 
            private String thirdpartApplyId; 
            private String thirdpartItineraryId; 
            private Integer ticketCount; 
            private String ticketNo12306; 
            private String trainNumber; 
            private String trainType; 
            private java.util.List < UserAffiliateList> userAffiliateList; 
            private String userId; 
            private String userName; 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * arr_city_ad_code.
             */
            public Builder arrCityAdCode(String arrCityAdCode) {
                this.arrCityAdCode = arrCityAdCode;
                return this;
            }

            /**
             * arr_station.
             */
            public Builder arrStation(String arrStation) {
                this.arrStation = arrStation;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * btrip_title.
             */
            public Builder btripTitle(String btripTitle) {
                this.btripTitle = btripTitle;
                return this;
            }

            /**
             * contact_name.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * corp_name.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * cost_center.
             */
            public Builder costCenter(CostCenter costCenter) {
                this.costCenter = costCenter;
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
             * dep_city_ad_code.
             */
            public Builder depCityAdCode(String depCityAdCode) {
                this.depCityAdCode = depCityAdCode;
                return this;
            }

            /**
             * dep_station.
             */
            public Builder depStation(String depStation) {
                this.depStation = depStation;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * depart_id.
             */
            public Builder departId(String departId) {
                this.departId = departId;
                return this;
            }

            /**
             * depart_name.
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * invoice.
             */
            public Builder invoice(Invoice invoice) {
                this.invoice = invoice;
                return this;
            }

            /**
             * price_info_list.
             */
            public Builder priceInfoList(java.util.List < PriceInfoList> priceInfoList) {
                this.priceInfoList = priceInfoList;
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
             * project_id.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
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
             * rider_name.
             */
            public Builder riderName(String riderName) {
                this.riderName = riderName;
                return this;
            }

            /**
             * run_time.
             */
            public Builder runTime(String runTime) {
                this.runTime = runTime;
                return this;
            }

            /**
             * seat_type.
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * third_part_project_id.
             */
            public Builder thirdPartProjectId(String thirdPartProjectId) {
                this.thirdPartProjectId = thirdPartProjectId;
                return this;
            }

            /**
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * ticket_count.
             */
            public Builder ticketCount(Integer ticketCount) {
                this.ticketCount = ticketCount;
                return this;
            }

            /**
             * ticket_no12306.
             */
            public Builder ticketNo12306(String ticketNo12306) {
                this.ticketNo12306 = ticketNo12306;
                return this;
            }

            /**
             * train_number.
             */
            public Builder trainNumber(String trainNumber) {
                this.trainNumber = trainNumber;
                return this;
            }

            /**
             * train_type.
             */
            public Builder trainType(String trainType) {
                this.trainType = trainType;
                return this;
            }

            /**
             * user_affiliate_list.
             */
            public Builder userAffiliateList(java.util.List < UserAffiliateList> userAffiliateList) {
                this.userAffiliateList = userAffiliateList;
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

            public Module build() {
                return new Module(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_number")
        private Integer totalNumber;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer totalNumber; 

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_number.
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
