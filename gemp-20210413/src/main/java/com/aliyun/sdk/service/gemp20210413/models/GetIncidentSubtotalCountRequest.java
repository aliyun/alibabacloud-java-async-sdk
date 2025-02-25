// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentSubtotalCountRequest} extends {@link RequestModel}
 *
 * <p>GetIncidentSubtotalCountRequest</p>
 */
public class GetIncidentSubtotalCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > incidentIds;

    private GetIncidentSubtotalCountRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.incidentIds = builder.incidentIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentSubtotalCountRequest create() {
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
     * @return incidentIds
     */
    public java.util.List < Long > getIncidentIds() {
        return this.incidentIds;
    }

    public static final class Builder extends Request.Builder<GetIncidentSubtotalCountRequest, Builder> {
        private String clientToken; 
        private java.util.List < Long > incidentIds; 

        private Builder() {
            super();
        } 

        private Builder(GetIncidentSubtotalCountRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.incidentIds = request.incidentIds;
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
         * incidentIds.
         */
        public Builder incidentIds(java.util.List < Long > incidentIds) {
            this.putBodyParameter("incidentIds", incidentIds);
            this.incidentIds = incidentIds;
            return this;
        }

        @Override
        public GetIncidentSubtotalCountRequest build() {
            return new GetIncidentSubtotalCountRequest(this);
        } 

    } 

}
