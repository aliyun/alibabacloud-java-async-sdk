// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
 */
public class DescribeMasterSlaveServerGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroups")
    private MasterSlaveServerGroups masterSlaveServerGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The primary/secondary server groups.</p>
         */
        public Builder masterSlaveServerGroups(MasterSlaveServerGroups masterSlaveServerGroups) {
            this.masterSlaveServerGroups = masterSlaveServerGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMasterSlaveServerGroupsResponseBody build() {
            return new DescribeMasterSlaveServerGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
     */
    public static class Listener extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The listener protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
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
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Listener")
        private java.util.List<Listener> listener;

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
        public java.util.List<Listener> getListener() {
            return this.listener;
        }

        public static final class Builder {
            private java.util.List<Listener> listener; 

            /**
             * Listener.
             */
            public Builder listener(java.util.List<Listener> listener) {
                this.listener = listener;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
     */
    public static class AssociatedObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Listeners")
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
             * <p>The listeners.</p>
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
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test_slb_yaochi_tag_key-0</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>000098dab00323fb</p>
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
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
     */
    public static class MasterSlaveServerGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedObjects")
        private AssociatedObjects associatedObjects;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
        private String masterSlaveServerGroupId;

        @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupName")
        private String masterSlaveServerGroupName;

        @com.aliyun.core.annotation.NameInMap("Tags")
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
             * <p>The associated resources.</p>
             */
            public Builder associatedObjects(AssociatedObjects associatedObjects) {
                this.associatedObjects = associatedObjects;
                return this;
            }

            /**
             * <p>The time when the CLB instance was created. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the primary/secondary server group.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-0bfuc******</p>
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * <p>The name of the primary/secondary server group.</p>
             * 
             * <strong>example:</strong>
             * <p>Group3</p>
             */
            public Builder masterSlaveServerGroupName(String masterSlaveServerGroupName) {
                this.masterSlaveServerGroupName = masterSlaveServerGroupName;
                return this;
            }

            /**
             * <p>The tags to add to the resource.</p>
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
    /**
     * 
     * {@link DescribeMasterSlaveServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMasterSlaveServerGroupsResponseBody</p>
     */
    public static class MasterSlaveServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroup")
        private java.util.List<MasterSlaveServerGroup> masterSlaveServerGroup;

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
        public java.util.List<MasterSlaveServerGroup> getMasterSlaveServerGroup() {
            return this.masterSlaveServerGroup;
        }

        public static final class Builder {
            private java.util.List<MasterSlaveServerGroup> masterSlaveServerGroup; 

            /**
             * MasterSlaveServerGroup.
             */
            public Builder masterSlaveServerGroup(java.util.List<MasterSlaveServerGroup> masterSlaveServerGroup) {
                this.masterSlaveServerGroup = masterSlaveServerGroup;
                return this;
            }

            public MasterSlaveServerGroups build() {
                return new MasterSlaveServerGroups(this);
            } 

        } 

    }
}
