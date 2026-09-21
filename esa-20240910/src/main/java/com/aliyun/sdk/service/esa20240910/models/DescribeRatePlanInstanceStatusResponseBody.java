// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeRatePlanInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRatePlanInstanceStatusResponseBody</p>
 */
public class DescribeRatePlanInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRatePlanInstanceStatusResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRatePlanInstanceStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String instanceStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRatePlanInstanceStatusResponseBody model) {
            this.instanceId = model.instanceId;
            this.instanceStatus = model.instanceStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xcdn-91fknmb80f0g***</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li>running: Running.</li>
         * <li>renewing: Being renewed.</li>
         * <li>upgrading: Being upgraded.</li>
         * <li>releasePrepaidService: Released due to subscription expiration.</li>
         * <li>creating: Being created.</li>
         * <li>downgrading: Being downgraded.</li>
         * <li>ceasePrepaidService: Suspended due to subscription expiration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60423A7F-A83D-1E24-B80E-86DD25790759</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRatePlanInstanceStatusResponseBody build() {
            return new DescribeRatePlanInstanceStatusResponseBody(this);
        } 

    } 

}
