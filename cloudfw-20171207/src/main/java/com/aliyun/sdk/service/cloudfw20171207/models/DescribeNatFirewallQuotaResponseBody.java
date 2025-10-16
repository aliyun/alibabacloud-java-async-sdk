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
 * {@link DescribeNatFirewallQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallQuotaResponseBody</p>
 */
public class DescribeNatFirewallQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExceptionCount")
    private Long exceptionCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UnprotectedCount")
    private Long unprotectedCount;

    @com.aliyun.core.annotation.NameInMap("UsedCount")
    private Long usedCount;

    private DescribeNatFirewallQuotaResponseBody(Builder builder) {
        this.exceptionCount = builder.exceptionCount;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.unprotectedCount = builder.unprotectedCount;
        this.usedCount = builder.usedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exceptionCount
     */
    public Long getExceptionCount() {
        return this.exceptionCount;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return unprotectedCount
     */
    public Long getUnprotectedCount() {
        return this.unprotectedCount;
    }

    /**
     * @return usedCount
     */
    public Long getUsedCount() {
        return this.usedCount;
    }

    public static final class Builder {
        private Long exceptionCount; 
        private String requestId; 
        private Long totalCount; 
        private Long unprotectedCount; 
        private Long usedCount; 

        private Builder() {
        } 

        private Builder(DescribeNatFirewallQuotaResponseBody model) {
            this.exceptionCount = model.exceptionCount;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.unprotectedCount = model.unprotectedCount;
            this.usedCount = model.usedCount;
        } 

        /**
         * ExceptionCount.
         */
        public Builder exceptionCount(Long exceptionCount) {
            this.exceptionCount = exceptionCount;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UnprotectedCount.
         */
        public Builder unprotectedCount(Long unprotectedCount) {
            this.unprotectedCount = unprotectedCount;
            return this;
        }

        /**
         * UsedCount.
         */
        public Builder usedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        public DescribeNatFirewallQuotaResponseBody build() {
            return new DescribeNatFirewallQuotaResponseBody(this);
        } 

    } 

}
