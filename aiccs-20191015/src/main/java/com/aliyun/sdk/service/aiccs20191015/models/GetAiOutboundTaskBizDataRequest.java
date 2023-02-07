// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskBizDataRequest} extends {@link RequestModel}
 *
 * <p>GetAiOutboundTaskBizDataRequest</p>
 */
public class GetAiOutboundTaskBizDataRequest extends Request {
    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetAiOutboundTaskBizDataRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiOutboundTaskBizDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetAiOutboundTaskBizDataRequest, Builder> {
        private String channelId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiOutboundTaskBizDataRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.instanceId = request.instanceId;
        } 

        /**
         * 入呼channelId
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetAiOutboundTaskBizDataRequest build() {
            return new GetAiOutboundTaskBizDataRequest(this);
        } 

    } 

}
