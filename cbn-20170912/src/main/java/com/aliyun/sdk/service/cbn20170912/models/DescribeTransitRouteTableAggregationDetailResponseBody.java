// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitRouteTableAggregationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouteTableAggregationDetailResponseBody</p>
 */
public class DescribeTransitRouteTableAggregationDetailResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeTransitRouteTableAggregationDetailResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouteTableAggregationDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < Data> data; 
        private String requestId; 
        private Integer total; 

        /**
         * The number of entries returned per page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The configuration of the aggregate route.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * The total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeTransitRouteTableAggregationDetailResponseBody build() {
            return new DescribeTransitRouteTableAggregationDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String instanceId; 
            private String status; 

            /**
             * The error message returned if the configuration of the aggregate route fails.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) for which the aggregate route is configured.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The status of the aggregate route. Valid values:
             * <p>
             * 
             * *   **Configured**: The aggregate route is advertised to the VPC.
             * *   **Configuring**: The aggregate route is being advertised.
             * *   **ConfigFailed**: The aggregate route failed to be advertised.
             * *   **PartialConfigured**: Failed to advertise the aggregate route to some VPCs.
             * *   **Deleting**: The aggregate route is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
