// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeComputeBurstConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComputeBurstConfigResponseBody</p>
 */
public class DescribeComputeBurstConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComputeBurstConfig")
    private java.util.Map<String, ?> computeBurstConfig;

    @com.aliyun.core.annotation.NameInMap("ComputeBurstEnabled")
    private Boolean computeBurstEnabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComputeBurstConfigResponseBody(Builder builder) {
        this.computeBurstConfig = builder.computeBurstConfig;
        this.computeBurstEnabled = builder.computeBurstEnabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComputeBurstConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computeBurstConfig
     */
    public java.util.Map<String, ?> getComputeBurstConfig() {
        return this.computeBurstConfig;
    }

    /**
     * @return computeBurstEnabled
     */
    public Boolean getComputeBurstEnabled() {
        return this.computeBurstEnabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> computeBurstConfig; 
        private Boolean computeBurstEnabled; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeComputeBurstConfigResponseBody model) {
            this.computeBurstConfig = model.computeBurstConfig;
            this.computeBurstEnabled = model.computeBurstEnabled;
            this.requestId = model.requestId;
        } 

        /**
         * ComputeBurstConfig.
         */
        public Builder computeBurstConfig(java.util.Map<String, ?> computeBurstConfig) {
            this.computeBurstConfig = computeBurstConfig;
            return this;
        }

        /**
         * ComputeBurstEnabled.
         */
        public Builder computeBurstEnabled(Boolean computeBurstEnabled) {
            this.computeBurstEnabled = computeBurstEnabled;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComputeBurstConfigResponseBody build() {
            return new DescribeComputeBurstConfigResponseBody(this);
        } 

    } 

}
