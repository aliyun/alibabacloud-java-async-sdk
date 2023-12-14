// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
 */
public class DescribeMasterSlaveServerGroupsResponseBody extends TeaModel {
    @NameInMap("MasterSlaveServerGroups")
    private MasterSlaveServerGroups masterSlaveServerGroups;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMasterSlaveServerGroupsResponseBody(Builder builder) {
        this.masterSlaveServerGroups = builder.masterSlaveServerGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMasterSlaveServerGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return masterSlaveServerGroups
     */
    public MasterSlaveServerGroups getMasterSlaveServerGroups() {
        return this.masterSlaveServerGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MasterSlaveServerGroups masterSlaveServerGroups; 
        private String requestId; 

        /**
         * The primary/secondary server groups.
         */
        public Builder masterSlaveServerGroups(MasterSlaveServerGroups masterSlaveServerGroups) {
            this.masterSlaveServerGroups = masterSlaveServerGroups;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMasterSlaveServerGroupsResponseBody build() {
            return new DescribeMasterSlaveServerGroupsResponseBody(this);
        } 

    } 

    public static class Listener extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private Listener(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listener create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * The listener port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The listener protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Listener build() {
                return new Listener(this);
            } 

        } 

    }
    public static class Listeners extends TeaModel {
        @NameInMap("Listener")
        private java.util.List < Listener> listener;

        private Listeners(Builder builder) {
            this.listener = builder.listener;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return listener
         */
        public java.util.List < Listener> getListener() {
            return this.listener;
        }

        public static final class Builder {
            private java.util.List < Listener> listener; 

            /**
             * Listener.
             */
            public Builder listener(java.util.List < Listener> listener) {
                this.listener = listener;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
    public static class AssociatedObjects extends TeaModel {
        @NameInMap("Listeners")
        private Listeners listeners;

        private AssociatedObjects(Builder builder) {
            this.listeners = builder.listeners;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedObjects create() {
            return builder().build();
        }

        /**
         * @return listeners
         */
        public Listeners getListeners() {
            return this.listeners;
        }

        public static final class Builder {
            private Listeners listeners; 

            /**
             * The listeners.
             */
            public Builder listeners(Listeners listeners) {
                this.listeners = listeners;
                return this;
            }

            public AssociatedObjects build() {
                return new AssociatedObjects(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class MasterSlaveServerGroup extends TeaModel {
        @NameInMap("AssociatedObjects")
        private AssociatedObjects associatedObjects;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MasterSlaveServerGroupId")
        private String masterSlaveServerGroupId;

        @NameInMap("MasterSlaveServerGroupName")
        private String masterSlaveServerGroupName;

        @NameInMap("Tags")
        private Tags tags;

        private MasterSlaveServerGroup(Builder builder) {
            this.associatedObjects = builder.associatedObjects;
            this.createTime = builder.createTime;
            this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
            this.masterSlaveServerGroupName = builder.masterSlaveServerGroupName;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterSlaveServerGroup create() {
            return builder().build();
        }

        /**
         * @return associatedObjects
         */
        public AssociatedObjects getAssociatedObjects() {
            return this.associatedObjects;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return masterSlaveServerGroupId
         */
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        /**
         * @return masterSlaveServerGroupName
         */
        public String getMasterSlaveServerGroupName() {
            return this.masterSlaveServerGroupName;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private AssociatedObjects associatedObjects; 
            private String createTime; 
            private String masterSlaveServerGroupId; 
            private String masterSlaveServerGroupName; 
            private Tags tags; 

            /**
             * The associated resources.
             */
            public Builder associatedObjects(AssociatedObjects associatedObjects) {
                this.associatedObjects = associatedObjects;
                return this;
            }

            /**
             * The time when the CLB instance was created. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the primary/secondary server group.
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * The name of the primary/secondary server group.
             */
            public Builder masterSlaveServerGroupName(String masterSlaveServerGroupName) {
                this.masterSlaveServerGroupName = masterSlaveServerGroupName;
                return this;
            }

            /**
             * The tags to add to the resource.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public MasterSlaveServerGroup build() {
                return new MasterSlaveServerGroup(this);
            } 

        } 

    }
    public static class MasterSlaveServerGroups extends TeaModel {
        @NameInMap("MasterSlaveServerGroup")
        private java.util.List < MasterSlaveServerGroup> masterSlaveServerGroup;

        private MasterSlaveServerGroups(Builder builder) {
            this.masterSlaveServerGroup = builder.masterSlaveServerGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterSlaveServerGroups create() {
            return builder().build();
        }

        /**
         * @return masterSlaveServerGroup
         */
        public java.util.List < MasterSlaveServerGroup> getMasterSlaveServerGroup() {
            return this.masterSlaveServerGroup;
        }

        public static final class Builder {
            private java.util.List < MasterSlaveServerGroup> masterSlaveServerGroup; 

            /**
             * MasterSlaveServerGroup.
             */
            public Builder masterSlaveServerGroup(java.util.List < MasterSlaveServerGroup> masterSlaveServerGroup) {
                this.masterSlaveServerGroup = masterSlaveServerGroup;
                return this;
            }

            public MasterSlaveServerGroups build() {
                return new MasterSlaveServerGroups(this);
            } 

        } 

    }
}
