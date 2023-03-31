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
    @NameInMap("BinaryToText")
    private Boolean binaryToText;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    @Body
    @NameInMap("body")
    private String body;

    private PredictTemplateModelRequest(Builder builder) {
        super(builder);
        this.binaryToText = builder.binaryToText;
        this.content = builder.content;
        this.taskId = builder.taskId;
        this.body = builder.body;
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
     * @return binaryToText
     */
    public Boolean getBinaryToText() {
        return this.binaryToText;
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

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PredictTemplateModelRequest, Builder> {
        private Boolean binaryToText; 
        private String content; 
        private Long taskId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(PredictTemplateModelRequest request) {
            super(request);
            this.binaryToText = request.binaryToText;
            this.content = request.content;
            this.taskId = request.taskId;
            this.body = request.body;
        } 

        /**
         * BinaryToText.
         */
        public Builder binaryToText(Boolean binaryToText) {
            this.putQueryParameter("BinaryToText", binaryToText);
            this.binaryToText = binaryToText;
            return this;
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

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PredictTemplateModelRequest build() {
            return new PredictTemplateModelRequest(this);
        } 

    } 

}
