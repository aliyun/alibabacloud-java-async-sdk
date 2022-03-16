// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceServiceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceServiceConfigRequest</p>
 */
public class ModifyInstanceServiceConfigRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ConfigureName")
    private String configureName;

    @Query
    @NameInMap("ConfigureValue")
    private String configureValue;

    @Query
    @NameInMap("Parameters")
    private String parameters;

    @Query
    @NameInMap("Restart")
    private Boolean restart;

    private ModifyInstanceServiceConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configureName = builder.configureName;
        this.configureValue = builder.configureValue;
        this.parameters = builder.parameters;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceServiceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configureName
     */
    public String getConfigureName() {
        return this.configureName;
    }

    /**
     * @return configureValue
     */
    public String getConfigureValue() {
        return this.configureValue;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceServiceConfigRequest, Builder> {
        private String clusterId; 
        private String configureName; 
        private String configureValue; 
        private String parameters; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceServiceConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.configureName = request.configureName;
            this.configureValue = request.configureValue;
            this.parameters = request.parameters;
            this.restart = request.restart;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ConfigureName.
         */
        public Builder configureName(String configureName) {
            this.putQueryParameter("ConfigureName", configureName);
            this.configureName = configureName;
            return this;
        }

        /**
         * ConfigureValue.
         */
        public Builder configureValue(String configureValue) {
            this.putQueryParameter("ConfigureValue", configureValue);
            this.configureValue = configureValue;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        @Override
        public ModifyInstanceServiceConfigRequest build() {
            return new ModifyInstanceServiceConfigRequest(this);
        } 

    } 

}
