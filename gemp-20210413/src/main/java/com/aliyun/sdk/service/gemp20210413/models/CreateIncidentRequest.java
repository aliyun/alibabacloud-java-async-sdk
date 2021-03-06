// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIncidentRequest} extends {@link RequestModel}
 *
 * <p>CreateIncidentRequest</p>
 */
public class CreateIncidentRequest extends Request {
    @Body
    @NameInMap("assignUserId")
    private Long assignUserId;

    @Body
    @NameInMap("channels")
    private java.util.List < String > channels;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("effect")
    private String effect;

    @Body
    @NameInMap("incidentDescription")
    private String incidentDescription;

    @Body
    @NameInMap("incidentLevel")
    private String incidentLevel;

    @Body
    @NameInMap("incidentTitle")
    private String incidentTitle;

    @Body
    @NameInMap("relatedServiceId")
    private Long relatedServiceId;

    @Body
    @NameInMap("serviceGroupId")
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

        private Builder(CreateIncidentRequest response) {
            super(response);
            this.assignUserId = response.assignUserId;
            this.channels = response.channels;
            this.clientToken = response.clientToken;
            this.effect = response.effect;
            this.incidentDescription = response.incidentDescription;
            this.incidentLevel = response.incidentLevel;
            this.incidentTitle = response.incidentTitle;
            this.relatedServiceId = response.relatedServiceId;
            this.serviceGroupId = response.serviceGroupId;
        } 

        /**
         * ???????????????ID
         */
        public Builder assignUserId(Long assignUserId) {
            this.putBodyParameter("assignUserId", assignUserId);
            this.assignUserId = assignUserId;
            return this;
        }

        /**
         * ????????????     SMS ??????   EMAIL ??????   PHONE  ??????  WEIXIN_GROUP????????? DING_GROUP ?????????
         */
        public Builder channels(java.util.List < String > channels) {
            this.putBodyParameter("channels", channels);
            this.channels = channels;
            return this;
        }

        /**
         * ??????UUID
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ???????????? ??????HIGH ??? LOW
         */
        public Builder effect(String effect) {
            this.putBodyParameter("effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * ????????????
         */
        public Builder incidentDescription(String incidentDescription) {
            this.putBodyParameter("incidentDescription", incidentDescription);
            this.incidentDescription = incidentDescription;
            return this;
        }

        /**
         * P1	???????????? P1 P2 P3 P4
         */
        public Builder incidentLevel(String incidentLevel) {
            this.putBodyParameter("incidentLevel", incidentLevel);
            this.incidentLevel = incidentLevel;
            return this;
        }

        /**
         * ????????????
         */
        public Builder incidentTitle(String incidentTitle) {
            this.putBodyParameter("incidentTitle", incidentTitle);
            this.incidentTitle = incidentTitle;
            return this;
        }

        /**
         * ????????????ID
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * ?????????Id
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
