// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @Query
    @NameInMap("Callback")
    private String callback;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileFormat")
    private String fileFormat;

    @Query
    @NameInMap("Flv")
    private String flv;

    @Query
    @NameInMap("HlsM3u8")
    private String hlsM3u8;

    @Query
    @NameInMap("HlsTs")
    private String hlsTs;

    @Query
    @NameInMap("Interval")
    private Long interval;

    @Query
    @NameInMap("JpgOnDemand")
    private String jpgOnDemand;

    @Query
    @NameInMap("JpgOverwrite")
    private String jpgOverwrite;

    @Query
    @NameInMap("JpgSequence")
    private String jpgSequence;

    @Query
    @NameInMap("Mp4")
    private String mp4;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OssBucket")
    private String ossBucket;

    @Query
    @NameInMap("OssEndpoint")
    private String ossEndpoint;

    @Query
    @NameInMap("OssFilePrefix")
    private String ossFilePrefix;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Retention")
    private Long retention;

    @Query
    @NameInMap("TransConfigsJSON")
    private String transConfigsJSON;

    @Query
    @NameInMap("Trigger")
    private String trigger;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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

        private Builder(CreateTemplateRequest response) {
            super(response);
            this.callback = response.callback;
            this.description = response.description;
            this.fileFormat = response.fileFormat;
            this.flv = response.flv;
            this.hlsM3u8 = response.hlsM3u8;
            this.hlsTs = response.hlsTs;
            this.interval = response.interval;
            this.jpgOnDemand = response.jpgOnDemand;
            this.jpgOverwrite = response.jpgOverwrite;
            this.jpgSequence = response.jpgSequence;
            this.mp4 = response.mp4;
            this.name = response.name;
            this.ossBucket = response.ossBucket;
            this.ossEndpoint = response.ossEndpoint;
            this.ossFilePrefix = response.ossFilePrefix;
            this.ownerId = response.ownerId;
            this.region = response.region;
            this.retention = response.retention;
            this.transConfigsJSON = response.transConfigsJSON;
            this.trigger = response.trigger;
            this.type = response.type;
        } 

        /**
         * Callback.
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FileFormat.
         */
        public Builder fileFormat(String fileFormat) {
            this.putQueryParameter("FileFormat", fileFormat);
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * Flv.
         */
        public Builder flv(String flv) {
            this.putQueryParameter("Flv", flv);
            this.flv = flv;
            return this;
        }

        /**
         * HlsM3u8.
         */
        public Builder hlsM3u8(String hlsM3u8) {
            this.putQueryParameter("HlsM3u8", hlsM3u8);
            this.hlsM3u8 = hlsM3u8;
            return this;
        }

        /**
         * HlsTs.
         */
        public Builder hlsTs(String hlsTs) {
            this.putQueryParameter("HlsTs", hlsTs);
            this.hlsTs = hlsTs;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * JpgOnDemand.
         */
        public Builder jpgOnDemand(String jpgOnDemand) {
            this.putQueryParameter("JpgOnDemand", jpgOnDemand);
            this.jpgOnDemand = jpgOnDemand;
            return this;
        }

        /**
         * JpgOverwrite.
         */
        public Builder jpgOverwrite(String jpgOverwrite) {
            this.putQueryParameter("JpgOverwrite", jpgOverwrite);
            this.jpgOverwrite = jpgOverwrite;
            return this;
        }

        /**
         * JpgSequence.
         */
        public Builder jpgSequence(String jpgSequence) {
            this.putQueryParameter("JpgSequence", jpgSequence);
            this.jpgSequence = jpgSequence;
            return this;
        }

        /**
         * Mp4.
         */
        public Builder mp4(String mp4) {
            this.putQueryParameter("Mp4", mp4);
            this.mp4 = mp4;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * OssFilePrefix.
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Retention.
         */
        public Builder retention(Long retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * TransConfigsJSON.
         */
        public Builder transConfigsJSON(String transConfigsJSON) {
            this.putQueryParameter("TransConfigsJSON", transConfigsJSON);
            this.transConfigsJSON = transConfigsJSON;
            return this;
        }

        /**
         * Trigger.
         */
        public Builder trigger(String trigger) {
            this.putQueryParameter("Trigger", trigger);
            this.trigger = trigger;
            return this;
        }

        /**
         * Type.
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
