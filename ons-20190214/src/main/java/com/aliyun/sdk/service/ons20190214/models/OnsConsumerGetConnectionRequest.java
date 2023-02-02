// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerGetConnectionRequest} extends {@link RequestModel}
 *
 * <p>OnsConsumerGetConnectionRequest</p>
 */
public class OnsConsumerGetConnectionRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
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
         * The ID of the consumer group whose client connection status you want to query.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance to which the consumer group belongs.
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
