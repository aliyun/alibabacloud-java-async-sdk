// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMediaWorkflowResponseBody</p>
 */
public class UpdateMediaWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaWorkflow")
    private MediaWorkflow mediaWorkflow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateMediaWorkflowResponseBody(Builder builder) {
        this.mediaWorkflow = builder.mediaWorkflow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaWorkflowResponseBody create() {
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
         * The detailed information about the media workflow.
         */
        public Builder mediaWorkflow(MediaWorkflow mediaWorkflow) {
            this.mediaWorkflow = mediaWorkflow;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMediaWorkflowResponseBody build() {
            return new UpdateMediaWorkflowResponseBody(this);
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
             * The time when the media workflow was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the media workflow that is updated.
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * The name of the media workflow.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The state of the media workflow. Valid values:
             * <p>
             * 
             * *   **Inactive**: The media workflow is disabled.
             * *   **Active**: The media workflow is enabled.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The topology of the media workflow.
             */
            public Builder topology(String topology) {
                this.topology = topology;
                return this;
            }

            /**
             * The trigger mode of the media workflow. Valid values:
             * <p>
             * 
             * *   **OssAutoTrigger**: The media workflow is automatically triggered.
             * *   **NotInAuto**: The media workflow is not automatically triggered.
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
