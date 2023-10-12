// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>ListMonitorDataRequest</p>
 */
public class ListMonitorDataRequest extends Request {
    @Query
    @NameInMap("AggregateDataId")
    private String aggregateDataId;

    @Query
    @NameInMap("AggregationType")
    private String aggregationType;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("DataItem")
    @Validation(required = true)
    private String dataItem;

    @Query
    @NameInMap("DataType")
    @Validation(required = true)
    private String dataType;

    @Query
    @NameInMap("DedicatedLineId")
    private String dedicatedLineId;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("End")
    @Validation(required = true, maximum = 2208960000D, minimum = 1604160000)
    private Long end;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Key")
    private String key;

    @Query
    @NameInMap("MonitorItemId")
    private String monitorItemId;

    @Query
    @NameInMap("PortCollectionId")
    private String portCollectionId;

    @Query
    @NameInMap("Start")
    @Validation(required = true, maximum = 2208960000D, minimum = 1604160000)
    private Long start;

    private ListMonitorDataRequest(Builder builder) {
        super(builder);
        this.aggregateDataId = builder.aggregateDataId;
        this.aggregationType = builder.aggregationType;
        this.appId = builder.appId;
        this.dataItem = builder.dataItem;
        this.dataType = builder.dataType;
        this.dedicatedLineId = builder.dedicatedLineId;
        this.deviceId = builder.deviceId;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.key = builder.key;
        this.monitorItemId = builder.monitorItemId;
        this.portCollectionId = builder.portCollectionId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMonitorDataRequest create() {
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
     * @return aggregationType
     */
    public String getAggregationType() {
        return this.aggregationType;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return dataItem
     */
    public String getDataItem() {
        return this.dataItem;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
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
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<ListMonitorDataRequest, Builder> {
        private String aggregateDataId; 
        private String aggregationType; 
        private String appId; 
        private String dataItem; 
        private String dataType; 
        private String dedicatedLineId; 
        private String deviceId; 
        private Long end; 
        private String instanceId; 
        private String key; 
        private String monitorItemId; 
        private String portCollectionId; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(ListMonitorDataRequest request) {
            super(request);
            this.aggregateDataId = request.aggregateDataId;
            this.aggregationType = request.aggregationType;
            this.appId = request.appId;
            this.dataItem = request.dataItem;
            this.dataType = request.dataType;
            this.dedicatedLineId = request.dedicatedLineId;
            this.deviceId = request.deviceId;
            this.end = request.end;
            this.instanceId = request.instanceId;
            this.key = request.key;
            this.monitorItemId = request.monitorItemId;
            this.portCollectionId = request.portCollectionId;
            this.start = request.start;
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
         * AggregationType.
         */
        public Builder aggregationType(String aggregationType) {
            this.putQueryParameter("AggregationType", aggregationType);
            this.aggregationType = aggregationType;
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
         * DataItem.
         */
        public Builder dataItem(String dataItem) {
            this.putQueryParameter("DataItem", dataItem);
            this.dataItem = dataItem;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
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
         * End.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
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
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
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
         * Start.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public ListMonitorDataRequest build() {
            return new ListMonitorDataRequest(this);
        } 

    } 

}
