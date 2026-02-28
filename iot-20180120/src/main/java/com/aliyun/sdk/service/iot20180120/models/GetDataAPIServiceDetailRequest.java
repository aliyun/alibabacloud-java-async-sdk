// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataAPIServiceDetailRequest} extends {@link RequestModel}
 *
 * <p>GetDataAPIServiceDetailRequest</p>
 */
public class GetDataAPIServiceDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiSrn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiSrn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
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

        private Builder(GetDataAPIServiceDetailRequest request) {
            super(request);
            this.apiSrn = request.apiSrn;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:iot:<em>:127103983461</em>***:serveapi/device/getDeviceCountByStatus2</p>
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
