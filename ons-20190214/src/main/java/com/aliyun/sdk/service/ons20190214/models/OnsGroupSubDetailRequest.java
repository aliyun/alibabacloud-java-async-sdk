// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupSubDetailRequest} extends {@link RequestModel}
 *
 * <p>OnsGroupSubDetailRequest</p>
 */
public class OnsGroupSubDetailRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private OnsGroupSubDetailRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsGroupSubDetailRequest create() {
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

    public static final class Builder extends Request.Builder<OnsGroupSubDetailRequest, Builder> {
        private String groupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnsGroupSubDetailRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the consumer group that you want to query.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance to which the consumer group you want to query belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnsGroupSubDetailRequest build() {
            return new OnsGroupSubDetailRequest(this);
        } 

    } 

}
