// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSCIMServerCredentialStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateSCIMServerCredentialStatusRequest</p>
 */
public class UpdateSCIMServerCredentialStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialId")
    private String credentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewStatus")
    private String newStatus;

    private UpdateSCIMServerCredentialStatusRequest(Builder builder) {
        super(builder);
        this.credentialId = builder.credentialId;
        this.directoryId = builder.directoryId;
        this.newStatus = builder.newStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSCIMServerCredentialStatusRequest create() {
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

    /**
     * @return newStatus
     */
    public String getNewStatus() {
        return this.newStatus;
    }

    public static final class Builder extends Request.Builder<UpdateSCIMServerCredentialStatusRequest, Builder> {
        private String credentialId; 
        private String directoryId; 
        private String newStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSCIMServerCredentialStatusRequest request) {
            super(request);
            this.credentialId = request.credentialId;
            this.directoryId = request.directoryId;
            this.newStatus = request.newStatus;
        } 

        /**
         * The ID of the SCIM credential.
         */
        public Builder credentialId(String credentialId) {
            this.putQueryParameter("CredentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The new status of the SCIM credential. Valid values:
         * <p>
         * 
         * *   Enabled: The SCIM credential is enabled.
         * *   Disabled: The SCIM credential is disabled.
         */
        public Builder newStatus(String newStatus) {
            this.putQueryParameter("NewStatus", newStatus);
            this.newStatus = newStatus;
            return this;
        }

        @Override
        public UpdateSCIMServerCredentialStatusRequest build() {
            return new UpdateSCIMServerCredentialStatusRequest(this);
        } 

    } 

}
