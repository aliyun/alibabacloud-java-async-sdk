// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsConsumerGetConnectionRequest} extends {@link RequestModel}
 *
 * <p>OnsConsumerGetConnectionRequest</p>
 */
public class OnsConsumerGetConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private OnsConsumerGetConnectionRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerGetConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<OnsConsumerGetConnectionRequest, Builder> {
        private String groupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnsConsumerGetConnectionRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the consumer group whose client connection status you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_consumer_id</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the instance to which the consumer group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnsConsumerGetConnectionRequest build() {
            return new OnsConsumerGetConnectionRequest(this);
        } 

    } 

}
