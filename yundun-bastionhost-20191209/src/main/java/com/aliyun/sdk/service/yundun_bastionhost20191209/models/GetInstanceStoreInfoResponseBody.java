// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetInstanceStoreInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceStoreInfoResponseBody</p>
 */
public class GetInstanceStoreInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Max")
    private Long max;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private Long usage;

    private GetInstanceStoreInfoResponseBody(Builder builder) {
        this.max = builder.max;
        this.requestId = builder.requestId;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceStoreInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return max
     */
    public Long getMax() {
        return this.max;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usage
     */
    public Long getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Long max; 
        private String requestId; 
        private Long usage; 

        private Builder() {
        } 

        private Builder(GetInstanceStoreInfoResponseBody model) {
            this.max = model.max;
            this.requestId = model.requestId;
            this.usage = model.usage;
        } 

        /**
         * Max.
         */
        public Builder max(Long max) {
            this.max = max;
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
         * Usage.
         */
        public Builder usage(Long usage) {
            this.usage = usage;
            return this;
        }

        public GetInstanceStoreInfoResponseBody build() {
            return new GetInstanceStoreInfoResponseBody(this);
        } 

    } 

}
