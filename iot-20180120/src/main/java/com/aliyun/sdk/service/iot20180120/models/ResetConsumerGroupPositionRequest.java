// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetConsumerGroupPositionRequest} extends {@link RequestModel}
 *
 * <p>ResetConsumerGroupPositionRequest</p>
 */
public class ResetConsumerGroupPositionRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private ResetConsumerGroupPositionRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetConsumerGroupPositionRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<ResetConsumerGroupPositionRequest, Builder> {
        private String groupId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ResetConsumerGroupPositionRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public ResetConsumerGroupPositionRequest build() {
            return new ResetConsumerGroupPositionRequest(this);
        } 

    } 

}
