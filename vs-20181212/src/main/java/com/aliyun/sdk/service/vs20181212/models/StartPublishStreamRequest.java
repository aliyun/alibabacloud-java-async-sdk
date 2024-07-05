// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPublishStreamRequest} extends {@link RequestModel}
 *
 * <p>StartPublishStreamRequest</p>
 */
public class StartPublishStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publishUrl;

    private StartPublishStreamRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.publishUrl = builder.publishUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPublishStreamRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return publishUrl
     */
    public String getPublishUrl() {
        return this.publishUrl;
    }

    public static final class Builder extends Request.Builder<StartPublishStreamRequest, Builder> {
        private String instanceId; 
        private Long ownerId; 
        private String publishUrl; 

        private Builder() {
            super();
        } 

        private Builder(StartPublishStreamRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.publishUrl = request.publishUrl;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PublishUrl.
         */
        public Builder publishUrl(String publishUrl) {
            this.putQueryParameter("PublishUrl", publishUrl);
            this.publishUrl = publishUrl;
            return this;
        }

        @Override
        public StartPublishStreamRequest build() {
            return new StartPublishStreamRequest(this);
        } 

    } 

}
