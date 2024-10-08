// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayRequest</p>
 */
public class CreateGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableInternet")
    private Boolean enableInternet;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableIntranet")
    private Boolean enableIntranet;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    private CreateGatewayRequest(Builder builder) {
        super(builder);
        this.resourceName = builder.resourceName;
        this.enableInternet = builder.enableInternet;
        this.enableIntranet = builder.enableIntranet;
        this.instanceType = builder.instanceType;
        this.name = builder.name;
        this.replicas = builder.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
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

    public static final class Builder extends Request.Builder<CreateGatewayRequest, Builder> {
        private String resourceName; 
        private Boolean enableInternet; 
        private Boolean enableIntranet; 
        private String instanceType; 
        private String name; 
        private Integer replicas; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayRequest request) {
            super(request);
            this.resourceName = request.resourceName;
            this.enableInternet = request.enableInternet;
            this.enableIntranet = request.enableIntranet;
            this.instanceType = request.instanceType;
            this.name = request.name;
            this.replicas = request.replicas;
        } 

        /**
         * <p>The resource group ID. To obtain a resource group ID, see the ResourceId field in the response of the <a href="~~412133~~">ListResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-4gt8twzwllfo******</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>Specifies whether to enable Internet access. Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Specifies whether to enable private access. Default value: true.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
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
         * <p>The instance type used by the private gateway. Valid values:</p>
         * <ul>
         * <li>2c4g</li>
         * <li>4c8g</li>
         * <li>8c16g</li>
         * <li>16c32g</li>
         * </ul>
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
         * <p>The alias of the private gateway.</p>
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
        public CreateGatewayRequest build() {
            return new CreateGatewayRequest(this);
        } 

    } 

}
