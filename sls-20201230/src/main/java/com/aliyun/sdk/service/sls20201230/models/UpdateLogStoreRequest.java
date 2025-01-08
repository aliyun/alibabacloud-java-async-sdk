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
 * {@link UpdateLogStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogStoreRequest</p>
 */
public class UpdateLogStoreRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appendMeta")
    private Boolean appendMeta;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoSplit")
    private Boolean autoSplit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable_tracking")
    private Boolean enableTracking;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("encrypt_conf")
    private EncryptConf encryptConf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hot_ttl")
    private Integer hotTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("infrequentAccessTTL")
    private Integer infrequentAccessTTL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("logstoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shardCount")
    @Deprecated
    private Integer shardCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("telemetryType")
    @Deprecated
    private String telemetryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ttl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ttl;

    private UpdateLogStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
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

    public static UpdateLogStoreRequest create() {
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
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
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

    public static final class Builder extends Request.Builder<UpdateLogStoreRequest, Builder> {
        private String project; 
        private String logstore; 
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

        private Builder(UpdateLogStoreRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>Specifies whether to record public IP addresses. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder appendMeta(Boolean appendMeta) {
            this.putBodyParameter("appendMeta", appendMeta);
            this.appendMeta = appendMeta;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic sharding. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.putBodyParameter("autoSplit", autoSplit);
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * <p>Specifies whether to enable the web tracking feature. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableTracking(Boolean enableTracking) {
            this.putBodyParameter("enable_tracking", enableTracking);
            this.enableTracking = enableTracking;
            return this;
        }

        /**
         * <p>The data structure of the encryption configuration.</p>
         */
        public Builder encryptConf(EncryptConf encryptConf) {
            this.putBodyParameter("encrypt_conf", encryptConf);
            this.encryptConf = encryptConf;
            return this;
        }

        /**
         * <p>The retention period of data in the hot storage tier of the Logstore. Valid values: 7 to 3000. Unit: days. After the retention period that is specified for the hot storage tier elapses, the data is moved to the Infrequent Access (IA) storage tier. For more information, see <a href="https://help.aliyun.com/document_detail/308645.html">Enable hot and cold-tiered storage for a Logstore</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder hotTtl(Integer hotTtl) {
            this.putBodyParameter("hot_ttl", hotTtl);
            this.hotTtl = hotTtl;
            return this;
        }

        /**
         * <p>The retention period of data in the IA storage tier of the Logstore. You must set this parameter to at least 30 days. After the data retention period that you specify for the IA storage tier elapses, the data is moved to the Archive storage tier.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder infrequentAccessTTL(Integer infrequentAccessTTL) {
            this.putBodyParameter("infrequentAccessTTL", infrequentAccessTTL);
            this.infrequentAccessTTL = infrequentAccessTTL;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.putBodyParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The maximum number of shards into which existing shards can be automatically split. Valid values: 1 to 256.</p>
         * <blockquote>
         * <p> If you set autoSplit to true, you must specify maxSplitShard.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.putBodyParameter("maxSplitShard", maxSplitShard);
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * <p>The type of the Logstore. Simple Log Service provides two types of Logstores: Standard Logstores and Query Logstores. Valid values:</p>
         * <ul>
         * <li><strong>standard</strong>: Standard Logstore. This type of Logstore supports the log analysis feature and is suitable for scenarios such as real-time monitoring and interactive analysis. You can also use this type of Logstore to build a comprehensive observability system.</li>
         * <li><strong>query</strong>: Query Logstore. This type of Logstore supports high-performance queries. The index traffic fee of a Query Logstore is approximately half that of a Standard Logstore. Query Logstores do not support SQL analysis. Query Logstores are suitable for scenarios in which the amount of data is large, the log retention period is long, or log analysis is not required. If logs are stored for weeks or months, the log retention period is considered long.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder mode(String mode) {
            this.putBodyParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The number of shards.</p>
         * <blockquote>
         * <p> You cannot call the UpdateLogStore operation to change the number of shards. You can call the SplitShard or MergeShards operation to change the number of shards.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.putBodyParameter("shardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        /**
         * <p>The type of the observable data. Valid values:</p>
         * <ul>
         * <li>None (default): log data.</li>
         * <li>Metrics: metric data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder telemetryType(String telemetryType) {
            this.putBodyParameter("telemetryType", telemetryType);
            this.telemetryType = telemetryType;
            return this;
        }

        /**
         * <p>The retention period of data. Unit: days. Valid values: 1 to 3650. If you set this parameter to 3650, logs are permanently stored.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public UpdateLogStoreRequest build() {
            return new UpdateLogStoreRequest(this);
        } 

    } 

}
