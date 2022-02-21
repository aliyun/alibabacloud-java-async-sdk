// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIncidentSubtotalRequest} extends {@link RequestModel}
 *
 * <p>CreateIncidentSubtotalRequest</p>
 */
public class CreateIncidentSubtotalRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("incidentId")
    @Validation(required = true)
    private Long incidentId;

    private CreateIncidentSubtotalRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.incidentId = builder.incidentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIncidentSubtotalRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
    }

    public static final class Builder extends Request.Builder<CreateIncidentSubtotalRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Long incidentId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIncidentSubtotalRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.incidentId = response.incidentId;
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
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 事件id
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        @Override
        public CreateIncidentSubtotalRequest build() {
            return new CreateIncidentSubtotalRequest(this);
        } 

    } 

}
