// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVulTargetConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyVulTargetConfigRequest</p>
 */
public class ModifyVulTargetConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private ModifyVulTargetConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVulTargetConfigRequest create() {
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyVulTargetConfigRequest, Builder> {
        private String config; 
        private String sourceIp; 
        private String type; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVulTargetConfigRequest request) {
            super(request);
            this.config = request.config;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
            this.uuid = request.uuid;
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
         * 1.2.XX.XX
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Configures vulnerability detection for a server.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyVulTargetConfigRequest build() {
            return new ModifyVulTargetConfigRequest(this);
        } 

    } 

}
