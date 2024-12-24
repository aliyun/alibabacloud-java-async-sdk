// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20220307.models;

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
 * {@link ApplyCoordinationWithCodeResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyCoordinationWithCodeResponseBody</p>
 */
public class ApplyCoordinationWithCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ApplyCoordinationWithCodeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCoordinationWithCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApplyCoordinationWithCodeResponseBody build() {
            return new ApplyCoordinationWithCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyCoordinationWithCodeResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyCoordinationWithCodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoId")
        private String coId;

        @com.aliyun.core.annotation.NameInMap("CoordinateStatus")
        private String coordinateStatus;

        @com.aliyun.core.annotation.NameInMap("CoordinateTicket")
        private String coordinateTicket;

        @com.aliyun.core.annotation.NameInMap("CoordinatorAliUid")
        private Long coordinatorAliUid;

        @com.aliyun.core.annotation.NameInMap("CoordinatorUserId")
        private String coordinatorUserId;

        @com.aliyun.core.annotation.NameInMap("OwnerAliUid")
        private Long ownerAliUid;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Data(Builder builder) {
            this.coId = builder.coId;
            this.coordinateStatus = builder.coordinateStatus;
            this.coordinateTicket = builder.coordinateTicket;
            this.coordinatorAliUid = builder.coordinatorAliUid;
            this.coordinatorUserId = builder.coordinatorUserId;
            this.ownerAliUid = builder.ownerAliUid;
            this.ownerUserId = builder.ownerUserId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return coordinatorAliUid
         */
        public Long getCoordinatorAliUid() {
            return this.coordinatorAliUid;
        }

        /**
         * @return coordinatorUserId
         */
        public String getCoordinatorUserId() {
            return this.coordinatorUserId;
        }

        /**
         * @return ownerAliUid
         */
        public Long getOwnerAliUid() {
            return this.ownerAliUid;
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

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String coId; 
            private String coordinateStatus; 
            private String coordinateTicket; 
            private Long coordinatorAliUid; 
            private String coordinatorUserId; 
            private Long ownerAliUid; 
            private String ownerUserId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceRegionId; 
            private String resourceType; 

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
             * CoordinatorAliUid.
             */
            public Builder coordinatorAliUid(Long coordinatorAliUid) {
                this.coordinatorAliUid = coordinatorAliUid;
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
             * OwnerAliUid.
             */
            public Builder ownerAliUid(Long ownerAliUid) {
                this.ownerAliUid = ownerAliUid;
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

            /**
             * ResourceRegionId.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
