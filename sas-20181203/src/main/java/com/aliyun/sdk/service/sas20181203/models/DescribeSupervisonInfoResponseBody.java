// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The time of the last system vulnerability scan. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721134553000</p>
         */
        public Builder latestScanTime(Long latestScanTime) {
            this.latestScanTime = latestScanTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E10BAF1C-A6C5-51E2-866C-76D5922E****</p>
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
