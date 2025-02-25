// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link QueryTicketListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTicketListResponseBody</p>
 */
public class QueryTicketListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryTicketListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTicketListResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryTicketListResponseBody build() {
            return new QueryTicketListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTicketListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTicketListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceAlias")
        private String deviceAlias;

        @com.aliyun.core.annotation.NameInMap("DeviceSn")
        private String deviceSn;

        @com.aliyun.core.annotation.NameInMap("ShopId")
        private String shopId;

        @com.aliyun.core.annotation.NameInMap("ShopName")
        private String shopName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubmitDate")
        private Long submitDate;

        @com.aliyun.core.annotation.NameInMap("TicketId")
        private String ticketId;

        @com.aliyun.core.annotation.NameInMap("TicketType")
        private String ticketType;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private Long updateDate;

        private Data(Builder builder) {
            this.deviceAlias = builder.deviceAlias;
            this.deviceSn = builder.deviceSn;
            this.shopId = builder.shopId;
            this.shopName = builder.shopName;
            this.status = builder.status;
            this.submitDate = builder.submitDate;
            this.ticketId = builder.ticketId;
            this.ticketType = builder.ticketType;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceAlias
         */
        public String getDeviceAlias() {
            return this.deviceAlias;
        }

        /**
         * @return deviceSn
         */
        public String getDeviceSn() {
            return this.deviceSn;
        }

        /**
         * @return shopId
         */
        public String getShopId() {
            return this.shopId;
        }

        /**
         * @return shopName
         */
        public String getShopName() {
            return this.shopName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return submitDate
         */
        public Long getSubmitDate() {
            return this.submitDate;
        }

        /**
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
        }

        /**
         * @return ticketType
         */
        public String getTicketType() {
            return this.ticketType;
        }

        /**
         * @return updateDate
         */
        public Long getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String deviceAlias; 
            private String deviceSn; 
            private String shopId; 
            private String shopName; 
            private Integer status; 
            private Long submitDate; 
            private String ticketId; 
            private String ticketType; 
            private Long updateDate; 

            /**
             * DeviceAlias.
             */
            public Builder deviceAlias(String deviceAlias) {
                this.deviceAlias = deviceAlias;
                return this;
            }

            /**
             * DeviceSn.
             */
            public Builder deviceSn(String deviceSn) {
                this.deviceSn = deviceSn;
                return this;
            }

            /**
             * ShopId.
             */
            public Builder shopId(String shopId) {
                this.shopId = shopId;
                return this;
            }

            /**
             * ShopName.
             */
            public Builder shopName(String shopName) {
                this.shopName = shopName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SubmitDate.
             */
            public Builder submitDate(Long submitDate) {
                this.submitDate = submitDate;
                return this;
            }

            /**
             * TicketId.
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            /**
             * TicketType.
             */
            public Builder ticketType(String ticketType) {
                this.ticketType = ticketType;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(Long updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
