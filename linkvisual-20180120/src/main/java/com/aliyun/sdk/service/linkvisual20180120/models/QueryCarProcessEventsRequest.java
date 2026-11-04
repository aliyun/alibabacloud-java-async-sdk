// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryCarProcessEventsRequest} extends {@link RequestModel}
 *
 * <p>QueryCarProcessEventsRequest</p>
 */
public class QueryCarProcessEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AreaIndex")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Integer areaIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(maximum = 10000000000000D)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(maximum = 10000000000000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlateNo")
    private String plateNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDeviceName")
    private String subDeviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubIotId")
    private String subIotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubProductKey")
    private String subProductKey;

    private QueryCarProcessEventsRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.areaIndex = builder.areaIndex;
        this.beginTime = builder.beginTime;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.plateNo = builder.plateNo;
        this.subDeviceName = builder.subDeviceName;
        this.subIotId = builder.subIotId;
        this.subProductKey = builder.subProductKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCarProcessEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public Integer getActionType() {
        return this.actionType;
    }

    /**
     * @return areaIndex
     */
    public Integer getAreaIndex() {
        return this.areaIndex;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return plateNo
     */
    public String getPlateNo() {
        return this.plateNo;
    }

    /**
     * @return subDeviceName
     */
    public String getSubDeviceName() {
        return this.subDeviceName;
    }

    /**
     * @return subIotId
     */
    public String getSubIotId() {
        return this.subIotId;
    }

    /**
     * @return subProductKey
     */
    public String getSubProductKey() {
        return this.subProductKey;
    }

    public static final class Builder extends Request.Builder<QueryCarProcessEventsRequest, Builder> {
        private Integer actionType; 
        private Integer areaIndex; 
        private Long beginTime; 
        private Integer currentPage; 
        private Long endTime; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private String plateNo; 
        private String subDeviceName; 
        private String subIotId; 
        private String subProductKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryCarProcessEventsRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.areaIndex = request.areaIndex;
            this.beginTime = request.beginTime;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.plateNo = request.plateNo;
            this.subDeviceName = request.subDeviceName;
            this.subIotId = request.subIotId;
            this.subProductKey = request.subProductKey;
        } 

        /**
         * <p>The action type of the vehicle. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Enter.</li>
         * <li><strong>2</strong>: Stay.</li>
         * <li><strong>3</strong>: Leave.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder actionType(Integer actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>The detection box of the IPC device. You can call the <a href="https://help.aliyun.com/document_detail/69584.html">InvokeThingService</a> operation to query the number of detection boxes. Set <strong>identifier</strong> to <strong>QueryAlgoTaskDetails</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder areaIndex(Integer areaIndex) {
            this.putQueryParameter("AreaIndex", areaIndex);
            this.areaIndex = areaIndex;
            return this;
        }

        /**
         * <p>The start time of the query range. The time is a 13-digit timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1646288487368</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The page number of the returned page. Pages start from 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end time of the query range. The time is a 13-digit timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1646288488368</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>If the instance has an ID, you must specify this ID. Otherwise, the call fails.</li>
         * <li>If the instance does not have an ID&lt;props=&quot;intl&quot;&gt;<ph> or the <strong>Instance Overview</strong> page is not displayed</ph>, you do not need to specify this parameter.</li>
         * </ul>
         * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iotx-oxsshare****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 20. Default value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The license plate number. The value can be up to 15 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheAM****</p>
         */
        public Builder plateNo(String plateNo) {
            this.putQueryParameter("PlateNo", plateNo);
            this.plateNo = plateNo;
            return this;
        }

        /**
         * <p>The name of the IPC device.
         * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>car_test</p>
         */
        public Builder subDeviceName(String subDeviceName) {
            this.putQueryParameter("SubDeviceName", subDeviceName);
            this.subDeviceName = subDeviceName;
            return this;
        }

        /**
         * <p>The ID of the IP camera (IPC) device. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> uniquely identifies the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ImP6ECd1aQ****CAfWTO000101</p>
         */
        public Builder subIotId(String subIotId) {
            this.putQueryParameter("SubIotId", subIotId);
            this.subIotId = subIotId;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the IPC device belongs.
         * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1Duh0F****</p>
         */
        public Builder subProductKey(String subProductKey) {
            this.putQueryParameter("SubProductKey", subProductKey);
            this.subProductKey = subProductKey;
            return this;
        }

        @Override
        public QueryCarProcessEventsRequest build() {
            return new QueryCarProcessEventsRequest(this);
        } 

    } 

}
