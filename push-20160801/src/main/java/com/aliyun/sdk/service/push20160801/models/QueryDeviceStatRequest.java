// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link QueryDeviceStatRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceStatRequest</p>
 */
public class QueryDeviceStatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(QueryDeviceStatRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.deviceType = request.deviceType;
            this.endTime = request.endTime;
            this.queryType = request.queryType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>AppKey information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is only valid for early Android and iOS dual-platform application types. If your application is a dual-platform application, specify this parameter as iOS or ANDROID to query the number of devices for each type. By default, it queries ALL types.</p>
         * <p>The device type. Valid values:</p>
         * <ul>
         * <li><p><strong>iOS</strong>: iOS devices</p>
         * </li>
         * <li><p><strong>ANDROID</strong>: Android devices</p>
         * </li>
         * <li><p><strong>ALL</strong>: All device types</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>The end time of the query. The time format follows the ISO8601 standard and uses UTC time, in the format YYYY-MM-DDThh:mm:ssZ.</p>
         * <blockquote>
         * <p>The statistics end date is the end time\&quot;s day.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-29T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Query new devices or historical cumulative devices. Valid values:</p>
         * <ul>
         * <li><p><strong>NEW</strong>: New devices</p>
         * </li>
         * <li><p><strong>TOTAL</strong>: Cumulative devices</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TOTAL</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The start time of the query. The time format follows the ISO8601 standard and uses UTC time, in the format YYYY-MM-DDThh:mm:ssZ.</p>
         * <blockquote>
         * <p>The statistics start date is 00:00 UTC+8 on the start time\&quot;s day.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-07-28T00:00:00Z</p>
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
