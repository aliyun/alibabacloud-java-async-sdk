// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ActivateMediaWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>ActivateMediaWorkflowResponseBody</p>
 */
public class ActivateMediaWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaWorkflow")
    private MediaWorkflow mediaWorkflow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ActivateMediaWorkflowResponseBody(Builder builder) {
        this.mediaWorkflow = builder.mediaWorkflow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateMediaWorkflowResponseBody create() {
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
         * <p>The details of the media workflow.</p>
         */
        public Builder mediaWorkflow(MediaWorkflow mediaWorkflow) {
            this.mediaWorkflow = mediaWorkflow;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A1326BD4-30B1-4CB6-Q123-3330B877B0D4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ActivateMediaWorkflowResponseBody build() {
            return new ActivateMediaWorkflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ActivateMediaWorkflowResponseBody} extends {@link TeaModel}
     *
     * <p>ActivateMediaWorkflowResponseBody</p>
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
             * <p>93ab850b4f6f44eab54b6e9181d4****</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The name of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>mediaworkflow-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the media workflow. The value is <strong>Active</strong>.</p>
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
             * <p>{&quot;Activities&quot;:{&quot;Act-Start&quot;:{&quot;Parameters&quot;:{&quot;PipelineId&quot;:&quot;130266f58161436a80bf07cb12c8****&quot;,&quot;InputFile&quot;:&quot;{\&quot;Bucket\&quot;: \&quot;example\&quot;,\&quot;Location\&quot;: \&quot;oss-cn-hangzhou\&quot;}&quot;},&quot;Type&quot;:&quot;Start&quot;},&quot;Act-Report&quot;:{&quot;Parameters&quot;:{},&quot;Type&quot;:&quot;Report&quot;},&quot;Act-Transcode-M3U8&quot;:{&quot;Parameters&quot;:{&quot;Outputs&quot;:&quot;[{\&quot;OutputObject\&quot;:\&quot;transcode%2F%7BObjectPrefix%7D%7BFileName%7D\&quot;,\&quot;TemplateId\&quot;: \&quot;957d1719ee85ed6527b90cf62726****\&quot;}]&quot;,&quot;OutputBucket&quot;:&quot;panda-vod-hls&quot;,&quot;OutputLocation&quot;:&quot;oss-cn-hangzhou&quot;},&quot;Type&quot;:&quot;Transcode&quot;}},&quot;Dependencies&quot;:{&quot;Act-Start&quot;:[&quot;Act-Transcode-M3U8&quot;],&quot;Act-Report&quot;:[],&quot;Act-Transcode-M3U8&quot;:[&quot;Act-Report&quot;]}}</p>
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
