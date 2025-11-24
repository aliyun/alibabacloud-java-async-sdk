// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeReusableSlbResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReusableSlbResponseBody</p>
 */
public class DescribeReusableSlbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReusableSlbList")
    private java.util.List<ReusableSlbList> reusableSlbList;

    private DescribeReusableSlbResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.reusableSlbList = builder.reusableSlbList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReusableSlbResponseBody create() {
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
     * @return reusableSlbList
     */
    public java.util.List<ReusableSlbList> getReusableSlbList() {
        return this.reusableSlbList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ReusableSlbList> reusableSlbList; 

        private Builder() {
        } 

        private Builder(DescribeReusableSlbResponseBody model) {
            this.requestId = model.requestId;
            this.reusableSlbList = model.reusableSlbList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDDC0D86-2FC3-56FB-9213-96EB0A3523F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of SLB instances that can be reused.</p>
         */
        public Builder reusableSlbList(java.util.List<ReusableSlbList> reusableSlbList) {
            this.reusableSlbList = reusableSlbList;
            return this;
        }

        public DescribeReusableSlbResponseBody build() {
            return new DescribeReusableSlbResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReusableSlbResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReusableSlbResponseBody</p>
     */
    public static class ReusableSlbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
        private String loadBalancerName;

        private ReusableSlbList(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.loadBalancerName = builder.loadBalancerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReusableSlbList create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return loadBalancerName
         */
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private String loadBalancerName; 

            private Builder() {
            } 

            private Builder(ReusableSlbList model) {
                this.loadBalancerId = model.loadBalancerId;
                this.loadBalancerName = model.loadBalancerName;
            } 

            /**
             * <p>The ID of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp17xygzsxth0bwlz****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The name of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ad6044b015ac54484a20c47241175bb3</p>
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            public ReusableSlbList build() {
                return new ReusableSlbList(this);
            } 

        } 

    }
}
