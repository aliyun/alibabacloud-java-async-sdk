// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSecurityPreferenceRequest} extends {@link RequestModel}
 *
 * <p>SetSecurityPreferenceRequest</p>
 */
public class SetSecurityPreferenceRequest extends Request {
    @Query
    @NameInMap("AllowUserToChangePassword")
    private Boolean allowUserToChangePassword;

    @Query
    @NameInMap("AllowUserToManageAccessKeys")
    private Boolean allowUserToManageAccessKeys;

    @Query
    @NameInMap("AllowUserToManageMFADevices")
    private Boolean allowUserToManageMFADevices;

    @Query
    @NameInMap("AllowUserToManagePublicKeys")
    private Boolean allowUserToManagePublicKeys;

    @Query
    @NameInMap("EnableSaveMFATicket")
    private Boolean enableSaveMFATicket;

    @Query
    @NameInMap("LoginNetworkMasks")
    private String loginNetworkMasks;

    @Query
    @NameInMap("LoginSessionDuration")
    private Integer loginSessionDuration;

    private SetSecurityPreferenceRequest(Builder builder) {
        super(builder);
        this.allowUserToChangePassword = builder.allowUserToChangePassword;
        this.allowUserToManageAccessKeys = builder.allowUserToManageAccessKeys;
        this.allowUserToManageMFADevices = builder.allowUserToManageMFADevices;
        this.allowUserToManagePublicKeys = builder.allowUserToManagePublicKeys;
        this.enableSaveMFATicket = builder.enableSaveMFATicket;
        this.loginNetworkMasks = builder.loginNetworkMasks;
        this.loginSessionDuration = builder.loginSessionDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSecurityPreferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowUserToChangePassword
     */
    public Boolean getAllowUserToChangePassword() {
        return this.allowUserToChangePassword;
    }

    /**
     * @return allowUserToManageAccessKeys
     */
    public Boolean getAllowUserToManageAccessKeys() {
        return this.allowUserToManageAccessKeys;
    }

    /**
     * @return allowUserToManageMFADevices
     */
    public Boolean getAllowUserToManageMFADevices() {
        return this.allowUserToManageMFADevices;
    }

    /**
     * @return allowUserToManagePublicKeys
     */
    public Boolean getAllowUserToManagePublicKeys() {
        return this.allowUserToManagePublicKeys;
    }

    /**
     * @return enableSaveMFATicket
     */
    public Boolean getEnableSaveMFATicket() {
        return this.enableSaveMFATicket;
    }

    /**
     * @return loginNetworkMasks
     */
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    /**
     * @return loginSessionDuration
     */
    public Integer getLoginSessionDuration() {
        return this.loginSessionDuration;
    }

    public static final class Builder extends Request.Builder<SetSecurityPreferenceRequest, Builder> {
        private Boolean allowUserToChangePassword; 
        private Boolean allowUserToManageAccessKeys; 
        private Boolean allowUserToManageMFADevices; 
        private Boolean allowUserToManagePublicKeys; 
        private Boolean enableSaveMFATicket; 
        private String loginNetworkMasks; 
        private Integer loginSessionDuration; 

        private Builder() {
            super();
        } 

        private Builder(SetSecurityPreferenceRequest response) {
            super(response);
            this.allowUserToChangePassword = response.allowUserToChangePassword;
            this.allowUserToManageAccessKeys = response.allowUserToManageAccessKeys;
            this.allowUserToManageMFADevices = response.allowUserToManageMFADevices;
            this.allowUserToManagePublicKeys = response.allowUserToManagePublicKeys;
            this.enableSaveMFATicket = response.enableSaveMFATicket;
            this.loginNetworkMasks = response.loginNetworkMasks;
            this.loginSessionDuration = response.loginSessionDuration;
        } 

        /**
         * AllowUserToChangePassword.
         */
        public Builder allowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.putQueryParameter("AllowUserToChangePassword", allowUserToChangePassword);
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }

        /**
         * AllowUserToManageAccessKeys.
         */
        public Builder allowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.putQueryParameter("AllowUserToManageAccessKeys", allowUserToManageAccessKeys);
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }

        /**
         * AllowUserToManageMFADevices.
         */
        public Builder allowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.putQueryParameter("AllowUserToManageMFADevices", allowUserToManageMFADevices);
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }

        /**
         * AllowUserToManagePublicKeys.
         */
        public Builder allowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
            this.putQueryParameter("AllowUserToManagePublicKeys", allowUserToManagePublicKeys);
            this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
            return this;
        }

        /**
         * EnableSaveMFATicket.
         */
        public Builder enableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.putQueryParameter("EnableSaveMFATicket", enableSaveMFATicket);
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }

        /**
         * LoginNetworkMasks.
         */
        public Builder loginNetworkMasks(String loginNetworkMasks) {
            this.putQueryParameter("LoginNetworkMasks", loginNetworkMasks);
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }

        /**
         * LoginSessionDuration.
         */
        public Builder loginSessionDuration(Integer loginSessionDuration) {
            this.putQueryParameter("LoginSessionDuration", loginSessionDuration);
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }

        @Override
        public SetSecurityPreferenceRequest build() {
            return new SetSecurityPreferenceRequest(this);
        } 

    } 

}
