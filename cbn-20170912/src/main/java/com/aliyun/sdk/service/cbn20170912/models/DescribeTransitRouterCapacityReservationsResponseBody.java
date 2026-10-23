// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeTransitRouterCapacityReservationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouterCapacityReservationsResponseBody</p>
 */
public class DescribeTransitRouterCapacityReservationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentSets")
    private java.util.List<DeploymentSets> deploymentSets;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("MinimumTransitRouterCapacities")
    private java.util.List<MinimumTransitRouterCapacities> minimumTransitRouterCapacities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTransitRouterCapacityReservationsResponseBody(Builder builder) {
        this.deploymentSets = builder.deploymentSets;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.minimumTransitRouterCapacities = builder.minimumTransitRouterCapacities;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouterCapacityReservationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentSets
     */
    public java.util.List<DeploymentSets> getDeploymentSets() {
        return this.deploymentSets;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return minimumTransitRouterCapacities
     */
    public java.util.List<MinimumTransitRouterCapacities> getMinimumTransitRouterCapacities() {
        return this.minimumTransitRouterCapacities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DeploymentSets> deploymentSets; 
        private String lastModifiedTime; 
        private java.util.List<MinimumTransitRouterCapacities> minimumTransitRouterCapacities; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeTransitRouterCapacityReservationsResponseBody model) {
            this.deploymentSets = model.deploymentSets;
            this.lastModifiedTime = model.lastModifiedTime;
            this.minimumTransitRouterCapacities = model.minimumTransitRouterCapacities;
            this.requestId = model.requestId;
        } 

        /**
         * DeploymentSets.
         */
        public Builder deploymentSets(java.util.List<DeploymentSets> deploymentSets) {
            this.deploymentSets = deploymentSets;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-19T06:31:49Z</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * MinimumTransitRouterCapacities.
         */
        public Builder minimumTransitRouterCapacities(java.util.List<MinimumTransitRouterCapacities> minimumTransitRouterCapacities) {
            this.minimumTransitRouterCapacities = minimumTransitRouterCapacities;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTransitRouterCapacityReservationsResponseBody build() {
            return new DescribeTransitRouterCapacityReservationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransitRouterCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterCapacityReservationsResponseBody</p>
     */
    public static class DeploymentSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentSetID")
        private String deploymentSetID;

        @com.aliyun.core.annotation.NameInMap("ZoneID")
        private String zoneID;

        private DeploymentSets(Builder builder) {
            this.deploymentSetID = builder.deploymentSetID;
            this.zoneID = builder.zoneID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentSets create() {
            return builder().build();
        }

        /**
         * @return deploymentSetID
         */
        public String getDeploymentSetID() {
            return this.deploymentSetID;
        }

        /**
         * @return zoneID
         */
        public String getZoneID() {
            return this.zoneID;
        }

        public static final class Builder {
            private String deploymentSetID; 
            private String zoneID; 

            private Builder() {
            } 

            private Builder(DeploymentSets model) {
                this.deploymentSetID = model.deploymentSetID;
                this.zoneID = model.zoneID;
            } 

            /**
             * DeploymentSetID.
             */
            public Builder deploymentSetID(String deploymentSetID) {
                this.deploymentSetID = deploymentSetID;
                return this;
            }

            /**
             * ZoneID.
             */
            public Builder zoneID(String zoneID) {
                this.zoneID = zoneID;
                return this;
            }

            public DeploymentSets build() {
                return new DeploymentSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTransitRouterCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterCapacityReservationsResponseBody</p>
     */
    public static class DataProcessGbps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Effective")
        private Long effective;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Long target;

        private DataProcessGbps(Builder builder) {
            this.effective = builder.effective;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataProcessGbps create() {
            return builder().build();
        }

        /**
         * @return effective
         */
        public Long getEffective() {
            return this.effective;
        }

        /**
         * @return target
         */
        public Long getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Long effective; 
            private Long target; 

            private Builder() {
            } 

            private Builder(DataProcessGbps model) {
                this.effective = model.effective;
                this.target = model.target;
            } 

            /**
             * Effective.
             */
            public Builder effective(Long effective) {
                this.effective = effective;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Long target) {
                this.target = target;
                return this;
            }

            public DataProcessGbps build() {
                return new DataProcessGbps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTransitRouterCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterCapacityReservationsResponseBody</p>
     */
    public static class State extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private State(Builder builder) {
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static State create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(State model) {
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public State build() {
                return new State(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTransitRouterCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterCapacityReservationsResponseBody</p>
     */
    public static class MinimumTransitRouterCapacities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataProcessGbps")
        private DataProcessGbps dataProcessGbps;

        @com.aliyun.core.annotation.NameInMap("State")
        private State state;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private MinimumTransitRouterCapacities(Builder builder) {
            this.dataProcessGbps = builder.dataProcessGbps;
            this.state = builder.state;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MinimumTransitRouterCapacities create() {
            return builder().build();
        }

        /**
         * @return dataProcessGbps
         */
        public DataProcessGbps getDataProcessGbps() {
            return this.dataProcessGbps;
        }

        /**
         * @return state
         */
        public State getState() {
            return this.state;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private DataProcessGbps dataProcessGbps; 
            private State state; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(MinimumTransitRouterCapacities model) {
                this.dataProcessGbps = model.dataProcessGbps;
                this.state = model.state;
                this.zoneId = model.zoneId;
            } 

            /**
             * DataProcessGbps.
             */
            public Builder dataProcessGbps(DataProcessGbps dataProcessGbps) {
                this.dataProcessGbps = dataProcessGbps;
                return this;
            }

            /**
             * State.
             */
            public Builder state(State state) {
                this.state = state;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MinimumTransitRouterCapacities build() {
                return new MinimumTransitRouterCapacities(this);
            } 

        } 

    }
}
