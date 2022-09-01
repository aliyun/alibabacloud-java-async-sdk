// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExternalSAMLIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>GetExternalSAMLIdentityProviderRequest</p>
 */
public class GetExternalSAMLIdentityProviderRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private GetExternalSAMLIdentityProviderRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExternalSAMLIdentityProviderRequest create() {
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

    public static final class Builder extends Request.Builder<GetExternalSAMLIdentityProviderRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetExternalSAMLIdentityProviderRequest request) {
            super(request);
            this.directoryId = request.directoryId;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public GetExternalSAMLIdentityProviderRequest build() {
            return new GetExternalSAMLIdentityProviderRequest(this);
        } 

    } 

}
