// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentDetailEscalationPlansRequest} extends {@link RequestModel}
 *
 * <p>ListIncidentDetailEscalationPlansRequest</p>
 */
public class ListIncidentDetailEscalationPlansRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("incidentId")
    private Long incidentId;

    private ListIncidentDetailEscalationPlansRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.incidentId = builder.incidentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentDetailEscalationPlansRequest create() {
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
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
    }

    public static final class Builder extends Request.Builder<ListIncidentDetailEscalationPlansRequest, Builder> {
        private String clientToken; 
        private Long incidentId; 

        private Builder() {
            super();
        } 

        private Builder(ListIncidentDetailEscalationPlansRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.incidentId = request.incidentId;
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
        public ListIncidentDetailEscalationPlansRequest build() {
            return new ListIncidentDetailEscalationPlansRequest(this);
        } 

    } 

}
