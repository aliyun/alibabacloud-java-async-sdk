// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddQueueRequest} extends {@link RequestModel}
 *
 * <p>AddQueueRequest</p>
 */
public class AddQueueRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    private AddQueueRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.queueName = builder.queueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddQueueRequest create() {
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
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    public static final class Builder extends Request.Builder<AddQueueRequest, Builder> {
        private String clusterId; 
        private String queueName; 

        private Builder() {
            super();
        } 

        private Builder(AddQueueRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.queueName = response.queueName;
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
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        @Override
        public AddQueueRequest build() {
            return new AddQueueRequest(this);
        } 

    } 

}
