// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokePushMessageRequest} extends {@link RequestModel}
 *
 * <p>RevokePushMessageRequest</p>
 */
public class RevokePushMessageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RevokePushMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.messageId = builder.messageId;
        this.targetId = builder.targetId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokePushMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RevokePushMessageRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String messageId; 
        private String targetId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RevokePushMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.messageId = request.messageId;
            this.targetId = request.targetId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * TargetId.
         */
        public Builder targetId(String targetId) {
            this.putBodyParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RevokePushMessageRequest build() {
            return new RevokePushMessageRequest(this);
        } 

    } 

}
