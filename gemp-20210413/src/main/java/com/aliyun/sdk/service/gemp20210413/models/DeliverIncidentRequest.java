// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeliverIncidentRequest} extends {@link RequestModel}
 *
 * <p>DeliverIncidentRequest</p>
 */
public class DeliverIncidentRequest extends Request {
    @Body
    @NameInMap("assignUserId")
    private Long assignUserId;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("incidentId")
    private Long incidentId;

    private DeliverIncidentRequest(Builder builder) {
        super(builder);
        this.assignUserId = builder.assignUserId;
        this.clientToken = builder.clientToken;
        this.incidentId = builder.incidentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeliverIncidentRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
    }

    public static final class Builder extends Request.Builder<DeliverIncidentRequest, Builder> {
        private Long assignUserId; 
        private String clientToken; 
        private Long incidentId; 

        private Builder() {
            super();
        } 

        private Builder(DeliverIncidentRequest request) {
            super(request);
            this.assignUserId = request.assignUserId;
            this.clientToken = request.clientToken;
            this.incidentId = request.incidentId;
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
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        @Override
        public DeliverIncidentRequest build() {
            return new DeliverIncidentRequest(this);
        } 

    } 

}
