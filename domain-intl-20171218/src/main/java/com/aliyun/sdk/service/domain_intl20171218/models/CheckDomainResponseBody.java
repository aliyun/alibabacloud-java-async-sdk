// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainResponseBody</p>
 */
public class CheckDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Avail")
    private String avail;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DynamicCheck")
    private Boolean dynamicCheck;

    @com.aliyun.core.annotation.NameInMap("Premium")
    private String premium;

    @com.aliyun.core.annotation.NameInMap("Price")
    private Long price;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckDomainResponseBody(Builder builder) {
        this.avail = builder.avail;
        this.domainName = builder.domainName;
        this.dynamicCheck = builder.dynamicCheck;
        this.premium = builder.premium;
        this.price = builder.price;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return avail
     */
    public String getAvail() {
        return this.avail;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return dynamicCheck
     */
    public Boolean getDynamicCheck() {
        return this.dynamicCheck;
    }

    /**
     * @return premium
     */
    public String getPremium() {
        return this.premium;
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String avail; 
        private String domainName; 
        private Boolean dynamicCheck; 
        private String premium; 
        private Long price; 
        private String reason; 
        private String requestId; 

        /**
         * Avail.
         */
        public Builder avail(String avail) {
            this.avail = avail;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * DynamicCheck.
         */
        public Builder dynamicCheck(Boolean dynamicCheck) {
            this.dynamicCheck = dynamicCheck;
            return this;
        }

        /**
         * Premium.
         */
        public Builder premium(String premium) {
            this.premium = premium;
            return this;
        }

        /**
         * Price.
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDomainResponseBody build() {
            return new CheckDomainResponseBody(this);
        } 

    } 

}
