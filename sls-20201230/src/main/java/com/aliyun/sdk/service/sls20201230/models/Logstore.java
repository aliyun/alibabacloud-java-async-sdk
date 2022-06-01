// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Logstore} extends {@link TeaModel}
 *
 * <p>Logstore</p>
 */
public class Logstore extends TeaModel {
    @NameInMap("appendMeta")
    private Boolean appendMeta;

    @NameInMap("autoSplit")
    private Boolean autoSplit;

    @NameInMap("createTime")
    private Integer createTime;

    @NameInMap("enable_tracking")
    private Boolean enableTracking;

    @NameInMap("encrypt_conf")
    private EncryptConf encryptConf;

    @NameInMap("hot_ttl")
    private Integer hotTtl;

    @NameInMap("lastModifyTime")
    private Integer lastModifyTime;

    @NameInMap("logstoreName")
    @Validation(required = true)
    private String logstoreName;

    @NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @NameInMap("shardCount")
    private Integer shardCount;

    @NameInMap("telemetryType")
    private String telemetryType;

    @NameInMap("ttl")
    @Validation(required = true)
    private Integer ttl;

    private Logstore(Builder builder) {
        this.appendMeta = builder.appendMeta;
        this.autoSplit = builder.autoSplit;
        this.createTime = builder.createTime;
        this.enableTracking = builder.enableTracking;
        this.encryptConf = builder.encryptConf;
        this.hotTtl = builder.hotTtl;
        this.lastModifyTime = builder.lastModifyTime;
        this.logstoreName = builder.logstoreName;
        this.maxSplitShard = builder.maxSplitShard;
        this.shardCount = builder.shardCount;
        this.telemetryType = builder.telemetryType;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Logstore create() {
        return builder().build();
    }

    /**
     * @return appendMeta
     */
    public Boolean getAppendMeta() {
        return this.appendMeta;
    }

    /**
     * @return autoSplit
     */
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return enableTracking
     */
    public Boolean getEnableTracking() {
        return this.enableTracking;
    }

    /**
     * @return encryptConf
     */
    public EncryptConf getEncryptConf() {
        return this.encryptConf;
    }

    /**
     * @return hotTtl
     */
    public Integer getHotTtl() {
        return this.hotTtl;
    }

    /**
     * @return lastModifyTime
     */
    public Integer getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return maxSplitShard
     */
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * @return telemetryType
     */
    public String getTelemetryType() {
        return this.telemetryType;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder {
        private Boolean appendMeta; 
        private Boolean autoSplit; 
        private Integer createTime; 
        private Boolean enableTracking; 
        private EncryptConf encryptConf; 
        private Integer hotTtl; 
        private Integer lastModifyTime; 
        private String logstoreName; 
        private Integer maxSplitShard; 
        private Integer shardCount; 
        private String telemetryType; 
        private Integer ttl; 

        /**
         * append client ip and receive time
         */
        public Builder appendMeta(Boolean appendMeta) {
            this.appendMeta = appendMeta;
            return this;
        }

        /**
         * auto spilt shard
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * create time
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * enable web tracking
         */
        public Builder enableTracking(Boolean enableTracking) {
            this.enableTracking = enableTracking;
            return this;
        }

        /**
         * Encrypt configuration
         */
        public Builder encryptConf(EncryptConf encryptConf) {
            this.encryptConf = encryptConf;
            return this;
        }

        /**
         * hot ttl
         */
        public Builder hotTtl(Integer hotTtl) {
            this.hotTtl = hotTtl;
            return this;
        }

        /**
         * last modify time
         */
        public Builder lastModifyTime(Integer lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * logstore name
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * max split shard
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * shard count
         */
        public Builder shardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        /**
         * telemetryType
         */
        public Builder telemetryType(String telemetryType) {
            this.telemetryType = telemetryType;
            return this;
        }

        /**
         * ttl
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        public Logstore build() {
            return new Logstore(this);
        } 

    } 

}
