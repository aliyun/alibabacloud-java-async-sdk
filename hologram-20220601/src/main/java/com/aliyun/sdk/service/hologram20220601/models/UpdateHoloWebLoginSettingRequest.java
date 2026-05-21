// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link UpdateHoloWebLoginSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoloWebLoginSettingRequest</p>
 */
public class UpdateHoloWebLoginSettingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowExternalAccountsLogin")
    private Boolean allowExternalAccountsLogin;

    private UpdateHoloWebLoginSettingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.allowExternalAccountsLogin = builder.allowExternalAccountsLogin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHoloWebLoginSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return allowExternalAccountsLogin
     */
    public Boolean getAllowExternalAccountsLogin() {
        return this.allowExternalAccountsLogin;
    }

    public static final class Builder extends Request.Builder<UpdateHoloWebLoginSettingRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private Boolean allowExternalAccountsLogin; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHoloWebLoginSettingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.allowExternalAccountsLogin = request.allowExternalAccountsLogin;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * allowExternalAccountsLogin.
         */
        public Builder allowExternalAccountsLogin(Boolean allowExternalAccountsLogin) {
            this.putBodyParameter("allowExternalAccountsLogin", allowExternalAccountsLogin);
            this.allowExternalAccountsLogin = allowExternalAccountsLogin;
            return this;
        }

        @Override
        public UpdateHoloWebLoginSettingRequest build() {
            return new UpdateHoloWebLoginSettingRequest(this);
        } 

    } 

}
