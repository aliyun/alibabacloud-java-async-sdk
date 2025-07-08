// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsDetectCountsNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsDetectCountsNewResponseBody</p>
 */
public class QuerySmsDetectCountsNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectedTimes")
    private Integer detectedTimes;

    @com.aliyun.core.annotation.NameInMap("LeftTimes")
    private Integer leftTimes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySmsDetectCountsNewResponseBody(Builder builder) {
        this.detectedTimes = builder.detectedTimes;
        this.leftTimes = builder.leftTimes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsDetectCountsNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectedTimes
     */
    public Integer getDetectedTimes() {
        return this.detectedTimes;
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
        private Integer detectedTimes; 
        private Integer leftTimes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QuerySmsDetectCountsNewResponseBody model) {
            this.detectedTimes = model.detectedTimes;
            this.leftTimes = model.leftTimes;
            this.requestId = model.requestId;
        } 

        /**
         * DetectedTimes.
         */
        public Builder detectedTimes(Integer detectedTimes) {
            this.detectedTimes = detectedTimes;
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

        public QuerySmsDetectCountsNewResponseBody build() {
            return new QuerySmsDetectCountsNewResponseBody(this);
        } 

    } 

}
