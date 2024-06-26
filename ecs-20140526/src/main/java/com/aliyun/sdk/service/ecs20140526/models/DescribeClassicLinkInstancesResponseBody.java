// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClassicLinkInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClassicLinkInstancesResponseBody</p>
 */
public class DescribeClassicLinkInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Links")
    private Links links;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeClassicLinkInstancesResponseBody(Builder builder) {
        this.links = builder.links;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClassicLinkInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return links
     */
    public Links getLinks() {
        return this.links;
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
        private Links links; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the ClassicLink connections between the instances reside in the classic network and VPCs.
         */
        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of ClassicLink connections.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClassicLinkInstancesResponseBody build() {
            return new DescribeClassicLinkInstancesResponseBody(this);
        } 

    } 

    public static class Link extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Link(Builder builder) {
            this.instanceId = builder.instanceId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Link create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String instanceId; 
            private String vpcId; 

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Link build() {
                return new Link(this);
            } 

        } 

    }
    public static class Links extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Link")
        private java.util.List < Link> link;

        private Links(Builder builder) {
            this.link = builder.link;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Links create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public java.util.List < Link> getLink() {
            return this.link;
        }

        public static final class Builder {
            private java.util.List < Link> link; 

            /**
             * Link.
             */
            public Builder link(java.util.List < Link> link) {
                this.link = link;
                return this;
            }

            public Links build() {
                return new Links(this);
            } 

        } 

    }
}
