// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserBusinessBehaviorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBusinessBehaviorResponseBody</p>
 */
public class DescribeUserBusinessBehaviorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusValue")
    private String statusValue;

    private DescribeUserBusinessBehaviorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusValue = builder.statusValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBusinessBehaviorResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusValue
     */
    public String getStatusValue() {
        return this.statusValue;
    }

    public static final class Builder {
        private String requestId; 
        private String statusValue; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusValue.
         */
        public Builder statusValue(String statusValue) {
            this.statusValue = statusValue;
            return this;
        }

        public DescribeUserBusinessBehaviorResponseBody build() {
            return new DescribeUserBusinessBehaviorResponseBody(this);
        } 

    } 

}
