// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessConfigurationRequest</p>
 */
public class CreateAccessConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationName")
    private String accessConfigurationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelayState")
    private String relayState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionDuration")
    private Integer sessionDuration;

    private CreateAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationName = builder.accessConfigurationName;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.relayState = builder.relayState;
        this.sessionDuration = builder.sessionDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurationName
     */
    public String getAccessConfigurationName() {
        return this.accessConfigurationName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return relayState
     */
    public String getRelayState() {
        return this.relayState;
    }

    /**
     * @return sessionDuration
     */
    public Integer getSessionDuration() {
        return this.sessionDuration;
    }

    public static final class Builder extends Request.Builder<CreateAccessConfigurationRequest, Builder> {
        private String accessConfigurationName; 
        private String description; 
        private String directoryId; 
        private String relayState; 
        private Integer sessionDuration; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationName = request.accessConfigurationName;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.relayState = request.relayState;
            this.sessionDuration = request.sessionDuration;
        } 

        /**
         * <p>The name of the access configuration.</p>
         * <p>The name can contain letters, digits, and hyphens (-).</p>
         * <p>The name can be up to 32 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS-Admin</p>
         */
        public Builder accessConfigurationName(String accessConfigurationName) {
            this.putQueryParameter("AccessConfigurationName", accessConfigurationName);
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }

        /**
         * <p>The description of the access configuration.</p>
         * <p>The description can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an access configuration.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The initial web page that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
         * <p>The web page must be a page of the Alibaba Cloud Management Console. By default, this parameter is empty, which indicates that the initial web page is the homepage of the Alibaba Cloud Management Console.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cloudsso.console.aliyun.com">https://cloudsso.console.aliyun.com</a></p>
         */
        public Builder relayState(String relayState) {
            this.putQueryParameter("RelayState", relayState);
            this.relayState = relayState;
            return this;
        }

        /**
         * <p>The duration of a session in which a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
         * <p>Unit: seconds.</p>
         * <p>Valid values: 900 to 43200. The value 900 indicates 15 minutes. The value 43200 indicates 12 hours.</p>
         * <p>Default value: 3600. The value indicates 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder sessionDuration(Integer sessionDuration) {
            this.putQueryParameter("SessionDuration", sessionDuration);
            this.sessionDuration = sessionDuration;
            return this;
        }

        @Override
        public CreateAccessConfigurationRequest build() {
            return new CreateAccessConfigurationRequest(this);
        } 

    } 

}
