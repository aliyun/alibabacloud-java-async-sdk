// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserProvisioningRequest} extends {@link RequestModel}
 *
 * <p>GetUserProvisioningRequest</p>
 */
public class GetUserProvisioningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserProvisioningId")
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
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-003qew84****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The ID of the RAM user provisioning.</p>
         * 
         * <strong>example:</strong>
         * <p>up-002axzhapcbz6e63****</p>
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
