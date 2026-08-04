// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchDeleteTopicsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteTopicsRequest</p>
 */
public class BatchDeleteTopicsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topics")
    private java.util.List<String> topics;

    private BatchDeleteTopicsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.topics = builder.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteTopicsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topics
     */
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public static final class Builder extends Request.Builder<BatchDeleteTopicsRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private java.util.List<String> topics; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteTopicsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.topics = request.topics;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Topics.
         */
        public Builder topics(java.util.List<String> topics) {
            String topicsShrink = shrink(topics, "Topics", "json");
            this.putQueryParameter("Topics", topicsShrink);
            this.topics = topics;
            return this;
        }

        @Override
        public BatchDeleteTopicsRequest build() {
            return new BatchDeleteTopicsRequest(this);
        } 

    } 

}
