// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCarProcessEventsRequest} extends {@link RequestModel}
 *
 * <p>QueryCarProcessEventsRequest</p>
 */
public class QueryCarProcessEventsRequest extends Request {
    @Query
    @NameInMap("ActionType")
    @Validation(maximum = 100)
    private Integer actionType;

    @Query
    @NameInMap("AreaIndex")
    @Validation(maximum = 10)
    private Integer areaIndex;

    @Query
    @NameInMap("BeginTime")
    @Validation(maximum = 10000000000000D)
    private Long beginTime;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("EndTime")
    @Validation(maximum = 10000000000000D)
    private Long endTime;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PlateNo")
    private String plateNo;

    @Query
    @NameInMap("SubDeviceName")
    private String subDeviceName;

    @Query
    @NameInMap("SubIotId")
    private String subIotId;

    @Query
    @NameInMap("SubProductKey")
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

        private Builder(QueryCarProcessEventsRequest response) {
            super(response);
            this.actionType = response.actionType;
            this.areaIndex = response.areaIndex;
            this.beginTime = response.beginTime;
            this.currentPage = response.currentPage;
            this.endTime = response.endTime;
            this.iotInstanceId = response.iotInstanceId;
            this.pageSize = response.pageSize;
            this.plateNo = response.plateNo;
            this.subDeviceName = response.subDeviceName;
            this.subIotId = response.subIotId;
            this.subProductKey = response.subProductKey;
        } 

        /**
         * ActionType.
         */
        public Builder actionType(Integer actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * AreaIndex.
         */
        public Builder areaIndex(Integer areaIndex) {
            this.putQueryParameter("AreaIndex", areaIndex);
            this.areaIndex = areaIndex;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PlateNo.
         */
        public Builder plateNo(String plateNo) {
            this.putQueryParameter("PlateNo", plateNo);
            this.plateNo = plateNo;
            return this;
        }

        /**
         * SubDeviceName.
         */
        public Builder subDeviceName(String subDeviceName) {
            this.putQueryParameter("SubDeviceName", subDeviceName);
            this.subDeviceName = subDeviceName;
            return this;
        }

        /**
         * SubIotId.
         */
        public Builder subIotId(String subIotId) {
            this.putQueryParameter("SubIotId", subIotId);
            this.subIotId = subIotId;
            return this;
        }

        /**
         * SubProductKey.
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
