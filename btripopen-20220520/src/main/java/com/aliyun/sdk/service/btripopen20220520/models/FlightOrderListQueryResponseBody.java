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
 * {@link FlightOrderListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FlightOrderListQueryResponseBody</p>
 */
public class FlightOrderListQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("page_info")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private FlightOrderListQueryResponseBody(Builder builder) {
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

    public static FlightOrderListQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Module> getModule() {
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
        private java.util.List<Module> module; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(FlightOrderListQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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
        public Builder module(java.util.List<Module> module) {
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

        public FlightOrderListQueryResponseBody build() {
            return new FlightOrderListQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CostCenter model) {
                this.corpId = model.corpId;
                this.id = model.id;
                this.name = model.name;
                this.number = model.number;
            } 

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
    /**
     * 
     * {@link FlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryResponseBody</p>
     */
    public static class InsureInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("insure_no")
        private String insureNo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private InsureInfoList(Builder builder) {
            this.insureNo = builder.insureNo;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsureInfoList create() {
            return builder().build();
        }

        /**
         * @return insureNo
         */
        public String getInsureNo() {
            return this.insureNo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String insureNo; 
            private String name; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(InsureInfoList model) {
                this.insureNo = model.insureNo;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * insure_no.
             */
            public Builder insureNo(String insureNo) {
                this.insureNo = insureNo;
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
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public InsureInfoList build() {
                return new InsureInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Invoice model) {
                this.id = model.id;
                this.title = model.title;
            } 

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
    /**
     * 
     * {@link FlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryResponseBody</p>
     */
    public static class PriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category_code")
        private Integer categoryCode;

        @com.aliyun.core.annotation.NameInMap("category_type")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("change_flight_no")
        private String changeFlightNo;

        @com.aliyun.core.annotation.NameInMap("discount")
        private String discount;

        @com.aliyun.core.annotation.NameInMap("end_time")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("original_ticket_no")
        private String originalTicketNo;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("trade_id")
        private String tradeId;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.categoryType = builder.categoryType;
            this.changeFlightNo = builder.changeFlightNo;
            this.discount = builder.discount;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.originalTicketNo = builder.originalTicketNo;
            this.passengerName = builder.passengerName;
            this.payType = builder.payType;
            this.price = builder.price;
            this.startTime = builder.startTime;
            this.ticketNo = builder.ticketNo;
            this.tradeId = builder.tradeId;
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
         * @return changeFlightNo
         */
        public String getChangeFlightNo() {
            return this.changeFlightNo;
        }

        /**
         * @return discount
         */
        public String getDiscount() {
            return this.discount;
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
         * @return originalTicketNo
         */
        public String getOriginalTicketNo() {
            return this.originalTicketNo;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return tradeId
         */
        public String getTradeId() {
            return this.tradeId;
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
            private String changeFlightNo; 
            private String discount; 
            private String endTime; 
            private String gmtCreate; 
            private String originalTicketNo; 
            private String passengerName; 
            private Integer payType; 
            private Double price; 
            private String startTime; 
            private String ticketNo; 
            private String tradeId; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(PriceInfoList model) {
                this.categoryCode = model.categoryCode;
                this.categoryType = model.categoryType;
                this.changeFlightNo = model.changeFlightNo;
                this.discount = model.discount;
                this.endTime = model.endTime;
                this.gmtCreate = model.gmtCreate;
                this.originalTicketNo = model.originalTicketNo;
                this.passengerName = model.passengerName;
                this.payType = model.payType;
                this.price = model.price;
                this.startTime = model.startTime;
                this.ticketNo = model.ticketNo;
                this.tradeId = model.tradeId;
                this.type = model.type;
            } 

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
             * change_flight_no.
             */
            public Builder changeFlightNo(String changeFlightNo) {
                this.changeFlightNo = changeFlightNo;
                return this;
            }

            /**
             * discount.
             */
            public Builder discount(String discount) {
                this.discount = discount;
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
             * original_ticket_no.
             */
            public Builder originalTicketNo(String originalTicketNo) {
                this.originalTicketNo = originalTicketNo;
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
             * start_time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
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
    /**
     * 
     * {@link FlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(UserAffiliateList model) {
                this.userId = model.userId;
                this.userName = model.userName;
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

            public UserAffiliateList build() {
                return new UserAffiliateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("arr_airport")
        private String arrAirport;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_ad_code")
        private String arrCityAdCode;

        @com.aliyun.core.annotation.NameInMap("btrip_title")
        private String btripTitle;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("contact_name")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private CostCenter costCenter;

        @com.aliyun.core.annotation.NameInMap("dep_airport")
        private String depAirport;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_ad_code")
        private String depCityAdCode;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("discount")
        private String discount;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("insure_info_list")
        private java.util.List<InsureInfoList> insureInfoList;

        @com.aliyun.core.annotation.NameInMap("invoice")
        private Invoice invoice;

        @com.aliyun.core.annotation.NameInMap("passenger_count")
        private Integer passengerCount;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("price_info_list")
        private java.util.List<PriceInfoList> priceInfoList;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_id")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("ret_date")
        private String retDate;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("third_part_project_id")
        private String thirdPartProjectId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_business_id")
        private String thirdpartBusinessId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        @com.aliyun.core.annotation.NameInMap("user_affiliate_list")
        private java.util.List<UserAffiliateList> userAffiliateList;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.arrAirport = builder.arrAirport;
            this.arrCity = builder.arrCity;
            this.arrCityAdCode = builder.arrCityAdCode;
            this.btripTitle = builder.btripTitle;
            this.cabinClass = builder.cabinClass;
            this.contactName = builder.contactName;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.costCenter = builder.costCenter;
            this.depAirport = builder.depAirport;
            this.depCity = builder.depCity;
            this.depCityAdCode = builder.depCityAdCode;
            this.depDate = builder.depDate;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.discount = builder.discount;
            this.flightNo = builder.flightNo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.insureInfoList = builder.insureInfoList;
            this.invoice = builder.invoice;
            this.passengerCount = builder.passengerCount;
            this.passengerName = builder.passengerName;
            this.priceInfoList = builder.priceInfoList;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.retDate = builder.retDate;
            this.status = builder.status;
            this.thirdPartProjectId = builder.thirdPartProjectId;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartBusinessId = builder.thirdpartBusinessId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.tripType = builder.tripType;
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
         * @return arrAirport
         */
        public String getArrAirport() {
            return this.arrAirport;
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
         * @return btripTitle
         */
        public String getBtripTitle() {
            return this.btripTitle;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
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
         * @return depAirport
         */
        public String getDepAirport() {
            return this.depAirport;
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
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
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
         * @return discount
         */
        public String getDiscount() {
            return this.discount;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
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
         * @return insureInfoList
         */
        public java.util.List<InsureInfoList> getInsureInfoList() {
            return this.insureInfoList;
        }

        /**
         * @return invoice
         */
        public Invoice getInvoice() {
            return this.invoice;
        }

        /**
         * @return passengerCount
         */
        public Integer getPassengerCount() {
            return this.passengerCount;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List<PriceInfoList> getPriceInfoList() {
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
         * @return retDate
         */
        public String getRetDate() {
            return this.retDate;
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
         * @return thirdpartBusinessId
         */
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

        /**
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        /**
         * @return userAffiliateList
         */
        public java.util.List<UserAffiliateList> getUserAffiliateList() {
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
            private String arrAirport; 
            private String arrCity; 
            private String arrCityAdCode; 
            private String btripTitle; 
            private String cabinClass; 
            private String contactName; 
            private String corpId; 
            private String corpName; 
            private CostCenter costCenter; 
            private String depAirport; 
            private String depCity; 
            private String depCityAdCode; 
            private String depDate; 
            private String departId; 
            private String departName; 
            private String discount; 
            private String flightNo; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private java.util.List<InsureInfoList> insureInfoList; 
            private Invoice invoice; 
            private Integer passengerCount; 
            private String passengerName; 
            private java.util.List<PriceInfoList> priceInfoList; 
            private String projectCode; 
            private Long projectId; 
            private String projectTitle; 
            private String retDate; 
            private Integer status; 
            private String thirdPartProjectId; 
            private String thirdpartApplyId; 
            private String thirdpartBusinessId; 
            private String thirdpartItineraryId; 
            private Integer tripType; 
            private java.util.List<UserAffiliateList> userAffiliateList; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.applyId = model.applyId;
                this.arrAirport = model.arrAirport;
                this.arrCity = model.arrCity;
                this.arrCityAdCode = model.arrCityAdCode;
                this.btripTitle = model.btripTitle;
                this.cabinClass = model.cabinClass;
                this.contactName = model.contactName;
                this.corpId = model.corpId;
                this.corpName = model.corpName;
                this.costCenter = model.costCenter;
                this.depAirport = model.depAirport;
                this.depCity = model.depCity;
                this.depCityAdCode = model.depCityAdCode;
                this.depDate = model.depDate;
                this.departId = model.departId;
                this.departName = model.departName;
                this.discount = model.discount;
                this.flightNo = model.flightNo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.insureInfoList = model.insureInfoList;
                this.invoice = model.invoice;
                this.passengerCount = model.passengerCount;
                this.passengerName = model.passengerName;
                this.priceInfoList = model.priceInfoList;
                this.projectCode = model.projectCode;
                this.projectId = model.projectId;
                this.projectTitle = model.projectTitle;
                this.retDate = model.retDate;
                this.status = model.status;
                this.thirdPartProjectId = model.thirdPartProjectId;
                this.thirdpartApplyId = model.thirdpartApplyId;
                this.thirdpartBusinessId = model.thirdpartBusinessId;
                this.thirdpartItineraryId = model.thirdpartItineraryId;
                this.tripType = model.tripType;
                this.userAffiliateList = model.userAffiliateList;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * arr_airport.
             */
            public Builder arrAirport(String arrAirport) {
                this.arrAirport = arrAirport;
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
             * btrip_title.
             */
            public Builder btripTitle(String btripTitle) {
                this.btripTitle = btripTitle;
                return this;
            }

            /**
             * cabin_class.
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
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
             * dep_airport.
             */
            public Builder depAirport(String depAirport) {
                this.depAirport = depAirport;
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
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
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
             * discount.
             */
            public Builder discount(String discount) {
                this.discount = discount;
                return this;
            }

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
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
             * insure_info_list.
             */
            public Builder insureInfoList(java.util.List<InsureInfoList> insureInfoList) {
                this.insureInfoList = insureInfoList;
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
             * passenger_count.
             */
            public Builder passengerCount(Integer passengerCount) {
                this.passengerCount = passengerCount;
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
             * price_info_list.
             */
            public Builder priceInfoList(java.util.List<PriceInfoList> priceInfoList) {
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
             * ret_date.
             */
            public Builder retDate(String retDate) {
                this.retDate = retDate;
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
             * thirdpart_business_id.
             */
            public Builder thirdpartBusinessId(String thirdpartBusinessId) {
                this.thirdpartBusinessId = thirdpartBusinessId;
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
             * trip_type.
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            /**
             * user_affiliate_list.
             */
            public Builder userAffiliateList(java.util.List<UserAffiliateList> userAffiliateList) {
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
    /**
     * 
     * {@link FlightOrderListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.totalNumber = model.totalNumber;
            } 

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
