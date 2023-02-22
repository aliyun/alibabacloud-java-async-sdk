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

    @NameInMap("mode")
    private String mode;

    @NameInMap("productType")
    private String productType;

    @NameInMap("shardCount")
    @Validation(required = true)
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
        this.mode = builder.mode;
        this.productType = builder.productType;
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
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
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
        private String mode; 
        private String productType; 
        private Integer shardCount; 
        private String telemetryType; 
        private Integer ttl; 

        /**
         * 接收日志后，自动添加客户端外网IP和日志到达时间
         */
        public Builder appendMeta(Boolean appendMeta) {
            this.appendMeta = appendMeta;
            return this;
        }

        /**
         * 是否开启 shard 自动分裂。当写入数据量超过已有分区（Shard）写入服务能力且持续5分钟以上时，开启自动分裂功能可自动根据数据量增加分区数量
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * 创建时间。
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * WebTracking功能支持快速采集各种浏览器以及iOS/Android/APP访问信息，默认关闭
         */
        public Builder enableTracking(Boolean enableTracking) {
            this.enableTracking = enableTracking;
            return this;
        }

        /**
         * 加密配置
         */
        public Builder encryptConf(EncryptConf encryptConf) {
            this.encryptConf = encryptConf;
            return this;
        }

        /**
         * 必须在 (30, ttl) 之间
         */
        public Builder hotTtl(Integer hotTtl) {
            this.hotTtl = hotTtl;
            return this;
        }

        /**
         * 最后修改时间。
         */
        public Builder lastModifyTime(Integer lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * logstore 的名称。
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * 最大 shard 数量。
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * [ standard | query ]
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * 日志所属产品类型
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * shard 数量。
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
         * 数据保存的天数。
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
