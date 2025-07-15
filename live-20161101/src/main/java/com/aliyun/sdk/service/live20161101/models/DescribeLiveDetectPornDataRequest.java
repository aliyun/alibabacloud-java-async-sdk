// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDetectPornDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDetectPornDataRequest</p>
 */
public class DescribeLiveDetectPornDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fee")
    private String fee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SplitBy")
    private String splitBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    private String stream;

    private DescribeLiveDetectPornDataRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.fee = builder.fee;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.scene = builder.scene;
        this.splitBy = builder.splitBy;
        this.startTime = builder.startTime;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDetectPornDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fee
     */
    public String getFee() {
        return this.fee;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return splitBy
     */
    public String getSplitBy() {
        return this.splitBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDetectPornDataRequest, Builder> {
        private String app; 
        private String domainName; 
        private String endTime; 
        private String fee; 
        private Long ownerId; 
        private String region; 
        private String regionId; 
        private String scene; 
        private String splitBy; 
        private String startTime; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDetectPornDataRequest request) {
            super(request);
            this.app = request.app;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.fee = request.fee;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.regionId = request.regionId;
            this.scene = request.scene;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
            this.stream = request.stream;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The main streaming domain to query.</p>
         * <ul>
         * <li>You can query one or more domain names. If you specify multiple domain names, separate them with commas (,).</li>
         * <li>If you do not specify this parameter, the data of all domain names within your Alibaba Cloud account is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T09:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether a quota of free image scanning is available. Valid values:</p>
         * <ul>
         * <li><strong>free</strong>: specifies that a quota of free image scanning is available.</li>
         * <li><strong>charge</strong>: specifies that a quota of free image scanning is not available and fees are charged.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        public Builder fee(String fee) {
            this.putQueryParameter("Fee", fee);
            this.fee = fee;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region where the domain name resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The moderation scenario. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: pornography detection. This is the default value.</li>
         * <li><strong>terrorism</strong>: terrorism detection</li>
         * <li><strong>ad</strong>: ad violation detection</li>
         * <li><strong>live</strong>: undesirable scene detection</li>
         * <li><strong>logo</strong>: logo detection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The fields based on which data is grouped. Separate multiple fields with commas (,).</p>
         * <blockquote>
         * <p>If you leave the <strong>SplitBy</strong> parameter empty, only the <strong>TimeStamp</strong> and <strong>Count</strong> parameters are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>liveApp****,liveStream****</p>
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can query data in the last 90 days.</p>
         * </li>
         * <li><p>The minimum data granularity is 5 minutes. If you do not specify this parameter, data in the last 24 hours is queried.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T08:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public DescribeLiveDetectPornDataRequest build() {
            return new DescribeLiveDetectPornDataRequest(this);
        } 

    } 

}
