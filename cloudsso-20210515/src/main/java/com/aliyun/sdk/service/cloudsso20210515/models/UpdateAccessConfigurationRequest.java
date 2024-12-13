// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccessConfigurationRequest</p>
 */
public class UpdateAccessConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    private String newDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewRelayState")
    private String newRelayState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSessionDuration")
    private Integer newSessionDuration;

    private UpdateAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.newDescription = builder.newDescription;
        this.newRelayState = builder.newRelayState;
        this.newSessionDuration = builder.newSessionDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccessConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurationId
     */
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    /**
     * @return newRelayState
     */
    public String getNewRelayState() {
        return this.newRelayState;
    }

    /**
     * @return newSessionDuration
     */
    public Integer getNewSessionDuration() {
        return this.newSessionDuration;
    }

    public static final class Builder extends Request.Builder<UpdateAccessConfigurationRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private String newDescription; 
        private String newRelayState; 
        private Integer newSessionDuration; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.newDescription = request.newDescription;
            this.newRelayState = request.newRelayState;
            this.newSessionDuration = request.newSessionDuration;
        } 

        /**
         * <p>The ID of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
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
         * <p>The new description of the access configuration.</p>
         * <p>The description can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an access configuration.</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>The new initial web page that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
         * <p>The web page must be a page of the Alibaba Cloud Management Console.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cloudsso.console.aliyun.com">https://cloudsso.console.aliyun.com</a></p>
         */
        public Builder newRelayState(String newRelayState) {
            this.putQueryParameter("NewRelayState", newRelayState);
            this.newRelayState = newRelayState;
            return this;
        }

        /**
         * <p>The new duration of a session in which a CloudSSO user accesses an account in your resource directory by using the access configuration.</p>
         * <p>Unit: seconds.</p>
         * <p>Valid values: 900 to 43200. The value 900 indicates 15 minutes. The value 43200 indicates 12 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder newSessionDuration(Integer newSessionDuration) {
            this.putQueryParameter("NewSessionDuration", newSessionDuration);
            this.newSessionDuration = newSessionDuration;
            return this;
        }

        @Override
        public UpdateAccessConfigurationRequest build() {
            return new UpdateAccessConfigurationRequest(this);
        } 

    } 

}
