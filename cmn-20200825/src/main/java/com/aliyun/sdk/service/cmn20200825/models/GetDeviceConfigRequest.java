// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceConfigRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceConfigRequest</p>
 */
public class GetDeviceConfigRequest extends Request {
    @Query
    @NameInMap("Date")
    private String date;

    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetDeviceConfigRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetDeviceConfigRequest, Builder> {
        private String date; 
        private String deviceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceConfigRequest request) {
            super(request);
            this.date = request.date;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
        } 

        /**
         * Date.
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetDeviceConfigRequest build() {
            return new GetDeviceConfigRequest(this);
        } 

    } 

}
