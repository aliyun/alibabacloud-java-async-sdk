// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRequest</p>
 */
public class UpdateGatewayRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableInternet")
    private Boolean enableInternet;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableIntranet")
    private Boolean enableIntranet;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    private UpdateGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.clusterId = builder.clusterId;
        this.enableInternet = builder.enableInternet;
        this.enableIntranet = builder.enableIntranet;
        this.instanceType = builder.instanceType;
        this.isDefault = builder.isDefault;
        this.name = builder.name;
        this.replicas = builder.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return enableInternet
     */
    public Boolean getEnableInternet() {
        return this.enableInternet;
    }

    /**
     * @return enableIntranet
     */
    public Boolean getEnableIntranet() {
        return this.enableIntranet;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRequest, Builder> {
        private String gatewayId; 
        private String clusterId; 
        private Boolean enableInternet; 
        private Boolean enableIntranet; 
        private String instanceType; 
        private Boolean isDefault; 
        private String name; 
        private Integer replicas; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.clusterId = request.clusterId;
            this.enableInternet = request.enableInternet;
            this.enableIntranet = request.enableIntranet;
            this.instanceType = request.instanceType;
            this.isDefault = request.isDefault;
            this.name = request.name;
            this.replicas = request.replicas;
        } 

        /**
         * The ID of the private gateway.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * The region of the private gateway.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to enable Internet access. Default value: false.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder enableInternet(Boolean enableInternet) {
            this.putBodyParameter("EnableInternet", enableInternet);
            this.enableInternet = enableInternet;
            return this;
        }

        /**
         * Specifies whether to enable internal network access. Default value: true.
         */
        public Builder enableIntranet(Boolean enableIntranet) {
            this.putBodyParameter("EnableIntranet", enableIntranet);
            this.enableIntranet = enableIntranet;
            return this;
        }

        /**
         * The instance type used for the private gateway.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * IsDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.putBodyParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * The private gateway alias.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Replicas.
         */
        public Builder replicas(Integer replicas) {
            this.putBodyParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        @Override
        public UpdateGatewayRequest build() {
            return new UpdateGatewayRequest(this);
        } 

    } 

}
