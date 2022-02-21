// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateLogStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogStoreRequest</p>
 */
public class UpdateLogStoreRequest extends Request {
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
    @NameInMap("logstore")
    private String logstore;

    @Body
    @NameInMap("logstoreName")
    private String logstoreName;

    @Body
    @NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @Body
    @NameInMap("shardCount")
    private Integer shardCount;

    @Body
    @NameInMap("ttl")
    private Integer ttl;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private UpdateLogStoreRequest(Builder builder) {
        super(builder);
        this.appendMeta = builder.appendMeta;
        this.autoSplit = builder.autoSplit;
        this.enableTracking = builder.enableTracking;
        this.encryptConf = builder.encryptConf;
        this.logstore = builder.logstore;
        this.logstoreName = builder.logstoreName;
        this.maxSplitShard = builder.maxSplitShard;
        this.shardCount = builder.shardCount;
        this.ttl = builder.ttl;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
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
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<UpdateLogStoreRequest, Builder> {
        private Boolean appendMeta; 
        private Boolean autoSplit; 
        private Boolean enableTracking; 
        private EncryptConf encryptConf; 
        private String logstore; 
        private String logstoreName; 
        private Integer maxSplitShard; 
        private Integer shardCount; 
        private Integer ttl; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogStoreRequest response) {
            super(response);
            this.appendMeta = response.appendMeta;
            this.autoSplit = response.autoSplit;
            this.enableTracking = response.enableTracking;
            this.encryptConf = response.encryptConf;
            this.logstore = response.logstore;
            this.logstoreName = response.logstoreName;
            this.maxSplitShard = response.maxSplitShard;
            this.shardCount = response.shardCount;
            this.ttl = response.ttl;
            this.project = response.project;
        } 

        /**
         * appendMeta.
         */
        public Builder appendMeta(Boolean appendMeta) {
            this.putBodyParameter("appendMeta", appendMeta);
            this.appendMeta = appendMeta;
            return this;
        }

        /**
         * autoSplit.
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.putBodyParameter("autoSplit", autoSplit);
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * enable_tracking.
         */
        public Builder enableTracking(Boolean enableTracking) {
            this.putBodyParameter("enable_tracking", enableTracking);
            this.enableTracking = enableTracking;
            return this;
        }

        /**
         * encrypt_conf.
         */
        public Builder encryptConf(EncryptConf encryptConf) {
            this.putBodyParameter("encrypt_conf", encryptConf);
            this.encryptConf = encryptConf;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putBodyParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * logstoreName.
         */
        public Builder logstoreName(String logstoreName) {
            this.putBodyParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * maxSplitShard.
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.putBodyParameter("maxSplitShard", maxSplitShard);
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * shardCount.
         */
        public Builder shardCount(Integer shardCount) {
            this.putBodyParameter("shardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public UpdateLogStoreRequest build() {
            return new UpdateLogStoreRequest(this);
        } 

    } 

}
