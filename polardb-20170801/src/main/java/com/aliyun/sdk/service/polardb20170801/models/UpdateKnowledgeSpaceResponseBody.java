// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdateKnowledgeSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeSpaceResponseBody</p>
 */
public class UpdateKnowledgeSpaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceId")
    private String knowledgeSpaceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private UpdateKnowledgeSpaceResponseBody(Builder builder) {
        this.knowledgeSpaceId = builder.knowledgeSpaceId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeSpaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeSpaceId
     */
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String knowledgeSpaceId; 
        private String requestId; 
        private Integer taskId; 

        private Builder() {
        } 

        private Builder(UpdateKnowledgeSpaceResponseBody model) {
            this.knowledgeSpaceId = model.knowledgeSpaceId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * KnowledgeSpaceId.
         */
        public Builder knowledgeSpaceId(String knowledgeSpaceId) {
            this.knowledgeSpaceId = knowledgeSpaceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public UpdateKnowledgeSpaceResponseBody build() {
            return new UpdateKnowledgeSpaceResponseBody(this);
        } 

    } 

}
