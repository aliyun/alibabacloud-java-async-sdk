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
         * <p>The queried events.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F7701451-340B-5CB3-AEA7-7D831F7F****</p>
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
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestGroupA</p>
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekz25pfurj****</p>
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
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestGroupB</p>
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmwfrxcre****</p>
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
             * <p>The type of the resource change event.</p>
             * 
             * <strong>example:</strong>
             * <p>Add</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The time when the event was triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-04T18:35:17Z</p>
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>ProjectA</p>
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2sohr74****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9fpfe64****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The service code.</p>
             * <p>You can obtain the code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The source resource group.</p>
             */
            public Builder sourceResourceGroupInfo(SourceResourceGroupInfo sourceResourceGroupInfo) {
                this.sourceResourceGroupInfo = sourceResourceGroupInfo;
                return this;
            }

            /**
             * <p>The destination resource group.</p>
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
