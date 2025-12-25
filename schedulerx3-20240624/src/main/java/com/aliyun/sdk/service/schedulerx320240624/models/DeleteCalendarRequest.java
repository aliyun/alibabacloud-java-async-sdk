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
 * {@link DeleteCalendarRequest} extends {@link RequestModel}
 *
 * <p>DeleteCalendarRequest</p>
 */
public class DeleteCalendarRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Year")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer year;

    private DeleteCalendarRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.calendarName = builder.calendarName;
        this.clusterId = builder.clusterId;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCalendarRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCalendarRequest, Builder> {
        private String regionId; 
        private String calendarName; 
        private String clusterId; 
        private Integer year; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCalendarRequest request) {
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
            this.putBodyParameter("CalendarName", calendarName);
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
            this.putBodyParameter("ClusterId", clusterId);
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
            this.putBodyParameter("Year", year);
            this.year = year;
            return this;
        }

        @Override
        public DeleteCalendarRequest build() {
            return new DeleteCalendarRequest(this);
        } 

    } 

}
