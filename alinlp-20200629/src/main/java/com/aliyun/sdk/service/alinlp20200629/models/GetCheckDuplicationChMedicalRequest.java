// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckDuplicationChMedicalRequest} extends {@link RequestModel}
 *
 * <p>GetCheckDuplicationChMedicalRequest</p>
 */
public class GetCheckDuplicationChMedicalRequest extends Request {
    @Body
    @NameInMap("OriginQ")
    @Validation(required = true)
    private String originQ;

    @Body
    @NameInMap("OriginT")
    @Validation(required = true)
    private String originT;

    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    private GetCheckDuplicationChMedicalRequest(Builder builder) {
        super(builder);
        this.originQ = builder.originQ;
        this.originT = builder.originT;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckDuplicationChMedicalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return originQ
     */
    public String getOriginQ() {
        return this.originQ;
    }

    /**
     * @return originT
     */
    public String getOriginT() {
        return this.originT;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<GetCheckDuplicationChMedicalRequest, Builder> {
        private String originQ; 
        private String originT; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckDuplicationChMedicalRequest request) {
            super(request);
            this.originQ = request.originQ;
            this.originT = request.originT;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * OriginQ.
         */
        public Builder originQ(String originQ) {
            this.putBodyParameter("OriginQ", originQ);
            this.originQ = originQ;
            return this;
        }

        /**
         * OriginT.
         */
        public Builder originT(String originT) {
            this.putBodyParameter("OriginT", originT);
            this.originT = originT;
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
        public GetCheckDuplicationChMedicalRequest build() {
            return new GetCheckDuplicationChMedicalRequest(this);
        } 

    } 

}
