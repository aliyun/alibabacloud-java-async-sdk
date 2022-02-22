// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    /**
     * @return MFAAuthenticationStatus
     */
    public String getMFAAuthenticationStatus() {
        return this.MFAAuthenticationStatus;
    }

    public static final class Builder extends Request.Builder<SetMFAAuthenticationStatusRequest, Builder> {
        private String directoryId; 
        private String MFAAuthenticationStatus; 

        private Builder() {
            super();
        } 

        private Builder(SetMFAAuthenticationStatusRequest response) {
            super(response);
            this.directoryId = response.directoryId;
            this.MFAAuthenticationStatus = response.MFAAuthenticationStatus;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * MFAAuthenticationStatus.
         */
        public Builder MFAAuthenticationStatus(String MFAAuthenticationStatus) {
            this.putQueryParameter("MFAAuthenticationStatus", MFAAuthenticationStatus);
            this.MFAAuthenticationStatus = MFAAuthenticationStatus;
            return this;
        }

        @Override
        public SetMFAAuthenticationStatusRequest build() {
            return new SetMFAAuthenticationStatusRequest(this);
        } 

    } 

}
