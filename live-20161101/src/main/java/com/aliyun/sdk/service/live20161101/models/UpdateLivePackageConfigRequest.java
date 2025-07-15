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
 * {@link UpdateLivePackageConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLivePackageConfigRequest</p>
 */
public class UpdateLivePackageConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreTranscode")
    private Boolean ignoreTranscode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartDuration")
    private Integer partDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegmentDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer segmentDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SegmentNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer segmentNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private UpdateLivePackageConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.ignoreTranscode = builder.ignoreTranscode;
        this.ownerId = builder.ownerId;
        this.partDuration = builder.partDuration;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.segmentDuration = builder.segmentDuration;
        this.segmentNum = builder.segmentNum;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivePackageConfigRequest create() {
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
     * @return partDuration
     */
    public Integer getPartDuration() {
        return this.partDuration;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return segmentDuration
     */
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

    /**
     * @return segmentNum
     */
    public Integer getSegmentNum() {
        return this.segmentNum;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<UpdateLivePackageConfigRequest, Builder> {
        private String appName; 
        private String domainName; 
        private Boolean ignoreTranscode; 
        private Long ownerId; 
        private Integer partDuration; 
        private String protocol; 
        private String regionId; 
        private Integer segmentDuration; 
        private Integer segmentNum; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLivePackageConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.ignoreTranscode = request.ignoreTranscode;
            this.ownerId = request.ownerId;
            this.partDuration = request.partDuration;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.segmentDuration = request.segmentDuration;
            this.segmentNum = request.segmentNum;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The application name. The value of this parameter must be the same as the application name that is specified in the ingest URL. Otherwise, the configuration does not take effect. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (<em>). The name cannot start with a hyphen (-) or underscore (</em>). You can also specify an asterisk (*) as the value to match all applications.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AppName</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
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
         * <p>Specifies whether to ignore the transcoded stream. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
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
         * <p>The part length. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This parameter is required if Protocol is set to LLHLS_TS or LLHLS_CMAF.</p>
         * </blockquote>
         * <ul>
         * <li>If the value of SegmentDuration is 1, the valid values of this parameter are 100 to 500.</li>
         * <li>If the value of SegmentDuration is 2, the valid values of this parameter are 100 to 1000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>350</p>
         */
        public Builder partDuration(Integer partDuration) {
            this.putQueryParameter("PartDuration", partDuration);
            this.partDuration = partDuration;
            return this;
        }

        /**
         * <p>The streaming protocol and encapsulation format. Valid values:</p>
         * <ul>
         * <li><strong>HLS_CMAF</strong></li>
         * <li><strong>LLHLS_TS</strong> (low latency)</li>
         * <li><strong>LLHLS_CMAF</strong> (low latency)</li>
         * <li><strong>DASH_CMAF</strong></li>
         * <li><strong>HLSDASH_CMAF</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS_CMAF</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
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
         * <p>The segment length. Unit: seconds.</p>
         * <ul>
         * <li>If Protocol is set to HLS_CMAF, the valid values of this parameter are 1 to 10.</li>
         * <li>If Protocol is set to LLHLS_TS or LLHLS_CMAF, the valid values of this parameter are 1 to 2.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder segmentDuration(Integer segmentDuration) {
            this.putQueryParameter("SegmentDuration", segmentDuration);
            this.segmentDuration = segmentDuration;
            return this;
        }

        /**
         * <p>The number of segments. Valid values: 3 to 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder segmentNum(Integer segmentNum) {
            this.putQueryParameter("SegmentNum", segmentNum);
            this.segmentNum = segmentNum;
            return this;
        }

        /**
         * <p>The stream name. The value of this parameter must be the same as the stream name that is specified in the ingest URL. Otherwise, the configuration does not take effect. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (<em>). The name cannot start with a hyphen (-) or underscore (</em>). You can also specify an asterisk (*) as the value to match all streams.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamName</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public UpdateLivePackageConfigRequest build() {
            return new UpdateLivePackageConfigRequest(this);
        } 

    } 

}
