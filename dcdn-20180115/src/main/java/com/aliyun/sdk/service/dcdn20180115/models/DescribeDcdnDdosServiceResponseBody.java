// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDdosServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDdosServiceResponseBody</p>
 */
public class DescribeDcdnDdosServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangingAffectTime")
    private String changingAffectTime;

    @com.aliyun.core.annotation.NameInMap("ChangingChargeType")
    private String changingChargeType;

    @com.aliyun.core.annotation.NameInMap("ChangingDomianNum")
    private Integer changingDomianNum;

    @com.aliyun.core.annotation.NameInMap("ChangingEdition")
    private String changingEdition;

    @com.aliyun.core.annotation.NameInMap("ChangingProtectNum")
    private Integer changingProtectNum;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("DomianNum")
    private Integer domianNum;

    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private String enabled;

    @com.aliyun.core.annotation.NameInMap("EndingTime")
    private String endingTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("OpeningTime")
    private String openingTime;

    @com.aliyun.core.annotation.NameInMap("ProtectNum")
    private Integer protectNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeDcdnDdosServiceResponseBody(Builder builder) {
        this.changingAffectTime = builder.changingAffectTime;
        this.changingChargeType = builder.changingChargeType;
        this.changingDomianNum = builder.changingDomianNum;
        this.changingEdition = builder.changingEdition;
        this.changingProtectNum = builder.changingProtectNum;
        this.chargeType = builder.chargeType;
        this.domianNum = builder.domianNum;
        this.edition = builder.edition;
        this.enabled = builder.enabled;
        this.endingTime = builder.endingTime;
        this.instanceId = builder.instanceId;
        this.openingTime = builder.openingTime;
        this.protectNum = builder.protectNum;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDdosServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return changingAffectTime
     */
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    /**
     * @return changingChargeType
     */
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    /**
     * @return changingDomianNum
     */
    public Integer getChangingDomianNum() {
        return this.changingDomianNum;
    }

    /**
     * @return changingEdition
     */
    public String getChangingEdition() {
        return this.changingEdition;
    }

    /**
     * @return changingProtectNum
     */
    public Integer getChangingProtectNum() {
        return this.changingProtectNum;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return domianNum
     */
    public Integer getDomianNum() {
        return this.domianNum;
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
     * @return endingTime
     */
    public String getEndingTime() {
        return this.endingTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return openingTime
     */
    public String getOpeningTime() {
        return this.openingTime;
    }

    /**
     * @return protectNum
     */
    public Integer getProtectNum() {
        return this.protectNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String changingAffectTime; 
        private String changingChargeType; 
        private Integer changingDomianNum; 
        private String changingEdition; 
        private Integer changingProtectNum; 
        private String chargeType; 
        private Integer domianNum; 
        private String edition; 
        private String enabled; 
        private String endingTime; 
        private String instanceId; 
        private String openingTime; 
        private Integer protectNum; 
        private String requestId; 
        private String status; 

        /**
         * The time when the renewed service takes effect. The time is displayed in UTC.
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * The metering method after the configuration changes Valid values:
         * <p>
         * 
         * *   **PayByBandwidth**
         * *   **PayByTraffic**
         * *   **PayByBandwidth95**
         */
        public Builder changingChargeType(String changingChargeType) {
            this.changingChargeType = changingChargeType;
            return this;
        }

        /**
         * The number of protected domain names.
         */
        public Builder changingDomianNum(Integer changingDomianNum) {
            this.changingDomianNum = changingDomianNum;
            return this;
        }

        /**
         * The protection edition for which the configuration changes take effect. Valid values:
         * <p>
         * 
         * *   **poc**: POC Edition
         * *   **basic**: Basic Edition
         * *   **insurance**: Insurance Edition
         * *   **unlimited**: Unlimited Edition
         */
        public Builder changingEdition(String changingEdition) {
            this.changingEdition = changingEdition;
            return this;
        }

        /**
         * The number of mitigation sessions with configuration changes.
         */
        public Builder changingProtectNum(Integer changingProtectNum) {
            this.changingProtectNum = changingProtectNum;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   **PayByBandwidth**
         * *   **PayByTraffic**
         * *   **PayByBandwidth95**
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The number of protected domain names.
         */
        public Builder domianNum(Integer domianNum) {
            this.domianNum = domianNum;
            return this;
        }

        /**
         * The protection edition. Valid values:
         * <p>
         * 
         * *   **poc**: POC Edition
         * *   **basic**: Basic Edition
         * *   **insurance**: Insurance Edition
         * *   **unlimited**: Unlimited Edition
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * The activation status of the service. Valid values:
         * <p>
         * 
         * *   **on**
         * *   **off**
         */
        public Builder enabled(String enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * The service expiration time.
         */
        public Builder endingTime(String endingTime) {
            this.endingTime = endingTime;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The time when the service was enabled.
         */
        public Builder openingTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }

        /**
         * The number of mitigation sessions.
         */
        public Builder protectNum(Integer protectNum) {
            this.protectNum = protectNum;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the service. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **WaitForExpire**
         * *   **expired**
         * *   **Released**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDcdnDdosServiceResponseBody build() {
            return new DescribeDcdnDdosServiceResponseBody(this);
        } 

    } 

}
