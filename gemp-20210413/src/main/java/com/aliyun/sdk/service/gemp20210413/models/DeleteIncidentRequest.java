// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIncidentRequest} extends {@link RequestModel}
 *
 * <p>DeleteIncidentRequest</p>
 */
public class DeleteIncidentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentId")
    private Long incidentId;

    private DeleteIncidentRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.incidentId = builder.incidentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIncidentRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteIncidentRequest, Builder> {
        private String clientToken; 
        private Long incidentId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIncidentRequest request) {
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
        public DeleteIncidentRequest build() {
            return new DeleteIncidentRequest(this);
        } 

    } 

}
