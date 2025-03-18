// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBandWithdChargeTypeResponseBody model) {
            this.bandWithTypeInfo = model.bandWithTypeInfo;
            this.chargeContractType = model.chargeContractType;
            this.chargeCycleInfo = model.chargeCycleInfo;
            this.code = model.code;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the metering method.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;BandWidthName&quot;: &quot;Monthly peak bandwidth of 95&quot;, 			&quot;BandWidthType&quot;: &quot;95BandwidthByMonth&quot; 		}</p>
         */
        public Builder bandWithTypeInfo(String bandWithTypeInfo) {
            this.bandWithTypeInfo = bandWithTypeInfo;
            return this;
        }

        /**
         * <p>The metering type.</p>
         * <ul>
         * <li>ChargeByUnified: unified metering.</li>
         * <li>ChargeByGrade: differential metering.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ChargeByGrade</p>
         */
        public Builder chargeContractType(String chargeContractType) {
            this.chargeContractType = chargeContractType;
            return this;
        }

        /**
         * <p>The metering cycle. Currently, this parameter is empty in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>{null}</p>
         */
        public Builder chargeCycleInfo(String chargeCycleInfo) {
            this.chargeCycleInfo = chargeCycleInfo;
            return this;
        }

        /**
         * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>791049FD-49CE-4667-BD6C-F23094DEDA7A</p>
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
