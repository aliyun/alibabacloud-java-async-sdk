// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmsRequest</p>
 */
public class DescribeAlarmsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmId")
    private String alarmId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmStatus")
    private String alarmStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmType")
    private String alarmType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorType")
    private String errorType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromAlarmTime")
    private String fromAlarmTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToAlarmTime")
    private String toAlarmTime;

    private DescribeAlarmsRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
        this.alarmStatus = builder.alarmStatus;
        this.alarmType = builder.alarmType;
        this.errorType = builder.errorType;
        this.fromAlarmTime = builder.fromAlarmTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storeId = builder.storeId;
        this.toAlarmTime = builder.toAlarmTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmId
     */
    public String getAlarmId() {
        return this.alarmId;
    }

    /**
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return alarmType
     */
    public String getAlarmType() {
        return this.alarmType;
    }

    /**
     * @return errorType
     */
    public String getErrorType() {
        return this.errorType;
    }

    /**
     * @return fromAlarmTime
     */
    public String getFromAlarmTime() {
        return this.fromAlarmTime;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return toAlarmTime
     */
    public String getToAlarmTime() {
        return this.toAlarmTime;
    }

    public static final class Builder extends Request.Builder<DescribeAlarmsRequest, Builder> {
        private String alarmId; 
        private String alarmStatus; 
        private String alarmType; 
        private String errorType; 
        private String fromAlarmTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String storeId; 
        private String toAlarmTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmsRequest request) {
            super(request);
            this.alarmId = request.alarmId;
            this.alarmStatus = request.alarmStatus;
            this.alarmType = request.alarmType;
            this.errorType = request.errorType;
            this.fromAlarmTime = request.fromAlarmTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.storeId = request.storeId;
            this.toAlarmTime = request.toAlarmTime;
        } 

        /**
         * AlarmId.
         */
        public Builder alarmId(String alarmId) {
            this.putBodyParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(String alarmStatus) {
            this.putBodyParameter("AlarmStatus", alarmStatus);
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * AlarmType.
         */
        public Builder alarmType(String alarmType) {
            this.putBodyParameter("AlarmType", alarmType);
            this.alarmType = alarmType;
            return this;
        }

        /**
         * ErrorType.
         */
        public Builder errorType(String errorType) {
            this.putBodyParameter("ErrorType", errorType);
            this.errorType = errorType;
            return this;
        }

        /**
         * FromAlarmTime.
         */
        public Builder fromAlarmTime(String fromAlarmTime) {
            this.putBodyParameter("FromAlarmTime", fromAlarmTime);
            this.fromAlarmTime = fromAlarmTime;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * ToAlarmTime.
         */
        public Builder toAlarmTime(String toAlarmTime) {
            this.putBodyParameter("ToAlarmTime", toAlarmTime);
            this.toAlarmTime = toAlarmTime;
            return this;
        }

        @Override
        public DescribeAlarmsRequest build() {
            return new DescribeAlarmsRequest(this);
        } 

    } 

}
