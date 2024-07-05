// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersResponseBody</p>
 */
public class DescribeClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List < Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusters
     */
    public java.util.List < Clusters> getClusters() {
        return this.clusters;
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
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Clusters> clusters; 
        private String requestId; 
        private Long total; 

        /**
         * Clusters.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeClustersResponseBody build() {
            return new DescribeClustersResponseBody(this);
        } 

    } 

    public static class InternalPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Port")
        private java.util.List < String > port;

        private InternalPorts(Builder builder) {
            this.ipProtocol = builder.ipProtocol;
            this.platform = builder.platform;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternalPorts create() {
            return builder().build();
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return port
         */
        public java.util.List < String > getPort() {
            return this.port;
        }

        public static final class Builder {
            private String ipProtocol; 
            private String platform; 
            private java.util.List < String > port; 

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(java.util.List < String > port) {
                this.port = port;
                return this;
            }

            public InternalPorts build() {
                return new InternalPorts(this);
            } 

        } 

    }
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InternalPorts")
        private java.util.List < InternalPorts> internalPorts;

        @com.aliyun.core.annotation.NameInMap("MaintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Clusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.description = builder.description;
            this.internalPorts = builder.internalPorts;
            this.maintainTime = builder.maintainTime;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return internalPorts
         */
        public java.util.List < InternalPorts> getInternalPorts() {
            return this.internalPorts;
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String description; 
            private java.util.List < InternalPorts> internalPorts; 
            private String maintainTime; 
            private String name; 
            private String status; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InternalPorts.
             */
            public Builder internalPorts(java.util.List < InternalPorts> internalPorts) {
                this.internalPorts = internalPorts;
                return this;
            }

            /**
             * MaintainTime.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
