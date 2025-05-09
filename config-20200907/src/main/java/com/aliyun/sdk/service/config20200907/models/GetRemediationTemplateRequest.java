// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetRemediationTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetRemediationTemplateRequest</p>
 */
public class GetRemediationTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIdentifier")
    private String templateIdentifier;

    private GetRemediationTemplateRequest(Builder builder) {
        super(builder);
        this.templateIdentifier = builder.templateIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRemediationTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateIdentifier
     */
    public String getTemplateIdentifier() {
        return this.templateIdentifier;
    }

    public static final class Builder extends Request.Builder<GetRemediationTemplateRequest, Builder> {
        private String templateIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetRemediationTemplateRequest request) {
            super(request);
            this.templateIdentifier = request.templateIdentifier;
        } 

        /**
         * <p>The ID of the automatic remediation template.</p>
         * <p>For more information about how to obtain the ID of a remediation template, see <a href="https://help.aliyun.com/document_detail/2337741.html">Compliance library</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-ALB-BulkyEnableDeletionProtection</p>
         */
        public Builder templateIdentifier(String templateIdentifier) {
            this.putQueryParameter("TemplateIdentifier", templateIdentifier);
            this.templateIdentifier = templateIdentifier;
            return this;
        }

        @Override
        public GetRemediationTemplateRequest build() {
            return new GetRemediationTemplateRequest(this);
        } 

    } 

}
