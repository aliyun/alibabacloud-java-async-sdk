// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMovieSeatsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMovieSeatsResponseBody</p>
 */
public class QueryMovieSeatsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SeatMap")
    private SeatMap seatMap;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    private QueryMovieSeatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.seatMap = builder.seatMap;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMovieSeatsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return seatMap
     */
    public SeatMap getSeatMap() {
        return this.seatMap;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private String requestId; 
        private SeatMap seatMap; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SeatMap.
         */
        public Builder seatMap(SeatMap seatMap) {
            this.seatMap = seatMap;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMovieSeatsResponseBody build() {
            return new QueryMovieSeatsResponseBody(this);
        } 

    } 

    public static class Seat extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("Column")
        private Long column;

        @NameInMap("ExtId")
        private String extId;

        @NameInMap("Flag")
        private Long flag;

        @NameInMap("LeftPx")
        private Long leftPx;

        @NameInMap("Name")
        private String name;

        @NameInMap("Row")
        private Long row;

        @NameInMap("RowName")
        private String rowName;

        @NameInMap("Status")
        private Long status;

        @NameInMap("TopPx")
        private Long topPx;

        private Seat(Builder builder) {
            this.area = builder.area;
            this.column = builder.column;
            this.extId = builder.extId;
            this.flag = builder.flag;
            this.leftPx = builder.leftPx;
            this.name = builder.name;
            this.row = builder.row;
            this.rowName = builder.rowName;
            this.status = builder.status;
            this.topPx = builder.topPx;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Seat create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return column
         */
        public Long getColumn() {
            return this.column;
        }

        /**
         * @return extId
         */
        public String getExtId() {
            return this.extId;
        }

        /**
         * @return flag
         */
        public Long getFlag() {
            return this.flag;
        }

        /**
         * @return leftPx
         */
        public Long getLeftPx() {
            return this.leftPx;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return row
         */
        public Long getRow() {
            return this.row;
        }

        /**
         * @return rowName
         */
        public String getRowName() {
            return this.rowName;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return topPx
         */
        public Long getTopPx() {
            return this.topPx;
        }

        public static final class Builder {
            private String area; 
            private Long column; 
            private String extId; 
            private Long flag; 
            private Long leftPx; 
            private String name; 
            private Long row; 
            private String rowName; 
            private Long status; 
            private Long topPx; 

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * Column.
             */
            public Builder column(Long column) {
                this.column = column;
                return this;
            }

            /**
             * ExtId.
             */
            public Builder extId(String extId) {
                this.extId = extId;
                return this;
            }

            /**
             * Flag.
             */
            public Builder flag(Long flag) {
                this.flag = flag;
                return this;
            }

            /**
             * LeftPx.
             */
            public Builder leftPx(Long leftPx) {
                this.leftPx = leftPx;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Row.
             */
            public Builder row(Long row) {
                this.row = row;
                return this;
            }

            /**
             * RowName.
             */
            public Builder rowName(String rowName) {
                this.rowName = rowName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * TopPx.
             */
            public Builder topPx(Long topPx) {
                this.topPx = topPx;
                return this;
            }

            public Seat build() {
                return new Seat(this);
            } 

        } 

    }
    public static class Seats extends TeaModel {
        @NameInMap("Seat")
        private java.util.List < Seat> seat;

        private Seats(Builder builder) {
            this.seat = builder.seat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Seats create() {
            return builder().build();
        }

        /**
         * @return seat
         */
        public java.util.List < Seat> getSeat() {
            return this.seat;
        }

        public static final class Builder {
            private java.util.List < Seat> seat; 

            /**
             * Seat.
             */
            public Builder seat(java.util.List < Seat> seat) {
                this.seat = seat;
                return this;
            }

            public Seats build() {
                return new Seats(this);
            } 

        } 

    }
    public static class SeatMap extends TeaModel {
        @NameInMap("MaxCanBuy")
        private Long maxCanBuy;

        @NameInMap("MaxColumn")
        private Long maxColumn;

        @NameInMap("MaxLeftPx")
        private Long maxLeftPx;

        @NameInMap("MaxRow")
        private Long maxRow;

        @NameInMap("MaxTopPx")
        private Long maxTopPx;

        @NameInMap("MinColumn")
        private Long minColumn;

        @NameInMap("MinLeftPx")
        private Long minLeftPx;

        @NameInMap("MinRow")
        private Long minRow;

        @NameInMap("MinTopPx")
        private Long minTopPx;

        @NameInMap("Notice")
        private String notice;

        @NameInMap("Regular")
        private Boolean regular;

        @NameInMap("SeatCount")
        private Long seatCount;

        @NameInMap("Seats")
        private Seats seats;

        @NameInMap("SoldCount")
        private Long soldCount;

        @NameInMap("TipMessage")
        private String tipMessage;

        private SeatMap(Builder builder) {
            this.maxCanBuy = builder.maxCanBuy;
            this.maxColumn = builder.maxColumn;
            this.maxLeftPx = builder.maxLeftPx;
            this.maxRow = builder.maxRow;
            this.maxTopPx = builder.maxTopPx;
            this.minColumn = builder.minColumn;
            this.minLeftPx = builder.minLeftPx;
            this.minRow = builder.minRow;
            this.minTopPx = builder.minTopPx;
            this.notice = builder.notice;
            this.regular = builder.regular;
            this.seatCount = builder.seatCount;
            this.seats = builder.seats;
            this.soldCount = builder.soldCount;
            this.tipMessage = builder.tipMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeatMap create() {
            return builder().build();
        }

        /**
         * @return maxCanBuy
         */
        public Long getMaxCanBuy() {
            return this.maxCanBuy;
        }

        /**
         * @return maxColumn
         */
        public Long getMaxColumn() {
            return this.maxColumn;
        }

        /**
         * @return maxLeftPx
         */
        public Long getMaxLeftPx() {
            return this.maxLeftPx;
        }

        /**
         * @return maxRow
         */
        public Long getMaxRow() {
            return this.maxRow;
        }

        /**
         * @return maxTopPx
         */
        public Long getMaxTopPx() {
            return this.maxTopPx;
        }

        /**
         * @return minColumn
         */
        public Long getMinColumn() {
            return this.minColumn;
        }

        /**
         * @return minLeftPx
         */
        public Long getMinLeftPx() {
            return this.minLeftPx;
        }

        /**
         * @return minRow
         */
        public Long getMinRow() {
            return this.minRow;
        }

        /**
         * @return minTopPx
         */
        public Long getMinTopPx() {
            return this.minTopPx;
        }

        /**
         * @return notice
         */
        public String getNotice() {
            return this.notice;
        }

        /**
         * @return regular
         */
        public Boolean getRegular() {
            return this.regular;
        }

        /**
         * @return seatCount
         */
        public Long getSeatCount() {
            return this.seatCount;
        }

        /**
         * @return seats
         */
        public Seats getSeats() {
            return this.seats;
        }

        /**
         * @return soldCount
         */
        public Long getSoldCount() {
            return this.soldCount;
        }

        /**
         * @return tipMessage
         */
        public String getTipMessage() {
            return this.tipMessage;
        }

        public static final class Builder {
            private Long maxCanBuy; 
            private Long maxColumn; 
            private Long maxLeftPx; 
            private Long maxRow; 
            private Long maxTopPx; 
            private Long minColumn; 
            private Long minLeftPx; 
            private Long minRow; 
            private Long minTopPx; 
            private String notice; 
            private Boolean regular; 
            private Long seatCount; 
            private Seats seats; 
            private Long soldCount; 
            private String tipMessage; 

            /**
             * MaxCanBuy.
             */
            public Builder maxCanBuy(Long maxCanBuy) {
                this.maxCanBuy = maxCanBuy;
                return this;
            }

            /**
             * MaxColumn.
             */
            public Builder maxColumn(Long maxColumn) {
                this.maxColumn = maxColumn;
                return this;
            }

            /**
             * MaxLeftPx.
             */
            public Builder maxLeftPx(Long maxLeftPx) {
                this.maxLeftPx = maxLeftPx;
                return this;
            }

            /**
             * MaxRow.
             */
            public Builder maxRow(Long maxRow) {
                this.maxRow = maxRow;
                return this;
            }

            /**
             * MaxTopPx.
             */
            public Builder maxTopPx(Long maxTopPx) {
                this.maxTopPx = maxTopPx;
                return this;
            }

            /**
             * MinColumn.
             */
            public Builder minColumn(Long minColumn) {
                this.minColumn = minColumn;
                return this;
            }

            /**
             * MinLeftPx.
             */
            public Builder minLeftPx(Long minLeftPx) {
                this.minLeftPx = minLeftPx;
                return this;
            }

            /**
             * MinRow.
             */
            public Builder minRow(Long minRow) {
                this.minRow = minRow;
                return this;
            }

            /**
             * MinTopPx.
             */
            public Builder minTopPx(Long minTopPx) {
                this.minTopPx = minTopPx;
                return this;
            }

            /**
             * Notice.
             */
            public Builder notice(String notice) {
                this.notice = notice;
                return this;
            }

            /**
             * Regular.
             */
            public Builder regular(Boolean regular) {
                this.regular = regular;
                return this;
            }

            /**
             * SeatCount.
             */
            public Builder seatCount(Long seatCount) {
                this.seatCount = seatCount;
                return this;
            }

            /**
             * Seats.
             */
            public Builder seats(Seats seats) {
                this.seats = seats;
                return this;
            }

            /**
             * SoldCount.
             */
            public Builder soldCount(Long soldCount) {
                this.soldCount = soldCount;
                return this;
            }

            /**
             * TipMessage.
             */
            public Builder tipMessage(String tipMessage) {
                this.tipMessage = tipMessage;
                return this;
            }

            public SeatMap build() {
                return new SeatMap(this);
            } 

        } 

    }
}
