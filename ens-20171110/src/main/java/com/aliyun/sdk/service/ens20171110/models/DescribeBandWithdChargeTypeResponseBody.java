// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandWithdChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandWithdChargeTypeResponseBody</p>
 */
public class DescribeBandWithdChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandWithTypeInfo")
    private String bandWithTypeInfo;

    @com.aliyun.core.annotation.NameInMap("ChargeContractType")
    private String chargeContractType;

    @com.aliyun.core.annotation.NameInMap("ChargeCycleInfo")
    private String chargeCycleInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The information about the metering method.
         */
        public Builder bandWithTypeInfo(String bandWithTypeInfo) {
            this.bandWithTypeInfo = bandWithTypeInfo;
            return this;
        }

        /**
         * The metering type.
         * <p>
         * 
         * *   ChargeByUnified: unified metering.
         * *   ChargeByGrade: differential metering.
         */
        public Builder chargeContractType(String chargeContractType) {
            this.chargeContractType = chargeContractType;
            return this;
        }

        /**
         * The metering cycle. Currently, this parameter is empty in the response.
         */
        public Builder chargeCycleInfo(String chargeCycleInfo) {
            this.chargeCycleInfo = chargeCycleInfo;
            return this;
        }

        /**
         * The returned service code. A value of 0 indicates that the operation was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The request ID.
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
