// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScalingActivityDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivityDetailResponseBody</p>
 */
public class DescribeScalingActivityDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private DescribeScalingActivityDetailResponseBody(Builder builder) {
        this.detail = builder.detail;
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingActivityDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder {
        private String detail; 
        private String requestId; 
        private String scalingActivityId; 

        /**
         * <p>The details of the scaling activity. If the status of the scaling activity is Rejected, no result is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>new ECS instances &quot;i-bp16t2cgmiiymeqv****&quot; are created.</p>
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B13527BF-1FBD-4334-A512-20F5E9D3FB4D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp1c9djwrgxjyk31****</p>
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        public DescribeScalingActivityDetailResponseBody build() {
            return new DescribeScalingActivityDetailResponseBody(this);
        } 

    } 

}
