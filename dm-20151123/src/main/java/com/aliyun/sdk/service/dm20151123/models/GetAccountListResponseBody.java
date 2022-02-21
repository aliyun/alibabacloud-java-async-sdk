// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountListResponseBody</p>
 */
public class GetAccountListResponseBody extends TeaModel {
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

    private GetAccountListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountListResponseBody create() {
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

        public GetAccountListResponseBody build() {
            return new GetAccountListResponseBody(this);
        } 

    } 

    public static class AccountNotificationInfo extends TeaModel {
        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private AccountNotificationInfo(Builder builder) {
            this.region = builder.region;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountNotificationInfo create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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

            public AccountNotificationInfo build() {
                return new AccountNotificationInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("accountNotificationInfo")
        private java.util.List < AccountNotificationInfo> accountNotificationInfo;

        private Data(Builder builder) {
            this.accountNotificationInfo = builder.accountNotificationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountNotificationInfo
         */
        public java.util.List < AccountNotificationInfo> getAccountNotificationInfo() {
            return this.accountNotificationInfo;
        }

        public static final class Builder {
            private java.util.List < AccountNotificationInfo> accountNotificationInfo; 

            /**
             * accountNotificationInfo.
             */
            public Builder accountNotificationInfo(java.util.List < AccountNotificationInfo> accountNotificationInfo) {
                this.accountNotificationInfo = accountNotificationInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
