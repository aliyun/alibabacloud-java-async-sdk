// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateMediaWorkflowTriggerModeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMediaWorkflowTriggerModeResponseBody</p>
 */
public class UpdateMediaWorkflowTriggerModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaWorkflow")
    private MediaWorkflow mediaWorkflow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateMediaWorkflowTriggerModeResponseBody(Builder builder) {
        this.mediaWorkflow = builder.mediaWorkflow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaWorkflowTriggerModeResponseBody create() {
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
         * <p>The information about the media workflow.</p>
         */
        public Builder mediaWorkflow(MediaWorkflow mediaWorkflow) {
            this.mediaWorkflow = mediaWorkflow;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16CD0CDD-457E-420D-9755-8385075A1234</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMediaWorkflowTriggerModeResponseBody build() {
            return new UpdateMediaWorkflowTriggerModeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMediaWorkflowTriggerModeResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMediaWorkflowTriggerModeResponseBody</p>
     */
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
             * <p>The time when the media workflow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-04-01T05:29:37Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>e00732b977da427d9177a4dee646****</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The name of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>example-mediaworkflow-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the media workflow. Valid values:</p>
             * <ul>
             * <li><strong>Inactive</strong>: The media workflow is disabled.</li>
             * <li><strong>Active</strong>: The media workflow is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Inactive</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The topology of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>{mediaworkflow&quot;,&quot;State&quot;:&quot;Active&quot;,&quot;Topology&quot;:&quot;{&quot;Activities&quot;:{&quot;Act-Start&quot;:{&quot;Parameters&quot;:{&quot;PipelineId&quot;:&quot;130266f58161436a80bf07cb12c8****&quot;,&quot;InputFile&quot;:&quot;{\&quot;Bucket\&quot;: \&quot;example-bucket-<strong><strong>\&quot;,\&quot;Location\&quot;: \&quot;cn-shanghai\&quot;}&quot;},&quot;Type&quot;:&quot;Start&quot;},&quot;Act-Report&quot;:{&quot;Parameters&quot;:{},&quot;Type&quot;:&quot;Report&quot;},&quot;Act-Transcode-M3U8&quot;:{&quot;Parameters&quot;:{&quot;Outputs&quot;:&quot;[{\&quot;Object\&quot;:\&quot;transcode/{ObjectPrefix}{FileName}\&quot;,\&quot;TemplateId\&quot;: \&quot;957d1719ee85ed6527b90cf62726</strong></strong>\&quot;}]&quot;,&quot;OutputBucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;OutputLocation&quot;:&quot;cn-shanghai&quot;},&quot;Type&quot;:&quot;Transcode&quot;}},&quot;Dependencies&quot;:{&quot;Act-Start&quot;:[&quot;Act-Transcode-M3U8&quot;],&quot;Act-Report&quot;:[],&quot;Act-Transcode-M3U8&quot;:[&quot;Act-Report&quot;]}}&quot;,&quot;MediaWorkflowId&quot;:&quot;93ab850b4f6f44eab54b6e91d24d</strong></strong>&quot;}]},&quot;RequestId&quot;:&quot;16CD0CDD-457E-420D-9755-8385075A1234&quot;}</p>
             */
            public Builder topology(String topology) {
                this.topology = topology;
                return this;
            }

            /**
             * <p>The trigger mode of the media workflow. Valid values:</p>
             * <ul>
             * <li><strong>OssAutoTrigger</strong>: The media workflow is automatically triggered.</li>
             * <li><strong>NotInAuto</strong>: The media workflow is not automatically triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NotInAuto</p>
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
