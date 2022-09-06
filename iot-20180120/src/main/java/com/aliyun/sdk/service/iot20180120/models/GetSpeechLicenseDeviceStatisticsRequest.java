// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpeechLicenseDeviceStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetSpeechLicenseDeviceStatisticsRequest</p>
 */
public class GetSpeechLicenseDeviceStatisticsRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private GetSpeechLicenseDeviceStatisticsRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpeechLicenseDeviceStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<GetSpeechLicenseDeviceStatisticsRequest, Builder> {
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetSpeechLicenseDeviceStatisticsRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
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
        public GetSpeechLicenseDeviceStatisticsRequest build() {
            return new GetSpeechLicenseDeviceStatisticsRequest(this);
        } 

    } 

}
