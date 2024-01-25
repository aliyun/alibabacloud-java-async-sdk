// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayRequest</p>
 */
public class CreateGatewayRequest extends Request {
    @Query
    @NameInMap("ResourceName")
    private String resourceName;

    @Body
    @NameInMap("EnableInternet")
    private Boolean enableInternet;

    @Body
    @NameInMap("EnableIntranet")
    private Boolean enableIntranet;

    @Body
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Body
    @NameInMap("Name")
    private String name;

    private CreateGatewayRequest(Builder builder) {
        super(builder);
        this.resourceName = builder.resourceName;
        this.enableInternet = builder.enableInternet;
        this.enableIntranet = builder.enableIntranet;
        this.instanceType = builder.instanceType;
        this.name = builder.name;
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

    public static final class Builder extends Request.Builder<CreateGatewayRequest, Builder> {
        private String resourceName; 
        private Boolean enableInternet; 
        private Boolean enableIntranet; 
        private String instanceType; 
        private String name; 

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
        } 

        /**
         * The name of the resource group.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
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
         * The private gateway alias.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateGatewayRequest build() {
            return new CreateGatewayRequest(this);
        } 

    } 

}
