// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLimitationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLimitationResponseBody</p>
 */
public class DescribeLimitationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Limitation")
    private String limitation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeLimitationResponseBody(Builder builder) {
        this.limitation = builder.limitation;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLimitationResponseBody create() {
        return builder().build();
    }

    /**
     * @return limitation
     */
    public String getLimitation() {
        return this.limitation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String limitation; 
        private String requestId; 
        private String value; 

        /**
         * Limitation.
         */
        public Builder limitation(String limitation) {
            this.limitation = limitation;
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
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public DescribeLimitationResponseBody build() {
            return new DescribeLimitationResponseBody(this);
        } 

    } 

}
