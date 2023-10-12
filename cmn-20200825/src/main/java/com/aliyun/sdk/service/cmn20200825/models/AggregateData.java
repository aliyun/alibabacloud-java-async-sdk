// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AggregateData} extends {@link TeaModel}
 *
 * <p>AggregateData</p>
 */
public class AggregateData extends TeaModel {
    @NameInMap("AggregateDataDescription")
    private String aggregateDataDescription;

    @NameInMap("AggregateDataId")
    private String aggregateDataId;

    @NameInMap("AggregateDataName")
    private String aggregateDataName;

    @NameInMap("AggregateModeList")
    private java.util.List < String > aggregateModeList;

    @NameInMap("DataItem")
    private String dataItem;

    @NameInMap("DeviceIdList")
    private java.util.List < String > deviceIdList;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("IsAllDevice")
    private Integer isAllDevice;

    @NameInMap("MonitorItemId")
    private String monitorItemId;

    private AggregateData(Builder builder) {
        this.aggregateDataDescription = builder.aggregateDataDescription;
        this.aggregateDataId = builder.aggregateDataId;
        this.aggregateDataName = builder.aggregateDataName;
        this.aggregateModeList = builder.aggregateModeList;
        this.dataItem = builder.dataItem;
        this.deviceIdList = builder.deviceIdList;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.isAllDevice = builder.isAllDevice;
        this.monitorItemId = builder.monitorItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AggregateData create() {
        return builder().build();
    }

    /**
     * @return aggregateDataDescription
     */
    public String getAggregateDataDescription() {
        return this.aggregateDataDescription;
    }

    /**
     * @return aggregateDataId
     */
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    /**
     * @return aggregateDataName
     */
    public String getAggregateDataName() {
        return this.aggregateDataName;
    }

    /**
     * @return aggregateModeList
     */
    public java.util.List < String > getAggregateModeList() {
        return this.aggregateModeList;
    }

    /**
     * @return dataItem
     */
    public String getDataItem() {
        return this.dataItem;
    }

    /**
     * @return deviceIdList
     */
    public java.util.List < String > getDeviceIdList() {
        return this.deviceIdList;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return isAllDevice
     */
    public Integer getIsAllDevice() {
        return this.isAllDevice;
    }

    /**
     * @return monitorItemId
     */
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public static final class Builder {
        private String aggregateDataDescription; 
        private String aggregateDataId; 
        private String aggregateDataName; 
        private java.util.List < String > aggregateModeList; 
        private String dataItem; 
        private java.util.List < String > deviceIdList; 
        private String gmtCreate; 
        private String gmtModified; 
        private Integer isAllDevice; 
        private String monitorItemId; 

        /**
         * AggregateDataDescription.
         */
        public Builder aggregateDataDescription(String aggregateDataDescription) {
            this.aggregateDataDescription = aggregateDataDescription;
            return this;
        }

        /**
         * AggregateDataId.
         */
        public Builder aggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }

        /**
         * AggregateDataName.
         */
        public Builder aggregateDataName(String aggregateDataName) {
            this.aggregateDataName = aggregateDataName;
            return this;
        }

        /**
         * AggregateModeList.
         */
        public Builder aggregateModeList(java.util.List < String > aggregateModeList) {
            this.aggregateModeList = aggregateModeList;
            return this;
        }

        /**
         * DataItem.
         */
        public Builder dataItem(String dataItem) {
            this.dataItem = dataItem;
            return this;
        }

        /**
         * DeviceIdList.
         */
        public Builder deviceIdList(java.util.List < String > deviceIdList) {
            this.deviceIdList = deviceIdList;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * IsAllDevice.
         */
        public Builder isAllDevice(Integer isAllDevice) {
            this.isAllDevice = isAllDevice;
            return this;
        }

        /**
         * MonitorItemId.
         */
        public Builder monitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }

        public AggregateData build() {
            return new AggregateData(this);
        } 

    } 

}
