// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupConsumerUpdateRequest} extends {@link RequestModel}
 *
 * <p>OnsGroupConsumerUpdateRequest</p>
 */
public class OnsGroupConsumerUpdateRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ReadEnable")
    @Validation(required = true)
    private Boolean readEnable;

    private OnsGroupConsumerUpdateRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.readEnable = builder.readEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsGroupConsumerUpdateRequest create() {
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

    /**
     * @return readEnable
     */
    public Boolean getReadEnable() {
        return this.readEnable;
    }

    public static final class Builder extends Request.Builder<OnsGroupConsumerUpdateRequest, Builder> {
        private String groupId; 
        private String instanceId; 
        private Boolean readEnable; 

        private Builder() {
            super();
        } 

        private Builder(OnsGroupConsumerUpdateRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.readEnable = request.readEnable;
        } 

        /**
         * The ID of the consumer group for which you want to configure the read permissions.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance to which the consumer group you want to configure belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to authorize the consumer group with the specified ID to read messages. Valid values:
         * <p>
         * 
         * *   **true**: Authorize the consumer group with the specified ID to read messages.
         * *   **false**: Do not authorize the consumer group with the specified group ID to read messages.
         * 
         * Default value: **true**.
         */
        public Builder readEnable(Boolean readEnable) {
            this.putQueryParameter("ReadEnable", readEnable);
            this.readEnable = readEnable;
            return this;
        }

        @Override
        public OnsGroupConsumerUpdateRequest build() {
            return new OnsGroupConsumerUpdateRequest(this);
        } 

    } 

}
