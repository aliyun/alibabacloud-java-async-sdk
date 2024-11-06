// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The edition of WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdnwaf_afterpay</p>
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * <p>The status of WAF. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enabled(String enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The time when WAF was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-26T16:00:00Z</p>
         */
        public Builder openingTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }

        /**
         * <p>The metering method for requests.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn_waf_req</p>
         */
        public Builder requestBillingType(String requestBillingType) {
            this.requestBillingType = requestBillingType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4A95CA90-E0F2-1BF6-99E0-8C1510CAF649</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metering method for rules. You are charged for the number of SeCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn_waf_rule</p>
         */
        public Builder ruleBillingType(String ruleBillingType) {
            this.ruleBillingType = ruleBillingType;
            return this;
        }

        /**
         * <p>The status of WAF. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>WaitForExpire</li>
         * <li>Expired</li>
         * <li>Released</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
