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
 * {@link ApplyCoordinationForCoordinatorRequest} extends {@link RequestModel}
 *
 * <p>ApplyCoordinationForCoordinatorRequest</p>
 */
public class ApplyCoordinationForCoordinatorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CoordinationResourceCandidates")
    private java.util.List<CoordinationResourceCandidates> coordinationResourceCandidates;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InitiatorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String initiatorType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private ApplyCoordinationForCoordinatorRequest(Builder builder) {
        super(builder);
        this.coordinationResourceCandidates = builder.coordinationResourceCandidates;
        this.initiatorType = builder.initiatorType;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCoordinationForCoordinatorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coordinationResourceCandidates
     */
    public java.util.List<CoordinationResourceCandidates> getCoordinationResourceCandidates() {
        return this.coordinationResourceCandidates;
    }

    /**
     * @return initiatorType
     */
    public String getInitiatorType() {
        return this.initiatorType;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ApplyCoordinationForCoordinatorRequest, Builder> {
        private java.util.List<CoordinationResourceCandidates> coordinationResourceCandidates; 
        private String initiatorType; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ApplyCoordinationForCoordinatorRequest request) {
            super(request);
            this.coordinationResourceCandidates = request.coordinationResourceCandidates;
            this.initiatorType = request.initiatorType;
            this.uuid = request.uuid;
        } 

        /**
         * CoordinationResourceCandidates.
         */
        public Builder coordinationResourceCandidates(java.util.List<CoordinationResourceCandidates> coordinationResourceCandidates) {
            this.putBodyParameter("CoordinationResourceCandidates", coordinationResourceCandidates);
            this.coordinationResourceCandidates = coordinationResourceCandidates;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN_INITIATE</p>
         */
        public Builder initiatorType(String initiatorType) {
            this.putBodyParameter("InitiatorType", initiatorType);
            this.initiatorType = initiatorType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-uuid-12345</p>
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ApplyCoordinationForCoordinatorRequest build() {
            return new ApplyCoordinationForCoordinatorRequest(this);
        } 

    } 

    /**
     * 
     * {@link ApplyCoordinationForCoordinatorRequest} extends {@link TeaModel}
     *
     * <p>ApplyCoordinationForCoordinatorRequest</p>
     */
    public static class CoordinationResourceCandidates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerEndUserId")
        private String ownerEndUserId;

        @com.aliyun.core.annotation.NameInMap("OwnerWyId")
        private String ownerWyId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private CoordinationResourceCandidates(Builder builder) {
            this.ownerEndUserId = builder.ownerEndUserId;
            this.ownerWyId = builder.ownerWyId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoordinationResourceCandidates create() {
            return builder().build();
        }

        /**
         * @return ownerEndUserId
         */
        public String getOwnerEndUserId() {
            return this.ownerEndUserId;
        }

        /**
         * @return ownerWyId
         */
        public String getOwnerWyId() {
            return this.ownerWyId;
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
            private String ownerEndUserId; 
            private String ownerWyId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceRegionId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(CoordinationResourceCandidates model) {
                this.ownerEndUserId = model.ownerEndUserId;
                this.ownerWyId = model.ownerWyId;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceRegionId = model.resourceRegionId;
                this.resourceType = model.resourceType;
            } 

            /**
             * OwnerEndUserId.
             */
            public Builder ownerEndUserId(String ownerEndUserId) {
                this.ownerEndUserId = ownerEndUserId;
                return this;
            }

            /**
             * OwnerWyId.
             */
            public Builder ownerWyId(String ownerWyId) {
                this.ownerWyId = ownerWyId;
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

            public CoordinationResourceCandidates build() {
                return new CoordinationResourceCandidates(this);
            } 

        } 

    }
}
