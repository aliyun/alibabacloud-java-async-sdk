// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteChangeRequestReleaseStageResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteChangeRequestReleaseStageResponseBody</p>
 */
public class ExecuteChangeRequestReleaseStageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("object")
    private Long object;

    @com.aliyun.core.annotation.NameInMap("pipelineId")
    private Long pipelineId;

    @com.aliyun.core.annotation.NameInMap("pipelineRunId")
    private Long pipelineRunId;

    private ExecuteChangeRequestReleaseStageResponseBody(Builder builder) {
        this.object = builder.object;
        this.pipelineId = builder.pipelineId;
        this.pipelineRunId = builder.pipelineRunId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteChangeRequestReleaseStageResponseBody create() {
        return builder().build();
    }

    /**
     * @return object
     */
    public Long getObject() {
        return this.object;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return pipelineRunId
     */
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

    public static final class Builder {
        private Long object; 
        private Long pipelineId; 
        private Long pipelineRunId; 

        /**
         * object.
         */
        public Builder object(Long object) {
            this.object = object;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * pipelineRunId.
         */
        public Builder pipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        public ExecuteChangeRequestReleaseStageResponseBody build() {
            return new ExecuteChangeRequestReleaseStageResponseBody(this);
        } 

    } 

}
