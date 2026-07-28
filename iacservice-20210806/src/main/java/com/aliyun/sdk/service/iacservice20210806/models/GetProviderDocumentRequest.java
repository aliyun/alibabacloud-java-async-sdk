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
 * {@link GetProviderDocumentRequest} extends {@link RequestModel}
 *
 * <p>GetProviderDocumentRequest</p>
 */
public class GetProviderDocumentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("providerVersion")
    private String providerVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("terraformResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terraformResourceType;

    private GetProviderDocumentRequest(Builder builder) {
        super(builder);
        this.providerVersion = builder.providerVersion;
        this.terraformResourceType = builder.terraformResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProviderDocumentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return providerVersion
     */
    public String getProviderVersion() {
        return this.providerVersion;
    }

    /**
     * @return terraformResourceType
     */
    public String getTerraformResourceType() {
        return this.terraformResourceType;
    }

    public static final class Builder extends Request.Builder<GetProviderDocumentRequest, Builder> {
        private String providerVersion; 
        private String terraformResourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetProviderDocumentRequest request) {
            super(request);
            this.providerVersion = request.providerVersion;
            this.terraformResourceType = request.terraformResourceType;
        } 

        /**
         * providerVersion.
         */
        public Builder providerVersion(String providerVersion) {
            this.putQueryParameter("providerVersion", providerVersion);
            this.providerVersion = providerVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder terraformResourceType(String terraformResourceType) {
            this.putQueryParameter("terraformResourceType", terraformResourceType);
            this.terraformResourceType = terraformResourceType;
            return this;
        }

        @Override
        public GetProviderDocumentRequest build() {
            return new GetProviderDocumentRequest(this);
        } 

    } 

}
