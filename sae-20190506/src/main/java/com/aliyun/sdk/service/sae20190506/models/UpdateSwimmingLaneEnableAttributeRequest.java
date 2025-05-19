// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateSwimmingLaneEnableAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSwimmingLaneEnableAttributeRequest</p>
 */
public class UpdateSwimmingLaneEnableAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaneId")
    private Long laneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private UpdateSwimmingLaneEnableAttributeRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.groupId = builder.groupId;
        this.laneId = builder.laneId;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSwimmingLaneEnableAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<UpdateSwimmingLaneEnableAttributeRequest, Builder> {
        private Boolean enable; 
        private Long groupId; 
        private Long laneId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSwimmingLaneEnableAttributeRequest request) {
            super(request);
            this.enable = request.enable;
            this.groupId = request.groupId;
            this.laneId = request.laneId;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * LaneId.
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public UpdateSwimmingLaneEnableAttributeRequest build() {
            return new UpdateSwimmingLaneEnableAttributeRequest(this);
        } 

    } 

}
