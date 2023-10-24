// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSensitiveDefineRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>SetSensitiveDefineRuleConfigRequest</p>
 */
public class SetSensitiveDefineRuleConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    private String config;

    private SetSensitiveDefineRuleConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSensitiveDefineRuleConfigRequest create() {
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

    public static final class Builder extends Request.Builder<SetSensitiveDefineRuleConfigRequest, Builder> {
        private String config; 

        private Builder() {
            super();
        } 

        private Builder(SetSensitiveDefineRuleConfigRequest request) {
            super(request);
            this.config = request.config;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        @Override
        public SetSensitiveDefineRuleConfigRequest build() {
            return new SetSensitiveDefineRuleConfigRequest(this);
        } 

    } 

}
