// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictTemplateModelRequest} extends {@link RequestModel}
 *
 * <p>PredictTemplateModelRequest</p>
 */
public class PredictTemplateModelRequest extends Request {
    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private PredictTemplateModelRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictTemplateModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<PredictTemplateModelRequest, Builder> {
        private String content; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(PredictTemplateModelRequest request) {
            super(request);
            this.content = request.content;
            this.taskId = request.taskId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public PredictTemplateModelRequest build() {
            return new PredictTemplateModelRequest(this);
        } 

    } 

}
