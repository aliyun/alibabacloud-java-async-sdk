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
 * {@link UpdateUserMFAAuthenticationSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserMFAAuthenticationSettingsRequest</p>
 */
public class UpdateUserMFAAuthenticationSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserMFAAuthenticationSettings")
    private String userMFAAuthenticationSettings;

    private UpdateUserMFAAuthenticationSettingsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.userId = builder.userId;
        this.userMFAAuthenticationSettings = builder.userMFAAuthenticationSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserMFAAuthenticationSettingsRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userMFAAuthenticationSettings
     */
    public String getUserMFAAuthenticationSettings() {
        return this.userMFAAuthenticationSettings;
    }

    public static final class Builder extends Request.Builder<UpdateUserMFAAuthenticationSettingsRequest, Builder> {
        private String directoryId; 
        private String userId; 
        private String userMFAAuthenticationSettings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserMFAAuthenticationSettingsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.userId = request.userId;
            this.userMFAAuthenticationSettings = request.userMFAAuthenticationSettings;
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

        /**
         * <p>Specifies whether to enable MFA for the user. Valid values:</p>
         * <ul>
         * <li>Enabled: enables MFA for the user.</li>
         * <li>Disabled: disables MFA for the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder userMFAAuthenticationSettings(String userMFAAuthenticationSettings) {
            this.putQueryParameter("UserMFAAuthenticationSettings", userMFAAuthenticationSettings);
            this.userMFAAuthenticationSettings = userMFAAuthenticationSettings;
            return this;
        }

        @Override
        public UpdateUserMFAAuthenticationSettingsRequest build() {
            return new UpdateUserMFAAuthenticationSettingsRequest(this);
        } 

    } 

}
