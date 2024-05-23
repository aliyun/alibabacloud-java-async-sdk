// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingActivityDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivityDetailResponseBody</p>
 */
public class DescribeScalingActivityDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private DescribeScalingActivityDetailResponseBody(Builder builder) {
        this.detail = builder.detail;
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
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder {
        private String detail; 
        private String scalingActivityId; 

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.detail = detail;
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
