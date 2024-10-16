// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnbindOutputBucketResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindOutputBucketResponseBody</p>
 */
public class UnbindOutputBucketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UnbindOutputBucketResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindOutputBucketResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The operation that you want to perform. Set the value to <strong>UnbindOutputBucket</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4AEA0480-32F4-1656-92B3-F4D4CDE6BBB3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnbindOutputBucketResponseBody build() {
            return new UnbindOutputBucketResponseBody(this);
        } 

    } 

}
