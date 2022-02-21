// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerSpecResponseBody</p>
 */
public class DescribeLoadBalancerSpecResponseBody extends TeaModel {
    @NameInMap("LoadBalancerSpecs")
    private java.util.List < LoadBalancerSpecs> loadBalancerSpecs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLoadBalancerSpecResponseBody(Builder builder) {
        this.loadBalancerSpecs = builder.loadBalancerSpecs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerSpecResponseBody create() {
        return builder().build();
    }

    /**
     * @return loadBalancerSpecs
     */
    public java.util.List < LoadBalancerSpecs> getLoadBalancerSpecs() {
        return this.loadBalancerSpecs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < LoadBalancerSpecs> loadBalancerSpecs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * LoadBalancerSpecs.
         */
        public Builder loadBalancerSpecs(java.util.List < LoadBalancerSpecs> loadBalancerSpecs) {
            this.loadBalancerSpecs = loadBalancerSpecs;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadBalancerSpecResponseBody build() {
            return new DescribeLoadBalancerSpecResponseBody(this);
        } 

    } 

    public static class LoadBalancerSpecs extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("LoadBalancerSpec")
        private String loadBalancerSpec;

        private LoadBalancerSpecs(Builder builder) {
            this.displayName = builder.displayName;
            this.loadBalancerSpec = builder.loadBalancerSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerSpecs create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return loadBalancerSpec
         */
        public String getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        public static final class Builder {
            private String displayName; 
            private String loadBalancerSpec; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * LoadBalancerSpec.
             */
            public Builder loadBalancerSpec(String loadBalancerSpec) {
                this.loadBalancerSpec = loadBalancerSpec;
                return this;
            }

            public LoadBalancerSpecs build() {
                return new LoadBalancerSpecs(this);
            } 

        } 

    }
}
