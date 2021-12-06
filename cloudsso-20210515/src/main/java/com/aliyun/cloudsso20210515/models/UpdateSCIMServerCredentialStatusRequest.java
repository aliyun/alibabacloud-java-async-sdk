// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateSCIMServerCredentialStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateSCIMServerCredentialStatusRequest</p>
 */
public class UpdateSCIMServerCredentialStatusRequest extends Request {
    @Query
    @NameInMap("CredentialId")
    private String credentialId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("NewStatus")
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

    public static final class Builder extends Request.Builder {
        private String credentialId; 
        private String directoryId; 
        private String newStatus; 

        /**
         * <p>CredentialId.</p>
         */
        public Builder credentialId(String credentialId) {
            this.putQueryParameter("CredentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>NewStatus.</p>
         */
        public Builder newStatus(String newStatus) {
            this.putQueryParameter("NewStatus", newStatus);
            this.newStatus = newStatus;
            return this;
        }

        public UpdateSCIMServerCredentialStatusRequest build() {
            return new UpdateSCIMServerCredentialStatusRequest(this);
        } 

    } 

}
