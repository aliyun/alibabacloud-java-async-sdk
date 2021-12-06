// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SetMFAAuthenticationStatusRequest} extends {@link RequestModel}
 *
 * <p>SetMFAAuthenticationStatusRequest</p>
 */
public class SetMFAAuthenticationStatusRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("MFAAuthenticationStatus")
    private String MFAAuthenticationStatus;


    private SetMFAAuthenticationStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.MFAAuthenticationStatus = builder.MFAAuthenticationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMFAAuthenticationStatusRequest create() {
        return builder().build();
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return MFAAuthenticationStatus
     */
    public String getMFAAuthenticationStatus() {
        return this.MFAAuthenticationStatus;
    }

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String MFAAuthenticationStatus; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>MFAAuthenticationStatus.</p>
         */
        public Builder MFAAuthenticationStatus(String MFAAuthenticationStatus) {
            this.putQueryParameter("MFAAuthenticationStatus", MFAAuthenticationStatus);
            this.MFAAuthenticationStatus = MFAAuthenticationStatus;
            return this;
        }

        public SetMFAAuthenticationStatusRequest build() {
            return new SetMFAAuthenticationStatusRequest(this);
        } 

    } 

}
