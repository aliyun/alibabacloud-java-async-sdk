// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchForbidVsStreamRequest} extends {@link RequestModel}
 *
 * <p>BatchForbidVsStreamRequest</p>
 */
public class BatchForbidVsStreamRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Oneshot")
    private String oneshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResumeTime")
    private String resumeTime;

    private BatchForbidVsStreamRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.controlStreamAction = builder.controlStreamAction;
        this.domainName = builder.domainName;
        this.liveStreamType = builder.liveStreamType;
        this.oneshot = builder.oneshot;
        this.ownerId = builder.ownerId;
        this.resumeTime = builder.resumeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchForbidVsStreamRequest create() {
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
     * @return oneshot
     */
    public String getOneshot() {
        return this.oneshot;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resumeTime
     */
    public String getResumeTime() {
        return this.resumeTime;
    }

    public static final class Builder extends Request.Builder<BatchForbidVsStreamRequest, Builder> {
        private String channel; 
        private String controlStreamAction; 
        private String domainName; 
        private String liveStreamType; 
        private String oneshot; 
        private Long ownerId; 
        private String resumeTime; 

        private Builder() {
            super();
        } 

        private Builder(BatchForbidVsStreamRequest request) {
            super(request);
            this.channel = request.channel;
            this.controlStreamAction = request.controlStreamAction;
            this.domainName = request.domainName;
            this.liveStreamType = request.liveStreamType;
            this.oneshot = request.oneshot;
            this.ownerId = request.ownerId;
            this.resumeTime = request.resumeTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>live/stream1,live/stream2</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>publisher</p>
         */
        public Builder liveStreamType(String liveStreamType) {
            this.putQueryParameter("LiveStreamType", liveStreamType);
            this.liveStreamType = liveStreamType;
            return this;
        }

        /**
         * Oneshot.
         */
        public Builder oneshot(String oneshot) {
            this.putQueryParameter("Oneshot", oneshot);
            this.oneshot = oneshot;
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

        /**
         * ResumeTime.
         */
        public Builder resumeTime(String resumeTime) {
            this.putQueryParameter("ResumeTime", resumeTime);
            this.resumeTime = resumeTime;
            return this;
        }

        @Override
        public BatchForbidVsStreamRequest build() {
            return new BatchForbidVsStreamRequest(this);
        } 

    } 

}
