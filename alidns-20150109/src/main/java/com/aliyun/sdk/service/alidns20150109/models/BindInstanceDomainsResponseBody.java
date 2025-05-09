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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BindInstanceDomainsResponseBody model) {
            this.failedCount = model.failedCount;
            this.requestId = model.requestId;
            this.successCount = model.successCount;
        } 

        /**
         * <p>The number of domain names that failed to be bound to the instance.</p>
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
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of domain names that are bound to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
