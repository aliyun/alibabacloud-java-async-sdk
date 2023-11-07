// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserProvisioningRequest} extends {@link RequestModel}
 *
 * <p>GetUserProvisioningRequest</p>
 */
public class GetUserProvisioningRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("UserProvisioningId")
    private String userProvisioningId;

    private GetUserProvisioningRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.userProvisioningId = builder.userProvisioningId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningRequest create() {
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
     * @return userProvisioningId
     */
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

    public static final class Builder extends Request.Builder<GetUserProvisioningRequest, Builder> {
        private String directoryId; 
        private String userProvisioningId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserProvisioningRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.userProvisioningId = request.userProvisioningId;
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
         * UserProvisioningId.
         */
        public Builder userProvisioningId(String userProvisioningId) {
            this.putQueryParameter("UserProvisioningId", userProvisioningId);
            this.userProvisioningId = userProvisioningId;
            return this;
        }

        @Override
        public GetUserProvisioningRequest build() {
            return new GetUserProvisioningRequest(this);
        } 

    } 

}
