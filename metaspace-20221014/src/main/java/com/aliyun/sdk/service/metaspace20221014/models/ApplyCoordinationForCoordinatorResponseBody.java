// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20221014.models;

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
 * {@link ApplyCoordinationForCoordinatorResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyCoordinationForCoordinatorResponseBody</p>
 */
public class ApplyCoordinationForCoordinatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CoordinateFlowModels")
    private java.util.List<CoordinateFlowModels> coordinateFlowModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ApplyCoordinationForCoordinatorResponseBody(Builder builder) {
        this.coordinateFlowModels = builder.coordinateFlowModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCoordinationForCoordinatorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ApplyCoordinationForCoordinatorResponseBody model) {
            this.coordinateFlowModels = model.coordinateFlowModels;
            this.requestId = model.requestId;
        } 

        /**
         * CoordinateFlowModels.
         */
        public Builder coordinateFlowModels(java.util.List<CoordinateFlowModels> coordinateFlowModels) {
            this.coordinateFlowModels = coordinateFlowModels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApplyCoordinationForCoordinatorResponseBody build() {
            return new ApplyCoordinationForCoordinatorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyCoordinationForCoordinatorResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyCoordinationForCoordinatorResponseBody</p>
     */
    public static class CoordinateFlowModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoId")
        private String coId;

        @com.aliyun.core.annotation.NameInMap("CoordinateStatus")
        private String coordinateStatus;

        @com.aliyun.core.annotation.NameInMap("CoordinateTicket")
        private String coordinateTicket;

        @com.aliyun.core.annotation.NameInMap("CoordinatorUserId")
        private String coordinatorUserId;

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
            this.coordinatorUserId = builder.coordinatorUserId;
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
         * @return coordinatorUserId
         */
        public String getCoordinatorUserId() {
            return this.coordinatorUserId;
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
            private String coordinatorUserId; 
            private String ownerUserId; 
            private String resourceId; 
            private String resourceName; 

            private Builder() {
            } 

            private Builder(CoordinateFlowModels model) {
                this.coId = model.coId;
                this.coordinateStatus = model.coordinateStatus;
                this.coordinateTicket = model.coordinateTicket;
                this.coordinatorUserId = model.coordinatorUserId;
                this.ownerUserId = model.ownerUserId;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
            } 

            /**
             * CoId.
             */
            public Builder coId(String coId) {
                this.coId = coId;
                return this;
            }

            /**
             * CoordinateStatus.
             */
            public Builder coordinateStatus(String coordinateStatus) {
                this.coordinateStatus = coordinateStatus;
                return this;
            }

            /**
             * CoordinateTicket.
             */
            public Builder coordinateTicket(String coordinateTicket) {
                this.coordinateTicket = coordinateTicket;
                return this;
            }

            /**
             * CoordinatorUserId.
             */
            public Builder coordinatorUserId(String coordinatorUserId) {
                this.coordinatorUserId = coordinatorUserId;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
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
