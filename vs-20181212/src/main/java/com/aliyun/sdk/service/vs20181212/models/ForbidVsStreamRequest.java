// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForbidVsStreamRequest} extends {@link RequestModel}
 *
 * <p>ForbidVsStreamRequest</p>
 */
public class ForbidVsStreamRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("ControlStreamAction")
    private String controlStreamAction;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("LiveStreamType")
    @Validation(required = true)
    private String liveStreamType;

    @Query
    @NameInMap("Oneshot")
    private String oneshot;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResumeTime")
    private String resumeTime;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    private ForbidVsStreamRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.controlStreamAction = builder.controlStreamAction;
        this.domainName = builder.domainName;
        this.liveStreamType = builder.liveStreamType;
        this.oneshot = builder.oneshot;
        this.ownerId = builder.ownerId;
        this.resumeTime = builder.resumeTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForbidVsStreamRequest create() {
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

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<ForbidVsStreamRequest, Builder> {
        private String appName; 
        private String controlStreamAction; 
        private String domainName; 
        private String liveStreamType; 
        private String oneshot; 
        private Long ownerId; 
        private String resumeTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(ForbidVsStreamRequest response) {
            super(response);
            this.appName = response.appName;
            this.controlStreamAction = response.controlStreamAction;
            this.domainName = response.domainName;
            this.liveStreamType = response.liveStreamType;
            this.oneshot = response.oneshot;
            this.ownerId = response.ownerId;
            this.resumeTime = response.resumeTime;
            this.streamName = response.streamName;
        } 

        /**
         * AppName.
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

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public ForbidVsStreamRequest build() {
            return new ForbidVsStreamRequest(this);
        } 

    } 

}
