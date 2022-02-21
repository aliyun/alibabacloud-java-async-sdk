// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClassicLinkInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClassicLinkInstancesResponseBody</p>
 */
public class DescribeClassicLinkInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Links")
    private Links links;

    private DescribeClassicLinkInstancesResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.links = builder.links;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClassicLinkInstancesResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return links
     */
    public Links getLinks() {
        return this.links;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private Links links; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of connections.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Returns the connection information of a classic network instance and a VPC.
         */
        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        public DescribeClassicLinkInstancesResponseBody build() {
            return new DescribeClassicLinkInstancesResponseBody(this);
        } 

    } 

    public static class Link extends TeaModel {
        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("InstanceId")
        private String instanceId;

        private Link(Builder builder) {
            this.vpcId = builder.vpcId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Link create() {
            return builder().build();
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String vpcId; 
            private String instanceId; 

            /**
             * VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Link build() {
                return new Link(this);
            } 

        } 

    }
    public static class Links extends TeaModel {
        @NameInMap("Link")
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
