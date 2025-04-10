// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeSlsEmptyCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsEmptyCountResponseBody</p>
 */
public class DescribeSlsEmptyCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableCount")
    private Integer availableCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSlsEmptyCountResponseBody model) {
            this.availableCount = model.availableCount;
            this.requestId = model.requestId;
        } 

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
