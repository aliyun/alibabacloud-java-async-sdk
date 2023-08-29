// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDdosServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDdosServiceResponseBody</p>
 */
public class DescribeDcdnDdosServiceResponseBody extends TeaModel {
    @NameInMap("ChangingAffectTime")
    private String changingAffectTime;

    @NameInMap("ChangingChargeType")
    private String changingChargeType;

    @NameInMap("ChangingDomianNum")
    private Integer changingDomianNum;

    @NameInMap("ChangingEdition")
    private String changingEdition;

    @NameInMap("ChangingProtectNum")
    private Integer changingProtectNum;

    @NameInMap("ChargeType")
    private String chargeType;

    @NameInMap("DomianNum")
    private Integer domianNum;

    @NameInMap("Edition")
    private String edition;

    @NameInMap("Enabled")
    private String enabled;

    @NameInMap("EndingTime")
    private String endingTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("OpeningTime")
    private String openingTime;

    @NameInMap("ProtectNum")
    private Integer protectNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
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
         * ChangingAffectTime.
         */
        public Builder changingAffectTime(String changingAffectTime) {
            this.changingAffectTime = changingAffectTime;
            return this;
        }

        /**
         * ChangingChargeType.
         */
        public Builder changingChargeType(String changingChargeType) {
            this.changingChargeType = changingChargeType;
            return this;
        }

        /**
         * ChangingDomianNum.
         */
        public Builder changingDomianNum(Integer changingDomianNum) {
            this.changingDomianNum = changingDomianNum;
            return this;
        }

        /**
         * ChangingEdition.
         */
        public Builder changingEdition(String changingEdition) {
            this.changingEdition = changingEdition;
            return this;
        }

        /**
         * ChangingProtectNum.
         */
        public Builder changingProtectNum(Integer changingProtectNum) {
            this.changingProtectNum = changingProtectNum;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * DomianNum.
         */
        public Builder domianNum(Integer domianNum) {
            this.domianNum = domianNum;
            return this;
        }

        /**
         * Edition.
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(String enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * EndingTime.
         */
        public Builder endingTime(String endingTime) {
            this.endingTime = endingTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OpeningTime.
         */
        public Builder openingTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }

        /**
         * ProtectNum.
         */
        public Builder protectNum(Integer protectNum) {
            this.protectNum = protectNum;
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
         * Status.
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
