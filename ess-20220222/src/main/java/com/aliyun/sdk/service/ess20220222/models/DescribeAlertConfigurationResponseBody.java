// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertConfigurationResponseBody</p>
 */
public class DescribeAlertConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScaleStatuses")
    private java.util.List < String > scaleStatuses;

    private DescribeAlertConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scaleStatuses = builder.scaleStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scaleStatuses
     */
    public java.util.List < String > getScaleStatuses() {
        return this.scaleStatuses;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > scaleStatuses; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the scaling activities that trigger text message, internal message, or email-based notifications.
         */
        public Builder scaleStatuses(java.util.List < String > scaleStatuses) {
            this.scaleStatuses = scaleStatuses;
            return this;
        }

        public DescribeAlertConfigurationResponseBody build() {
            return new DescribeAlertConfigurationResponseBody(this);
        } 

    } 

}
