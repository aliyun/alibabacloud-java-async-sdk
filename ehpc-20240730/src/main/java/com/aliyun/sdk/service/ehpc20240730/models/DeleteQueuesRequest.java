// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link DeleteQueuesRequest} extends {@link RequestModel}
 *
 * <p>DeleteQueuesRequest</p>
 */
public class DeleteQueuesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueNames")
    private java.util.List<String> queueNames;

    private DeleteQueuesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.queueNames = builder.queueNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQueuesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return queueNames
     */
    public java.util.List<String> getQueueNames() {
        return this.queueNames;
    }

    public static final class Builder extends Request.Builder<DeleteQueuesRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> queueNames; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQueuesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.queueNames = request.queueNames;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The queues that you want to delete.</p>
         */
        public Builder queueNames(java.util.List<String> queueNames) {
            String queueNamesShrink = shrink(queueNames, "QueueNames", "json");
            this.putQueryParameter("QueueNames", queueNamesShrink);
            this.queueNames = queueNames;
            return this;
        }

        @Override
        public DeleteQueuesRequest build() {
            return new DeleteQueuesRequest(this);
        } 

    } 

}
