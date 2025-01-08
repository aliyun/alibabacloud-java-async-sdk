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
 * {@link GetCheckPointRequest} extends {@link RequestModel}
 *
 * <p>GetCheckPointRequest</p>
 */
public class GetCheckPointRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("shard")
    private Integer shard;

    private GetCheckPointRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.consumerGroup = builder.consumerGroup;
        this.shard = builder.shard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckPointRequest create() {
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
     * @return consumerGroup
     */
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * @return shard
     */
    public Integer getShard() {
        return this.shard;
    }

    public static final class Builder extends Request.Builder<GetCheckPointRequest, Builder> {
        private String project; 
        private String logstore; 
        private String consumerGroup; 
        private Integer shard; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckPointRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.consumerGroup = request.consumerGroup;
            this.shard = request.shard;
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
         * <p>The name of the consumer group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-group-1</p>
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putPathParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * <p>The shard ID.</p>
         * <ul>
         * <li>If the specified shard does not exist, an empty list is returned.</li>
         * <li>If no shard ID is specified, the checkpoints of all shards are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder shard(Integer shard) {
            this.putQueryParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        @Override
        public GetCheckPointRequest build() {
            return new GetCheckPointRequest(this);
        } 

    } 

}
