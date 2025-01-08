// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Logstore} extends {@link TeaModel}
 *
 * <p>Logstore</p>
 */
public class Logstore extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appendMeta")
    private Boolean appendMeta;

    @com.aliyun.core.annotation.NameInMap("autoSplit")
    private Boolean autoSplit;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Integer createTime;

    @com.aliyun.core.annotation.NameInMap("enable_tracking")
    private Boolean enableTracking;

    @com.aliyun.core.annotation.NameInMap("encrypt_conf")
    private EncryptConf encryptConf;

    @com.aliyun.core.annotation.NameInMap("hot_ttl")
    private Integer hotTtl;

    @com.aliyun.core.annotation.NameInMap("infrequentAccessTTL")
    private Integer infrequentAccessTTL;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private Integer lastModifyTime;

    @com.aliyun.core.annotation.NameInMap("logstoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstoreName;

    @com.aliyun.core.annotation.NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("processorId")
    private String processorId;

    @com.aliyun.core.annotation.NameInMap("productType")
    private String productType;

    @com.aliyun.core.annotation.NameInMap("shardCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shardCount;

    @com.aliyun.core.annotation.NameInMap("telemetryType")
    private String telemetryType;

    @com.aliyun.core.annotation.NameInMap("ttl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ttl;

    private Logstore(Builder builder) {
        this.appendMeta = builder.appendMeta;
        this.autoSplit = builder.autoSplit;
        this.createTime = builder.createTime;
        this.enableTracking = builder.enableTracking;
        this.encryptConf = builder.encryptConf;
        this.hotTtl = builder.hotTtl;
        this.infrequentAccessTTL = builder.infrequentAccessTTL;
        this.lastModifyTime = builder.lastModifyTime;
        this.logstoreName = builder.logstoreName;
        this.maxSplitShard = builder.maxSplitShard;
        this.mode = builder.mode;
        this.processorId = builder.processorId;
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
     * @return infrequentAccessTTL
     */
    public Integer getInfrequentAccessTTL() {
        return this.infrequentAccessTTL;
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
     * @return processorId
     */
    public String getProcessorId() {
        return this.processorId;
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
        private Integer infrequentAccessTTL; 
        private Integer lastModifyTime; 
        private String logstoreName; 
        private Integer maxSplitShard; 
        private String mode; 
        private String processorId; 
        private String productType; 
        private Integer shardCount; 
        private String telemetryType; 
        private Integer ttl; 

        /**
         * appendMeta.
         */
        public Builder appendMeta(Boolean appendMeta) {
            this.appendMeta = appendMeta;
            return this;
        }

        /**
         * autoSplit.
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * enable_tracking.
         */
        public Builder enableTracking(Boolean enableTracking) {
            this.enableTracking = enableTracking;
            return this;
        }

        /**
         * encrypt_conf.
         */
        public Builder encryptConf(EncryptConf encryptConf) {
            this.encryptConf = encryptConf;
            return this;
        }

        /**
         * hot_ttl.
         */
        public Builder hotTtl(Integer hotTtl) {
            this.hotTtl = hotTtl;
            return this;
        }

        /**
         * infrequentAccessTTL.
         */
        public Builder infrequentAccessTTL(Integer infrequentAccessTTL) {
            this.infrequentAccessTTL = infrequentAccessTTL;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(Integer lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-logstore</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * maxSplitShard.
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * processorId.
         */
        public Builder processorId(String processorId) {
            this.processorId = processorId;
            return this;
        }

        /**
         * productType.
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        /**
         * telemetryType.
         */
        public Builder telemetryType(String telemetryType) {
            this.telemetryType = telemetryType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
