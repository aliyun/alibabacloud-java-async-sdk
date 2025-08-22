// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeRequest</p>
 */
public class GetResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("acceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterReadOnly")
    private Boolean filterReadOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    private GetResourceTypeRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.acceptLanguage = builder.acceptLanguage;
        this.filterReadOnly = builder.filterReadOnly;
        this.terraformProviderVersion = builder.terraformProviderVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return filterReadOnly
     */
    public Boolean getFilterReadOnly() {
        return this.filterReadOnly;
    }

    /**
     * @return terraformProviderVersion
     */
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public static final class Builder extends Request.Builder<GetResourceTypeRequest, Builder> {
        private String resourceType; 
        private String acceptLanguage; 
        private Boolean filterReadOnly; 
        private String terraformProviderVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceTypeRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.acceptLanguage = request.acceptLanguage;
            this.filterReadOnly = request.filterReadOnly;
            this.terraformProviderVersion = request.terraformProviderVersion;
        } 

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putPathParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * acceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("acceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * filterReadOnly.
         */
        public Builder filterReadOnly(Boolean filterReadOnly) {
            this.putQueryParameter("filterReadOnly", filterReadOnly);
            this.filterReadOnly = filterReadOnly;
            return this;
        }

        /**
         * terraformProviderVersion.
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putQueryParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        @Override
        public GetResourceTypeRequest build() {
            return new GetResourceTypeRequest(this);
        } 

    } 

}
