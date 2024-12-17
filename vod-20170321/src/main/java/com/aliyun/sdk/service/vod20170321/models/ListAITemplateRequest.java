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
 * {@link ListAITemplateRequest} extends {@link RequestModel}
 *
 * <p>ListAITemplateRequest</p>
 */
public class ListAITemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    private ListAITemplateRequest(Builder builder) {
        super(builder);
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAITemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ListAITemplateRequest, Builder> {
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ListAITemplateRequest request) {
            super(request);
            this.templateType = request.templateType;
        } 

        /**
         * <p>The type of the AI template. Valid values:</p>
         * <ul>
         * <li><strong>AIMediaAudit</strong>: automated review</li>
         * <li><strong>AIImage</strong>: smart thumbnail</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AIMediaAudit</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ListAITemplateRequest build() {
            return new ListAITemplateRequest(this);
        } 

    } 

}
