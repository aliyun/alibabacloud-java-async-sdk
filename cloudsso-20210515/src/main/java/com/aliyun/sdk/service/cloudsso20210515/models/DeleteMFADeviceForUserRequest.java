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
 * {@link DeleteMFADeviceForUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteMFADeviceForUserRequest</p>
 */
public class DeleteMFADeviceForUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MFADeviceId")
    private String MFADeviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private DeleteMFADeviceForUserRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.MFADeviceId = builder.MFADeviceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMFADeviceForUserRequest create() {
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
     * @return MFADeviceId
     */
    public String getMFADeviceId() {
        return this.MFADeviceId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteMFADeviceForUserRequest, Builder> {
        private String directoryId; 
        private String MFADeviceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMFADeviceForUserRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.MFADeviceId = request.MFADeviceId;
            this.userId = request.userId;
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

        /**
         * <p>The ID of the MFA device.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/333531.html">ListMFADevicesForUser</a> operation to query the IDs of MFA devices.</p>
         * 
         * <strong>example:</strong>
         * <p>mfa-00ujhet8pycljj7j****</p>
         */
        public Builder MFADeviceId(String MFADeviceId) {
            this.putQueryParameter("MFADeviceId", MFADeviceId);
            this.MFADeviceId = MFADeviceId;
            return this;
        }

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteMFADeviceForUserRequest build() {
            return new DeleteMFADeviceForUserRequest(this);
        } 

    } 

}
