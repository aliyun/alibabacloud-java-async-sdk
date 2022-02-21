// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePackageQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcePackageQuotaResponseBody</p>
 */
public class DescribeResourcePackageQuotaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("UsedCount")
    private Integer usedCount;

    private DescribeResourcePackageQuotaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.usedCount = builder.usedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePackageQuotaResponseBody create() {
        return builder().build();
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

    /**
     * @return usedCount
     */
    public Integer getUsedCount() {
        return this.usedCount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private Integer usedCount; 

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

        /**
         * UsedCount.
         */
        public Builder usedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        public DescribeResourcePackageQuotaResponseBody build() {
            return new DescribeResourcePackageQuotaResponseBody(this);
        } 

    } 

}
