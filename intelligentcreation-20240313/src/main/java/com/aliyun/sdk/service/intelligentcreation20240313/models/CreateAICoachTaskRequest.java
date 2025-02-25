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
 * {@link CreateAICoachTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAICoachTaskRequest</p>
 */
public class CreateAICoachTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptRecordId")
    private String scriptRecordId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("studentId")
    private String studentId;

    private CreateAICoachTaskRequest(Builder builder) {
        super(builder);
        this.requestId = builder.requestId;
        this.scriptRecordId = builder.scriptRecordId;
        this.studentId = builder.studentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAICoachTaskRequest create() {
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
     * @return studentId
     */
    public String getStudentId() {
        return this.studentId;
    }

    public static final class Builder extends Request.Builder<CreateAICoachTaskRequest, Builder> {
        private String requestId; 
        private String scriptRecordId; 
        private String studentId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAICoachTaskRequest request) {
            super(request);
            this.requestId = request.requestId;
            this.scriptRecordId = request.scriptRecordId;
            this.studentId = request.studentId;
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
         * studentId.
         */
        public Builder studentId(String studentId) {
            this.putBodyParameter("studentId", studentId);
            this.studentId = studentId;
            return this;
        }

        @Override
        public CreateAICoachTaskRequest build() {
            return new CreateAICoachTaskRequest(this);
        } 

    } 

}
