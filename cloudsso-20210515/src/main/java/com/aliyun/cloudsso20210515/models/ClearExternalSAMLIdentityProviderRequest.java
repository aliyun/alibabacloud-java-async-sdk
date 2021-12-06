// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ClearExternalSAMLIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>ClearExternalSAMLIdentityProviderRequest</p>
 */
public class ClearExternalSAMLIdentityProviderRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
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

        public ClearExternalSAMLIdentityProviderRequest build() {
            return new ClearExternalSAMLIdentityProviderRequest(this);
        } 

    } 

}
