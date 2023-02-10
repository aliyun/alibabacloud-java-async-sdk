// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainOrderQueryV2ResponseBody} extends {@link TeaModel}
 *
 * <p>TrainOrderQueryV2ResponseBody</p>
 */
public class TrainOrderQueryV2ResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private TrainOrderQueryV2ResponseBody(Builder builder) {
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

    public static TrainOrderQueryV2ResponseBody create() {
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
         * requestId
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainOrderQueryV2ResponseBody build() {
            return new TrainOrderQueryV2ResponseBody(this);
        } 

    } 

    public static class ChangeTicketInfoList extends TeaModel {
        @NameInMap("change_coach_no")
        private String changeCoachNo;

        @NameInMap("change_gap_fee")
        private Double changeGapFee;

        @NameInMap("change_handling_fee")
        private Double changeHandlingFee;

        @NameInMap("change_seat_no")
        private String changeSeatNo;

        @NameInMap("change_seat_type_name")
        private String changeSeatTypeName;

        @NameInMap("change_service_fee")
        private Double changeServiceFee;

        @NameInMap("change_train_no")
        private String changeTrainNo;

        @NameInMap("change_train_type_name")
        private String changeTrainTypeName;

        @NameInMap("check_in_time")
        private String checkInTime;

        @NameInMap("check_out_time")
        private String checkOutTime;

        @NameInMap("end_time")
        private String endTime;

        @NameInMap("from_city_name")
        private String fromCityName;

        @NameInMap("from_station_name")
        private String fromStationName;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("origin_ticket_no")
        private String originTicketNo;

        @NameInMap("out_ticket_status")
        private String outTicketStatus;

        @NameInMap("segment_index")
        private Integer segmentIndex;

        @NameInMap("start_time")
        private String startTime;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("to_city_name")
        private String toCityName;

        @NameInMap("to_station_name")
        private String toStationName;

        @NameInMap("use_ticket")
        private String useTicket;

