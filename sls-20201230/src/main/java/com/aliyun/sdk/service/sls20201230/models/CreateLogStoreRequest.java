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
 * {@link CreateLogStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateLogStoreRequest</p>
 */
public class CreateLogStoreRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

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
    @com.aliyun.core.annotation.NameInMap("processorId")
    private String processorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shardCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shardCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("telemetryType")
    private String telemetryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ttl")
    @com.aliyun.core.annotation.Validation(required = true)
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
        this.processorId = builder.processorId;
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
     * @return processorId
     */
    public String getProcessorId() {
        return this.processorId;
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
        private String processorId; 
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
            this.processorId = request.processorId;
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
         * <p>Specifies whether to record the <strong>public IP address</strong> and <strong>log receiving time</strong>. Default value: false. Valid values:</p>
         * <ul>
         * <li>true********</li>
         * <li>false********</li>
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
         * <p>The data structure of the encryption configuration. The following parameters are included: <code>enable</code>, <code>encrypt_type</code>, and <code>user_cmk_info</code>. For more information, see <a href="https://help.aliyun.com/document_detail/409461.html">EncryptConf</a>.</p>
         */
        public Builder encryptConf(EncryptConf encryptConf) {
            this.putBodyParameter("encrypt_conf", encryptConf);
            this.encryptConf = encryptConf;
            return this;
        }

        /**
         * <p>The retention period of data in the hot storage tier of the Logstore. Valid values: 7 to 3000. Unit: days.</p>
         * <p>After the retention period that is specified for the hot storage tier elapses, the data is moved to the Infrequent Access (IA) storage tier. For more information, see <a href="https://help.aliyun.com/document_detail/308645.html">Enable hot and cold-tiered storage for a Logstore</a>.</p>
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
         * <p>The name of the Logstore. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be unique in a project.</li>
         * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must start and end with a lowercase letter or a digit.</li>
         * <li>The name must be 3 to 63 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-logstore</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.putBodyParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The maximum number of shards into which existing shards can be automatically split. Valid values: 1 to 256.</p>
         * <blockquote>
         * <p> If you set autoSplit to true, you must specify this parameter.</p>
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
         * processorId.
         */
        public Builder processorId(String processorId) {
            this.putBodyParameter("processorId", processorId);
            this.processorId = processorId;
            return this;
        }

        /**
         * <p>The number of shards.</p>
         * <blockquote>
         * <p> You cannot call the CreateLogStore operation to change the number of shards. You can call the SplitShard or MergeShards operation to change the number of shards.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <li><strong>None</strong> (default): log data</li>
         * <li><strong>Metrics</strong>: metric data</li>
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
         * <p>The retention period of data. Unit: days. Valid values: 1 to 3000. If you set this parameter to 3650, data is permanently stored.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
