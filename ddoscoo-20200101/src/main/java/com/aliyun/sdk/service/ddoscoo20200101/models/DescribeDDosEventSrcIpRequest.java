// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDDosEventSrcIpRequest} extends {@link RequestModel}
 *
 * <p>DescribeDDosEventSrcIpRequest</p>
 */
public class DescribeDDosEventSrcIpRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Range")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long range;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDDosEventSrcIpRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.eventType = builder.eventType;
        this.ip = builder.ip;
        this.range = builder.range;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventSrcIpRequest create() {
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
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return range
     */
    public Long getRange() {
        return this.range;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDDosEventSrcIpRequest, Builder> {
        private String regionId; 
        private String eventType; 
        private String ip; 
        private Long range; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDDosEventSrcIpRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.eventType = request.eventType;
            this.ip = request.ip;
            this.range = request.range;
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
         * <p>The type of the attack event to query. Valid values:</p>
         * <ul>
         * <li><strong>defense</strong>: traffic scrubbing events for volumetric attacks.</li>
         * <li><strong>blackhole</strong>: blackhole filtering events for volumetric attacks.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>defense</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The attacked IP Address of Anti-DDoS Proxy instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>203.<em><strong>.</strong></em>.199</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The number of attack source IP addresses to return. The IP addresses are sorted by attack traffic in descending order. Default value: <strong>5</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder range(Long range) {
            this.putQueryParameter("Range", range);
            this.range = range;
            return this;
        }

        /**
         * <p>The start timestamp of the event to query. Unit: seconds.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/188604.html">DescribeDDosAllEventList</a> to query the start time of all events.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1598948471</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDDosEventSrcIpRequest build() {
            return new DescribeDDosEventSrcIpRequest(this);
        } 

    } 

}
