// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskListCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskListCheckResultResponseBody</p>
 */
public class DescribeRiskListCheckResultResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("RequestId")
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
         * List.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRiskListCheckResultResponseBody build() {
            return new DescribeRiskListCheckResultResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("riskCount")
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * riskCount.
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
