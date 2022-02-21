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
         * MasterSlaveServerGroups.
         */
        public Builder masterSlaveServerGroups(MasterSlaveServerGroups masterSlaveServerGroups) {
            this.masterSlaveServerGroups = masterSlaveServerGroups;
            return this;
        }

        /**
         * RequestId.
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
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
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
             * Listeners.
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
    public static class MasterSlaveServerGroup extends TeaModel {
        @NameInMap("AssociatedObjects")
        private AssociatedObjects associatedObjects;

        @NameInMap("MasterSlaveServerGroupId")
        private String masterSlaveServerGroupId;

        @NameInMap("MasterSlaveServerGroupName")
        private String masterSlaveServerGroupName;

        private MasterSlaveServerGroup(Builder builder) {
            this.associatedObjects = builder.associatedObjects;
            this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
            this.masterSlaveServerGroupName = builder.masterSlaveServerGroupName;
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

        public static final class Builder {
            private AssociatedObjects associatedObjects; 
            private String masterSlaveServerGroupId; 
            private String masterSlaveServerGroupName; 

            /**
             * AssociatedObjects.
             */
            public Builder associatedObjects(AssociatedObjects associatedObjects) {
                this.associatedObjects = associatedObjects;
                return this;
            }

            /**
             * MasterSlaveServerGroupId.
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * MasterSlaveServerGroupName.
             */
            public Builder masterSlaveServerGroupName(String masterSlaveServerGroupName) {
                this.masterSlaveServerGroupName = masterSlaveServerGroupName;
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
