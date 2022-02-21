// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceStatRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceStatRequest</p>
 */
public class QueryDeviceStatRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("DeviceType")
    @Validation(required = true)
    private String deviceType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("QueryType")
    @Validation(required = true)
    private String queryType;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private QueryDeviceStatRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.deviceType = builder.deviceType;
        this.endTime = builder.endTime;
        this.queryType = builder.queryType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceStatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryDeviceStatRequest, Builder> {
        private Long appKey; 
        private String deviceType; 
        private String endTime; 
        private String queryType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceStatRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.deviceType = response.deviceType;
            this.endTime = response.endTime;
            this.queryType = response.queryType;
            this.startTime = response.startTime;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryDeviceStatRequest build() {
            return new QueryDeviceStatRequest(this);
        } 

    } 

}
