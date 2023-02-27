// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartConferenceRequest} extends {@link RequestModel}
 *
 * <p>StartConferenceRequest</p>
 */
public class StartConferenceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ParticipantListJson")
    @Validation(required = true)
    private String participantListJson;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("TimeoutSeconds")
    @Validation(maximum = 3600)
    private Integer timeoutSeconds;

    @Query
    @NameInMap("UserId")
    private String userId;

    private StartConferenceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.participantListJson = builder.participantListJson;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartConferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return participantListJson
     */
    public String getParticipantListJson() {
        return this.participantListJson;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<StartConferenceRequest, Builder> {
        private String instanceId; 
        private String participantListJson; 
        private String tags; 
        private Integer timeoutSeconds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(StartConferenceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.participantListJson = request.participantListJson;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userId = request.userId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ParticipantListJson.
         */
        public Builder participantListJson(String participantListJson) {
            this.putQueryParameter("ParticipantListJson", participantListJson);
            this.participantListJson = participantListJson;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public StartConferenceRequest build() {
            return new StartConferenceRequest(this);
        } 

    } 

}
