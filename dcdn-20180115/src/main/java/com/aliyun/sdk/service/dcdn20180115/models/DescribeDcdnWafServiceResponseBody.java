// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafServiceResponseBody</p>
 */
public class DescribeDcdnWafServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private String enabled;

    @com.aliyun.core.annotation.NameInMap("OpeningTime")
    private String openingTime;

    @com.aliyun.core.annotation.NameInMap("RequestBillingType")
    private String requestBillingType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleBillingType")
    private String ruleBillingType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeDcdnWafServiceResponseBody(Builder builder) {
        this.edition = builder.edition;
        this.enabled = builder.enabled;
        this.openingTime = builder.openingTime;
        this.requestBillingType = builder.requestBillingType;
        this.requestId = builder.requestId;
        this.ruleBillingType = builder.ruleBillingType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return enabled
     */
    public String getEnabled() {
        return this.enabled;
    }

    /**
     * @return openingTime
     */
    public String getOpeningTime() {
        return this.openingTime;
    }

    /**
     * @return requestBillingType
     */
    public String getRequestBillingType() {
        return this.requestBillingType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleBillingType
     */
    public String getRuleBillingType() {
        return this.ruleBillingType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String edition; 
        private String enabled; 
        private String openingTime; 
        private String requestBillingType; 
        private String requestId; 
        private String ruleBillingType; 
        private String status; 

        /**
         * The edition of WAF.
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * The status of WAF. Valid values:
         * <p>
         * 
         * *   on
         * *   off
         */
        public Builder enabled(String enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * The time when WAF was enabled.
         */
        public Builder openingTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }

        /**
         * The metering method for requests.
         */
        public Builder requestBillingType(String requestBillingType) {
            this.requestBillingType = requestBillingType;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The metering method for rules. You are charged for the number of SeCUs.
         */
        public Builder ruleBillingType(String ruleBillingType) {
            this.ruleBillingType = ruleBillingType;
            return this;
        }

        /**
         * The status of WAF. Valid values:
         * <p>
         * 
         * *   Normal
         * *   WaitForExpire
         * *   Expired
         * *   Released
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDcdnWafServiceResponseBody build() {
            return new DescribeDcdnWafServiceResponseBody(this);
        } 

    } 

}
