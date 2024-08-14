// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMeasureDataRequest} extends {@link RequestModel}
 *
 * <p>ListMeasureDataRequest</p>
 */
public class ListMeasureDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private ListMeasureDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.componentCode = builder.componentCode;
        this.domainCode = builder.domainCode;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMeasureDataRequest create() {
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
     * @return componentCode
     */
    public String getComponentCode() {
        return this.componentCode;
    }

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListMeasureDataRequest, Builder> {
        private String regionId; 
        private String componentCode; 
        private String domainCode; 
        private Long endTime; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListMeasureDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.componentCode = request.componentCode;
            this.domainCode = request.domainCode;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
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
         * The measurement component.
         * <p>
         * 
         * *   This parameter is set to Count if the DomainCode parameter is set to DideAlarmPhone or DideAlarmSms. In this case, statistics on the number of phone calls or text messages that are used to send alert notifications are collected.
         */
        public Builder componentCode(String componentCode) {
            this.putQueryParameter("ComponentCode", componentCode);
            this.componentCode = componentCode;
            return this;
        }

        /**
         * The item to be measured. Valid values:
         * <p>
         * 
         * *   DideAlarmPhone: phone call-based alerts
         * *   DideAlarmSms: text message-based alerts
         */
        public Builder domainCode(String domainCode) {
            this.putQueryParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
            return this;
        }

        /**
         * The end timestamp of the measurement period, in milliseconds. The measurement period is calculated in days. You can query only the data within the last 30 days.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The start timestamp of the measurement period, in milliseconds. The measurement period is calculated in days. You can query only the data within the last 30 days.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListMeasureDataRequest build() {
            return new ListMeasureDataRequest(this);
        } 

    } 

}
