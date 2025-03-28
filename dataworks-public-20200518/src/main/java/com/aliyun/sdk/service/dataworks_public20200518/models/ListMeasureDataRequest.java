// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The measurement component. Valid values:</p>
         * <ul>
         * <li>Count: phone call-based alerts and text message-based alerts</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        public Builder componentCode(String componentCode) {
            this.putQueryParameter("ComponentCode", componentCode);
            this.componentCode = componentCode;
            return this;
        }

        /**
         * <p>The measurement item. Valid values:</p>
         * <ul>
         * <li>DideAlarmPhone: phone call-based alerts</li>
         * <li>DideAlarmSms: text message-based alerts</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DideAlarmPhone</p>
         */
        public Builder domainCode(String domainCode) {
            this.putQueryParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
            return this;
        }

        /**
         * <p>The end timestamp of the measurement period, in milliseconds. The measurement period is calculated in days. You can query only the data within the previous 30 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1717430400000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start timestamp of the measurement period, in milliseconds. The measurement period is calculated in days. You can query only the data within the previous 30 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1717344000000</p>
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
