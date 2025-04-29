// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListScheduleTimesRequest} extends {@link RequestModel}
 *
 * <p>ListScheduleTimesRequest</p>
 */
public class ListScheduleTimesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Calendar")
    private String calendar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    private ListScheduleTimesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.calendar = builder.calendar;
        this.clusterId = builder.clusterId;
        this.timeExpression = builder.timeExpression;
        this.timeType = builder.timeType;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduleTimesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return calendar
     */
    public String getCalendar() {
        return this.calendar;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return timeExpression
     */
    public String getTimeExpression() {
        return this.timeExpression;
    }

    /**
     * @return timeType
     */
    public Integer getTimeType() {
        return this.timeType;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder extends Request.Builder<ListScheduleTimesRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String calendar; 
        private String clusterId; 
        private String timeExpression; 
        private Integer timeType; 
        private String timeZone; 

        private Builder() {
            super();
        } 

        private Builder(ListScheduleTimesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.calendar = request.calendar;
            this.clusterId = request.clusterId;
            this.timeExpression = request.timeExpression;
            this.timeType = request.timeType;
            this.timeZone = request.timeZone;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Calendar.
         */
        public Builder calendar(String calendar) {
            this.putQueryParameter("Calendar", calendar);
            this.calendar = calendar;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0/10 * * * ?</p>
         */
        public Builder timeExpression(String timeExpression) {
            this.putQueryParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeType(Integer timeType) {
            this.putQueryParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        @Override
        public ListScheduleTimesRequest build() {
            return new ListScheduleTimesRequest(this);
        } 

    } 

}
