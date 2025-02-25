// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.superappnlp20240930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NlpAddressNormalizationResponseBody} extends {@link TeaModel}
 *
 * <p>NlpAddressNormalizationResponseBody</p>
 */
public class NlpAddressNormalizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    private NlpAddressNormalizationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NlpAddressNormalizationResponseBody create() {
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
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String result; 
        private Boolean success; 
        private String timestamp; 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>99540D1A-9112-56E5-8DCC-1A2603F4C500</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
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
         * Timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public NlpAddressNormalizationResponseBody build() {
            return new NlpAddressNormalizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link NlpAddressNormalizationResponseBody} extends {@link TeaModel}
     *
     * <p>NlpAddressNormalizationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityStd")
        private String cityStd;

        @com.aliyun.core.annotation.NameInMap("DistrictStd")
        private String districtStd;

        @com.aliyun.core.annotation.NameInMap("ProvinceStd")
        private String provinceStd;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List < String > results;

        @com.aliyun.core.annotation.NameInMap("StatusEs")
        private String statusEs;

        private Data(Builder builder) {
            this.cityStd = builder.cityStd;
            this.districtStd = builder.districtStd;
            this.provinceStd = builder.provinceStd;
            this.results = builder.results;
            this.statusEs = builder.statusEs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cityStd
         */
        public String getCityStd() {
            return this.cityStd;
        }

        /**
         * @return districtStd
         */
        public String getDistrictStd() {
            return this.districtStd;
        }

        /**
         * @return provinceStd
         */
        public String getProvinceStd() {
            return this.provinceStd;
        }

        /**
         * @return results
         */
        public java.util.List < String > getResults() {
            return this.results;
        }

        /**
         * @return statusEs
         */
        public String getStatusEs() {
            return this.statusEs;
        }

        public static final class Builder {
            private String cityStd; 
            private String districtStd; 
            private String provinceStd; 
            private java.util.List < String > results; 
            private String statusEs; 

            /**
             * CityStd.
             */
            public Builder cityStd(String cityStd) {
                this.cityStd = cityStd;
                return this;
            }

            /**
             * DistrictStd.
             */
            public Builder districtStd(String districtStd) {
                this.districtStd = districtStd;
                return this;
            }

            /**
             * ProvinceStd.
             */
            public Builder provinceStd(String provinceStd) {
                this.provinceStd = provinceStd;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List < String > results) {
                this.results = results;
                return this;
            }

            /**
             * StatusEs.
             */
            public Builder statusEs(String statusEs) {
                this.statusEs = statusEs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
