// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUnBlackholeCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUnBlackholeCountResponseBody</p>
 */
public class DescribeUnBlackholeCountResponseBody extends TeaModel {
    @NameInMap("RemainCount")
    private Integer remainCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeUnBlackholeCountResponseBody(Builder builder) {
        this.remainCount = builder.remainCount;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUnBlackholeCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return remainCount
     */
    public Integer getRemainCount() {
        return this.remainCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer remainCount; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The remaining quota that you can deactivate blackhole filtering.
         */
        public Builder remainCount(Integer remainCount) {
            this.remainCount = remainCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total quota that you can deactivate blackhole filtering.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUnBlackholeCountResponseBody build() {
            return new DescribeUnBlackholeCountResponseBody(this);
        } 

    } 

}
