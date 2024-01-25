// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyCompanyTemplateVersionToStoresRequest} extends {@link RequestModel}
 *
 * <p>ApplyCompanyTemplateVersionToStoresRequest</p>
 */
public class ApplyCompanyTemplateVersionToStoresRequest extends Request {
    @Body
    @NameInMap("Stores")
    private String stores;

    @Body
    @NameInMap("TemplateVersion")
    @Validation(required = true)
    private String templateVersion;

    private ApplyCompanyTemplateVersionToStoresRequest(Builder builder) {
        super(builder);
        this.stores = builder.stores;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCompanyTemplateVersionToStoresRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stores
     */
    public String getStores() {
        return this.stores;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<ApplyCompanyTemplateVersionToStoresRequest, Builder> {
        private String stores; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(ApplyCompanyTemplateVersionToStoresRequest request) {
            super(request);
            this.stores = request.stores;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * Stores.
         */
        public Builder stores(String stores) {
            this.putBodyParameter("Stores", stores);
            this.stores = stores;
            return this;
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
        public ApplyCompanyTemplateVersionToStoresRequest build() {
            return new ApplyCompanyTemplateVersionToStoresRequest(this);
        } 

    } 

}
