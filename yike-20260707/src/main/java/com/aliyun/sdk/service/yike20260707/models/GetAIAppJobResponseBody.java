// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetAIAppJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIAppJobResponseBody</p>
 */
public class GetAIAppJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIAppJob")
    private AIAppJob AIAppJob;

    @com.aliyun.core.annotation.NameInMap("Artifacts")
    private java.util.List<Artifacts> artifacts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAIAppJobResponseBody(Builder builder) {
        this.AIAppJob = builder.AIAppJob;
        this.artifacts = builder.artifacts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIAppJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAppJob
     */
    public AIAppJob getAIAppJob() {
        return this.AIAppJob;
    }

    /**
     * @return artifacts
     */
    public java.util.List<Artifacts> getArtifacts() {
        return this.artifacts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIAppJob AIAppJob; 
        private java.util.List<Artifacts> artifacts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAIAppJobResponseBody model) {
            this.AIAppJob = model.AIAppJob;
            this.artifacts = model.artifacts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The task information.</p>
         */
        public Builder AIAppJob(AIAppJob AIAppJob) {
            this.AIAppJob = AIAppJob;
            return this;
        }

        /**
         * <p>The output assets.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;Status&quot;: &quot;completed&quot;,
         *     &quot;Type&quot;: &quot;image&quot;,
         *     &quot;Url&quot;: &quot;xxx&quot;,
         *     &quot;Name&quot;: &quot;blue.png&quot;
         *   },
         *   {
         *     &quot;Status&quot;: &quot;completed&quot;,
         *     &quot;Type&quot;: &quot;image&quot;,
         *     &quot;Url&quot;: &quot;xxx&quot;,
         *     &quot;Name&quot;: &quot;red.png&quot;
         *   }
         * ]</p>
         */
        public Builder artifacts(java.util.List<Artifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAIAppJobResponseBody build() {
            return new GetAIAppJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAIAppJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIAppJobResponseBody</p>
     */
    public static class AIAppJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("NodeResults")
        private String nodeResults;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AIAppJob(Builder builder) {
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.jobId = builder.jobId;
            this.nodeResults = builder.nodeResults;
            this.outputs = builder.outputs;
            this.status = builder.status;
            this.userData = builder.userData;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIAppJob create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return nodeResults
         */
        public String getNodeResults() {
            return this.nodeResults;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String finishTime; 
            private String jobId; 
            private String nodeResults; 
            private String outputs; 
            private String status; 
            private String userData; 
            private String version; 

            private Builder() {
            } 

            private Builder(AIAppJob model) {
                this.createTime = model.createTime;
                this.finishTime = model.finishTime;
                this.jobId = model.jobId;
                this.nodeResults = model.nodeResults;
                this.outputs = model.outputs;
                this.status = model.status;
                this.userData = model.userData;
                this.version = model.version;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-06T02:06:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the task was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-06T16:59:25Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a2880a70cec1414cac476bce0bd39ad7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The node results of the workflow task. The results are in JSON format and vary based on the workflow configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;Key\&quot;:\&quot;Value\&quot;}</p>
             */
            public Builder nodeResults(String nodeResults) {
                this.nodeResults = nodeResults;
                return this;
            }

            /**
             * <p>The task outputs.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;Status\&quot;:\&quot;Success\&quot;}</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>init: The task is created.</li>
             * <li>running: The task is running.</li>
             * <li>succeeded: The task succeeded.</li>
             * <li>failed: The task failed.</li>
             * <li>stopped: The task is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The custom information.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;Key\&quot;:\&quot;Value\&quot;}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The application version.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AIAppJob build() {
                return new AIAppJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIAppJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIAppJobResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Artifacts(Builder builder) {
            this.assetId = builder.assetId;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String assetId; 
            private String name; 
            private String status; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.assetId = model.assetId;
                this.name = model.name;
                this.status = model.status;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The asset ID, which is the media asset ID obtained after registration.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx77i16crgqtn96ip914bmixxxx</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>The asset name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_00x</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The asset status.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The asset type. Valid values: image, audio, video, document, and text.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The asset URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/imgextra/i1/O1CN0157aHKQ1LlJ45vCQ8w_!!6000000001339-0-tps-1080-773.jpg">https://img.alicdn.com/imgextra/i1/O1CN0157aHKQ1LlJ45vCQ8w_!!6000000001339-0-tps-1080-773.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
}
