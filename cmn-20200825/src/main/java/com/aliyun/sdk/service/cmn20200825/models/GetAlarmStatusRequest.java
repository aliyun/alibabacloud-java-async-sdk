// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlarmStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAlarmStatusRequest</p>
 */
public class GetAlarmStatusRequest extends Request {
    @Query
    @NameInMap("AggregateDataId")
    private String aggregateDataId;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("DedicatedLineId")
    private String dedicatedLineId;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MonitorItemId")
    private String monitorItemId;

    @Query
    @NameInMap("PortCollectionId")
    private String portCollectionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private GetAlarmStatusRequest(Builder builder) {
        super(builder);
        this.aggregateDataId = builder.aggregateDataId;
        this.appId = builder.appId;
        this.dedicatedLineId = builder.dedicatedLineId;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.monitorItemId = builder.monitorItemId;
        this.portCollectionId = builder.portCollectionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlarmStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregateDataId
     */
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return dedicatedLineId
     */
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
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

    /**
     * @return monitorItemId
     */
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    /**
     * @return portCollectionId
     */
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetAlarmStatusRequest, Builder> {
        private String aggregateDataId; 
        private String appId; 
        private String dedicatedLineId; 
        private String deviceId; 
        private String instanceId; 
        private String monitorItemId; 
        private String portCollectionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetAlarmStatusRequest request) {
            super(request);
            this.aggregateDataId = request.aggregateDataId;
            this.appId = request.appId;
            this.dedicatedLineId = request.dedicatedLineId;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.monitorItemId = request.monitorItemId;
            this.portCollectionId = request.portCollectionId;
            this.type = request.type;
        } 

        /**
         * AggregateDataId.
         */
        public Builder aggregateDataId(String aggregateDataId) {
            this.putQueryParameter("AggregateDataId", aggregateDataId);
            this.aggregateDataId = aggregateDataId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DedicatedLineId.
         */
        public Builder dedicatedLineId(String dedicatedLineId) {
            this.putQueryParameter("DedicatedLineId", dedicatedLineId);
            this.dedicatedLineId = dedicatedLineId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MonitorItemId.
         */
        public Builder monitorItemId(String monitorItemId) {
            this.putQueryParameter("MonitorItemId", monitorItemId);
            this.monitorItemId = monitorItemId;
            return this;
        }

        /**
         * PortCollectionId.
         */
        public Builder portCollectionId(String portCollectionId) {
            this.putQueryParameter("PortCollectionId", portCollectionId);
            this.portCollectionId = portCollectionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetAlarmStatusRequest build() {
            return new GetAlarmStatusRequest(this);
        } 

    } 

}
