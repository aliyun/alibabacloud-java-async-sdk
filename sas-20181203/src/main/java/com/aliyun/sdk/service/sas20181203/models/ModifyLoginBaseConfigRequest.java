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

        private Builder(ModifyLoginBaseConfigRequest response) {
            super(response);
            this.config = response.config;
            this.target = response.target;
            this.type = response.type;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * Type.
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
