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
 * {@link GetTemplateMaterialsRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateMaterialsRequest</p>
 */
public class GetTemplateMaterialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileList")
    private String fileList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private GetTemplateMaterialsRequest(Builder builder) {
        super(builder);
        this.fileList = builder.fileList;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateMaterialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileList
     */
    public String getFileList() {
        return this.fileList;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetTemplateMaterialsRequest, Builder> {
        private String fileList; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateMaterialsRequest request) {
            super(request);
            this.fileList = request.fileList;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The materials that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;music.mp3&quot;,&quot;config.json&quot;,&quot;assets/1.jpg&quot;]</p>
         */
        public Builder fileList(String fileList) {
            this.putQueryParameter("FileList", fileList);
            this.fileList = fileList;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
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
        public GetTemplateMaterialsRequest build() {
            return new GetTemplateMaterialsRequest(this);
        } 

    } 

}
