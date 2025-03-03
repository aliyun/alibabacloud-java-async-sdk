// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link GetFundAccountLowAvailableAmountAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>GetFundAccountLowAvailableAmountAlarmResponseBody</p>
 */
public class GetFundAccountLowAvailableAmountAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmEnabled")
    private Boolean alarmEnabled;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ThresholdAmount")
    private String thresholdAmount;

    private GetFundAccountLowAvailableAmountAlarmResponseBody(Builder builder) {
        this.alarmEnabled = builder.alarmEnabled;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
        this.thresholdAmount = builder.thresholdAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountLowAvailableAmountAlarmResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmEnabled
     */
    public Boolean getAlarmEnabled() {
        return this.alarmEnabled;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return thresholdAmount
     */
    public String getThresholdAmount() {
        return this.thresholdAmount;
    }

    public static final class Builder {
        private Boolean alarmEnabled; 
        private Object metadata; 
        private String requestId; 
        private String thresholdAmount; 

        /**
         * AlarmEnabled.
         */
        public Builder alarmEnabled(Boolean alarmEnabled) {
            this.alarmEnabled = alarmEnabled;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
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
         * ThresholdAmount.
         */
        public Builder thresholdAmount(String thresholdAmount) {
            this.thresholdAmount = thresholdAmount;
            return this;
        }

        public GetFundAccountLowAvailableAmountAlarmResponseBody build() {
            return new GetFundAccountLowAvailableAmountAlarmResponseBody(this);
        } 

    } 

}
