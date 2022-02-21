// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUnBlockCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUnBlockCountResponseBody</p>
 */
public class DescribeUnBlockCountResponseBody extends TeaModel {
    @NameInMap("RemainCount")
    private Integer remainCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeUnBlockCountResponseBody(Builder builder) {
        this.remainCount = builder.remainCount;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUnBlockCountResponseBody create() {
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
         * RemainCount.
         */
        public Builder remainCount(Integer remainCount) {
            this.remainCount = remainCount;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUnBlockCountResponseBody build() {
            return new DescribeUnBlockCountResponseBody(this);
        } 

    } 

}
