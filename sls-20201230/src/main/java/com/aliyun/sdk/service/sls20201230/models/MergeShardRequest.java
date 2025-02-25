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
 * {@link MergeShardRequest} extends {@link RequestModel}
 *
 * <p>MergeShardRequest</p>
 */
public class MergeShardRequest extends Request {
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

    private MergeShardRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shard = builder.shard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeShardRequest create() {
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

    public static final class Builder extends Request.Builder<MergeShardRequest, Builder> {
        private String project; 
        private String logstore; 
        private Integer shard; 

        private Builder() {
            super();
        } 

        private Builder(MergeShardRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shard = request.shard;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>Shard ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder shard(Integer shard) {
            this.putPathParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        @Override
        public MergeShardRequest build() {
            return new MergeShardRequest(this);
        } 

    } 

}
