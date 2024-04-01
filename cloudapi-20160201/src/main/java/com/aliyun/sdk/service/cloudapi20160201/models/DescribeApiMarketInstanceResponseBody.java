// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiMarketInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiMarketInstanceResponseBody</p>
 */
public class DescribeApiMarketInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceAttributes")
    private String instanceAttributes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeApiMarketInstanceResponseBody(Builder builder) {
        this.instanceAttributes = builder.instanceAttributes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiMarketInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceAttributes
     */
    public String getInstanceAttributes() {
        return this.instanceAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceAttributes; 
        private String requestId; 

        /**
         * InstanceAttributes.
         */
        public Builder instanceAttributes(String instanceAttributes) {
            this.instanceAttributes = instanceAttributes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiMarketInstanceResponseBody build() {
            return new DescribeApiMarketInstanceResponseBody(this);
        } 

    } 

}
