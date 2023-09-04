// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubscriptionServiceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListSubscriptionServiceGroupsRequest</p>
 */
public class ListSubscriptionServiceGroupsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("serviceIds")
    private java.util.List < Long > serviceIds;

    private ListSubscriptionServiceGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.serviceIds = builder.serviceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubscriptionServiceGroupsRequest create() {
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
     * @return serviceIds
     */
    public java.util.List < Long > getServiceIds() {
        return this.serviceIds;
    }

    public static final class Builder extends Request.Builder<ListSubscriptionServiceGroupsRequest, Builder> {
        private String clientToken; 
        private java.util.List < Long > serviceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListSubscriptionServiceGroupsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.serviceIds = request.serviceIds;
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
         * serviceIds.
         */
        public Builder serviceIds(java.util.List < Long > serviceIds) {
            this.putBodyParameter("serviceIds", serviceIds);
            this.serviceIds = serviceIds;
            return this;
        }

        @Override
        public ListSubscriptionServiceGroupsRequest build() {
            return new ListSubscriptionServiceGroupsRequest(this);
        } 

    } 

}
