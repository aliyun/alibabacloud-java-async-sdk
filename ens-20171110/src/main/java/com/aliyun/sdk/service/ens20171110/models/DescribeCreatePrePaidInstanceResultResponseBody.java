// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCreatePrePaidInstanceResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCreatePrePaidInstanceResultResponseBody</p>
 */
public class DescribeCreatePrePaidInstanceResultResponseBody extends TeaModel {
    @NameInMap("InstanceCreateResult")
    private InstanceCreateResult instanceCreateResult;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCreatePrePaidInstanceResultResponseBody(Builder builder) {
        this.instanceCreateResult = builder.instanceCreateResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreatePrePaidInstanceResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceCreateResult
     */
    public InstanceCreateResult getInstanceCreateResult() {
        return this.instanceCreateResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceCreateResult instanceCreateResult; 
        private String requestId; 

        /**
         * Returned results of creating an instance.
         */
        public Builder instanceCreateResult(InstanceCreateResult instanceCreateResult) {
            this.instanceCreateResult = instanceCreateResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCreatePrePaidInstanceResultResponseBody build() {
            return new DescribeCreatePrePaidInstanceResultResponseBody(this);
        } 

    } 

    public static class InstanceCreateResult extends TeaModel {
        @NameInMap("InstanceCreateStatus")
        private String instanceCreateStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        private InstanceCreateResult(Builder builder) {
            this.instanceCreateStatus = builder.instanceCreateStatus;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCreateResult create() {
            return builder().build();
        }

        /**
         * @return instanceCreateStatus
         */
        public String getInstanceCreateStatus() {
            return this.instanceCreateStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceCreateStatus; 
            private String instanceId; 

            /**
             * The status of the instance creation.
             * <p>
             * 
             * *   Accepted
             * *   Creating
             * *   Failed
             * *   Successed
             */
            public Builder instanceCreateStatus(String instanceCreateStatus) {
                this.instanceCreateStatus = instanceCreateStatus;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceCreateResult build() {
                return new InstanceCreateResult(this);
            } 

        } 

    }
}
