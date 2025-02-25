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
 * {@link ResumeVsStreamRequest} extends {@link RequestModel}
 *
 * <p>ResumeVsStreamRequest</p>
 */
public class ResumeVsStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private ResumeVsStreamRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.controlStreamAction = builder.controlStreamAction;
        this.domainName = builder.domainName;
        this.liveStreamType = builder.liveStreamType;
        this.ownerId = builder.ownerId;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeVsStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<ResumeVsStreamRequest, Builder> {
        private String appName; 
        private String controlStreamAction; 
        private String domainName; 
        private String liveStreamType; 
        private Long ownerId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(ResumeVsStreamRequest request) {
            super(request);
            this.appName = request.appName;
            this.controlStreamAction = request.controlStreamAction;
            this.domainName = request.domainName;
            this.liveStreamType = request.liveStreamType;
            this.ownerId = request.ownerId;
            this.streamName = request.streamName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxApp</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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
         * <p>example.aliyundoc.com</p>
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxStream</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public ResumeVsStreamRequest build() {
            return new ResumeVsStreamRequest(this);
        } 

    } 

}
