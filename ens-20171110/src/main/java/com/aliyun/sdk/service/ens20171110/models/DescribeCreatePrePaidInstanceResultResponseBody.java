// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeCreatePrePaidInstanceResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCreatePrePaidInstanceResultResponseBody</p>
 */
public class DescribeCreatePrePaidInstanceResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCreateResult")
    private InstanceCreateResult instanceCreateResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCreatePrePaidInstanceResultResponseBody model) {
            this.instanceCreateResult = model.instanceCreateResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned results of creating an instance.</p>
         */
        public Builder instanceCreateResult(InstanceCreateResult instanceCreateResult) {
            this.instanceCreateResult = instanceCreateResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCreatePrePaidInstanceResultResponseBody build() {
            return new DescribeCreatePrePaidInstanceResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCreatePrePaidInstanceResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreatePrePaidInstanceResultResponseBody</p>
     */
    public static class InstanceCreateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceCreateStatus")
        private String instanceCreateStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
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

            private Builder() {
            } 

            private Builder(InstanceCreateResult model) {
                this.instanceCreateStatus = model.instanceCreateStatus;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The status of the instance creation.</p>
             * <ul>
             * <li>Accepted</li>
             * <li>Creating</li>
             * <li>Failed</li>
             * <li>Successed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Successed</p>
             */
            public Builder instanceCreateStatus(String instanceCreateStatus) {
                this.instanceCreateStatus = instanceCreateStatus;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-6ecpqvkicnchxccozrpxxxx</p>
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
