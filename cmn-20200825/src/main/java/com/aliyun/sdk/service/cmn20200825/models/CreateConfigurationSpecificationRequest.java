// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigurationSpecificationRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigurationSpecificationRequest</p>
 */
public class CreateConfigurationSpecificationRequest extends Request {
    @Body
    @NameInMap("Architecture")
    @Validation(required = true)
    private String architecture;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Model")
    @Validation(required = true)
    private String model;

    @Body
    @NameInMap("RelatedVariate")
    private java.util.List < byte[] > relatedVariate;

    @Body
    @NameInMap("Role")
    @Validation(required = true)
    private String role;

    @Body
    @NameInMap("SpecificationContent")
    @Validation(required = true)
    private String specificationContent;

    @Body
    @NameInMap("SpecificationName")
    @Validation(required = true)
    private String specificationName;

    @Body
    @NameInMap("Vendor")
    @Validation(required = true)
    private String vendor;

    private CreateConfigurationSpecificationRequest(Builder builder) {
        super(builder);
        this.architecture = builder.architecture;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.relatedVariate = builder.relatedVariate;
        this.role = builder.role;
        this.specificationContent = builder.specificationContent;
        this.specificationName = builder.specificationName;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigurationSpecificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return relatedVariate
     */
    public java.util.List < byte[] > getRelatedVariate() {
        return this.relatedVariate;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return specificationContent
     */
    public String getSpecificationContent() {
        return this.specificationContent;
    }

    /**
     * @return specificationName
     */
    public String getSpecificationName() {
        return this.specificationName;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<CreateConfigurationSpecificationRequest, Builder> {
        private String architecture; 
        private String clientToken; 
        private String instanceId; 
        private String model; 
        private java.util.List < byte[] > relatedVariate; 
        private String role; 
        private String specificationContent; 
        private String specificationName; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigurationSpecificationRequest request) {
            super(request);
            this.architecture = request.architecture;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.relatedVariate = request.relatedVariate;
            this.role = request.role;
            this.specificationContent = request.specificationContent;
            this.specificationName = request.specificationName;
            this.vendor = request.vendor;
        } 

        /**
         * Architecture.
         */
        public Builder architecture(String architecture) {
            this.putBodyParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * RelatedVariate.
         */
        public Builder relatedVariate(java.util.List < byte[] > relatedVariate) {
            String relatedVariateShrink = shrink(relatedVariate, "RelatedVariate", "json");
            this.putBodyParameter("RelatedVariate", relatedVariateShrink);
            this.relatedVariate = relatedVariate;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putBodyParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * SpecificationContent.
         */
        public Builder specificationContent(String specificationContent) {
            this.putBodyParameter("SpecificationContent", specificationContent);
            this.specificationContent = specificationContent;
            return this;
        }

        /**
         * SpecificationName.
         */
        public Builder specificationName(String specificationName) {
            this.putBodyParameter("SpecificationName", specificationName);
            this.specificationName = specificationName;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public CreateConfigurationSpecificationRequest build() {
            return new CreateConfigurationSpecificationRequest(this);
        } 

    } 

}
