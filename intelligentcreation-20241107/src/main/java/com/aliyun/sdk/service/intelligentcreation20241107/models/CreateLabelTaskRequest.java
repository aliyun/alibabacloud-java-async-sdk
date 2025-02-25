// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20241107.models;

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
    @com.aliyun.core.annotation.NameInMap("fileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("idempotentId")
    private String idempotentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("labelTemplateId")
    private String labelTemplateId;

    private CreateLabelTaskRequest(Builder builder) {
        super(builder);
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
        private String fileUrl; 
        private String idempotentId; 
        private String labelTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLabelTaskRequest request) {
            super(request);
            this.fileUrl = request.fileUrl;
            this.idempotentId = request.idempotentId;
            this.labelTemplateId = request.labelTemplateId;
        } 

        /**
         * fileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("fileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.putBodyParameter("idempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * labelTemplateId.
         */
        public Builder labelTemplateId(String labelTemplateId) {
            this.putBodyParameter("labelTemplateId", labelTemplateId);
            this.labelTemplateId = labelTemplateId;
            return this;
        }

        @Override
        public CreateLabelTaskRequest build() {
            return new CreateLabelTaskRequest(this);
        } 

    } 

}
