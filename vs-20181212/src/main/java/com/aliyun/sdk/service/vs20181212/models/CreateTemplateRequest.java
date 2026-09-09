// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callback")
    private String callback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileFormat")
    private String fileFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Flv")
    private String flv;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HlsM3u8")
    private String hlsM3u8;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HlsTs")
    private String hlsTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JpgOnDemand")
    private String jpgOnDemand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JpgOverwrite")
    private String jpgOverwrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JpgSequence")
    private String jpgSequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mp4")
    private String mp4;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucket")
    private String ossBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssEndpoint")
    private String ossEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssFilePrefix")
    private String ossFilePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    private Long retention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransConfigsJSON")
    private String transConfigsJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Trigger")
    private String trigger;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.callback = builder.callback;
        this.description = builder.description;
        this.fileFormat = builder.fileFormat;
        this.flv = builder.flv;
        this.hlsM3u8 = builder.hlsM3u8;
        this.hlsTs = builder.hlsTs;
        this.interval = builder.interval;
        this.jpgOnDemand = builder.jpgOnDemand;
        this.jpgOverwrite = builder.jpgOverwrite;
        this.jpgSequence = builder.jpgSequence;
        this.mp4 = builder.mp4;
        this.name = builder.name;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ossFilePrefix = builder.ossFilePrefix;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.retention = builder.retention;
        this.transConfigsJSON = builder.transConfigsJSON;
        this.trigger = builder.trigger;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileFormat
     */
    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * @return flv
     */
    public String getFlv() {
        return this.flv;
    }

    /**
     * @return hlsM3u8
     */
    public String getHlsM3u8() {
        return this.hlsM3u8;
    }

    /**
     * @return hlsTs
     */
    public String getHlsTs() {
        return this.hlsTs;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return jpgOnDemand
     */
    public String getJpgOnDemand() {
        return this.jpgOnDemand;
    }

    /**
     * @return jpgOverwrite
     */
    public String getJpgOverwrite() {
        return this.jpgOverwrite;
    }

    /**
     * @return jpgSequence
     */
    public String getJpgSequence() {
        return this.jpgSequence;
    }

    /**
     * @return mp4
     */
    public String getMp4() {
        return this.mp4;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ossFilePrefix
     */
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
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
     * @return retention
     */
    public Long getRetention() {
        return this.retention;
    }

    /**
     * @return transConfigsJSON
     */
    public String getTransConfigsJSON() {
        return this.transConfigsJSON;
    }

    /**
     * @return trigger
     */
    public String getTrigger() {
        return this.trigger;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String callback; 
        private String description; 
        private String fileFormat; 
        private String flv; 
        private String hlsM3u8; 
        private String hlsTs; 
        private Long interval; 
        private String jpgOnDemand; 
        private String jpgOverwrite; 
        private String jpgSequence; 
        private String mp4; 
        private String name; 
        private String ossBucket; 
        private String ossEndpoint; 
        private String ossFilePrefix; 
        private Long ownerId; 
        private String region; 
        private Long retention; 
        private String transConfigsJSON; 
        private String trigger; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.callback = request.callback;
            this.description = request.description;
            this.fileFormat = request.fileFormat;
            this.flv = request.flv;
            this.hlsM3u8 = request.hlsM3u8;
            this.hlsTs = request.hlsTs;
            this.interval = request.interval;
            this.jpgOnDemand = request.jpgOnDemand;
            this.jpgOverwrite = request.jpgOverwrite;
            this.jpgSequence = request.jpgSequence;
            this.mp4 = request.mp4;
            this.name = request.name;
            this.ossBucket = request.ossBucket;
            this.ossEndpoint = request.ossEndpoint;
            this.ossFilePrefix = request.ossFilePrefix;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.retention = request.retention;
            this.transConfigsJSON = request.transConfigsJSON;
            this.trigger = request.trigger;
            this.type = request.type;
        } 

        /**
         * <p>Callback URL to be invoked after template execution.  </p>
         * <blockquote>
         * <p>Note: Templates triggered on demand do not support callback parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * <p>Template description.</p>
         * 
         * <strong>example:</strong>
         * <p>录制模板</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Storage file format. Multiple values are separated by commas. Valid values:</p>
         * <ul>
         * <li>mp4</li>
         * <li>flv</li>
         * <li>hls<blockquote>
         * <p>The Qingdao ingest endpoint does not support recording in FLV or MP4 formats.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hls</p>
         */
        public Builder fileFormat(String fileFormat) {
            this.putQueryParameter("FileFormat", fileFormat);
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * <p>Storage path for FLV files. For the format, see the description for Mp4.</p>
         * 
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        public Builder flv(String flv) {
            this.putQueryParameter("Flv", flv);
            this.flv = flv;
            return this;
        }

        /**
         * <p>Storage path for HLS m3u8 files. For the format, see the description for Mp4.</p>
         * 
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        public Builder hlsM3u8(String hlsM3u8) {
            this.putQueryParameter("HlsM3u8", hlsM3u8);
            this.hlsM3u8 = hlsM3u8;
            return this;
        }

        /**
         * <p>Storage path for HLS .ts files.</p>
         * <ul>
         * <li>Variables can be used in the path. Supported variables include {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</li>
         * <li>The variables {UnixTimestamp} and {Sequence} must both be included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{UnixTimestamp}_{Sequence}</p>
         */
        public Builder hlsTs(String hlsTs) {
            this.putQueryParameter("HlsTs", hlsTs);
            this.hlsTs = hlsTs;
            return this;
        }

        /**
         * <p>Operation epoch, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>Storage path for on-demand JPG screenshots.</p>
         * <ul>
         * <li>Only JPG images are currently supported.</li>
         * <li>Variables can be used in the path. Supported variables include {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</li>
         * <li>Either {UnixTimestamp} or {Sequence} must be included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}/{UnixTimestamp}_ondemand.jpg</p>
         */
        public Builder jpgOnDemand(String jpgOnDemand) {
            this.putQueryParameter("JpgOnDemand", jpgOnDemand);
            this.jpgOnDemand = jpgOnDemand;
            return this;
        }

        /**
         * <p>Storage path for JPG files used in overwrite snapshots.  </p>
         * <ul>
         * <li>Only JPG images are currently supported.  </li>
         * <li>Supports variable substitution with {AppName} and {StreamName}.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}.jpg</p>
         */
        public Builder jpgOverwrite(String jpgOverwrite) {
            this.putQueryParameter("JpgOverwrite", jpgOverwrite);
            this.jpgOverwrite = jpgOverwrite;
            return this;
        }

        /**
         * <p>Storage path for JPG files used in sequential snapshots.  </p>
         * <ul>
         * <li>Only JPG images are currently supported.  </li>
         * <li>Supports variable substitution with {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.  </li>
         * <li>Either {UnixTimestamp} or {Sequence} is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}/{UnixTimestamp}.jpg</p>
         */
        public Builder jpgSequence(String jpgSequence) {
            this.putQueryParameter("JpgSequence", jpgSequence);
            this.jpgSequence = jpgSequence;
            return this;
        }

        /**
         * <p>Storage path for MP4 files.  </p>
         * <ul>
         * <li>The path supports variable substitution. Available variables include {AppName}, {StreamName}, {Sequence}, {EscapedStartTime}, and {EscapedEndTime}.  </li>
         * <li>{EscapedStartTime} and {EscapedEndTime} are required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        public Builder mp4(String mp4) {
            this.putQueryParameter("Mp4", mp4);
            this.mp4 = mp4;
            return this;
        }

        /**
         * <p>Template Name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>录制模板</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>bucketname</p>
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * <p>Domain name of OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-qingdao.aliyuncs.com</p>
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * <p>OSS file prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-prefix</p>
         */
        public Builder ossFilePrefix(String ossFilePrefix) {
            this.putQueryParameter("OssFilePrefix", ossFilePrefix);
            this.ossFilePrefix = ossFilePrefix;
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
         * <p>Region where the OSS bucket resides, that is, the service center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>Time-shift retention period, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder retention(Long retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * <p>An array of TransConfig-type transcoding configurations, formatted as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Fps&quot;:25,&quot;Gop&quot;:50,&quot;Height&quot;:720,&quot;VideoCodec&quot;:&quot;h264&quot;,&quot;Width&quot;:1280,&quot;Name&quot;:&quot;sd&quot;,&quot;VideoBitrate&quot;:800}]</p>
         */
        public Builder transConfigsJSON(String transConfigsJSON) {
            this.putQueryParameter("TransConfigsJSON", transConfigsJSON);
            this.transConfigsJSON = transConfigsJSON;
            return this;
        }

        /**
         * <p>Template trigger type. Default value: auto. Valid values:  </p>
         * <ul>
         * <li>auto (automatic)  </li>
         * <li>ondemand (on-demand)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder trigger(String trigger) {
            this.putQueryParameter("Trigger", trigger);
            this.trigger = trigger;
            return this;
        }

        /**
         * <p>Template type. Valid values:  </p>
         * <ul>
         * <li>record (recording)  </li>
         * <li>snapshot (snapshot)  </li>
         * <li>transcode (transcoding)  </li>
         * <li>timeshift (time shifting)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>record</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

}
