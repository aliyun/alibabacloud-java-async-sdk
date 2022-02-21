// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterSyncGroupRequest} extends {@link RequestModel}
 *
 * <p>SetCasterSyncGroupRequest</p>
 */
public class SetCasterSyncGroupRequest extends Request {
    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SyncGroup")
    private java.util.List < SyncGroup> syncGroup;

    private SetCasterSyncGroupRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.syncGroup = builder.syncGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCasterSyncGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return syncGroup
     */
    public java.util.List < SyncGroup> getSyncGroup() {
        return this.syncGroup;
    }

    public static final class Builder extends Request.Builder<SetCasterSyncGroupRequest, Builder> {
        private String casterId; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List < SyncGroup> syncGroup; 

        private Builder() {
            super();
        } 

        private Builder(SetCasterSyncGroupRequest response) {
            super(response);
            this.casterId = response.casterId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.syncGroup = response.syncGroup;
        } 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SyncGroup.
         */
        public Builder syncGroup(java.util.List < SyncGroup> syncGroup) {
            this.putQueryParameter("SyncGroup", syncGroup);
            this.syncGroup = syncGroup;
            return this;
        }

        @Override
        public SetCasterSyncGroupRequest build() {
            return new SetCasterSyncGroupRequest(this);
        } 

    } 

    public static class SyncGroup extends TeaModel {
        @NameInMap("HostResourceId")
        private String hostResourceId;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("ResourceIds")
        private java.util.List < String > resourceIds;

        @NameInMap("SyncDelayThreshold")
        private Long syncDelayThreshold;

        @NameInMap("SyncOffsets")
        private java.util.List < Integer > syncOffsets;

        private SyncGroup(Builder builder) {
            this.hostResourceId = builder.hostResourceId;
            this.mode = builder.mode;
            this.resourceIds = builder.resourceIds;
            this.syncDelayThreshold = builder.syncDelayThreshold;
            this.syncOffsets = builder.syncOffsets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncGroup create() {
            return builder().build();
        }

        /**
         * @return hostResourceId
         */
        public String getHostResourceId() {
            return this.hostResourceId;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return resourceIds
         */
        public java.util.List < String > getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return syncDelayThreshold
         */
        public Long getSyncDelayThreshold() {
            return this.syncDelayThreshold;
        }

        /**
         * @return syncOffsets
         */
        public java.util.List < Integer > getSyncOffsets() {
            return this.syncOffsets;
        }

        public static final class Builder {
            private String hostResourceId; 
            private Integer mode; 
            private java.util.List < String > resourceIds; 
            private Long syncDelayThreshold; 
            private java.util.List < Integer > syncOffsets; 

            /**
             * HostResourceId.
             */
            public Builder hostResourceId(String hostResourceId) {
                this.hostResourceId = hostResourceId;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * ResourceIds.
             */
            public Builder resourceIds(java.util.List < String > resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * SyncDelayThreshold.
             */
            public Builder syncDelayThreshold(Long syncDelayThreshold) {
                this.syncDelayThreshold = syncDelayThreshold;
                return this;
            }

            /**
             * SyncOffsets.
             */
            public Builder syncOffsets(java.util.List < Integer > syncOffsets) {
                this.syncOffsets = syncOffsets;
                return this;
            }

            public SyncGroup build() {
                return new SyncGroup(this);
            } 

        } 

    }
}
