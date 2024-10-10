// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetBuildRiskDefineRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>SetBuildRiskDefineRuleConfigRequest</p>
 */
public class SetBuildRiskDefineRuleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    private SetBuildRiskDefineRuleConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetBuildRiskDefineRuleConfigRequest create() {
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

    public static final class Builder extends Request.Builder<SetBuildRiskDefineRuleConfigRequest, Builder> {
        private String config; 

        private Builder() {
            super();
        } 

        private Builder(SetBuildRiskDefineRuleConfigRequest request) {
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
        public SetBuildRiskDefineRuleConfigRequest build() {
            return new SetBuildRiskDefineRuleConfigRequest(this);
        } 

    } 

}
