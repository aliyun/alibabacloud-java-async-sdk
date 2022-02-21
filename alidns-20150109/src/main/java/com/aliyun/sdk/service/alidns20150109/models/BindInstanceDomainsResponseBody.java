// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindInstanceDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>BindInstanceDomainsResponseBody</p>
 */
public class BindInstanceDomainsResponseBody extends TeaModel {
    @NameInMap("FailedCount")
    private Integer failedCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessCount")
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
         * FailedCount.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
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
         * SuccessCount.
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
