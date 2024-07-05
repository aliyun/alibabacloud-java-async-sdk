// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVsPullStreamInfoConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateVsPullStreamInfoConfigRequest</p>
 */
public class UpdateVsPullStreamInfoConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Always")
    private String always;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private UpdateVsPullStreamInfoConfigRequest(Builder builder) {
        super(builder);
        this.always = builder.always;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.sourceUrl = builder.sourceUrl;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVsPullStreamInfoConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return always
     */
    public String getAlways() {
        return this.always;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<UpdateVsPullStreamInfoConfigRequest, Builder> {
        private String always; 
        private String appName; 
        private String domainName; 
        private String endTime; 
        private Long ownerId; 
        private String sourceUrl; 
        private String startTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVsPullStreamInfoConfigRequest request) {
            super(request);
            this.always = request.always;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.sourceUrl = request.sourceUrl;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
        } 

        /**
         * Always.
         */
        public Builder always(String always) {
            this.putQueryParameter("Always", always);
            this.always = always;
            return this;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * SourceUrl.
         */
        public Builder sourceUrl(String sourceUrl) {
            this.putQueryParameter("SourceUrl", sourceUrl);
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
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
        public UpdateVsPullStreamInfoConfigRequest build() {
            return new UpdateVsPullStreamInfoConfigRequest(this);
        } 

    } 

}
