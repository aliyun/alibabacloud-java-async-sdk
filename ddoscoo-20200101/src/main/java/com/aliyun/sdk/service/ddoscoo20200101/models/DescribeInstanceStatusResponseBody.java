// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatusResponseBody</p>
 */
public class DescribeInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private Integer instanceStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceStatusResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatusResponseBody create() {
        return builder().build();
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
    public Integer getInstanceStatus() {
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
        private Integer instanceStatus; 
        private String requestId; 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The status of the instance. Valid values:
         * <p>
         * 
         * *   **1**: normal
         * *   **2**: expired
         * *   **3**: overdue
         * *   **4**: released
         */
        public Builder instanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceStatusResponseBody build() {
            return new DescribeInstanceStatusResponseBody(this);
        } 

    } 

}
