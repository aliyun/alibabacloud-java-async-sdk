// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserServiceStatusResponseBody</p>
 */
public class DescribeUserServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeUserServiceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99626905-678A-4E8A-984E-6AEB09993996</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Current user&quot;s service status:</p>
         * <ul>
         * <li><strong>CLOSED</strong>: Not activated</li>
         * <li><strong>OPENED</strong>: Activated</li>
         * <li><strong>IN_DEBT</strong>: Overdue payment</li>
         * <li><strong>IN_DEBT_OVER_DUE</strong>: Payment overdue</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPENED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeUserServiceStatusResponseBody build() {
            return new DescribeUserServiceStatusResponseBody(this);
        } 

    } 

}
