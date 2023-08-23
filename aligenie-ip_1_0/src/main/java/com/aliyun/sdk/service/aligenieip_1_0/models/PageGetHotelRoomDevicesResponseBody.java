// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageGetHotelRoomDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>PageGetHotelRoomDevicesResponseBody</p>
 */
public class PageGetHotelRoomDevicesResponseBody extends TeaModel {
    @NameInMap("Extentions")
    private java.util.Map < String, ? > extentions;

    @NameInMap("Message")
    private String message;

    @NameInMap("Page")
    private Page page;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private PageGetHotelRoomDevicesResponseBody(Builder builder) {
        this.extentions = builder.extentions;
        this.message = builder.message;
        this.page = builder.page;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageGetHotelRoomDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return extentions
     */
    public java.util.Map < String, ? > getExtentions() {
        return this.extentions;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private java.util.Map < String, ? > extentions; 
        private String message; 
        private Page page; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer statusCode; 

        /**
         * Extentions.
         */
        public Builder extentions(java.util.Map < String, ? > extentions) {
            this.extentions = extentions;
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
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public PageGetHotelRoomDevicesResponseBody build() {
            return new PageGetHotelRoomDevicesResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("End")
        private Integer end;

        @NameInMap("HasNext")
        private Boolean hasNext;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Start")
        private Integer start;

        @NameInMap("Total")
        private Integer total;

        @NameInMap("TotalPage")
        private Integer totalPage;

        private Page(Builder builder) {
            this.end = builder.end;
            this.hasNext = builder.hasNext;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.start = builder.start;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer end; 
            private Boolean hasNext; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer start; 
            private Integer total; 
            private Integer totalPage; 

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * HasNext.
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Integer start) {
                this.start = start;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @NameInMap("HotelId")
        private String hotelId;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("OnlineStatus")
        private Integer onlineStatus;

        @NameInMap("RoomNo")
        private String roomNo;

        @NameInMap("Sn")
        private String sn;

        private Result(Builder builder) {
            this.firmwareVersion = builder.firmwareVersion;
            this.hotelId = builder.hotelId;
            this.mac = builder.mac;
            this.onlineStatus = builder.onlineStatus;
            this.roomNo = builder.roomNo;
            this.sn = builder.sn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return onlineStatus
         */
        public Integer getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        public static final class Builder {
            private String firmwareVersion; 
            private String hotelId; 
            private String mac; 
            private Integer onlineStatus; 
            private String roomNo; 
            private String sn; 

            /**
             * FirmwareVersion.
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(Integer onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
