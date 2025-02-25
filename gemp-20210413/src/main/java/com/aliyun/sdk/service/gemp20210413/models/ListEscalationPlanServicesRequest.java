// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPlanServicesRequest} extends {@link RequestModel}
 *
 * <p>ListEscalationPlanServicesRequest</p>
 */
public class ListEscalationPlanServicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private ListEscalationPlanServicesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEscalationPlanServicesRequest create() {
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

    public static final class Builder extends Request.Builder<ListEscalationPlanServicesRequest, Builder> {
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(ListEscalationPlanServicesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
        } 

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public ListEscalationPlanServicesRequest build() {
            return new ListEscalationPlanServicesRequest(this);
        } 

    } 

}
