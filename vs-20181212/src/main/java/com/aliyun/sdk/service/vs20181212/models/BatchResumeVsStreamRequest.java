// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchResumeVsStreamRequest} extends {@link RequestModel}
 *
 * <p>BatchResumeVsStreamRequest</p>
 */
public class BatchResumeVsStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlStreamAction")
    private String controlStreamAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveStreamType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String liveStreamType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private BatchResumeVsStreamRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.controlStreamAction = builder.controlStreamAction;
        this.domainName = builder.domainName;
        this.liveStreamType = builder.liveStreamType;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchResumeVsStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return controlStreamAction
     */
    public String getControlStreamAction() {
        return this.controlStreamAction;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return liveStreamType
     */
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<BatchResumeVsStreamRequest, Builder> {
        private String channel; 
        private String controlStreamAction; 
        private String domainName; 
        private String liveStreamType; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(BatchResumeVsStreamRequest request) {
            super(request);
            this.channel = request.channel;
            this.controlStreamAction = request.controlStreamAction;
            this.domainName = request.domainName;
            this.liveStreamType = request.liveStreamType;
            this.ownerId = request.ownerId;
        } 

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * ControlStreamAction.
         */
        public Builder controlStreamAction(String controlStreamAction) {
            this.putQueryParameter("ControlStreamAction", controlStreamAction);
            this.controlStreamAction = controlStreamAction;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * LiveStreamType.
         */
        public Builder liveStreamType(String liveStreamType) {
            this.putQueryParameter("LiveStreamType", liveStreamType);
            this.liveStreamType = liveStreamType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public BatchResumeVsStreamRequest build() {
            return new BatchResumeVsStreamRequest(this);
        } 

    } 

}
