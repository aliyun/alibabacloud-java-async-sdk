// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterDashboardResponseBody</p>
 */
public class DescribeClusterDashboardResponseBody extends TeaModel {
    @NameInMap("Dashboard")
    private Dashboard dashboard;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterDashboardResponseBody(Builder builder) {
        this.dashboard = builder.dashboard;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterDashboardResponseBody create() {
        return builder().build();
    }

    /**
     * @return dashboard
     */
    public Dashboard getDashboard() {
        return this.dashboard;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Dashboard dashboard; 
        private String requestId; 

        /**
         * Dashboard.
         */
        public Builder dashboard(Dashboard dashboard) {
            this.dashboard = dashboard;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterDashboardResponseBody build() {
            return new DescribeClusterDashboardResponseBody(this);
        } 

    } 

    public static class Node extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Load")
        private String load;

        @NameInMap("Status")
        private String status;

        private Node(Builder builder) {
            this.address = builder.address;
            this.load = builder.load;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return load
         */
        public String getLoad() {
            return this.load;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String address; 
            private String load; 
            private String status; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Load.
             */
            public Builder load(String load) {
                this.load = load;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("Node")
        private java.util.List < Node> node;

        private Nodes(Builder builder) {
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return node
         */
        public java.util.List < Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List < Node> node; 

            /**
             * Node.
             */
            public Builder node(java.util.List < Node> node) {
                this.node = node;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class DataCenter extends TeaModel {
        @NameInMap("DataCenterId")
        private String dataCenterId;

        @NameInMap("Nodes")
        private Nodes nodes;

        private DataCenter(Builder builder) {
            this.dataCenterId = builder.dataCenterId;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCenter create() {
            return builder().build();
        }

        /**
         * @return dataCenterId
         */
        public String getDataCenterId() {
            return this.dataCenterId;
        }

        /**
         * @return nodes
         */
        public Nodes getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private String dataCenterId; 
            private Nodes nodes; 

            /**
             * DataCenterId.
             */
            public Builder dataCenterId(String dataCenterId) {
                this.dataCenterId = dataCenterId;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(Nodes nodes) {
                this.nodes = nodes;
                return this;
            }

            public DataCenter build() {
                return new DataCenter(this);
            } 

        } 

    }
    public static class DataCenters extends TeaModel {
        @NameInMap("DataCenter")
        private java.util.List < DataCenter> dataCenter;

        private DataCenters(Builder builder) {
            this.dataCenter = builder.dataCenter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCenters create() {
            return builder().build();
        }

        /**
         * @return dataCenter
         */
        public java.util.List < DataCenter> getDataCenter() {
            return this.dataCenter;
        }

        public static final class Builder {
            private java.util.List < DataCenter> dataCenter; 

            /**
             * DataCenter.
             */
            public Builder dataCenter(java.util.List < DataCenter> dataCenter) {
                this.dataCenter = dataCenter;
                return this;
            }

            public DataCenters build() {
                return new DataCenters(this);
            } 

        } 

    }
    public static class Dashboard extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("DataCenters")
        private DataCenters dataCenters;

        private Dashboard(Builder builder) {
            this.clusterId = builder.clusterId;
            this.dataCenters = builder.dataCenters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dashboard create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return dataCenters
         */
        public DataCenters getDataCenters() {
            return this.dataCenters;
        }

        public static final class Builder {
            private String clusterId; 
            private DataCenters dataCenters; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * DataCenters.
             */
            public Builder dataCenters(DataCenters dataCenters) {
                this.dataCenters = dataCenters;
                return this;
            }

            public Dashboard build() {
                return new Dashboard(this);
            } 

        } 

    }
}
