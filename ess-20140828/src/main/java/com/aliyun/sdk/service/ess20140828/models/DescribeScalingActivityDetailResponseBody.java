// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingActivityDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivityDetailResponseBody</p>
 */
public class DescribeScalingActivityDetailResponseBody extends TeaModel {
    @NameInMap("Detail")
    private String detail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingActivityId")
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
         * Detail.
         */
        public Builder detail(String detail) {
            this.detail = detail;
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
         * ScalingActivityId.
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
