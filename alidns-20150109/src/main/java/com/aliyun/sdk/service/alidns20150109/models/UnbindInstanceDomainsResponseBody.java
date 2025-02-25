// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UnbindInstanceDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindInstanceDomainsResponseBody</p>
 */
public class UnbindInstanceDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    private UnbindInstanceDomainsResponseBody(Builder builder) {
        this.failedCount = builder.failedCount;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindInstanceDomainsResponseBody create() {
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
         * <p>The number of domain names that failed to be unbound from the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of domain names that are unbound from the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public UnbindInstanceDomainsResponseBody build() {
            return new UnbindInstanceDomainsResponseBody(this);
        } 

    } 

}
