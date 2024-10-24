// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDDosEventIspRequest} extends {@link RequestModel}
 *
 * <p>DescribeDDosEventIspRequest</p>
 */
public class DescribeDDosEventIspRequest extends Request {
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
    private Long range;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDDosEventIspRequest(Builder builder) {
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

    public static DescribeDDosEventIspRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDDosEventIspRequest, Builder> {
        private String regionId; 
        private String eventType; 
        private String ip; 
        private Long range; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDDosEventIspRequest request) {
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
         * <p>The type of the attack event that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>defense</strong>: attack events that trigger traffic scrubbing</li>
         * <li><strong>blackhole</strong>: attack events that trigger blackhole filtering</li>
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
         * <p>The IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
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
         * Range.
         */
        public Builder range(Long range) {
            this.putQueryParameter("Range", range);
            this.range = range;
            return this;
        }

        /**
         * <p>The UNIX timestamp when the query starts. Unit: seconds.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188604.html">DescribeDDosAllEventList</a> operation to query the beginning time of all attack events.</p>
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
        public DescribeDDosEventIspRequest build() {
            return new DescribeDDosEventIspRequest(this);
        } 

    } 

}
