// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link BatchCreateAICoachTaskRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateAICoachTaskRequest</p>
 */
public class BatchCreateAICoachTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptRecordId")
    private String scriptRecordId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("studentIds")
    private java.util.List<String> studentIds;

    private BatchCreateAICoachTaskRequest(Builder builder) {
        super(builder);
        this.requestId = builder.requestId;
        this.scriptRecordId = builder.scriptRecordId;
        this.studentIds = builder.studentIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateAICoachTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scriptRecordId
     */
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    /**
     * @return studentIds
     */
    public java.util.List<String> getStudentIds() {
        return this.studentIds;
    }

    public static final class Builder extends Request.Builder<BatchCreateAICoachTaskRequest, Builder> {
        private String requestId; 
        private String scriptRecordId; 
        private java.util.List<String> studentIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateAICoachTaskRequest request) {
            super(request);
            this.requestId = request.requestId;
            this.scriptRecordId = request.scriptRecordId;
            this.studentIds = request.studentIds;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * scriptRecordId.
         */
        public Builder scriptRecordId(String scriptRecordId) {
            this.putBodyParameter("scriptRecordId", scriptRecordId);
            this.scriptRecordId = scriptRecordId;
            return this;
        }

        /**
         * studentIds.
         */
        public Builder studentIds(java.util.List<String> studentIds) {
            this.putBodyParameter("studentIds", studentIds);
            this.studentIds = studentIds;
            return this;
        }

        @Override
        public BatchCreateAICoachTaskRequest build() {
            return new BatchCreateAICoachTaskRequest(this);
        } 

    } 

}
