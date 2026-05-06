// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DeleteLlmTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteLlmTemplateRequest</p>
 */
public class DeleteLlmTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String llmTemplateId;

    private DeleteLlmTemplateRequest(Builder builder) {
        super(builder);
        this.llmTemplateId = builder.llmTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLlmTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return llmTemplateId
     */
    public String getLlmTemplateId() {
        return this.llmTemplateId;
    }

    public static final class Builder extends Request.Builder<DeleteLlmTemplateRequest, Builder> {
        private String llmTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLlmTemplateRequest request) {
            super(request);
            this.llmTemplateId = request.llmTemplateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llmt-xxxx</p>
         */
        public Builder llmTemplateId(String llmTemplateId) {
            this.putQueryParameter("LlmTemplateId", llmTemplateId);
            this.llmTemplateId = llmTemplateId;
            return this;
        }

        @Override
        public DeleteLlmTemplateRequest build() {
            return new DeleteLlmTemplateRequest(this);
        } 

    } 

}
