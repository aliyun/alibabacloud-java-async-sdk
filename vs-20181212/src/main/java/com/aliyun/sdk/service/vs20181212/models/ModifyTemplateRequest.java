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
 * {@link ModifyTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateRequest</p>
 */
public class ModifyTemplateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

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

    private ModifyTemplateRequest(Builder builder) {
        super(builder);
        this.callback = builder.callback;
        this.description = builder.description;
        this.fileFormat = builder.fileFormat;
        this.flv = builder.flv;
        this.hlsM3u8 = builder.hlsM3u8;
        this.hlsTs = builder.hlsTs;
        this.id = builder.id;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<ModifyTemplateRequest, Builder> {
        private String callback; 
        private String description; 
        private String fileFormat; 
        private String flv; 
        private String hlsM3u8; 
        private String hlsTs; 
        private String id; 
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

        private Builder() {
            super();
        } 

        private Builder(ModifyTemplateRequest request) {
            super(request);
            this.callback = request.callback;
            this.description = request.description;
            this.fileFormat = request.fileFormat;
            this.flv = request.flv;
            this.hlsM3u8 = request.hlsM3u8;
            this.hlsTs = request.hlsTs;
            this.id = request.id;
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
        } 

        /**
         * <p>The callback URL that is used after the template is executed.</p>
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
         * <p>The description of the template.</p>
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
         * <p>The file format for storage. Separate multiple values with commas. Valid values:</p>
         * <ul>
         * <li><p>mp4</p>
         * </li>
         * <li><p>flv</p>
         * </li>
         * <li><p>hls</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Recording in FLV and MP4 formats is not supported in the China (Qingdao) region.</p>
         * </blockquote>
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
         * <p>The storage path for FLV files. For information about the format, see the description of the Mp4 parameter.</p>
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
         * <p>The storage path for HLS M3U8 files. For information about the format, see the description of the Mp4 parameter.</p>
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
         * <p>The storage path for HLS TS files.</p>
         * <ul>
         * <li><p>The path supports variables such as {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</p>
         * </li>
         * <li><p>You must include the {UnixTimestamp} and {Sequence} variables.</p>
         * </li>
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
         * <p>The ID of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****998-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The operation interval, in seconds.</p>
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
         * <p>The storage path for JPG files. This path is used for on-demand snapshots.</p>
         * <ul>
         * <li><p>Only JPG images are supported.</p>
         * </li>
         * <li><p>The path supports variables such as {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</p>
         * </li>
         * <li><p>You must include either {UnixTimestamp} or {Sequence}.</p>
         * </li>
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
         * <p>The storage path for JPG files. This path is used to overwrite snapshots.</p>
         * <ul>
         * <li><p>Only JPG images are supported.</p>
         * </li>
         * <li><p>The path supports variables such as {AppName} and {StreamName}.</p>
         * </li>
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
         * <p>The storage path for JPG files. This path is used for sequence snapshots.</p>
         * <ul>
         * <li><p>Only JPG images are supported.</p>
         * </li>
         * <li><p>The path supports variables such as {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</p>
         * </li>
         * <li><p>You must include either {UnixTimestamp} or {Sequence}.</p>
         * </li>
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
         * <p>The storage path for MP4 files.</p>
         * <ul>
         * <li><p>The path supports variables such as {AppName}, {StreamName}, {Sequence}, {EscapedStartTime}, and {EscapedEndTime}.</p>
         * </li>
         * <li><p>You must include {EscapedStartTime} and {EscapedEndTime}.</p>
         * </li>
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
         * <p>The name of the template.</p>
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
         * <p>The OSS bucket.</p>
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
         * <p>The domain name of the OSS bucket.</p>
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
         * <p>The prefix of the OSS file.</p>
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
         * <p>The region where the Object Storage Service (OSS) bucket is located.</p>
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
         * <p>The retention period for time shifting, in days.</p>
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
         * <p>An array of transcoding configurations of the TransConfig type, in a JSON-formatted string.</p>
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
         * <p>The trigger type of the template. The default value is auto. Valid values:</p>
         * <ul>
         * <li><p>auto (automatic)</p>
         * </li>
         * <li><p>ondemand (on-demand)</p>
         * </li>
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

        @Override
        public ModifyTemplateRequest build() {
            return new ModifyTemplateRequest(this);
        } 

    } 

}
