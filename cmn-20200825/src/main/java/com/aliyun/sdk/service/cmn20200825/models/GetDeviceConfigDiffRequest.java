// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceConfigDiffRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceConfigDiffRequest</p>
 */
public class GetDeviceConfigDiffRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private GetDeviceConfigDiffRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigDiffRequest create() {
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
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetDeviceConfigDiffRequest, Builder> {
        private String deviceId; 
        private String endDate; 
        private String instanceId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceConfigDiffRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.startDate = request.startDate;
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
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetDeviceConfigDiffRequest build() {
            return new GetDeviceConfigDiffRequest(this);
        } 

    } 

}
