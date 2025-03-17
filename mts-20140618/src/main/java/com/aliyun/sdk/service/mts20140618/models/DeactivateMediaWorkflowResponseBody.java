// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link DeactivateMediaWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>DeactivateMediaWorkflowResponseBody</p>
 */
public class DeactivateMediaWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaWorkflow")
    private MediaWorkflow mediaWorkflow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeactivateMediaWorkflowResponseBody(Builder builder) {
        this.mediaWorkflow = builder.mediaWorkflow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeactivateMediaWorkflowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeactivateMediaWorkflowResponseBody model) {
            this.mediaWorkflow = model.mediaWorkflow;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The topology of the media workflow.</p>
         */
        public Builder mediaWorkflow(MediaWorkflow mediaWorkflow) {
            this.mediaWorkflow = mediaWorkflow;
            return this;
        }

        /**
         * <p>The name of the media workflow that is deactivated.</p>
         * 
         * <strong>example:</strong>
         * <p>16CD0CDD-457E-420D-9755-8385075A1234</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeactivateMediaWorkflowResponseBody build() {
            return new DeactivateMediaWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeactivateMediaWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>DeactivateMediaWorkflowResponseBody</p>
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

        private MediaWorkflow(Builder builder) {
            this.creationTime = builder.creationTime;
            this.mediaWorkflowId = builder.mediaWorkflowId;
            this.name = builder.name;
            this.state = builder.state;
            this.topology = builder.topology;
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

        public static final class Builder {
            private String creationTime; 
            private String mediaWorkflowId; 
            private String name; 
            private String state; 
            private String topology; 

            private Builder() {
            } 

            private Builder(MediaWorkflow model) {
                this.creationTime = model.creationTime;
                this.mediaWorkflowId = model.mediaWorkflowId;
                this.name = model.name;
                this.state = model.state;
                this.topology = model.topology;
            } 

            /**
             * <ul>
             * <li>After you deactivate a media workflow, you can modify the workflow information.</li>
             * <li>After you delete or deactivate a media workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.</li>
             * </ul>
             * <h2>Limits on QPS</h2>
             * <p>You can call this operation up to 100 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-04-01T05:29:37Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the media workflow that you want to deactivate. To obtain the ID of the media workflow, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Workflow Settings</strong> in the left-side navigation pane.</p>
             * 
             * <strong>example:</strong>
             * <p>93ab850b4f6f44eab54b6e9181d4****</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The details of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>example-mediaworkflow-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The topology of the media workflow.The status of the media workflow. The value is <strong>Inactive</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Inactive</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The status of the media workflow. The value is <strong>Inactive</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>{mediaworkflow&quot;,&quot;State&quot;:&quot;Active&quot;,&quot;Topology&quot;:&quot;{&quot;Activities&quot;:{&quot;Act-Start&quot;:{&quot;Parameters&quot;:{&quot;PipelineId&quot;:&quot;130266f58161436a80bf07cb12c8****&quot;,&quot;InputFile&quot;:&quot;{\&quot;Bucket\&quot;: \&quot;example-bucket-<strong><strong>\&quot;,\&quot;Location\&quot;: \&quot;cn-shanghai\&quot;}&quot;},&quot;Type&quot;:&quot;Start&quot;},&quot;Act-Report&quot;:{&quot;Parameters&quot;:{},&quot;Type&quot;:&quot;Report&quot;},&quot;Act-Transcode-M3U8&quot;:{&quot;Parameters&quot;:{&quot;Outputs&quot;:&quot;[{\&quot;Object\&quot;:\&quot;transcode/{ObjectPrefix}{FileName}\&quot;,\&quot;TemplateId\&quot;: \&quot;957d1719ee85ed6527b90cf62726</strong></strong>\&quot;}]&quot;,&quot;OutputBucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;OutputLocation&quot;:&quot;cn-shanghai&quot;},&quot;Type&quot;:&quot;Transcode&quot;}},&quot;Dependencies&quot;:{&quot;Act-Start&quot;:[&quot;Act-Transcode-M3U8&quot;],&quot;Act-Report&quot;:[],&quot;Act-Transcode-M3U8&quot;:[&quot;Act-Report&quot;]}}&quot;,&quot;MediaWorkflowId&quot;:&quot;93ab850b4f6f44eab54b6e91d24d</strong></strong>&quot;}]},&quot;RequestId&quot;:&quot;16CD0CDD-457E-420D-9755-8385075A1234&quot;}</p>
             */
            public Builder topology(String topology) {
                this.topology = topology;
                return this;
            }

            public MediaWorkflow build() {
                return new MediaWorkflow(this);
            } 

        } 

    }
}
