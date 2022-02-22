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

        private Builder(UpdateAccessConfigurationRequest response) {
            super(response);
            this.accessConfigurationId = response.accessConfigurationId;
            this.directoryId = response.directoryId;
            this.newDescription = response.newDescription;
            this.newRelayState = response.newRelayState;
            this.newSessionDuration = response.newSessionDuration;
        } 

        /**
         * AccessConfigurationId.
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * NewDescription.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * NewRelayState.
         */
        public Builder newRelayState(String newRelayState) {
            this.putQueryParameter("NewRelayState", newRelayState);
            this.newRelayState = newRelayState;
            return this;
        }

        /**
         * NewSessionDuration.
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
