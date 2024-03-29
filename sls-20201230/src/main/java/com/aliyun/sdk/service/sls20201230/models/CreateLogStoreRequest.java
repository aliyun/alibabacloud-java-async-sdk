// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateLogStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateLogStoreRequest</p>
 */
public class CreateLogStoreRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

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
    @NameInMap("hot_ttl")
    private Integer hotTtl;

    @Body
    @NameInMap("infrequentAccessTTL")
    private Integer infrequentAccessTTL;

    @Body
    @NameInMap("logstoreName")
    @Validation(required = true)
    private String logstoreName;

    @Body
    @NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @Body
    @NameInMap("mode")
    private String mode;

    @Body
    @NameInMap("shardCount")
    @Validation(required = true)
    private Integer shardCount;

    @Body
    @NameInMap("telemetryType")
    private String telemetryType;

    @Body
    @NameInMap("ttl")
    @Validation(required = true)
    private Integer ttl;

    private CreateLogStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.appendMeta = builder.appendMeta;
        this.autoSplit = builder.autoSplit;
        this.enableTracking = builder.enableTracking;
        this.encryptConf = builder.encryptConf;
        this.hotTtl = builder.hotTtl;
        this.infrequentAccessTTL = builder.infrequentAccessTTL;
        this.logstoreName = builder.logstoreName;
        this.maxSplitShard = builder.maxSplitShard;
        this.mode = builder.mode;
        this.shardCount = builder.shardCount;
        this.telemetryType = builder.telemetryType;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
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

    public static final class Builder extends Request.Builder<CreateLogStoreRequest, Builder> {
        private String project; 
        private Boolean appendMeta; 
        private Boolean autoSplit; 
        private Boolean enableTracking; 
        private EncryptConf encryptConf; 
        private Integer hotTtl; 
        private Integer infrequentAccessTTL; 
        private String logstoreName; 
        private Integer maxSplitShard; 
        private String mode; 
        private Integer shardCount; 
        private String telemetryType; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogStoreRequest request) {
            super(request);
            this.project = request.project;
            this.appendMeta = request.appendMeta;
            this.autoSplit = request.autoSplit;
            this.enableTracking = request.enableTracking;
            this.encryptConf = request.encryptConf;
            this.hotTtl = request.hotTtl;
            this.infrequentAccessTTL = request.infrequentAccessTTL;
            this.logstoreName = request.logstoreName;
            this.maxSplitShard = request.maxSplitShard;
            this.mode = request.mode;
            this.shardCount = request.shardCount;
            this.telemetryType = request.telemetryType;
            this.ttl = request.ttl;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * Specifies whether to record public IP addresses. Default value: false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder appendMeta(Boolean appendMeta) {
            this.putBodyParameter("appendMeta", appendMeta);
            this.appendMeta = appendMeta;
            return this;
        }

        /**
         * Specifies whether to enable automatic sharding. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.putBodyParameter("autoSplit", autoSplit);
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * Specifies whether to enable the web tracking feature. Default value: false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder enableTracking(Boolean enableTracking) {
            this.putBodyParameter("enable_tracking", enableTracking);
            this.enableTracking = enableTracking;
            return this;
        }

        /**
         * The data structure of the encryption configuration.
         */
        public Builder encryptConf(EncryptConf encryptConf) {
            this.putBodyParameter("encrypt_conf", encryptConf);
            this.encryptConf = encryptConf;
            return this;
        }

        /**
         * The retention period of data in the hot storage tier of the Logstore. Unit: days. You can specify a value that ranges from 30 to the value of ttl.
         * <p>
         * 
         * Hot data that is stored for longer than the period specified by hot_ttl is converted to cold data. For more information, see [Enable hot and cold-tiered storage for a Logstore](~~308645~~).
         */
        public Builder hotTtl(Integer hotTtl) {
            this.putBodyParameter("hot_ttl", hotTtl);
            this.hotTtl = hotTtl;
            return this;
        }

        /**
         * infrequentAccessTTL.
         */
        public Builder infrequentAccessTTL(Integer infrequentAccessTTL) {
            this.putBodyParameter("infrequentAccessTTL", infrequentAccessTTL);
            this.infrequentAccessTTL = infrequentAccessTTL;
            return this;
        }

        /**
         * The name of the Logstore. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must be unique in a project.
         * *   The name can contain only lowercase letters, digits, hyphens (-), and underscores (\_).
         * *   The name must start and end with a lowercase letter or a digit.
         * *   The name must be 3 to 63 characters in length.
         */
        public Builder logstoreName(String logstoreName) {
            this.putBodyParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * The maximum number of shards into which existing shards can be automatically split. Valid values: 1 to 64.
         * <p>
         * 
         * > If you set autoSplit to true, you must configure this parameter.
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.putBodyParameter("maxSplitShard", maxSplitShard);
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * The type of the Logstore. Log Service provides the following types of Logstores: Standard Logstores and Query Logstores. Valid values:
         * <p>
         * 
         * *   **standard**: Standard Logstore. This type of Logstore supports the log analysis feature and is suitable for scenarios such as real-time monitoring and interactive analysis. You can also use this type of Logstore to build a comprehensive observability system.
         * *   **query**: Query Logstore. This type of Logstore supports high-performance queries. The index traffic fee of a Query Logstore is approximately half that of a Standard Logstore. Query Logstores do not support SQL analysis. Query Logstores are suitable for scenarios in which the amount of data is large, the log retention period is long, or log analysis is not required. Log retention periods of weeks or months are considered long.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The number of shards.
         * <p>
         * 
         * > You cannot call the CreateLogStore operation to change the number of shards. You can call the SplitShard or MergeShards operation to change the number of shards.
         */
        public Builder shardCount(Integer shardCount) {
            this.putBodyParameter("shardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * The type of the observable data. Valid values:
         * <p>
         * 
         * *   None: logs
         * *   Metrics: metrics
         */
        public Builder telemetryType(String telemetryType) {
            this.putBodyParameter("telemetryType", telemetryType);
            this.telemetryType = telemetryType;
            return this;
        }

        /**
         * The retention period of data. Unit: days. Valid values: 1 to 3000. If you set this parameter to 3650, data is permanently stored.
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public CreateLogStoreRequest build() {
            return new CreateLogStoreRequest(this);
        } 

    } 

}
