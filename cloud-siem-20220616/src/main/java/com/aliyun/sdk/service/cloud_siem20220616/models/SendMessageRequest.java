// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageRequest} extends {@link RequestModel}
 *
 * <p>SendMessageRequest</p>
 */
public class SendMessageRequest extends Request {
    @Body
    @NameInMap("ChannelType")
    private Integer channelType;

    @Body
    @NameInMap("ReceiveUid")
    private Long receiveUid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.receiveUid = builder.receiveUid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public Integer getChannelType() {
        return this.channelType;
    }

    /**
     * @return receiveUid
     */
    public Long getReceiveUid() {
        return this.receiveUid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private Integer channelType; 
        private Long receiveUid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.receiveUid = request.receiveUid;
            this.regionId = request.regionId;
        } 

        /**
         * ChannelType.
         */
        public Builder channelType(Integer channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * ReceiveUid.
         */
        public Builder receiveUid(Long receiveUid) {
            this.putBodyParameter("ReceiveUid", receiveUid);
            this.receiveUid = receiveUid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

}
