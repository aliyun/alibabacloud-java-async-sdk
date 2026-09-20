// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeRecoverableTimeRangeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecoverableTimeRangeResponseBody</p>
 */
public class DescribeRecoverableTimeRangeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeBegin")
    private String timeBegin;

    @com.aliyun.core.annotation.NameInMap("TimeEnd")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRecoverableTimeRangeResponseBody model) {
            this.requestId = model.requestId;
            this.timeBegin = model.timeBegin;
            this.timeEnd = model.timeEnd;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1A51D18-96DC-465C-9F1B-47180CA22524</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the recoverable time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-26T18:02:03Z</p>
         */
        public Builder timeBegin(String timeBegin) {
            this.timeBegin = timeBegin;
            return this;
        }

        /**
         * <p>The end time of the recoverable time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-05T01:20:31Z</p>
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
