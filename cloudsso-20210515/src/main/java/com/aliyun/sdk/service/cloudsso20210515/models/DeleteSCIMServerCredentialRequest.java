// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSCIMServerCredentialRequest} extends {@link RequestModel}
 *
 * <p>DeleteSCIMServerCredentialRequest</p>
 */
public class DeleteSCIMServerCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialId")
    private String credentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
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

        private Builder(DeleteSCIMServerCredentialRequest request) {
            super(request);
            this.credentialId = request.credentialId;
            this.directoryId = request.directoryId;
        } 

        /**
         * <p>The ID of the SCIM credential.</p>
         * 
         * <strong>example:</strong>
         * <p>scimcred-004whl0kvfwcypbi****</p>
         */
        public Builder credentialId(String credentialId) {
            this.putQueryParameter("CredentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
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
