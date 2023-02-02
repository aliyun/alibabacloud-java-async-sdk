// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupDeleteRequest} extends {@link RequestModel}
 *
 * <p>OnsGroupDeleteRequest</p>
 */
public class OnsGroupDeleteRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private OnsGroupDeleteRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsGroupDeleteRequest create() {
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

    public static final class Builder extends Request.Builder<OnsGroupDeleteRequest, Builder> {
        private String groupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnsGroupDeleteRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the consumer group that you want to delete.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the Message Queue for Apache RocketMQ instance that contains the specified group.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnsGroupDeleteRequest build() {
            return new OnsGroupDeleteRequest(this);
        } 

    } 

}
