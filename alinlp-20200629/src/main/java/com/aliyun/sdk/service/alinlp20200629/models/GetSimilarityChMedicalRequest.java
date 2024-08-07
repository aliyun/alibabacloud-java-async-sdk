// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSimilarityChMedicalRequest} extends {@link RequestModel}
 *
 * <p>GetSimilarityChMedicalRequest</p>
 */
public class GetSimilarityChMedicalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginQ")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originQ;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginT")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originT;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    private GetSimilarityChMedicalRequest(Builder builder) {
        super(builder);
        this.originQ = builder.originQ;
        this.originT = builder.originT;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSimilarityChMedicalRequest create() {
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

    public static final class Builder extends Request.Builder<GetSimilarityChMedicalRequest, Builder> {
        private String originQ; 
        private String originT; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetSimilarityChMedicalRequest request) {
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
        public GetSimilarityChMedicalRequest build() {
            return new GetSimilarityChMedicalRequest(this);
        } 

    } 

}
