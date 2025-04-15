// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetUserDeviceRequest} extends {@link RequestModel}
 *
 * <p>GetUserDeviceRequest</p>
 */
public class GetUserDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceTag;

    private GetUserDeviceRequest(Builder builder) {
        super(builder);
        this.deviceTag = builder.deviceTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceTag
     */
    public String getDeviceTag() {
        return this.deviceTag;
    }

    public static final class Builder extends Request.Builder<GetUserDeviceRequest, Builder> {
        private String deviceTag; 

        private Builder() {
            super();
        } 

        private Builder(GetUserDeviceRequest request) {
            super(request);
            this.deviceTag = request.deviceTag;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        public Builder deviceTag(String deviceTag) {
            this.putQueryParameter("DeviceTag", deviceTag);
            this.deviceTag = deviceTag;
            return this;
        }

        @Override
        public GetUserDeviceRequest build() {
            return new GetUserDeviceRequest(this);
        } 

    } 

}
