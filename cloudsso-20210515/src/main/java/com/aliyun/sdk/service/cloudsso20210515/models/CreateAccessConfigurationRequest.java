// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private CreateAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationName = builder.accessConfigurationName;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.relayState = builder.relayState;
        this.sessionDuration = builder.sessionDuration;
        this.tags = builder.tags;
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

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateAccessConfigurationRequest, Builder> {
        private String accessConfigurationName; 
        private String description; 
        private String directoryId; 
        private String relayState; 
        private Integer sessionDuration; 
        private java.util.List<Tags> tags; 

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
            this.tags = request.tags;
        } 

        /**
         * <p>The name of the access configuration.</p>
         * <p>Format: contains letters, digits, or hyphens (-).</p>
         * <p>Length: up to 32 characters.</p>
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
         * <p>Length: up to 1024 characters.</p>
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
         * <p>The directory ID.</p>
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
         * <p>The initial access page.</p>
         * <p>The page address that a CloudSSO user initially accesses when using the access configuration to access an account in a resource directory.</p>
         * <p>The page must be an Alibaba Cloud Management Console page. Default value: empty, which indicates that the user is redirected to the homepage of the Alibaba Cloud Management Console.</p>
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
         * <p>The session duration.</p>
         * <p>The maximum duration of a session when a CloudSSO user uses the access configuration to access an account in a resource directory.</p>
         * <p>Unit: seconds.</p>
         * <p>Valid values: 900 to 43200 (15 minutes to 12 hours).</p>
         * <p>Default value: 3600 (1 hour).</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder sessionDuration(Integer sessionDuration) {
            this.putQueryParameter("SessionDuration", sessionDuration);
            this.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateAccessConfigurationRequest build() {
            return new CreateAccessConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAccessConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateAccessConfigurationRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
