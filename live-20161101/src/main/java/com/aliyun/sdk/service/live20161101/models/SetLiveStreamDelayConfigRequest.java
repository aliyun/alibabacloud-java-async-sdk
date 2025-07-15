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
 * {@link SetLiveStreamDelayConfigRequest} extends {@link RequestModel}
 *
 * <p>SetLiveStreamDelayConfigRequest</p>
 */
public class SetLiveStreamDelayConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlvDelay")
    private Integer flvDelay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlvLevel")
    private String flvLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HlsDelay")
    private Integer hlsDelay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HlsLevel")
    private String hlsLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RtmpDelay")
    private Integer rtmpDelay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RtmpLevel")
    private String rtmpLevel;

    private SetLiveStreamDelayConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.flvDelay = builder.flvDelay;
        this.flvLevel = builder.flvLevel;
        this.hlsDelay = builder.hlsDelay;
        this.hlsLevel = builder.hlsLevel;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.rtmpDelay = builder.rtmpDelay;
        this.rtmpLevel = builder.rtmpLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveStreamDelayConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return flvDelay
     */
    public Integer getFlvDelay() {
        return this.flvDelay;
    }

    /**
     * @return flvLevel
     */
    public String getFlvLevel() {
        return this.flvLevel;
    }

    /**
     * @return hlsDelay
     */
    public Integer getHlsDelay() {
        return this.hlsDelay;
    }

    /**
     * @return hlsLevel
     */
    public String getHlsLevel() {
        return this.hlsLevel;
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
     * @return rtmpDelay
     */
    public Integer getRtmpDelay() {
        return this.rtmpDelay;
    }

    /**
     * @return rtmpLevel
     */
    public String getRtmpLevel() {
        return this.rtmpLevel;
    }

    public static final class Builder extends Request.Builder<SetLiveStreamDelayConfigRequest, Builder> {
        private String domainName; 
        private Integer flvDelay; 
        private String flvLevel; 
        private Integer hlsDelay; 
        private String hlsLevel; 
        private Long ownerId; 
        private String regionId; 
        private Integer rtmpDelay; 
        private String rtmpLevel; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveStreamDelayConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.flvDelay = request.flvDelay;
            this.flvLevel = request.flvLevel;
            this.hlsDelay = request.hlsDelay;
            this.hlsLevel = request.hlsLevel;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.rtmpDelay = request.rtmpDelay;
            this.rtmpLevel = request.rtmpLevel;
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
         * <p>The latency of FLV-based playback. Unit: seconds.</p>
         * <blockquote>
         * <p> If this parameter is left empty, the latency is set to a value corresponding to the FlvLevel parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder flvDelay(Integer flvDelay) {
            this.putQueryParameter("FlvDelay", flvDelay);
            this.flvDelay = flvDelay;
            return this;
        }

        /**
         * <p>The latency level of FLV-based playback. Ignore this parameter if the FlvDelay parameter is configured.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>short</strong> (default): The latency is 4 seconds.</li>
         * <li><strong>medium</strong>: The latency is 8 seconds.</li>
         * <li><strong>long</strong>: The latency is 16 seconds.</li>
         * </ul>
         * <blockquote>
         * <p> If both the FlvDelay and FlvLevel parameters are left empty, FlvLevel is set to <strong>short</strong> by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        public Builder flvLevel(String flvLevel) {
            this.putQueryParameter("FlvLevel", flvLevel);
            this.flvLevel = flvLevel;
            return this;
        }

        /**
         * <p>The latency of HLS-based playback. Unit: seconds.</p>
         * <blockquote>
         * <p> If this parameter is left empty, the latency is set to a value corresponding to the HlsLevel parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder hlsDelay(Integer hlsDelay) {
            this.putQueryParameter("HlsDelay", hlsDelay);
            this.hlsDelay = hlsDelay;
            return this;
        }

        /**
         * <p>The latency level of HLS-based playback. Ignore this parameter if the HlsDelay parameter is configured.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>short</strong>: The latency is 3 seconds. This is the default value.</li>
         * <li><strong>medium</strong>: The latency is 6 seconds.</li>
         * <li><strong>long</strong>: The latency is 15 seconds.</li>
         * </ul>
         * <blockquote>
         * <p> If both the HlsDelay and HlsLevel parameters are left empty, HlsLevel is set to <strong>short</strong> by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>short</p>
         */
        public Builder hlsLevel(String hlsLevel) {
            this.putQueryParameter("HlsLevel", hlsLevel);
            this.hlsLevel = hlsLevel;
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
         * <p>The latency of RTMP-based playback. Unit: seconds.</p>
         * <blockquote>
         * <p> If this parameter is left empty, the latency is set to a value corresponding to the RtmpLevel parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder rtmpDelay(Integer rtmpDelay) {
            this.putQueryParameter("RtmpDelay", rtmpDelay);
            this.rtmpDelay = rtmpDelay;
            return this;
        }

        /**
         * <p>The latency level of RTMP-based playback. Ignore this parameter if the RtmpDelay parameter is configured.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>short</strong> (default): The latency is 4 seconds.</li>
         * <li><strong>medium</strong>: The latency is 8 seconds.</li>
         * <li><strong>long</strong>: The latency is 16 seconds.</li>
         * </ul>
         * <blockquote>
         * <p> If both the RtmpDelay and RtmpLevel parameters are left empty, RtmpLevel is set to <strong>short</strong> by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>short</p>
         */
        public Builder rtmpLevel(String rtmpLevel) {
            this.putQueryParameter("RtmpLevel", rtmpLevel);
            this.rtmpLevel = rtmpLevel;
            return this;
        }

        @Override
        public SetLiveStreamDelayConfigRequest build() {
            return new SetLiveStreamDelayConfigRequest(this);
        } 

    } 

}
