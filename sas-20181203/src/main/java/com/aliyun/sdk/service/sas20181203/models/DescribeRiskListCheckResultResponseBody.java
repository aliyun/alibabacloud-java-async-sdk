// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRiskListCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskListCheckResultResponseBody</p>
 */
public class DescribeRiskListCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRiskListCheckResultResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskListCheckResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < List> list; 
        private String requestId; 

        /**
         * <p>The number of risk items for each cloud service.</p>
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3BFB4989-A108-46A4-954E-FF7EF02D1078</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRiskListCheckResultResponseBody build() {
            return new DescribeRiskListCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskListCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskListCheckResultResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("riskCount")
        private Long riskCount;

        private List(Builder builder) {
            this.instanceId = builder.instanceId;
            this.riskCount = builder.riskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        public static final class Builder {
            private String instanceId; 
            private Long riskCount; 

            /**
             * <p>The instance ID of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1e8t4q15sr3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The total number of risk items detected in the current cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
