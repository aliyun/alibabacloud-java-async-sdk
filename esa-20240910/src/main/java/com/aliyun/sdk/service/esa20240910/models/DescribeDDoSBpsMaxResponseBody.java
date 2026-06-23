// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeDDoSBpsMaxResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSBpsMaxResponseBody</p>
 */
public class DescribeDDoSBpsMaxResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("MaxAtkBps")
    private Long maxAtkBps;

    @com.aliyun.core.annotation.NameInMap("MaxAtkPps")
    private Long maxAtkPps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDDoSBpsMaxResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.maxAtkBps = builder.maxAtkBps;
        this.maxAtkPps = builder.maxAtkPps;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSBpsMaxResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxAtkBps
     */
    public Long getMaxAtkBps() {
        return this.maxAtkBps;
    }

    /**
     * @return maxAtkPps
     */
    public Long getMaxAtkPps() {
        return this.maxAtkPps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String endTime; 
        private Long maxAtkBps; 
        private Long maxAtkPps; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeDDoSBpsMaxResponseBody model) {
            this.endTime = model.endTime;
            this.maxAtkBps = model.maxAtkBps;
            this.maxAtkPps = model.maxAtkPps;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * MaxAtkBps.
         */
        public Builder maxAtkBps(Long maxAtkBps) {
            this.maxAtkBps = maxAtkBps;
            return this;
        }

        /**
         * MaxAtkPps.
         */
        public Builder maxAtkPps(Long maxAtkPps) {
            this.maxAtkPps = maxAtkPps;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDDoSBpsMaxResponseBody build() {
            return new DescribeDDoSBpsMaxResponseBody(this);
        } 

    } 

}
