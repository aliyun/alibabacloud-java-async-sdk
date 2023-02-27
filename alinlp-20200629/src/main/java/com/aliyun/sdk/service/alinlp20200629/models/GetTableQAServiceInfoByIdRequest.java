// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableQAServiceInfoByIdRequest} extends {@link RequestModel}
 *
 * <p>GetTableQAServiceInfoByIdRequest</p>
 */
public class GetTableQAServiceInfoByIdRequest extends Request {
    @Body
    @NameInMap("ServiceCode")
    private String serviceCode;

    @Body
    @NameInMap("ServiceId")
    private String serviceId;

    private GetTableQAServiceInfoByIdRequest(Builder builder) {
        super(builder);
        this.serviceCode = builder.serviceCode;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableQAServiceInfoByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<GetTableQAServiceInfoByIdRequest, Builder> {
        private String serviceCode; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(GetTableQAServiceInfoByIdRequest request) {
            super(request);
            this.serviceCode = request.serviceCode;
            this.serviceId = request.serviceId;
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
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public GetTableQAServiceInfoByIdRequest build() {
            return new GetTableQAServiceInfoByIdRequest(this);
        } 

    } 

}
