// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyVulConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyVulConfigRequest</p>
 */
public class ModifyVulConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ModifyVulConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.config = builder.config;
        this.dryRun = builder.dryRun;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVulConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyVulConfigRequest, Builder> {
        private String clientToken; 
        private String config; 
        private Boolean dryRun; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVulConfigRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.config = request.config;
            this.dryRun = request.dryRun;
            this.type = request.type;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable or disable vulnerability detection. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enables vulnerability detection.</li>
         * <li><strong>off</strong>: Disables vulnerability detection.</li>
         * </ul>
         * <blockquote>
         * <p>If the type is set to real risk, valid values:</p>
         * <ul>
         * <li><strong>real</strong>: Real risk vulnerabilities.</li>
         * <li><strong>all</strong>: All vulnerabilities.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run of the request. Valid values: true: performs only a dry run without performing the actual operation. false: performs the actual request. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The type of vulnerability to modify. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>emg</strong>: emergency vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>yum</strong>: YUM/APT source configuration</li>
         * <li><strong>scanMode</strong>: real risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyVulConfigRequest build() {
            return new ModifyVulConfigRequest(this);
        } 

    } 

}
