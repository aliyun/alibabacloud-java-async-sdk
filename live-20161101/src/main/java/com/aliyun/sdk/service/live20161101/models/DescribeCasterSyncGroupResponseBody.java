// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterSyncGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterSyncGroupResponseBody</p>
 */
public class DescribeCasterSyncGroupResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SyncGroups")
    private SyncGroups syncGroups;

    private DescribeCasterSyncGroupResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.requestId = builder.requestId;
        this.syncGroups = builder.syncGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterSyncGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncGroups
     */
    public SyncGroups getSyncGroups() {
        return this.syncGroups;
    }

    public static final class Builder {
        private String casterId; 
        private String requestId; 
        private SyncGroups syncGroups; 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
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
         * SyncGroups.
         */
        public Builder syncGroups(SyncGroups syncGroups) {
            this.syncGroups = syncGroups;
            return this;
        }

        public DescribeCasterSyncGroupResponseBody build() {
            return new DescribeCasterSyncGroupResponseBody(this);
        } 

    } 

    public static class ResourceIds extends TeaModel {
        @NameInMap("ResourceId")
        private java.util.List < String > resourceId;

        private ResourceIds(Builder builder) {
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceIds create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public java.util.List < String > getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.List < String > resourceId; 

            /**
             * ResourceId.
             */
            public Builder resourceId(java.util.List < String > resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public ResourceIds build() {
                return new ResourceIds(this);
            } 

        } 

    }
    public static class SyncGroup extends TeaModel {
        @NameInMap("HostResourceId")
        private String hostResourceId;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("ResourceIds")
        private ResourceIds resourceIds;

        private SyncGroup(Builder builder) {
            this.hostResourceId = builder.hostResourceId;
            this.mode = builder.mode;
            this.resourceIds = builder.resourceIds;
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
        public ResourceIds getResourceIds() {
            return this.resourceIds;
        }

        public static final class Builder {
            private String hostResourceId; 
            private Integer mode; 
            private ResourceIds resourceIds; 

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
            public Builder resourceIds(ResourceIds resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            public SyncGroup build() {
                return new SyncGroup(this);
            } 

        } 

    }
    public static class SyncGroups extends TeaModel {
        @NameInMap("SyncGroup")
        private java.util.List < SyncGroup> syncGroup;

        private SyncGroups(Builder builder) {
            this.syncGroup = builder.syncGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncGroups create() {
            return builder().build();
        }

        /**
         * @return syncGroup
         */
        public java.util.List < SyncGroup> getSyncGroup() {
            return this.syncGroup;
        }

        public static final class Builder {
            private java.util.List < SyncGroup> syncGroup; 

            /**
             * SyncGroup.
             */
            public Builder syncGroup(java.util.List < SyncGroup> syncGroup) {
                this.syncGroup = syncGroup;
                return this;
            }

            public SyncGroups build() {
                return new SyncGroups(this);
            } 

        } 

    }
}
