// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserConfigResponseBody</p>
 */
public class GetUserConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountSufficient")
    private Boolean accountSufficient;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EnableEciDisk")
    private Boolean enableEciDisk;

    @com.aliyun.core.annotation.NameInMap("FreeTier")
    private FreeTier freeTier;

    @com.aliyun.core.annotation.NameInMap("FreeTierSpecAvailable")
    private Boolean freeTierSpecAvailable;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUserConfigResponseBody(Builder builder) {
        this.accountSufficient = builder.accountSufficient;
        this.code = builder.code;
        this.enableEciDisk = builder.enableEciDisk;
        this.freeTier = builder.freeTier;
        this.freeTierSpecAvailable = builder.freeTierSpecAvailable;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountSufficient
     */
    public Boolean getAccountSufficient() {
        return this.accountSufficient;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return enableEciDisk
     */
    public Boolean getEnableEciDisk() {
        return this.enableEciDisk;
    }

    /**
     * @return freeTier
     */
    public FreeTier getFreeTier() {
        return this.freeTier;
    }

    /**
     * @return freeTierSpecAvailable
     */
    public Boolean getFreeTierSpecAvailable() {
        return this.freeTierSpecAvailable;
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
        private Boolean accountSufficient; 
        private String code; 
        private Boolean enableEciDisk; 
        private FreeTier freeTier; 
        private Boolean freeTierSpecAvailable; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccountSufficient.
         */
        public Builder accountSufficient(Boolean accountSufficient) {
            this.accountSufficient = accountSufficient;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EnableEciDisk.
         */
        public Builder enableEciDisk(Boolean enableEciDisk) {
            this.enableEciDisk = enableEciDisk;
            return this;
        }

        /**
         * FreeTier.
         */
        public Builder freeTier(FreeTier freeTier) {
            this.freeTier = freeTier;
            return this;
        }

        /**
         * FreeTierSpecAvailable.
         */
        public Builder freeTierSpecAvailable(Boolean freeTierSpecAvailable) {
            this.freeTierSpecAvailable = freeTierSpecAvailable;
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

        public GetUserConfigResponseBody build() {
            return new GetUserConfigResponseBody(this);
        } 

    } 

    public static class FreeTier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InitBaseUnit")
        private String initBaseUnit;

        @com.aliyun.core.annotation.NameInMap("InitBaseValue")
        private Double initBaseValue;

        @com.aliyun.core.annotation.NameInMap("InitShowUnit")
        private String initShowUnit;

        @com.aliyun.core.annotation.NameInMap("InitShowValue")
        private String initShowValue;

        @com.aliyun.core.annotation.NameInMap("IsFreeTierUser")
        private Boolean isFreeTierUser;

        @com.aliyun.core.annotation.NameInMap("PeriodBaseUnit")
        private String periodBaseUnit;

        @com.aliyun.core.annotation.NameInMap("PeriodBaseValue")
        private Double periodBaseValue;

        @com.aliyun.core.annotation.NameInMap("PeriodShowUnit")
        private String periodShowUnit;

        @com.aliyun.core.annotation.NameInMap("PeriodShowValue")
        private String periodShowValue;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FreeTier(Builder builder) {
            this.endTime = builder.endTime;
            this.initBaseUnit = builder.initBaseUnit;
            this.initBaseValue = builder.initBaseValue;
            this.initShowUnit = builder.initShowUnit;
            this.initShowValue = builder.initShowValue;
            this.isFreeTierUser = builder.isFreeTierUser;
            this.periodBaseUnit = builder.periodBaseUnit;
            this.periodBaseValue = builder.periodBaseValue;
            this.periodShowUnit = builder.periodShowUnit;
            this.periodShowValue = builder.periodShowValue;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreeTier create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return initBaseUnit
         */
        public String getInitBaseUnit() {
            return this.initBaseUnit;
        }

        /**
         * @return initBaseValue
         */
        public Double getInitBaseValue() {
            return this.initBaseValue;
        }

        /**
         * @return initShowUnit
         */
        public String getInitShowUnit() {
            return this.initShowUnit;
        }

        /**
         * @return initShowValue
         */
        public String getInitShowValue() {
            return this.initShowValue;
        }

        /**
         * @return isFreeTierUser
         */
        public Boolean getIsFreeTierUser() {
            return this.isFreeTierUser;
        }

        /**
         * @return periodBaseUnit
         */
        public String getPeriodBaseUnit() {
            return this.periodBaseUnit;
        }

        /**
         * @return periodBaseValue
         */
        public Double getPeriodBaseValue() {
            return this.periodBaseValue;
        }

        /**
         * @return periodShowUnit
         */
        public String getPeriodShowUnit() {
            return this.periodShowUnit;
        }

        /**
         * @return periodShowValue
         */
        public String getPeriodShowValue() {
            return this.periodShowValue;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String endTime; 
            private String initBaseUnit; 
            private Double initBaseValue; 
            private String initShowUnit; 
            private String initShowValue; 
            private Boolean isFreeTierUser; 
            private String periodBaseUnit; 
            private Double periodBaseValue; 
            private String periodShowUnit; 
            private String periodShowValue; 
            private String startTime; 
            private String status; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InitBaseUnit.
             */
            public Builder initBaseUnit(String initBaseUnit) {
                this.initBaseUnit = initBaseUnit;
                return this;
            }

            /**
             * InitBaseValue.
             */
            public Builder initBaseValue(Double initBaseValue) {
                this.initBaseValue = initBaseValue;
                return this;
            }

            /**
             * InitShowUnit.
             */
            public Builder initShowUnit(String initShowUnit) {
                this.initShowUnit = initShowUnit;
                return this;
            }

            /**
             * InitShowValue.
             */
            public Builder initShowValue(String initShowValue) {
                this.initShowValue = initShowValue;
                return this;
            }

            /**
             * IsFreeTierUser.
             */
            public Builder isFreeTierUser(Boolean isFreeTierUser) {
                this.isFreeTierUser = isFreeTierUser;
                return this;
            }

            /**
             * PeriodBaseUnit.
             */
            public Builder periodBaseUnit(String periodBaseUnit) {
                this.periodBaseUnit = periodBaseUnit;
                return this;
            }

            /**
             * PeriodBaseValue.
             */
            public Builder periodBaseValue(Double periodBaseValue) {
                this.periodBaseValue = periodBaseValue;
                return this;
            }

            /**
             * PeriodShowUnit.
             */
            public Builder periodShowUnit(String periodShowUnit) {
                this.periodShowUnit = periodShowUnit;
                return this;
            }

            /**
             * PeriodShowValue.
             */
            public Builder periodShowValue(String periodShowValue) {
                this.periodShowValue = periodShowValue;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FreeTier build() {
                return new FreeTier(this);
            } 

        } 

    }
}
