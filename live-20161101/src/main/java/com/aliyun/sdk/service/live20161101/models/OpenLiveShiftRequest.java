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
 * {@link OpenLiveShiftRequest} extends {@link RequestModel}
 *
 * <p>OpenLiveShiftRequest</p>
 */
public class OpenLiveShiftRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreTranscode")
    private Boolean ignoreTranscode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vision")
    private Integer vision;

    private OpenLiveShiftRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.duration = builder.duration;
        this.ignoreTranscode = builder.ignoreTranscode;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
        this.vision = builder.vision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenLiveShiftRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return ignoreTranscode
     */
    public Boolean getIgnoreTranscode() {
        return this.ignoreTranscode;
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
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return vision
     */
    public Integer getVision() {
        return this.vision;
    }

    public static final class Builder extends Request.Builder<OpenLiveShiftRequest, Builder> {
        private String appName; 
        private String domainName; 
        private Integer duration; 
        private Boolean ignoreTranscode; 
        private Long ownerId; 
        private String regionId; 
        private String streamName; 
        private Integer vision; 

        private Builder() {
            super();
        } 

        private Builder(OpenLiveShiftRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.duration = request.duration;
            this.ignoreTranscode = request.ignoreTranscode;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.streamName = request.streamName;
            this.vision = request.vision;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. You can specify an asterisk (*) as the value to match all applications under the domain name. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
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
         * <p>The length of a TS segment for HTTP Live Streaming (HLS). Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>Specifies whether to disable time shifting for the transcoded stream. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: disables time shifting for the transcoded stream.</li>
         * <li><strong>false</strong>: enables time shifting for the transcoded stream.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreTranscode(Boolean ignoreTranscode) {
            this.putQueryParameter("IgnoreTranscode", ignoreTranscode);
            this.ignoreTranscode = ignoreTranscode;
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
         * <p>The name of the live stream. You can specify an asterisk (*) as the value to match all streams in the application. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>The duration for which data is retained. Default value: 7. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vision(Integer vision) {
            this.putQueryParameter("Vision", vision);
            this.vision = vision;
            return this;
        }

        @Override
        public OpenLiveShiftRequest build() {
            return new OpenLiveShiftRequest(this);
        } 

    } 

}
