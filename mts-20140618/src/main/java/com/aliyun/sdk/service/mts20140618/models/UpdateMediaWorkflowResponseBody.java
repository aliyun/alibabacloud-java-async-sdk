// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The detailed information about the media workflow.</p>
         */
        public Builder mediaWorkflow(MediaWorkflow mediaWorkflow) {
            this.mediaWorkflow = mediaWorkflow;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7D752035-97DA-54E5-88E2-E8405EEA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMediaWorkflowResponseBody build() {
            return new UpdateMediaWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMediaWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMediaWorkflowResponseBody</p>
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
             * <p>2016-04-01T05:29:38Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the media workflow that is updated.</p>
             * 
             * <strong>example:</strong>
             * <p>6307eb0d3f85477882d205aa040f****</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The name of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>examp-mediaworkflow-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The state of the media workflow. Valid values:</p>
             * <ul>
             * <li><strong>Inactive</strong>: The media workflow is disabled.</li>
             * <li><strong>Active</strong>: The media workflow is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The topology of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;Activities&quot;: {
             *             &quot;Act-Start&quot;: {
             *                   &quot;Parameters&quot;: {
             *                         &quot;PipelineId&quot;: &quot;130266f58161436a80bf07cb12c8****&quot;,
             *                         &quot;InputFile&quot;: &quot;{&quot;Bucket&quot;: &quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;: &quot;cn-shanghai&quot;}&quot;
             *                   },
             *                   &quot;Type&quot;: &quot;Start&quot;
             *             },
             *             &quot;Act-Report&quot;: {
             *                   &quot;Parameters&quot;: {},
             *                   &quot;Type&quot;: &quot;Report&quot;
             *             },
             *             &quot;Act-Transcode-M3U8&quot;: {
             *                   &quot;Parameters&quot;: {
             *                         &quot;Outputs&quot;: &quot;[{&quot;Object&quot;:&quot;transcode/{ObjectPrefix}{FileName}&quot;,&quot;TemplateId&quot;: &quot;957d1719ee85ed6527b90cf62726</strong></strong>&quot;}]&quot;,
             *                         &quot;OutputBucket&quot;: &quot;example-bucket-****&quot;,
             *                         &quot;OutputLocation&quot;: &quot;cn-shanghai&quot;
             *                   },
             *                   &quot;Type&quot;: &quot;Transcode&quot;
             *             }
             *       },
             *       &quot;Dependencies&quot;: {
             *             &quot;Act-Start&quot;: [
             *                   &quot;Act-Transcode-M3U8&quot;
             *             ],
             *             &quot;Act-Report&quot;: [],
             *             &quot;Act-Transcode-M3U8&quot;: [
             *                   &quot;Act-Report&quot;
             *             ]
             *       }
             * }</p>
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
             * <p>OssAutoTrigger</p>
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
