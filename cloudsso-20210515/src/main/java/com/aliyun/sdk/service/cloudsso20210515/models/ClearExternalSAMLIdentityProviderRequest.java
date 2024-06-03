// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearExternalSAMLIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>ClearExternalSAMLIdentityProviderRequest</p>
 */
public class ClearExternalSAMLIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    private ClearExternalSAMLIdentityProviderRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearExternalSAMLIdentityProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder<ClearExternalSAMLIdentityProviderRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(ClearExternalSAMLIdentityProviderRequest request) {
            super(request);
            this.directoryId = request.directoryId;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public ClearExternalSAMLIdentityProviderRequest build() {
            return new ClearExternalSAMLIdentityProviderRequest(this);
        } 

    } 

}
