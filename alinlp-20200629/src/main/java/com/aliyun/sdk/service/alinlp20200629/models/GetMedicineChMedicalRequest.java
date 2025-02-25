// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMedicineChMedicalRequest} extends {@link RequestModel}
 *
 * <p>GetMedicineChMedicalRequest</p>
 */
public class GetMedicineChMedicalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Factory")
    private String factory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Specification")
    private String specification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    private GetMedicineChMedicalRequest(Builder builder) {
        super(builder);
        this.factory = builder.factory;
        this.name = builder.name;
        this.serviceCode = builder.serviceCode;
        this.specification = builder.specification;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMedicineChMedicalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return factory
     */
    public String getFactory() {
        return this.factory;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder extends Request.Builder<GetMedicineChMedicalRequest, Builder> {
        private String factory; 
        private String name; 
        private String serviceCode; 
        private String specification; 
        private String unit; 

        private Builder() {
            super();
        } 

        private Builder(GetMedicineChMedicalRequest request) {
            super(request);
            this.factory = request.factory;
            this.name = request.name;
            this.serviceCode = request.serviceCode;
            this.specification = request.specification;
            this.unit = request.unit;
        } 

        /**
         * Factory.
         */
        public Builder factory(String factory) {
            this.putBodyParameter("Factory", factory);
            this.factory = factory;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * Specification.
         */
        public Builder specification(String specification) {
            this.putBodyParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * Unit.
         */
        public Builder unit(String unit) {
            this.putBodyParameter("Unit", unit);
            this.unit = unit;
            return this;
        }

        @Override
        public GetMedicineChMedicalRequest build() {
            return new GetMedicineChMedicalRequest(this);
        } 

    } 

}
