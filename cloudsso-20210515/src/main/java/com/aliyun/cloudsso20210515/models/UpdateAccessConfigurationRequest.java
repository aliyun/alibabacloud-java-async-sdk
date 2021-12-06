// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String accessConfigurationId; 
        private String directoryId; 
        private String newDescription; 
        private String newRelayState; 
        private Integer newSessionDuration; 

        /**
         * <p>AccessConfigurationId.</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>NewDescription.</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>NewRelayState.</p>
         */
        public Builder newRelayState(String newRelayState) {
            this.putQueryParameter("NewRelayState", newRelayState);
            this.newRelayState = newRelayState;
            return this;
        }

        /**
         * <p>NewSessionDuration.</p>
         */
        public Builder newSessionDuration(Integer newSessionDuration) {
            this.putQueryParameter("NewSessionDuration", newSessionDuration);
            this.newSessionDuration = newSessionDuration;
            return this;
        }

        public UpdateAccessConfigurationRequest build() {
            return new UpdateAccessConfigurationRequest(this);
        } 

    } 

}
