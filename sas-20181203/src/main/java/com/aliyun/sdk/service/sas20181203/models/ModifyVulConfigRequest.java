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
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ModifyVulConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyVulConfigRequest, Builder> {
        private String config; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVulConfigRequest request) {
            super(request);
            this.config = request.config;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether to enable the vulnerability scan feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the feature</li>
         * <li><strong>off</strong>: disables the feature</li>
         * </ul>
         * <blockquote>
         * <p>Valid values when you set the Type parameter to scanMode:</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>real</strong>: displays only easily exploitable vulnerabilities.</p>
         * </li>
         * <li><p><strong>all</strong>: displays all vulnerabilities.</p>
         * </li>
         * </ul>
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
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>yum</strong>: YUM and APT source configuration</li>
         * <li><strong>scanMode</strong>: easily exploitable vulnerability</li>
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
