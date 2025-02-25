// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineResponseBody</p>
 */
public class GetPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Pipeline")
    private Pipeline pipeline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPipelineResponseBody(Builder builder) {
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return pipeline
     */
    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Pipeline pipeline; 
        private String requestId; 

        /**
         * <p>The information about the MPS queue.</p>
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
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

        public GetPipelineResponseBody build() {
            return new GetPipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineResponseBody</p>
     */
    public static class Pipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private String speed;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Pipeline(Builder builder) {
            this.createTime = builder.createTime;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
            this.speed = builder.speed;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipeline create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String modifiedTime; 
            private String name; 
            private String pipelineId; 
            private Integer priority; 
            private String speed; 
            private String status; 

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:17:54Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the template was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T16:17:54Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The name of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>test-pipeline</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority of the MPS queue. Valid values: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of the MPS queue.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Standard: standard MPS queue.</li>
             * <li>Boost: MPS queue with transcoding speed boosted.</li>
             * <li>NarrowBandHDV2: MPS queue that supports Narrowband HD 2.0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>The state of the MPS queue.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Active</li>
             * <li>Paused</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Pipeline build() {
                return new Pipeline(this);
            } 

        } 

    }
}
