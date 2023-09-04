// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccessConfigurationRequest</p>
 */
public class UpdateAccessConfigurationRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("NewRelayState")
    private String newRelayState;

    @Query
    @NameInMap("NewSessionDuration")
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
         * The ID of the access configuration.
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The new description of the access configuration.
         * <p>
         * 
         * The description can be up to 1,024 characters in length.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * The new initial web page that is displayed after a CloudSSO user accesses an account in your resource directory by using the access configuration.
         * <p>
         * 
         * The web page must be a page of the Alibaba Cloud Management Console.
         */
        public Builder newRelayState(String newRelayState) {
            this.putQueryParameter("NewRelayState", newRelayState);
            this.newRelayState = newRelayState;
            return this;
        }

        /**
         * The new duration of a session in which a CloudSSO user accesses an account in your resource directory by using the access configuration.
         * <p>
         * 
         * Unit: seconds.
         * 
         * Valid values: 900 to 43200. The value 900 indicates 15 minutes. The value 43200 indicates 12 hours.
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
