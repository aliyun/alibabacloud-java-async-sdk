// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataAPIServiceDetailRequest} extends {@link RequestModel}
 *
 * <p>GetDataAPIServiceDetailRequest</p>
 */
public class GetDataAPIServiceDetailRequest extends Request {
    @Body
    @NameInMap("ApiSrn")
    @Validation(required = true)
    private String apiSrn;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private GetDataAPIServiceDetailRequest(Builder builder) {
        super(builder);
        this.apiSrn = builder.apiSrn;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAPIServiceDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiSrn
     */
    public String getApiSrn() {
        return this.apiSrn;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<GetDataAPIServiceDetailRequest, Builder> {
        private String apiSrn; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataAPIServiceDetailRequest response) {
            super(response);
            this.apiSrn = response.apiSrn;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * ApiSrn.
         */
        public Builder apiSrn(String apiSrn) {
            this.putBodyParameter("ApiSrn", apiSrn);
            this.apiSrn = apiSrn;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public GetDataAPIServiceDetailRequest build() {
            return new GetDataAPIServiceDetailRequest(this);
        } 

    } 

}
