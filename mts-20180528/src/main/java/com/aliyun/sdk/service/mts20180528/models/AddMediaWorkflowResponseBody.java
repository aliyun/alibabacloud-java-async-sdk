// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMediaWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>AddMediaWorkflowResponseBody</p>
 */
public class AddMediaWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaWorkflow")
    private MediaWorkflow mediaWorkflow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddMediaWorkflowResponseBody(Builder builder) {
        this.mediaWorkflow = builder.mediaWorkflow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaWorkflowResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaWorkflow
     */
    public MediaWorkflow getMediaWorkflow() {
        return this.mediaWorkflow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaWorkflow mediaWorkflow; 
        private String requestId; 

        /**
         * MediaWorkflow.
         */
        public Builder mediaWorkflow(MediaWorkflow mediaWorkflow) {
            this.mediaWorkflow = mediaWorkflow;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddMediaWorkflowResponseBody build() {
            return new AddMediaWorkflowResponseBody(this);
        } 

    } 

    public static class MediaWorkflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
        private String mediaWorkflowId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Topology")
        private String topology;

        @com.aliyun.core.annotation.NameInMap("TriggerMode")
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
}
