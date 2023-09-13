// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateMaterialsRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateMaterialsRequest</p>
 */
public class GetTemplateMaterialsRequest extends Request {
    @Query
    @NameInMap("FileList")
    private String fileList;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
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
         * FileList.
         */
        public Builder fileList(String fileList) {
            this.putQueryParameter("FileList", fileList);
            this.fileList = fileList;
            return this;
        }

        /**
         * TemplateId.
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
