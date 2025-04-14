// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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

        private Builder(DescribeWebAccessLogEmptyCountResponseBody model) {
            this.availableCount = model.availableCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The remaining quota that you can clear the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder availableCount(Integer availableCount) {
            this.availableCount = availableCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
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
