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
 * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TrainOrderQueryResponseBody</p>
 */
public class TrainOrderQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TrainOrderQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainOrderQueryResponseBody create() {
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
    public Module getModule() {
        return this.module;
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
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(TrainOrderQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
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
        public Builder module(Module module) {
            this.module = module;
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

        public TrainOrderQueryResponseBody build() {
            return new TrainOrderQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class ChangeTicketInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_coach_no")
        private String changeCoachNo;

        @com.aliyun.core.annotation.NameInMap("change_gap_fee")
        private Double changeGapFee;

        @com.aliyun.core.annotation.NameInMap("change_handling_fee")
        private Double changeHandlingFee;

        @com.aliyun.core.annotation.NameInMap("change_seat_no")
        private String changeSeatNo;

        @com.aliyun.core.annotation.NameInMap("change_seat_type_name")
        private String changeSeatTypeName;

        @com.aliyun.core.annotation.NameInMap("change_service_fee")
        private Double changeServiceFee;

        @com.aliyun.core.annotation.NameInMap("change_train_no")
        private String changeTrainNo;

        @com.aliyun.core.annotation.NameInMap("change_train_type_name")
        private String changeTrainTypeName;

        @com.aliyun.core.annotation.NameInMap("check_in_time")
        private String checkInTime;

        @com.aliyun.core.annotation.NameInMap("check_out_time")
        private String checkOutTime;

        @com.aliyun.core.annotation.NameInMap("end_time")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("from_station_name")
        private String fromStationName;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("origin_ticket_no")
        private String originTicketNo;

        @com.aliyun.core.annotation.NameInMap("out_ticket_status")
        private String outTicketStatus;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("to_station_name")
        private String toStationName;

        private ChangeTicketInfoList(Builder builder) {
            this.changeCoachNo = builder.changeCoachNo;
            this.changeGapFee = builder.changeGapFee;
            this.changeHandlingFee = builder.changeHandlingFee;
            this.changeSeatNo = builder.changeSeatNo;
            this.changeSeatTypeName = builder.changeSeatTypeName;
            this.changeServiceFee = builder.changeServiceFee;
            this.changeTrainNo = builder.changeTrainNo;
            this.changeTrainTypeName = builder.changeTrainTypeName;
            this.checkInTime = builder.checkInTime;
            this.checkOutTime = builder.checkOutTime;
            this.endTime = builder.endTime;
            this.fromStationName = builder.fromStationName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.originTicketNo = builder.originTicketNo;
            this.outTicketStatus = builder.outTicketStatus;
            this.startTime = builder.startTime;
            this.ticketNo = builder.ticketNo;
            this.toStationName = builder.toStationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return changeCoachNo
         */
        public String getChangeCoachNo() {
            return this.changeCoachNo;
        }

        /**
         * @return changeGapFee
         */
        public Double getChangeGapFee() {
            return this.changeGapFee;
        }

        /**
         * @return changeHandlingFee
         */
        public Double getChangeHandlingFee() {
            return this.changeHandlingFee;
        }

        /**
         * @return changeSeatNo
         */
        public String getChangeSeatNo() {
            return this.changeSeatNo;
        }

        /**
         * @return changeSeatTypeName
         */
        public String getChangeSeatTypeName() {
            return this.changeSeatTypeName;
        }

        /**
         * @return changeServiceFee
         */
        public Double getChangeServiceFee() {
            return this.changeServiceFee;
        }

        /**
         * @return changeTrainNo
         */
        public String getChangeTrainNo() {
            return this.changeTrainNo;
        }

        /**
         * @return changeTrainTypeName
         */
        public String getChangeTrainTypeName() {
            return this.changeTrainTypeName;
        }

        /**
         * @return checkInTime
         */
        public String getCheckInTime() {
            return this.checkInTime;
        }

        /**
         * @return checkOutTime
         */
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fromStationName
         */
        public String getFromStationName() {
            return this.fromStationName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return originTicketNo
         */
        public String getOriginTicketNo() {
            return this.originTicketNo;
        }

        /**
         * @return outTicketStatus
         */
        public String getOutTicketStatus() {
            return this.outTicketStatus;
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
         * @return toStationName
         */
        public String getToStationName() {
            return this.toStationName;
        }

        public static final class Builder {
            private String changeCoachNo; 
            private Double changeGapFee; 
            private Double changeHandlingFee; 
            private String changeSeatNo; 
            private String changeSeatTypeName; 
            private Double changeServiceFee; 
            private String changeTrainNo; 
            private String changeTrainTypeName; 
            private String checkInTime; 
            private String checkOutTime; 
            private String endTime; 
            private String fromStationName; 
            private String gmtCreate; 
            private String gmtModify; 
            private String originTicketNo; 
            private String outTicketStatus; 
            private String startTime; 
            private String ticketNo; 
            private String toStationName; 

            private Builder() {
            } 

            private Builder(ChangeTicketInfoList model) {
                this.changeCoachNo = model.changeCoachNo;
                this.changeGapFee = model.changeGapFee;
                this.changeHandlingFee = model.changeHandlingFee;
                this.changeSeatNo = model.changeSeatNo;
                this.changeSeatTypeName = model.changeSeatTypeName;
                this.changeServiceFee = model.changeServiceFee;
                this.changeTrainNo = model.changeTrainNo;
                this.changeTrainTypeName = model.changeTrainTypeName;
                this.checkInTime = model.checkInTime;
                this.checkOutTime = model.checkOutTime;
                this.endTime = model.endTime;
                this.fromStationName = model.fromStationName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.originTicketNo = model.originTicketNo;
                this.outTicketStatus = model.outTicketStatus;
                this.startTime = model.startTime;
                this.ticketNo = model.ticketNo;
                this.toStationName = model.toStationName;
            } 

            /**
             * change_coach_no.
             */
            public Builder changeCoachNo(String changeCoachNo) {
                this.changeCoachNo = changeCoachNo;
                return this;
            }

            /**
             * change_gap_fee.
             */
            public Builder changeGapFee(Double changeGapFee) {
                this.changeGapFee = changeGapFee;
                return this;
            }

            /**
             * change_handling_fee.
             */
            public Builder changeHandlingFee(Double changeHandlingFee) {
                this.changeHandlingFee = changeHandlingFee;
                return this;
            }

            /**
             * change_seat_no.
             */
            public Builder changeSeatNo(String changeSeatNo) {
                this.changeSeatNo = changeSeatNo;
                return this;
            }

            /**
             * change_seat_type_name.
             */
            public Builder changeSeatTypeName(String changeSeatTypeName) {
                this.changeSeatTypeName = changeSeatTypeName;
                return this;
            }

            /**
             * change_service_fee.
             */
            public Builder changeServiceFee(Double changeServiceFee) {
                this.changeServiceFee = changeServiceFee;
                return this;
            }

            /**
             * change_train_no.
             */
            public Builder changeTrainNo(String changeTrainNo) {
                this.changeTrainNo = changeTrainNo;
                return this;
            }

            /**
             * change_train_type_name.
             */
            public Builder changeTrainTypeName(String changeTrainTypeName) {
                this.changeTrainTypeName = changeTrainTypeName;
                return this;
            }

            /**
             * check_in_time.
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * check_out_time.
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
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
             * from_station_name.
             */
            public Builder fromStationName(String fromStationName) {
                this.fromStationName = fromStationName;
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
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * origin_ticket_no.
             */
            public Builder originTicketNo(String originTicketNo) {
                this.originTicketNo = originTicketNo;
                return this;
            }

            /**
             * out_ticket_status.
             */
            public Builder outTicketStatus(String outTicketStatus) {
                this.outTicketStatus = outTicketStatus;
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
             * to_station_name.
             */
            public Builder toStationName(String toStationName) {
                this.toStationName = toStationName;
                return this;
            }

            public ChangeTicketInfoList build() {
                return new ChangeTicketInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class InvoiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private InvoiceInfo(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvoiceInfo create() {
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

            private Builder(InvoiceInfo model) {
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

            public InvoiceInfo build() {
                return new InvoiceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class OrderBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("btrip_title")
        private String btripTitle;

        @com.aliyun.core.annotation.NameInMap("contact_name")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("exceed_apply_id")
        private String exceedApplyId;

        @com.aliyun.core.annotation.NameInMap("exceed_third_part_apply_id")
        private String exceedThirdPartApplyId;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_corp_id")
        private String thirdpartCorpId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private OrderBaseInfo(Builder builder) {
            this.applyId = builder.applyId;
            this.btripTitle = builder.btripTitle;
            this.contactName = builder.contactName;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.exceedApplyId = builder.exceedApplyId;
            this.exceedThirdPartApplyId = builder.exceedThirdPartApplyId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.itineraryId = builder.itineraryId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartCorpId = builder.thirdpartCorpId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.tripType = builder.tripType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderBaseInfo create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
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
         * @return exceedApplyId
         */
        public String getExceedApplyId() {
            return this.exceedApplyId;
        }

        /**
         * @return exceedThirdPartApplyId
         */
        public String getExceedThirdPartApplyId() {
            return this.exceedThirdPartApplyId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
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
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartCorpId
         */
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String applyId; 
            private String btripTitle; 
            private String contactName; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private String exceedApplyId; 
            private String exceedThirdPartApplyId; 
            private String gmtCreate; 
            private String gmtModify; 
            private String itineraryId; 
            private Long orderId; 
            private Integer orderStatus; 
            private String thirdpartApplyId; 
            private String thirdpartCorpId; 
            private String thirdpartItineraryId; 
            private Integer tripType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(OrderBaseInfo model) {
                this.applyId = model.applyId;
                this.btripTitle = model.btripTitle;
                this.contactName = model.contactName;
                this.corpId = model.corpId;
                this.corpName = model.corpName;
                this.departId = model.departId;
                this.departName = model.departName;
                this.exceedApplyId = model.exceedApplyId;
                this.exceedThirdPartApplyId = model.exceedThirdPartApplyId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.itineraryId = model.itineraryId;
                this.orderId = model.orderId;
                this.orderStatus = model.orderStatus;
                this.thirdpartApplyId = model.thirdpartApplyId;
                this.thirdpartCorpId = model.thirdpartCorpId;
                this.thirdpartItineraryId = model.thirdpartItineraryId;
                this.tripType = model.tripType;
                this.userId = model.userId;
            } 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
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
             * <p>火车票超标审批id</p>
             * 
             * <strong>example:</strong>
             * <p>1422113021033961000</p>
             */
            public Builder exceedApplyId(String exceedApplyId) {
                this.exceedApplyId = exceedApplyId;
                return this;
            }

            /**
             * <p>火车票超标审批三方id</p>
             * 
             * <strong>example:</strong>
             * <p>2022113021030003600001715</p>
             */
            public Builder exceedThirdPartApplyId(String exceedThirdPartApplyId) {
                this.exceedThirdPartApplyId = exceedThirdPartApplyId;
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
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
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
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
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
             * thirdpart_corp_id.
             */
            public Builder thirdpartCorpId(String thirdpartCorpId) {
                this.thirdpartCorpId = thirdpartCorpId;
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
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public OrderBaseInfo build() {
                return new OrderBaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class PassengerInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        private String costCenterNumber;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_id")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private PassengerInfoList(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.thirdpartProjectId = builder.thirdpartProjectId;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerInfoList create() {
            return builder().build();
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return costCenterNumber
         */
        public String getCostCenterNumber() {
            return this.costCenterNumber;
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
         * @return thirdpartProjectId
         */
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
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
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private Long costCenterId; 
            private String costCenterName; 
            private String costCenterNumber; 
            private String projectCode; 
            private Long projectId; 
            private String projectTitle; 
            private String thirdpartProjectId; 
            private String userId; 
            private String userName; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(PassengerInfoList model) {
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.costCenterNumber = model.costCenterNumber;
                this.projectCode = model.projectCode;
                this.projectId = model.projectId;
                this.projectTitle = model.projectTitle;
                this.thirdpartProjectId = model.thirdpartProjectId;
                this.userId = model.userId;
                this.userName = model.userName;
                this.userType = model.userType;
            } 

            /**
             * cost_center_id.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * cost_center_name.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * cost_center_number.
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
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
             * thirdpart_project_id.
             */
            public Builder thirdpartProjectId(String thirdpartProjectId) {
                this.thirdpartProjectId = thirdpartProjectId;
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

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public PassengerInfoList build() {
                return new PassengerInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class PriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category_code")
        private Integer categoryCode;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("trade_id")
        private String tradeId;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.gmtCreate = builder.gmtCreate;
            this.passengerName = builder.passengerName;
            this.payType = builder.payType;
            this.price = builder.price;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
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
            private String gmtCreate; 
            private String passengerName; 
            private Integer payType; 
            private Double price; 
            private String tradeId; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(PriceInfoList model) {
                this.categoryCode = model.categoryCode;
                this.gmtCreate = model.gmtCreate;
                this.passengerName = model.passengerName;
                this.payType = model.payType;
                this.price = model.price;
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
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class RefundTicketInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("refund_fee")
        private Double refundFee;

        @com.aliyun.core.annotation.NameInMap("refund_service_fee")
        private Double refundServiceFee;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        private RefundTicketInfoList(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.refundFee = builder.refundFee;
            this.refundServiceFee = builder.refundServiceFee;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return refundFee
         */
        public Double getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return refundServiceFee
         */
        public Double getRefundServiceFee() {
            return this.refundServiceFee;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModify; 
            private Double refundFee; 
            private Double refundServiceFee; 
            private String ticketNo; 

            private Builder() {
            } 

            private Builder(RefundTicketInfoList model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.refundFee = model.refundFee;
                this.refundServiceFee = model.refundServiceFee;
                this.ticketNo = model.ticketNo;
            } 

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * refund_fee.
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * refund_service_fee.
             */
            public Builder refundServiceFee(Double refundServiceFee) {
                this.refundServiceFee = refundServiceFee;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            public RefundTicketInfoList build() {
                return new RefundTicketInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class TicketInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("changed")
        private Boolean changed;

        @com.aliyun.core.annotation.NameInMap("check_in_time")
        private String checkInTime;

        @com.aliyun.core.annotation.NameInMap("check_out_time")
        private String checkOutTime;

        @com.aliyun.core.annotation.NameInMap("coach_no")
        private String coachNo;

        @com.aliyun.core.annotation.NameInMap("end_time")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("out_ticket_status")
        private String outTicketStatus;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("seat_no")
        private String seatNo;

        @com.aliyun.core.annotation.NameInMap("seat_type_name")
        private String seatTypeName;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Double serviceFee;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Double ticketPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_status")
        private Integer ticketStatus;

        @com.aliyun.core.annotation.NameInMap("train_type_name")
        private String trainTypeName;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private TicketInfoList(Builder builder) {
            this.changed = builder.changed;
            this.checkInTime = builder.checkInTime;
            this.checkOutTime = builder.checkOutTime;
            this.coachNo = builder.coachNo;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.outTicketStatus = builder.outTicketStatus;
            this.payType = builder.payType;
            this.seatNo = builder.seatNo;
            this.seatTypeName = builder.seatTypeName;
            this.serviceFee = builder.serviceFee;
            this.startTime = builder.startTime;
            this.ticketNo = builder.ticketNo;
            this.ticketPrice = builder.ticketPrice;
            this.ticketStatus = builder.ticketStatus;
            this.trainTypeName = builder.trainTypeName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketInfoList create() {
            return builder().build();
        }

        /**
         * @return changed
         */
        public Boolean getChanged() {
            return this.changed;
        }

        /**
         * @return checkInTime
         */
        public String getCheckInTime() {
            return this.checkInTime;
        }

        /**
         * @return checkOutTime
         */
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        /**
         * @return coachNo
         */
        public String getCoachNo() {
            return this.coachNo;
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
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return outTicketStatus
         */
        public String getOutTicketStatus() {
            return this.outTicketStatus;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return seatNo
         */
        public String getSeatNo() {
            return this.seatNo;
        }

        /**
         * @return seatTypeName
         */
        public String getSeatTypeName() {
            return this.seatTypeName;
        }

        /**
         * @return serviceFee
         */
        public Double getServiceFee() {
            return this.serviceFee;
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
         * @return ticketPrice
         */
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return ticketStatus
         */
        public Integer getTicketStatus() {
            return this.ticketStatus;
        }

        /**
         * @return trainTypeName
         */
        public String getTrainTypeName() {
            return this.trainTypeName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean changed; 
            private String checkInTime; 
            private String checkOutTime; 
            private String coachNo; 
            private String endTime; 
            private String gmtCreate; 
            private String gmtModify; 
            private String outTicketStatus; 
            private Integer payType; 
            private String seatNo; 
            private String seatTypeName; 
            private Double serviceFee; 
            private String startTime; 
            private String ticketNo; 
            private Double ticketPrice; 
            private Integer ticketStatus; 
            private String trainTypeName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TicketInfoList model) {
                this.changed = model.changed;
                this.checkInTime = model.checkInTime;
                this.checkOutTime = model.checkOutTime;
                this.coachNo = model.coachNo;
                this.endTime = model.endTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.outTicketStatus = model.outTicketStatus;
                this.payType = model.payType;
                this.seatNo = model.seatNo;
                this.seatTypeName = model.seatTypeName;
                this.serviceFee = model.serviceFee;
                this.startTime = model.startTime;
                this.ticketNo = model.ticketNo;
                this.ticketPrice = model.ticketPrice;
                this.ticketStatus = model.ticketStatus;
                this.trainTypeName = model.trainTypeName;
                this.userId = model.userId;
            } 

            /**
             * changed.
             */
            public Builder changed(Boolean changed) {
                this.changed = changed;
                return this;
            }

            /**
             * check_in_time.
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * check_out_time.
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
                return this;
            }

            /**
             * coach_no.
             */
            public Builder coachNo(String coachNo) {
                this.coachNo = coachNo;
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
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * out_ticket_status.
             */
            public Builder outTicketStatus(String outTicketStatus) {
                this.outTicketStatus = outTicketStatus;
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
             * seat_no.
             */
            public Builder seatNo(String seatNo) {
                this.seatNo = seatNo;
                return this;
            }

            /**
             * seat_type_name.
             */
            public Builder seatTypeName(String seatTypeName) {
                this.seatTypeName = seatTypeName;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
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
             * ticket_price.
             */
            public Builder ticketPrice(Double ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * ticket_status.
             */
            public Builder ticketStatus(Integer ticketStatus) {
                this.ticketStatus = ticketStatus;
                return this;
            }

            /**
             * train_type_name.
             */
            public Builder trainTypeName(String trainTypeName) {
                this.trainTypeName = trainTypeName;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TicketInfoList build() {
                return new TicketInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class TrainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("from_city_ad_code")
        private String fromCityAdCode;

        @com.aliyun.core.annotation.NameInMap("from_station_name")
        private String fromStationName;

        @com.aliyun.core.annotation.NameInMap("run_time")
        private Long runTime;

        @com.aliyun.core.annotation.NameInMap("to_city_ad_code")
        private String toCityAdCode;

        @com.aliyun.core.annotation.NameInMap("to_station_name")
        private String toStationName;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        private TrainInfo(Builder builder) {
            this.arrTime = builder.arrTime;
            this.depTime = builder.depTime;
            this.fromCityAdCode = builder.fromCityAdCode;
            this.fromStationName = builder.fromStationName;
            this.runTime = builder.runTime;
            this.toCityAdCode = builder.toCityAdCode;
            this.toStationName = builder.toStationName;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainInfo create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return fromCityAdCode
         */
        public String getFromCityAdCode() {
            return this.fromCityAdCode;
        }

        /**
         * @return fromStationName
         */
        public String getFromStationName() {
            return this.fromStationName;
        }

        /**
         * @return runTime
         */
        public Long getRunTime() {
            return this.runTime;
        }

        /**
         * @return toCityAdCode
         */
        public String getToCityAdCode() {
            return this.toCityAdCode;
        }

        /**
         * @return toStationName
         */
        public String getToStationName() {
            return this.toStationName;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrTime; 
            private String depTime; 
            private String fromCityAdCode; 
            private String fromStationName; 
            private Long runTime; 
            private String toCityAdCode; 
            private String toStationName; 
            private String trainNo; 

            private Builder() {
            } 

            private Builder(TrainInfo model) {
                this.arrTime = model.arrTime;
                this.depTime = model.depTime;
                this.fromCityAdCode = model.fromCityAdCode;
                this.fromStationName = model.fromStationName;
                this.runTime = model.runTime;
                this.toCityAdCode = model.toCityAdCode;
                this.toStationName = model.toStationName;
                this.trainNo = model.trainNo;
            } 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
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
             * from_city_ad_code.
             */
            public Builder fromCityAdCode(String fromCityAdCode) {
                this.fromCityAdCode = fromCityAdCode;
                return this;
            }

            /**
             * from_station_name.
             */
            public Builder fromStationName(String fromStationName) {
                this.fromStationName = fromStationName;
                return this;
            }

            /**
             * run_time.
             */
            public Builder runTime(Long runTime) {
                this.runTime = runTime;
                return this;
            }

            /**
             * to_city_ad_code.
             */
            public Builder toCityAdCode(String toCityAdCode) {
                this.toCityAdCode = toCityAdCode;
                return this;
            }

            /**
             * to_station_name.
             */
            public Builder toStationName(String toStationName) {
                this.toStationName = toStationName;
                return this;
            }

            /**
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public TrainInfo build() {
                return new TrainInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_ticket_info_list")
        private java.util.List<ChangeTicketInfoList> changeTicketInfoList;

        @com.aliyun.core.annotation.NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @com.aliyun.core.annotation.NameInMap("order_base_info")
        private OrderBaseInfo orderBaseInfo;

        @com.aliyun.core.annotation.NameInMap("passenger_info_list")
        private java.util.List<PassengerInfoList> passengerInfoList;

        @com.aliyun.core.annotation.NameInMap("price_info_list")
        private java.util.List<PriceInfoList> priceInfoList;

        @com.aliyun.core.annotation.NameInMap("refund_ticket_info_list")
        private java.util.List<RefundTicketInfoList> refundTicketInfoList;

        @com.aliyun.core.annotation.NameInMap("ticket_info_list")
        private java.util.List<TicketInfoList> ticketInfoList;

        @com.aliyun.core.annotation.NameInMap("train_info")
        private TrainInfo trainInfo;

        private Module(Builder builder) {
            this.changeTicketInfoList = builder.changeTicketInfoList;
            this.invoiceInfo = builder.invoiceInfo;
            this.orderBaseInfo = builder.orderBaseInfo;
            this.passengerInfoList = builder.passengerInfoList;
            this.priceInfoList = builder.priceInfoList;
            this.refundTicketInfoList = builder.refundTicketInfoList;
            this.ticketInfoList = builder.ticketInfoList;
            this.trainInfo = builder.trainInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return changeTicketInfoList
         */
        public java.util.List<ChangeTicketInfoList> getChangeTicketInfoList() {
            return this.changeTicketInfoList;
        }

        /**
         * @return invoiceInfo
         */
        public InvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return orderBaseInfo
         */
        public OrderBaseInfo getOrderBaseInfo() {
            return this.orderBaseInfo;
        }

        /**
         * @return passengerInfoList
         */
        public java.util.List<PassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List<PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        /**
         * @return refundTicketInfoList
         */
        public java.util.List<RefundTicketInfoList> getRefundTicketInfoList() {
            return this.refundTicketInfoList;
        }

        /**
         * @return ticketInfoList
         */
        public java.util.List<TicketInfoList> getTicketInfoList() {
            return this.ticketInfoList;
        }

        /**
         * @return trainInfo
         */
        public TrainInfo getTrainInfo() {
            return this.trainInfo;
        }

        public static final class Builder {
            private java.util.List<ChangeTicketInfoList> changeTicketInfoList; 
            private InvoiceInfo invoiceInfo; 
            private OrderBaseInfo orderBaseInfo; 
            private java.util.List<PassengerInfoList> passengerInfoList; 
            private java.util.List<PriceInfoList> priceInfoList; 
            private java.util.List<RefundTicketInfoList> refundTicketInfoList; 
            private java.util.List<TicketInfoList> ticketInfoList; 
            private TrainInfo trainInfo; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.changeTicketInfoList = model.changeTicketInfoList;
                this.invoiceInfo = model.invoiceInfo;
                this.orderBaseInfo = model.orderBaseInfo;
                this.passengerInfoList = model.passengerInfoList;
                this.priceInfoList = model.priceInfoList;
                this.refundTicketInfoList = model.refundTicketInfoList;
                this.ticketInfoList = model.ticketInfoList;
                this.trainInfo = model.trainInfo;
            } 

            /**
             * change_ticket_info_list.
             */
            public Builder changeTicketInfoList(java.util.List<ChangeTicketInfoList> changeTicketInfoList) {
                this.changeTicketInfoList = changeTicketInfoList;
                return this;
            }

            /**
             * invoice_info.
             */
            public Builder invoiceInfo(InvoiceInfo invoiceInfo) {
                this.invoiceInfo = invoiceInfo;
                return this;
            }

            /**
             * order_base_info.
             */
            public Builder orderBaseInfo(OrderBaseInfo orderBaseInfo) {
                this.orderBaseInfo = orderBaseInfo;
                return this;
            }

            /**
             * passenger_info_list.
             */
            public Builder passengerInfoList(java.util.List<PassengerInfoList> passengerInfoList) {
                this.passengerInfoList = passengerInfoList;
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
             * refund_ticket_info_list.
             */
            public Builder refundTicketInfoList(java.util.List<RefundTicketInfoList> refundTicketInfoList) {
                this.refundTicketInfoList = refundTicketInfoList;
                return this;
            }

            /**
             * ticket_info_list.
             */
            public Builder ticketInfoList(java.util.List<TicketInfoList> ticketInfoList) {
                this.ticketInfoList = ticketInfoList;
                return this;
            }

            /**
             * train_info.
             */
            public Builder trainInfo(TrainInfo trainInfo) {
                this.trainInfo = trainInfo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
