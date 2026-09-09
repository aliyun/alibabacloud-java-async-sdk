// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetJobTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetJobTemplateRequest</p>
 */
public class GetJobTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private GetJobTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobTemplateRequest create() {
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetJobTemplateRequest, Builder> {
        private String templateId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetJobTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
            this.version = request.version;
        } 

        /**
         * <p>The unique identifier of the task template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tplmceolmf2****</p>
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>If this parameter is not specified, the default version is returned. If a specific number is specified, the corresponding version is returned. If all is specified, all versions are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetJobTemplateRequest build() {
            return new GetJobTemplateRequest(this);
        } 

    } 

}
