// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateRevisionsRequest} extends {@link RequestModel}
 *
 * <p>ListTemplateRevisionsRequest</p>
 */
public class ListTemplateRevisionsRequest extends Request {
    @Query
    @NameInMap("templateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("templateVersion")
    private Integer templateVersion;

    private ListTemplateRevisionsRequest(Builder builder) {
        super(builder);
        this.templateName = builder.templateName;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateRevisionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateVersion
     */
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<ListTemplateRevisionsRequest, Builder> {
        private String templateName; 
        private Integer templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListTemplateRevisionsRequest request) {
            super(request);
            this.templateName = request.templateName;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * The name of a template.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * The major version of the template. "1" by default.
         */
        public Builder templateVersion(Integer templateVersion) {
            this.putQueryParameter("templateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public ListTemplateRevisionsRequest build() {
            return new ListTemplateRevisionsRequest(this);
        } 

    } 

}
