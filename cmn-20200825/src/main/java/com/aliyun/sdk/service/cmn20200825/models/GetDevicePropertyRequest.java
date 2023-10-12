// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevicePropertyRequest} extends {@link RequestModel}
 *
 * <p>GetDevicePropertyRequest</p>
 */
public class GetDevicePropertyRequest extends Request {
    @Query
    @NameInMap("DeviceFormId")
    private String deviceFormId;

    @Query
    @NameInMap("DevicePropertyId")
    private String devicePropertyId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PropertyKey")
    private String propertyKey;

    private GetDevicePropertyRequest(Builder builder) {
        super(builder);
        this.deviceFormId = builder.deviceFormId;
        this.devicePropertyId = builder.devicePropertyId;
        this.instanceId = builder.instanceId;
        this.propertyKey = builder.propertyKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevicePropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceFormId
     */
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    /**
     * @return devicePropertyId
     */
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return propertyKey
     */
    public String getPropertyKey() {
        return this.propertyKey;
    }

    public static final class Builder extends Request.Builder<GetDevicePropertyRequest, Builder> {
        private String deviceFormId; 
        private String devicePropertyId; 
        private String instanceId; 
        private String propertyKey; 

        private Builder() {
            super();
        } 

        private Builder(GetDevicePropertyRequest request) {
            super(request);
            this.deviceFormId = request.deviceFormId;
            this.devicePropertyId = request.devicePropertyId;
            this.instanceId = request.instanceId;
            this.propertyKey = request.propertyKey;
        } 

        /**
         * DeviceFormId.
         */
        public Builder deviceFormId(String deviceFormId) {
            this.putQueryParameter("DeviceFormId", deviceFormId);
            this.deviceFormId = deviceFormId;
            return this;
        }

        /**
         * DevicePropertyId.
         */
        public Builder devicePropertyId(String devicePropertyId) {
            this.putQueryParameter("DevicePropertyId", devicePropertyId);
            this.devicePropertyId = devicePropertyId;
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
         * PropertyKey.
         */
        public Builder propertyKey(String propertyKey) {
            this.putQueryParameter("PropertyKey", propertyKey);
            this.propertyKey = propertyKey;
            return this;
        }

        @Override
        public GetDevicePropertyRequest build() {
            return new GetDevicePropertyRequest(this);
        } 

    } 

}