        @NameInMap("user_id")
        private String userId;

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
            this.fromCityName = builder.fromCityName;
            this.fromStationName = builder.fromStationName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.originTicketNo = builder.originTicketNo;
            this.outTicketStatus = builder.outTicketStatus;
            this.segmentIndex = builder.segmentIndex;
            this.startTime = builder.startTime;
            this.ticketNo = builder.ticketNo;
            this.toCityName = builder.toCityName;
            this.toStationName = builder.toStationName;
            this.useTicket = builder.useTicket;
            this.userId = builder.userId;
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
         * @return fromCityName
         */
        public String getFromCityName() {
            return this.fromCityName;
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
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
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
         * @return toCityName
         */
        public String getToCityName() {
            return this.toCityName;
        }

        /**
         * @return toStationName
         */
        public String getToStationName() {
            return this.toStationName;
        }

        /**
         * @return useTicket
         */
        public String getUseTicket() {
            return this.useTicket;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
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
            private String fromCityName; 
            private String fromStationName; 
            private String gmtCreate; 
            private String gmtModify; 
            private String originTicketNo; 
            private String outTicketStatus; 
            private Integer segmentIndex; 
            private String startTime; 
            private String ticketNo; 
            private String toCityName; 
            private String toStationName; 
            private String useTicket; 
            private String userId; 

            /**
             * 改签车厢号
             */
            public Builder changeCoachNo(String changeCoachNo) {
                this.changeCoachNo = changeCoachNo;
                return this;
            }

            /**
             * 改签差价
             */
            public Builder changeGapFee(Double changeGapFee) {
                this.changeGapFee = changeGapFee;
                return this;
            }

            /**
             * 改签手续费
             */
            public Builder changeHandlingFee(Double changeHandlingFee) {
                this.changeHandlingFee = changeHandlingFee;
                return this;
            }

            /**
             * 改签座位号
             */
            public Builder changeSeatNo(String changeSeatNo) {
                this.changeSeatNo = changeSeatNo;
                return this;
            }

            /**
             * 改签车次类型
             */
            public Builder changeSeatTypeName(String changeSeatTypeName) {
                this.changeSeatTypeName = changeSeatTypeName;
                return this;
            }

            /**
             * 改签服务费
             */
            public Builder changeServiceFee(Double changeServiceFee) {
                this.changeServiceFee = changeServiceFee;
                return this;
            }

            /**
             * 改签车次
             */
            public Builder changeTrainNo(String changeTrainNo) {
                this.changeTrainNo = changeTrainNo;
                return this;
            }

            /**
             * 改签座位类型
             */
            public Builder changeTrainTypeName(String changeTrainTypeName) {
                this.changeTrainTypeName = changeTrainTypeName;
                return this;
            }

            /**
             * 进站时间
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * 出站时间
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
                return this;
            }

            /**
             * 改签票到达时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 出发城市名
             */
            public Builder fromCityName(String fromCityName) {
                this.fromCityName = fromCityName;
                return this;
            }

            /**
             * 改签出发站
             */
            public Builder fromStationName(String fromStationName) {
                this.fromStationName = fromStationName;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * 改签原票
             */
            public Builder originTicketNo(String originTicketNo) {
                this.originTicketNo = originTicketNo;
                return this;
            }

            /**
             * 12306票状态
             */
            public Builder outTicketStatus(String outTicketStatus) {
                this.outTicketStatus = outTicketStatus;
                return this;
            }

            /**
             * 第几程
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * 改签票启程时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 改签票号
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * 到达城市名
             */
            public Builder toCityName(String toCityName) {
                this.toCityName = toCityName;
                return this;
            }

            /**
             * 改签到达站
             */
            public Builder toStationName(String toStationName) {
                this.toStationName = toStationName;
                return this;
            }

            /**
             * 是否使用票
             */
            public Builder useTicket(String useTicket) {
                this.useTicket = useTicket;
                return this;
            }

            /**
             * 用户ID
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ChangeTicketInfoList build() {
                return new ChangeTicketInfoList(this);
            } 

        } 

    }
    public static class InvoiceInfo extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("title")
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

            /**
             * 发票id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 发票抬头
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
    public static class OrderBaseInfo extends TeaModel {
        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("btrip_title")
        private String btripTitle;

        @NameInMap("contact_name")
        private String contactName;

        @NameInMap("contact_phone")
        private String contactPhone;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("corp_name")
        private String corpName;

        @NameInMap("depart_id")
        private String departId;

        @NameInMap("depart_name")
        private String departName;

        @NameInMap("exceed_apply_id")
        private String exceedApplyId;

        @NameInMap("exceed_thirdpart_apply_id")
        private String exceedThirdpartApplyId;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @NameInMap("trip_type")
        private Integer tripType;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_nick")
        private String userNick;

        private OrderBaseInfo(Builder builder) {
            this.applyId = builder.applyId;
            this.btripTitle = builder.btripTitle;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.exceedApplyId = builder.exceedApplyId;
            this.exceedThirdpartApplyId = builder.exceedThirdpartApplyId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.itineraryId = builder.itineraryId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartDepartId = builder.thirdpartDepartId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.tripType = builder.tripType;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
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
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
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
         * @return exceedThirdpartApplyId
         */
        public String getExceedThirdpartApplyId() {
            return this.exceedThirdpartApplyId;
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
         * @return thirdpartDepartId
         */
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
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

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String applyId; 
            private String btripTitle; 
            private String contactName; 
            private String contactPhone; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private String exceedApplyId; 
            private String exceedThirdpartApplyId; 
            private String gmtCreate; 
            private String gmtModify; 
            private String itineraryId; 
            private Long orderId; 
            private Integer orderStatus; 
            private String thirdpartApplyId; 
            private String thirdpartDepartId; 
            private String thirdpartItineraryId; 
            private Integer tripType; 
            private String userId; 
            private String userNick; 

            /**
             * 申请单id
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * 申请单-出行事由
             */
            public Builder btripTitle(String btripTitle) {
                this.btripTitle = btripTitle;
                return this;
            }

            /**
             * 联系人姓名
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * 联系人电话
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * 企业id
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * 企业名称
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
             * 超标申请单id
             */
            public Builder exceedApplyId(String exceedApplyId) {
                this.exceedApplyId = exceedApplyId;
                return this;
            }

            /**
             * 三方超标申请单id
             */
            public Builder exceedThirdpartApplyId(String exceedThirdpartApplyId) {
                this.exceedThirdpartApplyId = exceedThirdpartApplyId;
                return this;
            }

            /**
             * 订单创建时间
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 订单更新时间
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * 行程单id
             */
            public Builder itineraryId(String itineraryId) {
                this.itineraryId = itineraryId;
                return this;
            }

            /**
             * 订单号
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * 订单状态
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * 三方申请单id
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * 第三方部门id
             */
            public Builder thirdpartDepartId(String thirdpartDepartId) {
                this.thirdpartDepartId = thirdpartDepartId;
                return this;
            }

            /**
             * 三方行程单id
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * 航程类型：0单程  1往返 2中转
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            /**
             * 下单人dingId
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 用户nick
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public OrderBaseInfo build() {
                return new OrderBaseInfo(this);
            } 

        } 

    }
    public static class PassengerInfoList extends TeaModel {
        @NameInMap("cost_center_id")
        private Long costCenterId;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_id")
        private Long projectId;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        @NameInMap("user_type")
        private Integer userType;

        private PassengerInfoList(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
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
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
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
            private String thirdpartCostCenterId; 
            private String thirdpartProjectId; 
            private String userId; 
            private String userName; 
            private Integer userType; 

            /**
             * 成本中心id
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * 成本中心名称
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * 成本中心编码
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
                return this;
            }

            /**
             * 项目编码
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * 项目id
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
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
             * 第三方成本中心id
             */
            public Builder thirdpartCostCenterId(String thirdpartCostCenterId) {
                this.thirdpartCostCenterId = thirdpartCostCenterId;
                return this;
            }

            /**
             * 三方项目id
             */
            public Builder thirdpartProjectId(String thirdpartProjectId) {
                this.thirdpartProjectId = thirdpartProjectId;
                return this;
            }

            /**
             * 出行人dingId
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 出行人姓名
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * 出行人类型 0:内部/1:外部
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
    public static class PriceInfoList extends TeaModel {
        @NameInMap("category_code")
        private Integer categoryCode;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("passenger_name")
        private String passengerName;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("price")
        private Double price;

        @NameInMap("trade_id")
        private String tradeId;

        @NameInMap("type")
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

            /**
             * 交易类目编码
             */
            public Builder categoryCode(Integer categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * 流水创建时间
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 乘机人
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * 结算方式:1：个人现付，2:企业现付,4:企业月结，8、企业预存
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * 交易金额
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * 交易流水号
             */
            public Builder tradeId(String tradeId) {
                this.tradeId = tradeId;
                return this;
            }

            /**
             * 资金流向,1:支出，2:收入
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
    public static class RefundTicketInfoList extends TeaModel {
        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("refund_fee")
        private Double refundFee;

        @NameInMap("refund_service_fee")
        private Double refundServiceFee;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("user_id")
        private String userId;

        private RefundTicketInfoList(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.refundFee = builder.refundFee;
            this.refundServiceFee = builder.refundServiceFee;
            this.ticketNo = builder.ticketNo;
            this.userId = builder.userId;
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

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModify; 
            private Double refundFee; 
            private Double refundServiceFee; 
            private String ticketNo; 
            private String userId; 

            /**
             * 创建时间
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * 退票金额
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * 退票手续费
             */
            public Builder refundServiceFee(Double refundServiceFee) {
                this.refundServiceFee = refundServiceFee;
                return this;
            }

            /**
             * 退票票号
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * 用户id
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RefundTicketInfoList build() {
                return new RefundTicketInfoList(this);
            } 

        } 

    }
    public static class TrainTicketInfos extends TeaModel {
        @NameInMap("changed")
        private Boolean changed;

        @NameInMap("check_in_time")
        private String checkInTime;

        @NameInMap("check_out_time")
        private String checkOutTime;

        @NameInMap("coach_no")
        private String coachNo;

        @NameInMap("end_time")
        private String endTime;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("out_ticket_status")
        private String outTicketStatus;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("seat_no")
        private String seatNo;

        @NameInMap("seat_type_name")
        private String seatTypeName;

        @NameInMap("segment_index")
        private Integer segmentIndex;

        @NameInMap("service_fee")
        private Double serviceFee;

        @NameInMap("start_time")
        private String startTime;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("ticket_price")
        private Double ticketPrice;

        @NameInMap("ticket_status")
        private Integer ticketStatus;

        @NameInMap("train_type_name")
        private String trainTypeName;

        @NameInMap("use_ticket")
        private String useTicket;

        @NameInMap("user_id")
        private String userId;

        private TrainTicketInfos(Builder builder) {
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
            this.segmentIndex = builder.segmentIndex;
            this.serviceFee = builder.serviceFee;
            this.startTime = builder.startTime;
            this.ticketNo = builder.ticketNo;
            this.ticketPrice = builder.ticketPrice;
            this.ticketStatus = builder.ticketStatus;
            this.trainTypeName = builder.trainTypeName;
            this.useTicket = builder.useTicket;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainTicketInfos create() {
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
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
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
         * @return useTicket
         */
        public String getUseTicket() {
            return this.useTicket;
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
            private Integer segmentIndex; 
            private Double serviceFee; 
            private String startTime; 
            private String ticketNo; 
            private Double ticketPrice; 
            private Integer ticketStatus; 
            private String trainTypeName; 
            private String useTicket; 
            private String userId; 

            /**
             * 是否改签
             */
            public Builder changed(Boolean changed) {
                this.changed = changed;
                return this;
            }

            /**
             * 进站时间
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * 出站时间
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
                return this;
            }

            /**
             * 车厢号
             */
            public Builder coachNo(String coachNo) {
                this.coachNo = coachNo;
                return this;
            }

            /**
             * 到达时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * 12306票状态
             */
            public Builder outTicketStatus(String outTicketStatus) {
                this.outTicketStatus = outTicketStatus;
                return this;
            }

            /**
             * 正票支付方式 1个人支付/2企业支付/3混付
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * 座位号
             */
            public Builder seatNo(String seatNo) {
                this.seatNo = seatNo;
                return this;
            }

            /**
             * 座位类型
             */
            public Builder seatTypeName(String seatTypeName) {
                this.seatTypeName = seatTypeName;
                return this;
            }

            /**
             * 第几程 从0开始
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * 预订服务费
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * 启程时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 票号
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * 票价
             */
            public Builder ticketPrice(Double ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * 票状态
             */
            public Builder ticketStatus(Integer ticketStatus) {
                this.ticketStatus = ticketStatus;
                return this;
            }

            /**
             * 车次类型
             */
            public Builder trainTypeName(String trainTypeName) {
                this.trainTypeName = trainTypeName;
                return this;
            }

            /**
             * 是否使用票
             */
            public Builder useTicket(String useTicket) {
                this.useTicket = useTicket;
                return this;
            }

            /**
             * 车票对应乘客dingId
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TrainTicketInfos build() {
                return new TrainTicketInfos(this);
            } 

        } 

    }
    public static class TrainInfoList extends TeaModel {
        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("from_city_name")
        private String fromCityName;

        @NameInMap("from_station_name")
        private String fromStationName;

        @NameInMap("item_id")
        private Long itemId;

        @NameInMap("run_time")
        private Long runTime;

        @NameInMap("to_city_name")
        private String toCityName;

        @NameInMap("to_station_name")
        private String toStationName;

        @NameInMap("train_no")
        private String trainNo;

        @NameInMap("train_ticket_infos")
        private java.util.List < TrainTicketInfos> trainTicketInfos;

        private TrainInfoList(Builder builder) {
            this.arrTime = builder.arrTime;
            this.depTime = builder.depTime;
            this.fromCityName = builder.fromCityName;
            this.fromStationName = builder.fromStationName;
            this.itemId = builder.itemId;
            this.runTime = builder.runTime;
            this.toCityName = builder.toCityName;
            this.toStationName = builder.toStationName;
            this.trainNo = builder.trainNo;
            this.trainTicketInfos = builder.trainTicketInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainInfoList create() {
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
         * @return fromCityName
         */
        public String getFromCityName() {
            return this.fromCityName;
        }

        /**
         * @return fromStationName
         */
        public String getFromStationName() {
            return this.fromStationName;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return runTime
         */
        public Long getRunTime() {
            return this.runTime;
        }

        /**
         * @return toCityName
         */
        public String getToCityName() {
            return this.toCityName;
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

        /**
         * @return trainTicketInfos
         */
        public java.util.List < TrainTicketInfos> getTrainTicketInfos() {
            return this.trainTicketInfos;
        }

        public static final class Builder {
            private String arrTime; 
            private String depTime; 
            private String fromCityName; 
            private String fromStationName; 
            private Long itemId; 
            private Long runTime; 
            private String toCityName; 
            private String toStationName; 
            private String trainNo; 
            private java.util.List < TrainTicketInfos> trainTicketInfos; 

            /**
             * 到站时间
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * 发车时间
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * 出发城市名
             */
            public Builder fromCityName(String fromCityName) {
                this.fromCityName = fromCityName;
                return this;
            }

            /**
             * 发车站名称
             */
            public Builder fromStationName(String fromStationName) {
                this.fromStationName = fromStationName;
                return this;
            }

            /**
             * itemId
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * 运行时长
             */
            public Builder runTime(Long runTime) {
                this.runTime = runTime;
                return this;
            }

            /**
             * 到达城市名
             */
            public Builder toCityName(String toCityName) {
                this.toCityName = toCityName;
                return this;
            }

            /**
             * 目的站名称
             */
            public Builder toStationName(String toStationName) {
                this.toStationName = toStationName;
                return this;
            }

            /**
             * 车次编号
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            /**
             * 票信息
             */
            public Builder trainTicketInfos(java.util.List < TrainTicketInfos> trainTicketInfos) {
                this.trainTicketInfos = trainTicketInfos;
                return this;
            }

            public TrainInfoList build() {
                return new TrainInfoList(this);
            } 

        } 

    }
    public static class TrainTransferInfo extends TeaModel {
        @NameInMap("cost_time")
        private String costTime;

        @NameInMap("end_time")
        private String endTime;

        @NameInMap("from_city_name")
        private String fromCityName;

        @NameInMap("from_station_name")
        private String fromStationName;

        @NameInMap("middle_city")
        private String middleCity;

        @NameInMap("middle_date")
        private String middleDate;

        @NameInMap("middle_station")
        private String middleStation;

        @NameInMap("middle_type")
        private String middleType;

        @NameInMap("start_time")
        private String startTime;

        @NameInMap("to_city_name")
        private String toCityName;

        @NameInMap("to_station_name")
        private String toStationName;

        @NameInMap("wait_time")
        private String waitTime;

        private TrainTransferInfo(Builder builder) {
            this.costTime = builder.costTime;
            this.endTime = builder.endTime;
            this.fromCityName = builder.fromCityName;
            this.fromStationName = builder.fromStationName;
            this.middleCity = builder.middleCity;
            this.middleDate = builder.middleDate;
            this.middleStation = builder.middleStation;
            this.middleType = builder.middleType;
            this.startTime = builder.startTime;
            this.toCityName = builder.toCityName;
            this.toStationName = builder.toStationName;
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainTransferInfo create() {
            return builder().build();
        }

        /**
         * @return costTime
         */
        public String getCostTime() {
            return this.costTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fromCityName
         */
        public String getFromCityName() {
            return this.fromCityName;
        }

        /**
         * @return fromStationName
         */
        public String getFromStationName() {
            return this.fromStationName;
        }

        /**
         * @return middleCity
         */
        public String getMiddleCity() {
            return this.middleCity;
        }

        /**
         * @return middleDate
         */
        public String getMiddleDate() {
            return this.middleDate;
        }

        /**
         * @return middleStation
         */
        public String getMiddleStation() {
            return this.middleStation;
        }

        /**
         * @return middleType
         */
        public String getMiddleType() {
            return this.middleType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return toCityName
         */
        public String getToCityName() {
            return this.toCityName;
        }

        /**
         * @return toStationName
         */
        public String getToStationName() {
            return this.toStationName;
        }

        /**
         * @return waitTime
         */
        public String getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private String costTime; 
            private String endTime; 
            private String fromCityName; 
            private String fromStationName; 
            private String middleCity; 
            private String middleDate; 
            private String middleStation; 
            private String middleType; 
            private String startTime; 
            private String toCityName; 
            private String toStationName; 
            private String waitTime; 

            /**
             * 历史总时长，分钟
             */
            public Builder costTime(String costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * 到达时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 出发城市名
             */
            public Builder fromCityName(String fromCityName) {
                this.fromCityName = fromCityName;
                return this;
            }

            /**
             * 出发站名
             */
            public Builder fromStationName(String fromStationName) {
                this.fromStationName = fromStationName;
                return this;
            }

            /**
             * 中转城市
             */
            public Builder middleCity(String middleCity) {
                this.middleCity = middleCity;
                return this;
            }

            /**
             * 中转日期
             */
            public Builder middleDate(String middleDate) {
                this.middleDate = middleDate;
                return this;
            }

            /**
             * 中转站
             */
            public Builder middleStation(String middleStation) {
                this.middleStation = middleStation;
                return this;
            }

            /**
             * 换乘模式  同城，异城，同站，异站，同车（掩码实现）
             */
            public Builder middleType(String middleType) {
                this.middleType = middleType;
                return this;
            }

            /**
             * 起始时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 到达城市名
             */
            public Builder toCityName(String toCityName) {
                this.toCityName = toCityName;
                return this;
            }

            /**
             * 到达站名
             */
            public Builder toStationName(String toStationName) {
                this.toStationName = toStationName;
                return this;
            }

            /**
             * 换乘时长
             */
            public Builder waitTime(String waitTime) {
                this.waitTime = waitTime;
                return this;
            }

            public TrainTransferInfo build() {
                return new TrainTransferInfo(this);
            } 

        } 

    }
    public static class TrainOrderInfo extends TeaModel {
        @NameInMap("train_info_list")
        private java.util.List < TrainInfoList> trainInfoList;

        @NameInMap("train_transfer_info")
        private TrainTransferInfo trainTransferInfo;

        private TrainOrderInfo(Builder builder) {
            this.trainInfoList = builder.trainInfoList;
            this.trainTransferInfo = builder.trainTransferInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainOrderInfo create() {
            return builder().build();
        }

        /**
         * @return trainInfoList
         */
        public java.util.List < TrainInfoList> getTrainInfoList() {
            return this.trainInfoList;
        }

        /**
         * @return trainTransferInfo
         */
        public TrainTransferInfo getTrainTransferInfo() {
            return this.trainTransferInfo;
        }

        public static final class Builder {
            private java.util.List < TrainInfoList> trainInfoList; 
            private TrainTransferInfo trainTransferInfo; 

            /**
             * 车次信息
             */
            public Builder trainInfoList(java.util.List < TrainInfoList> trainInfoList) {
                this.trainInfoList = trainInfoList;
                return this;
            }

            /**
             * 中转信息
             */
            public Builder trainTransferInfo(TrainTransferInfo trainTransferInfo) {
                this.trainTransferInfo = trainTransferInfo;
                return this;
            }

            public TrainOrderInfo build() {
                return new TrainOrderInfo(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("change_ticket_info_list")
        private java.util.List < ChangeTicketInfoList> changeTicketInfoList;

        @NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        private OrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_info_list")
        private java.util.List < PassengerInfoList> passengerInfoList;

        @NameInMap("price_info_list")
        private java.util.List < PriceInfoList> priceInfoList;

        @NameInMap("refund_ticket_info_list")
        private java.util.List < RefundTicketInfoList> refundTicketInfoList;

        @NameInMap("train_order_info")
        private TrainOrderInfo trainOrderInfo;

        private Module(Builder builder) {
            this.changeTicketInfoList = builder.changeTicketInfoList;
            this.invoiceInfo = builder.invoiceInfo;
            this.orderBaseInfo = builder.orderBaseInfo;
            this.passengerInfoList = builder.passengerInfoList;
            this.priceInfoList = builder.priceInfoList;
            this.refundTicketInfoList = builder.refundTicketInfoList;
            this.trainOrderInfo = builder.trainOrderInfo;
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
        public java.util.List < ChangeTicketInfoList> getChangeTicketInfoList() {
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
        public java.util.List < PassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List < PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        /**
         * @return refundTicketInfoList
         */
        public java.util.List < RefundTicketInfoList> getRefundTicketInfoList() {
            return this.refundTicketInfoList;
        }

        /**
         * @return trainOrderInfo
         */
        public TrainOrderInfo getTrainOrderInfo() {
            return this.trainOrderInfo;
        }

        public static final class Builder {
            private java.util.List < ChangeTicketInfoList> changeTicketInfoList; 
            private InvoiceInfo invoiceInfo; 
            private OrderBaseInfo orderBaseInfo; 
            private java.util.List < PassengerInfoList> passengerInfoList; 
            private java.util.List < PriceInfoList> priceInfoList; 
            private java.util.List < RefundTicketInfoList> refundTicketInfoList; 
            private TrainOrderInfo trainOrderInfo; 

            /**
             * change_ticket_info_list.
             */
            public Builder changeTicketInfoList(java.util.List < ChangeTicketInfoList> changeTicketInfoList) {
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
            public Builder passengerInfoList(java.util.List < PassengerInfoList> passengerInfoList) {
                this.passengerInfoList = passengerInfoList;
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
             * refund_ticket_info_list.
             */
            public Builder refundTicketInfoList(java.util.List < RefundTicketInfoList> refundTicketInfoList) {
                this.refundTicketInfoList = refundTicketInfoList;
                return this;
            }

            /**
             * train_order_info.
             */
            public Builder trainOrderInfo(TrainOrderInfo trainOrderInfo) {
                this.trainOrderInfo = trainOrderInfo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
