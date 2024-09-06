// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueuesRequest} extends {@link RequestModel}
 *
 * <p>ListQueuesRequest</p>
 */
public class ListQueuesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueNames")
    private java.util.List < String > queueNames;

    private ListQueuesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.queueNames = builder.queueNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueuesRequest create() {
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
    public java.util.List < String > getQueueNames() {
        return this.queueNames;
    }

    public static final class Builder extends Request.Builder<ListQueuesRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > queueNames; 

        private Builder() {
            super();
        } 

        private Builder(ListQueuesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.queueNames = request.queueNames;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * QueueNames.
         */
        public Builder queueNames(java.util.List < String > queueNames) {
            String queueNamesShrink = shrink(queueNames, "QueueNames", "json");
            this.putQueryParameter("QueueNames", queueNamesShrink);
            this.queueNames = queueNames;
            return this;
        }

        @Override
        public ListQueuesRequest build() {
            return new ListQueuesRequest(this);
        } 

    } 

}
