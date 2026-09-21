// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineBuildResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoutineBuildResponseBody</p>
 */
public class CreateRoutineBuildResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PipeLineRunId")
    private Long pipeLineRunId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoutineBuildId")
    private Long routineBuildId;

    private CreateRoutineBuildResponseBody(Builder builder) {
        this.pipeLineRunId = builder.pipeLineRunId;
        this.requestId = builder.requestId;
        this.routineBuildId = builder.routineBuildId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineBuildResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pipeLineRunId
     */
    public Long getPipeLineRunId() {
        return this.pipeLineRunId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routineBuildId
     */
    public Long getRoutineBuildId() {
        return this.routineBuildId;
    }

    public static final class Builder {
        private Long pipeLineRunId; 
        private String requestId; 
        private Long routineBuildId; 

        private Builder() {
        } 

        private Builder(CreateRoutineBuildResponseBody model) {
            this.pipeLineRunId = model.pipeLineRunId;
            this.requestId = model.requestId;
            this.routineBuildId = model.routineBuildId;
        } 

        /**
         * <p>The build ID in Apsara Devops.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pipeLineRunId(Long pipeLineRunId) {
            this.pipeLineRunId = pipeLineRunId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ER build task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>159782040838348</p>
         */
        public Builder routineBuildId(Long routineBuildId) {
            this.routineBuildId = routineBuildId;
            return this;
        }

        public CreateRoutineBuildResponseBody build() {
            return new CreateRoutineBuildResponseBody(this);
        } 

    } 

}
