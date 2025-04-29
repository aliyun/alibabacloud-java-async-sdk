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
 * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightOrderListQueryV2ResponseBody</p>
 */
public class FlightOrderListQueryV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("pageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private FlightOrderListQueryV2ResponseBody(Builder builder) {
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

    public static FlightOrderListQueryV2ResponseBody create() {
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

        private Builder(FlightOrderListQueryV2ResponseBody model) {
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
         * pageInfo.
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

        public FlightOrderListQueryV2ResponseBody build() {
            return new FlightOrderListQueryV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class Approve extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("approve_id")
        private Long approveId;

        @com.aliyun.core.annotation.NameInMap("btrip_title")
        private String btripTitle;

        @com.aliyun.core.annotation.NameInMap("exceed_approve_id")
        private String exceedApproveId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_approve_id")
        private String thirdpartApproveId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_exceed_approve_id")
        private String thirdpartExceedApproveId;

        private Approve(Builder builder) {
            this.approveId = builder.approveId;
            this.btripTitle = builder.btripTitle;
            this.exceedApproveId = builder.exceedApproveId;
            this.thirdpartApproveId = builder.thirdpartApproveId;
            this.thirdpartExceedApproveId = builder.thirdpartExceedApproveId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Approve create() {
            return builder().build();
        }

        /**
         * @return approveId
         */
        public Long getApproveId() {
            return this.approveId;
        }

        /**
         * @return btripTitle
         */
        public String getBtripTitle() {
            return this.btripTitle;
        }

        /**
         * @return exceedApproveId
         */
        public String getExceedApproveId() {
            return this.exceedApproveId;
        }

        /**
         * @return thirdpartApproveId
         */
        public String getThirdpartApproveId() {
            return this.thirdpartApproveId;
        }

        /**
         * @return thirdpartExceedApproveId
         */
        public String getThirdpartExceedApproveId() {
            return this.thirdpartExceedApproveId;
        }

        public static final class Builder {
            private Long approveId; 
            private String btripTitle; 
            private String exceedApproveId; 
            private String thirdpartApproveId; 
            private String thirdpartExceedApproveId; 

            private Builder() {
            } 

            private Builder(Approve model) {
                this.approveId = model.approveId;
                this.btripTitle = model.btripTitle;
                this.exceedApproveId = model.exceedApproveId;
                this.thirdpartApproveId = model.thirdpartApproveId;
                this.thirdpartExceedApproveId = model.thirdpartExceedApproveId;
            } 

            /**
             * approve_id.
             */
            public Builder approveId(Long approveId) {
                this.approveId = approveId;
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
             * exceed_approve_id.
             */
            public Builder exceedApproveId(String exceedApproveId) {
                this.exceedApproveId = exceedApproveId;
                return this;
            }

            /**
             * thirdpart_approve_id.
             */
            public Builder thirdpartApproveId(String thirdpartApproveId) {
                this.thirdpartApproveId = thirdpartApproveId;
                return this;
            }

            /**
             * thirdpart_exceed_approve_id.
             */
            public Builder thirdpartExceedApproveId(String thirdpartExceedApproveId) {
                this.thirdpartExceedApproveId = thirdpartExceedApproveId;
                return this;
            }

            public Approve build() {
                return new Approve(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_class_name")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        private FlightList(Builder builder) {
            this.arrTime = builder.arrTime;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightList create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        public static final class Builder {
            private String arrTime; 
            private String cabin; 
            private String cabinClass; 
            private String cabinClassName; 
            private String depTime; 
            private String flightNo; 

            private Builder() {
            } 

            private Builder(FlightList model) {
                this.arrTime = model.arrTime;
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.cabinClassName = model.cabinClassName;
                this.depTime = model.depTime;
                this.flightNo = model.flightNo;
            } 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * cabin.
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
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
             * cabin_class_name.
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            public FlightList build() {
                return new FlightList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightOrderTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_list")
        private java.util.List<FlightList> flightList;

        @com.aliyun.core.annotation.NameInMap("ticket_no_list")
        private java.util.List<String> ticketNoList;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightOrderTicketList(Builder builder) {
            this.flightList = builder.flightList;
            this.ticketNoList = builder.ticketNoList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOrderTicketList create() {
            return builder().build();
        }

        /**
         * @return flightList
         */
        public java.util.List<FlightList> getFlightList() {
            return this.flightList;
        }

        /**
         * @return ticketNoList
         */
        public java.util.List<String> getTicketNoList() {
            return this.ticketNoList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<FlightList> flightList; 
            private java.util.List<String> ticketNoList; 
            private String userId; 

            private Builder() {
            } 

            private Builder(FlightOrderTicketList model) {
                this.flightList = model.flightList;
                this.ticketNoList = model.ticketNoList;
                this.userId = model.userId;
            } 

            /**
             * flight_list.
             */
            public Builder flightList(java.util.List<FlightList> flightList) {
                this.flightList = flightList;
                return this;
            }

            /**
             * ticket_no_list.
             */
            public Builder ticketNoList(java.util.List<String> ticketNoList) {
                this.ticketNoList = ticketNoList;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightOrderTicketList build() {
                return new FlightOrderTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightOrderUserFeeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("build_fee")
        private Double buildFee;

        @com.aliyun.core.annotation.NameInMap("corp_pay_amount")
        private Double corpPayAmount;

        @com.aliyun.core.annotation.NameInMap("oil_fee")
        private Double oilFee;

        @com.aliyun.core.annotation.NameInMap("person_pay_amount")
        private Double personPayAmount;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Double ticketPrice;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightOrderUserFeeList(Builder builder) {
            this.buildFee = builder.buildFee;
            this.corpPayAmount = builder.corpPayAmount;
            this.oilFee = builder.oilFee;
            this.personPayAmount = builder.personPayAmount;
            this.ticketPrice = builder.ticketPrice;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOrderUserFeeList create() {
            return builder().build();
        }

        /**
         * @return buildFee
         */
        public Double getBuildFee() {
            return this.buildFee;
        }

        /**
         * @return corpPayAmount
         */
        public Double getCorpPayAmount() {
            return this.corpPayAmount;
        }

        /**
         * @return oilFee
         */
        public Double getOilFee() {
            return this.oilFee;
        }

        /**
         * @return personPayAmount
         */
        public Double getPersonPayAmount() {
            return this.personPayAmount;
        }

        /**
         * @return ticketPrice
         */
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Double buildFee; 
            private Double corpPayAmount; 
            private Double oilFee; 
            private Double personPayAmount; 
            private Double ticketPrice; 
            private String userId; 

            private Builder() {
            } 

            private Builder(FlightOrderUserFeeList model) {
                this.buildFee = model.buildFee;
                this.corpPayAmount = model.corpPayAmount;
                this.oilFee = model.oilFee;
                this.personPayAmount = model.personPayAmount;
                this.ticketPrice = model.ticketPrice;
                this.userId = model.userId;
            } 

            /**
             * build_fee.
             */
            public Builder buildFee(Double buildFee) {
                this.buildFee = buildFee;
                return this;
            }

            /**
             * corp_pay_amount.
             */
            public Builder corpPayAmount(Double corpPayAmount) {
                this.corpPayAmount = corpPayAmount;
                return this;
            }

            /**
             * oil_fee.
             */
            public Builder oilFee(Double oilFee) {
                this.oilFee = oilFee;
                return this;
            }

            /**
             * person_pay_amount.
             */
            public Builder personPayAmount(Double personPayAmount) {
                this.personPayAmount = personPayAmount;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Double ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightOrderUserFeeList build() {
                return new FlightOrderUserFeeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightRefundApplyTicketListFlightList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_class_name")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        private FlightRefundApplyTicketListFlightList(Builder builder) {
            this.arrTime = builder.arrTime;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundApplyTicketListFlightList create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        public static final class Builder {
            private String arrTime; 
            private String cabin; 
            private String cabinClass; 
            private String cabinClassName; 
            private String depTime; 
            private String flightNo; 

            private Builder() {
            } 

            private Builder(FlightRefundApplyTicketListFlightList model) {
                this.arrTime = model.arrTime;
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.cabinClassName = model.cabinClassName;
                this.depTime = model.depTime;
                this.flightNo = model.flightNo;
            } 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * cabin.
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
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
             * cabin_class_name.
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            public FlightRefundApplyTicketListFlightList build() {
                return new FlightRefundApplyTicketListFlightList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightRefundApplyTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_list")
        private java.util.List<FlightRefundApplyTicketListFlightList> flightList;

        @com.aliyun.core.annotation.NameInMap("ticket_no_list")
        private java.util.List<String> ticketNoList;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightRefundApplyTicketList(Builder builder) {
            this.flightList = builder.flightList;
            this.ticketNoList = builder.ticketNoList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundApplyTicketList create() {
            return builder().build();
        }

        /**
         * @return flightList
         */
        public java.util.List<FlightRefundApplyTicketListFlightList> getFlightList() {
            return this.flightList;
        }

        /**
         * @return ticketNoList
         */
        public java.util.List<String> getTicketNoList() {
            return this.ticketNoList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<FlightRefundApplyTicketListFlightList> flightList; 
            private java.util.List<String> ticketNoList; 
            private String userId; 

            private Builder() {
            } 

            private Builder(FlightRefundApplyTicketList model) {
                this.flightList = model.flightList;
                this.ticketNoList = model.ticketNoList;
                this.userId = model.userId;
            } 

            /**
             * flight_list.
             */
            public Builder flightList(java.util.List<FlightRefundApplyTicketListFlightList> flightList) {
                this.flightList = flightList;
                return this;
            }

            /**
             * ticket_no_list.
             */
            public Builder ticketNoList(java.util.List<String> ticketNoList) {
                this.ticketNoList = ticketNoList;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightRefundApplyTicketList build() {
                return new FlightRefundApplyTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightRefundSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("arr_apt")
        private String arrApt;

        @com.aliyun.core.annotation.NameInMap("arr_apt_code")
        private String arrAptCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_apt")
        private String depApt;

        @com.aliyun.core.annotation.NameInMap("dep_apt_code")
        private String depAptCode;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_terminal")
        private String depTerminal;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_mile")
        private Integer flightMile;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private java.util.List<String> stopCity;

        private FlightRefundSegmentList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.arrApt = builder.arrApt;
            this.arrAptCode = builder.arrAptCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.depApt = builder.depApt;
            this.depAptCode = builder.depAptCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightMile = builder.flightMile;
            this.flightNo = builder.flightNo;
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
            this.stopCity = builder.stopCity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundSegmentList create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return arrApt
         */
        public String getArrApt() {
            return this.arrApt;
        }

        /**
         * @return arrAptCode
         */
        public String getArrAptCode() {
            return this.arrAptCode;
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
         * @return arrTerminal
         */
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depApt
         */
        public String getDepApt() {
            return this.depApt;
        }

        /**
         * @return depAptCode
         */
        public String getDepAptCode() {
            return this.depAptCode;
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
         * @return depTerminal
         */
        public String getDepTerminal() {
            return this.depTerminal;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightMile
         */
        public Integer getFlightMile() {
            return this.flightMile;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return stopCity
         */
        public java.util.List<String> getStopCity() {
            return this.stopCity;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String arrApt; 
            private String arrAptCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTerminal; 
            private String arrTime; 
            private String depApt; 
            private String depAptCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTerminal; 
            private String depTime; 
            private Integer flightMile; 
            private String flightNo; 
            private Integer journeyIndex; 
            private Integer segmentIndex; 
            private java.util.List<String> stopCity; 

            private Builder() {
            } 

            private Builder(FlightRefundSegmentList model) {
                this.airlineCode = model.airlineCode;
                this.airlineName = model.airlineName;
                this.arrApt = model.arrApt;
                this.arrAptCode = model.arrAptCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrTerminal = model.arrTerminal;
                this.arrTime = model.arrTime;
                this.depApt = model.depApt;
                this.depAptCode = model.depAptCode;
                this.depCity = model.depCity;
                this.depCityCode = model.depCityCode;
                this.depTerminal = model.depTerminal;
                this.depTime = model.depTime;
                this.flightMile = model.flightMile;
                this.flightNo = model.flightNo;
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
                this.stopCity = model.stopCity;
            } 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_name.
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * arr_apt.
             */
            public Builder arrApt(String arrApt) {
                this.arrApt = arrApt;
                return this;
            }

            /**
             * arr_apt_code.
             */
            public Builder arrAptCode(String arrAptCode) {
                this.arrAptCode = arrAptCode;
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
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_terminal.
             */
            public Builder arrTerminal(String arrTerminal) {
                this.arrTerminal = arrTerminal;
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
             * dep_apt.
             */
            public Builder depApt(String depApt) {
                this.depApt = depApt;
                return this;
            }

            /**
             * dep_apt_code.
             */
            public Builder depAptCode(String depAptCode) {
                this.depAptCode = depAptCode;
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
             * dep_terminal.
             */
            public Builder depTerminal(String depTerminal) {
                this.depTerminal = depTerminal;
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
             * flight_mile.
             */
            public Builder flightMile(Integer flightMile) {
                this.flightMile = flightMile;
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
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * stop_city.
             */
            public Builder stopCity(java.util.List<String> stopCity) {
                this.stopCity = stopCity;
                return this;
            }

            public FlightRefundSegmentList build() {
                return new FlightRefundSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightRefundUserFeeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("already_use_amount")
        private Double alreadyUseAmount;

        @com.aliyun.core.annotation.NameInMap("non_refundable_reshop_change_amount")
        private Double nonRefundableReshopChangeAmount;

        @com.aliyun.core.annotation.NameInMap("non_refundable_reshop_upgrade_amount")
        private Double nonRefundableReshopUpgradeAmount;

        @com.aliyun.core.annotation.NameInMap("refund_amount")
        private Double refundAmount;

        @com.aliyun.core.annotation.NameInMap("refund_corp_amount")
        private Double refundCorpAmount;

        @com.aliyun.core.annotation.NameInMap("refund_hand_fee")
        private Double refundHandFee;

        @com.aliyun.core.annotation.NameInMap("refund_person_amount")
        private Double refundPersonAmount;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightRefundUserFeeList(Builder builder) {
            this.alreadyUseAmount = builder.alreadyUseAmount;
            this.nonRefundableReshopChangeAmount = builder.nonRefundableReshopChangeAmount;
            this.nonRefundableReshopUpgradeAmount = builder.nonRefundableReshopUpgradeAmount;
            this.refundAmount = builder.refundAmount;
            this.refundCorpAmount = builder.refundCorpAmount;
            this.refundHandFee = builder.refundHandFee;
            this.refundPersonAmount = builder.refundPersonAmount;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundUserFeeList create() {
            return builder().build();
        }

        /**
         * @return alreadyUseAmount
         */
        public Double getAlreadyUseAmount() {
            return this.alreadyUseAmount;
        }

        /**
         * @return nonRefundableReshopChangeAmount
         */
        public Double getNonRefundableReshopChangeAmount() {
            return this.nonRefundableReshopChangeAmount;
        }

        /**
         * @return nonRefundableReshopUpgradeAmount
         */
        public Double getNonRefundableReshopUpgradeAmount() {
            return this.nonRefundableReshopUpgradeAmount;
        }

        /**
         * @return refundAmount
         */
        public Double getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return refundCorpAmount
         */
        public Double getRefundCorpAmount() {
            return this.refundCorpAmount;
        }

        /**
         * @return refundHandFee
         */
        public Double getRefundHandFee() {
            return this.refundHandFee;
        }

        /**
         * @return refundPersonAmount
         */
        public Double getRefundPersonAmount() {
            return this.refundPersonAmount;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Double alreadyUseAmount; 
            private Double nonRefundableReshopChangeAmount; 
            private Double nonRefundableReshopUpgradeAmount; 
            private Double refundAmount; 
            private Double refundCorpAmount; 
            private Double refundHandFee; 
            private Double refundPersonAmount; 
            private String userId; 

            private Builder() {
            } 

            private Builder(FlightRefundUserFeeList model) {
                this.alreadyUseAmount = model.alreadyUseAmount;
                this.nonRefundableReshopChangeAmount = model.nonRefundableReshopChangeAmount;
                this.nonRefundableReshopUpgradeAmount = model.nonRefundableReshopUpgradeAmount;
                this.refundAmount = model.refundAmount;
                this.refundCorpAmount = model.refundCorpAmount;
                this.refundHandFee = model.refundHandFee;
                this.refundPersonAmount = model.refundPersonAmount;
                this.userId = model.userId;
            } 

            /**
             * already_use_amount.
             */
            public Builder alreadyUseAmount(Double alreadyUseAmount) {
                this.alreadyUseAmount = alreadyUseAmount;
                return this;
            }

            /**
             * non_refundable_reshop_change_amount.
             */
            public Builder nonRefundableReshopChangeAmount(Double nonRefundableReshopChangeAmount) {
                this.nonRefundableReshopChangeAmount = nonRefundableReshopChangeAmount;
                return this;
            }

            /**
             * non_refundable_reshop_upgrade_amount.
             */
            public Builder nonRefundableReshopUpgradeAmount(Double nonRefundableReshopUpgradeAmount) {
                this.nonRefundableReshopUpgradeAmount = nonRefundableReshopUpgradeAmount;
                return this;
            }

            /**
             * refund_amount.
             */
            public Builder refundAmount(Double refundAmount) {
                this.refundAmount = refundAmount;
                return this;
            }

            /**
             * refund_corp_amount.
             */
            public Builder refundCorpAmount(Double refundCorpAmount) {
                this.refundCorpAmount = refundCorpAmount;
                return this;
            }

            /**
             * refund_hand_fee.
             */
            public Builder refundHandFee(Double refundHandFee) {
                this.refundHandFee = refundHandFee;
                return this;
            }

            /**
             * refund_person_amount.
             */
            public Builder refundPersonAmount(Double refundPersonAmount) {
                this.refundPersonAmount = refundPersonAmount;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightRefundUserFeeList build() {
                return new FlightRefundUserFeeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightRefundApplyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_refund_apply_ticket_list")
        private java.util.List<FlightRefundApplyTicketList> flightRefundApplyTicketList;

        @com.aliyun.core.annotation.NameInMap("flight_refund_segment_list")
        private java.util.List<FlightRefundSegmentList> flightRefundSegmentList;

        @com.aliyun.core.annotation.NameInMap("flight_refund_user_fee_list")
        private java.util.List<FlightRefundUserFeeList> flightRefundUserFeeList;

        @com.aliyun.core.annotation.NameInMap("refund_apply_id")
        private String refundApplyId;

        @com.aliyun.core.annotation.NameInMap("refund_approve_id")
        private String refundApproveId;

        @com.aliyun.core.annotation.NameInMap("refund_corp_total_amount")
        private Double refundCorpTotalAmount;

        @com.aliyun.core.annotation.NameInMap("refund_hand_fee")
        private Double refundHandFee;

        @com.aliyun.core.annotation.NameInMap("refund_person_total_amount")
        private Double refundPersonTotalAmount;

        @com.aliyun.core.annotation.NameInMap("refund_reason")
        private String refundReason;

        @com.aliyun.core.annotation.NameInMap("refund_reason_code")
        private String refundReasonCode;

        @com.aliyun.core.annotation.NameInMap("refund_total_amount")
        private Double refundTotalAmount;

        @com.aliyun.core.annotation.NameInMap("relate_refund_apply_id")
        private String relateRefundApplyId;

        @com.aliyun.core.annotation.NameInMap("user_id_list")
        private java.util.List<String> userIdList;

        private FlightRefundApplyList(Builder builder) {
            this.flightRefundApplyTicketList = builder.flightRefundApplyTicketList;
            this.flightRefundSegmentList = builder.flightRefundSegmentList;
            this.flightRefundUserFeeList = builder.flightRefundUserFeeList;
            this.refundApplyId = builder.refundApplyId;
            this.refundApproveId = builder.refundApproveId;
            this.refundCorpTotalAmount = builder.refundCorpTotalAmount;
            this.refundHandFee = builder.refundHandFee;
            this.refundPersonTotalAmount = builder.refundPersonTotalAmount;
            this.refundReason = builder.refundReason;
            this.refundReasonCode = builder.refundReasonCode;
            this.refundTotalAmount = builder.refundTotalAmount;
            this.relateRefundApplyId = builder.relateRefundApplyId;
            this.userIdList = builder.userIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundApplyList create() {
            return builder().build();
        }

        /**
         * @return flightRefundApplyTicketList
         */
        public java.util.List<FlightRefundApplyTicketList> getFlightRefundApplyTicketList() {
            return this.flightRefundApplyTicketList;
        }

        /**
         * @return flightRefundSegmentList
         */
        public java.util.List<FlightRefundSegmentList> getFlightRefundSegmentList() {
            return this.flightRefundSegmentList;
        }

        /**
         * @return flightRefundUserFeeList
         */
        public java.util.List<FlightRefundUserFeeList> getFlightRefundUserFeeList() {
            return this.flightRefundUserFeeList;
        }

        /**
         * @return refundApplyId
         */
        public String getRefundApplyId() {
            return this.refundApplyId;
        }

        /**
         * @return refundApproveId
         */
        public String getRefundApproveId() {
            return this.refundApproveId;
        }

        /**
         * @return refundCorpTotalAmount
         */
        public Double getRefundCorpTotalAmount() {
            return this.refundCorpTotalAmount;
        }

        /**
         * @return refundHandFee
         */
        public Double getRefundHandFee() {
            return this.refundHandFee;
        }

        /**
         * @return refundPersonTotalAmount
         */
        public Double getRefundPersonTotalAmount() {
            return this.refundPersonTotalAmount;
        }

        /**
         * @return refundReason
         */
        public String getRefundReason() {
            return this.refundReason;
        }

        /**
         * @return refundReasonCode
         */
        public String getRefundReasonCode() {
            return this.refundReasonCode;
        }

        /**
         * @return refundTotalAmount
         */
        public Double getRefundTotalAmount() {
            return this.refundTotalAmount;
        }

        /**
         * @return relateRefundApplyId
         */
        public String getRelateRefundApplyId() {
            return this.relateRefundApplyId;
        }

        /**
         * @return userIdList
         */
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

        public static final class Builder {
            private java.util.List<FlightRefundApplyTicketList> flightRefundApplyTicketList; 
            private java.util.List<FlightRefundSegmentList> flightRefundSegmentList; 
            private java.util.List<FlightRefundUserFeeList> flightRefundUserFeeList; 
            private String refundApplyId; 
            private String refundApproveId; 
            private Double refundCorpTotalAmount; 
            private Double refundHandFee; 
            private Double refundPersonTotalAmount; 
            private String refundReason; 
            private String refundReasonCode; 
            private Double refundTotalAmount; 
            private String relateRefundApplyId; 
            private java.util.List<String> userIdList; 

            private Builder() {
            } 

            private Builder(FlightRefundApplyList model) {
                this.flightRefundApplyTicketList = model.flightRefundApplyTicketList;
                this.flightRefundSegmentList = model.flightRefundSegmentList;
                this.flightRefundUserFeeList = model.flightRefundUserFeeList;
                this.refundApplyId = model.refundApplyId;
                this.refundApproveId = model.refundApproveId;
                this.refundCorpTotalAmount = model.refundCorpTotalAmount;
                this.refundHandFee = model.refundHandFee;
                this.refundPersonTotalAmount = model.refundPersonTotalAmount;
                this.refundReason = model.refundReason;
                this.refundReasonCode = model.refundReasonCode;
                this.refundTotalAmount = model.refundTotalAmount;
                this.relateRefundApplyId = model.relateRefundApplyId;
                this.userIdList = model.userIdList;
            } 

            /**
             * flight_refund_apply_ticket_list.
             */
            public Builder flightRefundApplyTicketList(java.util.List<FlightRefundApplyTicketList> flightRefundApplyTicketList) {
                this.flightRefundApplyTicketList = flightRefundApplyTicketList;
                return this;
            }

            /**
             * flight_refund_segment_list.
             */
            public Builder flightRefundSegmentList(java.util.List<FlightRefundSegmentList> flightRefundSegmentList) {
                this.flightRefundSegmentList = flightRefundSegmentList;
                return this;
            }

            /**
             * flight_refund_user_fee_list.
             */
            public Builder flightRefundUserFeeList(java.util.List<FlightRefundUserFeeList> flightRefundUserFeeList) {
                this.flightRefundUserFeeList = flightRefundUserFeeList;
                return this;
            }

            /**
             * refund_apply_id.
             */
            public Builder refundApplyId(String refundApplyId) {
                this.refundApplyId = refundApplyId;
                return this;
            }

            /**
             * refund_approve_id.
             */
            public Builder refundApproveId(String refundApproveId) {
                this.refundApproveId = refundApproveId;
                return this;
            }

            /**
             * refund_corp_total_amount.
             */
            public Builder refundCorpTotalAmount(Double refundCorpTotalAmount) {
                this.refundCorpTotalAmount = refundCorpTotalAmount;
                return this;
            }

            /**
             * refund_hand_fee.
             */
            public Builder refundHandFee(Double refundHandFee) {
                this.refundHandFee = refundHandFee;
                return this;
            }

            /**
             * refund_person_total_amount.
             */
            public Builder refundPersonTotalAmount(Double refundPersonTotalAmount) {
                this.refundPersonTotalAmount = refundPersonTotalAmount;
                return this;
            }

            /**
             * refund_reason.
             */
            public Builder refundReason(String refundReason) {
                this.refundReason = refundReason;
                return this;
            }

            /**
             * refund_reason_code.
             */
            public Builder refundReasonCode(String refundReasonCode) {
                this.refundReasonCode = refundReasonCode;
                return this;
            }

            /**
             * refund_total_amount.
             */
            public Builder refundTotalAmount(Double refundTotalAmount) {
                this.refundTotalAmount = refundTotalAmount;
                return this;
            }

            /**
             * relate_refund_apply_id.
             */
            public Builder relateRefundApplyId(String relateRefundApplyId) {
                this.relateRefundApplyId = relateRefundApplyId;
                return this;
            }

            /**
             * user_id_list.
             */
            public Builder userIdList(java.util.List<String> userIdList) {
                this.userIdList = userIdList;
                return this;
            }

            public FlightRefundApplyList build() {
                return new FlightRefundApplyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightReshopApplyTicketListFlightList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("cabin_class_name")
        private String cabinClassName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        private FlightReshopApplyTicketListFlightList(Builder builder) {
            this.arrTime = builder.arrTime;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassName = builder.cabinClassName;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightReshopApplyTicketListFlightList create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassName
         */
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        public static final class Builder {
            private String arrTime; 
            private String cabin; 
            private String cabinClass; 
            private String cabinClassName; 
            private String depTime; 
            private String flightNo; 

            private Builder() {
            } 

            private Builder(FlightReshopApplyTicketListFlightList model) {
                this.arrTime = model.arrTime;
                this.cabin = model.cabin;
                this.cabinClass = model.cabinClass;
                this.cabinClassName = model.cabinClassName;
                this.depTime = model.depTime;
                this.flightNo = model.flightNo;
            } 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * cabin.
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
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
             * cabin_class_name.
             */
            public Builder cabinClassName(String cabinClassName) {
                this.cabinClassName = cabinClassName;
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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            public FlightReshopApplyTicketListFlightList build() {
                return new FlightReshopApplyTicketListFlightList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightReshopApplyTicketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_list")
        private java.util.List<FlightReshopApplyTicketListFlightList> flightList;

        @com.aliyun.core.annotation.NameInMap("relate_ticket_no_list")
        private java.util.List<String> relateTicketNoList;

        @com.aliyun.core.annotation.NameInMap("ticket_no_list")
        private java.util.List<String> ticketNoList;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightReshopApplyTicketList(Builder builder) {
            this.flightList = builder.flightList;
            this.relateTicketNoList = builder.relateTicketNoList;
            this.ticketNoList = builder.ticketNoList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightReshopApplyTicketList create() {
            return builder().build();
        }

        /**
         * @return flightList
         */
        public java.util.List<FlightReshopApplyTicketListFlightList> getFlightList() {
            return this.flightList;
        }

        /**
         * @return relateTicketNoList
         */
        public java.util.List<String> getRelateTicketNoList() {
            return this.relateTicketNoList;
        }

        /**
         * @return ticketNoList
         */
        public java.util.List<String> getTicketNoList() {
            return this.ticketNoList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<FlightReshopApplyTicketListFlightList> flightList; 
            private java.util.List<String> relateTicketNoList; 
            private java.util.List<String> ticketNoList; 
            private String userId; 

            private Builder() {
            } 

            private Builder(FlightReshopApplyTicketList model) {
                this.flightList = model.flightList;
                this.relateTicketNoList = model.relateTicketNoList;
                this.ticketNoList = model.ticketNoList;
                this.userId = model.userId;
            } 

            /**
             * flight_list.
             */
            public Builder flightList(java.util.List<FlightReshopApplyTicketListFlightList> flightList) {
                this.flightList = flightList;
                return this;
            }

            /**
             * relate_ticket_no_list.
             */
            public Builder relateTicketNoList(java.util.List<String> relateTicketNoList) {
                this.relateTicketNoList = relateTicketNoList;
                return this;
            }

            /**
             * ticket_no_list.
             */
            public Builder ticketNoList(java.util.List<String> ticketNoList) {
                this.ticketNoList = ticketNoList;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightReshopApplyTicketList build() {
                return new FlightReshopApplyTicketList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightReshopSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("arr_apt")
        private String arrApt;

        @com.aliyun.core.annotation.NameInMap("arr_apt_code")
        private String arrAptCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_apt")
        private String depApt;

        @com.aliyun.core.annotation.NameInMap("dep_apt_code")
        private String depAptCode;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_terminal")
        private String depTerminal;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_mile")
        private Integer flightMile;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private java.util.List<String> stopCity;

        private FlightReshopSegmentList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.arrApt = builder.arrApt;
            this.arrAptCode = builder.arrAptCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.depApt = builder.depApt;
            this.depAptCode = builder.depAptCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightMile = builder.flightMile;
            this.flightNo = builder.flightNo;
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
            this.stopCity = builder.stopCity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightReshopSegmentList create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return arrApt
         */
        public String getArrApt() {
            return this.arrApt;
        }

        /**
         * @return arrAptCode
         */
        public String getArrAptCode() {
            return this.arrAptCode;
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
         * @return arrTerminal
         */
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depApt
         */
        public String getDepApt() {
            return this.depApt;
        }

        /**
         * @return depAptCode
         */
        public String getDepAptCode() {
            return this.depAptCode;
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
         * @return depTerminal
         */
        public String getDepTerminal() {
            return this.depTerminal;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightMile
         */
        public Integer getFlightMile() {
            return this.flightMile;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return stopCity
         */
        public java.util.List<String> getStopCity() {
            return this.stopCity;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String arrApt; 
            private String arrAptCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTerminal; 
            private String arrTime; 
            private String depApt; 
            private String depAptCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTerminal; 
            private String depTime; 
            private Integer flightMile; 
            private String flightNo; 
            private Integer journeyIndex; 
            private Integer segmentIndex; 
            private java.util.List<String> stopCity; 

            private Builder() {
            } 

            private Builder(FlightReshopSegmentList model) {
                this.airlineCode = model.airlineCode;
                this.airlineName = model.airlineName;
                this.arrApt = model.arrApt;
                this.arrAptCode = model.arrAptCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrTerminal = model.arrTerminal;
                this.arrTime = model.arrTime;
                this.depApt = model.depApt;
                this.depAptCode = model.depAptCode;
                this.depCity = model.depCity;
                this.depCityCode = model.depCityCode;
                this.depTerminal = model.depTerminal;
                this.depTime = model.depTime;
                this.flightMile = model.flightMile;
                this.flightNo = model.flightNo;
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
                this.stopCity = model.stopCity;
            } 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_name.
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * arr_apt.
             */
            public Builder arrApt(String arrApt) {
                this.arrApt = arrApt;
                return this;
            }

            /**
             * arr_apt_code.
             */
            public Builder arrAptCode(String arrAptCode) {
                this.arrAptCode = arrAptCode;
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
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_terminal.
             */
            public Builder arrTerminal(String arrTerminal) {
                this.arrTerminal = arrTerminal;
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
             * dep_apt.
             */
            public Builder depApt(String depApt) {
                this.depApt = depApt;
                return this;
            }

            /**
             * dep_apt_code.
             */
            public Builder depAptCode(String depAptCode) {
                this.depAptCode = depAptCode;
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
             * dep_terminal.
             */
            public Builder depTerminal(String depTerminal) {
                this.depTerminal = depTerminal;
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
             * flight_mile.
             */
            public Builder flightMile(Integer flightMile) {
                this.flightMile = flightMile;
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
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * stop_city.
             */
            public Builder stopCity(java.util.List<String> stopCity) {
                this.stopCity = stopCity;
                return this;
            }

            public FlightReshopSegmentList build() {
                return new FlightReshopSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightReshopUserFeeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_fee")
        private Double changeFee;

        @com.aliyun.core.annotation.NameInMap("reshop_corp_amount")
        private Double reshopCorpAmount;

        @com.aliyun.core.annotation.NameInMap("reshop_person_amount")
        private Double reshopPersonAmount;

        @com.aliyun.core.annotation.NameInMap("upgrade_fee")
        private Double upgradeFee;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightReshopUserFeeList(Builder builder) {
            this.changeFee = builder.changeFee;
            this.reshopCorpAmount = builder.reshopCorpAmount;
            this.reshopPersonAmount = builder.reshopPersonAmount;
            this.upgradeFee = builder.upgradeFee;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightReshopUserFeeList create() {
            return builder().build();
        }

        /**
         * @return changeFee
         */
        public Double getChangeFee() {
            return this.changeFee;
        }

        /**
         * @return reshopCorpAmount
         */
        public Double getReshopCorpAmount() {
            return this.reshopCorpAmount;
        }

        /**
         * @return reshopPersonAmount
         */
        public Double getReshopPersonAmount() {
            return this.reshopPersonAmount;
        }

        /**
         * @return upgradeFee
         */
        public Double getUpgradeFee() {
            return this.upgradeFee;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Double changeFee; 
            private Double reshopCorpAmount; 
            private Double reshopPersonAmount; 
            private Double upgradeFee; 
            private String userId; 

            private Builder() {
            } 

            private Builder(FlightReshopUserFeeList model) {
                this.changeFee = model.changeFee;
                this.reshopCorpAmount = model.reshopCorpAmount;
                this.reshopPersonAmount = model.reshopPersonAmount;
                this.upgradeFee = model.upgradeFee;
                this.userId = model.userId;
            } 

            /**
             * change_fee.
             */
            public Builder changeFee(Double changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * reshop_corp_amount.
             */
            public Builder reshopCorpAmount(Double reshopCorpAmount) {
                this.reshopCorpAmount = reshopCorpAmount;
                return this;
            }

            /**
             * reshop_person_amount.
             */
            public Builder reshopPersonAmount(Double reshopPersonAmount) {
                this.reshopPersonAmount = reshopPersonAmount;
                return this;
            }

            /**
             * upgrade_fee.
             */
            public Builder upgradeFee(Double upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightReshopUserFeeList build() {
                return new FlightReshopUserFeeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightReshopApplyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_reshop_apply_ticket_list")
        private java.util.List<FlightReshopApplyTicketList> flightReshopApplyTicketList;

        @com.aliyun.core.annotation.NameInMap("flight_reshop_segment_list")
        private java.util.List<FlightReshopSegmentList> flightReshopSegmentList;

        @com.aliyun.core.annotation.NameInMap("flight_reshop_user_fee_list")
        private java.util.List<FlightReshopUserFeeList> flightReshopUserFeeList;

        @com.aliyun.core.annotation.NameInMap("relate_reshop_apply_id")
        private Long relateReshopApplyId;

        @com.aliyun.core.annotation.NameInMap("reshop_apply_id")
        private Long reshopApplyId;

        @com.aliyun.core.annotation.NameInMap("reshop_approve_id")
        private String reshopApproveId;

        @com.aliyun.core.annotation.NameInMap("reshop_corp_total_amount")
        private Double reshopCorpTotalAmount;

        @com.aliyun.core.annotation.NameInMap("reshop_person_total_amount")
        private Double reshopPersonTotalAmount;

        @com.aliyun.core.annotation.NameInMap("reshop_reason")
        private String reshopReason;

        @com.aliyun.core.annotation.NameInMap("reshop_reason_code")
        private String reshopReasonCode;

        @com.aliyun.core.annotation.NameInMap("reshop_total_amount")
        private Double reshopTotalAmount;

        @com.aliyun.core.annotation.NameInMap("user_id_list")
        private java.util.List<String> userIdList;

        private FlightReshopApplyList(Builder builder) {
            this.flightReshopApplyTicketList = builder.flightReshopApplyTicketList;
            this.flightReshopSegmentList = builder.flightReshopSegmentList;
            this.flightReshopUserFeeList = builder.flightReshopUserFeeList;
            this.relateReshopApplyId = builder.relateReshopApplyId;
            this.reshopApplyId = builder.reshopApplyId;
            this.reshopApproveId = builder.reshopApproveId;
            this.reshopCorpTotalAmount = builder.reshopCorpTotalAmount;
            this.reshopPersonTotalAmount = builder.reshopPersonTotalAmount;
            this.reshopReason = builder.reshopReason;
            this.reshopReasonCode = builder.reshopReasonCode;
            this.reshopTotalAmount = builder.reshopTotalAmount;
            this.userIdList = builder.userIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightReshopApplyList create() {
            return builder().build();
        }

        /**
         * @return flightReshopApplyTicketList
         */
        public java.util.List<FlightReshopApplyTicketList> getFlightReshopApplyTicketList() {
            return this.flightReshopApplyTicketList;
        }

        /**
         * @return flightReshopSegmentList
         */
        public java.util.List<FlightReshopSegmentList> getFlightReshopSegmentList() {
            return this.flightReshopSegmentList;
        }

        /**
         * @return flightReshopUserFeeList
         */
        public java.util.List<FlightReshopUserFeeList> getFlightReshopUserFeeList() {
            return this.flightReshopUserFeeList;
        }

        /**
         * @return relateReshopApplyId
         */
        public Long getRelateReshopApplyId() {
            return this.relateReshopApplyId;
        }

        /**
         * @return reshopApplyId
         */
        public Long getReshopApplyId() {
            return this.reshopApplyId;
        }

        /**
         * @return reshopApproveId
         */
        public String getReshopApproveId() {
            return this.reshopApproveId;
        }

        /**
         * @return reshopCorpTotalAmount
         */
        public Double getReshopCorpTotalAmount() {
            return this.reshopCorpTotalAmount;
        }

        /**
         * @return reshopPersonTotalAmount
         */
        public Double getReshopPersonTotalAmount() {
            return this.reshopPersonTotalAmount;
        }

        /**
         * @return reshopReason
         */
        public String getReshopReason() {
            return this.reshopReason;
        }

        /**
         * @return reshopReasonCode
         */
        public String getReshopReasonCode() {
            return this.reshopReasonCode;
        }

        /**
         * @return reshopTotalAmount
         */
        public Double getReshopTotalAmount() {
            return this.reshopTotalAmount;
        }

        /**
         * @return userIdList
         */
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

        public static final class Builder {
            private java.util.List<FlightReshopApplyTicketList> flightReshopApplyTicketList; 
            private java.util.List<FlightReshopSegmentList> flightReshopSegmentList; 
            private java.util.List<FlightReshopUserFeeList> flightReshopUserFeeList; 
            private Long relateReshopApplyId; 
            private Long reshopApplyId; 
            private String reshopApproveId; 
            private Double reshopCorpTotalAmount; 
            private Double reshopPersonTotalAmount; 
            private String reshopReason; 
            private String reshopReasonCode; 
            private Double reshopTotalAmount; 
            private java.util.List<String> userIdList; 

            private Builder() {
            } 

            private Builder(FlightReshopApplyList model) {
                this.flightReshopApplyTicketList = model.flightReshopApplyTicketList;
                this.flightReshopSegmentList = model.flightReshopSegmentList;
                this.flightReshopUserFeeList = model.flightReshopUserFeeList;
                this.relateReshopApplyId = model.relateReshopApplyId;
                this.reshopApplyId = model.reshopApplyId;
                this.reshopApproveId = model.reshopApproveId;
                this.reshopCorpTotalAmount = model.reshopCorpTotalAmount;
                this.reshopPersonTotalAmount = model.reshopPersonTotalAmount;
                this.reshopReason = model.reshopReason;
                this.reshopReasonCode = model.reshopReasonCode;
                this.reshopTotalAmount = model.reshopTotalAmount;
                this.userIdList = model.userIdList;
            } 

            /**
             * flight_reshop_apply_ticket_list.
             */
            public Builder flightReshopApplyTicketList(java.util.List<FlightReshopApplyTicketList> flightReshopApplyTicketList) {
                this.flightReshopApplyTicketList = flightReshopApplyTicketList;
                return this;
            }

            /**
             * flight_reshop_segment_list.
             */
            public Builder flightReshopSegmentList(java.util.List<FlightReshopSegmentList> flightReshopSegmentList) {
                this.flightReshopSegmentList = flightReshopSegmentList;
                return this;
            }

            /**
             * flight_reshop_user_fee_list.
             */
            public Builder flightReshopUserFeeList(java.util.List<FlightReshopUserFeeList> flightReshopUserFeeList) {
                this.flightReshopUserFeeList = flightReshopUserFeeList;
                return this;
            }

            /**
             * relate_reshop_apply_id.
             */
            public Builder relateReshopApplyId(Long relateReshopApplyId) {
                this.relateReshopApplyId = relateReshopApplyId;
                return this;
            }

            /**
             * reshop_apply_id.
             */
            public Builder reshopApplyId(Long reshopApplyId) {
                this.reshopApplyId = reshopApplyId;
                return this;
            }

            /**
             * reshop_approve_id.
             */
            public Builder reshopApproveId(String reshopApproveId) {
                this.reshopApproveId = reshopApproveId;
                return this;
            }

            /**
             * reshop_corp_total_amount.
             */
            public Builder reshopCorpTotalAmount(Double reshopCorpTotalAmount) {
                this.reshopCorpTotalAmount = reshopCorpTotalAmount;
                return this;
            }

            /**
             * reshop_person_total_amount.
             */
            public Builder reshopPersonTotalAmount(Double reshopPersonTotalAmount) {
                this.reshopPersonTotalAmount = reshopPersonTotalAmount;
                return this;
            }

            /**
             * reshop_reason.
             */
            public Builder reshopReason(String reshopReason) {
                this.reshopReason = reshopReason;
                return this;
            }

            /**
             * reshop_reason_code.
             */
            public Builder reshopReasonCode(String reshopReasonCode) {
                this.reshopReasonCode = reshopReasonCode;
                return this;
            }

            /**
             * reshop_total_amount.
             */
            public Builder reshopTotalAmount(Double reshopTotalAmount) {
                this.reshopTotalAmount = reshopTotalAmount;
                return this;
            }

            /**
             * user_id_list.
             */
            public Builder userIdList(java.util.List<String> userIdList) {
                this.userIdList = userIdList;
                return this;
            }

            public FlightReshopApplyList build() {
                return new FlightReshopApplyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class FlightSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("arr_apt")
        private String arrApt;

        @com.aliyun.core.annotation.NameInMap("arr_apt_code")
        private String arrAptCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_apt")
        private String depApt;

        @com.aliyun.core.annotation.NameInMap("dep_apt_code")
        private String depAptCode;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_terminal")
        private String depTerminal;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_mile")
        private Integer flightMile;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private java.util.List<String> stopCity;

        private FlightSegmentList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.arrApt = builder.arrApt;
            this.arrAptCode = builder.arrAptCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.depApt = builder.depApt;
            this.depAptCode = builder.depAptCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightMile = builder.flightMile;
            this.flightNo = builder.flightNo;
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
            this.stopCity = builder.stopCity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentList create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return arrApt
         */
        public String getArrApt() {
            return this.arrApt;
        }

        /**
         * @return arrAptCode
         */
        public String getArrAptCode() {
            return this.arrAptCode;
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
         * @return arrTerminal
         */
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depApt
         */
        public String getDepApt() {
            return this.depApt;
        }

        /**
         * @return depAptCode
         */
        public String getDepAptCode() {
            return this.depAptCode;
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
         * @return depTerminal
         */
        public String getDepTerminal() {
            return this.depTerminal;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightMile
         */
        public Integer getFlightMile() {
            return this.flightMile;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return stopCity
         */
        public java.util.List<String> getStopCity() {
            return this.stopCity;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String arrApt; 
            private String arrAptCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTerminal; 
            private String arrTime; 
            private String depApt; 
            private String depAptCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTerminal; 
            private String depTime; 
            private Integer flightMile; 
            private String flightNo; 
            private Integer journeyIndex; 
            private Integer segmentIndex; 
            private java.util.List<String> stopCity; 

            private Builder() {
            } 

            private Builder(FlightSegmentList model) {
                this.airlineCode = model.airlineCode;
                this.airlineName = model.airlineName;
                this.arrApt = model.arrApt;
                this.arrAptCode = model.arrAptCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrTerminal = model.arrTerminal;
                this.arrTime = model.arrTime;
                this.depApt = model.depApt;
                this.depAptCode = model.depAptCode;
                this.depCity = model.depCity;
                this.depCityCode = model.depCityCode;
                this.depTerminal = model.depTerminal;
                this.depTime = model.depTime;
                this.flightMile = model.flightMile;
                this.flightNo = model.flightNo;
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
                this.stopCity = model.stopCity;
            } 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_name.
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * arr_apt.
             */
            public Builder arrApt(String arrApt) {
                this.arrApt = arrApt;
                return this;
            }

            /**
             * arr_apt_code.
             */
            public Builder arrAptCode(String arrAptCode) {
                this.arrAptCode = arrAptCode;
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
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_terminal.
             */
            public Builder arrTerminal(String arrTerminal) {
                this.arrTerminal = arrTerminal;
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
             * dep_apt.
             */
            public Builder depApt(String depApt) {
                this.depApt = depApt;
                return this;
            }

            /**
             * dep_apt_code.
             */
            public Builder depAptCode(String depAptCode) {
                this.depAptCode = depAptCode;
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
             * dep_terminal.
             */
            public Builder depTerminal(String depTerminal) {
                this.depTerminal = depTerminal;
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
             * flight_mile.
             */
            public Builder flightMile(Integer flightMile) {
                this.flightMile = flightMile;
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
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * stop_city.
             */
            public Builder stopCity(java.util.List<String> stopCity) {
                this.stopCity = stopCity;
                return this;
            }

            public FlightSegmentList build() {
                return new FlightSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class InsureInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("insure_id")
        private String insureId;

        @com.aliyun.core.annotation.NameInMap("insure_order_amount")
        private Double insureOrderAmount;

        @com.aliyun.core.annotation.NameInMap("insure_price")
        private Double insurePrice;

        @com.aliyun.core.annotation.NameInMap("insure_type")
        private String insureType;

        @com.aliyun.core.annotation.NameInMap("name_list")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private InsureInfoList(Builder builder) {
            this.insureId = builder.insureId;
            this.insureOrderAmount = builder.insureOrderAmount;
            this.insurePrice = builder.insurePrice;
            this.insureType = builder.insureType;
            this.nameList = builder.nameList;
            this.number = builder.number;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsureInfoList create() {
            return builder().build();
        }

        /**
         * @return insureId
         */
        public String getInsureId() {
            return this.insureId;
        }

        /**
         * @return insureOrderAmount
         */
        public Double getInsureOrderAmount() {
            return this.insureOrderAmount;
        }

        /**
         * @return insurePrice
         */
        public Double getInsurePrice() {
            return this.insurePrice;
        }

        /**
         * @return insureType
         */
        public String getInsureType() {
            return this.insureType;
        }

        /**
         * @return nameList
         */
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String insureId; 
            private Double insureOrderAmount; 
            private Double insurePrice; 
            private String insureType; 
            private java.util.List<String> nameList; 
            private Integer number; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(InsureInfoList model) {
                this.insureId = model.insureId;
                this.insureOrderAmount = model.insureOrderAmount;
                this.insurePrice = model.insurePrice;
                this.insureType = model.insureType;
                this.nameList = model.nameList;
                this.number = model.number;
                this.status = model.status;
            } 

            /**
             * insure_id.
             */
            public Builder insureId(String insureId) {
                this.insureId = insureId;
                return this;
            }

            /**
             * insure_order_amount.
             */
            public Builder insureOrderAmount(Double insureOrderAmount) {
                this.insureOrderAmount = insureOrderAmount;
                return this;
            }

            /**
             * insure_price.
             */
            public Builder insurePrice(Double insurePrice) {
                this.insurePrice = insurePrice;
                return this;
            }

            /**
             * insure_type.
             */
            public Builder insureType(String insureType) {
                this.insureType = insureType;
                return this;
            }

            /**
             * name_list.
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * number.
             */
            public Builder number(Integer number) {
                this.number = number;
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
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class PriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category_code")
        private Integer categoryCode;

        @com.aliyun.core.annotation.NameInMap("category_type")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("sub_order_id")
        private String subOrderId;

        @com.aliyun.core.annotation.NameInMap("trade_id")
        private String tradeId;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.categoryType = builder.categoryType;
            this.gmtCreate = builder.gmtCreate;
            this.payType = builder.payType;
            this.price = builder.price;
            this.subOrderId = builder.subOrderId;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
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
         * @return subOrderId
         */
        public String getSubOrderId() {
            return this.subOrderId;
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
            private String gmtCreate; 
            private Integer payType; 
            private Double price; 
            private String subOrderId; 
            private String tradeId; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(PriceInfoList model) {
                this.categoryCode = model.categoryCode;
                this.categoryType = model.categoryType;
                this.gmtCreate = model.gmtCreate;
                this.payType = model.payType;
                this.price = model.price;
                this.subOrderId = model.subOrderId;
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
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * sub_order_id.
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
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
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
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
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class Department extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        private Department(Builder builder) {
            this.departId = builder.departId;
            this.departName = builder.departName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Department create() {
            return builder().build();
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

        public static final class Builder {
            private String departId; 
            private String departName; 

            private Builder() {
            } 

            private Builder(Department model) {
                this.departId = model.departId;
                this.departName = model.departName;
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

            public Department build() {
                return new Department(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
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
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("project_id")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        private Project(Builder builder) {
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.thirdpartProjectId = builder.thirdpartProjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return thirdpartProjectId
         */
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        public static final class Builder {
            private String projectId; 
            private String projectTitle; 
            private String thirdpartProjectId; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.projectId = model.projectId;
                this.projectTitle = model.projectTitle;
                this.thirdpartProjectId = model.thirdpartProjectId;
            } 

            /**
             * project_id.
             */
            public Builder projectId(String projectId) {
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
             * thirdpart_project_id.
             */
            public Builder thirdpartProjectId(String thirdpartProjectId) {
                this.thirdpartProjectId = thirdpartProjectId;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class UserAffiliateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center")
        private CostCenter costCenter;

        @com.aliyun.core.annotation.NameInMap("department")
        private Department department;

        @com.aliyun.core.annotation.NameInMap("invoice")
        private Invoice invoice;

        @com.aliyun.core.annotation.NameInMap("project")
        private Project project;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private UserAffiliateList(Builder builder) {
            this.costCenter = builder.costCenter;
            this.department = builder.department;
            this.invoice = builder.invoice;
            this.project = builder.project;
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
         * @return costCenter
         */
        public CostCenter getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return department
         */
        public Department getDepartment() {
            return this.department;
        }

        /**
         * @return invoice
         */
        public Invoice getInvoice() {
            return this.invoice;
        }

        /**
         * @return project
         */
        public Project getProject() {
            return this.project;
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
            private CostCenter costCenter; 
            private Department department; 
            private Invoice invoice; 
            private Project project; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(UserAffiliateList model) {
                this.costCenter = model.costCenter;
                this.department = model.department;
                this.invoice = model.invoice;
                this.project = model.project;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * cost_center.
             */
            public Builder costCenter(CostCenter costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * department.
             */
            public Builder department(Department department) {
                this.department = department;
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
             * project.
             */
            public Builder project(Project project) {
                this.project = project;
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

            public UserAffiliateList build() {
                return new UserAffiliateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("approve")
        private Approve approve;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("flight_order_ticket_list")
        private java.util.List<FlightOrderTicketList> flightOrderTicketList;

        @com.aliyun.core.annotation.NameInMap("flight_order_user_fee_list")
        private java.util.List<FlightOrderUserFeeList> flightOrderUserFeeList;

        @com.aliyun.core.annotation.NameInMap("flight_refund_apply_list")
        private java.util.List<FlightRefundApplyList> flightRefundApplyList;

        @com.aliyun.core.annotation.NameInMap("flight_reshop_apply_list")
        private java.util.List<FlightReshopApplyList> flightReshopApplyList;

        @com.aliyun.core.annotation.NameInMap("flight_segment_list")
        private java.util.List<FlightSegmentList> flightSegmentList;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("insure_info_list")
        private java.util.List<InsureInfoList> insureInfoList;

        @com.aliyun.core.annotation.NameInMap("mix_pay")
        private Boolean mixPay;

        @com.aliyun.core.annotation.NameInMap("order_reserve_amount")
        private Double orderReserveAmount;

        @com.aliyun.core.annotation.NameInMap("passenger_count")
        private Integer passengerCount;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("price_info_list")
        private java.util.List<PriceInfoList> priceInfoList;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("supplier")
        private String supplier;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private java.util.List<String> thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("ticket_corp_reserve_amount")
        private Double ticketCorpReserveAmount;

        @com.aliyun.core.annotation.NameInMap("ticket_person_reserve_amount")
        private Double ticketPersonReserveAmount;

        @com.aliyun.core.annotation.NameInMap("trip_mode")
        private Integer tripMode;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        @com.aliyun.core.annotation.NameInMap("user_affiliate_list")
        private java.util.List<UserAffiliateList> userAffiliateList;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private Module(Builder builder) {
            this.approve = builder.approve;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.flightOrderTicketList = builder.flightOrderTicketList;
            this.flightOrderUserFeeList = builder.flightOrderUserFeeList;
            this.flightRefundApplyList = builder.flightRefundApplyList;
            this.flightReshopApplyList = builder.flightReshopApplyList;
            this.flightSegmentList = builder.flightSegmentList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.insureInfoList = builder.insureInfoList;
            this.mixPay = builder.mixPay;
            this.orderReserveAmount = builder.orderReserveAmount;
            this.passengerCount = builder.passengerCount;
            this.payTime = builder.payTime;
            this.priceInfoList = builder.priceInfoList;
            this.status = builder.status;
            this.supplier = builder.supplier;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.ticketCorpReserveAmount = builder.ticketCorpReserveAmount;
            this.ticketPersonReserveAmount = builder.ticketPersonReserveAmount;
            this.tripMode = builder.tripMode;
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
         * @return approve
         */
        public Approve getApprove() {
            return this.approve;
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
         * @return flightOrderTicketList
         */
        public java.util.List<FlightOrderTicketList> getFlightOrderTicketList() {
            return this.flightOrderTicketList;
        }

        /**
         * @return flightOrderUserFeeList
         */
        public java.util.List<FlightOrderUserFeeList> getFlightOrderUserFeeList() {
            return this.flightOrderUserFeeList;
        }

        /**
         * @return flightRefundApplyList
         */
        public java.util.List<FlightRefundApplyList> getFlightRefundApplyList() {
            return this.flightRefundApplyList;
        }

        /**
         * @return flightReshopApplyList
         */
        public java.util.List<FlightReshopApplyList> getFlightReshopApplyList() {
            return this.flightReshopApplyList;
        }

        /**
         * @return flightSegmentList
         */
        public java.util.List<FlightSegmentList> getFlightSegmentList() {
            return this.flightSegmentList;
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
        public String getId() {
            return this.id;
        }

        /**
         * @return insureInfoList
         */
        public java.util.List<InsureInfoList> getInsureInfoList() {
            return this.insureInfoList;
        }

        /**
         * @return mixPay
         */
        public Boolean getMixPay() {
            return this.mixPay;
        }

        /**
         * @return orderReserveAmount
         */
        public Double getOrderReserveAmount() {
            return this.orderReserveAmount;
        }

        /**
         * @return passengerCount
         */
        public Integer getPassengerCount() {
            return this.passengerCount;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List<PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supplier
         */
        public String getSupplier() {
            return this.supplier;
        }

        /**
         * @return thirdpartItineraryId
         */
        public java.util.List<String> getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return ticketCorpReserveAmount
         */
        public Double getTicketCorpReserveAmount() {
            return this.ticketCorpReserveAmount;
        }

        /**
         * @return ticketPersonReserveAmount
         */
        public Double getTicketPersonReserveAmount() {
            return this.ticketPersonReserveAmount;
        }

        /**
         * @return tripMode
         */
        public Integer getTripMode() {
            return this.tripMode;
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
            private Approve approve; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private java.util.List<FlightOrderTicketList> flightOrderTicketList; 
            private java.util.List<FlightOrderUserFeeList> flightOrderUserFeeList; 
            private java.util.List<FlightRefundApplyList> flightRefundApplyList; 
            private java.util.List<FlightReshopApplyList> flightReshopApplyList; 
            private java.util.List<FlightSegmentList> flightSegmentList; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private java.util.List<InsureInfoList> insureInfoList; 
            private Boolean mixPay; 
            private Double orderReserveAmount; 
            private Integer passengerCount; 
            private String payTime; 
            private java.util.List<PriceInfoList> priceInfoList; 
            private Integer status; 
            private String supplier; 
            private java.util.List<String> thirdpartItineraryId; 
            private Double ticketCorpReserveAmount; 
            private Double ticketPersonReserveAmount; 
            private Integer tripMode; 
            private Integer tripType; 
            private java.util.List<UserAffiliateList> userAffiliateList; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.approve = model.approve;
                this.corpId = model.corpId;
                this.corpName = model.corpName;
                this.departId = model.departId;
                this.departName = model.departName;
                this.flightOrderTicketList = model.flightOrderTicketList;
                this.flightOrderUserFeeList = model.flightOrderUserFeeList;
                this.flightRefundApplyList = model.flightRefundApplyList;
                this.flightReshopApplyList = model.flightReshopApplyList;
                this.flightSegmentList = model.flightSegmentList;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.insureInfoList = model.insureInfoList;
                this.mixPay = model.mixPay;
                this.orderReserveAmount = model.orderReserveAmount;
                this.passengerCount = model.passengerCount;
                this.payTime = model.payTime;
                this.priceInfoList = model.priceInfoList;
                this.status = model.status;
                this.supplier = model.supplier;
                this.thirdpartItineraryId = model.thirdpartItineraryId;
                this.ticketCorpReserveAmount = model.ticketCorpReserveAmount;
                this.ticketPersonReserveAmount = model.ticketPersonReserveAmount;
                this.tripMode = model.tripMode;
                this.tripType = model.tripType;
                this.userAffiliateList = model.userAffiliateList;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * approve.
             */
            public Builder approve(Approve approve) {
                this.approve = approve;
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
             * flight_order_ticket_list.
             */
            public Builder flightOrderTicketList(java.util.List<FlightOrderTicketList> flightOrderTicketList) {
                this.flightOrderTicketList = flightOrderTicketList;
                return this;
            }

            /**
             * flight_order_user_fee_list.
             */
            public Builder flightOrderUserFeeList(java.util.List<FlightOrderUserFeeList> flightOrderUserFeeList) {
                this.flightOrderUserFeeList = flightOrderUserFeeList;
                return this;
            }

            /**
             * flight_refund_apply_list.
             */
            public Builder flightRefundApplyList(java.util.List<FlightRefundApplyList> flightRefundApplyList) {
                this.flightRefundApplyList = flightRefundApplyList;
                return this;
            }

            /**
             * flight_reshop_apply_list.
             */
            public Builder flightReshopApplyList(java.util.List<FlightReshopApplyList> flightReshopApplyList) {
                this.flightReshopApplyList = flightReshopApplyList;
                return this;
            }

            /**
             * flight_segment_list.
             */
            public Builder flightSegmentList(java.util.List<FlightSegmentList> flightSegmentList) {
                this.flightSegmentList = flightSegmentList;
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
            public Builder id(String id) {
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
             * mix_pay.
             */
            public Builder mixPay(Boolean mixPay) {
                this.mixPay = mixPay;
                return this;
            }

            /**
             * order_reserve_amount.
             */
            public Builder orderReserveAmount(Double orderReserveAmount) {
                this.orderReserveAmount = orderReserveAmount;
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
             * pay_time.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
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
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * supplier.
             */
            public Builder supplier(String supplier) {
                this.supplier = supplier;
                return this;
            }

            /**
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(java.util.List<String> thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * ticket_corp_reserve_amount.
             */
            public Builder ticketCorpReserveAmount(Double ticketCorpReserveAmount) {
                this.ticketCorpReserveAmount = ticketCorpReserveAmount;
                return this;
            }

            /**
             * ticket_person_reserve_amount.
             */
            public Builder ticketPersonReserveAmount(Double ticketPersonReserveAmount) {
                this.ticketPersonReserveAmount = ticketPersonReserveAmount;
                return this;
            }

            /**
             * trip_mode.
             */
            public Builder tripMode(Integer tripMode) {
                this.tripMode = tripMode;
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
     * {@link FlightOrderListQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderListQueryV2ResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("scroll_id")
        private String scrollId;

        @com.aliyun.core.annotation.NameInMap("total_number")
        private Integer totalNumber;

        private PageInfo(Builder builder) {
            this.number = builder.number;
            this.scrollId = builder.scrollId;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return scrollId
         */
        public String getScrollId() {
            return this.scrollId;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Integer number; 
            private String scrollId; 
            private Integer totalNumber; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.number = model.number;
                this.scrollId = model.scrollId;
                this.totalNumber = model.totalNumber;
            } 

            /**
             * number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * scroll_id.
             */
            public Builder scrollId(String scrollId) {
                this.scrollId = scrollId;
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
