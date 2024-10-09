// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBdrcServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetBdrcServiceResponseBody</p>
 */
public class GetBdrcServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBdrcServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBdrcServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBdrcServiceResponseBody build() {
            return new GetBdrcServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBdrcServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetBdrcServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpenTime")
        private Long openTime;

        @com.aliyun.core.annotation.NameInMap("ProtectionScoreUpdatedTime")
        private Long protectionScoreUpdatedTime;

        @com.aliyun.core.annotation.NameInMap("ServiceInitializeStatus")
        private String serviceInitializeStatus;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        private Data(Builder builder) {
            this.openTime = builder.openTime;
            this.protectionScoreUpdatedTime = builder.protectionScoreUpdatedTime;
            this.serviceInitializeStatus = builder.serviceInitializeStatus;
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return openTime
         */
        public Long getOpenTime() {
            return this.openTime;
        }

        /**
         * @return protectionScoreUpdatedTime
         */
        public Long getProtectionScoreUpdatedTime() {
            return this.protectionScoreUpdatedTime;
        }

        /**
         * @return serviceInitializeStatus
         */
        public String getServiceInitializeStatus() {
            return this.serviceInitializeStatus;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private Long openTime; 
            private Long protectionScoreUpdatedTime; 
            private String serviceInitializeStatus; 
            private String serviceStatus; 

            /**
             * OpenTime.
             */
            public Builder openTime(Long openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * ProtectionScoreUpdatedTime.
             */
            public Builder protectionScoreUpdatedTime(Long protectionScoreUpdatedTime) {
                this.protectionScoreUpdatedTime = protectionScoreUpdatedTime;
                return this;
            }

            /**
             * ServiceInitializeStatus.
             */
            public Builder serviceInitializeStatus(String serviceInitializeStatus) {
                this.serviceInitializeStatus = serviceInitializeStatus;
                return this;
            }

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
