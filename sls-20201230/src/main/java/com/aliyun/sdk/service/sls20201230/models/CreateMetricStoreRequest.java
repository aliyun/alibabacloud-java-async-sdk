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
 * {@link CreateMetricStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateMetricStoreRequest</p>
 */
public class CreateMetricStoreRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoSplit")
    private Boolean autoSplit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metricType")
    private String metricType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shardCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shardCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ttl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ttl;

    private CreateMetricStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.autoSplit = builder.autoSplit;
        this.maxSplitShard = builder.maxSplitShard;
        this.metricType = builder.metricType;
        this.mode = builder.mode;
        this.name = builder.name;
        this.shardCount = builder.shardCount;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetricStoreRequest create() {
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
     * @return autoSplit
     */
    public Boolean getAutoSplit() {
        return this.autoSplit;
    }

    /**
     * @return maxSplitShard
     */
    public Integer getMaxSplitShard() {
        return this.maxSplitShard;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<CreateMetricStoreRequest, Builder> {
        private String project; 
        private Boolean autoSplit; 
        private Integer maxSplitShard; 
        private String metricType; 
        private String mode; 
        private String name; 
        private Integer shardCount; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetricStoreRequest request) {
            super(request);
            this.project = request.project;
            this.autoSplit = request.autoSplit;
            this.maxSplitShard = request.maxSplitShard;
            this.metricType = request.metricType;
            this.mode = request.mode;
            this.name = request.name;
            this.shardCount = request.shardCount;
            this.ttl = request.ttl;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic sharding.</p>
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
         * <p>The maximum number of shards into which existing shards can be automatically split. This parameter is valid only when you set the autoSplit parameter to true.</p>
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
         * <p>The type of the metric data. Example: prometheus.</p>
         * 
         * <strong>example:</strong>
         * <p>prometheus</p>
         */
        public Builder metricType(String metricType) {
            this.putBodyParameter("metricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The type of the Metricstore. For example, you can set the parameter to standard to query Standard Metricstores.</p>
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
         * <p>The name of the Metricstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_metric_store</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of shards in the Metricstore.</p>
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
         * <p>The retention period of the metric data in the Metricstore. Unit: days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public CreateMetricStoreRequest build() {
            return new CreateMetricStoreRequest(this);
        } 

    } 

}
