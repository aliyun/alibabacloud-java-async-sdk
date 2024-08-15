// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIncidentRequest} extends {@link RequestModel}
 *
 * <p>CreateIncidentRequest</p>
 */
public class CreateIncidentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assignUserId")
    private Long assignUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channels")
    private java.util.List < String > channels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effect")
    private String effect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentDescription")
    private String incidentDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentLevel")
    private String incidentLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentTitle")
    private String incidentTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedServiceId")
    private Long relatedServiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    private CreateIncidentRequest(Builder builder) {
        super(builder);
        this.assignUserId = builder.assignUserId;
        this.channels = builder.channels;
        this.clientToken = builder.clientToken;
        this.effect = builder.effect;
        this.incidentDescription = builder.incidentDescription;
        this.incidentLevel = builder.incidentLevel;
        this.incidentTitle = builder.incidentTitle;
        this.relatedServiceId = builder.relatedServiceId;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIncidentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignUserId
     */
    public Long getAssignUserId() {
        return this.assignUserId;
    }

    /**
     * @return channels
     */
    public java.util.List < String > getChannels() {
        return this.channels;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    /**
     * @return incidentDescription
     */
    public String getIncidentDescription() {
        return this.incidentDescription;
    }

    /**
     * @return incidentLevel
     */
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    /**
     * @return incidentTitle
     */
    public String getIncidentTitle() {
        return this.incidentTitle;
    }

    /**
     * @return relatedServiceId
     */
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateIncidentRequest, Builder> {
        private Long assignUserId; 
        private java.util.List < String > channels; 
        private String clientToken; 
        private String effect; 
        private String incidentDescription; 
        private String incidentLevel; 
        private String incidentTitle; 
        private Long relatedServiceId; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIncidentRequest request) {
            super(request);
            this.assignUserId = request.assignUserId;
            this.channels = request.channels;
            this.clientToken = request.clientToken;
            this.effect = request.effect;
            this.incidentDescription = request.incidentDescription;
            this.incidentLevel = request.incidentLevel;
            this.incidentTitle = request.incidentTitle;
            this.relatedServiceId = request.relatedServiceId;
            this.serviceGroupId = request.serviceGroupId;
        } 

        /**
         * assignUserId.
         */
        public Builder assignUserId(Long assignUserId) {
            this.putBodyParameter("assignUserId", assignUserId);
            this.assignUserId = assignUserId;
            return this;
        }

        /**
         * channels.
         */
        public Builder channels(java.util.List < String > channels) {
            this.putBodyParameter("channels", channels);
            this.channels = channels;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * effect.
         */
        public Builder effect(String effect) {
            this.putBodyParameter("effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * incidentDescription.
         */
        public Builder incidentDescription(String incidentDescription) {
            this.putBodyParameter("incidentDescription", incidentDescription);
            this.incidentDescription = incidentDescription;
            return this;
        }

        /**
         * incidentLevel.
         */
        public Builder incidentLevel(String incidentLevel) {
            this.putBodyParameter("incidentLevel", incidentLevel);
            this.incidentLevel = incidentLevel;
            return this;
        }

        /**
         * incidentTitle.
         */
        public Builder incidentTitle(String incidentTitle) {
            this.putBodyParameter("incidentTitle", incidentTitle);
            this.incidentTitle = incidentTitle;
            return this;
        }

        /**
         * relatedServiceId.
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * 12000
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public CreateIncidentRequest build() {
            return new CreateIncidentRequest(this);
        } 

    } 

}
