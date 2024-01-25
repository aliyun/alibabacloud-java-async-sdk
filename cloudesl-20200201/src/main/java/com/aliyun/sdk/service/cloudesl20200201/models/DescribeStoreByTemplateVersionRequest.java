// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoreByTemplateVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeStoreByTemplateVersionRequest</p>
 */
public class DescribeStoreByTemplateVersionRequest extends Request {
    @Body
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private DescribeStoreByTemplateVersionRequest(Builder builder) {
        super(builder);
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoreByTemplateVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<DescribeStoreByTemplateVersionRequest, Builder> {
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStoreByTemplateVersionRequest request) {
            super(request);
            this.templateVersion = request.templateVersion;
        } 

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putBodyParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public DescribeStoreByTemplateVersionRequest build() {
            return new DescribeStoreByTemplateVersionRequest(this);
        } 

    } 

}
