// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ApplyCoordinationForMonitoringResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyCoordinationForMonitoringResponseBody</p>
 */
public class ApplyCoordinationForMonitoringResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CoordinateFlowModels")
    private java.util.List<CoordinateFlowModels> coordinateFlowModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ApplyCoordinationForMonitoringResponseBody(Builder builder) {
        this.coordinateFlowModels = builder.coordinateFlowModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCoordinationForMonitoringResponseBody create() {
        return builder().build();
    }

    /**
     * @return coordinateFlowModels
     */
    public java.util.List<CoordinateFlowModels> getCoordinateFlowModels() {
        return this.coordinateFlowModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CoordinateFlowModels> coordinateFlowModels; 
        private String requestId; 

        /**
         * <p>The list of stream collaboration models.</p>
         */
        public Builder coordinateFlowModels(java.util.List<CoordinateFlowModels> coordinateFlowModels) {
            this.coordinateFlowModels = coordinateFlowModels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApplyCoordinationForMonitoringResponseBody build() {
            return new ApplyCoordinationForMonitoringResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyCoordinationForMonitoringResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyCoordinationForMonitoringResponseBody</p>
     */
    public static class CoordinateFlowModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoId")
        private String coId;

        @com.aliyun.core.annotation.NameInMap("CoordinateStatus")
        private String coordinateStatus;

        @com.aliyun.core.annotation.NameInMap("CoordinateTicket")
        private String coordinateTicket;

        @com.aliyun.core.annotation.NameInMap("InitiatorType")
        private String initiatorType;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        private CoordinateFlowModels(Builder builder) {
            this.coId = builder.coId;
            this.coordinateStatus = builder.coordinateStatus;
            this.coordinateTicket = builder.coordinateTicket;
            this.initiatorType = builder.initiatorType;
            this.ownerUserId = builder.ownerUserId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoordinateFlowModels create() {
            return builder().build();
        }

        /**
         * @return coId
         */
        public String getCoId() {
            return this.coId;
        }

        /**
         * @return coordinateStatus
         */
        public String getCoordinateStatus() {
            return this.coordinateStatus;
        }

        /**
         * @return coordinateTicket
         */
        public String getCoordinateTicket() {
            return this.coordinateTicket;
        }

        /**
         * @return initiatorType
         */
        public String getInitiatorType() {
            return this.initiatorType;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        public static final class Builder {
            private String coId; 
            private String coordinateStatus; 
            private String coordinateTicket; 
            private String initiatorType; 
            private String ownerUserId; 
            private String resourceId; 
            private String resourceName; 

            /**
             * <p>The ID of the stream collaboration.</p>
             * 
             * <strong>example:</strong>
             * <p>co-0sot77uale3****</p>
             */
            public Builder coId(String coId) {
                this.coId = coId;
                return this;
            }

            /**
             * <p>The current status of the collaboration task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>COORDINATING: The collaboration task is being executed.</p>
             * </li>
             * <li><p>TERMINATING: The collaboration task is being terminated.</p>
             * </li>
             * <li><p>TERMINATED: The collaboration task is terminated.</p>
             * </li>
             * <li><p>PENDING: The collaboration task is pending to be executed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder coordinateStatus(String coordinateStatus) {
                this.coordinateStatus = coordinateStatus;
                return this;
            }

            /**
             * <p>The ticket that is used to establish the Adaptive Streaming Protocol (ASP)-based connection.</p>
             * 
             * <strong>example:</strong>
             * <p>1VDQ0VTUw0KW0Rlc2t0b3BdDQpHV1Rva2VuPTAwTzgwL3liS25zUEVGdkF6eU1Pc1ExeHZWdmk4VEE3NFJvU1V1d0dPYm1BNkNJWklDMHVNQklWcjU2NS80S0ZQekQ4aGFTR0ZHelZqMTFGbkRpWWgvUFF1Zm1xSXNGdFRFNFRWMExJNit3TkU0L2RMb04wNXBBSE5Tc3M4dWFXY3lwWE****</p>
             */
            public Builder coordinateTicket(String coordinateTicket) {
                this.coordinateTicket = coordinateTicket;
                return this;
            }

            /**
             * <p>The type of the initiator.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>ADMIN_INITIATE_FORCE: The administrator forcibly initiates the collaboration request.</p>
             * </li>
             * <li><p>ADMIN_INITIATE: The administrator initiates the collaboration request.</p>
             * </li>
             * <li><p>COORDINATOR_INITIATE_FORCE: The coordinator forcibly initiates the collaboration request.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COORDINATOR_INITIATE_FORCE</p>
             */
            public Builder initiatorType(String initiatorType) {
                this.initiatorType = initiatorType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The ID of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-96vi03f9emqnl****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The name of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>TestDesktop</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            public CoordinateFlowModels build() {
                return new CoordinateFlowModels(this);
            } 

        } 

    }
}
