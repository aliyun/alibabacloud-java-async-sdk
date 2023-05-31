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
         * Specifies whether to enable the vulnerability scan feature. Valid values:
         * <p>
         * 
         * *   **on**: enables the feature
         * *   **off**: disables the feature
         * 
         * > Valid values when you set the Type parameter to scanMode:
         * 
         * *   **real**: displays only easily exploitable vulnerabilities.
         * 
         * *   **all**: displays all vulnerabilities.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability
         * *   **sys**: Windows system vulnerability
         * *   **cms**: Web-CMS vulnerability
         * *   **emg**: urgent vulnerability
         * *   **app**: application vulnerability
         * *   **yum**: YUM and APT source configuration
         * *   **scanMode**: easily exploitable vulnerability
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
