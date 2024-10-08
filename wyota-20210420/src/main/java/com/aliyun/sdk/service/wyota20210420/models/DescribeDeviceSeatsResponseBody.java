// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDeviceSeatsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceSeatsResponseBody</p>
 */
public class DescribeDeviceSeatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDeviceSeatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceSeatsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDeviceSeatsResponseBody build() {
            return new DescribeDeviceSeatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeviceSeatsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceSeatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SeatCol")
        private Integer seatCol;

        @com.aliyun.core.annotation.NameInMap("SeatName")
        private String seatName;

        @com.aliyun.core.annotation.NameInMap("SeatNo")
        private String seatNo;

        @com.aliyun.core.annotation.NameInMap("SeatRow")
        private Integer seatRow;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        private String serialNo;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private String siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        private Data(Builder builder) {
            this.seatCol = builder.seatCol;
            this.seatName = builder.seatName;
            this.seatNo = builder.seatNo;
            this.seatRow = builder.seatRow;
            this.serialNo = builder.serialNo;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return seatCol
         */
        public Integer getSeatCol() {
            return this.seatCol;
        }

        /**
         * @return seatName
         */
        public String getSeatName() {
            return this.seatName;
        }

        /**
         * @return seatNo
         */
        public String getSeatNo() {
            return this.seatNo;
        }

        /**
         * @return seatRow
         */
        public Integer getSeatRow() {
            return this.seatRow;
        }

        /**
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        /**
         * @return siteId
         */
        public String getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        public static final class Builder {
            private Integer seatCol; 
            private String seatName; 
            private String seatNo; 
            private Integer seatRow; 
            private String serialNo; 
            private String siteId; 
            private String siteName; 

            /**
             * SeatCol.
             */
            public Builder seatCol(Integer seatCol) {
                this.seatCol = seatCol;
                return this;
            }

            /**
             * SeatName.
             */
            public Builder seatName(String seatName) {
                this.seatName = seatName;
                return this;
            }

            /**
             * SeatNo.
             */
            public Builder seatNo(String seatNo) {
                this.seatNo = seatNo;
                return this;
            }

            /**
             * SeatRow.
             */
            public Builder seatRow(Integer seatRow) {
                this.seatRow = seatRow;
                return this;
            }

            /**
             * SerialNo.
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
                return this;
            }

            /**
             * SiteId.
             */
            public Builder siteId(String siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * SiteName.
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
