// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SetDefaultAITemplateRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultAITemplateRequest</p>
 */
public class SetDefaultAITemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private SetDefaultAITemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultAITemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<SetDefaultAITemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultAITemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * <p>The AI template ID. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, the AI template ID is the value of the TemplateId response parameter.</li>
         * <li>After the AI template is added, call the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation to query the AI template ID, which is the value of the TemplateId response parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1706a0063dd733f6a823ef32e0a5****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SetDefaultAITemplateRequest build() {
            return new SetDefaultAITemplateRequest(this);
        } 

    } 

}
