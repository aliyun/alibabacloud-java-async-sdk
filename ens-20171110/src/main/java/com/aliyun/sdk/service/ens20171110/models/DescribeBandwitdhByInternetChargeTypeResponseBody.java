// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwitdhByInternetChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwitdhByInternetChargeTypeResponseBody</p>
 */
public class DescribeBandwitdhByInternetChargeTypeResponseBody extends TeaModel {
    @NameInMap("BandwidthValue")
    private Long bandwidthValue;

    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeStamp")
    private String timeStamp;

    private DescribeBandwitdhByInternetChargeTypeResponseBody(Builder builder) {
        this.bandwidthValue = builder.bandwidthValue;
        this.internetChargeType = builder.internetChargeType;
        this.requestId = builder.requestId;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwitdhByInternetChargeTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthValue
     */
    public Long getBandwidthValue() {
        return this.bandwidthValue;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeStamp
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public static final class Builder {
        private Long bandwidthValue; 
        private String internetChargeType; 
        private String requestId; 
        private String timeStamp; 

        /**
         * BandwidthValue.
         */
        public Builder bandwidthValue(Long bandwidthValue) {
            this.bandwidthValue = bandwidthValue;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
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
         * TimeStamp.
         */
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public DescribeBandwitdhByInternetChargeTypeResponseBody build() {
            return new DescribeBandwitdhByInternetChargeTypeResponseBody(this);
        } 

    } 

}
