// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIncidentRequest} extends {@link RequestModel}
 *
 * <p>UpdateIncidentRequest</p>
 */
public class UpdateIncidentRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("effect")
    private String effect;

    @Body
    @NameInMap("incidentId")
    @Validation(required = true)
    private Long incidentId;

    @Body
    @NameInMap("incidentLevel")
    private String incidentLevel;

    @Body
    @NameInMap("incidentTitle")
    private String incidentTitle;

    private UpdateIncidentRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.effect = builder.effect;
        this.incidentId = builder.incidentId;
        this.incidentLevel = builder.incidentLevel;
        this.incidentTitle = builder.incidentTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIncidentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
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

    public static final class Builder extends Request.Builder<UpdateIncidentRequest, Builder> {
        private String clientToken; 
        private String effect; 
        private Long incidentId; 
        private String incidentLevel; 
        private String incidentTitle; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIncidentRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.effect = response.effect;
            this.incidentId = response.incidentId;
            this.incidentLevel = response.incidentLevel;
            this.incidentTitle = response.incidentTitle;
        } 

        /**
         * 幂等校验Id
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 影响程度
         */
        public Builder effect(String effect) {
            this.putBodyParameter("effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * 事件Id
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        /**
         * 级别
         */
        public Builder incidentLevel(String incidentLevel) {
            this.putBodyParameter("incidentLevel", incidentLevel);
            this.incidentLevel = incidentLevel;
            return this;
        }

        /**
         * 事件标题
         */
        public Builder incidentTitle(String incidentTitle) {
            this.putBodyParameter("incidentTitle", incidentTitle);
            this.incidentTitle = incidentTitle;
            return this;
        }

        @Override
        public UpdateIncidentRequest build() {
            return new UpdateIncidentRequest(this);
        } 

    } 

}
