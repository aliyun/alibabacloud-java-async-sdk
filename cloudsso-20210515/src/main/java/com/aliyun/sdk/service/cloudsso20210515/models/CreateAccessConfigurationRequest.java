// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessConfigurationRequest</p>
 */
public class CreateAccessConfigurationRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationName")
    private String accessConfigurationName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("RelayState")
    private String relayState;

    @Query
    @NameInMap("SessionDuration")
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
         * AccessConfigurationName.
         */
        public Builder accessConfigurationName(String accessConfigurationName) {
            this.putQueryParameter("AccessConfigurationName", accessConfigurationName);
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * RelayState.
         */
        public Builder relayState(String relayState) {
            this.putQueryParameter("RelayState", relayState);
            this.relayState = relayState;
            return this;
        }

        /**
         * SessionDuration.
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
