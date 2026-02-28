// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GetSpeechLicenseDeviceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpeechLicenseDeviceStatisticsResponseBody</p>
 */
public class GetSpeechLicenseDeviceStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetSpeechLicenseDeviceStatisticsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal error occurred. Try again later.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AF71BF1D-B552-47CD-B34B-352557627992</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSpeechLicenseDeviceStatisticsResponseBody build() {
            return new GetSpeechLicenseDeviceStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSpeechLicenseDeviceStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSpeechLicenseDeviceStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableQuota")
        private Integer availableQuota;

        @com.aliyun.core.annotation.NameInMap("ExpiredQuota")
        private Integer expiredQuota;

        @com.aliyun.core.annotation.NameInMap("ExpiringQuota")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.availableQuota = model.availableQuota;
                this.expiredQuota = model.expiredQuota;
                this.expiringQuota = model.expiringQuota;
            } 

            /**
             * <p>The number of available licenses.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder availableQuota(Integer availableQuota) {
                this.availableQuota = availableQuota;
                return this;
            }

            /**
             * <p>The number of expired licenses.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder expiredQuota(Integer expiredQuota) {
                this.expiredQuota = expiredQuota;
                return this;
            }

            /**
             * <p>The number of licenses that are about to expire.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
