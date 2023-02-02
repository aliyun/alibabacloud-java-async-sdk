// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupCreateRequest} extends {@link RequestModel}
 *
 * <p>OnsGroupCreateRequest</p>
 */
public class OnsGroupCreateRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Remark")
    private String remark;

    private OnsGroupCreateRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.instanceId = builder.instanceId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsGroupCreateRequest create() {
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
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<OnsGroupCreateRequest, Builder> {
        private String groupId; 
        private String groupType; 
        private String instanceId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(OnsGroupCreateRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupType = request.groupType;
            this.instanceId = request.instanceId;
            this.remark = request.remark;
        } 

        /**
         * The ID of the consumer group that you want to create. Specify the group ID based on the following rules:
         * <p>
         * 
         * *   The group ID must be 2 to 64 characters in length and can contain only letters, digits, hyphens (-), and underscores (\_).
         * *   If the Message Queue for Apache RocketMQ instance in which you want to create the consumer group uses a namespace, the group ID must be unique in the instance. The group ID cannot be the same as an existing group ID or a topic name in the instance. The group ID can be the same as a group ID or a topic name in another instance that uses a different namespace. For example, if Instance A and Instance B use different namespaces, a group ID in Instance A can be the same as a group ID or a topic name in Instance B.
         * *   If the instance does not use a namespace, the group ID must be globally unique across instances and regions. The group ID cannot be the same as an existing group ID or topic name in Message Queue for Apache RocketMQ instances that belong to your Alibaba Cloud account.
         * 
         * > 
         * 
         * *   After the consumer group is created, the group ID cannot be changed.
         * 
         * *   To check whether an instance uses a namespace, log on to the Message Queue for Apache RocketMQ console, go to the **Instance Details** page, and then view the value of the Namespace field in the **Basic Information** section.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The protocol over which clients in the consumer group communicate with the Message Queue for Apache RocketMQ broker. All clients in a consumer group communicate with the Message Queue for Apache RocketMQ broker over the same protocol. You must create different groups for TCP clients and HTTP clients. Valid values:
         * <p>
         * 
         * *   **tcp**: Clients in the consumer group consume messages over TCP. This is the default value.
         * *   **http**: Clients in the consumer group consume messages over HTTP.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * The ID of the instance in which you want to create the consumer group.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The description of the consumer group.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public OnsGroupCreateRequest build() {
            return new OnsGroupCreateRequest(this);
        } 

    } 

}
