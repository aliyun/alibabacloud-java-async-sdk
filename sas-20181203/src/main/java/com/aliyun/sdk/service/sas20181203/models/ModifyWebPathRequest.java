// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebPathRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebPathRequest</p>
 */
public class ModifyWebPathRequest extends Request {
    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("Target")
    private String target;

    @Query
    @NameInMap("Type")
    private String type;

    private ModifyWebPathRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebPathRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyWebPathRequest, Builder> {
        private String config; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebPathRequest request) {
            super(request);
            this.config = request.config;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * The configuration of the web directory. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **webPathType**: the type of the web directory
         * *   **webPath**: the web directory
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The protected asset to which the web directory belongs. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **target**: the protected asset.
         * *   **targetType**: the type of the asset. Set the value to uuid.
         * *   **flag**: the type of the operation.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * The type of the configuration item. Set the value to **web_path**.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyWebPathRequest build() {
            return new ModifyWebPathRequest(this);
        } 

    } 

}
