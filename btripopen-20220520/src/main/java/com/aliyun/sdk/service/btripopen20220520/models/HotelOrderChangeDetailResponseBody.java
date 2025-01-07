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
 * {@link HotelOrderChangeDetailResponseBody} extends {@link TeaModel}
 *
 * <p>HotelOrderChangeDetailResponseBody</p>
 */
public class HotelOrderChangeDetailResponseBody extends TeaModel {
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

    private HotelOrderChangeDetailResponseBody(Builder builder) {
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

    public static HotelOrderChangeDetailResponseBody create() {
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

        public HotelOrderChangeDetailResponseBody build() {
            return new HotelOrderChangeDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelOrderChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderChangeDetailResponseBody</p>
     */
    public static class RoomDailyRefundInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("check_in_date")
        private String checkInDate;

        @com.aliyun.core.annotation.NameInMap("penalty_price")
        private Long penaltyPrice;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("refund_price")
        private Long refundPrice;

        private RoomDailyRefundInfos(Builder builder) {
            this.checkInDate = builder.checkInDate;
            this.penaltyPrice = builder.penaltyPrice;
            this.price = builder.price;
            this.refundPrice = builder.refundPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomDailyRefundInfos create() {
            return builder().build();
        }

        /**
         * @return checkInDate
         */
        public String getCheckInDate() {
            return this.checkInDate;
        }

        /**
         * @return penaltyPrice
         */
        public Long getPenaltyPrice() {
            return this.penaltyPrice;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return refundPrice
         */
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        public static final class Builder {
            private String checkInDate; 
            private Long penaltyPrice; 
            private Long price; 
            private Long refundPrice; 

            /**
             * check_in_date.
             */
            public Builder checkInDate(String checkInDate) {
                this.checkInDate = checkInDate;
                return this;
            }

            /**
             * penalty_price.
             */
            public Builder penaltyPrice(Long penaltyPrice) {
                this.penaltyPrice = penaltyPrice;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * refund_price.
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            public RoomDailyRefundInfos build() {
                return new RoomDailyRefundInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderChangeDetailResponseBody</p>
     */
    public static class RoomInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_date")
        private java.util.List<String> cancelDate;

        @com.aliyun.core.annotation.NameInMap("room_daily_refund_infos")
        private java.util.List<RoomDailyRefundInfos> roomDailyRefundInfos;

        @com.aliyun.core.annotation.NameInMap("room_no")
        private Integer roomNo;

        private RoomInfoList(Builder builder) {
            this.cancelDate = builder.cancelDate;
            this.roomDailyRefundInfos = builder.roomDailyRefundInfos;
            this.roomNo = builder.roomNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomInfoList create() {
            return builder().build();
        }

        /**
         * @return cancelDate
         */
        public java.util.List<String> getCancelDate() {
            return this.cancelDate;
        }

        /**
         * @return roomDailyRefundInfos
         */
        public java.util.List<RoomDailyRefundInfos> getRoomDailyRefundInfos() {
            return this.roomDailyRefundInfos;
        }

        /**
         * @return roomNo
         */
        public Integer getRoomNo() {
            return this.roomNo;
        }

        public static final class Builder {
            private java.util.List<String> cancelDate; 
            private java.util.List<RoomDailyRefundInfos> roomDailyRefundInfos; 
            private Integer roomNo; 

            /**
             * cancel_date.
             */
            public Builder cancelDate(java.util.List<String> cancelDate) {
                this.cancelDate = cancelDate;
                return this;
            }

            /**
             * room_daily_refund_infos.
             */
            public Builder roomDailyRefundInfos(java.util.List<RoomDailyRefundInfos> roomDailyRefundInfos) {
                this.roomDailyRefundInfos = roomDailyRefundInfos;
                return this;
            }

            /**
             * room_no.
             */
            public Builder roomNo(Integer roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            public RoomInfoList build() {
                return new RoomInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderChangeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderChangeDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_order_id")
        private String changeOrderId;

        @com.aliyun.core.annotation.NameInMap("change_type")
        private Integer changeType;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("dis_order_id")
        private String disOrderId;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("room_info_list")
        private java.util.List<RoomInfoList> roomInfoList;

        @com.aliyun.core.annotation.NameInMap("sale_order_id")
        private String saleOrderId;

        @com.aliyun.core.annotation.NameInMap("source")
        private Integer source;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("work_order_id")
        private String workOrderId;

        private Module(Builder builder) {
            this.changeOrderId = builder.changeOrderId;
            this.changeType = builder.changeType;
            this.corpId = builder.corpId;
            this.disOrderId = builder.disOrderId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.reason = builder.reason;
            this.remarks = builder.remarks;
            this.roomInfoList = builder.roomInfoList;
            this.saleOrderId = builder.saleOrderId;
            this.source = builder.source;
            this.status = builder.status;
            this.workOrderId = builder.workOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return changeOrderId
         */
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        /**
         * @return changeType
         */
        public Integer getChangeType() {
            return this.changeType;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return disOrderId
         */
        public String getDisOrderId() {
            return this.disOrderId;
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return roomInfoList
         */
        public java.util.List<RoomInfoList> getRoomInfoList() {
            return this.roomInfoList;
        }

        /**
         * @return saleOrderId
         */
        public String getSaleOrderId() {
            return this.saleOrderId;
        }

        /**
         * @return source
         */
        public Integer getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return workOrderId
         */
        public String getWorkOrderId() {
            return this.workOrderId;
        }

        public static final class Builder {
            private String changeOrderId; 
            private Integer changeType; 
            private String corpId; 
            private String disOrderId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String reason; 
            private String remarks; 
            private java.util.List<RoomInfoList> roomInfoList; 
            private String saleOrderId; 
            private Integer source; 
            private Integer status; 
            private String workOrderId; 

            /**
             * change_order_id.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * change_type.
             */
            public Builder changeType(Integer changeType) {
                this.changeType = changeType;
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
             * dis_order_id.
             */
            public Builder disOrderId(String disOrderId) {
                this.disOrderId = disOrderId;
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
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * room_info_list.
             */
            public Builder roomInfoList(java.util.List<RoomInfoList> roomInfoList) {
                this.roomInfoList = roomInfoList;
                return this;
            }

            /**
             * sale_order_id.
             */
            public Builder saleOrderId(String saleOrderId) {
                this.saleOrderId = saleOrderId;
                return this;
            }

            /**
             * source.
             */
            public Builder source(Integer source) {
                this.source = source;
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
             * work_order_id.
             */
            public Builder workOrderId(String workOrderId) {
                this.workOrderId = workOrderId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
