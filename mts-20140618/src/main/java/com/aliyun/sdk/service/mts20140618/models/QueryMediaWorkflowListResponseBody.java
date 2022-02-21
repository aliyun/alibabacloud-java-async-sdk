// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaWorkflowListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaWorkflowListResponseBody</p>
 */
public class QueryMediaWorkflowListResponseBody extends TeaModel {
    @NameInMap("MediaWorkflowList")
    private MediaWorkflowList mediaWorkflowList;

    @NameInMap("NonExistMediaWorkflowIds")
    private NonExistMediaWorkflowIds nonExistMediaWorkflowIds;

    @NameInMap("RequestId")
    private String requestId;

    private QueryMediaWorkflowListResponseBody(Builder builder) {
        this.mediaWorkflowList = builder.mediaWorkflowList;
        this.nonExistMediaWorkflowIds = builder.nonExistMediaWorkflowIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaWorkflowListResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaWorkflowList
     */
    public MediaWorkflowList getMediaWorkflowList() {
        return this.mediaWorkflowList;
    }

    /**
     * @return nonExistMediaWorkflowIds
     */
    public NonExistMediaWorkflowIds getNonExistMediaWorkflowIds() {
        return this.nonExistMediaWorkflowIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaWorkflowList mediaWorkflowList; 
        private NonExistMediaWorkflowIds nonExistMediaWorkflowIds; 
        private String requestId; 

        /**
         * MediaWorkflowList.
         */
        public Builder mediaWorkflowList(MediaWorkflowList mediaWorkflowList) {
            this.mediaWorkflowList = mediaWorkflowList;
            return this;
        }

        /**
         * NonExistMediaWorkflowIds.
         */
        public Builder nonExistMediaWorkflowIds(NonExistMediaWorkflowIds nonExistMediaWorkflowIds) {
            this.nonExistMediaWorkflowIds = nonExistMediaWorkflowIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMediaWorkflowListResponseBody build() {
            return new QueryMediaWorkflowListResponseBody(this);
        } 

    } 

    public static class MediaWorkflow extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("MediaWorkflowId")
        private String mediaWorkflowId;

        @NameInMap("Name")
        private String name;

        @NameInMap("State")
        private String state;

        @NameInMap("Topology")
        private String topology;

        @NameInMap("TriggerMode")
        private String triggerMode;

        private MediaWorkflow(Builder builder) {
            this.creationTime = builder.creationTime;
            this.mediaWorkflowId = builder.mediaWorkflowId;
            this.name = builder.name;
            this.state = builder.state;
            this.topology = builder.topology;
            this.triggerMode = builder.triggerMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaWorkflow create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return mediaWorkflowId
         */
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return topology
         */
        public String getTopology() {
            return this.topology;
        }

        /**
         * @return triggerMode
         */
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public static final class Builder {
            private String creationTime; 
            private String mediaWorkflowId; 
            private String name; 
            private String state; 
            private String topology; 
            private String triggerMode; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * MediaWorkflowId.
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Topology.
             */
            public Builder topology(String topology) {
                this.topology = topology;
                return this;
            }

            /**
             * TriggerMode.
             */
            public Builder triggerMode(String triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            public MediaWorkflow build() {
                return new MediaWorkflow(this);
            } 

        } 

    }
    public static class MediaWorkflowList extends TeaModel {
        @NameInMap("MediaWorkflow")
        private java.util.List < MediaWorkflow> mediaWorkflow;

        private MediaWorkflowList(Builder builder) {
            this.mediaWorkflow = builder.mediaWorkflow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaWorkflowList create() {
            return builder().build();
        }

        /**
         * @return mediaWorkflow
         */
        public java.util.List < MediaWorkflow> getMediaWorkflow() {
            return this.mediaWorkflow;
        }

        public static final class Builder {
            private java.util.List < MediaWorkflow> mediaWorkflow; 

            /**
             * MediaWorkflow.
             */
            public Builder mediaWorkflow(java.util.List < MediaWorkflow> mediaWorkflow) {
                this.mediaWorkflow = mediaWorkflow;
                return this;
            }

            public MediaWorkflowList build() {
                return new MediaWorkflowList(this);
            } 

        } 

    }
    public static class NonExistMediaWorkflowIds extends TeaModel {
        @NameInMap("MediaWorkflowId")
        private java.util.List < String > mediaWorkflowId;

        private NonExistMediaWorkflowIds(Builder builder) {
            this.mediaWorkflowId = builder.mediaWorkflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistMediaWorkflowIds create() {
            return builder().build();
        }

        /**
         * @return mediaWorkflowId
         */
        public java.util.List < String > getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public static final class Builder {
            private java.util.List < String > mediaWorkflowId; 

            /**
             * MediaWorkflowId.
             */
            public Builder mediaWorkflowId(java.util.List < String > mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            public NonExistMediaWorkflowIds build() {
                return new NonExistMediaWorkflowIds(this);
            } 

        } 

    }
}
