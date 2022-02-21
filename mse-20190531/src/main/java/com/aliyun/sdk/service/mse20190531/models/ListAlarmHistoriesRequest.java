// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmHistoriesRequest} extends {@link RequestModel}
 *
 * <p>ListAlarmHistoriesRequest</p>
 */
public class ListAlarmHistoriesRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AlarmMseType")
    private String alarmMseType;

    @Query
    @NameInMap("AlarmName")
    private String alarmName;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private ListAlarmHistoriesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.alarmMseType = builder.alarmMseType;
        this.alarmName = builder.alarmName;
        this.endTime = builder.endTime;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestPars = builder.requestPars;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmHistoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return alarmMseType
     */
    public String getAlarmMseType() {
        return this.alarmMseType;
    }

    /**
     * @return alarmName
     */
    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAlarmHistoriesRequest, Builder> {
        private String acceptLanguage; 
        private String alarmMseType; 
        private String alarmName; 
        private Long endTime; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestPars; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAlarmHistoriesRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.alarmMseType = response.alarmMseType;
            this.alarmName = response.alarmName;
            this.endTime = response.endTime;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.requestPars = response.requestPars;
            this.startTime = response.startTime;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AlarmMseType.
         */
        public Builder alarmMseType(String alarmMseType) {
            this.putQueryParameter("AlarmMseType", alarmMseType);
            this.alarmMseType = alarmMseType;
            return this;
        }

        /**
         * AlarmName.
         */
        public Builder alarmName(String alarmName) {
            this.putQueryParameter("AlarmName", alarmName);
            this.alarmName = alarmName;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAlarmHistoriesRequest build() {
            return new ListAlarmHistoriesRequest(this);
        } 

    } 

}
