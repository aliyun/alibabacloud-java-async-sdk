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
 * {@link GetCalendarRequest} extends {@link RequestModel}
 *
 * <p>GetCalendarRequest</p>
 */
public class GetCalendarRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalendarName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private GetCalendarRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.calendarName = builder.calendarName;
        this.clusterId = builder.clusterId;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCalendarRequest create() {
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
     * @return calendarName
     */
    public String getCalendarName() {
        return this.calendarName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return year
     */
    public Integer getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<GetCalendarRequest, Builder> {
        private String regionId; 
        private String calendarName; 
        private String clusterId; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(GetCalendarRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.calendarName = request.calendarName;
            this.clusterId = request.clusterId;
            this.year = request.year;
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
         * <p>workday</p>
         */
        public Builder calendarName(String calendarName) {
            this.putQueryParameter("CalendarName", calendarName);
            this.calendarName = calendarName;
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
         * <p>2024</p>
         */
        public Builder year(Integer year) {
            this.putQueryParameter("Year", year);
            this.year = year;
            return this;
        }

        @Override
        public GetCalendarRequest build() {
            return new GetCalendarRequest(this);
        } 

    } 

}
