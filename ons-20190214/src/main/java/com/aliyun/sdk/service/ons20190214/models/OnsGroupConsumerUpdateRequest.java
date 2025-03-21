// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

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
 * {@link OnsGroupConsumerUpdateRequest} extends {@link RequestModel}
 *
 * <p>OnsGroupConsumerUpdateRequest</p>
 */
public class OnsGroupConsumerUpdateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadEnable")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the consumer group for which you want to configure read permissions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_groupId</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the instance to which the consumer group you want to configure belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to authorize the consumer group to read messages. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The consumer group can read messages.</li>
         * <li><strong>false</strong>: The consumer group cannot read messages.</li>
         * </ul>
         * <p>Default value: <strong>true</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
