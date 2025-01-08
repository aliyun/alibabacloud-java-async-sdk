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
 * {@link SplitShardRequest} extends {@link RequestModel}
 *
 * <p>SplitShardRequest</p>
 */
public class SplitShardRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("shard")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("shardCount")
    private Integer shardCount;

    private SplitShardRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shard = builder.shard;
        this.key = builder.key;
        this.shardCount = builder.shardCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SplitShardRequest create() {
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
     * @return shard
     */
    public Integer getShard() {
        return this.shard;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
    }

    public static final class Builder extends Request.Builder<SplitShardRequest, Builder> {
        private String project; 
        private String logstore; 
        private Integer shard; 
        private String key; 
        private Integer shardCount; 

        private Builder() {
            super();
        } 

        private Builder(SplitShardRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shard = request.shard;
            this.key = request.key;
            this.shardCount = request.shardCount;
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
         * <p>logstorename</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The ID of the shard.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder shard(Integer shard) {
            this.putPathParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        /**
         * <p>The position where the shard is split.</p>
         * 
         * <strong>example:</strong>
         * <p>ef000000000000000000000000000000</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The number of new shards that are generated after splitting.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.putQueryParameter("shardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        @Override
        public SplitShardRequest build() {
            return new SplitShardRequest(this);
        } 

    } 

}
