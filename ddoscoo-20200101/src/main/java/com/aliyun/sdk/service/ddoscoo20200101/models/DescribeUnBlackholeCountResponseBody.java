// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUnBlackholeCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUnBlackholeCountResponseBody</p>
 */
public class DescribeUnBlackholeCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemainCount")
    private Integer remainCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The remaining quota that you can deactivate blackhole filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder remainCount(Integer remainCount) {
            this.remainCount = remainCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>232929FA-40B6-4C53-9476-EE335ABA44CD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total quota that you can deactivate blackhole filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
