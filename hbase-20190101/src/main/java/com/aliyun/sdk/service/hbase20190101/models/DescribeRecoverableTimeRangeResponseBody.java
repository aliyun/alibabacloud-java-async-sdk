// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecoverableTimeRangeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecoverableTimeRangeResponseBody</p>
 */
public class DescribeRecoverableTimeRangeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeBegin")
    private String timeBegin;

    @NameInMap("TimeEnd")
    private String timeEnd;

    private DescribeRecoverableTimeRangeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeBegin = builder.timeBegin;
        this.timeEnd = builder.timeEnd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecoverableTimeRangeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeBegin
     */
    public String getTimeBegin() {
        return this.timeBegin;
    }

    /**
     * @return timeEnd
     */
    public String getTimeEnd() {
        return this.timeEnd;
    }

    public static final class Builder {
        private String requestId; 
        private String timeBegin; 
        private String timeEnd; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeBegin.
         */
        public Builder timeBegin(String timeBegin) {
            this.timeBegin = timeBegin;
            return this;
        }

        /**
         * TimeEnd.
         */
        public Builder timeEnd(String timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }

        public DescribeRecoverableTimeRangeResponseBody build() {
            return new DescribeRecoverableTimeRangeResponseBody(this);
        } 

    } 

}
