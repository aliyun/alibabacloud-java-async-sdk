// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupervisonInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupervisonInfoResponseBody</p>
 */
public class DescribeSupervisonInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LatestScanTime")
    private Long latestScanTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSupervisonInfoResponseBody(Builder builder) {
        this.latestScanTime = builder.latestScanTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupervisonInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return this.latestScanTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long latestScanTime; 
        private String requestId; 

        /**
         * The time of the last system vulnerability scan. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder latestScanTime(Long latestScanTime) {
            this.latestScanTime = latestScanTime;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSupervisonInfoResponseBody build() {
            return new DescribeSupervisonInfoResponseBody(this);
        } 

    } 

}
