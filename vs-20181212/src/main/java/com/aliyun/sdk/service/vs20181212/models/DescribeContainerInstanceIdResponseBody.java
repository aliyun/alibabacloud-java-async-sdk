// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerInstanceIdResponseBody</p>
 */
public class DescribeContainerInstanceIdResponseBody extends TeaModel {
    @NameInMap("InstanceDetail")
    private InstanceDetail instanceDetail;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeContainerInstanceIdResponseBody(Builder builder) {
        this.instanceDetail = builder.instanceDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerInstanceIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceDetail
     */
    public InstanceDetail getInstanceDetail() {
        return this.instanceDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceDetail instanceDetail; 
        private String requestId; 

        /**
         * InstanceDetail.
         */
        public Builder instanceDetail(InstanceDetail instanceDetail) {
            this.instanceDetail = instanceDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerInstanceIdResponseBody build() {
            return new DescribeContainerInstanceIdResponseBody(this);
        } 

    } 

    public static class InstanceDetail extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        private InstanceDetail(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDetail create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceDetail build() {
                return new InstanceDetail(this);
            } 

        } 

    }
}
