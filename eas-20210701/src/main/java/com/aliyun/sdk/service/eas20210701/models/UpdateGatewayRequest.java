// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("EnableSSLRedirection")
    private Boolean enableSSLRedirection;

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
        this.enableSSLRedirection = builder.enableSSLRedirection;
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
     * @return enableSSLRedirection
     */
    public Boolean getEnableSSLRedirection() {
        return this.enableSSLRedirection;
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
        private Boolean enableSSLRedirection; 
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
            this.enableSSLRedirection = request.enableSSLRedirection;
            this.instanceType = request.instanceType;
            this.isDefault = request.isDefault;
            this.name = request.name;
            this.replicas = request.replicas;
        } 

        /**
         * <p>The ID of the private gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The region of the private gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable Internet access. Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableInternet(Boolean enableInternet) {
            this.putBodyParameter("EnableInternet", enableInternet);
            this.enableInternet = enableInternet;
            return this;
        }

        /**
         * <p>Specifies whether to enable internal network access. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableIntranet(Boolean enableIntranet) {
            this.putBodyParameter("EnableIntranet", enableIntranet);
            this.enableIntranet = enableIntranet;
            return this;
        }

        /**
         * EnableSSLRedirection.
         */
        public Builder enableSSLRedirection(Boolean enableSSLRedirection) {
            this.putBodyParameter("EnableSSLRedirection", enableSSLRedirection);
            this.enableSSLRedirection = enableSSLRedirection;
            return this;
        }

        /**
         * <p>The instance type used for the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.4xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Indicates whether it is the default private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.putBodyParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The private gateway alias.</p>
         * 
         * <strong>example:</strong>
         * <p>mygateway1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of nodes in the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
