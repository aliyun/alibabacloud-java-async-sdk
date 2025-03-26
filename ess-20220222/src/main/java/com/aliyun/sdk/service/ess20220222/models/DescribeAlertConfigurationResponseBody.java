// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeAlertConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertConfigurationResponseBody</p>
 */
public class DescribeAlertConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScaleStatuses")
    private java.util.List<String> scaleStatuses;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getScaleStatuses() {
        return this.scaleStatuses;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> scaleStatuses; 

        private Builder() {
        } 

        private Builder(DescribeAlertConfigurationResponseBody model) {
            this.requestId = model.requestId;
            this.scaleStatuses = model.scaleStatuses;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the scaling activities that trigger text message, internal message, or email-based notifications.</p>
         */
        public Builder scaleStatuses(java.util.List<String> scaleStatuses) {
            this.scaleStatuses = scaleStatuses;
            return this;
        }

        public DescribeAlertConfigurationResponseBody build() {
            return new DescribeAlertConfigurationResponseBody(this);
        } 

    } 

}
