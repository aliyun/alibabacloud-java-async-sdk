// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link ConfigInstanceWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ConfigInstanceWhitelistRequest</p>
 */
public class ConfigInstanceWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String whitelist;

    private ConfigInstanceWhitelistRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigInstanceWhitelistRequest create() {
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
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<ConfigInstanceWhitelistRequest, Builder> {
        private String instanceId; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(ConfigInstanceWhitelistRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The ID of the HSM.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-vj30bil8****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>A list of IP addresses that you want to configure in the whitelist. Separate multiple IP addresses with spaces or commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18.68.XX.XX,18.68.XX.XX</p>
         */
        public Builder whitelist(String whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public ConfigInstanceWhitelistRequest build() {
            return new ConfigInstanceWhitelistRequest(this);
        } 

    } 

}
