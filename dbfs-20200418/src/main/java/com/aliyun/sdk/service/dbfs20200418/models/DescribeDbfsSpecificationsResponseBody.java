// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbfsSpecificationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbfsSpecificationsResponseBody</p>
 */
public class DescribeDbfsSpecificationsResponseBody extends TeaModel {
    @NameInMap("MaxDbfsNumberPerEcs")
    private java.util.Map < String, ? > maxDbfsNumberPerEcs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportedEcsInstanceTypeFamily")
    private java.util.List < String > supportedEcsInstanceTypeFamily;

    private DescribeDbfsSpecificationsResponseBody(Builder builder) {
        this.maxDbfsNumberPerEcs = builder.maxDbfsNumberPerEcs;
        this.requestId = builder.requestId;
        this.supportedEcsInstanceTypeFamily = builder.supportedEcsInstanceTypeFamily;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbfsSpecificationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxDbfsNumberPerEcs
     */
    public java.util.Map < String, ? > getMaxDbfsNumberPerEcs() {
        return this.maxDbfsNumberPerEcs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportedEcsInstanceTypeFamily
     */
    public java.util.List < String > getSupportedEcsInstanceTypeFamily() {
        return this.supportedEcsInstanceTypeFamily;
    }

    public static final class Builder {
        private java.util.Map < String, ? > maxDbfsNumberPerEcs; 
        private String requestId; 
        private java.util.List < String > supportedEcsInstanceTypeFamily; 

        /**
         * MaxDbfsNumberPerEcs.
         */
        public Builder maxDbfsNumberPerEcs(java.util.Map < String, ? > maxDbfsNumberPerEcs) {
            this.maxDbfsNumberPerEcs = maxDbfsNumberPerEcs;
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
         * SupportedEcsInstanceTypeFamily.
         */
        public Builder supportedEcsInstanceTypeFamily(java.util.List < String > supportedEcsInstanceTypeFamily) {
            this.supportedEcsInstanceTypeFamily = supportedEcsInstanceTypeFamily;
            return this;
        }

        public DescribeDbfsSpecificationsResponseBody build() {
            return new DescribeDbfsSpecificationsResponseBody(this);
        } 

    } 

}
