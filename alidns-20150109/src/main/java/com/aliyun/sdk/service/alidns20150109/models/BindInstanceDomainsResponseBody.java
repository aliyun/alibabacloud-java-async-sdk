// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindInstanceDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>BindInstanceDomainsResponseBody</p>
 */
public class BindInstanceDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    private BindInstanceDomainsResponseBody(Builder builder) {
        this.failedCount = builder.failedCount;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindInstanceDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private Integer failedCount; 
        private String requestId; 
        private Integer successCount; 

        /**
         * The number of domain names that failed to be bound to the instance.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of domain names that are bound to the instance.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public BindInstanceDomainsResponseBody build() {
            return new BindInstanceDomainsResponseBody(this);
        } 

    } 

}
