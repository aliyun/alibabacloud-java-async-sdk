// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessLogEmptyCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessLogEmptyCountResponseBody</p>
 */
public class DescribeWebAccessLogEmptyCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableCount")
    private Integer availableCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWebAccessLogEmptyCountResponseBody(Builder builder) {
        this.availableCount = builder.availableCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebAccessLogEmptyCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableCount
     */
    public Integer getAvailableCount() {
        return this.availableCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer availableCount; 
        private String requestId; 

        /**
         * The remaining quota that you can clear the Logstore.
         */
        public Builder availableCount(Integer availableCount) {
            this.availableCount = availableCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebAccessLogEmptyCountResponseBody build() {
            return new DescribeWebAccessLogEmptyCountResponseBody(this);
        } 

    } 

}
