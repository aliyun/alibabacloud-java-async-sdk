// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReusableSlbResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReusableSlbResponseBody</p>
 */
public class DescribeReusableSlbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ReusableSlbList")
    private java.util.List < ReusableSlbList> reusableSlbList;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reusableSlbList
     */
    public java.util.List < ReusableSlbList> getReusableSlbList() {
        return this.reusableSlbList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ReusableSlbList> reusableSlbList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReusableSlbList.
         */
        public Builder reusableSlbList(java.util.List < ReusableSlbList> reusableSlbList) {
            this.reusableSlbList = reusableSlbList;
            return this;
        }

        public DescribeReusableSlbResponseBody build() {
            return new DescribeReusableSlbResponseBody(this);
        } 

    } 

    public static class ReusableSlbList extends TeaModel {
        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("LoadBalancerName")
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

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * LoadBalancerName.
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
