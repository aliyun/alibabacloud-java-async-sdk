// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSCIMServerCredentialRequest} extends {@link RequestModel}
 *
 * <p>DeleteSCIMServerCredentialRequest</p>
 */
public class DeleteSCIMServerCredentialRequest extends Request {
    @Query
    @NameInMap("CredentialId")
    private String credentialId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private DeleteSCIMServerCredentialRequest(Builder builder) {
        super(builder);
        this.credentialId = builder.credentialId;
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSCIMServerCredentialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder<DeleteSCIMServerCredentialRequest, Builder> {
        private String credentialId; 
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSCIMServerCredentialRequest response) {
            super(response);
            this.credentialId = response.credentialId;
            this.directoryId = response.directoryId;
        } 

        /**
         * CredentialId.
         */
        public Builder credentialId(String credentialId) {
            this.putQueryParameter("CredentialId", credentialId);
            this.credentialId = credentialId;
            return this;
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
        public DeleteSCIMServerCredentialRequest build() {
            return new DeleteSCIMServerCredentialRequest(this);
        } 

    } 

}
