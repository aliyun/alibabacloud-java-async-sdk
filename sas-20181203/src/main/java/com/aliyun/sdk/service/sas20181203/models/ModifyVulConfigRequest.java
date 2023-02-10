// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVulConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyVulConfigRequest</p>
 */
public class ModifyVulConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("Type")
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
         * Enables or disables vulnerability scan. Valid values:
         * <p>
         * 
         * *   **on**: enables vulnerability scan
         * *   **off**: disables vulnerability scan
         * 
         * >  If you set Type to scanMode, Config specifies whether to show only real risk vulnerabilities. Valid values:
         * 
         * *   **real**: shows only real risk vulnerabilities
         * *   **all**: shows all vulnerabilities
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The type of the vulnerabilities. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerabilities
         * *   **sys**: Windows system vulnerabilities
         * *   **cms**: Web-CMS vulnerabilities
         * *   **emg**: urgent vulnerabilities
         * *   **app**: application vulnerabilities
         * *   **yum**: YUM and APT source configuration
         * *   **scanMode**: real risks
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
