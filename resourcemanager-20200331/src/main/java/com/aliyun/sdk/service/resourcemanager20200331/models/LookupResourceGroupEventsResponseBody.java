// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link LookupResourceGroupEventsResponseBody} extends {@link TeaModel}
 *
 * <p>LookupResourceGroupEventsResponseBody</p>
 */
public class LookupResourceGroupEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LookupResourceGroupEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupResourceGroupEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
        return this.events;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Events> events; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LookupResourceGroupEventsResponseBody model) {
            this.events = model.events;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Events.
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LookupResourceGroupEventsResponseBody build() {
            return new LookupResourceGroupEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LookupResourceGroupEventsResponseBody} extends {@link TeaModel}
     *
     * <p>LookupResourceGroupEventsResponseBody</p>
     */
    public static class SourceResourceGroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupDisplayName")
        private String resourceGroupDisplayName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private SourceResourceGroupInfo(Builder builder) {
            this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceResourceGroupInfo create() {
            return builder().build();
        }

        /**
         * @return resourceGroupDisplayName
         */
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String resourceGroupDisplayName; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(SourceResourceGroupInfo model) {
                this.resourceGroupDisplayName = model.resourceGroupDisplayName;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * ResourceGroupDisplayName.
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public SourceResourceGroupInfo build() {
                return new SourceResourceGroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link LookupResourceGroupEventsResponseBody} extends {@link TeaModel}
     *
     * <p>LookupResourceGroupEventsResponseBody</p>
     */
    public static class TargetResourceGroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupDisplayName")
        private String resourceGroupDisplayName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private TargetResourceGroupInfo(Builder builder) {
            this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetResourceGroupInfo create() {
            return builder().build();
        }

        /**
         * @return resourceGroupDisplayName
         */
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String resourceGroupDisplayName; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(TargetResourceGroupInfo model) {
                this.resourceGroupDisplayName = model.resourceGroupDisplayName;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * ResourceGroupDisplayName.
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public TargetResourceGroupInfo build() {
                return new TargetResourceGroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link LookupResourceGroupEventsResponseBody} extends {@link TeaModel}
     *
     * <p>LookupResourceGroupEventsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupDisplayName")
        private String resourceGroupDisplayName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("SourceResourceGroupInfo")
        private SourceResourceGroupInfo sourceResourceGroupInfo;

        @com.aliyun.core.annotation.NameInMap("TargetResourceGroupInfo")
        private TargetResourceGroupInfo targetResourceGroupInfo;

        private Events(Builder builder) {
            this.changeType = builder.changeType;
            this.eventTime = builder.eventTime;
            this.regionId = builder.regionId;
            this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.service = builder.service;
            this.sourceResourceGroupInfo = builder.sourceResourceGroupInfo;
            this.targetResourceGroupInfo = builder.targetResourceGroupInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupDisplayName
         */
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return sourceResourceGroupInfo
         */
        public SourceResourceGroupInfo getSourceResourceGroupInfo() {
            return this.sourceResourceGroupInfo;
        }

        /**
         * @return targetResourceGroupInfo
         */
        public TargetResourceGroupInfo getTargetResourceGroupInfo() {
            return this.targetResourceGroupInfo;
        }

        public static final class Builder {
            private String changeType; 
            private String eventTime; 
            private String regionId; 
            private String resourceGroupDisplayName; 
            private String resourceGroupId; 
            private String resourceId; 
            private String resourceType; 
            private String service; 
            private SourceResourceGroupInfo sourceResourceGroupInfo; 
            private TargetResourceGroupInfo targetResourceGroupInfo; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.changeType = model.changeType;
                this.eventTime = model.eventTime;
                this.regionId = model.regionId;
                this.resourceGroupDisplayName = model.resourceGroupDisplayName;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.service = model.service;
                this.sourceResourceGroupInfo = model.sourceResourceGroupInfo;
                this.targetResourceGroupInfo = model.targetResourceGroupInfo;
            } 

            /**
             * ChangeType.
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupDisplayName.
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * SourceResourceGroupInfo.
             */
            public Builder sourceResourceGroupInfo(SourceResourceGroupInfo sourceResourceGroupInfo) {
                this.sourceResourceGroupInfo = sourceResourceGroupInfo;
                return this;
            }

            /**
             * TargetResourceGroupInfo.
             */
            public Builder targetResourceGroupInfo(TargetResourceGroupInfo targetResourceGroupInfo) {
                this.targetResourceGroupInfo = targetResourceGroupInfo;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
