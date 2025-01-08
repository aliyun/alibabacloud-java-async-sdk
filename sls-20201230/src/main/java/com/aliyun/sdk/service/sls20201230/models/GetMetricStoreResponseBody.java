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
 * {@link GetMetricStoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetricStoreResponseBody</p>
 */
public class GetMetricStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoSplit")
    private Boolean autoSplit;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @com.aliyun.core.annotation.NameInMap("maxSplitShard")
    private Integer maxSplitShard;

    @com.aliyun.core.annotation.NameInMap("metricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("shardCount")
    private Integer shardCount;

    @com.aliyun.core.annotation.NameInMap("ttl")
    private Integer ttl;

    private GetMetricStoreResponseBody(Builder builder) {
        this.autoSplit = builder.autoSplit;
        this.createTime = builder.createTime;
        this.lastModifyTime = builder.lastModifyTime;
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

    public static GetMetricStoreResponseBody create() {
        return builder().build();
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
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
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

    public static final class Builder {
        private Boolean autoSplit; 
        private Long createTime; 
        private Long lastModifyTime; 
        private Integer maxSplitShard; 
        private String metricType; 
        private String mode; 
        private String name; 
        private Integer shardCount; 
        private Integer ttl; 

        /**
         * <p>Indicates whether the automatic sharding feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoSplit(Boolean autoSplit) {
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * <p>The creation time. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1698933894</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The last update time. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1712023974</p>
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * <p>The maximum number of shards into which existing shards can be automatically split.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder maxSplitShard(Integer maxSplitShard) {
            this.maxSplitShard = maxSplitShard;
            return this;
        }

        /**
         * <p>The metric type of the Metricstore. Example: prometheus.</p>
         * 
         * <strong>example:</strong>
         * <p>prometheus</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The specification type of the Metricstore. Example: standard.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The name of the Metricstore.</p>
         * 
         * <strong>example:</strong>
         * <p>my_metric_store</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        /**
         * <p>The retention period. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        public GetMetricStoreResponseBody build() {
            return new GetMetricStoreResponseBody(this);
        } 

    } 

}
