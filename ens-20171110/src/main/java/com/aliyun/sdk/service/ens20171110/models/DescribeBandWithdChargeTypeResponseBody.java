// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandWithdChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandWithdChargeTypeResponseBody</p>
 */
public class DescribeBandWithdChargeTypeResponseBody extends TeaModel {
    @NameInMap("BandWithTypeInfo")
    private String bandWithTypeInfo;

    @NameInMap("ChargeContractType")
    private String chargeContractType;

    @NameInMap("ChargeCycleInfo")
    private String chargeCycleInfo;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBandWithdChargeTypeResponseBody(Builder builder) {
        this.bandWithTypeInfo = builder.bandWithTypeInfo;
        this.chargeContractType = builder.chargeContractType;
        this.chargeCycleInfo = builder.chargeCycleInfo;
        this.code = builder.code;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandWithdChargeTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandWithTypeInfo
     */
    public String getBandWithTypeInfo() {
        return this.bandWithTypeInfo;
    }

    /**
     * @return chargeContractType
     */
    public String getChargeContractType() {
        return this.chargeContractType;
    }

    /**
     * @return chargeCycleInfo
     */
    public String getChargeCycleInfo() {
        return this.chargeCycleInfo;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bandWithTypeInfo; 
        private String chargeContractType; 
        private String chargeCycleInfo; 
        private Integer code; 
        private String requestId; 

        /**
         * BandWithTypeInfo.
         */
        public Builder bandWithTypeInfo(String bandWithTypeInfo) {
            this.bandWithTypeInfo = bandWithTypeInfo;
            return this;
        }

        /**
         * ChargeContractType.
         */
        public Builder chargeContractType(String chargeContractType) {
            this.chargeContractType = chargeContractType;
            return this;
        }

        /**
         * ChargeCycleInfo.
         */
        public Builder chargeCycleInfo(String chargeCycleInfo) {
            this.chargeCycleInfo = chargeCycleInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBandWithdChargeTypeResponseBody build() {
            return new DescribeBandWithdChargeTypeResponseBody(this);
        } 

    } 

}
