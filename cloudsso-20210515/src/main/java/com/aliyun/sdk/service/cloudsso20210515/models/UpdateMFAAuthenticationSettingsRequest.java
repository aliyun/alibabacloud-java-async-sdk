// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMFAAuthenticationSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateMFAAuthenticationSettingsRequest</p>
 */
public class UpdateMFAAuthenticationSettingsRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("MFAAuthenticationSettings")
    private String MFAAuthenticationSettings;

    @Query
    @NameInMap("OperationForRiskLogin")
    private String operationForRiskLogin;

    private UpdateMFAAuthenticationSettingsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.MFAAuthenticationSettings = builder.MFAAuthenticationSettings;
        this.operationForRiskLogin = builder.operationForRiskLogin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMFAAuthenticationSettingsRequest create() {
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
     * @return MFAAuthenticationSettings
     */
    public String getMFAAuthenticationSettings() {
        return this.MFAAuthenticationSettings;
    }

    /**
     * @return operationForRiskLogin
     */
    public String getOperationForRiskLogin() {
        return this.operationForRiskLogin;
    }

    public static final class Builder extends Request.Builder<UpdateMFAAuthenticationSettingsRequest, Builder> {
        private String directoryId; 
        private String MFAAuthenticationSettings; 
        private String operationForRiskLogin; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMFAAuthenticationSettingsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.MFAAuthenticationSettings = request.MFAAuthenticationSettings;
            this.operationForRiskLogin = request.operationForRiskLogin;
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
         * MFAAuthenticationSettings.
         */
        public Builder MFAAuthenticationSettings(String MFAAuthenticationSettings) {
            this.putQueryParameter("MFAAuthenticationSettings", MFAAuthenticationSettings);
            this.MFAAuthenticationSettings = MFAAuthenticationSettings;
            return this;
        }

        /**
         * OperationForRiskLogin.
         */
        public Builder operationForRiskLogin(String operationForRiskLogin) {
            this.putQueryParameter("OperationForRiskLogin", operationForRiskLogin);
            this.operationForRiskLogin = operationForRiskLogin;
            return this;
        }

        @Override
        public UpdateMFAAuthenticationSettingsRequest build() {
            return new UpdateMFAAuthenticationSettingsRequest(this);
        } 

    } 

}
