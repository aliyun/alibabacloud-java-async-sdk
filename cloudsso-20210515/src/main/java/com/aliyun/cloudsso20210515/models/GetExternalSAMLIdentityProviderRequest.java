// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder {
        private String directoryId; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        public GetExternalSAMLIdentityProviderRequest build() {
            return new GetExternalSAMLIdentityProviderRequest(this);
        } 

    } 

}
