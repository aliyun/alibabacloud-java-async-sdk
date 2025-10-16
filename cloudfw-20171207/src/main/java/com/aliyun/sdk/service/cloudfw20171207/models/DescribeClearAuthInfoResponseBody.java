// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeClearAuthInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClearAuthInfoResponseBody</p>
 */
public class DescribeClearAuthInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.NameInMap("LeftTimes")
    private Integer leftTimes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClearAuthInfoResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.leftTimes = builder.leftTimes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClearAuthInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return leftTimes
     */
    public Integer getLeftTimes() {
        return this.leftTimes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer endTime; 
        private Integer leftTimes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClearAuthInfoResponseBody model) {
            this.endTime = model.endTime;
            this.leftTimes = model.leftTimes;
            this.requestId = model.requestId;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * LeftTimes.
         */
        public Builder leftTimes(Integer leftTimes) {
            this.leftTimes = leftTimes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClearAuthInfoResponseBody build() {
            return new DescribeClearAuthInfoResponseBody(this);
        } 

    } 

}
