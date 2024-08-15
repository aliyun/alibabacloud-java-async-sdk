// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentListByIdListRequest} extends {@link RequestModel}
 *
 * <p>GetIncidentListByIdListRequest</p>
 */
public class GetIncidentListByIdListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentIdList")
    private java.util.List < Long > incidentIdList;

    private GetIncidentListByIdListRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.incidentIdList = builder.incidentIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentListByIdListRequest create() {
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
     * @return incidentIdList
     */
    public java.util.List < Long > getIncidentIdList() {
        return this.incidentIdList;
    }

    public static final class Builder extends Request.Builder<GetIncidentListByIdListRequest, Builder> {
        private String clientToken; 
        private java.util.List < Long > incidentIdList; 

        private Builder() {
            super();
        } 

        private Builder(GetIncidentListByIdListRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.incidentIdList = request.incidentIdList;
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
         * incidentIdList.
         */
        public Builder incidentIdList(java.util.List < Long > incidentIdList) {
            this.putBodyParameter("incidentIdList", incidentIdList);
            this.incidentIdList = incidentIdList;
            return this;
        }

        @Override
        public GetIncidentListByIdListRequest build() {
            return new GetIncidentListByIdListRequest(this);
        } 

    } 

}
