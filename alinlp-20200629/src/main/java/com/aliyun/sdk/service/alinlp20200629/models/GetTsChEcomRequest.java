// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTsChEcomRequest} extends {@link RequestModel}
 *
 * <p>GetTsChEcomRequest</p>
 */
public class GetTsChEcomRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetTsChEcomRequest(Builder builder) {
        super(builder);
        this.originQ = builder.originQ;
        this.originT = builder.originT;
        this.serviceCode = builder.serviceCode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTsChEcomRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetTsChEcomRequest, Builder> {
        private String originQ; 
        private String originT; 
        private String serviceCode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetTsChEcomRequest request) {
            super(request);
            this.originQ = request.originQ;
            this.originT = request.originT;
            this.serviceCode = request.serviceCode;
            this.type = request.type;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetTsChEcomRequest build() {
            return new GetTsChEcomRequest(this);
        } 

    } 

}
