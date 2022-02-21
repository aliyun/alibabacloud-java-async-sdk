// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSenderAddressListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSenderAddressListResponseBody</p>
 */
public class GetSenderAddressListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    @NameInMap("data")
    private Data data;

    private GetSenderAddressListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSenderAddressListResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 
        private Data data; 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GetSenderAddressListResponseBody build() {
            return new GetSenderAddressListResponseBody(this);
        } 

    } 

    public static class SenderAddressNotificationInfo extends TeaModel {
        @NameInMap("Region")
        private String region;

        @NameInMap("SenderAddress")
        private String senderAddress;

        @NameInMap("SenderAddressId")
        private String senderAddressId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private SenderAddressNotificationInfo(Builder builder) {
            this.region = builder.region;
            this.senderAddress = builder.senderAddress;
            this.senderAddressId = builder.senderAddressId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SenderAddressNotificationInfo create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return senderAddress
         */
        public String getSenderAddress() {
            return this.senderAddress;
        }

        /**
         * @return senderAddressId
         */
        public String getSenderAddressId() {
            return this.senderAddressId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String region; 
            private String senderAddress; 
            private String senderAddressId; 
            private String status; 
            private String updateTime; 

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SenderAddress.
             */
            public Builder senderAddress(String senderAddress) {
                this.senderAddress = senderAddress;
                return this;
            }

            /**
             * SenderAddressId.
             */
            public Builder senderAddressId(String senderAddressId) {
                this.senderAddressId = senderAddressId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SenderAddressNotificationInfo build() {
                return new SenderAddressNotificationInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("senderAddressNotificationInfo")
        private java.util.List < SenderAddressNotificationInfo> senderAddressNotificationInfo;

        private Data(Builder builder) {
            this.senderAddressNotificationInfo = builder.senderAddressNotificationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return senderAddressNotificationInfo
         */
        public java.util.List < SenderAddressNotificationInfo> getSenderAddressNotificationInfo() {
            return this.senderAddressNotificationInfo;
        }

        public static final class Builder {
            private java.util.List < SenderAddressNotificationInfo> senderAddressNotificationInfo; 

            /**
             * senderAddressNotificationInfo.
             */
            public Builder senderAddressNotificationInfo(java.util.List < SenderAddressNotificationInfo> senderAddressNotificationInfo) {
                this.senderAddressNotificationInfo = senderAddressNotificationInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
