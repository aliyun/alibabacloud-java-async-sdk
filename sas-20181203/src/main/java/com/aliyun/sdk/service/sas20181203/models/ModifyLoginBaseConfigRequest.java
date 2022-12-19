// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLoginBaseConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyLoginBaseConfigRequest</p>
 */
public class ModifyLoginBaseConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("Target")
    @Validation(required = true)
    private String target;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ModifyLoginBaseConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLoginBaseConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyLoginBaseConfigRequest, Builder> {
        private String config; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLoginBaseConfigRequest request) {
            super(request);
            this.config = request.config;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * The details about the configuration that is used to detect unusual logons to your servers. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * - **totalCount**: the total number of assets. 
         * - **uuidCount**: the number of servers to which the configuration is applied. 
         * - **id**: the ID of the configuration. 
         * - **location**: the name of the common logon location. 
         * 
         * > You must specify the location parameter only if the Type parameter is set to login_common_location. 
         * 
         * - **ip**: the common logon IP address. 
         * 
         * > You must specify the ip parameter only if the Type parameter is set to login_common_ip. 
         * 
         * - **endTime**: the end time of the common logon time range. 
         * 
         * > You must specify the endTime parameter only if the Type parameter is set to login_common_time. 
         * 
         * - **startTime**: the start time of the common logon time range. 
         * 
         * > You must specify the startTime parameter only if the Type parameter is set to login_common_time. 
         * 
         * - **account**: the common logon account. 
         * 
         * > You must specify the account parameter only if the Type parameter is set to login_common_account.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The configuration of the server to which the configuration used to detect unusual logons is applied. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * - **Target**: the UUID of the server that you want to add or remove. 
         * - **targetType*: the type based on which you add servers. Valid values:
         *     - **uuid**: servers 
         *     - **groupId**: server groups 
         * - **flag**: the operation that you want to perform on the server. Valid values:
         *     - **del**: removes the server from the configuration. 
         *     - **add**: adds the server to the configuration.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * The type of logon configuration that you want to modify. Valid values:
         * <p>
         * - **login_common_location**: common logon location 
         * - **login_common_ip**: common logon IP address 
         * - **login_common_time**: common logon time range 
         * - **login_common_account**: common logon account
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyLoginBaseConfigRequest build() {
            return new ModifyLoginBaseConfigRequest(this);
        } 

    } 

}
