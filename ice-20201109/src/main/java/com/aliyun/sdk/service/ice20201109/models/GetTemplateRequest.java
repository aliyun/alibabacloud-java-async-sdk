// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateRequest</p>
 */
public class GetTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedMediaidFlag")
    private String relatedMediaidFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private GetTemplateRequest(Builder builder) {
        super(builder);
        this.relatedMediaidFlag = builder.relatedMediaidFlag;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relatedMediaidFlag
     */
    public String getRelatedMediaidFlag() {
        return this.relatedMediaidFlag;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetTemplateRequest, Builder> {
        private String relatedMediaidFlag; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateRequest request) {
            super(request);
            this.relatedMediaidFlag = request.relatedMediaidFlag;
            this.templateId = request.templateId;
        } 

        /**
         * <p>Specifies whether to return the media assets associated with the template. Valid values:</p>
         * <ul>
         * <li>1: Returns the associated media assets.</li>
         * <li>0: Does not return the associated media assets.
         * Default value: 0. This parameter is valid only for standard templates.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder relatedMediaidFlag(String relatedMediaidFlag) {
            this.putQueryParameter("RelatedMediaidFlag", relatedMediaidFlag);
            this.relatedMediaidFlag = relatedMediaidFlag;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetTemplateRequest build() {
            return new GetTemplateRequest(this);
        } 

    } 

}
