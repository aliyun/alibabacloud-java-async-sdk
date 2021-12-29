// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateLogStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateLogStoreRequest</p>
 */
public class CreateLogStoreRequest extends Request {
    @Body
    @NameInMap("appendMeta")
    private Boolean appendMeta;

    @Body
    @NameInMap("autoSplit")
    private Boolean autoSplit;

    @Body
    @NameInMap("enable_tracking")
    private Boolean enableTracking;

    @Body
    @NameInMap("encrypt_conf")
    private EncryptConf encryptConf;

    @Body
    @NameInMap("logstoreName")
    private String logstoreName;

    @Body
    @NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @Host
    @NameInMap("project")
    private String project;

    @Body
    @NameInMap("shardCount")
    private Integer shardCount;

    @Body
    @NameInMap("ttl")
    private Integer ttl;


    private CreateLogStoreRequest(Builder builder) {
        super(builder);
        this.appendMeta = builder.appendMeta;
        this.autoSplit = builder.autoSplit;
        this.enableTracking = builder.enableTracking;
        this.encryptConf = builder.encryptConf;
        this.logstoreName = builder.logstoreName;
        this.maxSplitShard = builder.maxSplitShard;
        this.project = builder.project;
        this.shardCount = builder.shardCount;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogStoreRequest create() {
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
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Boolean appendMeta; 
        private Boolean autoSplit; 
        private Boolean enableTracking; 
        private EncryptConf encryptConf; 
        private String logstoreName; 
        private Integer maxSplitShard; 
        private String project; 
        private Integer shardCount; 
        private Integer ttl; 

        /**
         * <p>appendMeta.</p>
         */
        public Builder appendMeta(Boolean appendMeta) {
            this.putBodyParameter("appendMeta", appendMeta);
            this.appendMeta = appendMeta;
            return this;
        }

        /**
         * <p>autoSplit.</p>
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.putBodyParameter("autoSplit", autoSplit);
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * <p>enable_tracking.</p>
         */
        public Builder enableTracking(Boolean enableTracking) {
            this.putBodyParameter("enable_tracking", enableTracking);
            this.enableTracking = enableTracking;
            return this;
        }

        /**
         * <p>encrypt_conf.</p>
         */
        public Builder encryptConf(EncryptConf encryptConf) {
            this.putBodyParameter("encrypt_conf", encryptConf);
            this.encryptConf = encryptConf;
            return this;
        }

        /**
         * <p>logstoreName.</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.putBodyParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>maxSplitShard.</p>
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.putBodyParameter("maxSplitShard", maxSplitShard);
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * <p>project.</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>shardCount.</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.putBodyParameter("shardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * <p>ttl.</p>
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        public CreateLogStoreRequest build() {
            return new CreateLogStoreRequest(this);
        } 

    } 

}
