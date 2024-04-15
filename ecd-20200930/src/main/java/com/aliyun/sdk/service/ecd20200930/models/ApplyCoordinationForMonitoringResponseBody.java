// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyCoordinationForMonitoringResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyCoordinationForMonitoringResponseBody</p>
 */
public class ApplyCoordinationForMonitoringResponseBody extends TeaModel {
    @NameInMap("CoordinateFlowModels")
    private java.util.List < CoordinateFlowModels> coordinateFlowModels;

    @NameInMap("RequestId")
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
    public java.util.List < CoordinateFlowModels> getCoordinateFlowModels() {
        return this.coordinateFlowModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CoordinateFlowModels> coordinateFlowModels; 
        private String requestId; 

        /**
         * The list of stream collaboration models.
         */
        public Builder coordinateFlowModels(java.util.List < CoordinateFlowModels> coordinateFlowModels) {
            this.coordinateFlowModels = coordinateFlowModels;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApplyCoordinationForMonitoringResponseBody build() {
            return new ApplyCoordinationForMonitoringResponseBody(this);
        } 

    } 

    public static class CoordinateFlowModels extends TeaModel {
        @NameInMap("CoId")
        private String coId;

        @NameInMap("CoordinateStatus")
        private String coordinateStatus;

        @NameInMap("CoordinateTicket")
        private String coordinateTicket;

        @NameInMap("InitiatorType")
        private String initiatorType;

        @NameInMap("OwnerUserId")
        private String ownerUserId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
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
             * The ID of the stream collaboration.
             */
            public Builder coId(String coId) {
                this.coId = coId;
                return this;
            }

            /**
             * The current status of the collaboration task.
             * <p>
             * 
             * Valid values:
             * 
             * *   COORDINATING: The collaboration task is being executed.
             * 
             * *   TERMINATING: The collaboration task is being terminated.
             * 
             * *   TERMINATED: The collaboration task is terminated.
             * 
             * *   PENDING: The collaboration task is pending to be executed.
             */
            public Builder coordinateStatus(String coordinateStatus) {
                this.coordinateStatus = coordinateStatus;
                return this;
            }

            /**
             * The ticket that is used to establish the Adaptive Streaming Protocol (ASP)-based connection.
             */
            public Builder coordinateTicket(String coordinateTicket) {
                this.coordinateTicket = coordinateTicket;
                return this;
            }

            /**
             * The type of the initiator.
             * <p>
             * 
             * Valid values:
             * 
             * *   ADMIN_INITIATE_FORCE: The administrator forcibly initiates the collaboration request.
             * 
             * *   ADMIN_INITIATE: The administrator initiates the collaboration request.
             * 
             * *   COORDINATOR_INITIATE_FORCE: The coordinator forcibly initiates the collaboration request.
             */
            public Builder initiatorType(String initiatorType) {
                this.initiatorType = initiatorType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account of the end user.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * The ID of the cloud desktop.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The name of the cloud desktop.
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
