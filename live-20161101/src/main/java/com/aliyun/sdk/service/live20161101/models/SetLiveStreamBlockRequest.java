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
 * {@link SetLiveStreamBlockRequest} extends {@link RequestModel}
 *
 * <p>SetLiveStreamBlockRequest</p>
 */
public class SetLiveStreamBlockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String locationList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseTime")
    private String releaseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private SetLiveStreamBlockRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.blockType = builder.blockType;
        this.domainName = builder.domainName;
        this.locationList = builder.locationList;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.releaseTime = builder.releaseTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveStreamBlockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return blockType
     */
    public String getBlockType() {
        return this.blockType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return locationList
     */
    public String getLocationList() {
        return this.locationList;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseTime
     */
    public String getReleaseTime() {
        return this.releaseTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<SetLiveStreamBlockRequest, Builder> {
        private String appName; 
        private String blockType; 
        private String domainName; 
        private String locationList; 
        private Long ownerId; 
        private String regionId; 
        private String releaseTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveStreamBlockRequest request) {
            super(request);
            this.appName = request.appName;
            this.blockType = request.blockType;
            this.domainName = request.domainName;
            this.locationList = request.locationList;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.releaseTime = request.releaseTime;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The blocking type. Valid values: blacklist and whitelist.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>blacklist</p>
         */
        public Builder blockType(String blockType) {
            this.putQueryParameter("BlockType", blockType);
            this.blockType = blockType;
            return this;
        }

        /**
         * <p>The streaming domain.</p>
         * <p>This parameter is required.</p>
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
         * <p>The blocked region. If you specify multiple regions, such as CN and AS, separate them with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder locationList(String locationList) {
            this.putQueryParameter("LocationList", locationList);
            this.locationList = locationList;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The time when the blocking ends. The time must be in UTC. If you do not specify this parameter, the blocking is valid for 7 days by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T19:00:00Z</p>
         */
        public Builder releaseTime(String releaseTime) {
            this.putQueryParameter("ReleaseTime", releaseTime);
            this.releaseTime = releaseTime;
            return this;
        }

        /**
         * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public SetLiveStreamBlockRequest build() {
            return new SetLiveStreamBlockRequest(this);
        } 

    } 

}
