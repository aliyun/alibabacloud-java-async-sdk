// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHostBaseInfoByInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHostBaseInfoByInstanceResponseBody</p>
 */
public class QueryHostBaseInfoByInstanceResponseBody extends TeaModel {
    @NameInMap("HostInstanceConsoleInfos")
    private java.util.List < HostInstanceConsoleInfos> hostInstanceConsoleInfos;

    @NameInMap("RequestId")
    private String requestId;

    private QueryHostBaseInfoByInstanceResponseBody(Builder builder) {
        this.hostInstanceConsoleInfos = builder.hostInstanceConsoleInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHostBaseInfoByInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostInstanceConsoleInfos
     */
    public java.util.List < HostInstanceConsoleInfos> getHostInstanceConsoleInfos() {
        return this.hostInstanceConsoleInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < HostInstanceConsoleInfos> hostInstanceConsoleInfos; 
        private String requestId; 

        /**
         * The queried host and instance information.
         */
        public Builder hostInstanceConsoleInfos(java.util.List < HostInstanceConsoleInfos> hostInstanceConsoleInfos) {
            this.hostInstanceConsoleInfos = hostInstanceConsoleInfos;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryHostBaseInfoByInstanceResponseBody build() {
            return new QueryHostBaseInfoByInstanceResponseBody(this);
        } 

    } 

    public static class HostInstanceConsoleInfos extends TeaModel {
        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
        private String port;

        @NameInMap("Role")
        private String role;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        private HostInstanceConsoleInfos(Builder builder) {
            this.clusterName = builder.clusterName;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expiredTime = builder.expiredTime;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.port = builder.port;
            this.role = builder.role;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostInstanceConsoleInfos create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterName; 
            private String engine; 
            private String engineVersion; 
            private String expiredTime; 
            private String hostName; 
            private String ip; 
            private String port; 
            private String role; 
            private String status; 
            private String vpcId; 

            /**
             * The instance type of the instance.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The database engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The version of the database engine.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The expiration time of the instance.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The name of the host on which the instance is deployed.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The IP address of the host on which the instance is deployed.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The port number of the host on which the instance is deployed.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The role of the instance.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The state of the instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID of the host on which the instance is deployed.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public HostInstanceConsoleInfos build() {
                return new HostInstanceConsoleInfos(this);
            } 

        } 

    }
}
