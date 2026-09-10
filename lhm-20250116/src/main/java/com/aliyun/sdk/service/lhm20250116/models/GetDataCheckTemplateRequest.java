// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetDataCheckTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetDataCheckTemplateRequest</p>
 */
public class GetDataCheckTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private GetDataCheckTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<GetDataCheckTemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataCheckTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * <p>The check template ID (logical foreign key) that uniquely identifies a check template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetDataCheckTemplateRequest build() {
            return new GetDataCheckTemplateRequest(this);
        } 

    } 

}
