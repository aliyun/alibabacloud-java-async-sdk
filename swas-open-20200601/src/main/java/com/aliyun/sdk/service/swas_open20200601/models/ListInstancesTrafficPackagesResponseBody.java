// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesTrafficPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesTrafficPackagesResponseBody</p>
 */
public class ListInstancesTrafficPackagesResponseBody extends TeaModel {
    @NameInMap("InstanceTrafficPackageUsages")
    private java.util.List < InstanceTrafficPackageUsages> instanceTrafficPackageUsages;

    @NameInMap("RequestId")
    private String requestId;

    private ListInstancesTrafficPackagesResponseBody(Builder builder) {
        this.instanceTrafficPackageUsages = builder.instanceTrafficPackageUsages;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesTrafficPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTrafficPackageUsages
     */
    public java.util.List < InstanceTrafficPackageUsages> getInstanceTrafficPackageUsages() {
        return this.instanceTrafficPackageUsages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceTrafficPackageUsages> instanceTrafficPackageUsages; 
        private String requestId; 

        /**
         * The details of the data transfer plans of the simple application servers.
         */
        public Builder instanceTrafficPackageUsages(java.util.List < InstanceTrafficPackageUsages> instanceTrafficPackageUsages) {
            this.instanceTrafficPackageUsages = instanceTrafficPackageUsages;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancesTrafficPackagesResponseBody build() {
            return new ListInstancesTrafficPackagesResponseBody(this);
        } 

    } 

    public static class InstanceTrafficPackageUsages extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TrafficOverflow")
        private Long trafficOverflow;

        @NameInMap("TrafficPackageRemaining")
        private Long trafficPackageRemaining;

        @NameInMap("TrafficPackageTotal")
        private Long trafficPackageTotal;

        @NameInMap("TrafficUsed")
        private Long trafficUsed;

        private InstanceTrafficPackageUsages(Builder builder) {
            this.instanceId = builder.instanceId;
            this.trafficOverflow = builder.trafficOverflow;
            this.trafficPackageRemaining = builder.trafficPackageRemaining;
            this.trafficPackageTotal = builder.trafficPackageTotal;
            this.trafficUsed = builder.trafficUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTrafficPackageUsages create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return trafficOverflow
         */
        public Long getTrafficOverflow() {
            return this.trafficOverflow;
        }

        /**
         * @return trafficPackageRemaining
         */
        public Long getTrafficPackageRemaining() {
            return this.trafficPackageRemaining;
        }

        /**
         * @return trafficPackageTotal
         */
        public Long getTrafficPackageTotal() {
            return this.trafficPackageTotal;
        }

        /**
         * @return trafficUsed
         */
        public Long getTrafficUsed() {
            return this.trafficUsed;
        }

        public static final class Builder {
            private String instanceId; 
            private Long trafficOverflow; 
            private Long trafficPackageRemaining; 
            private Long trafficPackageTotal; 
            private Long trafficUsed; 

            /**
             * The ID of the simple application server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The data transfers that exceeds the quota of the data transfer plan in the current month. Unit: Byte.
             */
            public Builder trafficOverflow(Long trafficOverflow) {
                this.trafficOverflow = trafficOverflow;
                return this;
            }

            /**
             * The unused quota of the data transfer plan in the current month. Unit: Byte.
             */
            public Builder trafficPackageRemaining(Long trafficPackageRemaining) {
                this.trafficPackageRemaining = trafficPackageRemaining;
                return this;
            }

            /**
             * The quota of the data transfer plan in the current month. Unit: Byte.
             * <p>
             * 
             * >  TrafficPackageTotal = TrafficUsed + TrafficPackageRemaining
             */
            public Builder trafficPackageTotal(Long trafficPackageTotal) {
                this.trafficPackageTotal = trafficPackageTotal;
                return this;
            }

            /**
             * The used quota of the data transfer plan in the current month. Unit: Byte.
             */
            public Builder trafficUsed(Long trafficUsed) {
                this.trafficUsed = trafficUsed;
                return this;
            }

            public InstanceTrafficPackageUsages build() {
                return new InstanceTrafficPackageUsages(this);
            } 

        } 

    }
}
