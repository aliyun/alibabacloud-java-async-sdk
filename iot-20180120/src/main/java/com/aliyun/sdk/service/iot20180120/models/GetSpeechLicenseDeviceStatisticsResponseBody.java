// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpeechLicenseDeviceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpeechLicenseDeviceStatisticsResponseBody</p>
 */
public class GetSpeechLicenseDeviceStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSpeechLicenseDeviceStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpeechLicenseDeviceStatisticsResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetSpeechLicenseDeviceStatisticsResponseBody build() {
            return new GetSpeechLicenseDeviceStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AvailableQuota")
        private Integer availableQuota;

        @NameInMap("ExpiredQuota")
        private Integer expiredQuota;

        @NameInMap("ExpiringQuota")
        private Integer expiringQuota;

        private Data(Builder builder) {
            this.availableQuota = builder.availableQuota;
            this.expiredQuota = builder.expiredQuota;
            this.expiringQuota = builder.expiringQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availableQuota
         */
        public Integer getAvailableQuota() {
            return this.availableQuota;
        }

        /**
         * @return expiredQuota
         */
        public Integer getExpiredQuota() {
            return this.expiredQuota;
        }

        /**
         * @return expiringQuota
         */
        public Integer getExpiringQuota() {
            return this.expiringQuota;
        }

        public static final class Builder {
            private Integer availableQuota; 
            private Integer expiredQuota; 
            private Integer expiringQuota; 

            /**
             * AvailableQuota.
             */
            public Builder availableQuota(Integer availableQuota) {
                this.availableQuota = availableQuota;
                return this;
            }

            /**
             * ExpiredQuota.
             */
            public Builder expiredQuota(Integer expiredQuota) {
                this.expiredQuota = expiredQuota;
                return this;
            }

            /**
             * ExpiringQuota.
             */
            public Builder expiringQuota(Integer expiringQuota) {
                this.expiringQuota = expiringQuota;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
