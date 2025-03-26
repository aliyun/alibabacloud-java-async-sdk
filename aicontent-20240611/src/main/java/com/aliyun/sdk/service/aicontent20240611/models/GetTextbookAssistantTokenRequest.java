// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link GetTextbookAssistantTokenRequest} extends {@link RequestModel}
 *
 * <p>GetTextbookAssistantTokenRequest</p>
 */
public class GetTextbookAssistantTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    @com.aliyun.core.annotation.Validation(required = true)
    private String model;

    private GetTextbookAssistantTokenRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.model = builder.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextbookAssistantTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    public static final class Builder extends Request.Builder<GetTextbookAssistantTokenRequest, Builder> {
        private String deviceId; 
        private String model; 

        private Builder() {
            super();
        } 

        private Builder(GetTextbookAssistantTokenRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.model = request.model;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>700d4d9411efbe6e0</p>
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("deviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>25032PS56C</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        @Override
        public GetTextbookAssistantTokenRequest build() {
            return new GetTextbookAssistantTokenRequest(this);
        } 

    } 

}
