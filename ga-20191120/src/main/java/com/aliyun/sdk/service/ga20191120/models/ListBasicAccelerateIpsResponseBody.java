// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListBasicAccelerateIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBasicAccelerateIpsResponseBody</p>
 */
public class ListBasicAccelerateIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccelerateIps")
    private java.util.List<AccelerateIps> accelerateIps;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBasicAccelerateIpsResponseBody(Builder builder) {
        this.accelerateIps = builder.accelerateIps;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBasicAccelerateIpsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateIps
     */
    public java.util.List<AccelerateIps> getAccelerateIps() {
        return this.accelerateIps;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<AccelerateIps> accelerateIps; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListBasicAccelerateIpsResponseBody model) {
            this.accelerateIps = model.accelerateIps;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The accelerated IP addresses of the basic GA instance.</p>
         */
        public Builder accelerateIps(java.util.List<AccelerateIps> accelerateIps) {
            this.accelerateIps = accelerateIps;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> was not returned, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBasicAccelerateIpsResponseBody build() {
            return new ListBasicAccelerateIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBasicAccelerateIpsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBasicAccelerateIpsResponseBody</p>
     */
    public static class AccelerateIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateIpAddress")
        private String accelerateIpAddress;

        @com.aliyun.core.annotation.NameInMap("AccelerateIpId")
        private String accelerateIpId;

        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("IpSetId")
        private String ipSetId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private AccelerateIps(Builder builder) {
            this.accelerateIpAddress = builder.accelerateIpAddress;
            this.accelerateIpId = builder.accelerateIpId;
            this.acceleratorId = builder.acceleratorId;
            this.ipSetId = builder.ipSetId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccelerateIps create() {
            return builder().build();
        }

        /**
         * @return accelerateIpAddress
         */
        public String getAccelerateIpAddress() {
            return this.accelerateIpAddress;
        }

        /**
         * @return accelerateIpId
         */
        public String getAccelerateIpId() {
            return this.accelerateIpId;
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return ipSetId
         */
        public String getIpSetId() {
            return this.ipSetId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String accelerateIpAddress; 
            private String accelerateIpId; 
            private String acceleratorId; 
            private String ipSetId; 
            private String state; 

            private Builder() {
            } 

            private Builder(AccelerateIps model) {
                this.accelerateIpAddress = model.accelerateIpAddress;
                this.accelerateIpId = model.accelerateIpId;
                this.acceleratorId = model.acceleratorId;
                this.ipSetId = model.ipSetId;
                this.state = model.state;
            } 

            /**
             * <p>The accelerated IP address of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>116.132.XX.XX</p>
             */
            public Builder accelerateIpAddress(String accelerateIpAddress) {
                this.accelerateIpAddress = accelerateIpAddress;
                return this;
            }

            /**
             * <p>The ID of the accelerated IP address of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gaip-bp1****</p>
             */
            public Builder accelerateIpId(String accelerateIpId) {
                this.accelerateIpId = accelerateIpId;
                return this;
            }

            /**
             * <p>The ID of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp17frjjh0udz4qz****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The ID of the acceleration region.</p>
             * 
             * <strong>example:</strong>
             * <p>ips-bp11r5jb8ogp122xl****</p>
             */
            public Builder ipSetId(String ipSetId) {
                this.ipSetId = ipSetId;
                return this;
            }

            /**
             * <p>The status of the accelerated IP address. Valid values:</p>
             * <ul>
             * <li><strong>active</strong>: The accelerated IP address is available.</li>
             * <li><strong>binding</strong>: The accelerated IP address is being associated.</li>
             * <li><strong>bound</strong>: The accelerated IP address is associated.</li>
             * <li><strong>unbinding</strong>: The accelerated IP address is being disassociated.</li>
             * <li><strong>deleting</strong>: The accelerated IP address is being deleted.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is unavailable when the accelerated IP address is being created.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AccelerateIps build() {
                return new AccelerateIps(this);
            } 

        } 

    }
}
