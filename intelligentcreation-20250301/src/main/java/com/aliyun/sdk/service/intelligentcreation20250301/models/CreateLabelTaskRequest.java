// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20250301.models;

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
 * {@link CreateLabelTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateLabelTaskRequest</p>
 */
public class CreateLabelTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 8)
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdempotentId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String idempotentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelTemplateId;

    private CreateLabelTaskRequest(Builder builder) {
        super(builder);
        this.callbackUrl = builder.callbackUrl;
        this.fileUrl = builder.fileUrl;
        this.idempotentId = builder.idempotentId;
        this.labelTemplateId = builder.labelTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLabelTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return labelTemplateId
     */
    public String getLabelTemplateId() {
        return this.labelTemplateId;
    }

    public static final class Builder extends Request.Builder<CreateLabelTaskRequest, Builder> {
        private String callbackUrl; 
        private String fileUrl; 
        private String idempotentId; 
        private String labelTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLabelTaskRequest request) {
            super(request);
            this.callbackUrl = request.callbackUrl;
            this.fileUrl = request.fileUrl;
            this.idempotentId = request.idempotentId;
            this.labelTemplateId = request.labelTemplateId;
        } 

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putBodyParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bucket-name.oss-zhangjiakou.aliyuncs.com/path/filename.jsonl">https://bucket-name.oss-zhangjiakou.aliyuncs.com/path/filename.jsonl</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * IdempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.putBodyParameter("IdempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder labelTemplateId(String labelTemplateId) {
            this.putBodyParameter("LabelTemplateId", labelTemplateId);
            this.labelTemplateId = labelTemplateId;
            return this;
        }

        @Override
        public CreateLabelTaskRequest build() {
            return new CreateLabelTaskRequest(this);
        } 

    } 

}
