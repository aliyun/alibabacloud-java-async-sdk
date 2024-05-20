// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnosisChMedicalRequest} extends {@link RequestModel}
 *
 * <p>GetDiagnosisChMedicalRequest</p>
 */
public class GetDiagnosisChMedicalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    private GetDiagnosisChMedicalRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnosisChMedicalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetDiagnosisChMedicalRequest, Builder> {
        private String name; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetDiagnosisChMedicalRequest request) {
            super(request);
            this.name = request.name;
            this.serviceCode = request.serviceCode;
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

        @Override
        public GetDiagnosisChMedicalRequest build() {
            return new GetDiagnosisChMedicalRequest(this);
        } 

    } 

}
