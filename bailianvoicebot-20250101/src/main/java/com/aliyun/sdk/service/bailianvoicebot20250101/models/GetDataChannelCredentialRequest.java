// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link GetDataChannelCredentialRequest} extends {@link RequestModel}
 *
 * <p>GetDataChannelCredentialRequest</p>
 */
public class GetDataChannelCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    private GetDataChannelCredentialRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataChannelCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    public static final class Builder extends Request.Builder<GetDataChannelCredentialRequest, Builder> {
        private String businessUnitId; 
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataChannelCredentialRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.deviceId = request.deviceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-c11iig67g863rih8</p>
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putQueryParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device-3i5x4234f2j4w55e</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public GetDataChannelCredentialRequest build() {
            return new GetDataChannelCredentialRequest(this);
        } 

    } 

}
