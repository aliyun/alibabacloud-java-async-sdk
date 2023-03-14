// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsEmptyCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsEmptyCountResponseBody</p>
 */
public class DescribeSlsEmptyCountResponseBody extends TeaModel {
    @NameInMap("AvailableCount")
    private Integer availableCount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSlsEmptyCountResponseBody(Builder builder) {
        this.availableCount = builder.availableCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsEmptyCountResponseBody create() {
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
         * AvailableCount.
         */
        public Builder availableCount(Integer availableCount) {
            this.availableCount = availableCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSlsEmptyCountResponseBody build() {
            return new DescribeSlsEmptyCountResponseBody(this);
        } 

    } 

}
